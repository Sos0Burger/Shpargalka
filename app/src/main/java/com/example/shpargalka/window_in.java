package com.example.shpargalka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class window_in extends AppCompatActivity {
    String crypt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window_in);
        Intent intent = getIntent();
        crypt = intent.getStringExtra("crypt");

        if (crypt.equals("BTC")){
            TextView text = findViewById(R.id.num_1);
            text.setText(getResources().getString(R.string.BitcoinInfo));

        }
        if (crypt.equals("BNB")){
            TextView text = findViewById(R.id.num_1);
            text.setText(getResources().getString(R.string.BNB));
        }
        if (crypt.equals("USDT")){
            TextView text = findViewById(R.id.num_1);
            text.setText(getResources().getString(R.string.USDT));
        }
        if (crypt.equals("ETH")){
            TextView text = findViewById(R.id.num_1);
            text.setText(getResources().getString(R.string.Ethereum));
        }
    }
}