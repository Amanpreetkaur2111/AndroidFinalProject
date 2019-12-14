package com.example.aman766345ft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Description_Activity extends AppCompatActivity {

    public static final String TAG = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_);

        Description_Fragment description_fragment = (Description_Fragment) getSupportFragmentManager().findFragmentById(R.id.profile);
        Intent intent = getIntent();
        int id = intent.getExtras().getInt(TAG);
        description_fragment.displayDetails(id);

    }
}
