/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.NotesDAO;
import Model.TeamDAO;
import View.CoachHome;
import View.CoachNotesForPlayer;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author rajasharma
 */
public class CoachNotesForPlayerController {

    private CoachHome coachHomeView;
    private int cid;
    private int tid;
    private int gid;
    private TeamDAO teamDAO;
    private CoachNotesForPlayer coachNotesForPlayerView;
    private NotesDAO notesDAO;

    CoachNotesForPlayerController(CoachHome coachHomeView1, int cid1, int t) {
        coachNotesForPlayerView = new CoachNotesForPlayer();
        coachHomeView = coachHomeView1;
        cid = cid1;
        tid = t;
        notesDAO = new NotesDAO();
        teamDAO = new TeamDAO();
        updatePlayerNames();

        JButton enterNewGameInfoButtonpA = coachNotesForPlayerView.getUpdateAll();
        enterNewGameInfoButtonpA.addActionListener(e -> coachNotesForPlayerViewListenerAll(coachHomeView, cid));

    }

    public void startApp() {

        coachNotesForPlayerView.setVisible(true);
    }

    public void updatePlayerNames() {

        ArrayList<String> playersNames = teamDAO.getPlayers(tid);
        System.out.println(playersNames);
        JLabel playerName[] = {coachNotesForPlayerView.getPlayer1Label(), coachNotesForPlayerView.getPlayer2Label(), coachNotesForPlayerView.getPlayer3Label(), coachNotesForPlayerView.getPlayer4Label(), coachNotesForPlayerView.getPlayer5Label(), coachNotesForPlayerView.getPlayer6Label(), coachNotesForPlayerView.getPlayer7Label(), coachNotesForPlayerView.getPlayer8Label(), coachNotesForPlayerView.getPlayer9Label(), coachNotesForPlayerView.getPlayer10Label()};
        JTextField notes[] = {coachNotesForPlayerView.getP1FirstTextField(), coachNotesForPlayerView.getP2FirstTextField(), coachNotesForPlayerView.getP3FirstTextField(), coachNotesForPlayerView.getP4FirstTextField(), coachNotesForPlayerView.getP5FirstTextField(), coachNotesForPlayerView.getP6FirstTextField(), coachNotesForPlayerView.getP7FirstTextField(), coachNotesForPlayerView.getP7FirstTextField(), coachNotesForPlayerView.getP8FirstTextField(), coachNotesForPlayerView.getP9FirstTextField(), coachNotesForPlayerView.getP10FirstTextField()};

        for (int i = 0; i < playersNames.size(); i++) {

            playerName[i].setText(playersNames.get(i));
        }
        for (int j = playersNames.size(); j < playerName.length; j++) {
            playerName[j].setText("");
            //jerseyNum[j].setVisible(false);
            //fouls[j].setVisible(false);
            //firstQuarter[j].setVisible(false);
            //secondQuarter[j].setVisible(false);
            //thirdQuarter[j].setVisible(false);
            //forthQuarter[j].setVisible(false);

            notes[j].setEnabled(false);
        }
    }

    private void coachNotesForPlayerViewListenerAll(CoachHome coachHomeView, int cid) {
        JLabel playerName[] = {coachNotesForPlayerView.getPlayer1Label(), coachNotesForPlayerView.getPlayer2Label(), coachNotesForPlayerView.getPlayer3Label(), coachNotesForPlayerView.getPlayer4Label(), coachNotesForPlayerView.getPlayer5Label(), coachNotesForPlayerView.getPlayer6Label(), coachNotesForPlayerView.getPlayer7Label(), coachNotesForPlayerView.getPlayer8Label(), coachNotesForPlayerView.getPlayer9Label(), coachNotesForPlayerView.getPlayer10Label()};
        JTextField notes[] = {coachNotesForPlayerView.getP1FirstTextField(), coachNotesForPlayerView.getP2FirstTextField(), coachNotesForPlayerView.getP3FirstTextField(), coachNotesForPlayerView.getP4FirstTextField(), coachNotesForPlayerView.getP5FirstTextField(), coachNotesForPlayerView.getP6FirstTextField(), coachNotesForPlayerView.getP7FirstTextField(), coachNotesForPlayerView.getP7FirstTextField(), coachNotesForPlayerView.getP8FirstTextField(), coachNotesForPlayerView.getP9FirstTextField(), coachNotesForPlayerView.getP10FirstTextField()};
        ArrayList<Integer> sidPlayers = teamDAO.getPlayerSID(tid);
        for (int i = 0; i < sidPlayers.size(); i++) {
            if (!notes[i].getText().equals("")) {

                notesDAO.newNotes(notes[i].getText(), sidPlayers.get(i), cid);
            }
        }
    }

}
