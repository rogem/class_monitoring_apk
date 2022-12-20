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

public class R411Activity extends AppCompatActivity {
    private static final String TAG = "R401Activity";
    private ArrayList<Person>mPerson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r411);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listView);

        //Create the Person objects
        //Person person1 = new Person("Juan Dela Cruz","CSTHESIS 2" ,"7:00 AM","8:00 AM");
        //Person person2 = new Person("Chloe Cruz","GEFILDIS 2" ,"8:00 AM","10:00 AM");
        //Person person3 = new Person("Professor: Thomas Cruz","Subject: GEFILDIS" ,"Start Time: 1:00 PM","End Time: 3:00 PM");

        mPerson = new ArrayList<Person>();
        mPerson.add(new Person("Juan Dela Cruz","CSTHESIS 2" ,"7:00 AM","8:00 AM"));
        mPerson.add(new Person("Chloe Cruz","GEFILDIS 2" ,"8:00 AM","10:00 AM"));
        mPerson.add(new Person("Thomas Cruz","GEFILDIS" ,"1:00 PM","3:00 PM"));
        for(int i= 0; i <mPerson.size();i++){
            Log.d(TAG,"onCreate: Started."+mPerson.get(i).getName());
        }
        //Add the Person objects to an ArrayList
        // ArrayList<Person> peopleList = new ArrayList<>();
        //   peopleList.add(Person);
        //  peopleList.add(person2);
        // peopleList.add(person3);

        PersonListAdapter adapter = new PersonListAdapter(this, R.layout.adapter_view_layout, mPerson);
        mListView.setAdapter(adapter);
    }
    public void btnbchme(View view) {
        Toast.makeText(this, "Back Clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(),RoomsActivity.class);
        startActivity(intent);
    }
}


