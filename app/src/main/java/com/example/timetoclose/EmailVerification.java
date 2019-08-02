package com.example.timetoclose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;

public class EmailVerification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_verification);

        ConstraintLayout mLayout=(ConstraintLayout)findViewById(R.id.layout_email_verification);

        mLayout.setOnTouchListener(new OnSwipeTouchListener(EmailVerification.this) {

            public void onSwipeRight() {
                startActivity(new Intent(EmailVerification.this,LogIn.class));
                finish();
            }
            public void onSwipeLeft() {
                startActivity(new Intent(EmailVerification.this,NumberVerification.class));
                finish();
            }

        });

    }
}
