package com.example.premchand;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecyclerViewClickInterface{

    private static final String TAG = "MainActivity";
    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;

    List<String> storyList;

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    ImageButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigationView);
        fab = findViewById(R.id.fab);
//        toolbar = findViewById(R.id.toolbar);

//        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.navigation_open, R.string.navigation_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (drawerLayout.isDrawerOpen(GravityCompat.START)){
                    drawerLayout.closeDrawer(GravityCompat.START);
                }else {
                    drawerLayout.openDrawer(GravityCompat.START);
                }
            }
        });

        storyList = new ArrayList<>();
        storyList.add("नमक का दारोगा");
        storyList.add("दो बैलों की कथा");
        storyList.add("पूस की रात");
        storyList.add("पंच- परमेश्वर");
        storyList.add("एक आंच की कसर");
        storyList.add("नैराश्य लीला");
        storyList.add("उद्धार");
        storyList.add("कौशल");
        storyList.add("नरक का मार्ग");
        storyList.add("धिक्कार");
        storyList.add("वफ़ा का खंजर");
        storyList.add("माता का ह्रदय");
        storyList.add("मुबारक बीमारी");


        recyclerView = findViewById(R.id.recyclerView);
        recyclerAdapter = new RecyclerAdapter(storyList, this);

        recyclerView.setLayoutManager(new  LinearLayoutManager(this));

        recyclerView.setAdapter(recyclerAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        dividerItemDecoration.setDrawable(new ColorDrawable(getResources().getColor(R.color.black)));
        recyclerView.addItemDecoration(dividerItemDecoration);
    }

    @Override
    public void onItemClick(int position) {

        Intent intent = new Intent(this, StoryPartActivity.class);
        intent.putExtra("id",position);
        startActivity(intent);

    }

}