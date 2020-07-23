package com.gc.copy_tb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_png);

        startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
        finish();
    }
}
