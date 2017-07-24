package com.example.mudit.trip;

/**
 * Created by mudit on 6/7/17.
 */

public class Item {
    private String tTitle;
    private String tDescription;
    private String tAddress;
    private String tTiming;
    private String tPhone;
    private String tPrice;
    private int tImageResourceID;

    public Item(int imageResourceID, String title, String description, String address, String timing, String price, String phone){
        tImageResourceID=imageResourceID;
        tTitle=title;
        tDescription=description;
        tAddress=address;
        tTiming=timing;
        tPrice=price;
        tPhone=phone;
    }

    public Item(int imageResourceId, String title, String description, String address, String timing, String price){
        tImageResourceID=imageResourceId;
        tTitle=title;
        tDescription=description;
        tAddress=address;
        tTiming=timing;
        tPrice=price;
    }

    public Item(int imageResourceID, String title, String description, String address, String phone){
        tImageResourceID=imageResourceID;
        tTitle=title;
        tDescription=description;
        tAddress=address;
        tPhone=phone;
    }

    public Item(int imageResourceID, String title, String description, String address){
        tImageResourceID=imageResourceID;
        tTitle=title;
        tDescription=description;
        tAddress=address;
    }

    public int getImageResourceID() { return tImageResourceID; }

    public String getTitle(){
        return tTitle;
    }

    public String getDescription() { return tDescription; }

    public String getAddress() { return tAddress; }

    public String getTiming() { return tTiming; }

    public String getPrice() { return tPrice; }

    public String getPhone() { return tPhone; }
}
