package com.example.backbuttonactionsbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity implements View.OnClickListener {

    private Button ButtonTwos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ButtonTwos = findViewById(R.id.buttonTwo);
        ButtonTwos.setOnClickListener(this);
    }

//    @Override //if set parentactivity name in menifeastxml dont need this
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//
//        if(item.getItemId() == android.R.id.home){
////            this.finish();
//            onBackPressed();
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.buttonTwo){
            Intent intent = new Intent(Profile.this,MainActivity.class);
            startActivity(intent);
        }
    }
}