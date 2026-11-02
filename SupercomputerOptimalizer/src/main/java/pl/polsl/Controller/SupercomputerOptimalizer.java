/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pl.polsl.Controller;

import pl.polsl.View.*;
import pl.polsl.Model.*;
import java.util.Scanner;

/**
 *
 * @author Remigiusz Limański
 */
public class SupercomputerOptimalizer {
    private static final int MEMORY = 65536;
    
    public static void main(String[] args) {
        var claster = new pl.polsl.Model.ClasterModel(MEMORY);
        var view = new ConsoleView();
        
        int numberOfParameters = args.length;

        System.out.println("Program parameters: ");
        
        if (numberOfParameters == 1) {
                    String model = args[0];
                   
                    var pc = new ComputerModel(model);
                    claster.addComputer(pc);
                    
                    view.print(pc.getModel());
        }
        else {
                    Scanner scanner = new Scanner(System.in);
                    view.print("CPU Model: ");
                    String cModel = scanner.next();
                    view.print(cModel);
        }
        
        //view.print("cokolwiek sensownego");
    }
}