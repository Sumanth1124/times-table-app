package com.example.sumanth.timestables;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import java.util.ArrayList;

import static android.R.layout.simple_spinner_item;

public class MainActivity extends AppCompatActivity
    {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView myListView = findViewById(R.id.myListView);
        SeekBar seekBar =(SeekBar)findViewById(R.id.seekBar);
        seekBar.setMax(20);
        seekBar.setProgress(10);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean fromUser) {
                int k=i;
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                for(int j=1;j<=100;j++)
                {
                    int c=k*j;
                    arrayList.add(c);
                }
                ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<Integer>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,arrayList);
                myListView.setAdapter(arrayAdapter);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
