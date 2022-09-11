/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.TeamCoachInfoDAO;
import View.CoachHome;
import View.CoachTeamSelectNewGame;
import View.CoachTeams;
import java.util.ArrayList;
import javax.swing.JButton;

public class CoachTeamSelectNewTeam {

    private CoachTeamSelectNewGame coachTeamSelectNewGameView;
    private CoachHome coachHomeView;
    private int cid;

    public CoachTeamSelectNewTeam(CoachHome coachHomeView1, int cid1) {
        coachHomeView = coachHomeView1;
        cid = cid1;
        coachTeamSelectNewGameView = new CoachTeamSelectNewGame();

        JButton teamSelectedButton = coachTeamSelectNewGameView.getTeamSelectedButton();
        teamSelectedButton.addActionListener(e -> teamSelectedButtonActionListener(coachHomeView, cid));

    }

    public void startApp() {
        TeamCoachInfoDAO coachTeamDAO = new TeamCoachInfoDAO();
        ArrayList<String> x = coachTeamDAO.coachTeam(cid);
        for (int i = 0; i < x.size(); i++) {
            coachTeamSelectNewGameView.getTeamSelectorComboBox().addItem(x.get(i));
        }
        coachTeamSelectNewGameView.setVisible(true);

    }

    private void teamSelectedButtonActionListener(CoachHome coachHomeView1, int cid1) {
        coachTeamSelectNewGameView.setVisible(false);
        CoachGameInformationController teamController = new CoachGameInformationController(coachHomeView1, cid1);
        teamController.startApp();

    }
}

