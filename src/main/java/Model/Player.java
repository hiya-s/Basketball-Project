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
public class Player {

    private int sid;
    private String firstName;
    private String address;
    private String userName;
    private String password;

    public Player(int id, String fN, String ad, String uN, String p) {

        sid = id;
        firstName = fN;
        address = ad;
        userName = uN;
        password = p;

    }

    public int getID() {
        return sid;
    }

    public String getAddress() {
        return address;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

}
