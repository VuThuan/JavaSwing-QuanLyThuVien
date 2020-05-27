
package com.QuanLyThuVien.service;

import com.QuanLyThuVien.dao.BillDao;
import com.QuanLyThuVien.model.Bill;
import java.util.List;
import javax.swing.JTable;

public class BillService {
    private BillDao billDao;

    public BillService() {
        billDao = new BillDao();
    }
    
    public List<Bill> getAllBill(){
        return billDao.getAllBill();
    }
    
    public void addBill(Bill bill){
        billDao.addBill(bill);
    }
    
    public int getBillIdNew(){
        return billDao.getBillIdNew();
    }
    
    public Bill getBillById(int bill_id){
        return billDao.getBillById(bill_id);
    }
    
    public List<Bill> searchBillFromReader(String searchKeyWord){
        return billDao.searchBillFromReader(searchKeyWord);
    }
    
    public List<Bill> searchBillFromUser(String searchKeyWord){
        return billDao.searchBillFromUser(searchKeyWord);
    }
    
    public List<Bill> searchBillFromDate(String searchKeyWord){
        return billDao.searchBillFromDate(searchKeyWord);
    }
    
    public JTable StatisUserByDate(){
        return billDao.StatisUserByDate();
    }
    
    public int getCountBookByDate(String date){
        return billDao.getCountBookByDate(date);
    }
}
