/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package form;

import communication.Communication;
import domain.Medicine;
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
public class MedicineDetailsForm extends javax.swing.JDialog {
Medicine medicine;
DetailsType type;
    /**
     * Creates new form MedicineDetailsForm
     */
    public MedicineDetailsForm(java.awt.Frame parent, boolean modal, DetailsType type) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.type = type;
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
        txtJKL = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtATC = new javax.swing.JTextField();
        txtINN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtParticipacijaOsiguranogLica = new javax.swing.JTextField();
        txtCenaNaVelikoDDD = new javax.swing.JTextField();
        txtDDD = new javax.swing.JTextField();
        txtCenaNaVelikoPakovanje = new javax.swing.JTextField();
        txtDrzava = new javax.swing.JTextField();
        txtNazivProizvodjaca = new javax.swing.JTextField();
        txtPakovanjeIJacina = new javax.swing.JTextField();
        txtZasticenoIme = new javax.swing.JTextField();
        comboFO = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lblErrorJKL = new javax.swing.JLabel();
        lblErrorATC = new javax.swing.JLabel();
        lblErrorINN = new javax.swing.JLabel();
        lblErrorZastIme = new javax.swing.JLabel();
        lblErrorFO = new javax.swing.JLabel();
        lblErrorPakovanjeJacina = new javax.swing.JLabel();
        lblErrorNaziv = new javax.swing.JLabel();
        lblErrorDrzava = new javax.swing.JLabel();
        lblErrorCenaPak = new javax.swing.JLabel();
        lblErrorDDD = new javax.swing.JLabel();
        lblErrorCenaDDD = new javax.swing.JLabel();
        lblErrorParticipacija = new javax.swing.JLabel();
        lblErrorKolicina = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("JKL:");

        jLabel2.setText("ATC:");

        txtJKL.setEditable(false);

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

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel4.setText("Zasticeno ime:");

        txtATC.setEditable(false);

        txtINN.setEditable(false);

        jLabel6.setText("INN:");

        jLabel7.setText("FO:");

        jLabel8.setText("Pakovanje i jacina:");

        jLabel9.setText("Naziv proizvodjaca:");

        jLabel10.setText("Cena leka na veliko za pakovanje:");

        jLabel11.setText("DDD:");

        jLabel12.setText("Participacija osiguranog lica");

        jLabel14.setText("Drzava proizvodjaca:");

        jLabel15.setText("Cena leka na veliko po DDD:");

        txtParticipacijaOsiguranogLica.setEditable(false);

        txtCenaNaVelikoDDD.setEditable(false);

        txtDDD.setEditable(false);

        txtCenaNaVelikoPakovanje.setEditable(false);

        txtDrzava.setEditable(false);

        txtNazivProizvodjaca.setEditable(false);

        txtPakovanjeIJacina.setEditable(false);

        txtZasticenoIme.setEditable(false);

        comboFO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "gastrorezistentna_tableta", "gastrorezistentna_kapsula_tvrda", "tableta", "film_tableta", "kapsula_tvrda", "sirup", "oralna_suspenzija", "rastvor_za_injekciju", "rastvor_za_injekciju_u_ulosku", "mast" }));

        jLabel3.setText("Kolicina:");

        txtQuantity.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboFO, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtZasticenoIme)
                            .addComponent(txtPakovanjeIJacina)
                            .addComponent(txtJKL)
                            .addComponent(txtATC)
                            .addComponent(txtINN)
                            .addComponent(lblErrorJKL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblErrorATC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblErrorINN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblErrorZastIme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblErrorFO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblErrorPakovanjeJacina, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNazivProizvodjaca, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblErrorNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(88, 88, 88)
                            .addComponent(txtDrzava, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(40, 40, 40)
                                        .addComponent(txtParticipacijaOsiguranogLica, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnAdd)
                                            .addComponent(jLabel3))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(btnChange)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnUpdate)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnDelete))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(137, 137, 137)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblErrorParticipacija, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblErrorKolicina, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCenaNaVelikoPakovanje, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCenaNaVelikoDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblErrorDrzava, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblErrorCenaPak, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblErrorDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblErrorCenaDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtJKL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorJKL, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtATC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblErrorATC, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtINN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(8, 8, 8)
                .addComponent(lblErrorINN, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtZasticenoIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(lblErrorZastIme, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboFO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErrorFO, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPakovanjeIJacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(lblErrorPakovanjeJacina, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNazivProizvodjaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(lblErrorNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtDrzava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorDrzava, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCenaNaVelikoPakovanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorCenaPak, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtCenaNaVelikoDDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(lblErrorCenaDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtParticipacijaOsiguranogLica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(lblErrorParticipacija, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorKolicina, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnChange)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        txtJKL.setEditable(true);
        comboFO.setEnabled(true);
        txtATC.setEditable(true);
        txtINN.setEditable(true);
        txtZasticenoIme.setEditable(true);
        txtCenaNaVelikoDDD.setEditable(true);
        txtCenaNaVelikoPakovanje.setEditable(true);
        txtDDD.setEditable(true);
        txtDrzava.setEditable(true);
        txtNazivProizvodjaca.setEditable(true);
        txtParticipacijaOsiguranogLica.setEditable(true);
        txtPakovanjeIJacina.setEditable(true);
        txtQuantity.setEditable(true);
        btnChange.setEnabled(false);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
    try {
        String JKLs = txtJKL.getText();
        String Fo = comboFO.getSelectedItem().toString();
        String ATC = txtATC.getText();
        String INN = txtINN.getText();
        String zasIme = txtZasticenoIme.getText();
        String cenaVelikoPak = txtCenaNaVelikoPakovanje.getText();
        String cenaVelikoDDD = txtCenaNaVelikoDDD.getText();
        String drzava = txtDrzava.getText();
        String nazivPro = txtNazivProizvodjaca.getText();
        String partic = txtParticipacijaOsiguranogLica.getText();
        String pakovanje = txtPakovanjeIJacina.getText();
        String quant = txtQuantity.getText();
        String DDDs = txtDDD.getText();
        if(!checkCredentials(JKLs, ATC, INN, zasIme, pakovanje, nazivPro, drzava, cenaVelikoPak, DDDs, cenaVelikoDDD, partic, quant)) return;
        int quantity = Integer.parseInt(quant);
        Double DDDCena = Double.valueOf(cenaVelikoDDD);
        Double PakCena = Double.valueOf(cenaVelikoPak);
        Double participacija = Double.valueOf(partic);
        Long JKL = Long.valueOf(JKLs);
        int DDD = Integer.parseInt(DDDs);
        Medicine medicine1 = new Medicine(JKL, ATC, INN, zasIme, Fo, pakovanje, nazivPro, drzava, PakCena, DDD, DDDCena, participacija,quantity);
        Communication.getInstance().addMedicine(medicine1);
        JOptionPane.showMessageDialog(this, "Medicine successfully added!", "", JOptionPane.INFORMATION_MESSAGE);
        clearForm();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Medicine with that JKL already exists. Try again.", "", JOptionPane.ERROR_MESSAGE);
        Logger.getLogger(MedicineDetailsForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
    try {
        Long JKL = Long.valueOf(txtJKL.getText());
        String Fo = comboFO.getSelectedItem().toString();
        String ATC = txtATC.getText();
        String INN = txtINN.getText();
        String zasIme = txtZasticenoIme.getText();
        Double DDDCena = Double.valueOf(txtCenaNaVelikoDDD.getText());
        Double PakCena = Double.valueOf(txtCenaNaVelikoPakovanje.getText());
        int DDD = Integer.parseInt(txtDDD.getText());
        String drzava = txtDrzava.getText();
        String nazivPro = txtNazivProizvodjaca.getText();
        Double participacija = Double.valueOf(txtParticipacijaOsiguranogLica.getText());
        String pakovanje = txtPakovanjeIJacina.getText();
        int quantity = Integer.parseInt(txtQuantity.getText());
        Medicine medicine1 = new Medicine(JKL, ATC, INN, zasIme, Fo, pakovanje, nazivPro, drzava, PakCena, DDD, DDDCena, participacija,quantity);
        Communication.getInstance().editMedicine(medicine1);
        JOptionPane.showMessageDialog(this, "Medicine successfully updated!", "", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    } catch (Exception ex) {
        Logger.getLogger(MedicineDetailsForm.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Medicine with that JKL already exists. Try again.", "", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int x = JOptionPane.showConfirmDialog(this, "Are you sure?", "", WIDTH, JOptionPane.YES_NO_OPTION);
       if(x == JOptionPane.YES_OPTION) {
        try {
        Long JKL = Long.valueOf(txtJKL.getText());
        String Fo = comboFO.getSelectedItem().toString();
        String ATC = txtATC.getText();
        String INN = txtINN.getText();
        String zasIme = txtZasticenoIme.getText();
        Double DDDCena = Double.valueOf(txtCenaNaVelikoDDD.getText());
        Double PakCena = Double.valueOf(txtCenaNaVelikoPakovanje.getText());
        int DDD = Integer.parseInt(txtDDD.getText());
        String drzava = txtDrzava.getText();
        String nazivPro = txtNazivProizvodjaca.getText();
        Double participacija = Double.valueOf(txtParticipacijaOsiguranogLica.getText());
        String pakovanje = txtPakovanjeIJacina.getText();
        int quantity = Integer.parseInt(txtQuantity.getText());
        Medicine medicine1 = new Medicine(JKL, ATC, INN, zasIme, Fo, pakovanje, nazivPro, drzava, PakCena, DDD, DDDCena, participacija,quantity);
        if(Communication.getInstance().checkMedicine(medicine1)){
        JOptionPane.showMessageDialog(this, "You cann't remove this medicine!", "", JOptionPane.ERROR_MESSAGE);
        return;
        }
        Communication.getInstance().removeMedicine(medicine1);
        this.dispose();
    } catch (Exception ex) {
        Logger.getLogger(MedicineDetailsForm.class.getName()).log(Level.SEVERE, null, ex);
    }
       }
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox comboFO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblErrorATC;
    private javax.swing.JLabel lblErrorCenaDDD;
    private javax.swing.JLabel lblErrorCenaPak;
    private javax.swing.JLabel lblErrorDDD;
    private javax.swing.JLabel lblErrorDrzava;
    private javax.swing.JLabel lblErrorFO;
    private javax.swing.JLabel lblErrorINN;
    private javax.swing.JLabel lblErrorJKL;
    private javax.swing.JLabel lblErrorKolicina;
    private javax.swing.JLabel lblErrorNaziv;
    private javax.swing.JLabel lblErrorPakovanjeJacina;
    private javax.swing.JLabel lblErrorParticipacija;
    private javax.swing.JLabel lblErrorZastIme;
    private javax.swing.JTextField txtATC;
    private javax.swing.JTextField txtCenaNaVelikoDDD;
    private javax.swing.JTextField txtCenaNaVelikoPakovanje;
    private javax.swing.JTextField txtDDD;
    private javax.swing.JTextField txtDrzava;
    private javax.swing.JTextField txtINN;
    private javax.swing.JTextField txtJKL;
    private javax.swing.JTextField txtNazivProizvodjaca;
    private javax.swing.JTextField txtPakovanjeIJacina;
    private javax.swing.JTextField txtParticipacijaOsiguranogLica;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtZasticenoIme;
    // End of variables declaration//GEN-END:variables

    private void populate() {
        if(type.equals(DetailsType.VIEW)){
        btnAdd.setEnabled(false);
        btnUpdate.setEnabled(false);
        comboFO.setEnabled(false);
        medicine = (Medicine) MySession.getInstance().getValue("my_medicine");
        txtJKL.setText(medicine.getJKL().toString());
        comboFO.setSelectedItem(medicine.getFO());
        txtATC.setText(medicine.getATC());
        txtINN.setText(medicine.getINN());
        txtZasticenoIme.setText(medicine.getZasticeno_ime());
        txtCenaNaVelikoDDD.setText(medicine.getCena_leka_na_veliko_po_DDD()+"");
        txtCenaNaVelikoPakovanje.setText(medicine.getCena_leka_na_veliko_za_pakovanje()+"");
        txtDDD.setText(medicine.getDDD()+"");
        txtDrzava.setText(medicine.getDrzavva_proizvodnje());
        txtNazivProizvodjaca.setText(medicine.getNaziv_proizvodjaca());
        txtParticipacijaOsiguranogLica.setText(medicine.getParticipacija_osiguranog_lica()+"");
        txtPakovanjeIJacina.setText(medicine.getPakovanja_jacina());
        txtQuantity.setText(medicine.getQuantity()+"");
        }else {
            btnChange.setEnabled(false);
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);
            txtJKL.setEditable(true);
            comboFO.setEnabled(true);
            txtATC.setEditable(true);
            txtINN.setEditable(true);
            txtZasticenoIme.setEditable(true);
            txtCenaNaVelikoDDD.setEditable(true);
            txtCenaNaVelikoPakovanje.setEditable(true);
            txtDDD.setEditable(true);
            txtDrzava.setEditable(true);
            txtNazivProizvodjaca.setEditable(true);
            txtParticipacijaOsiguranogLica.setEditable(true);
            txtPakovanjeIJacina.setEditable(true);
            txtQuantity.setEditable(true);
        }
    }

    public boolean validate(String name) {
        if(name==null||name.equals("")) return false;
        
        for(int i=0;i<name.length();i++){
            if(!(name.charAt(i)>='a' && name.charAt(i)<='z') && !(name.charAt(i)>='A' && name.charAt(i)<='Z')) return false;
        }
        return true;
    }

    private void clearForm() {
        txtJKL.setText("");
        comboFO.setSelectedItem("");
        txtATC.setText("");
        txtINN.setText("");
        txtZasticenoIme.setText("");
        txtCenaNaVelikoDDD.setText("");
        txtCenaNaVelikoPakovanje.setText("");
        txtDDD.setText("");
        txtDrzava.setText("");
        txtNazivProizvodjaca.setText("");
        txtParticipacijaOsiguranogLica.setText("");
        txtPakovanjeIJacina.setText("");
        txtQuantity.setText("");
    }
    
    private boolean checkCredentials(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9,String s10,String s11,String s12){
        boolean check = true;
        lblErrorJKL.setText("");
        lblErrorATC.setText("");
        lblErrorINN.setText("");
        lblErrorZastIme.setText("");
        lblErrorNaziv.setText("");
        lblErrorPakovanjeJacina.setText("");
        lblErrorDrzava.setText("");
        lblErrorCenaPak.setText("");
        lblErrorCenaDDD.setText("");
        lblErrorDDD.setText("");
        lblErrorParticipacija.setText("");
        lblErrorKolicina.setText("");
        if(!isNumber(s1) || s1.equals(0) || s1.isEmpty()) {
            lblErrorJKL.setText("Please enter the fieald correctly");
            lblErrorJKL.setForeground(Color.red);
            check=false;
        }
        if(s2.isEmpty()) {
            lblErrorATC.setText("Please enter the fieald correctly");
            lblErrorATC.setForeground(Color.red);
            check=false;
        }
        if(!isAlpha(s3) || s3.isEmpty()) {
            lblErrorINN.setText("Please enter the fieald correctly");
            lblErrorINN.setForeground(Color.red);
            check=false;
        }
        if(!isAlpha(s4)|| s4.isEmpty()) {
            lblErrorZastIme.setText("Please enter the fieald correctly");
            lblErrorZastIme.setForeground(Color.red);
            check=false;
        }
        if(s5.isEmpty()) {
            lblErrorPakovanjeJacina.setText("Please enter the fieald correctly");
            lblErrorPakovanjeJacina.setForeground(Color.red);
            check=false;
        }
        if(!isAlpha(s7)|| s7.isEmpty()) {
            lblErrorDrzava.setText("Please enter the fieald correctly");
            lblErrorDrzava.setForeground(Color.red);
            check=false;
        }
        if(!isAlpha(s6)|| s6.isEmpty()) {
            lblErrorNaziv.setText("Please enter the fieald correctly");
            lblErrorNaziv.setForeground(Color.red);
            check=false;
        }
        if(!isNumber(s8) || s8.equals(0)|| s8.isEmpty()) {
            lblErrorCenaPak.setText("Please enter the fieald correctly");
            lblErrorCenaPak.setForeground(Color.red);
            check=false;
        }
        if(!isNumber(s9) || s9.equals(0)|| s9.isEmpty()) {
            lblErrorDDD.setText("Please enter the fieald correctly");
            lblErrorDDD.setForeground(Color.red);
            check=false;
        }
        if(!isNumber(s10) || s10.equals(0)|| s10.isEmpty()) {
            lblErrorCenaDDD.setText("Please enter the fieald correctly");
            lblErrorCenaDDD.setForeground(Color.red);
            check=false;
        }
        if(!isNumber(s11) || s11.equals(0)|| s11.isEmpty()) {
            lblErrorParticipacija.setText("Please enter the fieald correctly");
            lblErrorParticipacija.setForeground(Color.red);
            check=false;
        }
        if(!isNumber(s12) || s12.equals(0)|| s12.isEmpty()) {
            lblErrorKolicina.setText("Please enter the fieald correctly");
            lblErrorKolicina.setForeground(Color.red);
            check=false;
        }
        System.out.println(check);
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
    private boolean isNumber(String s){
        String x = s.toLowerCase();
        for(int i=0;i<x.length();i++){
            if((x.charAt(i)>='a' && x.charAt(i)<='z')){
                return false;
            }
        }
        return true;
    }
}
