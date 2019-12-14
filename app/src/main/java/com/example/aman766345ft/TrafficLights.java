package com.example.aman766345ft;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class TrafficLights extends BaseAdapter {
    Context context;
    int[] trafficimages;

    public TrafficLights(Context context, int[] trafficimages) {
        this.context = context;
        this.trafficimages = trafficimages;
    }

    @Override
    public int getCount() {
        return trafficimages.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null)
            view = LayoutInflater.from(context).inflate(R.layout.cell_items,null);
        ImageView imageView = view.findViewById(R.id.image_view);
        imageView.setBackgroundResource(trafficimages[i]);
        return view;

    }
}
