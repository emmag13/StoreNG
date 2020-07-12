package com.storeng.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    Animation anim;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        this.imageView = findViewById(R.id.logo);
        this.anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);

        this.anim.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationStart(Animation animation) {
            }

            public void onAnimationEnd(Animation animation) {
                SplashActivity.this.finish();
                SplashActivity splashActivity = SplashActivity.this;
                splashActivity.startActivity(new Intent(splashActivity, MainActivity.class));
            }

            public void onAnimationRepeat(Animation animation) {
            }
        });
        this.imageView.startAnimation(this.anim);
    }
}
