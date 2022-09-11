/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.GameDAO;
import Model.TeamDAO;
import View.CoachHome;
import View.CoachNewGameInformation;
import View.CoachTeams;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author rajasharma
 */
public class CoachGameInformationController {

    private CoachNewGameInformation coachNewGameInformationView;
    private CoachHome coachHomeView;
    private int cid;

    CoachGameInformationController(CoachHome coachHomeView1, int c) {
        coachHomeView = coachHomeView1;
        cid = c;
        coachNewGameInformationView = new CoachNewGameInformation();

        JButton teamSelectedButton = coachNewGameInformationView.getjButton1();
        teamSelectedButton.addActionListener(e -> teamSelectedButtonActionListener(coachHomeView, cid));
    }

    public void startApp() {
        coachNewGameInformationView.setVisible(true);

    }

    private void teamSelectedButtonActionListener(CoachHome coachHomeView, int cid) {

        JTextField team1Score = coachNewGameInformationView.getTeamScoreTextField();
        int t1Score = Integer.parseInt(team1Score.getText());
        JTextField team2Score = coachNewGameInformationView.getTeam2ScoreTextField();
        int t2Score = Integer.parseInt(team2Score.getText());

        GameDAO gameDAO = new GameDAO();
        TeamDAO teamDAO = new TeamDAO();
        int tid = teamDAO.getTid(cid);
        gameDAO.newGame(t1Score, t2Score, tid);
        System.out.println("heyyo");
        int gid = gameDAO.gameId(t1Score, t2Score, tid);
        System.out.println(gid + "printed gid");
        coachNewGameInformationView.setVisible(false);
        CoachRecentGameController teamController = new CoachRecentGameController(coachHomeView, cid, gid, tid);
        teamController.startApp();

    }
}
