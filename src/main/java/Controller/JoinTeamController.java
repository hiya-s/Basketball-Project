/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author hiyasharma
 */
import Model.TeamStudentInfoDAO;
import View.AverageGame;
import View.Homework;
import View.JoinTeam;
import View.StudentNotesFromCoach;
import View.Plays;
import View.RecentGame;
import View.StudentHome;
import static java.lang.Integer.parseInt;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JoinTeamController {

    private StudentHome studentHomeView;
    private Homework homeworkView;
    private RecentGame recentGameView;
    private Plays playsView;
    private StudentNotesFromCoach notesFromCoachView;
    private AverageGame averageGameView;
    private JoinTeam joinTeamView;

    private int sid;

    public JoinTeamController(int sid1, StudentHome studentHomeView1) {

        studentHomeView = studentHomeView1;
        joinTeamView = new JoinTeam();
        homeworkView = new Homework();
        recentGameView = new RecentGame();
        playsView = new Plays();
        notesFromCoachView = new StudentNotesFromCoach();
        averageGameView = new AverageGame();
        sid = sid1;

        JButton teamSubmitButton = joinTeamView.getjButton1Submit();

        teamSubmitButton.addActionListener(e -> submitButtonListener());

    }

    public void startApp() {
        joinTeamView.setVisible(true);

    }

    private void submitButtonListener() {

        JTextField joinTeamTextField = joinTeamView.getJoinTeamTextField();
        String joinTeam = joinTeamTextField.getText();
        int code = parseInt(joinTeam);

        TeamStudentInfoDAO obj = new TeamStudentInfoDAO();
        if (obj.isValid(code)) {

            obj.newStudentInTeam(code, sid);

            JOptionPane.showMessageDialog(joinTeamView, "JOINED CLASSROOM");
            joinTeamView.setVisible(false);
            studentHomeView.setVisible(true);

        } else {

        }

    }

}
