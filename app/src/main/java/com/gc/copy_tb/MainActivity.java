package com.gc.copy_tb;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;

import com.blankj.utilcode.util.ToastUtils;
import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.navigation)
    NavigationView navigation;
    private long clickTime = 0; //记录第一次点击的时间

    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Log.d(TAG, "返回键:按下了返回键");
            exit();
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void exit() {
        if ((System.currentTimeMillis() - clickTime) > 2000) {
            ToastUtils.showShort("再按一次退出");
            clickTime = System.currentTimeMillis();
        } else {
            finish();
            ToastUtils.cancel();
        }
    }

}
