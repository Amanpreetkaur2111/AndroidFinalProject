package com.example.aman766345ft;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddProfile extends Fragment {

    public Context context;

    public AddProfile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        this.context = inflater.getContext();
        return inflater.inflate(R.layout.fragment_add_profile, container, false);

    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();

        if (view != null){

            Button addButton = view.findViewById(R.id.AddBtn);
            addButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context,Register_User.class);
                    startActivity(intent);

                }
            });


        }

    }
}
