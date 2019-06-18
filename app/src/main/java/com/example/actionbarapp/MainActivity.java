package com.example.actionbarapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionbar=getSupportActionBar();
        actionbar.setTitle("   Welcome Bro!");
        //actionbar.setSubtitle("   How are you?");
        actionbar.setIcon(R.drawable.icon);
        //actionbar.setDisplayUseLogoEnabled(true);
        actionbar.setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.i1:
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
                break;
            case R.id.i2: Toast.makeText(this,"downloaded!",Toast.LENGTH_LONG).show();
                break;
            case R.id.i3: Toast.makeText(this,"copied!",Toast.LENGTH_LONG).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
