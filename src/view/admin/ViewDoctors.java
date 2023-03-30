/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.admin;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.CityDirectory;
import model.Community;
import model.CommunityDirectory;
import model.Doctor;
import model.DoctorDirectory;
import model.Hospital;
import model.HospitalDirectory;
import model.MainSystem;

/**
 *
 * @author adeda
 */
public class ViewDoctors extends javax.swing.JPanel {

    /**
     * Creates new form ViewDoctors
     */
    private MainSystem mainSystem;
    private JPanel aPanel;

    public ViewDoctors(MainSystem mainSystem) {
        initComponents();
        this.mainSystem = mainSystem;
        this.aPanel = mainSystem.getaPanel();

        populateTable();
        updateButton.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        doctorTable = new javax.swing.JTable();
        titleLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        doctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(doctorTable);
        if (doctorTable.getColumnModel().getColumnCount() > 0) {
            doctorTable.getColumnModel().getColumn(0).setResizable(false);
            doctorTable.getColumnModel().getColumn(1).setResizable(false);
            doctorTable.getColumnModel().getColumn(2).setResizable(false);
            doctorTable.getColumnModel().getColumn(3).setResizable(false);
        }

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("View All Doctors");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        viewButton.setText("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        firstNameLabel.setText("First Name");

        lastNameLabel.setText("Last Name");

        usernameLabel.setText("Username");

        passwordLabel.setText("Password");

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 106, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(backButton)
                        .addGap(213, 213, 213)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232)
                        .addComponent(deleteButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lastNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(firstNameField))
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(updateButton)
                        .addGap(167, 167, 167)
                        .addComponent(addButton)))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewButton)
                    .addComponent(deleteButton))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(usernameLabel)
                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(firstNameLabel)
                        .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(110, 110, 110))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateButton)
                            .addComponent(addButton))
                        .addGap(47, 47, 47))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:

        Hospital aHospital = mainSystem.getaHospital();
        Community aCommunity = mainSystem.getaCommunity();
        HospitalDirectory allHospitals = aCommunity.getAllHospitals();
        allHospitals.addHospital(aHospital);
        aCommunity.setAllHospitals(allHospitals);

        City aCity = mainSystem.getaCity();
        CommunityDirectory allCommunities = aCity.getAllCommunities();
        allCommunities.addCommunity(aCommunity);
        aCity.setAllCommunities(allCommunities);

        CityDirectory allCities = mainSystem.getAllCities();
        allCities.addCity(aCity);
        mainSystem.setAllCities(allCities);

        ViewHospital viewPatients = new ViewHospital(mainSystem);
        aPanel.add(viewPatients);
        CardLayout layout = (CardLayout) aPanel.getLayout();
        layout.next(aPanel);
    }//GEN-LAST:event_backButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = doctorTable.getSelectedRow();
        if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(aPanel, "Please select encounter to view.", "Error", HEIGHT);
        } else {
            Doctor selectedDoctor = (Doctor) doctorTable.getValueAt(selectedIndex, 0);
            Hospital selectedHospital = mainSystem.getaHospital();
            DoctorDirectory allDoctors = selectedHospital.getAllDoctors();
            allDoctors.removeDoctor(selectedDoctor);
            selectedHospital.setAllDoctors(allDoctors);
            mainSystem.setaHospital(selectedHospital);
            mainSystem.setADoctor(selectedDoctor);

            firstNameField.setText(selectedDoctor.getFirstName());
            lastNameField.setText(selectedDoctor.getLastName());
            usernameField.setText(selectedDoctor.getUsername());
            passwordField.setText(selectedDoctor.getPassword());
            backButton.setEnabled(false);
            viewButton.setEnabled(false);
            updateButton.setEnabled(true);
            addButton.setEnabled(false);
            deleteButton.setEnabled(false);
            doctorTable.setRowSelectionAllowed(false);

        }
    }//GEN-LAST:event_viewButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        Doctor selectedDoctor = mainSystem.getADoctor();
        Hospital selectedHospital = mainSystem.getaHospital();
        DoctorDirectory allDoctors = selectedHospital.getAllDoctors();

        selectedDoctor.setFirstName(firstNameField.getText());
        selectedDoctor.setLastName(lastNameField.getText());
        selectedDoctor.setUsername(usernameField.getText());
        selectedDoctor.setPassword(passwordField.getText());

        allDoctors.addDoctor(selectedDoctor);
        selectedHospital.setAllDoctors(allDoctors);
        mainSystem.setaHospital(selectedHospital);

        JOptionPane.showMessageDialog(aPanel, "Doctor's details updated successfully.", "Success", HEIGHT);
        populateTable();
        clearFields();
        updateButton.setEnabled(false);
        backButton.setEnabled(true);
        viewButton.setEnabled(true);
        addButton.setEnabled(true);
        deleteButton.setEnabled(true);

        doctorTable.setRowSelectionAllowed(true);
    }//GEN-LAST:event_updateButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        if (validateAddition()) {

            Doctor newDoctor = new Doctor();

            newDoctor.setFirstName(firstNameField.getText());
            newDoctor.setLastName(lastNameField.getText());
            newDoctor.setUsername(usernameField.getText());
            newDoctor.setPassword(passwordField.getText());

            Hospital selectedHospital = mainSystem.getaHospital();
            DoctorDirectory allDoctors = selectedHospital.getAllDoctors();

            allDoctors.addDoctor(newDoctor);
            selectedHospital.setAllDoctors(allDoctors);
            mainSystem.setaHospital(selectedHospital);

            JOptionPane.showMessageDialog(aPanel, "Doctor added successfully.", "Success", HEIGHT);
            populateTable();
            clearFields();
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = doctorTable.getSelectedRow();
        if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(aPanel, "Please select doctor to delete.", "Error", HEIGHT);
        } else {
            Doctor selectedDoctor = (Doctor) doctorTable.getValueAt(selectedIndex, 0);

            Hospital selectedHospital = mainSystem.getaHospital();
            DoctorDirectory allDoctors = selectedHospital.getAllDoctors();
            allDoctors.removeDoctor(selectedDoctor);

            selectedHospital.setAllDoctors(allDoctors);
            mainSystem.setaHospital(selectedHospital);

            JOptionPane.showMessageDialog(aPanel, "Doctor deleted successfully.", "Success", HEIGHT);
            populateTable();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTable doctorTable;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) doctorTable.getModel();
        model.setRowCount(0);
        DoctorDirectory allDoctors = mainSystem.getaHospital().getAllDoctors();
        try {
            for (Doctor d : allDoctors.getAllDoctors()) {
                Object[] rows = new Object[4];

                rows[0] = d;
                rows[1] = d.getLastName();
                rows[2] = d.getUsername();
                rows[3] = d.getPassword();

                model.addRow(rows);
//            clearFields();
            }
        } catch (NullPointerException e) {

        }
    }

    private void clearFields() {

        firstNameField.setText("");
        lastNameField.setText("");
        usernameField.setText("");
        passwordField.setText("");
    }

    private boolean validateAddition() {
        boolean b = false;
        if (firstNameField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(aPanel, "Please enter doctor's first name", "Error", HEIGHT);
            firstNameField.requestFocus();
        } else if (lastNameField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(aPanel, "Please enter doctor's last name", "Error", HEIGHT);
            lastNameField.requestFocus();
        } else if (usernameField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(aPanel, "Please enter doctor's username", "Error", HEIGHT);
            usernameField.requestFocus();
        } else if (passwordField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(aPanel, "Please enter doctor's password", "Error", HEIGHT);
            passwordField.requestFocus();
        } else {
            b = true;
        }
        return b;
    }
}
