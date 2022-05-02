package com.example.shpargalka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView cryptoList = findViewById(R.id.cryptoList);
        String[] crypto = getResources().getStringArray(R.array.Crypto);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, R.layout.list_design, crypto);
        cryptoList.setAdapter(adapter);
        Intent intent = new Intent(this, window_in.class);
        cryptoList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                intent.putExtra("key", ((TextView)v).getText() + ".html");
                startActivity(intent);
            }
        });

    }
}