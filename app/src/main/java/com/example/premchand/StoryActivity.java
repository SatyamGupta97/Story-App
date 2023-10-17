package com.example.premchand;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

public class StoryActivity extends AppCompatActivity {
    TextView textView, headerText;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        textView = findViewById(R.id.textview);
        headerText = findViewById(R.id.headerText);
        linearLayout = findViewById(R.id.linearLayout);

        String str = getIntent().getStringExtra("part_one");
        String strMain = getIntent().getStringExtra("part_name");

        headerText.setText(strMain);


        textView.setText(str);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case R.id.default_font:
                textView.setTextSize(35);
                break;
            case R.id.size_30:
                textView.setTextSize(30);
                break;
            case R.id.size_40:
                textView.setTextSize(40);
                break;
            case R.id.size_50:
                textView.setTextSize(50);
                break;
            case R.id.size_60:
                textView.setTextSize(60);
                break;
            case R.id.default_back_color:
                linearLayout.setBackgroundColor(Color.WHITE);
                break;
            case R.id.back_color_cream:
                linearLayout.setBackgroundColor(getResources().getColor(R.color.cream));
                break;
            case R.id.back_color_silver:
                linearLayout.setBackgroundColor(getResources().getColor(R.color.silver));
                break;
            case R.id.back_color_yellow:
                linearLayout.setBackgroundColor(getResources().getColor(R.color.yellow));
                break;
            case R.id.back_color_gray:
                linearLayout.setBackgroundColor(getResources().getColor(R.color.lightgray));
                break;
            case R.id.default_font_color:
                textView.setTextColor(getResources().getColor(R.color.black));
                break;
            case R.id.font_color_blue:
                textView.setTextColor(getResources().getColor(R.color.blue));
                break;
            case R.id.font_color_violet:
                textView.setTextColor(getResources().getColor(R.color.violet));
                break;
            case R.id.font_color_Maroon:
                textView.setTextColor(getResources().getColor(R.color.Maroon));
                break;
            case R.id.font_color_Grey:
                textView.setTextColor(getResources().getColor(R.color.gray));
                break;
        }

        return true;
    }
}