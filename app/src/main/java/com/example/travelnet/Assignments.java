package com.example.travelnet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Assignments extends AppCompatActivity {

    private static String ATAG = "All Assignments";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignments);
    }

    public void clickSeeDetail(View v){
        Log.d(ATAG, "Clicked An Assignment");
        Intent nIntent = new Intent(this, AssignmentDetails.class);
        startActivity(nIntent);
    }
}
