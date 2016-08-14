package com.example.johnny.newstest.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.example.johnny.newstest.R;

/**
 * Created by Johnny on 2016/8/11.
 */

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }
}
