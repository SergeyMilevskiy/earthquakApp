package com.sergey.earthqukeapp.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.roughike.bottombar.BottomBar;
import com.sergey.earthqukeapp.R;
import com.sergey.earthqukeapp.list.fragment.MainFragmentList;

public class MainActivity extends AppCompatActivity {

    protected BottomBar mBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        MainFragmentList mainFragmentList = MainFragmentList.newInstance();
        ft.replace(R.id.fragment_container, mainFragmentList);
        ft.commit();

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
