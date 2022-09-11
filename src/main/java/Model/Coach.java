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
public class Coach {

    private int cid;
    private String firstName;
    private String address;
    private String userName;
    private String password;

    public Coach(int id, String fN, String ad, String uN, String p) {

        cid = id;
        firstName = fN;
        address = ad;
        userName = uN;
        password = p;

    }

    public int getID() {
        return cid;
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
