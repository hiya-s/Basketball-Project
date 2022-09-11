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
public class Game {

    private int gid;
    private int t1Score;
    private int t2Score;
    private int t1id;

    public Game(int g, int t1s, int t2s, int tid) {

        gid = g;
        t1Score = t1s;
        t2Score = t2s;
        t1id = tid;

    }

    public int getGid() {
        return gid;
    }

    public int getT1Score() {
        return t1Score;
    }

    public int getT2Score() {
        return t2Score;
    }

    public int getT1id() {
        return t1id;
    }

}
