package com.example.lishuo.goodhabit.db;

/**
 * Created by lishuo on 2018/5/18.这是添加灵感表的数据库，Affulatus、Habit_reg
 * Habits和user都是数据库的表，我的这个项目使用litepal框架管理数据库
 */

public class Affulatus extends DataSupport{
    private int Uname;
    private String content;
    private int affu_time;

    public int getUname() {
        return Uname;
    }

    public void setUname(int uname) {
        Uname = uname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getAffu_time() {
        return affu_time;
    }

    public void setAffu_time(int affu_time) {
        this.affu_time = affu_time;
    }
}
