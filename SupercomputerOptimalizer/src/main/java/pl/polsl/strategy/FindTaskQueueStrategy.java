/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.strategy;

import java.util.Queue;
import pl.polsl.Model.ClasterModel;
import pl.polsl.Model.TaskModel;
import pl.polsl.Model.TaskQueueModel;

/**
 * @version 1.3
 * @author uzytkownikr
 */
public interface FindTaskQueueStrategy {

    /**
     * Determines the order in which tasks should be executed. The input
     * collection is not modified.
     *
     * @param taskQueue tasks waiting to be ordered.
     * @param cluster cluster that is used to perform task calculations.
     * @return new queue with the same tasks in the chosen execution order.
     */
    Queue<TaskModel> find(TaskQueueModel taskQueue, ClasterModel cluster);
}
