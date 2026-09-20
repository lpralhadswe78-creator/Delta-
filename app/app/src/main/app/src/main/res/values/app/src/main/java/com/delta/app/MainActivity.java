package com.delta.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView delta = new TextView(this);
        delta.setText("डेल्टा");
        delta.setTextSize(42);
        delta.setTextColor(Color.BLACK);
        delta.setGravity(Gravity.CENTER);

        setContentView(delta);
    }
}
