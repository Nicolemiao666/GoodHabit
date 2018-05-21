package com.example.lishuo.goodhabit.db;

/**
 * Created by lishuo on 2018/5/18.
 */

public class User extends DataSupport{
    private int id;
    private String Uname;
    private int password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return Uname;
    }

    public void setUname(String uname) {
        Uname = uname;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
