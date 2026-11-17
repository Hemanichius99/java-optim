/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import pl.polsl.Observer.ClusterListener;

/**
 * @version 1.5
 * @author uzytkownikr
 */
public class NodeTableModel extends AbstractTableModel implements ClusterListener {

    private static final List<String> cols = new ArrayList<>(Arrays.asList("CPU Model"));
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
        return cols.size();
    }

    @Override
    public String getColumnName(int c) {
        return cols.get(c);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ComputerModel c = cluster.getComputers().get(rowIndex);
        return c.CPUModel();
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
