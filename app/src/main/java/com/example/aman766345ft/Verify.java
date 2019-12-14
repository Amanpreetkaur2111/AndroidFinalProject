package com.example.aman766345ft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class Verify extends AppCompatActivity {

    GridView gridview;
    Button verify;
    ImageButton refresh;


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

        Button btn = findViewById(R.id.verified);
        final CheckBox checkBox = findViewById(R.id.Check);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox.isChecked()){
                    Intent intent = new Intent(Verify.this,MainActivity.class);
                    startActivity(intent);
                }
                else Toast.makeText(Verify.this,"please check the checked button",Toast.LENGTH_SHORT).show();
            }
        });

        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gridview.setAdapter(trafficlights);
                int index, temporary;
                Random random = new Random();
                for(int i = trafficimages.length - 1 ; i>0;i--){
                    index = random.nextInt(i+1);
                    temporary = trafficimages[index];
                    trafficimages[index] = trafficimages[i];
                    trafficimages[i] = temporary;

                }

                gridview.deferNotifyDataSetChanged();

            }
        });



/*

*/
    }

}
