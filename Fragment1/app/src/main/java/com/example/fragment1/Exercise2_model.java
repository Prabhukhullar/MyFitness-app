package com.example.fragment1;

public class Exercise2_model extends Exercise_model{
    private String url;

    public Exercise2_model(int img, String txt) {
        super(img, txt);
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
