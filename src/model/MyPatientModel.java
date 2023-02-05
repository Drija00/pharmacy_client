/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import domain.Patient;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Andrija - PC
 */
public class MyPatientModel extends AbstractTableModel{
    List<Patient> patients = new ArrayList<>();
    String[] columnNames = {"id","name","lastname","adress","card_number"};

    public MyPatientModel() {
    }

    public MyPatientModel(List<Patient> patients) {
        this.patients = patients;
    }

    @Override
    public int getRowCount() {
        if(patients==null) return 0;
        
        return patients.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Patient p = patients.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return p.getId();
            case 1:
                return p.getName();
            case 2:
                return p.getLastname();
            case 3:
                return p.getAdress();
            case 4:
                return p.getCard_number();
            default:
                return "n/a";
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return  false;
        }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    public Patient getPatient(int row){
        return patients.get(row);
    }
    
    public void remove(int row){
        patients.remove(row);
        fireTableDataChanged();
    }
    
    public void add(Patient patient){
        patients.add(patient);
    }
}
