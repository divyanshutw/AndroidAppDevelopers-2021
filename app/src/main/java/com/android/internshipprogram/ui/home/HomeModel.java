package com.android.internshipprogram.ui.home;

public class HomeModel
{

    int imageRes;
    String text;

    public HomeModel(int imageRes, String text) {
        this.imageRes = imageRes;
        this.text = text;
    }

    public int getImageRes() {
        return imageRes;
    }

    public String getText() {
        return text;
    }



}
