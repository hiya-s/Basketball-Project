/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.PlayerDAO;
import View.AverageGame;
import View.Homework;
import View.JoinTeam;
import View.StudentNotesFromCoach;
import View.Plays;
import View.RecentGame;
import View.StudentHome;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author rajasharma
 */
public class StudentHomeController {

    private StudentHome studentHomeView;
    private Homework homeworkView;
    private RecentGame recentGameView;
    private Plays playsView;
    private PlayerDAO playerDAO;
    private StudentNotesFromCoach notesFromCoachView;
    private AverageGame averageGameView;
    private JoinTeam joinTeamView;
    private JoinTeamController joinTeamController;
    private int sid;
    private String password;
    private String username;

    public StudentHomeController(int sid1, String pw, String u) {

        sid = sid1;
        studentHomeView = new StudentHome();
        homeworkView = new Homework();
        recentGameView = new RecentGame();
        playsView = new Plays();
        notesFromCoachView = new StudentNotesFromCoach();
        averageGameView = new AverageGame();
        joinTeamView = new JoinTeam();
        joinTeamController = new JoinTeamController(sid, studentHomeView);
        playerDAO = new PlayerDAO();
        password = pw;
        username = u;

        JButton recentGameButton = studentHomeView.getRecentGameB();
        recentGameButton.addActionListener(e -> recentGameListener());

        JButton homeworkButton = studentHomeView.getHomeworkB();
        homeworkButton.addActionListener(e -> homeworkListener());

        JButton playButton = studentHomeView.getPlayB();
        playButton.addActionListener(e -> playListener());

        JButton notesFromCoachButton = studentHomeView.getNotesFromCoachB();
        notesFromCoachButton.addActionListener(e -> notesFromCoachListener());

        JButton averageGameButton = studentHomeView.getAverageGameB();
        averageGameButton.addActionListener(e -> averageGameListener());

        JButton joinTeamButton = studentHomeView.getJoinTeam();
        joinTeamButton.addActionListener(e -> joinTeamButtonListener(sid));

    }

    public void startApp() {

        int sid = playerDAO.studentId(password, username);
        System.out.println(sid);

        ArrayList<Integer> teamID = playerDAO.getTeams(sid);

        JLabel announcement = studentHomeView.getjLabel1();
        announcement.setText(playerDAO.messageAnnouncement(sid));
        System.out.println("went after setting text");
        studentHomeView.setVisible(true);

    }

    public void homeworkListener() {
        studentHomeView.setVisible(false);
        homeworkView.setVisible(true);
    }

    public void recentGameListener() {
        studentHomeView.setVisible(false);
        StudentRecentGameController studentRecentGameController = new StudentRecentGameController(studentHomeView, sid);
        studentRecentGameController.startApp();

    }

    public void playListener() {
        studentHomeView.setVisible(false);
        playsView.setVisible(true);
    }

    public void notesFromCoachListener() {
        studentHomeView.setVisible(false);
        StudentNotesFromCoachController stCoach = new StudentNotesFromCoachController(studentHomeView, sid);
        stCoach.startApp();
        System.out.println("went to the notes fromCoachListener");
      
    }

    public void averageGameListener() {
        studentHomeView.setVisible(false);
        averageGameView.setVisible(true);
    }

    private void joinTeamButtonListener(int sid) {
        studentHomeView.setVisible(false);
        joinTeamView.setVisible(true);
        joinTeamController.startApp();

    }
}
