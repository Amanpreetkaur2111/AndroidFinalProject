package com.example.aman766345ft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

public class Verify extends AppCompatActivity {

    GridView gridview;
    Button verify;
    ImageView refresh;

    int[] trafficimages = {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7,R.drawable.img8,R.drawable.img9};

    public void changeSource(View view){
       // ImageView img1 = (ImageView) view;
       // img1.setImageResource(R.drawable.checked);
       // img1.setBackgroundResource(R.drawable.img1);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        gridview = findViewById(R.id.collImages);
        verify = findViewById(R.id.verified);
        refresh = findViewById(R.id.refresh);

        final TrafficLights trafficlights = new TrafficLights(this,trafficimages);
        gridview.setAdapter(trafficlights);


        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ImageView imageView = view.findViewById(R.id.image_view);
                imageView.setImageResource(R.drawable.checked);
            }
        });


        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Verify.this,MainActivity.class);
                startActivity(intent);
            }
        });


/*
        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (int i = trafficimages.length ; i > 5; i--){

                    int simage = trafficimages[i];
                    trafficimages[i] = trafficimages[i-1];
                    trafficimages[i-1] = simage;

                }

                gridview.setAdapter(trafficlights);
                trafficlights.notifyDataSetChanged();

            }
        });
*/
    }

}
