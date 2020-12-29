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
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    DbHelper db;
    Button Reg,login;
    EditText user,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new DbHelper(this);
        Reg = (Button)findViewById(R.id.register);
        Reg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this, RegActivity.class);
                startActivity(i);
            }
        });
        login = (Button)findViewById(R.id.login);
        user = (EditText) findViewById(R.id.user);
        pass = (EditText) findViewById(R.id.pass);
        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int flag=0;
                Cursor res = db.getAllData();
                if(res.getCount() == 0)
                    Toast.makeText(MainActivity.this,"Invalid Username or password",Toast.LENGTH_LONG).show();
                else
                {
                    while (res.moveToNext())
                    {
                        if(user.getText().toString().equals(res.getString(1)) && pass.getText().toString().equals(res.getString(2)))
                        {
                            flag=1;
                            break;
                        }
                    }
                    if(flag == 1)
                    {
                        Intent intent = new Intent(MainActivity.this,LoggedActivity.class);
                        intent.putExtra("username",user.getText().toString());
                        startActivity(intent);
                    }
                    else
                        Toast.makeText(MainActivity.this,"Invalid Username or password",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.customer,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        if(item.getItemId() == R.id.cust)
        {
            Intent intent = new Intent(MainActivity.this,Care.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}