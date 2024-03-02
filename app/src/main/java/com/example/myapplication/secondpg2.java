package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class secondpg2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpg2);
    }
    public void startNewActivity(View v){
        Intent intent = new Intent(this, pge3rd.class);
        startActivity(intent);
    }
    public void threerdpge(View v){
        Intent intent = new Intent(this, Pge4th.class);
        startActivity(intent);
    }
    public void fifthpge(View v){
        Intent intent = new Intent(this, Pge5th.class);
        startActivity(intent);
    }


}


