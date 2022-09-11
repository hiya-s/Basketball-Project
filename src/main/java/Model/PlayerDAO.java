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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rajasharma
 */
public class PlayerDAO {

    public boolean isValid(String password, String userName) {
        Connection connection = null;
        try {
            //connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false&serverTimezone=CST", "root", "Hello@123");
            connection = DriverManager.getConnection("jdbc:mysql://basketballa.cd1xsqsl0lfq.us-east-1.rds.amazonaws.com/basketball", "root", "root1234");
            if (connection.isClosed() != true) {
                System.out.println("connection is going in");
            }

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("Select userName, password from player where userName=? and password=?");

            st.setString(1, userName);
            st.setString(2, password);

            System.out.println(userName);
            System.out.println(password);

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

    public boolean newPlayer(String userName, String password, String firstName, String address) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false&serverTimezone=CST", "root", "Hello@123");
            if (connection.isClosed() != true) {

            }

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("INSERT into player(firstName, address, userName, password) values(?, ?, ?, ?)");

            st.setString(1, firstName);
            st.setString(2, address);
            st.setString(3, userName);
            st.setString(4, password);

            System.out.println(firstName);
            System.out.println(address);
            System.out.println(userName);
            System.out.println(password);

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

    public int studentId(String password, String userName) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false&serverTimezone=CST", "root", "Hello@123");
            if (connection.isClosed() != true) {

            }

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("Select sid from player where userName=? and password=?");

            st.setString(1, userName);
            st.setString(2, password);

            ResultSet rs = st.executeQuery();
            rs.next();
            int sid = rs.getInt("sid");

            System.out.println("when found sid" + sid);

            return sid;

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

    public int findTID(int sid) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false&serverTimezone=CST", "root", "Hello@123");
            if (connection.isClosed() != true) {

            }

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("SELECT tid from teamStudentInfo where sid = ?");

            st.setInt(1, sid);

            ResultSet rs = st.executeQuery();
            rs.next();
            int tid = rs.getInt("tid");

            return tid;

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

    public String messageAnnouncement(int sid) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false&serverTimezone=CST", "root", "Hello@123");
            if (connection.isClosed() != true) {

            }
            String x = "";

            ArrayList<Integer> teamID = getTeams(sid);

            for (int i = 0; i < teamID.size(); i++) {
                PreparedStatement st = (PreparedStatement) connection.prepareStatement("SELECT teamAnnouncementscol from teamAnnouncements where tid = ? ORDER BY dateOfAnnouncement DESC;");

                st.setInt(1, teamID.get(i));

                ResultSet rs = st.executeQuery();
                if (rs.next() == false) {

                    x = x;

                } else {
                    String teamAnnouncement = rs.getString("teamAnnouncementscol");
                    x = x + "\n " + teamAnnouncement;

                }

            }
            return x;

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

    public ArrayList<Integer> getTeams(int sid) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false&serverTimezone=CST", "root", "Hello@123");
            if (connection.isClosed() != true) {

            }

            ArrayList<Integer> teamID = new ArrayList<Integer>();

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("select tid from basketball.teamStudentInfo where sid = ?");

            st.setInt(1, sid);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                teamID.add(rs.getInt("tid"));

            }
            return teamID;

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
