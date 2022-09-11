/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CoachDAO;
import Model.PlayerDAO;
import View.SignIn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author rajasharma
 */
public class SignInController {

    private PlayerDAO playerDAO;
    private CoachDAO coachDAO;
    private SignIn signInView;

    public SignInController() {
        playerDAO = new PlayerDAO();
        coachDAO = new CoachDAO();
        signInView = new SignIn();

        JButton signInButton = signInView.getSignIn();
        signInButton.addActionListener(e -> signInActionListener());

        JButton signUpButton = signInView.getSignUpButton();
        signUpButton.addActionListener(e -> signUpActionListener());

    }

    public void startApp() {
        signInView.setVisible(true);

    }

    public void signInActionListener() {
        JTextField userName = signInView.getUserName();
        String userID = userName.getText();

        JPasswordField password = signInView.getjPasswordField1();
        char pw[] = password.getPassword();
        String passWord = String.valueOf(pw);

        if (playerDAO.isValid(passWord, userID)) {
            StudentHomeController stc = new StudentHomeController(playerDAO.studentId(passWord, userID), passWord, userID);
            stc.startApp();
            signInView.setVisible(false);
            // call the method that will navigate the student
        } else if (coachDAO.isValid(passWord, userID)) {

            CoachHomeController stc1 = new CoachHomeController(coachDAO.coachID(passWord, userID));
            stc1.startApp();
            signInView.setVisible(false);
            // call the method that will navigate the student
        } else {

        }

    }

    public void signUpActionListener() {

        SignUpController signUpC = new SignUpController(signInView);
        signInView.setVisible(false);
        signUpC.startApp();

    }
}
