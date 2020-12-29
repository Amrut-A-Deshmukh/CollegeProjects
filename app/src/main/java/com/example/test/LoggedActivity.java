package com.example.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoggedActivity extends AppCompatActivity
{
    Button pyb,complaint,cc;
    TextView hi;
    DbHelper db;
    Intent intent = getIntent();
    final String user = intent.getStringExtra("username");
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged);
        db = new DbHelper(this);
        pyb = (Button)findViewById(R.id.pyb);
        pyb.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent2 = new Intent(LoggedActivity.this,PayActivity.class);
                intent2.putExtra("username",user);
                startActivity(intent2);
            }
        });
        cc = (Button)findViewById(R.id.cc);
        complaint = (Button)findViewById(R.id.complaint);
        registerForContextMenu(complaint);
        hi = (TextView)findViewById(R.id.hi);
        hi.setText("Hi "+user);
        cc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent1 = new Intent(LoggedActivity.this,CareLoginActivity.class);
                intent1.putExtra("username",user);
                startActivity(intent1);
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.complaint,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item)
    {
        if(item.getItemId() == R.id.ryc)
        {
            Intent intent = new Intent(LoggedActivity.this,RegComplaintActivity.class);
            intent.putExtra("username",user);
            startActivity(intent);
        }
        else
        {
            String status = " ";
            int flag = 0;
            Cursor cursor = db.getAllData3();
            while (cursor.moveToNext())
            {
                if(user.equals(cursor.getString(1)))
                {
                    status = cursor.getString(3);
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)
            {
                AlertDialog.Builder a = new AlertDialog.Builder(LoggedActivity.this);
                a.setMessage("The status of your complaint is "+ status).setCancelable(true);
                AlertDialog alertDialog = a.create();
                alertDialog.setTitle("Complaint");
                alertDialog.show();
            }
            else
                Toast.makeText(LoggedActivity.this,"You have not registered any complaints",Toast.LENGTH_LONG).show();
        }
        return super.onContextItemSelected(item);
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
            Intent i = new Intent(LoggedActivity.this, MainActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}