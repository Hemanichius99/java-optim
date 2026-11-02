/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.Model;

import java.util.ArrayList;

/**
 * @version 1.0
 * @author SuperStudent-PL
 */
public class TaskModel {
    private int demandedMemory;
    private int numberOfNodes;
    private int taskId;
    private String requiredCPUModel;
    /**
     * Constructor.
     * @param demandedMemory in bytes amount of needed memory to perform that task.
     * @param numberOfNodes count of demanded nodes to perform that task.
     * @param taskId integer number that represents id of that task.
     * @param requiredCPUModel required cpu model for a task.
     */
    public TaskModel (int demandedMemory, int numberOfNodes, int taskId, String requiredCPUModel) {
        this.demandedMemory = demandedMemory;
        this.numberOfNodes = numberOfNodes;
        this.taskId = taskId;
        this.requiredCPUModel = requiredCPUModel;
    }
    /**
     * Getter for id value.
     * @return Integer value of pseudounique task id.
     */
    public int getId() {
        return this.taskId;
    }
    /**
     * Getter form demandedMemory field.
     * @return integer value of demanded memory in bytes for that task.
    */
    public int getDemandedMemory() {
        return this.demandedMemory;
    }
}