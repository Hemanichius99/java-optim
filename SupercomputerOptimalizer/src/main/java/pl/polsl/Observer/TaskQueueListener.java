/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.Observer;

import pl.polsl.Model.TaskModel;

/**
 * @version 1.3
 * @author uzytkownikr
 */
public interface TaskQueueListener {

    /**
     * Notify method called on item being added to queue.
     *
     * @param t task being added
     */
    void itemEnqueued(TaskModel t);

    /**
     * Notify method called on item beign removed(taken) from queue.
     *
     * @param t task being taken.
     */
    void itemDequeued(TaskModel t);
}
