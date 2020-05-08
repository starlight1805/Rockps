package com.example.rockpaperscissors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button enter;
    EditText edit1, edit2, edit3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enter=findViewById(R.id.button);
        edit1 =findViewById(R.id.editText);
        edit2 =findViewById(R.id.editText2);
        edit3 =findViewById(R.id.editText3);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                String name1=""+ edit1.getText().toString();
                String name2=""+ edit2.getText().toString();
                String rounds=""+ edit3.getText().toString();
                intent.putExtra("KEY",name1);
                intent.putExtra("PUT",name2);
                intent.putExtra("ROUND",rounds);
                startActivity(intent);
            }
        });
    }

}