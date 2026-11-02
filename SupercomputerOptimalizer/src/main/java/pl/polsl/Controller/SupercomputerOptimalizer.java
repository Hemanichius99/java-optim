/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pl.polsl.Controller;

import pl.polsl.View.*;
import pl.polsl.Model.*;
import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;

/**
 * @version 1.0
 * @author Remigiusz Limański
 */
public class SupercomputerOptimalizer {
    /**
     * Main function of that program, it is using MVC to connect the modules.
     * @param args Array of string values, this program should be executed like: java -jar SuperComputerOptimalizer.jar $modelCPU $liczba_wezlow $ilosc_pamieci");
     */
    public static void main(String[] args) {
        
        
        ClasterModel clusterModel = new pl.polsl.Model.ClasterModel();
        ArrayDeque<TaskModel> taskQueueModel = new ArrayDeque<>();
        
        var view = new pl.polsl.View.ConsoleView();
        
        var controller = new Controller(clusterModel, taskQueueModel, view);
        controller.handleArgs(args); // java -jar SuperComputerOptimalizer.jar $modelCPU $liczba_wezlow $ilosc_pamieci");
        controller.run();
        
        view.print("koniec.");
    /*  var claster = new pl.polsl.Model.ClasterModel(MEMORY);
        var view = new ConsoleView();
        
        int numberOfParameters = args.length;

        System.out.println("Program parameters: ");
        
        if (numberOfParameters == 1) {
                    String model = args[0];
                   
                    var pc = new ComputerModel(model);
                    claster.addComputer(pc);
                    
                    view.print(pc.getModel());
        }
        else {
                    Scanner scanner = new Scanner(System.in);
                    view.print("CPU Model: ");
                    String cModel = scanner.next();
                    view.print(cModel);
        } */
    }
}