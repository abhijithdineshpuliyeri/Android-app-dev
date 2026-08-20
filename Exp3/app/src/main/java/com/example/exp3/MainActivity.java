package com.example.exp3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(
                            R.id.list_container,
                            new CourseListFragment()
                    )
                    .commit();

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(
                            R.id.detail_container,
                            new DetailFragment()
                    )
                    .commit();
        }
    }
}