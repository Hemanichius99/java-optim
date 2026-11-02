/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.Exceptions;

/**
 * @version 1.0
 * @author uzytkownikr
 */
public class NotEnoughMemoryException extends RuntimeException {
    private final int taskId;
    /**
     * Constructor.
     * @param taskId Id of task that is impossible to perform due to that exception.
     */
    public NotEnoughMemoryException(int taskId) {
        super("Nie ma wystarczajaco pamieci by zrealizowac zadanie: " + taskId);
        this.taskId = taskId;
    }
    /**
     * Getter for taskId.
     * @return taskId.
     */
    public int getTaskId() {
        return this.taskId;
    }
 }