/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.Model;

/**
 *
 * @author SuperStudent-PL
 */
public class ComputerModel {
    private final String CPUModel; // stała
    private boolean isWorking = false; 
    
    public ComputerModel(String model) {
        this.CPUModel = model;
    }
    
    public void assign() {
        isWorking = true;
    }
    
    public void release() {
        isWorking = false;
    }
    
    public String getModel() {
        return this.CPUModel;
    }
    
    public boolean isBusy() {
        return this.isWorking;
    }
}