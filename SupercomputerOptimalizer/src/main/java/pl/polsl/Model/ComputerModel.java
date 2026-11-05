/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.Model;

/**
 * @version 1.1
 * @author SuperStudent-PL
 */
public class ComputerModel {

    private final String CPUModel;
    private boolean isWorking = false;

    /**
     * Constructor.
     *
     * @param model represents model of CPU as string.
     */
    public ComputerModel(String model) {
        this.CPUModel = model;
    }

    /**
     * *
     * Assigns computer module.
     */
    public void assign() {
        isWorking = true;
    }

    /**
     * Release computer module.
     */
    public void release() {
        isWorking = false;
    }

    /**
     * Getter for string value of CPUmodel.
     *
     * @return name of the CPUModel.
     */
    public String getModel() {
        return this.CPUModel;
    }

    /**
     * boolean function to know that current cpu is busy or not.
     *
     * @return boolean value of status about cpu being busy or not.
     */
    public boolean isBusy() {
        return this.isWorking;
    }
}
