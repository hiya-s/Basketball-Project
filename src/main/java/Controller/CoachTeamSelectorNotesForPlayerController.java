/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.TeamAnnouncementsDAO;
import Model.TeamCoachInfoDAO;
import View.CoachHome;
import View.CoachTeamSelecNotesForPlayer;
import View.CoachTeams;
import java.util.ArrayList;
import javax.swing.JButton;

public class CoachTeamSelectorNotesForPlayerController {

    private CoachTeamSelecNotesForPlayer coachTeamSelectorNotesForPlayerView;
    private CoachHome coachHomeView;
    private int cid;
    private int tid;

    public CoachTeamSelectorNotesForPlayerController(CoachHome coachHomeView1, int cid1) {
        coachHomeView = coachHomeView1;
        cid = cid1;
        coachTeamSelectorNotesForPlayerView = new CoachTeamSelecNotesForPlayer();

        JButton teamSelectedButton = coachTeamSelectorNotesForPlayerView.getTeamSelectedButton();
        teamSelectedButton.addActionListener(e -> teamSelectedButtonActionListener(coachHomeView, cid));

        TeamAnnouncementsDAO dao = new TeamAnnouncementsDAO();
        tid = dao.getTID(cid);

    }

    public void startApp() {
        TeamCoachInfoDAO coachTeamDAO = new TeamCoachInfoDAO();
        ArrayList<String> x = coachTeamDAO.coachTeam(cid);
        for (int i = 0; i < x.size(); i++) {
            coachTeamSelectorNotesForPlayerView.getTeamSelectorComboBox().addItem(x.get(i));
        }

        //String text = announcementTextField.getText();
        //System.out.println(text);
        //TeamAnnouncementsDAO dao = new TeamAnnouncementsDAO();
        // dao.newAnnouncement(cid, dao.getTID(cid), text);
        coachTeamSelectorNotesForPlayerView.setVisible(true);

    }

    private void teamSelectedButtonActionListener(CoachHome coachHomeView1, int cid1) {
        coachTeamSelectorNotesForPlayerView.setVisible(false);

        CoachNotesForPlayerController teamController = new CoachNotesForPlayerController(coachHomeView1, cid1, tid);
        teamController.startApp();

    }
}
