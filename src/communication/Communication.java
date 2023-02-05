/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package communication;

import domain.Medicine;
import domain.Patient;
import domain.Pharmacist;
import domain.Receipt;
import domain.ReceiptItem;
import domain.SaleStatistics;
import domain.Substance;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import session.MySession;

/**
 *
 * @author Andrija - PC
 */
public class Communication {
    private static Communication instance;
    private Socket socket;
    private Sender sender;
    private Receiver receiver;

    private Communication() throws Exception {
            this.socket = new Socket("localhost", 12000);
            this.sender = new Sender(socket);
            this.receiver = new Receiver(socket);
    }
    public static Communication getInstance() throws Exception{
    if(instance==null) instance= new Communication();
    
    return instance;
    }
    
    public void connect(){
        try {
            this.socket = new Socket("localhost", 12000);
            this.sender = new Sender(socket);
            this.receiver = new Receiver(socket);
        } catch (IOException ex) {
            Logger.getLogger(Communication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Pharmacist login(String username,String password) throws Exception{
        Pharmacist p = new Pharmacist();
        p.setUsername(username);
        p.setPassword(password);
        Request request = new Request(Operation.LOGIN, p);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if(response.getException()==null){
            return (Pharmacist)response.getResult();
        }else{
            throw response.getException();
        }
    }
    
    public void refreshMedsInReceipt() throws Exception{
        Request request = new Request(Operation.REFRESH_MEDS, null);
        sender.send(request);
        /*Response response = (Response) receiver.receive();
        if(response.getException()==null){
            
        }else{
            throw response.getException();
        }
        return false;*/
    }
    
    public void logout(Pharmacist p) throws Exception{
        Request request = new Request(Operation.LOG_OUT, p);
        sender.send(request);
    }
    
    public List<Patient> getPatients() throws Exception{
        Request request = new Request(Operation.GET_ALL_PATIENTS, null);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if(response.getException()==null){
            return (List<Patient>)response.getResult();
        }else{
            throw response.getException();
        }
    } 
    
    public boolean checkPatient(Patient p){
        try {
            List<Receipt> receipts = getReceipts();
            for (Receipt receipt : receipts) {
                if(receipt.getPatient().getId().equals(p.getId())){
                    return true;
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Communication.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
    public List<Receipt> getReceipts() throws Exception{
        Request request = new Request(Operation.GET_ALL_RECEIPTS, "");
        sender.send(request);
        Response response = (Response) receiver.receive();
        if(response.getException()==null){
            return (List<Receipt>)response.getResult();
        }else{
            throw response.getException();
        }
    } 
    
    public Receipt getReceipt(Receipt r) throws Exception{
        Request request = new Request(Operation.GET_RECEIPT, r);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if(response.getException()==null){
            return (Receipt)response.getResult();
        }else{
            throw response.getException();
        }
    } 
    
    public List<SaleStatistics> getSaleStatistics() throws Exception{
        Request request = new Request(Operation.GET_ALL_SALE_STATISTICS, null);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if(response.getException()==null){
            return (List<SaleStatistics>)response.getResult();
        }else{
            throw response.getException();
        }
    } 
    
    public List<ReceiptItem> getReceiptItems() throws Exception{
        Receipt receipt = (Receipt) MySession.getInstance().getValue("my_receipt");
        Request request = new Request(Operation.GET_ALL_RECEIPT_ITEMS, receipt);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if(response.getException()==null){
            return (List<ReceiptItem>)response.getResult();
        }else{
            throw response.getException();
        }
    } 
    
    public void addPatient(Patient p) throws Exception{
        Request request = new Request(Operation.ADD_PATIENT, p);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if(response.getException()!=null){
            throw response.getException();
        }
    }
    
    public void addSaleStatistic(SaleStatistics s) throws Exception{
        Request request = new Request(Operation.ADD_SALE_STATISTIC, s);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if(response.getException()!=null){
            throw response.getException();
        }
    }
    
    public void editSaleStatistic(SaleStatistics s) throws Exception{
        Request request = new Request(Operation.EDIT_SALE_STATISTIC, s);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if(response.getException()!=null){
            throw response.getException();
        }
    }
    
    public void editPatient(Patient p) throws Exception{
        Request request = new Request(Operation.EDIT_PATIENT, p);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if(response.getException()!=null){
            throw response.getException();
        }
    }
    
    public void removePatient(Patient p) throws Exception{
        Request request = new Request(Operation.REMOVE_PATIENT, p);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if(response.getException()!=null){
            throw response.getException();
        }
    }
    public List<Medicine> getMedicines() throws Exception{
        Request request = new Request(Operation.GET_ALL_MEDICINES, null);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if(response.getException()==null){
            return (List<Medicine>)response.getResult();
        }else{
            throw response.getException();
        }
    } 
    public boolean checkMedicine(Medicine m){
        try {
            List<Receipt> receipts = getReceipts();
            for (Receipt receipt : receipts) {
                List<ReceiptItem> items = receipt.getItems();
                for (ReceiptItem item : items) {
                    if(item.getMedicine().getJKL().equals(m.getJKL())){
                    return true;
                }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Communication.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public List<Medicine> getMedicines(String query) throws Exception{
        Request request = new Request(Operation.GET_ALL_MEDICINES_BY_QUERY, query);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if(response.getException()==null){
            return (List<Medicine>)response.getResult();
        }else{
            throw response.getException();
        }
    } 
    
    public List<Patient> getPatients(String query) throws Exception{
        Request request = new Request(Operation.GET_ALL_PATIENTS_BY_QUERY, query);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if(response.getException()==null){
            return (List<Patient>)response.getResult();
        }else{
            throw response.getException();
        }
    } 
    
    public void addMedicine(Medicine m) throws Exception{
        Request request = new Request(Operation.ADD_MEDICINE, m);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if(response.getException()!=null){
            throw response.getException();
        }
    }
    
    public void editMedicine(Medicine m) throws Exception{
        Request request = new Request(Operation.EDIT_MEDICINE, m);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if(response.getException()!=null){
            throw response.getException();
        }
    }
    
    public void removeMedicine(Medicine m) throws Exception{
        Request request = new Request(Operation.REMOVE_MEDICINE, m);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if(response.getException()!=null){
            throw response.getException();
        }
    }
    
    public void addReceipt(Receipt r) throws Exception{
        Request request = new Request(Operation.ADD_RECEIPT, r);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if(response.getException()!=null){
            throw response.getException();
        }
    }
    
    public void editReceipt(Receipt r) throws Exception{
        Request request = new Request(Operation.EDIT_RECEIPT, r);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if(response.getException()!=null){
            throw response.getException();
        }
    }
    
    public void removeReceipt(Receipt r) throws Exception{
        Request request = new Request(Operation.REMOVE_RECEIPT, r);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if(response.getException()!=null){
            throw response.getException();
        }
    }
    
    public List<Substance> getSubstances() throws Exception{
        Request request = new Request(Operation.GET_ALL_SUBSTANCES, null);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if(response.getException()==null){
            return (List<Substance>)response.getResult();
        }else{
            throw response.getException();
        }
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }
    
    
    
}
