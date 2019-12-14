package com.example.aman766345ft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements Listener {

    private boolean mIsDualPane = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       View detailView = findViewById(R.id.profile);
      mIsDualPane = detailView != null && detailView.getVisibility() == View.VISIBLE;
    }

    @Override
    public void onItemClick(int id) {

      if(mIsDualPane) {

           Description_Fragment description_fragment = (Description_Fragment) getSupportFragmentManager().findFragmentById(R.id.profile);
           description_fragment.displayDetails(id);
      }
       else{

            Intent intent = new Intent(this,Description_Activity.class);
            intent.putExtra(Description_Activity.TAG,id);
            startActivity(intent);
        }

    }


}
