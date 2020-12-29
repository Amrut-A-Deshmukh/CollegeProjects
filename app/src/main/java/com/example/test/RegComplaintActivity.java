package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class RegComplaintActivity extends AppCompatActivity
{
    DbHelper db;
    EditText reg;
    Button regis, home;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_complaint);
        db = new DbHelper(this);
        Intent intent = getIntent();
        final String user = intent.getStringExtra("username");
        reg = (EditText)findViewById(R.id.regcomp);
        regis = (Button)findViewById(R.id.reg);
        home = (Button)findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(RegComplaintActivity.this,LoggedActivity.class);
                intent.putExtra("username",user);
                startActivity(intent);
            }
        });
        final String status = status();
        regis.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                boolean isReg;
                if(db.insertData3(user,reg.getText().toString(),status))
                    isReg = true;
                else
                    isReg = false;
                if(isReg)
                    Toast.makeText(RegComplaintActivity.this,"Registered complaint successfully",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(RegComplaintActivity.this,"Complaint could not be registered please try again",Toast.LENGTH_LONG).show();
            }
        });
    }

    public String status()
    {
        String status;
        Random random = new Random();
        int rand = random.nextInt(2);
        if(rand == 0)
            status = "Not Resolved";
        else
            status = "Resolved";
        return  status;
    }
}