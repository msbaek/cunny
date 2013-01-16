package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class HelloAndroid extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        ImageView view = new ImageView(this);
        view.setImageResource(R.drawable.ic_launcher);
        setContentView(view);
    }
}
