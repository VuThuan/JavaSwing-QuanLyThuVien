
package com.QuanLyThuVien.view.reader;

import com.QuanLyThuVien.model.Reader;
import com.QuanLyThuVien.service.ReaderService;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ReaderJPanel extends javax.swing.JPanel {

    ReaderService readerService;
    DefaultTableModel defaultTableModel;
    Reader readerModel;
    
    public ReaderJPanel() {
        initComponents();
        readerService = new ReaderService();
        defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Không cho phép người dùng sửa dữ liệu
            }        
        };
        
        readerTable.setModel(defaultTableModel);
        defaultTableModel.addColumn("Mã độc giả");
        defaultTableModel.addColumn("Họ và tên");
        defaultTableModel.addColumn("Địa chỉ");
        defaultTableModel.addColumn("Số điện thoại");
        defaultTableModel.addColumn("Email");
        
        List<Reader> readers = readerService.getAllReader();
        
        for(Reader reader : readers){
            
            defaultTableModel.addRow(new Object[]{reader.getReader_id(),reader.getName(),reader.getAddress(),reader.getPhone(),reader.getEmail()});
        }
        
        typeSearchJCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Theo tên", "Theo email", "Theo số điện thoại"}));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        readerTable = new javax.swing.JTable();
        typeSearchJCombobox = new javax.swing.JComboBox<>();
        searchJTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        deleteButton = new javax.swing.JButton();
        refeshButton = new javax.swing.JButton();
        addbutton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        refeshButton1 = new javax.swing.JButton();

        readerTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        readerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã độc giả", "Họ và tên", "Địa chỉ", "Số điện thoại", "email"
            }
        ));
        jScrollPane1.setViewportView(readerTable);

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(typeSearchJCombobox, 0, 211, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchJTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeSearchJCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        deleteButton.setBackground(new java.awt.Color(255, 51, 51));
        deleteButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Xóa");
        deleteButton.setBorderPainted(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        refeshButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        refeshButton.setText("Refesh");
        refeshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refeshButtonActionPerformed(evt);
            }
        });

        addbutton.setBackground(new java.awt.Color(0, 153, 0));
        addbutton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addbutton.setForeground(new java.awt.Color(255, 255, 255));
        addbutton.setText("Thêm Người Đọc");
        addbutton.setBorderPainted(false);
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(0, 153, 0));
        updateButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Cập Nhật");
        updateButton.setBorderPainted(false);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        refeshButton1.setBackground(new java.awt.Color(0, 102, 102));
        refeshButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        refeshButton1.setForeground(new java.awt.Color(255, 255, 255));
        refeshButton1.setText("Thống Kê");
        refeshButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refeshButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(refeshButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(refeshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteButton)
                .addGap(18, 18, 18)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addbutton)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refeshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refeshButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 794, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(36, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 708, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(17, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(87, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        
        String searchKeyWord;
        searchKeyWord = searchJTextField.getText();
        defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Không cho phép người dùng sửa dữ liệu
            }
        };
        readerTable.setModel(defaultTableModel);
        defaultTableModel.addColumn("Mã độc giả");
        defaultTableModel.addColumn("Họ và tên");
        defaultTableModel.addColumn("Địa chỉ");
        defaultTableModel.addColumn("Số điện thoại");
        defaultTableModel.addColumn("Email");

        String typeSearch = String.valueOf(typeSearchJCombobox.getSelectedItem());

        List<Reader> readers;
        if(typeSearch.equals("Theo tên")){
            readers = readerService.searchReaderFromName(searchKeyWord);
        }
        else if(typeSearch.equals("Theo email")){
            readers = readerService.searchReaderFromEmail(searchKeyWord);
        }
        else{
            readers = readerService.searchReaderFromPhone(searchKeyWord);
        }
        for(Reader reader : readers){
            
            defaultTableModel.addRow(new Object[]{reader.getReader_id(),reader.getName(),reader.getAddress(),reader.getPhone(),reader.getEmail()});
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int row = readerTable.getSelectedRow();
        
        int confirm  = JOptionPane.showConfirmDialog(ReaderJPanel.this, "Bạn có chắc chắn muốn xóa không?");
        
        if(confirm == JOptionPane.YES_OPTION){
            int readerId = Integer.valueOf(String.valueOf(readerTable.getValueAt(row, 0)));
            readerService.deleteReader(readerId);
            JOptionPane.showMessageDialog(null, "Đã xóa độc giả!");
        }
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void refeshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refeshButtonActionPerformed
        defaultTableModel.setRowCount(0);

        List<Reader> readers = readerService.getAllReader();
        
        for(Reader reader : readers){
            
            defaultTableModel.addRow(new Object[]{reader.getReader_id(),reader.getName(),reader.getAddress(),reader.getPhone(),reader.getEmail()});
        }
    }//GEN-LAST:event_refeshButtonActionPerformed

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        new AddReaderJFrame().setVisible(true);
    }//GEN-LAST:event_addbuttonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        int row = readerTable.getSelectedRow();
        int readerId = Integer.valueOf(String.valueOf(readerTable.getValueAt(row, 0)));
        new UpdateJFrame(readerId).setVisible(true);
    }//GEN-LAST:event_updateButtonActionPerformed

    private void refeshButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refeshButton1ActionPerformed
        new StatisticalJFrame().setVisible(true);
    }//GEN-LAST:event_refeshButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable readerTable;
    private javax.swing.JButton refeshButton;
    private javax.swing.JButton refeshButton1;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchJTextField;
    private javax.swing.JComboBox<String> typeSearchJCombobox;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
