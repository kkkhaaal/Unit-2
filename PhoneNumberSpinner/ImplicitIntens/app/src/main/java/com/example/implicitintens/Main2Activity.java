package com.example.implicitintens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        Uri uri = intent.getData();

        if (uri != null) {
            String uri_string = "URI: " + uri.toString();
            TextView textView = (TextView) findViewById(R.id.text_uri_message);
            textView.setText(uri_string);
        }
    }
}
