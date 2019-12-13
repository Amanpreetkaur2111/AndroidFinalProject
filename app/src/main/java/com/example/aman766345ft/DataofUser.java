package com.example.aman766345ft;

import java.io.Serializable;
import java.util.ArrayList;

public class DataofUser  {

   public String StoreName;
   public String StoreEmail;
    public String StorePhone;

    public DataofUser(String storeName, String storeEmail, String storePhone) {
        StoreName = storeName;
        StoreEmail = storeEmail;
        StorePhone =  storePhone;
    }

public static ArrayList<String> DetailsofUser = new ArrayList<>();
}
