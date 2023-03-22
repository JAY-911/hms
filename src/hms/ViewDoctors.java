/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hms;

import data.Doctor;
import data.DoctorDirectory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author adeda
 */
public class ViewDoctors extends javax.swing.JFrame {

    /**
     * Creates new form ViewDoctors
     */
    public ViewDoctors() {
        initComponents();
        populateTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        docTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Doctor Details");

        docTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Age", "Employer", "Gender", "CellNumber", "Email", "BloodGroup", "StartDate", "Address", "City", "Specialization", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(docTable);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        viewButton.setText("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        logOutButton.setText("Log Out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        searchField.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        searchField.setForeground(new java.awt.Color(153, 153, 153));
        searchField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        searchField.setText("Search Field");
        searchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchFieldFocusLost(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(277, 277, 277)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167)
                .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(349, 349, 349))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton)
                    .addComponent(logOutButton))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewButton)
                    .addComponent(deleteButton))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:

        AdminDashboard ad = new AdminDashboard();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        DoctorDirectory allDocs = new DoctorDirectory();
        
        int selectedIndex = docTable.getSelectedRow();
        if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select employee to delete.", "Error", HEIGHT);
        } else {
            String docID = String.valueOf(docTable.getValueAt(selectedIndex, 0));
            String docEmp = String.valueOf(docTable.getValueAt(selectedIndex, 3));
            allDocs.removeDoctor(docID, docEmp);
            populateTable();
        }

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = docTable.getSelectedRow();
        if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select employee to view.", "Error", HEIGHT);
        } else {
            try {
                Doctor selectedDoc = new Doctor();
//                String selectedDoc = String.valueOf(docTable.getValueAt(selectedIndex, 0));
//                Class.forName("com.mysql.cj.jdbc.Driver");
//                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hms", "root", "root");
//
//                String sql = "select * from doctorsdirectory where ID= '" + selectedDoc + "'";
//                PreparedStatement ptst = conn.prepareStatement(sql);
//                ResultSet rs = ptst.executeQuery();
//                rs.next();
//                
//                String firstName = rs.getString("FirstName");
//                String lastName = rs.getString("LastName");
//                String id = rs.getString("ID");
                String startDate = (String) docTable.getValueAt(selectedIndex, 9);
                DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
                selectedDoc.setId((String) docTable.getValueAt(selectedIndex, 0));
                selectedDoc.setFirstName(String.valueOf(docTable.getValueAt(selectedIndex, 1)));
                selectedDoc.setLastName(String.valueOf(docTable.getValueAt(selectedIndex, 2)));
                selectedDoc.setAge(Integer.valueOf((String)(docTable.getValueAt(selectedIndex, 3))));
                selectedDoc.setGender((String) docTable.getValueAt(selectedIndex, 5));
                selectedDoc.setCellNum( Long.valueOf((String) docTable.getValueAt(selectedIndex, 6)));
                selectedDoc.setEmail((String) docTable.getValueAt(selectedIndex, 7));
                selectedDoc.setBloodGroup((String) docTable.getValueAt(selectedIndex, 8));
                selectedDoc.setEmployer((String) docTable.getValueAt(selectedIndex, 4));
                selectedDoc.setStartDate(fmt.parse(startDate));
                selectedDoc.setAddress((String) docTable.getValueAt(selectedIndex, 10));
                selectedDoc.setCity((String) docTable.getValueAt(selectedIndex, 11));
                selectedDoc.setSpecialization((String) docTable.getValueAt(selectedIndex, 12));
                selectedDoc.setUsername((String) docTable.getValueAt(selectedIndex, 13));
                selectedDoc.setPassword((String) docTable.getValueAt(selectedIndex, 14));
                
                UpdateDoctor ad = new UpdateDoctor(selectedDoc);
                ad.setVisible(true);
                this.dispose();
//                conn.close();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e, "sjkd", HEIGHT);
            }
        }

    }//GEN-LAST:event_viewButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        // TODO add your handling code here:
        MainJFrame ad = new MainJFrame();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void searchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusGained
        // TODO add your handling code here:
        if (searchField.getText().equals("Search Field")) {
            searchField.setText("");
        }
    }//GEN-LAST:event_searchFieldFocusGained

    private void searchFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusLost
        // TODO add your handling code here:
        if (searchField.getText().equals("")) {
            searchField.setText("Search Field");
        }
    }//GEN-LAST:event_searchFieldFocusLost

    private void searchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyPressed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) docTable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        docTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + searchField.getText().trim()));
    }//GEN-LAST:event_searchFieldKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewDoctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDoctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDoctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDoctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDoctors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTable docTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

//        DefaultTableModel model = (DefaultTableModel) docTable.getModel();
//        model.setRowCount(0);
//        for (Doctor u : allDoctors.getAllDoctors()) {
//            Object[] rows = new Object[3];
//            rows[0] = u;
//            rows[1] = u.getFirstName();
//            rows[2] = u.getLastName();
//            rows[3] = u.getEmail();
//            model.addRow(rows);
//    }
        DoctorDirectory allDocs = new DoctorDirectory();
        try {
            Object[] oConn = allDocs.getAllDoctors();
            ResultSet rs = (ResultSet) oConn[0];
            Connection conn = (Connection) oConn[1];
            
            DefaultTableModel model = (DefaultTableModel) docTable.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                Object o[] = {rs.getString("ID"),
                    rs.getString("FirstName"),
                    rs.getString("LastName"),
                    rs.getString("Age"),
                    rs.getString("Employer"),
                    rs.getString("Gender"),
                    rs.getString("CellNumber"),
                    rs.getString("Email"),
                    rs.getString("BloodGroup"),
                    rs.getString("StartDate"),
                    rs.getString("Address"),
                    rs.getString("City"),
                    rs.getString("Specialization"),
                    rs.getString("Username"),
                    rs.getString("Password"),};
                model.addRow(o);
            }
            conn.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
