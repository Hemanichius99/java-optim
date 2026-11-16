/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.Model;

/**
 * @version 1.3
 * @author SuperStudent-PL
 */
public class TaskModel {

    private static int taskCounter = 0;

    private final long demandedMemory;
    private final int numberOfNodes;
    private final int taskId;
    private final String requiredCPUModel;

    /**
     * Constructor.
     *
     * @param demandedMemory in bytes amount of needed memory to perform that
     * task.
     * @param numberOfNodes count of demanded nodes to perform that task.
     * @param taskId integer number that represents id of that task.
     * @param requiredCPUModel required cpu model for a task.
     */
    public TaskModel(long demandedMemory, int numberOfNodes, String requiredCPUModel) {
        this.demandedMemory = demandedMemory;
        this.numberOfNodes = numberOfNodes;
        this.requiredCPUModel = requiredCPUModel;
        this.taskId = ++taskCounter;
    }

    /**
     * Getter for id value.
     *
     * @return Integer value of unique task id.
     */
    public int getId() {
        return this.taskId;
    }

    /**
     * Getter form demandedMemory field.
     *
     * @return integer value of demanded memory in bytes for that task.
     */
    public long getDemandedMemory() {
        return this.demandedMemory;
    }

    /**
     *
     * @return demanded numberOfNodes of task.
     */
    public int getNumberOfNodes() {
        return this.numberOfNodes;
    }

    /**
     *
     * @return requiredCPUModel to perform that task.
     */
    public String getRequiredCPUModel() {
        return this.requiredCPUModel;
    }
}
