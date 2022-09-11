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
public class GamePlayer {

    private int gpid;
    private int fouls;
    private int tid;
    private int cid;
    private int jerseyNum;
    private int gid;
    private int firstq;
    private int secondq;
    private int thirdq;
    private int fourthq;

    public GamePlayer(int gPid, int f, int t, int c, int jn, int g, int fq, int sq, int tq, int foq) {

        gpid = gPid;
        fouls = f;
        tid = t;
        cid = c;
        jerseyNum = jn;
        gid = g;
        firstq = fq;
        secondq = sq;
        thirdq = tq;
        fourthq = foq;

    }

    public int getGpid() {
        return gpid;
    }

    public int getFouls() {
        return fouls;
    }

    public int getTid() {
        return tid;
    }

    public int getCid() {
        return cid;
    }

    public int getJerseyNum() {
        return jerseyNum;
    }

    public int getGid() {
        return gid;
    }

    public int getFirstq() {
        return firstq;
    }

    public int getSecondq() {
        return secondq;
    }

    public int getThirdq() {
        return thirdq;
    }

    public int getFourthq() {
        return fourthq;
    }

}
