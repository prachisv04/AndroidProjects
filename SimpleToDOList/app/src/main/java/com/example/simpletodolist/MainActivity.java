package com.example.simpletodolist;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;





public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = (ListView) findViewById(R.id.ListView);
        final EditText text = (EditText) findViewById(R.id.edittext);

        final ArrayList<String> do_list = new ArrayList<String>();
        final ArrayAdapter<String> adapter;

        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, do_list);

        lv.setAdapter(adapter);

        text.setOnKeyListener(new View.OnKeyListener() {

            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // TODO Auto-generated method stub
                if (event.getAction() == KeyEvent.ACTION_DOWN) {
                    if ((keyCode == KeyEvent.KEYCODE_DPAD_CENTER)
                            || (keyCode == KeyEvent.KEYCODE_ENTER)) {
                        do_list.add(0, text.getText().toString());
                        adapter.notifyDataSetChanged();
                        text.setText("");
                        return true;
                    }
                }
                return false;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}