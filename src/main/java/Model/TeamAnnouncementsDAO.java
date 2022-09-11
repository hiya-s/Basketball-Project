/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.SignIn;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rajasharma
 */
public class TeamAnnouncementsDAO {

    

    public int getTID(int cid) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false&serverTimezone=CST", "root", "Hello@123");
            if (connection.isClosed() != true) {

            }

            PreparedStatement st1 = (PreparedStatement) connection.prepareStatement("Select tid from teamCoachInfo where cid = ?");

            st1.setInt(1, cid);
            ResultSet tid1 = st1.executeQuery();
            tid1.next();
            int tid = tid1.getInt("tid");

            return tid;
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
                return -1;
            }

        }

    }

    public String coachTeam(int cid) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false&serverTimezone=CST", "root", "Hello@123");
            if (connection.isClosed() != true) {

            }

            PreparedStatement st1 = (PreparedStatement) connection.prepareStatement("Select tid from teamCoachInfo where cid = ?");

            st1.setInt(1, cid);
            ResultSet tid1 = st1.executeQuery();
            tid1.next();
            int tid = tid1.getInt("tid");

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("Select teamName from teamInfo where tid = ?");

            st.setInt(1, tid);
            ResultSet teamN = st.executeQuery();
            teamN.next();
            String teamName = teamN.getString("teamName");

            return (teamName);

        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }

        }

    }

    public boolean newAnnouncement(int cid, int tid, String teamAnnouncements) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false&serverTimezone=CSTe", "root", "Hello@123");
            if (connection.isClosed() != true) {

            }

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("INSERT into teamAnnouncements(cid, tid, teamAnnouncementscol, dateOfAnnouncement) values(?, ?, ?, ?)");
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss:SSS");
            Calendar cal = Calendar.getInstance();
            java.sql.Timestamp timestamp = new java.sql.Timestamp(cal.getTimeInMillis());

            st.setInt(1, cid);
            st.setInt(2, tid);
            st.setString(3, teamAnnouncements);
            st.setTimestamp(4, timestamp);

            st.executeUpdate();

            System.out.println("Success");

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
