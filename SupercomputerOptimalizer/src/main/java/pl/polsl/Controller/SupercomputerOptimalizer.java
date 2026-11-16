/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package pl.polsl.Controller;

import pl.polsl.GUI.*;

/**
 * @version 1.3
 * @author Remigiusz Limański
 */
public class SupercomputerOptimalizer {
    // TODO !!! Tasks 
    /*  
        2. HStandardFindTaskQueueStrategy implementation of heuristic findQueue strat
        4. GUI Field validation
        Finally. Code review according to KISS, DRY, SOLID.
        Post-Finally. Doc anaylze and add whats needed.
    */
    
    
    /**
     * Main function of that program, it is using MVC to connect the modules.
     * After addition of swing GUI it calls buidGUI from MainFrame class, and
     * thats all, so args now don't matter
     *@param args arguments inserted in terminal mode
     * It has to be 5 Args: $Demanded_Memory $CPUModel $NumberOfNodes $RequiredCPUModel $RequiredMemory
     * for example: 80960000 "AMD EPYC 7002" 1 "AMD EPYC 7002" 40960000
     */
    public static void main(String[] args) {
        MainFrame.buildGUI(args);
    }
}
