/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.TeamCoachInfoDAO;
import Model.TeamDAO;
import View.CoachHome;
import View.CoachHome;
import View.CoachTeams;
import View.CreateNewTeam;
import View.Homework;
import View.SignIn;
import View.Team;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author HiyaSharma
 */
public class TeamController {

    private Team teamView;
    private CoachHome coachHomeView;
    private int cid;
    private int tid;
    private TeamDAO teamDAO;

    public TeamController(CoachHome coachHomeView1, int cid1) {

        teamView = new Team();
        coachHomeView = coachHomeView1;
        teamDAO = new TeamDAO();
        cid = cid1;
        tid = teamDAO.getTid(cid);

        JLabel teamWins = teamView.getTeamWinsLabel();
        teamWins.setText(teamDAO.teamWins(tid) + "");

        JLabel teamLoss = teamView.getTeamLossesLabel();
        teamLoss.setText(teamDAO.teamLosses(tid) + "");

        JLabel ageG = teamView.getAgeGroupLabel();
        ageG.setText(teamDAO.ageGroup(tid) + "");

        JLabel teamCode = teamView.getTeamCodeLabel();
        teamCode.setText(tid + "");

        updatePlayerNames();
        updatePCoachNames();

    }

    

    public void startApp() {

        teamView.setVisible(true);

    }

    public void updatePlayerNames() {
        ArrayList<String> playersNames = teamDAO.getPlayers(tid);
        JLabel arr[] = {teamView.getPlayer1label(), teamView.getPlayer2Label(), teamView.getPlayer3Label(), teamView.getPlayer4Label(), teamView.getPlayer5Label(), teamView.getPlayer6Label(), teamView.getPlayer7Label(), teamView.getPlayer8Label(), teamView.getPlayer9Label(), teamView.getPlayer10Label()};

        for (int i = 0; i < playersNames.size(); i++) {

            arr[i].setText(playersNames.get(i));
        }
        for (int j = playersNames.size(); j < arr.length; j++) {
            arr[j].setText("");
        }
    }

    public void updatePCoachNames() {
        ArrayList<String> coachNames = teamDAO.getCoaches(tid);
        JLabel arr1[] = {teamView.getCoach1Label(), teamView.getCoach2Label(), teamView.getCoach3Label(), teamView.getCoach4Label()};

        for (int i = 0; i < coachNames.size(); i++) {

            arr1[i].setText(coachNames.get(i));

        }
        for (int j = coachNames.size(); j < arr1.length; j++) {
            arr1[j].setText("");

        }
    }
}
