package com.example.cofeeapp01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplaySalesDetails extends AppCompatActivity {
    String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_sales_details);

        Intent intent = getIntent();
        message = intent.getStringExtra("db");
        TextView salesView = (TextView)findViewById(R.id.displayTextView);
        salesView.setText(message);
    }
}