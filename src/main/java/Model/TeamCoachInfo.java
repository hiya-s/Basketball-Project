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
public class TeamCoachInfo {

    private int id;
    private int cid;
    private int tid;

    public TeamCoachInfo(int i, int c, int t) {

        id = i;
        cid = c;
        tid = t;

    }

    public int getID() {
        return id;
    }

    public int getTID() {
        return tid;
    }

    public int getCID() {
        return cid;
    }
}
