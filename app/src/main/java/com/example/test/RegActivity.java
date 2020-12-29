package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class RegActivity extends AppCompatActivity
{
    DbHelper db;
    EditText user,pass,mn,eid;
    Button reg,home;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        db = new DbHelper(this);
        user = (EditText)findViewById(R.id.user);
        pass = (EditText)findViewById(R.id.pass);
        mn = (EditText)findViewById(R.id.mn);
        eid = (EditText)findViewById(R.id.eid);
        reg = (Button)findViewById(R.id.register);
        home = (Button)findViewById(R.id.home);
        reg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String m = mn.getText().toString();
                int l = m.length(), i = check(l);
                if(i==0)
                {
                    boolean isInserted;
                    if (db.insertData(user.getText().toString(),pass.getText().toString(),m,eid.getText().toString()))
                        isInserted = true;
                    else
                        isInserted = false;
                    Random random = new Random();
                    int units = random.nextInt(500), amount = calcAmt(units);
                    boolean isInserted2;
                    if (db.insertData2(user.getText().toString(),units,amount,"Not Paid"))
                        isInserted2 = true;
                    else
                        isInserted2 = false;
                    if(isInserted && isInserted2)
                        Toast.makeText(RegActivity.this,"Registered Successfully",Toast.LENGTH_LONG).show();
                }
                else
                {
                    if(i == 1)
                        Toast.makeText(RegActivity.this,"Mobile number should be 10 digits",Toast.LENGTH_LONG).show();
                    if(i == 2)
                        Toast.makeText(RegActivity.this,"Username already exists",Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(RegActivity.this,"Could not register, please try again",Toast.LENGTH_LONG).show();
                }
            }
        });
        home.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(RegActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    public int check(int l)
    {
        int i=0, flag = 0;
        Cursor res = db.getAllData2();
        if(l != 10)
        {
            i=1;
            return i;
        }
        while(res.moveToNext())
        {
            if(user.getText().toString().equals(res.getString(1)))
            {
                flag = 1;
                break;
            }
        }
        if(flag == 1)
        {
            i = 2;
            return i;
        }
        return i;
    }

    public int calcAmt(int units)
    {
        int amount = 0;
        if(units<=30)
            amount = 3*units;
        else if(units>30 && units<=100)
            amount = 3*30 + 5*(units - 30);
        else if(units>100 && units<=200)
            amount = 3*30 + 5*70 + 6*(units - 100);
        else
            amount = 3*30 + 5*70 + 6*100 + 7*(units - 200);
        return amount;
    }
}