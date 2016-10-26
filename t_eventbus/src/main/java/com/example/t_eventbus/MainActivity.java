package com.example.t_eventbus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity
        extends AppCompatActivity
        implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button   buttton = (Button) findViewById(R.id.btn);
        TextView tv      = (TextView) findViewById(R.id.tv);
        buttton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, SecondActivity.class));
    }
}
