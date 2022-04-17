package com.example.shpargalka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class window_in extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window_in);

        if (crypt == "BTC"){
            TextView text = findViewById(R.id.num_1);
            text.setText("@string/BitcoinInfo");

        }
        if (crypt == "BNB"){
            TextView text = findViewById(R.id.num_1);
            text.setText("@string/BNB");
        }
        if (crypt == "USDT"){
            TextView text = findViewById(R.id.num_1);
            text.setText("@string/usdt");
        }
        if (crypt == "ETH"){
            TextView text = findViewById(R.id.num_1);
            text.setText("@string/Ethereum");
        }
    }
}