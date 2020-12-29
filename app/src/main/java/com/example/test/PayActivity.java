package com.example.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PayActivity extends AppCompatActivity
{
    DbHelper db;
    TextView amt;
    Button pay,home;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
        db = new DbHelper(this);
        int flag = 0, units = 0, amount = 0,  id = 0;
        Intent intent = getIntent();
        final String username = intent.getStringExtra("username");
        amt = (TextView)findViewById(R.id.amt);
        Cursor res = db.getAllData2();
        while (res.moveToNext())
        {
            if(username.equals(res.getString(1)))
            {
                if(res.getString(4).equals("Not Paid"))
                {
                    units = res.getInt(2);
                    amount = res.getInt(3);
                    id = res.getInt(0);
                }
                else
                    flag = 1;
            }
        }
        final int u = units, a = amount, i = id, f = flag;
        amt.setText("Total amount to pay is " + units);
        pay = (Button)findViewById(R.id.pay);
        pay.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(f == 0)
                {
                    boolean isUpdate;
                    if(db.updateData2(i, username, u, a, "Paid"))
                        isUpdate = true;
                    else
                        isUpdate = false;
                    if(isUpdate)
                        Toast.makeText(PayActivity.this,"Paid successfully",Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(PayActivity.this,"Could not pay, please try again",Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(PayActivity.this,"You have already paid",Toast.LENGTH_LONG).show();
            }
        });
        home = (Button)findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(PayActivity.this,LoggedActivity.class);
                intent.putExtra("username",username);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.logout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        if(item.getItemId() == R.id.logout)
        {
            Intent i = new Intent(PayActivity.this, MainActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}