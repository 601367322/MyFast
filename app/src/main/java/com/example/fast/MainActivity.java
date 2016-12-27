package com.example.fast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.fast.lib.interfaces.PluginManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onOneBtnClick(View view) {
        if (PluginManager.getOne() != null) {
            PluginManager.getOne().startActivity(this);
        }
    }

    public void onTwoBtnClick(View view) {
        if (PluginManager.getTwo() != null) {
            PluginManager.getTwo().startActivity(this);
        }
    }
}
