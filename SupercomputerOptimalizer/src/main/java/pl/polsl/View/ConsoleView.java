/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.View;

import pl.polsl.Model.ComputerModel;
import pl.polsl.Model.TaskModel;
import java.util.Scanner;
import java.util.Collection;

/**
 *
 * @author SuperStudent-PL
 */
public class ConsoleView {
    private final Scanner in = new Scanner(System.in);
    
    public ConsoleView() {}
    
    public String readLine(String baseText) {
        System.out.println(baseText);
        return in.nextLine();
    }
    
    public void print(String msg) {
        System.out.println(msg);
    }
    
    public void showTaskQueue(Collection<TaskModel> tasks) { // metoda wygenerowana przez AI
        int i = 1;
        for (TaskModel t : tasks) {
            System.out.println(" " + i++ + ". " + t.getId());
        }
    }
}