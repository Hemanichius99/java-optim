/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.Model;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @version 1.3
 * @author SuperStudent-PL
 */

public record TaskModel(long demandedMemory, int numberOfNodes, int taskId, String requiredCPUModel) {
      private static final AtomicInteger taskCounter = new AtomicInteger(); // AI Generated field

    public TaskModel(long demandedMemory, int numberOfNodes, String requiredCPUModel) {
        this(demandedMemory, numberOfNodes, taskCounter.incrementAndGet(), requiredCPUModel);
    }
}