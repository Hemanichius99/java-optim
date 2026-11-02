/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.Model;

import java.util.ArrayList;

/**
 *
 * @author SuperStudent-PL
 */
public class TaskModel {
    private ArrayList<Integer> demandedMemoryForEachNode = new ArrayList<>(); // size == numberOfNodes
    private int taskId;
    private String requiredCPUModel;
    
    public TaskModel (int taskId, String requiredCPUModel) {
        this.taskId = taskId;
        this.requiredCPUModel = requiredCPUModel;
    }
}
