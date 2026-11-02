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
public class ClasterModel { // Model oparty o wspólną pamięć !!!
    private ArrayList<ComputerModel> computers = new ArrayList<>();
    private int memoryUsed;
    private final int fullMemory;
    
    public ClasterModel(int memory) {
        this.fullMemory = memory;
        this.memoryUsed = 0;
    }
    
    public void addComputer(ComputerModel computer) {
        computers.add(computer);
    }
    
    public boolean useMemory(int memoryToUse) {
        if (fullMemory - memoryUsed > memoryToUse) {
            memoryUsed += memoryToUse;
            
            return true; // Sukces
        }
        
        return false; // Porazka, nie udalo sie zajac pamieci, brak zasobow
    }
    
    public int numberOfNodes() {
        return computers.size();
    }
}
