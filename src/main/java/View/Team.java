/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JLabel;

/**
 *
 * @author rajasharma
 */
public class Team extends javax.swing.JFrame {

    /**
     * Creates new form Team
     */
    public Team() {
        initComponents();
    }

    public void setAgeGroupLabel(JLabel ageGroupLabel) {
        this.ageGroupLabel = ageGroupLabel;
    }

    public void setCoach1Label(JLabel coach1Label) {
        this.coach1Label = coach1Label;
    }

    public void setCoach2Label(JLabel coach2Label) {
        this.coach2Label = coach2Label;
    }

    public void setCoach3Label(JLabel coach3Label) {
        this.coach3Label = coach3Label;
    }

    public void setCoach4Label(JLabel coach4Label) {
        this.coach4Label = coach4Label;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public void setPlayer10Label(JLabel player10Label) {
        this.player10Label = player10Label;
    }

    public void setPlayer1label(JLabel player1label) {
        this.player1label = player1label;
    }

    public void setPlayer2Label(JLabel player2Label) {
        this.player2Label = player2Label;
    }

    public void setPlayer3Label(JLabel player3Label) {
        this.player3Label = player3Label;
    }

    public void setPlayer4Label(JLabel player4Label) {
        this.player4Label = player4Label;
    }

    public void setPlayer5Label(JLabel player5Label) {
        this.player5Label = player5Label;
    }

    public void setPlayer6Label(JLabel player6Label) {
        this.player6Label = player6Label;
    }

    public void setPlayer7Label(JLabel player7Label) {
        this.player7Label = player7Label;
    }

    public void setPlayer8Label(JLabel player8Label) {
        this.player8Label = player8Label;
    }

    public void setPlayer9Label(JLabel player9Label) {
        this.player9Label = player9Label;
    }

    public void setTeamCodeLabel(JLabel teamCodeLabel) {
        this.teamCodeLabel = teamCodeLabel;
    }

    public void setTeamLossesLabel(JLabel teamLossesLabel) {
        this.teamLossesLabel = teamLossesLabel;
    }

    public void setTeamNameLabel(JLabel teamNameLabel) {
        this.teamNameLabel = teamNameLabel;
    }

    public void setTeamWinsLabel(JLabel teamWinsLabel) {
        this.teamWinsLabel = teamWinsLabel;
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        teamNameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        player1label = new javax.swing.JLabel();
        player2Label = new javax.swing.JLabel();
        player3Label = new javax.swing.JLabel();
        player4Label = new javax.swing.JLabel();
        player5Label = new javax.swing.JLabel();
        player6Label = new javax.swing.JLabel();
        player7Label = new javax.swing.JLabel();
        player8Label = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        coach1Label = new javax.swing.JLabel();
        coach2Label = new javax.swing.JLabel();
        coach3Label = new javax.swing.JLabel();
        coach4Label = new javax.swing.JLabel();
        player9Label = new javax.swing.JLabel();
        player10Label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        teamWinsLabel = new javax.swing.JLabel();
        teamLossesLabel = new javax.swing.JLabel();
        ageGroupLabel = new javax.swing.JLabel();
        teamCodeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        teamNameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        teamNameLabel.setText("Team Name");

        jLabel1.setText("Player Names");

        player1label.setText("1. Player");

        player2Label.setText("2. Player");

        player3Label.setText("1. Player");

        player4Label.setText("2. Player");

        player5Label.setText("1. Player");

        player6Label.setText("2. Player");

        player7Label.setText("1. Player");

        player8Label.setText("2. Player");

        jLabel10.setText("Coach Names");

        coach1Label.setText("jLabel11");

        coach2Label.setText("jLabel12");

        coach3Label.setText("jLabel11");

        coach4Label.setText("jLabel12");

        player9Label.setText("1. Player");

        player10Label.setText("2. Player");

        jLabel2.setText("Team Wins:");

        jLabel3.setText("Team losses:");

        jLabel4.setText("Age Group:");

        jLabel5.setText("Team Code:");

        teamWinsLabel.setText("jLabel6");

        teamLossesLabel.setText("jLabel7");

        ageGroupLabel.setText("jLabel8");

        teamCodeLabel.setText("jLabel9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(teamNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(player5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player6Label)
                            .addComponent(player7Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player8Label)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(player2Label)
                            .addComponent(player3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player4Label))
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(coach2Label)
                                    .addComponent(coach1Label)
                                    .addComponent(coach4Label)
                                    .addComponent(coach3Label))
                                .addGap(18, 18, 18)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(teamWinsLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(teamLossesLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(ageGroupLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(teamCodeLabel)))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(player1label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(player10Label))
                            .addComponent(player9Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(teamNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(player1label)
                                    .addComponent(player9Label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(player2Label)
                                    .addComponent(player10Label)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(teamLossesLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(ageGroupLabel))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(player3Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(player4Label))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel2)
                            .addComponent(teamWinsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(coach1Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(coach2Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(coach3Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(coach4Label))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(teamCodeLabel))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(player5Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(player6Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(player7Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(player8Label)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    public JLabel getAgeGroupLabel() {
        return ageGroupLabel;
    }

    public JLabel getCoach1Label() {
        return coach1Label;
    }

    public JLabel getCoach2Label() {
        return coach2Label;
    }

    public JLabel getCoach3Label() {
        return coach3Label;
    }

    public JLabel getCoach4Label() {
        return coach4Label;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public JLabel getPlayer10Label() {
        return player10Label;
    }

    public JLabel getPlayer1label() {
        return player1label;
    }

    public JLabel getPlayer2Label() {
        return player2Label;
    }

    public JLabel getPlayer3Label() {
        return player3Label;
    }

    public JLabel getPlayer4Label() {
        return player4Label;
    }

    public JLabel getPlayer5Label() {
        return player5Label;
    }

    public JLabel getPlayer6Label() {
        return player6Label;
    }

    public JLabel getPlayer7Label() {
        return player7Label;
    }

    public JLabel getPlayer8Label() {
        return player8Label;
    }

    public JLabel getPlayer9Label() {
        return player9Label;
    }

    public JLabel getTeamCodeLabel() {
        return teamCodeLabel;
    }

    public JLabel getTeamLossesLabel() {
        return teamLossesLabel;
    }

    public JLabel getTeamNameLabel() {
        return teamNameLabel;
    }

    public JLabel getTeamWinsLabel() {
        return teamWinsLabel;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageGroupLabel;
    private javax.swing.JLabel coach1Label;
    private javax.swing.JLabel coach2Label;
    private javax.swing.JLabel coach3Label;
    private javax.swing.JLabel coach4Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel player10Label;
    private javax.swing.JLabel player1label;
    private javax.swing.JLabel player2Label;
    private javax.swing.JLabel player3Label;
    private javax.swing.JLabel player4Label;
    private javax.swing.JLabel player5Label;
    private javax.swing.JLabel player6Label;
    private javax.swing.JLabel player7Label;
    private javax.swing.JLabel player8Label;
    private javax.swing.JLabel player9Label;
    private javax.swing.JLabel teamCodeLabel;
    private javax.swing.JLabel teamLossesLabel;
    private javax.swing.JLabel teamNameLabel;
    private javax.swing.JLabel teamWinsLabel;
    // End of variables declaration//GEN-END:variables

    public void startApp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}