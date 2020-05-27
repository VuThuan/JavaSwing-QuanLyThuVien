
package com.QuanLyThuVien.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    public static Connection getJDBCConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlythuvien", "root", "");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) {
		Connection connection = getJDBCConnection();
		if(connection!=null){
			System.out.println("ket noi thanh cong");
		}
		else{
			System.out.println("ket noi that bai");
		}
	}
}
