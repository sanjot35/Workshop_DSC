package com.goo_dev.workshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Workshop1 extends AppCompatActivity implements View.OnClickListener {
  private EditText userE,passwordE;
  private Button submitE;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workshop1);

        userE=(EditText) findViewById(R.id.user);
        passwordE=(EditText) findViewById(R.id.pass);
        submitE=(Button) findViewById(R.id.submit);

        submitE.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){

            case R.id.submit:
                String name=userE.getText().toString();
                String pass=passwordE.getText().toString();
                if(pass.equals("welcome")) {
                    Intent intent=new Intent(getApplicationContext(), Workshop2.class);
                    intent.putExtra("userName",name);
                    startActivity(intent);
                }

                else
                    Toast.makeText(getApplicationContext(),"Try Again!", Toast.LENGTH_LONG).show();
    }


}

    }
