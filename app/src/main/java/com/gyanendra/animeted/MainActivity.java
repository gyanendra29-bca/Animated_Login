package com.gyanendra.animeted;

import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout lyt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lyt=(ConstraintLayout)findViewById(R.id.layout);
        AnimationDrawable animationDrawable =(AnimationDrawable) lyt.getBackground();
        animationDrawable.setEnterFadeDuration(3000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();
    }
}