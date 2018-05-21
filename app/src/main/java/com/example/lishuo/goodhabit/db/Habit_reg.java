package com.example.lishuo.goodhabit.db;

/**
 * Created by lishuo on 2018/5/18.
 */

public class Habit_reg extends DataSupport{
    private int Uname;
    private int Hname;
    private double done;

    public int getUname() {
        return Uname;
    }

    public void setUname(int uname) {
        Uname = uname;
    }

    public int getHname() {
        return Hname;
    }

    public void setHname(int hname) {
        Hname = hname;
    }

    public double getDone() {
        return done;
    }

    public void setDone(double done) {
        this.done = done;
    }
}
