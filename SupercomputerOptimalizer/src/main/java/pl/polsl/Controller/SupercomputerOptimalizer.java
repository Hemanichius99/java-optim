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
        3. Table with current Tasks and Table with current nodes(CPUs) in GUI
        4. GUI Field validation
        5. Correct exception throwing and handling. There are somwhere unhandled exceptions
        6. Final version from 2nd lab includes pt3.
        7. Do exceptions messages show in GUI, not in terminal
        8. Main func params should be in empty TextFields in GUI
        Finally. Code review according to KISS, DRY, SOLID.
        Post-Finally. Doc anaylze and add whats needed.
    */
    
    
    /**
     * Main function of that program, it is using MVC to connect the modules.
     * After addition of swing GUI it calls buidGUI from MainFrame class, and
     * thats all, so args now don't matter
     *
     * @param args now after adding gui useless, but for being able to quickly
     * reprogrm to consolveView it will remain.
     */
    public static void main(String[] args) {
        MainFrame.buildGUI();
    }
}
