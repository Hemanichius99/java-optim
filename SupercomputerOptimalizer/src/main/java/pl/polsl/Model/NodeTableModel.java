/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.Model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import pl.polsl.Observer.ClusterListener;
import pl.polsl.Model.ClasterModel;

/**
 * @version 1.3
 * @author uzytkownikr
 */
public class NodeTableModel extends AbstractTableModel implements ClusterListener {
    private static final String[] cols = {"CPU Model"};
    private final ClasterModel cluster;
    
    public NodeTableModel(ClasterModel cluster) {
        this.cluster = cluster;
        cluster.addListener(this);
    }

    @Override
    public int getRowCount() {
        return cluster.numberOfNodes();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public String getColumnName(int c) {
        return cols[c];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ComputerModel c = cluster.getComputers().get(rowIndex);
        return c.getModel();
    }
    
    @Override
    public void computerAdded(int index) {
        this.fireTableRowsInserted(index, index);
    }

    @Override
    public void computerRemoved(int index) {
        this.fireTableRowsDeleted(index, index);
    }
    
}