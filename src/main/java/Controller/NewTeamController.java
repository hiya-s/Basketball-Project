/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author rajasharma
 */
import Model.TeamCoachInfoDAO;
import Model.TeamDAO;
import View.CoachHome;
import View.StudentHome;
import View.CoachTeams;
import View.CreateNewTeam;
import View.SignIn;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class NewTeamController {

    private CreateNewTeam coachTeamView;
    private CoachHome coachHomeView;
    private int cid;

    public NewTeamController(CoachHome coachHomeC, int cid) {

        coachTeamView = new CreateNewTeam();
        coachHomeView = coachHomeC;
        JButton createNewButton = coachTeamView.getCreateButton();
        createNewButton.addActionListener(e -> createButtonListener(cid));

    }

    private void createButtonListener(int cid) {

        JTextField teamName = coachTeamView.getTeamNameTextField();
        String teamN = teamName.getText();

        JTextField teamWin = coachTeamView.getTeamWinTextFiel();
        int teamW = Integer.parseInt(teamWin.getText());

        JTextField teamLoss = coachTeamView.getTeamLossesTextField();
        int teamL = Integer.parseInt(teamLoss.getText());

        JTextField ageG = coachTeamView.getAgeGroupTextField();
        String aG = ageG.getText();

        TeamDAO team = new TeamDAO();
        int teamId = team.teamCreatedId(teamN, teamW, teamL, aG);
        if (teamId != -1) {
            TeamCoachInfoDAO another = new TeamCoachInfoDAO();
            another.coachUpdated(teamId, cid);

            JOptionPane.showMessageDialog(coachTeamView, "REGISTRATION COMPLETE your Team ID to share is " + teamId);
            coachTeamView.setVisible(false);

            //CoachHomeController stc1 = new CoachHomeController();
            //stc1.startApp();
            coachHomeView.setVisible(true);
        }

    }

    public void startApp() {
        coachTeamView.setVisible(true);

    }

}
