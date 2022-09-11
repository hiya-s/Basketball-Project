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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rajasharma
 */
public class NotesDAO {

    public boolean newNotes(String notes, int sid, int cid) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false&serverTimezone=CST", "root", "Hello@123");
            if (connection.isClosed() != true) {

            }

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("INSERT into notes(notes, sid, cid) values(?, ?, ?)");

            st.setString(1, notes);
            st.setInt(2, sid);
            st.setInt(3, cid);
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
    
    
    public String getNotes(int sid) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false&serverTimezone=CST", "root", "Hello@123");
            if (connection.isClosed() != true) {

            }

            ArrayList<String> notesstring = new ArrayList<String>();
            String full = "";

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("select notes from notes where sid = ?");

            st.setInt(1, sid);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                full = rs.getString("notes") +" ";
                //notesstring.add(rs.getString("notes"));

            }
            return full;

        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return null;
    }

}
