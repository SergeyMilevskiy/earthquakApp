package com.sergey.earthqukeapp.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.roughike.bottombar.BottomBar;
import com.sergey.earthqukeapp.R;

public class MainActivity extends AppCompatActivity {

    protected BottomBar mBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBottomBar = (BottomBar) findViewById(R.id.bottomBar);
        mBottomBar.setOnTabReselectListener(id -> {
            if (id == R.id.tab_favorites) {
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });
        mBottomBar.setOnTabSelectListener(id -> {
            if (id == R.id.tab_favorites) {
            }
        });

    }
}
