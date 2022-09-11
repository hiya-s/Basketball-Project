/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.AverageGame;
import View.CoachHome;
import View.CoachTeams;
import View.CreateNewTeam;
import View.Homework;
import View.JoinTeam;
import View.StudentNotesFromCoach;
import View.Plays;
import View.RecentGame;
import View.SignIn;
import View.StudentHome;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class CoachHomeController {

    private CoachHome coachHomeView;
    private int cid;

    public CoachHomeController(int cid1) {
        coachHomeView = new CoachHome();
        cid = cid1;

        JButton timeScheduleButton = coachHomeView.getTimeSchedule();
        timeScheduleButton.addActionListener(e -> coachHomeViewActionListener());

        JButton createNewTeamButton = coachHomeView.getjButton1();
        createNewTeamButton.addActionListener(e -> createTeamsListener(cid));

        JButton teamsButton = coachHomeView.getTeamsButton();
        teamsButton.addActionListener(e -> teamsButtonListener(cid));

        JButton newTeamButton = coachHomeView.getNewGameButton();
        newTeamButton.addActionListener(e -> newTeamsButtonListener(cid));

        JButton announcementButton = coachHomeView.getAnnouncementsButton();
        announcementButton.addActionListener(e -> getAnnouncementsButtonListener(coachHomeView, cid));
        System.out.println("cid : CoachHomeController" + cid);

        JButton notesForPlayerButton = coachHomeView.getNotesForPlayerButton();
        notesForPlayerButton.addActionListener(e -> getNotesForPlayerButtonListener(coachHomeView, cid));

    }

    public void startApp() {
        coachHomeView.setVisible(true);

    }

    private void coachHomeViewActionListener() {

    }

    private void createTeamsListener(int c) {
        NewTeamController teamC = new NewTeamController(coachHomeView, cid);
        coachHomeView.setVisible(false);
        teamC.startApp();

//To change body of generated methods, choose Tools | Templates.
    }

    private void teamsButtonListener(int cid) {
        CoachTeamController teamC = new CoachTeamController(coachHomeView, cid);
        coachHomeView.setVisible(false);
        teamC.startApp();
    }

    private void getAnnouncementsButtonListener(CoachHome coachHomeView1, int cid) {
        AnnouncementController announcementC = new AnnouncementController(coachHomeView, cid);
        System.out.println("cid : CoachHomeController in method" + cid);
        coachHomeView.setVisible(false);
        announcementC.startApp();

    }

    private void newTeamsButtonListener(int cid) {
        CoachTeamSelectNewTeam teamC = new CoachTeamSelectNewTeam(coachHomeView, cid);
        coachHomeView.setVisible(false);
        teamC.startApp();
    }

    private void getNotesForPlayerButtonListener(CoachHome coachHomeView, int cid) {
        CoachTeamSelectorNotesForPlayerController tc = new CoachTeamSelectorNotesForPlayerController(coachHomeView, cid);
        coachHomeView.setVisible(false);
        tc.startApp();
    }
}
