/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.Model;

import java.util.ArrayList;
import java.util.Queue;
import java.util.ArrayDeque;
import pl.polsl.Exceptions.NotEnoughMemoryException;

/**
 * @version 1.0
 * @author SuperStudent-PL
 */
public class ClasterModel { // Model oparty o wspólną pamięć !!!
    private ArrayList<ComputerModel> computers = new ArrayList<>();
    private int memoryUsed;
    private int fullMemory;
    /**
     * Constructor sets field-values to 0
     */
    public ClasterModel() {
        this.fullMemory = 0;
        this.memoryUsed = 0;
    }
    /**
     * sets new value for field fullMemory
     * @param fullMemory new amount of common full memmory in supercomputer in bytes
     */
    public void setFullMemory(int fullMemory) {
        this.fullMemory = fullMemory;
    }
    /**
     * Adds new cpu to supercomputer cluster to arraylist.
     * @param computer Object of computer to add to arraylist of computers
     */
    public void addComputer(ComputerModel computer) {
        computers.add(computer);
    }
    /**
     * Simulates use of memory, 
     * @param memoryToUse In bytes value of memory that we want to assign to some task
     * @return boolean value of thus our assertion failed or not.
     */
    public boolean useMemory(int memoryToUse) {
        if (fullMemory - memoryUsed > memoryToUse) {
            memoryUsed += memoryToUse;
            
            return true; // Sukces
        }
        
        return false; // Porazka, nie udalo sie zajac pamieci, brak zasobow
    }
    /**
     * Way to get number of nodes in supercomputer.
     * @return number of nodes in cluster so size of arraylist.
     */
    public int numberOfNodes() {
        return computers.size();
    }
    /**
     * Main algorithm that finds optimal order of tasks.
     * @param tasks queue of tasks that we want to manage.
     * @return queue of tasks, but with optimal order of tasks.
     * @throws NotEnoughMemoryException when there is not enough memory to perform any task.
     */
    public Queue<TaskModel> findQueue(ArrayDeque<TaskModel> tasks) {
        Queue<TaskModel> queue = new ArrayDeque<>();
        
        for (var task : tasks) {
            if (task.getDemandedMemory() > this.fullMemory) {
                throw new NotEnoughMemoryException(task.getId()); // Za malo pamieci by wykonac to zadanie
            }
        }
        
        // Algorytm szulania optymalnej kolejności zadań ma tutaj byc
        // TODO implementacja
        return queue;
    }
}