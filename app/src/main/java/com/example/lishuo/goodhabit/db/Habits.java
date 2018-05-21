package com.example.lishuo.goodhabit.db;

/**
 * Created by lishuo on 2018/5/18.
 */

public class Habits extends DataSupport{
    private int Uname;
    private int Hname;
    private int begin_time;
    private int finish_time;
    private String remind;
    private int remind_time;

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

    public int getBegin_time() {
        return begin_time;
    }

    public void setBegin_time(int begin_time) {
        this.begin_time = begin_time;
    }

    public int getFinish_time() {
        return finish_time;
    }

    public void setFinish_time(int finish_time) {
        this.finish_time = finish_time;
    }

    public String getRemind() {
        return remind;
    }

    public void setRemind(String remind) {
        this.remind = remind;
    }

    public int getRemind_time() {
        return remind_time;
    }

    public void setRemind_time(int remind_time) {
        this.remind_time = remind_time;
    }
}
