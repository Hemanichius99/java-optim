/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.strategy;

import java.util.ArrayDeque;
import java.util.Collection;
import pl.polsl.Model.ClasterModel;
import pl.polsl.Model.TaskModel;

/**
 * @version 1.1
 * @author uzytkownikr
 */
public class HStandardFindTaskQueueStrategy implements FindTaskQueueStrategy {

    /**
     * Concrete strategy for scheduling tasks in queue, standard heuristic
     * variant.
     *
     * @param tasks Same as in the interface.
     * @return Ordered queue represented there as ArrayDeque.
     */
    @Override
    public ArrayDeque<TaskModel> find(Collection<TaskModel> tasks, ClasterModel cluster) {
        throw new RuntimeException("Not supportedd yet.");
    }

}
