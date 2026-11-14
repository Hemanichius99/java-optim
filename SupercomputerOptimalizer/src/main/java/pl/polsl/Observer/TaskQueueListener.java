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
    void itemEnqueued(TaskModel t);
    void itemDequeued(TaskModel t);
}