
package com.QuanLyThuVien.view.user;

import com.QuanLyThuVien.model.User;
import com.QuanLyThuVien.service.UserService;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UserJPanel extends javax.swing.JPanel {

    UserService userService;
    DefaultTableModel defaultTableModel;
    
    public UserJPanel() {
        initComponents();
        userService = new UserService();
        User currentUser = userService.getUserById(userService.getCurrentUserid());
        if(currentUser.getLeve() != 1){
            deleteButton.setVisible(false);
            addUserbutton.setVisible(false);
        }
        defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Không cho phép người dùng sửa dữ liệu
            }        
        };
        
        typeSearchJCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Theo tên", "Theo tài khoản"}));
        
        userTable.setModel(defaultTableModel);
        defaultTableModel.addColumn("Mã nv");
        defaultTableModel.addColumn("Họ và tên");
        defaultTableModel.addColumn("Tài khoản");
        defaultTableModel.addColumn("Số điện thoại");
        defaultTableModel.addColumn("Chức vụ");
        defaultTableModel.addColumn("Tình trạng");
        
        List<User> users = userService.getAllUser();
        
        String chucVu;
        String tinhTrang;
        for(User user : users){
            if(user.getLeve() == 1){
                chucVu = "Quản trị viên";
            }
            else{
                chucVu = "Nhân viên";
            }
            tinhTrang = "Hoạt động";
            defaultTableModel.addRow(new Object[]{user.getUser_id(),user.getName(),user.getUsername(),user.getPhone(),chucVu,tinhTrang});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        refeshButton = new javax.swing.JButton();
        addUserbutton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        typeSearchJCombobox = new javax.swing.JComboBox<>();
        searchJTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();

        refeshButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        refeshButton.setText("Refesh");
        refeshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refeshButtonActionPerformed(evt);
            }
        });

        addUserbutton.setBackground(new java.awt.Color(0, 153, 0));
        addUserbutton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addUserbutton.setForeground(new java.awt.Color(255, 255, 255));
        addUserbutton.setText("Thêm Nhân viên");
        addUserbutton.setBorderPainted(false);
        addUserbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserbuttonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 0, 0));
        deleteButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        deleteButton.setText("Xóa");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(refeshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addUserbutton)
                .addGap(18, 18, 18)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addUserbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refeshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(772, Short.MAX_VALUE))
        );

        userTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã nv", "Họ và tên", "Tài khoản", "Số điện thoại", "Chức vụ", "Tình trạng"
            }
        ));
        jScrollPane1.setViewportView(userTable);

        typeSearchJCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        searchJTextField.setText("Nhập từ khóa tìm kiếm.");
        searchJTextField.setToolTipText("");

        searchButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        searchButton.setText("Tìm Kiếm");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(typeSearchJCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchJTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeSearchJCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(507, 507, 507))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refeshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refeshButtonActionPerformed
        defaultTableModel.setRowCount(0);
        List<User> users = userService.getAllUser();
        
        String chucVu;
        String tinhTrang;
        for(User user : users){
            if(user.getLeve() == 1){
                chucVu = "Quản trị viên";
            }
            else{
                chucVu = "Nhân viên";
            }
            if(user.getFlag() == 0){
                tinhTrang = "Bị khóa!";
            }
            else{
                tinhTrang = "Hoạt động";
            }
            defaultTableModel.addRow(new Object[]{user.getUser_id(),user.getName(),user.getUsername(),user.getPhone(),chucVu,tinhTrang});
        }
    }//GEN-LAST:event_refeshButtonActionPerformed

    private void addUserbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserbuttonActionPerformed
        new AddUserJFrame().setVisible(true);
    }//GEN-LAST:event_addUserbuttonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        String searchKeyWord;
        searchKeyWord = searchJTextField.getText();
        defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Không cho phép người dùng sửa dữ liệu
            }
        };
        userTable.setModel(defaultTableModel);
        defaultTableModel.addColumn("Mã nv");
        defaultTableModel.addColumn("Họ và tên");
        defaultTableModel.addColumn("Tài khoản");
        defaultTableModel.addColumn("Số điện thoại");
        defaultTableModel.addColumn("Chức vụ");
        defaultTableModel.addColumn("Tình trạng");

        String typeSearch = String.valueOf(typeSearchJCombobox.getSelectedItem());

        List<User> users;
        if(typeSearch.equals("Theo tên")){
            users = userService.searchUserFromName(searchKeyWord);
        }

        else{
            users = userService.searchUserFromUsername(searchKeyWord);
        }

        String chucVu;
        String tinhTrang;
        for(User user : users){
            if(user.getLeve() == 1){
                chucVu = "Quản trị viên";
            }
            else{
                chucVu = "Nhân viên";
            }
            if(user.getFlag() == 0){
                tinhTrang = "Bị khóa!";
            }
            else{
                tinhTrang = "Hoạt động";
            }
            defaultTableModel.addRow(new Object[]{user.getUser_id(),user.getName(),user.getUsername(),user.getPhone(),chucVu,tinhTrang});
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int selectedRow = userTable.getSelectedRow();
        int selectedUserId = (int) userTable.getModel().getValueAt(selectedRow, 0);
        User selectedUser = userService.getUserById(selectedUserId);
        if(selectedUser.getLeve() != 1){
            System.out.print(selectedUserId);
            try {
                userService.deleteUser(selectedUserId);
            } catch (SQLException ex) {
                Logger.getLogger(UserJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Xóa thành công!");
        }else{
            JOptionPane.showMessageDialog(this, "Không thể xóa quản trị viên!");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUserbutton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refeshButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchJTextField;
    private javax.swing.JComboBox<String> typeSearchJCombobox;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
