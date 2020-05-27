package main;

import com.QuanLyThuVien.view.LoginJDialog;

/**
 *
 * @author TVD
 */
public class Main {
    
    public static void main(String[] args) {
//        new MainJFrame().setVisible(true);
        LoginJDialog dialog = new LoginJDialog(null, true);
        dialog.setTitle("Đăng Nhập Hệ Thống");
        dialog.setResizable(false);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }
    
}
