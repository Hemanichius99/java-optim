/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.Controller;

import java.util.ArrayDeque;
import pl.polsl.Model.ClasterModel;
import pl.polsl.Model.TaskModel;
import pl.polsl.View.ConsoleView;

/**
 *
 * @author uzytkownikr
 */
public class Controller {
    private final ClasterModel clusterModel;
    private final ArrayDeque<TaskModel> taskModels;
    private final ConsoleView view;
    
    public Controller(ClasterModel clusterModel, ArrayDeque<TaskModel> models, ConsoleView view) {
        this.clusterModel = clusterModel;
        this.taskModels = models;
        this.view = view;
    }
    private void printTasks() {
        view.showTaskQueue(taskModels);
    }
    private void readTasks() {
        // AI zrobi czytanie z klawiatury i ładowań do kolejki
    }
    private void readCluster() {
        // Wprowadzanie z klawiatury danych na temat Klastera, CPU MODEL, ile RAMu, ile node-ów
    }
    public void run() {
        boolean running = true;
        while(running) {
            view.print("Witaj w programie do ustalania kolejki zadań dla superkomputera !");
            
            readCluster();
            
            readTasks();
            
            clusterModel.findQueue(taskModels);
            
            printTasks();
        }
    }
    
}