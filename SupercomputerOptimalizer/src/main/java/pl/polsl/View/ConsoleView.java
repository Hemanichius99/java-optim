/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.View;

import pl.polsl.Model.TaskModel;
import java.util.Scanner;
import java.util.Collection;

/**
 * @version 1.1
 * @author SuperStudent-PL
 */
public class ConsoleView {

    private final Scanner in = new Scanner(System.in);

    /**
     * Constructor.
     */
    public ConsoleView() {
    }

    /**
     * Method to read line from via CLI.
     *
     * @param baseText text that is displayed before input stream.
     * @return string value of use input.
     */
    public String readLine(String baseText) {
        System.out.println(baseText);
        return in.nextLine();
    }

    /**
     * Prints message in console.
     *
     * @param msg message to print in console.
     */
    public void print(String msg) {
        System.out.println(msg);
    }

    /**
     * AI Generated method to show queue of tasks being ordered and counted.
     *
     * @param tasks queue of tasks that we want to display.
     */
    public void showTaskQueue(Collection<TaskModel> tasks) {
        int i = 1;
        for (TaskModel t : tasks) {
            System.out.println(" " + i++ + ". " + t.getId());
        }
    }
}
