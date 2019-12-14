package com.example.aman766345ft;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.EventLogTags;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 *
 */
interface Listener{
    void onItemClick(int id);
}
public class AddProfile extends Fragment  {

    private Listener listener;

//   public Context context;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.listener = (Listener) context;
    }

    public AddProfile() {
        // Required empty public constructor

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_profile,container,false);
//       View view = getView();
//       Button Add;
//       ListView listView;
//       listView = view.findViewById(R.id.ListUsers);
//       if (!DataofUser.DetailsofUser.isEmpty()) {
//           DataofUser_Adapter dataofUser = new DataofUser_Adapter(inflater.getContext(), R.layout.activity_after_verification, DataofUser.DetailsofUser);
//           listView.setAdapter(dataofUser);
//           listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                        @Override
//                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                           if(listener != null)
//                                listener.onItemClick(i);
//
//                        }
//                    });
//
//
//        }
       return view;

    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();

        Button Add;
        ListView listView;
        if(view !=  null){
        listView = view.findViewById(R.id.ListUsers);
            Button addButton = view.findViewById(R.id.AddBtn);
            DataofUser_Adapter dataofUser = new DataofUser_Adapter(getContext(), R.layout.activity_after_verification, DataofUser.DetailsofUser);
            listView.setAdapter(dataofUser);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    if (listener != null)
                        listener.onItemClick(i);

                }
            });



                addButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getContext(), Register_User.class);
                        startActivity(intent);

                    }
                });


            }

        }


    }

