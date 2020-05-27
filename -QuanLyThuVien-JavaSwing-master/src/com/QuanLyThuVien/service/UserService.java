
package com.QuanLyThuVien.service;

import com.QuanLyThuVien.dao.UserDao;
import com.QuanLyThuVien.model.User;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;


public class UserService {
    private static int currentUserid;
    private UserDao userDao;

    public UserService() {
        userDao = new UserDao();
    }
    
    public User getUserById(int user_id){
        return userDao.getUserById(user_id);
    }
    
    public List<User> getAllUser(){
        return userDao.getAllUser();
    }
    
    public void addUser(User user){
        userDao.addUser(user);
    }
    
    public Boolean CheckUsername(String username){
        return userDao.CheckUsername(username);
    }
    
    public List<User> searchUserFromName(String name){
        return userDao.searchUserFromName(name);
    }
    
    public List<User> searchUserFromUsername(String userName){
        return userDao.searchUserFromUsername(userName);
    }
    
    public void deleteUser(int user_id) throws SQLException{
        userDao.deleteUser(user_id);
    }
    
    public void blockUser(int user_id){
        userDao.blockUser(user_id);
    }
    
    public void unlockUser(int user_id){
        userDao.unlockUser(user_id);
    }
    
    public User CheckLogin(String userName, String passWord){
        return userDao.CheckLogin(userName, passWord);
    }
    
    public void setCurrentUserid(int userId){
        UserService.currentUserid = userId;
    }
    
    public int getCurrentUserid(){
        return UserService.currentUserid;
    }
    
    public JTable StatisUserByName(){
        return userDao.StatisUserByName();
    }
    
    public JTable StatisUserByRole(){
        return userDao.StatisUserByRole();
    }
}
