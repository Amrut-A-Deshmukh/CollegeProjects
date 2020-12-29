package com.example.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class CareLoginActivity extends AppCompatActivity
{
    Button home;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_care_login);
        home = (Button)findViewById(R.id.home);
        final Intent intent = getIntent();
        final String user = intent.getStringExtra("username");
        home.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent1 = new Intent(CareLoginActivity.this,LoggedActivity.class);
                intent1.putExtra("username",user);
                startActivity(intent1);
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
            Intent intent2 = new Intent(CareLoginActivity.this,MainActivity.class);
            startActivity(intent2);
        }
        return super.onOptionsItemSelected(item);
    }
}