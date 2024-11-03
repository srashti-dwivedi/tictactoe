package com.example.tictactoe;

import android.media.Image;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.os.Handler;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        ImageView imageview=findViewById(R.id.imageView);
        TextView textView=findViewById(R.id.textView2);


        Animation translateAnimation= AnimationUtils.loadAnimation(this,R.anim.splash);
        Animation scaleAnimation=AnimationUtils.loadAnimation(this,R.anim.scale);

        imageview.startAnimation(scaleAnimation);
        textView.startAnimation(translateAnimation);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashScreen.this, MainActivity.class);
            startActivity(intent);
            finish(); // Close the splash activity
        }, 3000);
    }



}