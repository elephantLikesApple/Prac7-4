package com.example.a7th_homework;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("연습문제 7-4");

        ActionBar ab = getSupportActionBar() ;
        ab.setIcon(R.drawable.app_icon);
        ab.setDisplayUseLogoEnabled(true) ;
        ab.setDisplayShowHomeEnabled(true) ;

        img=(ImageView) findViewById(R.id.image);
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu){
        super.onCreateOptionsMenu(menu);
        menu.add(0,1,0,"강아지");
        menu.add(0,2,0,"고양이");
        menu.add(0,3,0,"토끼" );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                img.setImageResource(R.drawable.dogimg);
                return true;
            case 2:
                img.setImageResource(R.drawable.catimg);
                return true;
            case 3:
                img.setImageResource(R.drawable.rabbitimg);
                return true;
        }
        return false;
    }
}
