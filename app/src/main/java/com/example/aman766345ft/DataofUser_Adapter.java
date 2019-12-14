package com.example.aman766345ft;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;
import java.util.Random;

public class DataofUser_Adapter extends ArrayAdapter {

    private List<DataofUser> Users;
    private final LayoutInflater layoutInflater;
    private final int layoutResource;


    public DataofUser_Adapter(@NonNull Context context, int resource,List<DataofUser> Users) {
        super(context, resource, resource);
        this.Users = Users;
        this.layoutInflater = LayoutInflater.from(context);
        this.layoutResource = resource;
    }

    @Override
    public int getCount() {
        return Users.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if(v == null)
            v = layoutInflater.inflate(layoutResource,parent,false);
        ImageView IV = v.findViewById(R.id.imageView);
        TextView TV1 = v.findViewById(R.id.textView2);
        TextView TV2 = v.findViewById(R.id.textView3);
        TextView Tv3 = v.findViewById(R.id.textView4);


        TV1.setText(Users.get(position).getStoreName());
        TV2.setText(Users.get(position).getStoreEmail());
        Tv3.setText(Users.get(position).getStorePhone());
        IV.setImageResource(R.drawable.icon01_01);


        return v;
    }


    static int[] shuffleImages(int[] arrayListofImages){
        Random random = new Random();
        for (int i = 0; i< 5; i++){

            int index = random.nextInt(5);
            int check = arrayListofImages[index];
            arrayListofImages[i] = check;
        }
        return arrayListofImages;
    }
}
