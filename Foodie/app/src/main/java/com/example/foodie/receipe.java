package com.example.foodie;

import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SearchEvent;

import android.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;


public class  receipe extends AppCompatActivity {


    Toolbar mtoolbar;
    SearchView search;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receipe);
        search = (SearchView) findViewById(R.id.seachbutton);
        mtoolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);
        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_items,menu);
        return true;
    }
}
