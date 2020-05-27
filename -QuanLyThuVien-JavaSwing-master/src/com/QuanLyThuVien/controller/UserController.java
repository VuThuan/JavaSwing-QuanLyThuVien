/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyThuVien.controller;

import com.QuanLyThuVien.model.User;
import com.QuanLyThuVien.service.UserService;
import com.QuanLyThuVien.view.MainJFrame;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class UserController {
    private JDialog dialog;
    private JButton btnSubmit;
    private JTextField jtfTenDangNhap;
    private JPasswordField jtfMatKhau;
    private JLabel jlbMsg;

    private UserService userService = null;

    public UserController(JDialog dialog, JButton btnSubmit, JTextField jtfTenDangNhap, 
            JPasswordField jtfMatKhau, JLabel jlbMsg) {
        this.dialog = dialog;
        this.btnSubmit = btnSubmit;
        this.jtfTenDangNhap = jtfTenDangNhap;
        this.jtfMatKhau = jtfMatKhau;
        this.jlbMsg = jlbMsg;

        userService = new UserService();
    }

    public void setEvent() {
        btnSubmit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (jtfTenDangNhap.getText().length() == 0 || jtfMatKhau.getText().length() == 0) {
                    jlbMsg.setText("Vui lòng nhập dữ liệu bắt buộc!");
                } else {
                    User user = userService.CheckLogin(jtfTenDangNhap.getText(), jtfMatKhau.getText());
                    if (user == null) {
                        jlbMsg.setText("Tên đăng nhập hoặc mật khẩu không đúng!");
                        
                    } else {
                        if (user.getFlag() == 0) {
                            jlbMsg.setText("Tài khoản đang bị tạm khóa!");
                        } else {         
                            userService.setCurrentUserid(user.getUser_id());
                            dialog.dispose();
                            new MainJFrame(user.getUser_id()).setVisible(true);
                        }
                    }
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnSubmit.setBackground(new Color(0, 200, 83));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnSubmit.setBackground(new Color(100, 221, 23));
            }
        });
    }
}
