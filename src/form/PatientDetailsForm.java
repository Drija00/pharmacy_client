/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package form;

import communication.Communication;
import domain.Patient;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import logic.DetailsType;
import session.MySession;

/**
 *
 * @author Andrija - PC
 */
public class PatientDetailsForm extends javax.swing.JDialog {
Patient p;
DetailsType type;
    /**
     * Creates new form DetailsForm
     */
    public PatientDetailsForm(java.awt.Frame parent, boolean modal,DetailsType type) {
        super(parent, modal);
        initComponents();
        this.type = type;
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        populate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        txtCardNumber = new javax.swing.JTextField();
        txtAdress = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        lblErrorName = new javax.swing.JLabel();
        lblErrorAdress = new javax.swing.JLabel();
        lblErrorLastname = new javax.swing.JLabel();
        lblErrorCard = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("ID:");

        jLabel2.setText("Name:");

        jLabel3.setText("Lastname:");

        jLabel4.setText("Adress:");

        jLabel5.setText("Card number:");

        txtID.setEditable(false);

        txtName.setEditable(false);

        txtLastname.setEditable(false);

        txtCardNumber.setEditable(false);

        txtAdress.setEditable(false);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnChange.setText("Change");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(txtLastname)
                    .addComponent(txtAdress)
                    .addComponent(txtName)
                    .addComponent(lblErrorName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCardNumber)
                    .addComponent(lblErrorCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblErrorLastname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblErrorAdress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnChange))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(btnAdd))))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblErrorName, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErrorLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErrorAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(btnChange))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblErrorCard, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        txtName.setEditable(true);
        txtLastname.setEditable(true);
        txtAdress.setEditable(true);
        txtCardNumber.setEditable(true);
        btnChange.setEnabled(false);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
    try {
        Long id = Long.valueOf(txtID.getText());
        String name = txtName.getText();
        String lastname = txtLastname.getText();
        String adress = txtAdress.getText();
        String card = txtCardNumber.getText();
        int card_number = Integer.parseInt(card);
        Patient patient = new Patient(id, name, lastname, adress, card_number);
        if(!checkCredentials(patient)) return;
        Communication.getInstance().editPatient(patient);
        JOptionPane.showMessageDialog(this, "Patient successfully updated!", "", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Patient with that credentials already exists. Try again.", "", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    int x = JOptionPane.showConfirmDialog(this, "Are you sure?", "", WIDTH, JOptionPane.YES_NO_OPTION);
       if(x == JOptionPane.YES_OPTION) {
        try {
        Long id = Long.valueOf(txtID.getText());
        String name = txtName.getText();
        String lastname = txtLastname.getText();
        String adress = txtAdress.getText();
        int cardNumber = Integer.parseInt(txtCardNumber.getText());
        Patient patient = new Patient(id, name, lastname, adress, cardNumber);
        Communication.getInstance().removePatient(patient);
        this.dispose();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "You cann't remove this patient!", "", JOptionPane.ERROR_MESSAGE);
        Logger.getLogger(PatientDetailsForm.class.getName()).log(Level.SEVERE, null, ex);
    }
       }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
    try {
        String name = txtName.getText();
        String lastname = txtLastname.getText();
        String adress = txtAdress.getText();
        String card = txtCardNumber.getText();
        int card_number = Integer.parseInt(card);
        Patient patient = new Patient(null, name, lastname, adress, card_number);
        if(!checkCredentials(patient)) return;
        Communication.getInstance().addPatient(patient);
        JOptionPane.showMessageDialog(this, "Patient successfully added!", "", JOptionPane.INFORMATION_MESSAGE);
        clearForm();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Patient with that credentials already exists. Try again.", "", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
        
    }//GEN-LAST:event_btnAddActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblErrorAdress;
    private javax.swing.JLabel lblErrorCard;
    private javax.swing.JLabel lblErrorLastname;
    private javax.swing.JLabel lblErrorName;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtCardNumber;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void populate() {
        if(type.equals(DetailsType.VIEW)){
        btnAdd.setEnabled(false);
        btnUpdate.setEnabled(false);
        Patient p = (Patient) MySession.getInstance().getValue("my_patient");
        txtID.setText(p.getId().toString());
        txtName.setText(p.getName());
        txtLastname.setText(p.getLastname());
        txtCardNumber.setText(p.getCard_number()+"");
        txtAdress.setText(p.getAdress());
        }else {
            btnChange.setEnabled(false);
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);
            txtName.setEditable(true);
            txtLastname.setEditable(true);
            txtAdress.setEditable(true);
            txtCardNumber.setEditable(true);
        }
    }
    
    public boolean validateString(String string) {
        if(string==null||string.equals("")) return false;
        
        for(int i=0;i<string.length();i++){
            if(!(string.charAt(i)>='a' && string.charAt(i)<='z') && !(string.charAt(i)>='A' && string.charAt(i)<='Z')) return false;
        }
        return true;
    }

    private void clearForm() {
        txtName.setText("");
        txtLastname.setText("");
        txtAdress.setText("");
        txtCardNumber.setText("");
    }
    
    private boolean checkCredentials(Patient p){
        boolean check = true;
        lblErrorAdress.setText("");
        lblErrorCard.setText("");
        lblErrorLastname.setText("");
        lblErrorName.setText("");
        if(!isAlpha(p.getName())) {
            lblErrorName.setText("Please enter the name correctly");
            lblErrorName.setForeground(Color.red);
            check=false;
        }
        if(!isAlpha(p.getLastname())) {
            lblErrorLastname.setText("Please enter the lastname correctly");
            lblErrorLastname.setForeground(Color.red);
            check=false;
        }
        return check;
    }
    
    private boolean isAlpha(String s){
        String x = s.toLowerCase();
        for(int i=0;i<x.length();i++){
            if(!(x.charAt(i)>='a' && x.charAt(i)<='z')){
                return false;
            }
        }
        return true;
    }

    
    
    
}
