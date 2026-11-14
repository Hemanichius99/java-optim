/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.Model;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import pl.polsl.Observer.TaskQueueListener;

/**
 * @version 1.3
 * @author uzytkownikr
 */
public class TaskQueueModel {
    private final Queue<TaskModel> queue = new ArrayDeque<>();
    private final List<TaskQueueListener> listeners = new ArrayList<>();
    
    public int getSize() {
        return queue.size();
    }
    
    public void addListener(TaskQueueListener l) {
        listeners.add(l);
    }
    
    public List<TaskModel> initialState() { return List.copyOf(queue); } // called only once on init
    
    public void offer(TaskModel t) {
        queue.add(t);
        listeners.forEach(l -> l.itemEnqueued(t));
    }
    
    public TaskModel poll() {
        TaskModel t = queue.poll();
        if (t != null) { 
            listeners.forEach(l -> l.itemDequeued(t));
        }
        return t;
    }
}