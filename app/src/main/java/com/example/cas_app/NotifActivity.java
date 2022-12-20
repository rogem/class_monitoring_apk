package com.example.cas_app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.google.android.material.navigation.NavigationView;
public class NotifActivity extends AppCompatActivity {
    private static final String TAG = "NotifActivity";
    private ArrayList<Personn>mPerson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notif);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listView);

        //Create the Person objects
        //Personn person1 = new Personn("Juan Dela Cruz","Time-out" ,"7:10 PM","12/25/2022");
        //Personn person2 = new Personn("Thomas Cruz","Time-in" ,"7:02 AM","12/25/2022");
        //Personn person3 = new Personn("Chloe Diaz","Time-in" ,"9:00 AM","12/25/2022");
       // Personn person4 = new Personn("Juan Dela Cruz","Time-in" ,"7:10 AM","12/25/2022");
        mPerson = new ArrayList<Personn>();
        mPerson.add(new Personn("Juan Dela Cruz","Time-out" ,"7:10 PM","12/25/2022"));
        mPerson.add(new Personn("Thomas Cruz","Time-in" ,"7:02 AM","12/25/2022"));
        mPerson.add(new Personn("Chloe Diaz","Time-in" ,"9:00 AM","12/25/2022"));
        mPerson.add(new Personn("Juan Dela Cruz","Time-in" ,"7:10 AM","12/25/2022"));
        for(int i= 0; i <mPerson.size();i++){
            Log.d(TAG,"onCreate: Started."+mPerson.get(i).getNamee());
        }
        //Add the Person objects to an ArrayList
       // ArrayList<Personn> peopleList = new ArrayList<>();
       // peopleList.add(person1);
       // peopleList.add(person2);
        //peopleList.add(person3);
       // peopleList.add(person4);

        PersonListAdapterr adapter = new PersonListAdapterr(this, R.layout.adapter_view_layoutt, mPerson);
        mListView.setAdapter(adapter);
    }
    public void btnbchme(View view) {
        Toast.makeText(this, "Back Clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(),RoomsActivity.class);
        startActivity(intent);
    }
}
