/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.strategy;

import java.util.ArrayDeque;
import pl.polsl.Model.ClasterModel;
import pl.polsl.Model.TaskModel;
import pl.polsl.Model.TaskQueueModel;

/**
 * @version 1.4
 * @author uzytkownikr
 */
public class HStandardFindTaskQueueStrategy implements FindTaskQueueStrategy {

    /**
     * Concrete strategy for scheduling tasks in queue, standard heuristic
     * variant.
     */
    @Override
    public ArrayDeque<TaskModel> find(TaskQueueModel taskQueue, ClasterModel cluster) {
        throw new RuntimeException("Brak implementacji methody find.");
    }

}
