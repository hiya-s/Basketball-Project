/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.SignIn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rajasharma
 */
public class CoachDAO {

    public boolean isValid(String password, String userName) {
        Connection connection = null;
        try {

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false&serverTimezone=CST", "root", "Hello@123");

            if (connection.isClosed() != true) {

            }

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("Select userName, password from coach where userName=? and password=?");

            st.setString(1, userName);
            st.setString(2, password);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {

                return true;

            } else {

                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean newCoach(String userName, String password, String firstName, String address) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false&serverTimezone=CST", "root", "Hello@123");
            if (connection.isClosed() != true) {

            }

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("INSERT into coach(firstName, address, userName, password) values(?, ?, ?, ?)");
            //id = id++;
            //st.setInt(1,id);
            st.setString(1, firstName);
            st.setString(2, address);
            st.setString(3, userName);
            st.setString(4, password);

            st.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return true;

    }

    public int coachID(String password, String userName) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false&serverTimezone=CST", "root", "Hello@123");
            if (connection.isClosed() != true) {

            }

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("Select cid from coach where userName=? and password=?");

            st.setString(1, userName);
            st.setString(2, password);

            ResultSet rs = st.executeQuery();
            rs.next();
            int cid = rs.getInt("cid");

            System.out.println(cid);
            return cid;

        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return -1;
    }
}
