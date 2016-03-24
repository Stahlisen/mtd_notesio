package com.example.fst.noteio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;

public class BaseActivity extends AppCompatActivity {
    Toolbar toolbar;
    ActionBarDrawerToggle abdToggle;
    TabLayout tabLayout;

    @Override
    public void setContentView(int layoutResID) {
        //Prepare and inflate views
        DrawerLayout fullView = (DrawerLayout) getLayoutInflater().inflate(R.layout.activity_base, null);
        FrameLayout activityContainer = (FrameLayout) fullView.findViewById(R.id.activity_content);
        getLayoutInflater().inflate(layoutResID, activityContainer, true);
        super.setContentView(fullView);

        //Set up toolbar and ActionBarDrawerToggle
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        abdToggle = new ActionBarDrawerToggle(this, fullView, toolbar, R.string.app_name, R.string.app_name);
        abdToggle.setDrawerIndicatorEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        abdToggle.syncState();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void setToolbarTitle(String title) {
        toolbar.setTitle(title);
    }




}
