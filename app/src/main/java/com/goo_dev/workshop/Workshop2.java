package com.goo_dev.workshop;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Workshop2 extends Activity {

    private TextView workshop2View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workshop2);

        workshop2View = (TextView) findViewById(R.id.name);

        workshop2View.setText("Hello "+(getIntent().getStringExtra("userName"))+"Welcome to My App");
    }
}
