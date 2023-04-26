/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.doctor;

import java.awt.CardLayout;
import static java.awt.event.KeyEvent.VK_BACK_SPACE;
import static java.awt.event.KeyEvent.VK_DELETE;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.DoctorDirectory;
import model.MainSystem;
import model.Patient;
import model.PatientDirectory;
import view.admin.CRUDPatient;

/**
 *
 * @author adeda
 */
public class ViewPatients extends javax.swing.JPanel {

    /**
     * Creates new form ViewPatients
     */
    private MainSystem mainSystem;
    private JPanel aPanel;
    private String previousCard;

    public ViewPatients(MainSystem mainSystem) {
        initComponents();
        this.mainSystem = mainSystem;
        this.aPanel = mainSystem.getaPanel();
        updateButton.setEnabled(false);
        viewEncountersButton.setEnabled(false);
        this.previousCard = String.valueOf(aPanel.findComponentAt(0, 0));

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
        patientsTable = new javax.swing.JTable();
        viewButton = new javax.swing.JButton();
        firstNameLabel = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        genderMenu = new javax.swing.JComboBox<>();
        bloodLabel = new javax.swing.JLabel();
        bloodMenu = new javax.swing.JComboBox<>();
        updateButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        viewEncountersButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("All Patients");

        patientsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Gender", "Blood Group"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(patientsTable);
        if (patientsTable.getColumnModel().getColumnCount() > 0) {
            patientsTable.getColumnModel().getColumn(0).setResizable(false);
            patientsTable.getColumnModel().getColumn(1).setResizable(false);
            patientsTable.getColumnModel().getColumn(2).setResizable(false);
            patientsTable.getColumnModel().getColumn(3).setResizable(false);
            patientsTable.getColumnModel().getColumn(4).setResizable(false);
        }

        viewButton.setText("VIew");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        firstNameLabel.setText("First Name");

        firstNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameFieldFocusLost(evt);
            }
        });
        firstNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                firstNameFieldKeyPressed(evt);
            }
        });

        lastNameLabel.setText("Last Name");

        lastNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNameFieldFocusLost(evt);
            }
        });
        lastNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lastNameFieldKeyPressed(evt);
            }
        });

        genderLabel.setText("Gender");

        genderMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        bloodLabel.setText("Blood Group");

        bloodMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));

        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        errorLabel.setForeground(new java.awt.Color(255, 51, 51));

        viewEncountersButton.setText("View Encounters");
        viewEncountersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEncountersButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(backButton)
                        .addGap(189, 189, 189)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(genderMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bloodLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bloodMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(viewEncountersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderLabel))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(bloodLabel)
                                .addComponent(bloodMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewEncountersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = patientsTable.getSelectedRow();
        if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(aPanel, "Please select patient to view.", "Error", HEIGHT);
        } else {
//            updateButton.setEnabled(true);
//            viewEncountersButton.setEnabled(true);
//            backButton.setEnabled(false);
//
//            patientsTable.setRowSelectionAllowed(false);
//
//            Patient selectedPatient = (Patient) patientsTable.getValueAt(selectedIndex, 0);
//            PatientDirectory allPatients = mainSystem.getAllPatients();
//            allPatients.removePatient(selectedPatient);
//            mainSystem.setAllPatients(allPatients);
//            mainSystem.setaPatient(selectedPatient);
//
//            firstNameField.setText(selectedPatient.getFirstName());
//            lastNameField.setText(selectedPatient.getLastName());
//            genderMenu.setSelectedItem(selectedPatient.getGender());
//            bloodMenu.setSelectedItem(selectedPatient.getBloodGroup());

            updateButton.setEnabled(true);
            viewEncountersButton.setEnabled(true);
            backButton.setEnabled(false);

            patientsTable.setRowSelectionAllowed(false);
            String id = String.valueOf(patientsTable.getValueAt(selectedIndex, 0));

            firstNameField.setText(String.valueOf(patientsTable.getValueAt(selectedIndex, 1)));
            lastNameField.setText(String.valueOf(patientsTable.getValueAt(selectedIndex, 2)));
            genderMenu.setSelectedItem(String.valueOf(patientsTable.getValueAt(selectedIndex, 3)));
            bloodMenu.setSelectedItem(String.valueOf(patientsTable.getValueAt(selectedIndex, 4)));
            mainSystem.setPatientID(id);
        }
    }//GEN-LAST:event_viewButtonActionPerformed

    private void firstNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFieldFocusLost
        // TODO add your handling code here:
        errorLabel.setText("");
    }//GEN-LAST:event_firstNameFieldFocusLost

    private void firstNameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameFieldKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((!Character.isLetter(c)) && (!Character.isWhitespace(c)) && (c != VK_BACK_SPACE) && (c != VK_DELETE)) {
            firstNameField.setEditable(false);
            errorLabel.setText("Please enter letters only.");
        } else {
            firstNameField.setEditable(true);
        }
    }//GEN-LAST:event_firstNameFieldKeyPressed

    private void lastNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFieldFocusLost
        // TODO add your handling code here:
        errorLabel.setText("");
    }//GEN-LAST:event_lastNameFieldFocusLost

    private void lastNameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameFieldKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((!Character.isLetter(c)) && (!Character.isWhitespace(c)) && (c != VK_BACK_SPACE) && (c != VK_DELETE)) {
            lastNameField.setEditable(false);
            errorLabel.setText("Please enter letters only.");
        } else {
            lastNameField.setEditable(true);
        }
    }//GEN-LAST:event_lastNameFieldKeyPressed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = patientsTable.getSelectedRow();

        if (validateUpdate()) {
//            Patient selectedPatient = mainSystem.getaPatient();
//            PatientDirectory allPatients = mainSystem.getAllPatients();
//
//            selectedPatient.setFirstName(firstNameField.getText());
//            selectedPatient.setLastName(lastNameField.getText());
//            selectedPatient.setGender(String.valueOf(genderMenu.getSelectedItem()));
//            selectedPatient.setBloodGroup(String.valueOf(bloodMenu.getSelectedItem()));
//            allPatients.addPatient(selectedPatient);
//            mainSystem.setAllPatients(allPatients);
//            JOptionPane.showMessageDialog(aPanel, "Patient's details updated successfully.", "Success", HEIGHT);
//            populateTable();
//            updateButton.setEnabled(false);
//            viewEncountersButton.setEnabled(false);
//            backButton.setEnabled(true);
//
//            patientsTable.setRowSelectionAllowed(true);
//            clearFields();

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hms", "root", "Info5100");

                String sql = "update patientsdirectory set FirstName = '" + firstNameField.getText()
                        + "', LastName = '" + lastNameField.getText()
                        + "', Gender = '" + genderMenu.getSelectedItem()
                        + "', BloodGroup = '" + bloodMenu.getSelectedItem()
                        + "' where ID = '" + mainSystem.getPatientID() + "'";
                PreparedStatement ptst = conn.prepareStatement(sql);
                ptst.execute();
                conn.close();
                JOptionPane.showMessageDialog(aPanel, "Patient's details updated successfully.", "Success", HEIGHT);

            } catch (Exception e) {
//            JOptionPane.showMessageDialog(rootPane, e, "sjkd", HEIGHT);
                System.out.println(e);
            }
            populateTable();
            updateButton.setEnabled(false);
            viewEncountersButton.setEnabled(false);
            backButton.setEnabled(true);

            patientsTable.setRowSelectionAllowed(true);
            clearFields();
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void viewEncountersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEncountersButtonActionPerformed
        // TODO add your handling code here:

        ViewEncounters viewEncounter = new ViewEncounters(mainSystem);
        aPanel.add(viewEncounter);
        CardLayout layout = (CardLayout) aPanel.getLayout();
        layout.next(aPanel);
    }//GEN-LAST:event_viewEncountersButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:

        if (previousCard.contains("CRUDPatient")) {
            CRUDPatient crudPatient = new CRUDPatient(mainSystem);
            aPanel.add(crudPatient);
            CardLayout layout = (CardLayout) aPanel.getLayout();
            layout.next(aPanel);
        } else {
            DoctorDashboard dashboard = new DoctorDashboard(mainSystem);
            aPanel.add(dashboard);
            CardLayout layout = (CardLayout) aPanel.getLayout();
            layout.next(aPanel);
        }

    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel bloodLabel;
    private javax.swing.JComboBox<String> bloodMenu;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JComboBox<String> genderMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTable patientsTable;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton viewButton;
    private javax.swing.JButton viewEncountersButton;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

//        PatientDirectory allPatients = mainSystem.getAllPatients();
//        DefaultTableModel model = (DefaultTableModel) patientsTable.getModel();
//        model.setRowCount(0);
//
//        for (Patient p : allPatients.getAllPatients()) {
//            Object[] rows = new Object[4];
//
//            rows[0] = p; // ID for Patient
//            rows[1] = p.getLastName(); 
//            rows[2] = p.getGender();
//            rows[3] = p.getBloodGroup();
//
//            model.addRow(rows);
//        }
        PatientDirectory allPatients = new PatientDirectory();
        try {
            Object[] oConn = allPatients.getAllPatients();
            ResultSet rs = (ResultSet) oConn[0];
            Connection conn = (Connection) oConn[1];

            DefaultTableModel model = (DefaultTableModel) patientsTable.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                Object o[] = {rs.getString("ID"),
                    rs.getString("FirstName"),
                    rs.getString("LastName"),
                    rs.getString("Gender"),
                    rs.getString("BloodGroup"),};
                model.addRow(o);
            }
            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private boolean validateUpdate() {
//        boolean b = false;
//        int selectedIndex = patientsTable.getSelectedRow();
//        if (selectedIndex < 0) {
//            JOptionPane.showMessageDialog(aPanel, "Please select patient to update.", "Error", HEIGHT);
//        } else if (updateButton.isEnabled() == false) {
//            JOptionPane.showMessageDialog(aPanel, "Please click \"View\" to enable update.",
//                    "Error", HEIGHT);
//        } else {
//
//            Patient selectedPatient = (Patient) patientsTable.getValueAt(selectedIndex, 0);
//            Patient formerPatient = mainSystem.getaPatient();
//
//            if (selectedPatient != formerPatient) {
//                JOptionPane.showMessageDialog(aPanel, "This update is only for "
//                        + formerPatient.getFirstName() + " " + formerPatient.getLastName(), "Error", HEIGHT);
//            } else if (firstNameField.getText().trim().equals("")) {
//                JOptionPane.showMessageDialog(aPanel, "Please enter patient's first name", "Error", HEIGHT);
//                firstNameField.requestFocus();
//            } else if (lastNameField.getText().trim().equals("")) {
//                JOptionPane.showMessageDialog(aPanel, "Please enter patient's last name", "Error", HEIGHT);
//                lastNameField.requestFocus();
//            } else {
//                b = true;
//            }
//        }
//        return b;
        boolean b = false;
        if (firstNameField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(aPanel, "Please enter patient's first name", "Error", HEIGHT);
            firstNameField.requestFocus();
        } else if (lastNameField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(aPanel, "Please enter patient's last name", "Error", HEIGHT);
            lastNameField.requestFocus();
        } else {
            b = true;
        }
        return b;
    }

    private void clearFields() {
        firstNameField.setText("");
        lastNameField.setText("");
    }
}
