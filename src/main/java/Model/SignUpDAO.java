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
import javax.swing.JOptionPane;

/**
 *
 * @author rajasharma
 */
public class SignUpDAO {

    public boolean newPlayer(String userName, String password, String firstName, String address) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false", "root", "Hello@123");
            if (connection.isClosed() != true) {

            }

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("INSERT into player(firstName, address, userName, password) values(?, ?, ?, ?)");

            st.setString(1, firstName);
            st.setString(2, address);
            st.setString(3, userName);
            st.setString(4, password);

            st.executeUpdate();
            return true;

            //if (rs.next()) {
            //   System.out.println("works");
            //    return true;
            //} else {
            //   System.out.println("no");
            //    return false;
            //}
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

    public boolean newCoach(String userName, String password, String firstName, String address) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false", "root", "Hello@123");
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

}
