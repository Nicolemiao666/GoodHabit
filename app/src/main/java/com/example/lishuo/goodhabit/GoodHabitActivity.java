package com.example.lishuo.goodhabit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
//这是主界面
public class GoodHabitActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.good_habit_layout);
        Log.d("GoodHabitActivity", "onCreate execute ");
    }
}
