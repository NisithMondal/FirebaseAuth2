package com.nisith.firebaseauth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTitle("Home Activity");
        Button logoutButton = findViewById(R.id.logout_button);
        firebaseAuth = FirebaseAuth.getInstance();
        logoutButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                firebaseAuth.signOut();
            }
        });

    }
}
