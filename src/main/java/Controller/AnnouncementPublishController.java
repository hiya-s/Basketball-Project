/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.TeamAnnouncementsDAO;
import View.CoachAnnouncements;
import View.CoachAnnouncementsPublishing;
import View.CoachHome;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author rajasharma
 */
public class AnnouncementPublishController {

    private CoachAnnouncementsPublishing coachAnnouncementsPublishingView;
    private CoachAnnouncements coachAnnouncementsView;
    private CoachHome coachHomeView;
    private int cid;
    private int tid;
    private String teamName;

    public AnnouncementPublishController(CoachHome cHomeView, int c, int t, String tName) {

        coachAnnouncementsPublishingView = new CoachAnnouncementsPublishing();
        coachHomeView = cHomeView;
        teamName = tName;
        cid = c;
        tid = t;

        JButton publishButton = coachAnnouncementsPublishingView.getPublishButton();
        publishButton.addActionListener(e -> publishButtonListener(coachHomeView, cid));

    }

  
    public void startApp() {
        JLabel teamLabel = coachAnnouncementsPublishingView.getSelectedTeamLabel();
        teamLabel.setText("Sending message to selected team : " + teamName);

        coachAnnouncementsPublishingView.setVisible(true);
    }

    private void publishButtonListener(CoachHome coachHomeView, int cid) {

        JTextArea announcementTextField = coachAnnouncementsPublishingView.getjTextArea1();
        String text = announcementTextField.getText();
        System.out.println(text);

        TeamAnnouncementsDAO dao = new TeamAnnouncementsDAO();
        dao.newAnnouncement(cid, dao.getTID(cid), text);

    }
}
