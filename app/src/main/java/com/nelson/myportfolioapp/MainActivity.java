package com.nelson.myportfolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button popularMovies, stockHawk, buildBigger, materialize, ubiquitous, capstone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        popularMovies = (Button) findViewById(R.id.popular_movies);
        stockHawk = (Button) findViewById(R.id.stock_hawk);
        buildBigger = (Button) findViewById(R.id.build_bigger);
        materialize = (Button) findViewById(R.id.materialize);
        ubiquitous = (Button) findViewById(R.id.ubiquitous);
        capstone = (Button) findViewById(R.id.capstone);

        popularMovies.setOnClickListener(this);
        stockHawk.setOnClickListener(this);
        buildBigger.setOnClickListener(this);
        materialize.setOnClickListener(this);
        ubiquitous.setOnClickListener(this);
        capstone.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){

            case R.id.popular_movies:
                showToast(getString(R.string.popular_movies));
                break;
            case R.id.stock_hawk:
                showToast(getString(R.string.stock_hawk));
                break;
            case R.id.build_bigger:
                showToast(getString(R.string.build_bigger));
                break;
            case R.id.materialize:
                showToast(getString(R.string.materialize));
                break;
            case R.id.ubiquitous:
                showToast(getString(R.string.ubiquitous));
                break;
            case R.id.capstone:
                showToast(getString(R.string.capstone));
                break;
        }
    }

    public void showToast(String name){
        Toast.makeText(this,name,Toast.LENGTH_LONG).show();
    }
}
