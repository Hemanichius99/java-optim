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
 * @version 1.1
 * @author SuperStudent-PL
 */
public class ClasterModel { // Common memory supercomputer model for beginning

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
     *
     * @param fullMemory new amount of common full memmory in supercomputer in
     * bytes
     */
    public void setFullMemory(int fullMemory) {
        this.fullMemory = fullMemory;
    }

    /**
     * Adds new cpu to supercomputer cluster to arraylist.
     *
     * @param computer Object of computer to add to arraylist of computers
     */
    public void addComputer(ComputerModel computer) {
        computers.add(computer);
    }

    /**
     * Simulates use of memory,
     *
     * @param memoryToUse In bytes value of memory that we want to assign to
     * some task
     * @return boolean value of thus our assertion failed or not.
     */
    public boolean useMemory(int memoryToUse) {
        if (fullMemory - memoryUsed > memoryToUse) {
            memoryUsed += memoryToUse;

            return true; // Success
        }

        return false; // Failure, Could not allocate memory, no resources
    }

    /**
     * Way to get number of nodes in supercomputer.
     *
     * @return number of nodes in cluster so size of arraylist.
     */
    public int numberOfNodes() {
        return computers.size();
    }
}
