package com.example.yhao.floatwindow;

import android.os.Bundle;

import com.example.yhao.fixedfloatwindow.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
        ConstraintLayout constraintLayout;
    }
}
