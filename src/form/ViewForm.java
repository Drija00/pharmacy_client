/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import communication.Communication;
import domain.Medicine;
import domain.Patient;
import domain.Pharmacist;
import domain.Receipt;
import domain.ReceiptItem;
import domain.SaleStatistics;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import logic.DetailsType;
import logic.ViewEnum;
import model.MyReceiptModel;
import model.MyMedicineModel;
import model.MyPatientModel;
import model.MyReceipItemModel;
import model.MyStatModel;
import session.MySession;

/**
 *
 * @author Andrija - PC
 */
public class ViewForm extends javax.swing.JFrame {
ViewEnum logic;
Pharmacist logged;
    /**
     * Creates new form MedicineForm
     */
    public ViewForm(ViewEnum logic) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.logic = logic;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblView = new javax.swing.JTable();
        btnDetails = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblView);

        btnDetails.setText("Details");
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jLabel1.setText("Search name:");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1148, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRemove)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnDetails)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetails)
                    .addComponent(btnAdd)
                    .addComponent(btnRemove))
                .addContainerGap(247, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        int row = tblView.getSelectedRow();
        if(row==-1){JOptionPane.showMessageDialog(this, "You must select one patient.", "", JOptionPane.ERROR_MESSAGE); 
        return;
        }
        switch (logic) {
            case MEDICINE:
                Medicine medicine = ((MyMedicineModel)tblView.getModel()).getMedicine(row);
            MySession.getInstance().addValue("my_medicine", medicine);
            MedicineDetailsForm form = new MedicineDetailsForm(this, rootPaneCheckingEnabled, DetailsType.VIEW);
            form.setVisible(true);
            form.pack();
                break;
            case PATIENT:
                Patient patient = ((MyPatientModel)tblView.getModel()).getPatient(row);
            MySession.getInstance().addValue("my_patient", patient);
            PatientDetailsForm form1 = new PatientDetailsForm(this, rootPaneCheckingEnabled,DetailsType.VIEW);
            form1.setVisible(true);
            form1.pack();
                break;
            case RECEIPT:
                Receipt receipt = ((MyReceiptModel)tblView.getModel()).getReceipt(row);
                MySession.getInstance().addValue("my_receipt", receipt);
                logged = (Pharmacist) MySession.getInstance().getValue("logged_pharmacist");
                if(logged.equals(receipt.getPharmacist())){
                ReceiptForm r1 = new ReceiptForm(this, rootPaneCheckingEnabled, receipt, logged, DetailsType.VIEW);
                r1.setVisible(true);
                r1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                r1.pack();
                }else{
                    JOptionPane.showMessageDialog(rootPane, "You cannot edit this receipt");
                }
                break;
            default:
                throw new AssertionError();
        }
        populate();
    }//GEN-LAST:event_btnDetailsActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        JDialog form = null;
        switch (logic) {
            case PATIENT:
                form = new PatientDetailsForm(this, rootPaneCheckingEnabled,DetailsType.ADD);
                break;
            case MEDICINE:
                form = new MedicineDetailsForm(this, rootPaneCheckingEnabled,DetailsType.ADD);
                break;
            case RECEIPT:
                Pharmacist p = (Pharmacist) MySession.getInstance().getValue("logged_pharmacist");
                form = new ReceiptForm(this, rootPaneCheckingEnabled, new Receipt(), p,DetailsType.ADD);
                break;
            default:
                form = new JDialog();
        }
        form.setVisible(true);
        form.pack();
        populate();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
       int row = tblView.getSelectedRow();
       if(row==-1){JOptionPane.showMessageDialog(this, "You must select one patient.", "", JOptionPane.ERROR_MESSAGE); 
        return;
       }
       int x = JOptionPane.showConfirmDialog(this, "Are you sure?", "", WIDTH, JOptionPane.YES_NO_OPTION);
       if(x == JOptionPane.YES_OPTION) {
           try{
           switch (logic) {
               case MEDICINE:
                   Medicine medicine = ((MyMedicineModel)tblView.getModel()).getMedicine(row);
                   if(Communication.getInstance().checkMedicine(medicine)){
                   JOptionPane.showMessageDialog(this, "You cann't remove this medicine!", "", JOptionPane.ERROR_MESSAGE);
                   return;
                   }
                   Communication.getInstance().removeMedicine(medicine);
                   MyMedicineModel model = (MyMedicineModel)tblView.getModel();
                   model.remove(row);
                   break;
               case PATIENT:
                   Patient patient = ((MyPatientModel)tblView.getModel()).getPatient(row);
                   Communication.getInstance().removePatient(patient);
                   MyPatientModel model1 = (MyPatientModel)tblView.getModel();
                   model1.remove(row);
                   break;
               case RECEIPT:
                   Receipt receipt = ((MyReceiptModel)tblView.getModel()).getReceipt(row);
                   Communication.getInstance().removeReceipt(receipt);
                   MyReceiptModel model2 = (MyReceiptModel)tblView.getModel();
                   model2.remove(row);
                   break;
               default:
                   throw new AssertionError();
           }
           }catch(Exception ex){
               JOptionPane.showMessageDialog(this, "You can not delete this item! Try again!", "ERROR", JOptionPane.ERROR_MESSAGE);
               System.out.println(ex.getMessage());
           }
       }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    try {
        String search = txtSearch.getText();
        switch(logic){
            case MEDICINE:
                if(search.equals("") || search.isEmpty()) {
                    search= "";
                }else search = " WHERE zasticeno_ime='"+search+"'";
                List<Medicine> medicines = Communication.getInstance().getMedicines(search);
                tblView.setModel(new MyMedicineModel(medicines));
                break;
            case PATIENT:
                if(search.equals("") || search.isEmpty()) {
                    search= "";
                }else search = " WHERE name='"+search+"'";
                List<Patient> patients = Communication.getInstance().getPatients(search);
                tblView.setModel(new MyPatientModel(patients));
                break;
        }
    } catch (Exception ex) {
        Logger.getLogger(ViewForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnSearchActionPerformed

   
    
public void populate(){
    try{
    switch (logic) {
        case MEDICINE:
            List<Medicine> medicines = Communication.getInstance().getMedicines();
            tblView.setModel(new MyMedicineModel(medicines));
            break;
        case PATIENT:
            List<Patient> patients = Communication.getInstance().getPatients();
            tblView.setModel(new MyPatientModel(patients));
            break;
        case RECEIPT:
            txtSearch.setText("Search disabled!");
            txtSearch.setEnabled(false);
            btnSearch.setEnabled(false);
            List<Receipt> receipts = Communication.getInstance().getReceipts();
            System.out.println(receipts);
            tblView.setModel(new MyReceiptModel(receipts));
            break;
        case RECEIPT_ITEMS:
            txtSearch.setText("Search disabled!");
            txtSearch.setEnabled(false);
            btnSearch.setEnabled(false);
            Receipt r = (Receipt) MySession.getInstance().getValue("my_receipt");
            List<ReceiptItem> receiptItems = r.getItems();
            System.out.println(receiptItems);
            tblView.setModel(new MyReceipItemModel(receiptItems));
            btnAdd.setEnabled(false);
            btnDetails.setEnabled(false);
            btnRemove.setEnabled(false);
            break;
        case SALE_STATISTICS:
            txtSearch.setText("Search disabled!");
            txtSearch.setEnabled(false);
            btnSearch.setEnabled(false);
            List<SaleStatistics> statistics = Communication.getInstance().getSaleStatistics();
            tblView.setModel(new MyStatModel(statistics));
            btnAdd.setEnabled(false);
            btnDetails.setEnabled(false);
            btnRemove.setEnabled(false);
            break;
        default:
            throw new AssertionError();
    }
    } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ERROR!", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
        }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblView;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
