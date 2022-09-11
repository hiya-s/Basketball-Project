/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.GamePlayerDAO;
import Model.PlayerDAO;
import View.AverageGame;
import View.Homework;
import View.JoinTeam;
import View.StudentNotesFromCoach;
import View.Plays;
import View.RecentGame;
import View.StudentHome;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author rajasharma
 */
public class StudentRecentGameController {

    private StudentHome studentHomeView;
    private RecentGame recentGameView;
    private int sid;
    private GamePlayerDAO gamePlayerDAO;
    private PlayerDAO playerDAO;
    private int tid;
    private int gid;

    StudentRecentGameController(StudentHome studentHomeView1, int sid1) {
        studentHomeView = studentHomeView1;
        sid = sid1;
        recentGameView = new RecentGame();

        gamePlayerDAO = new GamePlayerDAO();
        playerDAO = new PlayerDAO();
        tid = playerDAO.findTID(sid);

        System.out.println(tid + "tid nooooow");
        System.out.println(sid + "sid");
        gid = gamePlayerDAO.getGameIdSID(sid, tid);
    }

    public void startApp() {

        int numFouls = gamePlayerDAO.getFouls(tid, sid);
        int numPoints1 = gamePlayerDAO.getNumPoints1(tid, sid);
        int numPoints2 = gamePlayerDAO.getNumPoints2(tid, sid);
        int numPoints3 = gamePlayerDAO.getNumPoints3(tid, sid);
        int numPoints4 = gamePlayerDAO.getNumPoints4(tid, sid);

        JLabel fouls = recentGameView.getNumOfFOulsPLabel();
        JLabel firstQuarter = recentGameView.getNumOfPointsPLabel();
        JLabel secondQuarter = recentGameView.getNumOfPointsP2Label();
        JLabel thirdQuarter = recentGameView.getNumOfPointsP3Label();
        JLabel forthQuarter = recentGameView.getNumOfPointsP4Label();

        fouls.setText(numFouls + "");
        firstQuarter.setText(numPoints1 + "");
        secondQuarter.setText(numPoints2 + "");
        thirdQuarter.setText(numPoints3 + "");
        forthQuarter.setText(numPoints4 + "");

        ArrayList<Integer> teamID = playerDAO.getTeams(sid);

        JLabel announcement = studentHomeView.getjLabel1();
        announcement.setText(playerDAO.messageAnnouncement(sid));
        averageUpdate();

        recentGameView.setVisible(true);

    }

    public void averageUpdate() {
        double numFouls = gamePlayerDAO.averageFouls(gid, tid);
        double numPoints1 = gamePlayerDAO.averagefirstq(gid, tid);
        double numPoints2 = gamePlayerDAO.averagesecondq(gid, tid);
        double numPoints3 = gamePlayerDAO.averageThirdQ(gid, tid);
        double numPoints4 = gamePlayerDAO.averageFourthQ(gid, tid);

        JLabel fouls = recentGameView.getNumOfFOulsALabel();
        JLabel firstQuarter = recentGameView.getNumOfPointsALabel();
        JLabel secondQuarter = recentGameView.getNumOfPointsA2Label();
        JLabel thirdQuarter = recentGameView.getNumOfPointsA3Label();
        JLabel forthQuarter = recentGameView.getNumOfPointsA4Label();

        fouls.setText(numFouls + "");
        firstQuarter.setText(numPoints1 + "");
        secondQuarter.setText(numPoints2 + "");
        thirdQuarter.setText(numPoints3 + "");
        forthQuarter.setText(numPoints4 + "");

    }

}
