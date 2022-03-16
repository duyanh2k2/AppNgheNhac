package com.example.appnghenhac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ImageButton pre,play,next;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
    }
    public void anhxa(){
        pre=findViewById(R.id.pre);
        play=findViewById(R.id.play);
        next=findViewById(R.id.next);
        listView=findViewById(R.id.listnhac);
    }
}