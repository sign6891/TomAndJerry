package com.example.tomandjerry;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void eraseTom(View view) {
        ImageView tomImageView = findViewById(R.id.tomImageView);
        ImageView jerryImageView = findViewById(R.id.jerryImageView);

        if (tomImageView.getAlpha() == 1) {
            tomImageView.animate().scaleX(0f).scaleY(0f).alpha(0).rotation(tomImageView.getRotation() + 3600).setDuration(3000);
            jerryImageView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1).rotation(jerryImageView.getRotation() + 3600).setDuration(3000);
        } else {
            jerryImageView.animate().scaleX(0f).scaleY(0f).rotation(jerryImageView.getRotation() + 3600).alpha(0).setDuration(3000);
            tomImageView.animate().scaleX(1.0f).scaleY(1.0f).rotation(tomImageView.getRotation() + 3600).alpha(1).setDuration(3000);
        }
    }
}
