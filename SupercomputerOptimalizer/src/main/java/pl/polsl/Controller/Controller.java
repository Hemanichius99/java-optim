/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.Controller;

import java.util.ArrayDeque;
import pl.polsl.Exceptions.NotEnoughMemoryException;
import pl.polsl.Model.ClasterModel;
import pl.polsl.Model.ComputerModel;
import pl.polsl.Model.FindModel;
import pl.polsl.Model.TaskModel;
import pl.polsl.Model.TaskQueueModel;
import pl.polsl.View.ConsoleView;
import pl.polsl.strategy.HStandardFindTaskQueueStrategy;

/**
 * @deprecated Not supported anymore.
 * @version 1.1
 * @author uzytkownikr
 */

@Deprecated
public class Controller {

    private final ClasterModel clusterModel;
    private final TaskQueueModel taskModels;
    private final ConsoleView view;

    /**
     * Constructor.
     *
     * @param clusterModel ClusterModel that represents supercomputer cluster -
     * M.
     * @param models Queue of tasks to be performed - M.
     * @param view View object, User Interface - V.
     */
    public Controller(ClasterModel clusterModel, TaskQueueModel models, ConsoleView view) {
        this.clusterModel = clusterModel;
        this.taskModels = models;
        this.view = view;
    }

    /**
     * Calls method from view that prints queue of tasks.
     */
    private void printTasks() {
        view.print("Uzyskana kolejka Zadan: ");
        //view.showTaskQueue(taskModels);
    }

    /**
     * Method for user input of tasks.
     */
    private void readTasks() {
        boolean doAgain = true;
        while (doAgain) {
            view.print("Podaj parametry zadania do wykonania przez superkomputer\n");
            TaskModel task = new TaskModel(
                    Integer.parseInt(view.readLine("Podaj Liczbe wymaganej pamieci(w Bajtach): ")),
                    Integer.parseInt(view.readLine("Podaj potrzebna liczbe wezlow: ")),
                    view.readLine("Podaj nazwe wymaganego modelu: "));
            //taskModels.add(task);

            view.print("Dodano zadanie T_ID=" + task.taskId());

            var response = view.readLine("Czy chcesz dodac kolejne zadanie (T/n): ");

            doAgain = response.equalsIgnoreCase("T");

        }

    }

    /**
     * Method for user input of cluster.
     */
    private void readCluster() {
        boolean doAgain = true;

        clusterModel.setFullMemory(Integer.parseInt(view.readLine("Podaj liczbe wspolnej pamieci dla wszystkich wezlow (w Bajtach)")));

        while (doAgain) {
            ComputerModel computer = new ComputerModel(view.readLine("Podaj nazwe modelu CPU: "));
            clusterModel.addComputer(computer);

            view.print("Dodano wezel " + computer.CPUModel());

            var response = view.readLine("Czy chcesz dodac kolejny wezel (T/n): ");

            doAgain = response.equalsIgnoreCase("T");
        }
    }

    /**
     * Place in Controller where params are interpreted.
     *
     * @param args mainly reference to args from main function.
     */
    public void handleArgs(String[] args) {
        if (args.length == 3) {
            view.print("Poprawnie wprowadzono argumenty. Stworzono superkomputer.");
            int nodes = Integer.parseInt(args[1]);
            clusterModel.setFullMemory(Integer.parseInt(args[2]));

            for (int i = 0; i < nodes; i++) {
                ComputerModel computer = new ComputerModel(args[0]);
                clusterModel.addComputer(computer);
            }
        } else {
            view.print("Zle wprowadzono argumenty: java -jar SuperComputerOptimalizer.jar $modelCPU $liczba_wezlow $ilosc_pamieci");
        }
    }

    /**
     * Main run() program function, it's divided into smaller private function
     * for easier understandment.
     */
    public void run() {
        view.print("Witaj w programie do ustalania kolejki zadan dla superkomputera !\n");

        if (clusterModel.numberOfNodes() == 0) {
            readCluster();
        }
        readTasks();

        try {
            FindModel fm = new FindModel();
            fm.setStrategy(new HStandardFindTaskQueueStrategy());

            fm.findQueue(taskModels, clusterModel);
        } catch (NotEnoughMemoryException e) {
            view.print("Blad: " + e.getMessage());
        }
        printTasks();
    }
}
