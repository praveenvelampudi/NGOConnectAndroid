package com.example.anmolkulkarni.ngo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by Anmol Kulkarni on 15-03-2016.
 */
public class Splash extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
        Thread timer = new Thread(){
            public void run()
            {
                try{
                    sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent next = new Intent(Splash.this, MainActivity.class);
                    startActivity(next);
                }
            }
        };
        timer.start();
    }
}
