package com.example.premchand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StoryPartActivity extends AppCompatActivity {

    private static final String TAG = "Story";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_part);


        int value = getIntent().getExtras().getInt("id");


        Button buttonView1, buttonView2, buttonView3, buttonView4;

        buttonView1 = findViewById(R.id.buttonView1);
        buttonView2 = findViewById(R.id.buttonView2);
        buttonView3 = findViewById(R.id.buttonView3);
        buttonView4 = findViewById(R.id.buttonView4);

        switch (value + 1) {

            case 1:
                buttonView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent i = new Intent(StoryPartActivity.this, StoryActivity.class);
                        i.putExtra("part_one", getString(R.string.Namak_Ka_Daroga_one));
                        i.putExtra("part_name", "पहला भाग");
                        startActivity(i);

                    }
                });

                buttonView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent i = new Intent(StoryPartActivity.this, StoryActivity.class);
                        i.putExtra("part_one", getString(R.string.Namak_Ka_Daroga_two));
                        i.putExtra("part_name", "दूसरा भाग");
                        startActivity(i);

                    }
                });

                buttonView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent i = new Intent(StoryPartActivity.this, StoryActivity.class);
                        i.putExtra("part_one", getString(R.string.Namak_Ka_Daroga_three));
                        i.putExtra("part_name", "तीसरा भाग");
                        startActivity(i);

                    }
                });

                buttonView4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent i = new Intent(StoryPartActivity.this, StoryActivity.class);
                        i.putExtra("part_one", getString(R.string.Namak_Ka_Daroga_four));
                        i.putExtra("part_name", "चौथा भाग");
                        startActivity(i);

                    }
                });

                break;
            case 2:
                buttonView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent i = new Intent(StoryPartActivity.this, StoryActivity.class);
                        i.putExtra("part_one", getString(R.string.navigation_close));
                        startActivity(i);

                    }
                });

                buttonView4.setVisibility(View.INVISIBLE);
                break;
            case 3:
                buttonView4.setVisibility(View.INVISIBLE);
                buttonView3.setVisibility(View.INVISIBLE);
                break;
            case 4:
                buttonView4.setVisibility(View.INVISIBLE);
                buttonView3.setVisibility(View.INVISIBLE);
                buttonView2.setVisibility(View.INVISIBLE);
                break;
            case 5:

                break;
            case 6:
                buttonView4.setVisibility(View.INVISIBLE);
                break;
            case 7:
                buttonView4.setVisibility(View.INVISIBLE);
                buttonView3.setVisibility(View.INVISIBLE);
                break;
            case 8:
                buttonView4.setVisibility(View.INVISIBLE);
                buttonView3.setVisibility(View.INVISIBLE);
                buttonView2.setVisibility(View.INVISIBLE);
                break;
            case 9:

                break;
            case 10:
                buttonView4.setVisibility(View.INVISIBLE);
                break;
            case 11:
                buttonView4.setVisibility(View.INVISIBLE);
                buttonView3.setVisibility(View.INVISIBLE);
                break;
            case 12:
                buttonView4.setVisibility(View.INVISIBLE);
                buttonView3.setVisibility(View.INVISIBLE);
                buttonView2.setVisibility(View.INVISIBLE);
                break;
            case 13:

                break;

        }
    }


}