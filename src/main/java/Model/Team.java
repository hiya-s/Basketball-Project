/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author rajasharma
 */
public class Team {

    private int tid;
    private String teamName;
    private int teamCode;
    private int teamWin;
    private int teamLoss;
    private String ageG;

    public Team(int id, String tN, int tC, int tWW, int tLL, String aG) {

        tid = id;
        teamName = tN;
        teamCode = tC;
        teamWin = tWW;
        teamLoss = tLL;
        ageG = aG;
    }

    public int getID() {
        return tid;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getTeamCode() {
        return teamCode;
    }

    public int getTeamWin() {
        return teamWin;
    }

    public int getTeamLoss() {
        return teamLoss;
    }

    public String getAgeG() {
        return ageG;
    }
}
