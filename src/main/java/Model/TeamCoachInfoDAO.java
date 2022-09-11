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

/**
 *
 * @author rajasharma
 */
public class TeamCoachInfoDAO {

    public void coachUpdated(int tid, int cid) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false&serverTimezone=CST", "root", "Hello@123");
            if (connection.isClosed() != true) {

            }
            PreparedStatement st2 = (PreparedStatement) connection.prepareStatement("INSERT into teamCoachInfo(tid, cid) values(?, ?)");

            st2.setInt(1, tid);
            st2.setInt(2, cid);

            st2.executeUpdate();

            System.out.println(cid);

        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            return;
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
                return;
            }

        }

    }

    public ArrayList<String> coachTeam(int cid) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false&serverTimezone=CST", "root", "Hello@123");
            if (connection.isClosed() != true) {

            }

            ArrayList<Integer> arrayl = new ArrayList<Integer>();

            PreparedStatement st1 = (PreparedStatement) connection.prepareStatement("Select tid from teamCoachInfo where cid = ?");

            st1.setInt(1, cid);
            ResultSet tid1 = st1.executeQuery();

            while (tid1.next()) {
                arrayl.add(tid1.getInt("tid"));
            }

            ArrayList<String> stringarr = new ArrayList<String>();

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("Select teamName from teamInfo where tid = ?");
            for (int i = 0; i < arrayl.size(); i++) {
                st.setInt(1, arrayl.get(i));
                ResultSet teamN = st.executeQuery();
                teamN.next();
                String teamName = teamN.getString("teamName");
                stringarr.add(teamName);
            }

            return (stringarr);

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

}
