/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import pl.polsl.Observer.TaskQueueListener;

/**
 * @version 1.5
 * @author uzytkownikr
 */
public class TaskTableModel extends AbstractTableModel implements TaskQueueListener {

    private static final List<String> cols = new ArrayList<>(Arrays.asList("T_ID", "CPU Model", "Pamiec", "Wezly"));
    private final List<TaskModel> rows = new ArrayList<>();

    public TaskTableModel(TaskQueueModel src) {
        rows.addAll(src.initialState()); // Copied only once there
        src.addListener(this);
    }

    @Override
    public int getRowCount() {
        return rows.size();
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
        TaskModel t = rows.get(rowIndex);
        return switch (columnIndex) {
            case 0 ->
                t.taskId();
            case 1 ->
                t.requiredCPUModel();
            case 2 ->
                t.demandedMemory();
            default ->
                t.numberOfNodes();
        };
    }

    @Override
    public void itemEnqueued(TaskModel t) {
        rows.add(t);
        this.fireTableRowsInserted(rows.size() - 1, rows.size() - 1);
    }

    @Override
    public void itemDequeued(TaskModel t) {
        int i = rows.indexOf(t);
        if (i >= 0) {
            rows.remove(i);
            fireTableRowsDeleted(i, i);
        }
    }
}
