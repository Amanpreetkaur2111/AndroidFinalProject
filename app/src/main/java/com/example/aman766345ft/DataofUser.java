package com.example.aman766345ft;

import android.content.Context;

import java.util.ArrayList;

public class DataofUser  {

   public String StoreName;
   public String StoreEmail;
    public String StorePhone;


    public DataofUser(String storeName, String storeEmail, String storePhone) {
        StoreName = storeName;
        StoreEmail = storeEmail;
        StorePhone = storePhone;

    }

    public String getStoreName() {
        return StoreName;
    }

    public String getStoreEmail() {
        return StoreEmail;
    }

    public String getStorePhone() {
        return StorePhone;
    }



    public static ArrayList<DataofUser> DetailsofUser = new ArrayList<>();




}
