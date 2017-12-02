package com.demo.sl.calendardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements MyCalendar.MyCalendarListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyCalendar my_calendar = findViewById(R.id.my_calendar);
        my_calendar.listener = this;
    }

    @Override
    public void onItemLongPress(Date day) {
        DateFormat df = SimpleDateFormat.getInstance();
        Toast.makeText(this, df.format(day), Toast.LENGTH_LONG).show();
    }
}
