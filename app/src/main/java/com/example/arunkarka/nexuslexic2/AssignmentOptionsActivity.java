package com.example.arunkarka.nexuslexic2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class AssignmentOptionsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment_options);

        String[] assignmentOptions = {"Assignment One", "Assignment Two", "Assignment three", "Assignment four"};
        final ListView assignmentOptionsListView = (ListView) findViewById(R.id.assignment_options_list_view);

        ArrayAdapter<String> assignmentOptionsListAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, assignmentOptions);

        assignmentOptionsListView.setAdapter(assignmentOptionsListAdapter);

        ListView.OnItemClickListener studentListViewItemClickListener = new ListView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int itemPosition = position;

                String itemValue = (String) assignmentOptionsListView.getItemAtPosition(itemPosition);
                // Launch a specific Assignment Option
                //
            }
        };

        assignmentOptionsListView.setOnItemClickListener(studentListViewItemClickListener);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_assignment_options, menu);
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
}
