package com.example.a30daydeclutterchallenge;


import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import static com.example.a30daydeclutterchallenge.R.menu.bottom_navigation_main;

public class ExpandedView extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task1);

        Bundle b = getIntent().getExtras();
        String title = b.getString("name");

        TextView view = (TextView) findViewById(R.id.title);
        view.setText(title);


    }
}
