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
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rajasharma
 */
public class GamePlayerDAO {

    /**
     * @param args the command line arguments
     */
   

    public boolean newGame(int fouls, int tid, int cid, int jerseyNum, int gid, int firstq, int secondq, int thirdq, int fourthq, int sid) {
        Connection connection = null;
        try {
               connection = DriverManager.getConnection("jdbc:mysql://basketballa.cd1xsqsl0lfq.us-east-1.rds.amazonaws.com/basketball", "root", "root1234");
            if (connection.isClosed() != true) {

            }

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("INSERT into gamePlayer(fouls, tid, cid, jerseyNum, gid, firstQ, secondQ, thirdq, fourthq, sid, gameDate) values(?, ?, ?, ? , ? , ? , ? , ? ,?, ?, ?)");
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss:SSS");
            Calendar cal = Calendar.getInstance();
            java.sql.Timestamp timestamp = new java.sql.Timestamp(cal.getTimeInMillis());
            st.setInt(1, fouls);
            st.setInt(2, tid);
            st.setInt(3, cid);
            st.setInt(4, jerseyNum);
            st.setInt(5, gid);
            st.setInt(6, firstq);
            st.setInt(7, secondq);
            st.setInt(8, thirdq);
            st.setInt(9, fourthq);
            st.setInt(10, sid);
            st.setTimestamp(11, timestamp);

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

    public int getFouls(int tid, int sid) {
        Connection connection = null;
        try {
               connection = DriverManager.getConnection("jdbc:mysql://basketballa.cd1xsqsl0lfq.us-east-1.rds.amazonaws.com/basketball", "root", "root1234");
            if (connection.isClosed() != true) {

            }

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("Select fouls from gamePlayer where tid=? and sid = ? ORDER BY gameDate DESC");
            //id = id++;
            //st.setInt(1,id);
            st.setInt(1, tid);
            st.setInt(2, sid);

            ResultSet rs = st.executeQuery();
            rs.next();
            int fouls = rs.getInt("fouls");

            return fouls;

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

    public int getNumPoints1(int tid, int sid) {
        Connection connection = null;
        try {
               connection = DriverManager.getConnection("jdbc:mysql://basketballa.cd1xsqsl0lfq.us-east-1.rds.amazonaws.com/basketball", "root", "root1234");
            if (connection.isClosed() != true) {

            }

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("Select firstq from gamePlayer where tid=? and sid = ? ORDER BY gameDate DESC");
            //id = id++;
            //st.setInt(1,id);
            st.setInt(1, tid);
            st.setInt(2, sid);

            ResultSet rs = st.executeQuery();
            rs.next();
            int firstq = rs.getInt("firstq");

            return firstq;

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

    public int getNumPoints2(int tid, int sid) {
        Connection connection = null;
        try {
               connection = DriverManager.getConnection("jdbc:mysql://basketballa.cd1xsqsl0lfq.us-east-1.rds.amazonaws.com/basketball", "root", "root1234");
            if (connection.isClosed() != true) {

            }

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("Select secondq from gamePlayer where tid=? and sid = ? ORDER BY gameDate DESC");
            //id = id++;
            //st.setInt(1,id);
            st.setInt(1, tid);
            st.setInt(2, sid);

            ResultSet rs = st.executeQuery();
            rs.next();
            int secondq = rs.getInt("secondq");

            return secondq;

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

    public int getNumPoints3(int tid, int sid) {
        Connection connection = null;
        try {
              connection = DriverManager.getConnection("jdbc:mysql://basketballa.cd1xsqsl0lfq.us-east-1.rds.amazonaws.com/basketball", "root", "root1234");
            if (connection.isClosed() != true) {

            }

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("Select thirdq from gamePlayer where tid=? and sid = ? ORDER BY gameDate DESC");
            //id = id++;
            //st.setInt(1,id);
            st.setInt(1, tid);
            st.setInt(2, sid);

            ResultSet rs = st.executeQuery();
            rs.next();
            int thirdq = rs.getInt("thirdq");

            return thirdq;

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

    public int getNumPoints4(int tid, int sid) {
        Connection connection = null;
        try {
              connection = DriverManager.getConnection("jdbc:mysql://basketballa.cd1xsqsl0lfq.us-east-1.rds.amazonaws.com/basketball", "root", "root1234");
            if (connection.isClosed() != true) {

            }

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("Select fourthq from gamePlayer where tid=? and sid = ? ORDER BY gameDate DESC ");
            //id = id++;
            //st.setInt(1,id);
            st.setInt(1, tid);
            st.setInt(2, sid);

            ResultSet rs = st.executeQuery();
            rs.next();
            int fourthq = rs.getInt("fourthq");

            return fourthq;

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

    public double averageFouls(int gid, int tid) {
        Connection connection = null;
        try {
               connection = DriverManager.getConnection("jdbc:mysql://basketballa.cd1xsqsl0lfq.us-east-1.rds.amazonaws.com/basketball", "root", "root1234");
            if (connection.isClosed() != true) {

            }

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("Select fouls from gamePlayer where gid=? and tid=? ORDER BY gameDate DESC ");

            st.setInt(1, gid);
            st.setInt(2, tid);

            ResultSet rs = st.executeQuery();

            double sum = 0.0;
            int i = 0;
            while (rs.next()) {
                int fouls = rs.getInt("fouls");
                sum = fouls + sum;
                i++;
            }
            return ((double) sum / i);

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

    public double averagefirstq(int gid, int tid) {
        Connection connection = null;
        try {
               connection = DriverManager.getConnection("jdbc:mysql://basketballa.cd1xsqsl0lfq.us-east-1.rds.amazonaws.com/basketball", "root", "root1234");
               if (connection.isClosed() != true) {

            }

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("Select firstq from gamePlayer where gid=? and tid=? ORDER BY gameDate DESC");

            st.setInt(1, gid);
            st.setInt(2, tid);

            ResultSet rs = st.executeQuery();

            double sum = 0.0;
            int i = 0;
            while (rs.next()) {
                int firstq = rs.getInt("firstq");
                sum = firstq + sum;
                i++;
            }
            return ((double) sum / i);

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

    public double averagesecondq(int gid, int tid) {
        Connection connection = null;
        try {
               connection = DriverManager.getConnection("jdbc:mysql://basketballa.cd1xsqsl0lfq.us-east-1.rds.amazonaws.com/basketball", "root", "root1234");
            if (connection.isClosed() != true) {

            }

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("Select secondq from gamePlayer where gid=? and tid=? ORDER BY gameDate DESC ");

            st.setInt(1, gid);
            st.setInt(2, tid);

            ResultSet rs = st.executeQuery();

            double sum = 0.0;
            int i = 0;
            while (rs.next()) {
                int secondq = rs.getInt("secondq");
                sum = secondq + sum;
                i++;
            }
            return ((double) sum / i);

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

    public double averageThirdQ(int gid, int tid) {
        Connection connection = null;
        try {
               connection = DriverManager.getConnection("jdbc:mysql://basketballa.cd1xsqsl0lfq.us-east-1.rds.amazonaws.com/basketball", "root", "root1234");
               if (connection.isClosed() != true) {

            }

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("Select thirdq from gamePlayer where gid=? and tid=?  ORDER BY gameDate DESC ");

            st.setInt(1, gid);
            st.setInt(2, tid);

            ResultSet rs = st.executeQuery();

            double sum = 0.0;
            int i = 0;
            while (rs.next()) {
                int thirdq = rs.getInt("thirdq");
                sum = thirdq + sum;
                i++;
            }
            return ((double) sum / i);

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

    public double averageFourthQ(int gid, int tid) {
        Connection connection = null;
        try {
             connection = DriverManager.getConnection("jdbc:mysql://basketballa.cd1xsqsl0lfq.us-east-1.rds.amazonaws.com/basketball", "root", "root1234");
            if (connection.isClosed() != true) {

            }

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("Select fourthq from gamePlayer where gid=? and tid=?  ORDER BY gameDate DESC ");

            st.setInt(1, gid);
            st.setInt(2, tid);

            ResultSet rs = st.executeQuery();

            double sum = 0.0;
            int i = 0;
            while (rs.next()) {
                int fourthq = rs.getInt("fourthq");
                sum = fourthq + sum;
                i++;
            }
            return ((double) sum / i);

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

    public int getGameIdSID(int sid, int tid) {
        Connection connection = null;
        try {
              connection = DriverManager.getConnection("jdbc:mysql://basketballa.cd1xsqsl0lfq.us-east-1.rds.amazonaws.com/basketball", "root", "root1234");
            if (connection.isClosed() != true) {

            }

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("Select gid from gamePlayer where tid = ? and sid = ? ORDER BY gameDate DESC  ");

            st.setInt(1, tid);
            st.setInt(2, sid);

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
