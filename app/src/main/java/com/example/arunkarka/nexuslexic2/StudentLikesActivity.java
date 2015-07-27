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
import android.widget.Toast;


public class StudentLikesActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_likes);
        String[] studentLikesList = {"Sports", "Music", "Art", "Reading"};
        final ListView studentLikesListView = (ListView) findViewById(R.id.student_likes_list_view);

        ArrayAdapter<String> studentLikesListAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, studentLikesList);

        studentLikesListView.setAdapter(studentLikesListAdapter);

        ListView.OnItemClickListener studentLikesListViewItemClickListener = new ListView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int itemPosition = position;

                String itemValue = (String) studentLikesListView.getItemAtPosition(itemPosition);
                // Launch Assignment Options
                startAssignmentOptionsActivity();

            }
        };

        studentLikesListView.setOnItemClickListener(studentLikesListViewItemClickListener);
    }

    private void startAssignmentOptionsActivity() {
        Intent assignmentOptionsIntent = new Intent(this, AssignmentOptionsActivity.class);
        startActivity(assignmentOptionsIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_student_likes, menu);
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
