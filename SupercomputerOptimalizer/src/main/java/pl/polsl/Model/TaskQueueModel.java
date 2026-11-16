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

    /**
     *
     * @return size of task queue.
     */
    public int getSize() {
        return queue.size();
    }

    /**
     * adds listener to listeners.
     *
     * @param l listener that we want let listen to queue changes.
     */
    public void addListener(TaskQueueListener l) {
        listeners.add(l);
    }

    /**
     *
     * @return copies queue as list, cause table doesnt't work on queue.
     */
    public List<TaskModel> initialState() {
        return List.copyOf(queue);
    } // called only once on init

    /**
     * Same as AddLast, but in LIFO there is that offer convention.
     *
     * @param t task that we want to add to queue.
     */
    public void offer(TaskModel t) {
        queue.add(t);
        listeners.forEach(l -> l.itemEnqueued(t));
    }

    /**
     * Takes first element from queue.
     *
     * @return Taken task from queue.
     */
    public TaskModel poll() {
        TaskModel t = queue.poll();
        if (t != null) {
            listeners.forEach(l -> l.itemDequeued(t));
        }
        return t;
    }
}
