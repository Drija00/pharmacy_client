/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import domain.ReceiptItem;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Andrija - PC
 */
public class MyReceipItemModel extends AbstractTableModel{
    List<ReceiptItem> items;
    String[] columnNames = {"order number","quantity","price","medicine"};
    
    public MyReceipItemModel() {
        this.items = new ArrayList<>();
    }

    public MyReceipItemModel(List<ReceiptItem> items) {
        this.items = items;
    }
    
    @Override
    public int getRowCount() {
        if(items==null) return 0;
        
        return items.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ReceiptItem item = items.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return item.getOrderNumber();
            case 1:
                return item.getAmount();
            case 2:
                return item.getPrice();
            case 3:
                return item.getMedicine();
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
        return columnNames[column];
    }
    
    public void add(ReceiptItem item){
        items.add(item);
        fireTableDataChanged();
    }
    
    public void remove(int row){
        items.remove(row);
        fireTableDataChanged();
    }
    
    public List<ReceiptItem> getItems(){
        return items;
    }
    
    public ReceiptItem getItem(int row){
        return items.get(row);
    }
    
    public boolean updateItem(ReceiptItem item, int quantity){
        for (ReceiptItem i : items) {
            if(i.getMedicine().getJKL().equals(item.getMedicine().getJKL())){
                i.setAmount(i.getAmount()+quantity);
                return true;
            }
        }
        return false;
    }
   
}
