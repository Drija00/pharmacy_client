/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import domain.SaleStatistics;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Andrija - PC
 */
public class MyStatModel extends AbstractTableModel{
    List<SaleStatistics> statistics;
    String[] names = {"medicine","pharmacist","number of sales","earnings"};

    public MyStatModel() {
    }

    public MyStatModel(List<SaleStatistics> statistics) {
        this.statistics = statistics;
    }
    
    
    @Override
    public int getRowCount() {
        if(statistics==null) return 0;
        
        return statistics.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        SaleStatistics stat = statistics.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return stat.getMedicine();
            case 1:
                return stat.getPharmacist();
            case 2:
                return stat.getNumber_of_sales();
            case 3:
                return stat.getEarnings();
            default:
                throw new AssertionError();
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public String getColumnName(int column) {
        return names[column];
    }
    
    

    
    
    
}
