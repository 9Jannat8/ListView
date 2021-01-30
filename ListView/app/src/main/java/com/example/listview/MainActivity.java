package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listviewId);

        String[] countryNames = getResources().getStringArray(R.array.country_names);//string array ta k java file a niye asha holo

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.sample_view, R.id.textViewId, countryNames);
        listView.setAdapter(adapter);//listview te adapter set kora holo

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {//listview er item gulore jonno listener jog kora holo
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value = countryNames[position];//nth position er value get store korlam
                
                    Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();
            }
        });
    }
}