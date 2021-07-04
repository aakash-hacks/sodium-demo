package com.example.sodium1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    Animation leftAnim;
    EditText emailAd, passWord;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        leftAnim = AnimationUtils.loadAnimation(this,R.anim.slide_left_in);

        emailAd = findViewById(R.id.editEmailAd);
        passWord = findViewById(R.id.editTextPassword);

        emailAd.setAnimation(leftAnim);
        passWord.setAnimation(leftAnim);


    }
}