package com.example.cas_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.navigation.NavigationView;

public class RoomsActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rooms);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        drawer = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_notification:
                Intent intentep = new Intent(getApplicationContext(), NotifActivity.class);
                startActivity(intentep);
                break;

            case R.id.nav_settings:
                Intent intenteppp = new Intent(getApplicationContext(), SettingsActivity.class);
                startActivity(intenteppp);
                break;
            case R.id.nav_instructions:
                Intent intentepppp = new Intent(getApplicationContext(), InstructionsActivity.class);
                startActivity(intentepppp);
                break;
            case R.id.nav_signout:
                Intent intenteppppp = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intenteppppp);
                break;
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    public void btnbchme(View view) {
        Toast.makeText(this, "Back Clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(),RoomsActivity.class);
        startActivity(intent);
    }
    public void casr401(View view) {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(),R401Activity.class);
        startActivity(intent);
    }
    public void casr402(View view) {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(),R402Activity.class);
        startActivity(intent);

    }
    public void casr403(View view) {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(),R403Activity.class);
        startActivity(intent);
    }
    public void casr404(View view) {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(),R404Activity.class);
        startActivity(intent);
    }
    public void casr405(View view) {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(),R405Activity.class);
        startActivity(intent);
    }
    public void casr406(View view) {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(),R406Activity.class);
        startActivity(intent);
    }
    public void casr407(View view) {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(),R407Activity.class);
        startActivity(intent);
    }
    public void casr409(View view) {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(),R409Activity.class);
        startActivity(intent);
    }
    public void casr411(View view) {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(),R411Activity.class);
        startActivity(intent);
    }
    public void casr412(View view) {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(),R412Activity.class);
        startActivity(intent);
    }
    public void casr413(View view) {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(),R413Activity.class);
        startActivity(intent);
    }
    public void casr414(View view) {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(),R414Activity.class);
        startActivity(intent);
    }
    public void citr401(View view) {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(),Citr401Activity.class);
        startActivity(intent);
    }}