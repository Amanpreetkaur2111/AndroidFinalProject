package com.example.aman766345ft;

import java.io.Serializable;
import java.util.ArrayList;

public class DataofUser  {

   public String StoreName;
   public String StoreEmail;
    public String StorePhone;
    public int textView2;
    public int textView3;
    public int textView4;



    public DataofUser(String storeName, String storeEmail, String storePhone) {
        this.StoreName = storeName;
        this.StoreEmail = storeEmail;
        this.StorePhone =  storePhone;
    }

public static ArrayList<DataofUser> DetailsofUser = new ArrayList<>();




}
