package com.example.forrealstyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button goToActivityTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToActivityTwo = findViewById((R.id.activity_main_goToActivityTwo));
        goToActivityTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                changeActivity();

            }
        });
    }
    private void changeActivity(){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}