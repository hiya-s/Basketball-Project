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
public class TeamAnnouncements {

    private int id;
    private int cid;
    private int tid;
    private String teamAnnouncements;

    public TeamAnnouncements(int i, int tI, String tA, int c, String aG) {

        tid = tI;
        cid = c;
        id = i;
        teamAnnouncements = tA;
    }

    public int getID() {
        return id;
    }

    public String getTeamAnnouncements() {
        return teamAnnouncements;
    }

    public int getTeamID() {
        return tid;
    }

    public int getCoachID() {
        return cid;
    }
}
