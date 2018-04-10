package com.apkglobal.splash_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    //Declare XML Widgets to Java Objects
    TextView tv_appname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        tv_appname = (TextView)findViewById(R.id.tv_appname);

        //To Hide the Status Bar using getWindow().setFlags(X,Y);
          getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //To Hide the ActionBar using getSupportActionBar.hide();
        getSupportActionBar().hide();



    }
}
