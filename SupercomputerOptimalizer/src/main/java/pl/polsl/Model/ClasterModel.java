/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.Data;
import pl.polsl.Observer.ClusterListener;

/**
 * @version 1.4
 * @author SuperStudent-PL
 */
@Data
public class ClasterModel { // Common memory supercomputer model for beginning

    private final List<ComputerModel> computers = Collections.checkedList(new ArrayList<>(), ComputerModel.class);
    private final List<ClusterListener> listeners = new ArrayList<>();
    private long memoryUsed;
    private long fullMemory;

    /**
     * Constructor sets field-values to 0
     */
    public ClasterModel() {
        this.fullMemory = 0;
        this.memoryUsed = 0;
    }

    /**
     * adds listener to a list.
     *
     * @param l listener that we want to inform about computers list changes.
     */
    public void addListener(ClusterListener l) {
        listeners.add(l);
    }

    /**
     *
     * @return computers list as undodifiableList
     */
    public List<ComputerModel> getComputers() {
        return Collections.unmodifiableList(computers);
    }
    
    /**
     * Adds new cpu to supercomputer cluster to arraylist.
     *
     * @param computer Object of computer to add to arraylist of computers
     */
    public void addComputer(ComputerModel computer) {
        computers.add(computer);
        int i = computers.size() - 1;
        listeners.forEach(l -> l.computerAdded(i));
    }

    /**
     * removes computer from list.
     *
     * @param index index of computer in list
     */
    public void removeComputer(int index) {
        computers.remove(index);
        listeners.forEach(l -> l.computerRemoved(index));
    }
    
    public int numberOfNodes() {
        return this.computers.size();
    }

    /**
     * Simulates use of memory,
     *
     * @param memoryToUse In bytes value of memory that we want to assign to
     * some task
     * @return boolean value of thus our assertion failed or not.
     */
    public boolean useMemory(long memoryToUse) {
        if (fullMemory - memoryUsed > memoryToUse) {
            memoryUsed += memoryToUse;

            return true; // Success
        }

        return false; // Failure, Could not allocate memory, no resources
    }
}
