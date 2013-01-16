package com.example.todo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

public class TodoActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ListView listView = (ListView) findViewById(R.id.myListView); // GUI 객체(myListView)와 코드의 객체(listView)를 연결
        final EditText editText = (EditText) findViewById(R.id.myEditTExt);
    }
}
