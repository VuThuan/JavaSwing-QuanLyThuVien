
package com.QuanLyThuVien.service;

import com.QuanLyThuVien.dao.BillDetailDao;
import com.QuanLyThuVien.model.BillDetail;
import java.util.List;

public class BillDetailService {
    private BillDetailDao billDetailDao;

    public BillDetailService() {
        billDetailDao = new BillDetailDao();
    }
    
    public void addBook(List<Integer> book_ids, int bill_id){
        billDetailDao.addBook(book_ids, bill_id);
    }
    
    public List<BillDetail> getAllBillDetail(int billId){
        return billDetailDao.getAllBillDetail(billId);
    }
    
    public void update(int billDetail_id,int fined){
        billDetailDao.update(billDetail_id, fined);
    }
    
}
