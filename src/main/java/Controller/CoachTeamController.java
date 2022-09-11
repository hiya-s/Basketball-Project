/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.TeamCoachInfoDAO;
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
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author rajasharma
 */
public class CoachTeamController {

    private CoachTeams coachTeamView;
    private CoachHome coachHomeView;
    private int cid;

    public CoachTeamController(CoachHome coachHomeView1, int cid1) {
        coachHomeView = coachHomeView1;
        cid = cid1;
        coachTeamView = new CoachTeams();

        JButton teamSelectedButton = coachTeamView.getTeamSelectedButton();
        teamSelectedButton.addActionListener(e -> teamSelectedButtonActionListener(coachHomeView, cid));

    }

    public void startApp() {
        TeamCoachInfoDAO coachTeamDAO = new TeamCoachInfoDAO();
        ArrayList<String> x = coachTeamDAO.coachTeam(cid);
        for (int i = 0; i < x.size(); i++) {
            coachTeamView.getTeamSelectorComboBox().addItem(x.get(i));
        }
        coachTeamView.setVisible(true);

    }

    private void teamSelectedButtonActionListener(CoachHome coachHomeView1, int cid1) {
        coachTeamView.setVisible(false);
        TeamController teamController = new TeamController(coachHomeView1, cid1);
        teamController.startApp();

    }

}
