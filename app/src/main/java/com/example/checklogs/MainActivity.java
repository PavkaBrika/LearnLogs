package com.example.checklogs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView frstText = (TextView) findViewById(R.id.menu_item_1);
        Log.i("MainActivity.java", (String) frstText.getText());
        // Find second menu item TextView and print the text to the logs
        TextView scndText = (TextView) findViewById(R.id.menu_item_2);
        Log.i("MainActivity.java", (String) scndText.getText());
        // Find third menu item TextView and print the text to the logs
        TextView thrdText = (TextView) findViewById(R.id.menu_item_3);
        Log.i("MainActivity.java", (String) thrdText.getText());
    }
}