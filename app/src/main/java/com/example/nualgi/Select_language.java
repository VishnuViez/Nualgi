
package com.example.nualgi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Select_language extends AppCompatActivity {
    Button select_language;
    TextView skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_language);
        select_language = (Button) findViewById(R.id.select_language);
        skip = (TextView) findViewById(R.id.skip);
        select_language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent language = new Intent(Select_language.this, Address.class);
                startActivity(language);
            }
        });
    }
}