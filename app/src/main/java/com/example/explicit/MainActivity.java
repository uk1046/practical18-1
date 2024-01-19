package com.example.explicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URI;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
EditText t1;
Button b1;
String s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText) findViewById(R.id.txt2);
        b1=(Button) findViewById(R.id.navigate);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=t1.getText().toString();
                Intent i1=new Intent(Intent.ACTION_VIEW);
                i1.setData(Uri.parse(s1));
                startActivity(i1);
            }
        });
    }
}