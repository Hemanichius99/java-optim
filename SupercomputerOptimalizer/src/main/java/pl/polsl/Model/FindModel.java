/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.Model;

import java.util.Queue;
import pl.polsl.strategy.FindTaskQueueStrategy;

/**
 * @version 1.3
 * @author uzytkownikr
 */
public class FindModel {

    private FindTaskQueueStrategy strategy;

    /**
     * sets concrete strategy that finds task queue.
     *
     * @param strategy Strategy class that we want to use
     */
    public void setStrategy(FindTaskQueueStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     *
     * @param taskQueue same as in the interface.
     * @param cluster cluster that we use to perform operations
     * @return result calculated via certain strategy.
     */
    public Queue<TaskModel> findQueue(TaskQueueModel taskQueue, ClasterModel cluster) {
        if (strategy == null) {
            throw new IllegalStateException("Nie wybrano strategii.");
        }

        return strategy.find(taskQueue, cluster);
    }
}
