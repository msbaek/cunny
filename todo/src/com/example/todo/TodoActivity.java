package com.example.todo;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

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

        final ArrayList<String> todoItems = new ArrayList<String>(); // 할일을 저장할 ArrayList를 생성
        final ArrayAdapter<String> aa; // (1) ArrayList의 내용을 ListView와 연동시켜주는 ArrayAdapter를 정의
        aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, todoItems); // (2) ArrayAdapter 설정
        listView.setAdapter(aa); // (3) ListView와 ArrayAdapter를 연결

        editText.setOnKeyListener(new View.OnKeyListener() { // (1)
            public boolean onKey(View v, int keyCode, KeyEvent event) { // (2)
                if(event.getAction() == KeyEvent.ACTION_DOWN) { // (3)
                    if(keyCode == KeyEvent.KEYCODE_ENTER) {
                        todoItems.add(0, editText.getText().toString()); //(4)
                        aa.notifyDataSetChanged(); // (5)
                        editText.setText(""); // (6)
                        return true;
                    }
                }
                return false;
            }
        });
    }
}
