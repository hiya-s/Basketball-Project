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
public class TeamStudentInfo {

    private int id;
    private int sid;
    private int tid;

    public TeamStudentInfo(int i, int s, int t) {

        id = i;
        sid = s;
        tid = t;

    }

    public int getID() {
        return id;
    }

    public int getTID() {
        return tid;
    }

    public int getSID() {
        return sid;
    }
}
