/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.strategy;

import java.util.Collection;
import java.util.Queue;
import pl.polsl.Model.TaskModel;

/**
 * @version 1.1
 * @author uzytkownikr
 */
public interface FindTaskQueueStrategy {

    /**
     * Determines the order in which tasks should be executed. The input
     * collection is not modified.
     *
     * @param tasks tasks waiting to be ordered.
     * @return new queue with the same tasks in the chosen execution order.
     */
    Queue<TaskModel> find(Collection<TaskModel> tasks);
}