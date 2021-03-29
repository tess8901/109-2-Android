package com.example.android.hw4_1_107590027;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class hello extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();
        String str = bundle.getString("count");
        setContentView(R.layout.activity_hello);
        text = (TextView) findViewById(R.id.textView);
        text.setText(str);
    }

    public void camerm(View view) {
        Intent intent = new Intent(); //呼叫照相機
        intent.setAction("android.media.action.STILL_IMAGE_CAMERA");
        startActivity(intent);
    }

}
