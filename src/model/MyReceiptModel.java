/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import domain.Receipt;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Andrija - PC
 */
public class MyReceiptModel extends AbstractTableModel{
    List<Receipt> receipts;
    String[] names = {"id","date","total price","pharmacist","patient"};

    public MyReceiptModel() {
        receipts = new ArrayList<>();
    }

    public MyReceiptModel(List<Receipt> receipts) {
        this.receipts = receipts;
    }
    
    @Override
    public int getRowCount() {
        return receipts.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Receipt r = receipts.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return r.getId();
            case 1:
                return r.getDate();
            case 2:
                return r.getTotal_amount();
            case 3:
                return r.getPharmacist();
            case 4:
                return r.getPatient();
            default:
                throw new AssertionError();
        }
    }

    @Override
    public String getColumnName(int column) {
        return names[column];
    }
    
    public Receipt getReceipt(int row){
        return receipts.get(row);
    }

    public void remove(int row) {
        receipts.remove(row);
        fireTableDataChanged();
    }
    
    public void add(Receipt r){
        receipts.add(r);
        fireTableDataChanged();
    }
}
