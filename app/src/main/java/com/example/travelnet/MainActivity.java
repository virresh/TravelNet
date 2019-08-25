package com.example.travelnet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static String ATAG = "Home Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickEditProfile(View v){
        Log.d(ATAG, "Clicked Edit Profile");
        Intent nIntent = new Intent(this, EditProfile.class);
        startActivity(nIntent);
    }

    public void clickViewAssignments(View v){
        Log.d(ATAG, "Clicked See Assignments");
        Intent nIntent = new Intent(this, Assignments.class);
        startActivity(nIntent);
    }
}
