package com.example.waldes.ksuonlinenew;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Toolbar mToolbar;
    private ViewPager myviewPager;
    private TabLayout mytabLayout;
    //private TabaccessAdapter myTabsAccessAdapter;




    Button btnlog;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlog = (Button) findViewById(R.id.button2);
        btnlog.setOnClickListener(this);
        /*myviewPager = (ViewPager) findViewById(R.id.main_tabs_pager);
        myTabsAccessAdapter = new TabaccessAdapter(getSupportFragmentManager());
        myviewPager.setAdapter(myTabsAccessAdapter);

        mytabLayout = (TabLayout) findViewById(R.id.main_tabs);
        mytabLayout.setupWithViewPager(myviewPager);*/

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                Intent intent = new Intent(this, Signup.class);
                startActivity(intent);
                break;

            default:
                break;


        }

    }
}

