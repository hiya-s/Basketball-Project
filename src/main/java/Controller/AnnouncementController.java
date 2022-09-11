/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.TeamAnnouncementsDAO;
import Model.TeamCoachInfoDAO;
import View.CoachAnnouncements;
import View.CoachHome;
import View.CreateNewTeam;
import javax.swing.JButton;

/**
 *
 * @author rajasharma
 */
public class AnnouncementController {

    private CoachAnnouncements coachAnnouncementsView;
    private CoachHome coachHomeView;
    private int cid;

    public AnnouncementController(CoachHome coachHomeC, int c) {

        coachAnnouncementsView = new CoachAnnouncements();
        coachHomeView = coachHomeC;
        cid = c;

        JButton publishButton = coachAnnouncementsView.getPublishMessageButton();
        publishButton.addActionListener(e -> publishButtonListener(coachHomeView, cid));

    }

    public void startApp() {

        TeamAnnouncementsDAO tADAO = new TeamAnnouncementsDAO();

        coachAnnouncementsView.getTeamSelectorComboBox().addItem(tADAO.coachTeam(cid));
        coachAnnouncementsView.setVisible(true);

    }

   
    private void publishButtonListener(CoachHome coachHomeView1, int cid) {
        String str;
        str = coachAnnouncementsView.getTeamSelectorComboBox().getSelectedItem().toString();

        TeamAnnouncementsDAO tADAO = new TeamAnnouncementsDAO();

        AnnouncementPublishController announcementC = new AnnouncementPublishController(coachHomeView, cid, tADAO.getTID(cid), str);
        coachAnnouncementsView.setVisible(false);
        announcementC.startApp();

    }
}
