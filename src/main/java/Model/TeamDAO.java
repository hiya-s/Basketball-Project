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
public class TeamDAO {

    public int teamCreatedId(String teamName, int tWin, int tLoss, String ageG) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false&serverTimezone=CST", "root", "Hello@123");
            if (connection.isClosed() != true) {
                System.out.println("SuccessinTeam");
            }

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("INSERT into teamInfo(teamName,tWin, tLoss, ageG) values(?, ?, ?, ?)");
            st.setString(1, teamName);
            st.setInt(2, tWin);
            st.setInt(3, tLoss);
            st.setString(4, ageG);

            System.out.println(teamName);
            System.out.println(tWin);
            System.out.println(tLoss);
            System.out.println(ageG);

            st.executeUpdate();

            PreparedStatement st1 = (PreparedStatement) connection.prepareStatement("Select tid from teamInfo where teamName=? and tWin= ? and tLoss = ? and ageG = ?");

            st1.setString(1, teamName);
            st1.setInt(2, tWin);
            st1.setInt(3, tLoss);
            st1.setString(4, ageG);

            ResultSet tid1 = st1.executeQuery();
            tid1.next();
            int tidActual11 = tid1.getInt("tid");
            System.out.println(tidActual11);

            return (tidActual11);

        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        } /*try{
        PreparedStatement st1 = (PreparedStatement) connection.prepareStatement("Select tid from coach where teamName=? , tWin= ? , tLoss = ?, ageG = ?");
        
        st1.setString(1, teamName);
        st1.setInt(2, tWin);
        st1.setInt(3, tLoss);
        st1.setString(4, ageG);
        
        
        ResultSet tid1 = st1.executeQuery();
        int tid11 = tid1.getInt("tid");
        return tid11;
        
        }*/ finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
                return -1;
            }

        }

    }

    public int teamWins(int tid) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false&serverTimezone=CST", "root", "Hello@123");
            if (connection.isClosed() != true) {

            }

            PreparedStatement st1 = (PreparedStatement) connection.prepareStatement("Select tWin from teamInfo where tid = ?");

            st1.setInt(1, tid);
            ResultSet tWin1 = st1.executeQuery();
            tWin1.next();
            int tWin = tWin1.getInt("tWin");
            System.out.println("Win");
            System.out.println(tWin);

            return (tWin);

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

    public int teamLosses(int tid) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false&serverTimezone=CST", "root", "Hello@123");
            if (connection.isClosed() != true) {

            }

            PreparedStatement st1 = (PreparedStatement) connection.prepareStatement("Select tLoss from teamInfo where tid = ?");

            st1.setInt(1, tid);
            ResultSet tLoss1 = st1.executeQuery();
            tLoss1.next();
            int tLoss = tLoss1.getInt("tLoss");
            System.out.println("loss");
            System.out.println(tLoss);

            return (tLoss);

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

    public int ageGroup(int tid) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false&serverTimezone=CST", "root", "Hello@123");
            if (connection.isClosed() != true) {
                System.out.println("Success1");
            }

            PreparedStatement st1 = (PreparedStatement) connection.prepareStatement("Select ageG from teamInfo where tid = ?");

            st1.setInt(1, tid);
            ResultSet ageG1 = st1.executeQuery();
            ageG1.next();
            int ageG = ageG1.getInt("ageG");
            System.out.println("age");
            System.out.println(ageG);

            return (ageG);

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

    public int getTid(int cid) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false&serverTimezone=CST", "root", "Hello@123");
            if (connection.isClosed() != true) {
                System.out.println("SuccessinTeam");
            }

            PreparedStatement st1 = (PreparedStatement) connection.prepareStatement("Select tid from teamCoachInfo where cid = ?");

            st1.setInt(1, cid);
            ResultSet tid1 = st1.executeQuery();
            tid1.next();
            int tid = tid1.getInt("tid");
            System.out.println("tid");
            System.out.println(tid);

            return (tid);

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

    public ArrayList<String> getPlayers(int tid) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false&serverTimezone=CST", "root", "Hello@123");
            if (connection.isClosed() != true) {
                System.out.println("SuccessinTeam");
            }

            PreparedStatement st1 = (PreparedStatement) connection.prepareStatement("select firstName from player p, teamStudentInfo t where tid= ? and t.sid = p.sid");

            st1.setInt(1, tid);
            ResultSet name = st1.executeQuery();

            ArrayList<String> names = new ArrayList<String>();
            while (name.next()) {
                String firstName = name.getString("firstName");
                System.out.println(firstName);
                names.add(firstName);
            }

            return names;

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

    public ArrayList<String> getCoaches(int tid) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false&serverTimezone=CST", "root", "Hello@123");
            if (connection.isClosed() != true) {
                System.out.println("SuccessinTeam");
            }

            PreparedStatement st1 = (PreparedStatement) connection.prepareStatement("select firstName from coach c, teamCoachInfo t where tid= ? and t.cid = c.cid");

            st1.setInt(1, tid);
            ResultSet name = st1.executeQuery();

            ArrayList<String> names = new ArrayList<String>();
            while (name.next()) {
                String firstName = name.getString("firstName");
                System.out.println(firstName);
                names.add(firstName);
            }

            return names;

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

    public ArrayList<Integer> getPlayerSID(int tid) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball?useSSL=false&serverTimezone=CST", "root", "Hello@123");
            if (connection.isClosed() != true) {
                System.out.println("SuccessinTeam");
            }

            PreparedStatement st1 = (PreparedStatement) connection.prepareStatement("Select p.sid from player p, teamStudentInfo t where tid= ? and t.sid = p.sid");

            st1.setInt(1, tid);
            ResultSet name = st1.executeQuery();

            ArrayList<Integer> namesSID = new ArrayList<Integer>();
            while (name.next()) {
                int sid = name.getInt("sid");
                System.out.println(sid);
                namesSID.add(sid);
            }

            return namesSID;

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
