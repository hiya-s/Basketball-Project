/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

/**
 *
 * @author rajasharma
 */
public class CoachTeams extends javax.swing.JFrame {

    /**
     * Creates new form CoachTeams
     */
    public CoachTeams() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jSpinner1 = new javax.swing.JSpinner();
        teamSelectorComboBox = new javax.swing.JComboBox<>();
        labelSelectTeam = new javax.swing.JLabel();
        teamSelectedButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelSelectTeam.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labelSelectTeam.setText("Select a team to see who is on your team");

        teamSelectedButton.setText("Team Selected");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(labelSelectTeam))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(teamSelectorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(teamSelectedButton)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(labelSelectTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(teamSelectorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teamSelectedButton)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JOptionPane getjOptionPane1() {
        return jOptionPane1;
    }

    public JSpinner getjSpinner1() {
        return jSpinner1;
    }

    public JLabel getLabelSelectTeam() {
        return labelSelectTeam;
    }

    public JButton getTeamSelectedButton() {
        return teamSelectedButton;
    }

    public JComboBox<String> getTeamSelectorComboBox() {
        return teamSelectorComboBox;
    }

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel labelSelectTeam;
    private javax.swing.JButton teamSelectedButton;
    private javax.swing.JComboBox<String> teamSelectorComboBox;
    // End of variables declaration//GEN-END:variables
}