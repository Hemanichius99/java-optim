/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.Observer;

/**
 * @version 1.3
 * @author uzytkownikr
 */
public interface ClusterListener {

    /**
     * Notify method called on computer addition.
     *
     * @param index index of added item.
     */
    void computerAdded(int index);

    /**
     * Notfiy method called on computer removal.
     *
     * @param index index of removed item.
     */
    void computerRemoved(int index);
}
