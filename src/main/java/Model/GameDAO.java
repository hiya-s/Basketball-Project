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
public class GameDAO {

    /**
     * @param args the command line arguments
     */
   

    public boolean newGame(int t1Score, int t2Score, int t1id) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false&serverTimezone=CST", "root", "Hello@123");
            if (connection.isClosed() != true) {

            }

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("INSERT into game(t1Score, t2Score, t1id) values(?, ?, ?)");

            st.setInt(1, t1Score);
            st.setInt(2, t2Score);
            st.setInt(3, t1id);

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

    public int gameId(int t1Score, int t2Score, int t1id) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false&serverTimezone=CST", "root", "Hello@123");
            if (connection.isClosed() != true) {

            }

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("Select gid from game where t1Score=? and t2Score=? and t1id=? ");

            st.setInt(1, t1Score);
            st.setInt(2, t2Score);
            st.setInt(3, t1id);

            ResultSet rs = st.executeQuery();
            rs.next();
            int gid = rs.getInt("gid");

            System.out.println("when found gid" + gid);

            return gid;

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
