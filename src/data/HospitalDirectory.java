/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author adeda
 */
public class HospitalDirectory {

    private ArrayList<Hospital> allHospitals;

    public HospitalDirectory() {
        this.allHospitals = new ArrayList<>();
    }

    public Object[] getAllHospitals() {
        Object[] oConn = new Object[2];
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hms", "root", "root");

            String sql = "select * from hospitaldirectory";

            PreparedStatement ptst = conn.prepareStatement(sql);
            ResultSet rs = ptst.executeQuery();
            oConn[0] = rs;
            oConn[1] = conn;
//            conn.close();

        } catch (Exception e) {
//            JOptionPane.showMessageDialog(rootPane, e, "sjkd", HEIGHT);
            System.out.println(e);

        }
        return oConn;
    }

    public void setAllHospitals(ArrayList<Hospital> allHospitals) {
        this.allHospitals = allHospitals;
    }

    public void addHospital(Hospital aHospital) {
//        this.allHospitals.add(aHospital);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hms", "root", "root");

            String sql = "insert into hospitaldirectory values (?)";
            PreparedStatement ptst = conn.prepareStatement(sql);

            ptst.setString(1, aHospital.getName());
            ptst.executeUpdate();
            
            String sql2 = "create table "+aHospital.getName().replace(' ', '_')+"_Doctors ("
                                        + "ID int(255),"

                    + "FirstName varchar(255),"
                    + "LastName varchar(255))";
            PreparedStatement ptst2 = conn.prepareStatement(sql2);

            
            ptst2.executeUpdate();
            
            conn.close();
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(rootPane, e, "sjkd", HEIGHT);
System.out.println(e);

        }
    }

    public void removeHospital(Hospital aHospital) {
        this.allHospitals.remove(aHospital);
    }
}
