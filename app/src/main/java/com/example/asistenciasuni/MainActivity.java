package com.example.asistenciasuni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Animation topanim,bottomanim;
ImageView image,imuni;
TextView T1,T2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        topanim= AnimationUtils.loadAnimation(this, R.anim.topanimation);
        bottomanim= AnimationUtils.loadAnimation(this, R.anim.bottom);
        image=findViewById(R.id.ImVEstu);
        imuni=findViewById(R.id.Uni);
        T1=findViewById(R.id.textView2);
        T2=findViewById(R.id.textView3);
        image.setAnimation(topanim);
        imuni.setAnimation(topanim);
        T1.setAnimation(bottomanim);
        T2.setAnimation(bottomanim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this, Login.class);
                startActivity(intent);
                finish();
            }
        },4000);
    }
}