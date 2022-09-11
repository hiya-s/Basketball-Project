/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CoachDAO;
import Model.PlayerDAO;
import Model.SignUpDAO;
import View.SignIn;
import View.SignUp;
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
public class SignUpController {

    private SignUp signUpView;
    private SignIn signInView;

    public SignUpController(SignIn signInC) {

        signUpView = new SignUp();
        signInView = signInC;
        JButton signUpButton = signUpView.getCreateAccountButton();
        signUpButton.addActionListener(e -> signUpActionListener());

        JTextField usernameTextField = signUpView.getUsernameTextField();
        //usernameTextField.addFocusListener(e-> username());
    }

    public void startApp() {
        signUpView.setVisible(true);

    }

    private void signUpActionListener() {
        JTextField userName = signUpView.getUsernameTextField();
        String userID = userName.getText();

        JPasswordField password = signUpView.getjPasswordField1();
        char pw[] = password.getPassword();
        String passWord = String.valueOf(pw);

        JTextField address = signUpView.getAddressTextField();
        String address1 = address.getText();

        JTextField firstName = signUpView.getFirstNameTextField();
        String firstName1 = firstName.getText();

        if (signUpView.getjComboBox1().getSelectedItem().toString().equals("Coach")) {
            CoachDAO obj = new CoachDAO();
            if (obj.newCoach(userID, passWord, firstName1, address1)) {

                JOptionPane.showMessageDialog(signUpView, "REGISTRATION COMPLETE");
                signUpView.setVisible(false);
                signInView.setVisible(true);
            }

        } else {
            PlayerDAO obj = new PlayerDAO();
            if (obj.newPlayer(userID, passWord, firstName1, address1)) {

                JOptionPane.showMessageDialog(signUpView, "REGISTRATION COMPLETE");
                signUpView.setVisible(false);
                signInView.setVisible(true);
            }

        }
    }

    //private void username(){
    //}
}
