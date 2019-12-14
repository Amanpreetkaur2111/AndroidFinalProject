package com.example.aman766345ft;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Description_Fragment extends Fragment {

    int[] imageIcons = {R.drawable.icon01_10, R.drawable.icon01_02, R.drawable.icon01_03, R.drawable.icon01_04,
            R.drawable.icon01_05, R.drawable.icon01_06, R.drawable.icon01_07, R.drawable.icon01_08, R.drawable.icon01_09,
            R.drawable.icon01_10};


    public Description_Fragment() {
        // Required empty public constructor
    }

public void displayDetails(int id){

        View view = getView();
        if(view!= null){

            ImageView image_view = view.findViewById(R.id.dImage);
            TextView text_view  = view.findViewById(R.id.dName);
            TextView text_view2 = view.findViewById(R.id.dEmail);
            TextView text_view3 = view.findViewById(R.id.dPhone);

            DataofUser dataofUser = DataofUser.DetailsofUser.get(id);

            text_view.setText(dataofUser.getStoreName());
            text_view2.setText(dataofUser.getStoreEmail());
            text_view3.setText(dataofUser.getStorePhone());
             image_view.setImageResource(R.drawable.icon01_01);

        }
}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_description_, container, false);
    }



}
