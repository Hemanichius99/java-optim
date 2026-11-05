/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package pl.polsl.Controller;

import pl.polsl.GUI.*;

/**
 * @version 1.1
 * @author Remigiusz Limański
 */
public class SupercomputerOptimalizer {

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
