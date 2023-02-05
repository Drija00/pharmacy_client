/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import domain.Medicine;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Andrija - PC
 */
public class MyMedicineModel extends AbstractTableModel{
    List<Medicine> medicines = new ArrayList<>();
    String[] columnNames = {"JKL","ATC","INN","zasticeno ime","FO","pakovanje jacina","naziv proizvodjaca","drzava proizvodnje","cena leka na veliko za pakovanje","DDD","cena leka na veliko po DDD","particijapcija osiguranog lica","quantity"};

    public MyMedicineModel(List<Medicine> medicines) {
        this.medicines=medicines;
    }

    public MyMedicineModel() {
    }

    public List<Medicine> getMedicines() {
        return medicines;
    }

    @Override
    public int getRowCount() {
        if(medicines==null) return 0;
        
        return medicines.size();
    }

    @Override
    public int getColumnCount() {
        return 13;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Medicine m= medicines.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return m.getJKL();
            case 1:
                return m.getATC();
            case 2:
                return m.getINN();
            case 3:
                return m.getZasticeno_ime();
            case 4:
                return m.getFO();
            case 5:
                return m.getPakovanja_jacina();
            case 6:
                return m.getNaziv_proizvodjaca();
            case 7:
                return m.getDrzavva_proizvodnje();
            case 8:
                return m.getCena_leka_na_veliko_za_pakovanje();
            case 9:
                return m.getDDD();
            case 10:
                return m.getCena_leka_na_veliko_po_DDD();
            case 11:
                return m.getParticipacija_osiguranog_lica();
            case 12:
                return m.getQuantity();
            default:
                return "n/a";
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
                }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
                }
    
    public Medicine getMedicine(int row){
    return medicines.get(row);
    }
    
    public void remove(int row){
        medicines.remove(row);
        fireTableDataChanged();
    }
    
    public void add(Medicine medicine){
        medicines.add(medicine);
    }
}
