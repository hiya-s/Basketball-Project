/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.GamePlayerDAO;
import Model.TeamCoachInfoDAO;
import Model.TeamDAO;
import View.CoachHome;
import View.CoachRecentGame;
import View.RecentGame;
import View.CoachTeams;
import View.Team;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author rajasharma
 */
public class CoachRecentGameController {

    private CoachRecentGame coachRecentGView;
    private CoachHome coachHomeView;
    private int cid;
    private int tid;
    private int gid;
    private TeamDAO teamDAO;

    public CoachRecentGameController(CoachHome coachHomeView1, int cid1, int g, int t) {
        coachHomeView = coachHomeView1;
        cid = cid1;
        coachRecentGView = new CoachRecentGame();
        gid = g;

        teamDAO = new TeamDAO();

        tid = t;

        JButton enterNewGameInfoButton = coachRecentGView.getjButton1();
        enterNewGameInfoButton.addActionListener(e -> enterNewGameInfoButtonActionListener(coachHomeView, cid));

        updatePlayerNames();

    }

    public void startApp() {

        coachRecentGView.setVisible(true);

    }

    private void enterNewGameInfoButtonActionListener(CoachHome coachHomeView, int cid) {

        System.out.println("just in the enternewGame infor method");
        GamePlayerDAO gamePlayerDAO = new GamePlayerDAO();
        ArrayList<String> playersNames = teamDAO.getPlayers(tid);
        System.out.println(playersNames);
        JLabel playerName[] = {coachRecentGView.getPlayer1Label(), coachRecentGView.getPlayer2Label(), coachRecentGView.getPlayer3Label(), coachRecentGView.getPlayer4Label(), coachRecentGView.getPlayer5Label(), coachRecentGView.getPlayer6Label(), coachRecentGView.getPlayer7Label(), coachRecentGView.getPlayer8Label(), coachRecentGView.getPlayer9Label(), coachRecentGView.getPlayer10Label()};
        JTextField jerseyNum[] = {coachRecentGView.getPlayer1NumberTextField(), coachRecentGView.getPlayer2NumberTextField(), coachRecentGView.getPlayer3NumberTextField(), coachRecentGView.getPlayer4NumberTextField(), coachRecentGView.getPlayer5NumberTextField(), coachRecentGView.getPlayer6NumberTextField(), coachRecentGView.getPlayer7NumberTextField(), coachRecentGView.getPlayer8NumberTextField(), coachRecentGView.getPlayer9NumberTextField(), coachRecentGView.getPlayer10NumberTextField()};
        JComboBox fouls[] = {coachRecentGView.getP1FoulComboBox(), coachRecentGView.getP2FoulComboBox(), coachRecentGView.getP3FoulComboBox(), coachRecentGView.getP4FoulComboBox(), coachRecentGView.getP5FoulComboBox(), coachRecentGView.getP6FoulComboBox(), coachRecentGView.getP7FoulComboBox(), coachRecentGView.getP8FoulComboBox(), coachRecentGView.getP9FoulComboBox(), coachRecentGView.getP10FoulComboBox()};
        JTextField firstQuarter[] = {coachRecentGView.getP1FirstTextField(), coachRecentGView.getP2FirstTextField(), coachRecentGView.getP3FirstTextField(), coachRecentGView.getP4FirstTextField(), coachRecentGView.getP5FirstTextField(), coachRecentGView.getP6FirstTextField(), coachRecentGView.getP7FirstTextField(), coachRecentGView.getP7FirstTextField(), coachRecentGView.getP8FirstTextField(), coachRecentGView.getP9FirstTextField(), coachRecentGView.getP10FirstTextField()};
        JTextField secondQuarter[] = {coachRecentGView.getP1SecondTextField(), coachRecentGView.getP2SecondTextField(), coachRecentGView.getP3SecondTextField(), coachRecentGView.getP4SecondTextField(), coachRecentGView.getP5SecondTextField(), coachRecentGView.getP6SecondTextField(), coachRecentGView.getP7SecondTextField(), coachRecentGView.getP8SecondTextField(), coachRecentGView.getP9SecondTextField(), coachRecentGView.getP10SecondTextField()};
        JTextField thirdQuarter[] = {coachRecentGView.getP1ThirdTextField(), coachRecentGView.getP2ThirdTextField(), coachRecentGView.getP3ThirdTextField(), coachRecentGView.getP4ThirdTextField(), coachRecentGView.getP5ThirdTextField(), coachRecentGView.getP6ThirdTextField(), coachRecentGView.getP7ThirdTextField(), coachRecentGView.getP8ThirdTextField(), coachRecentGView.getP9ThirdTextField(), coachRecentGView.getP10ThirdTextField()};
        JTextField forthQuarter[] = {coachRecentGView.getP1ForthTextField(), coachRecentGView.getP2ForthTextField(), coachRecentGView.getP3ForthTextField(), coachRecentGView.getP4ForthTextField(), coachRecentGView.getP5ForthTextField(), coachRecentGView.getP6ForthTextField(), coachRecentGView.getP7ForthTextField(), coachRecentGView.getP8ForthTextField(), coachRecentGView.getP9ForthTextField(), coachRecentGView.getP10ForthTextField()};

        ArrayList<Integer> sidPlayers = teamDAO.getPlayerSID(tid);
        for (int i = 0; i < playersNames.size(); i++) {
            int foul = Integer.parseInt((String) fouls[i].getSelectedItem());
            System.out.println(fouls[i].getSelectedItem());
            int jerseynum = parseInt(jerseyNum[i].getText());
            int firstq = parseInt(firstQuarter[i].getText());
            int secondq = parseInt(secondQuarter[i].getText());
            int thirdq = parseInt(thirdQuarter[i].getText());
            int fourthq = parseInt(forthQuarter[i].getText());
            int sid = sidPlayers.get(i);
            gamePlayerDAO.newGame(foul, tid, cid, jerseynum, gid, firstq, secondq, thirdq, fourthq, sid);

        }

        JOptionPane.showMessageDialog(coachRecentGView, "New Game Registered");
        coachRecentGView.setVisible(false);
        coachHomeView.setVisible(true);

    }

    public void updatePlayerNames() {

        ArrayList<String> playersNames = teamDAO.getPlayers(tid);
        System.out.println(playersNames);
        JLabel playerName[] = {coachRecentGView.getPlayer1Label(), coachRecentGView.getPlayer2Label(), coachRecentGView.getPlayer3Label(), coachRecentGView.getPlayer4Label(), coachRecentGView.getPlayer5Label(), coachRecentGView.getPlayer6Label(), coachRecentGView.getPlayer7Label(), coachRecentGView.getPlayer8Label(), coachRecentGView.getPlayer9Label(), coachRecentGView.getPlayer10Label()};
        JTextField jerseyNum[] = {coachRecentGView.getPlayer1NumberTextField(), coachRecentGView.getPlayer2NumberTextField(), coachRecentGView.getPlayer3NumberTextField(), coachRecentGView.getPlayer4NumberTextField(), coachRecentGView.getPlayer5NumberTextField(), coachRecentGView.getPlayer6NumberTextField(), coachRecentGView.getPlayer7NumberTextField(), coachRecentGView.getPlayer8NumberTextField(), coachRecentGView.getPlayer9NumberTextField(), coachRecentGView.getPlayer10NumberTextField()};
        JComboBox fouls[] = {coachRecentGView.getP1FoulComboBox(), coachRecentGView.getP2FoulComboBox(), coachRecentGView.getP3FoulComboBox(), coachRecentGView.getP4FoulComboBox(), coachRecentGView.getP5FoulComboBox(), coachRecentGView.getP6FoulComboBox(), coachRecentGView.getP7FoulComboBox(), coachRecentGView.getP8FoulComboBox(), coachRecentGView.getP9FoulComboBox(), coachRecentGView.getP10FoulComboBox()};
        JTextField firstQuarter[] = {coachRecentGView.getP1FirstTextField(), coachRecentGView.getP2FirstTextField(), coachRecentGView.getP3FirstTextField(), coachRecentGView.getP4FirstTextField(), coachRecentGView.getP5FirstTextField(), coachRecentGView.getP6FirstTextField(), coachRecentGView.getP7FirstTextField(), coachRecentGView.getP7FirstTextField(), coachRecentGView.getP8FirstTextField(), coachRecentGView.getP9FirstTextField(), coachRecentGView.getP10FirstTextField()};
        JTextField secondQuarter[] = {coachRecentGView.getP1SecondTextField(), coachRecentGView.getP2SecondTextField(), coachRecentGView.getP3SecondTextField(), coachRecentGView.getP4SecondTextField(), coachRecentGView.getP5SecondTextField(), coachRecentGView.getP6SecondTextField(), coachRecentGView.getP7SecondTextField(), coachRecentGView.getP8SecondTextField(), coachRecentGView.getP9SecondTextField(), coachRecentGView.getP10SecondTextField()};
        JTextField thirdQuarter[] = {coachRecentGView.getP1ThirdTextField(), coachRecentGView.getP2ThirdTextField(), coachRecentGView.getP3ThirdTextField(), coachRecentGView.getP4ThirdTextField(), coachRecentGView.getP5ThirdTextField(), coachRecentGView.getP6ThirdTextField(), coachRecentGView.getP7ThirdTextField(), coachRecentGView.getP8ThirdTextField(), coachRecentGView.getP9ThirdTextField(), coachRecentGView.getP10ThirdTextField()};
        JTextField forthQuarter[] = {coachRecentGView.getP1ForthTextField(), coachRecentGView.getP2ForthTextField(), coachRecentGView.getP3ForthTextField(), coachRecentGView.getP4ForthTextField(), coachRecentGView.getP5ForthTextField(), coachRecentGView.getP6ForthTextField(), coachRecentGView.getP7ForthTextField(), coachRecentGView.getP8ForthTextField(), coachRecentGView.getP9ForthTextField(), coachRecentGView.getP10ForthTextField()};

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

            jerseyNum[j].setEnabled(false);
            fouls[j].setEnabled(false);
            firstQuarter[j].setEnabled(false);
            secondQuarter[j].setEnabled(false);
            thirdQuarter[j].setEnabled(false);
            forthQuarter[j].setEnabled(false);
        }

    }
}
