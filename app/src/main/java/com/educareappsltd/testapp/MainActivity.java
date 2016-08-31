package com.educareappsltd.testapp;

import android.app.Fragment;
import android.media.AudioManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.educareappsltd.testapp.drawing.PanelMapping;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            // cleanup any existing fragments in case we are in detailed mode
            getFragmentManager().executePendingTransactions();
            Fragment fragmentById = getFragmentManager().
                    findFragmentById(R.id.fmLyID);
            if (fragmentById != null) {
                getFragmentManager().beginTransaction()
                        .remove(fragmentById).commit();
            }
            FragClass fragClass = new FragClass();
            FrameLayout viewById = (FrameLayout) findViewById(R.id.fmLyID);
            getFragmentManager().beginTransaction()
                    .replace(R.id.fmLyID, fragClass).commit();
        }

    }


}

