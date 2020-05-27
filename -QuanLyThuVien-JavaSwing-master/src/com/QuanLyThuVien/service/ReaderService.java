
package com.QuanLyThuVien.service;

import com.QuanLyThuVien.dao.ReaderDao;
import com.QuanLyThuVien.model.Reader;
import com.QuanLyThuVien.model.User;
import java.util.List;
import javax.swing.JTable;

public class ReaderService {
    private ReaderDao readerDao;

    public ReaderService() {
        readerDao = new ReaderDao();
    }
    
    public Reader getReaderById(int reader_id){
        return readerDao.getReaderById(reader_id);
    }
    
    public List<Reader> getAllReader(){
        return readerDao.getAllReader();
    }
    
    public void deleteReader(int reader_id){
        readerDao.deleteReader(reader_id);
    }
    
    public void addReader(Reader reader){
        readerDao.addReader(reader);
    }
    
    public void updateReader(Reader reader){
        readerDao.updateReader(reader);
    }
    
    public List<Reader> searchReaderFromName(String name){
        return readerDao.searchReaderFromName(name);
    }
    
    public List<Reader> searchReaderFromEmail(String email){
        return readerDao.searchReaderFromEmail(email);
    }
    
    public List<Reader> searchReaderFromPhone(String phone){
        return readerDao.searchReaderFromPhone(phone);
    }
    
    public JTable StatisReaderByAddress(){
        return readerDao.StatisReaderByAddress();
    }
    
    public JTable StatisReaderByName(){
        return readerDao.StatisReaderByName();
    }
    
    public JTable StatisReaderByBook(){
        return readerDao.StatisReaderByBook();
    }
    
}
