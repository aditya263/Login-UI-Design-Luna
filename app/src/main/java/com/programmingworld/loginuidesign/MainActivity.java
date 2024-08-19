package com.programmingworld.loginuidesign;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView img_logo,img_button;
    private TextView tv_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_logo=findViewById(R.id.img_logo);
        img_button=findViewById(R.id.img_button);
        tv_name=findViewById(R.id.tv_name);

        Utils.blackIconStatusBar(MainActivity.this,R.color.light_background);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,LoginActivity.class);
                ActivityOptions options=ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,
                        Pair.create(img_logo,"logo"),
                        Pair.create(tv_name,"logo_text"),
                        Pair.create(img_button,"img_tree"));

                startActivity(intent,options.toBundle());
            }
        },3000);
    }
}