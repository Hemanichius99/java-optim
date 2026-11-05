/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.Model;

import java.util.Collection;
import java.util.Queue;
import pl.polsl.Exceptions.NotEnoughMemoryException;
import pl.polsl.strategy.FindTaskQueueStrategy;

/**
 * @version 1.0
 * @author uzytkownikr
 */
public class FindModel {
    private FindTaskQueueStrategy strategy;
    
    /**
     * sets concrete strategy that finds task queue.
     * @param strategy Strategy class that we want to use
     */
    public void setStrategy(FindTaskQueueStrategy strategy) {
        this.strategy = strategy;
    }
    /**
     * 
     * @param tasks same as in the interface.
     * @return result calculated via certain strategy.
     */
     public Queue<TaskModel> findQueue(Collection<TaskModel> tasks) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set");
        }
        
        return strategy.find(tasks);
    }
}