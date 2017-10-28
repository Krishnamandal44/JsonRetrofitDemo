package com.example.krishna.jsonretrofitdemo;

/**
 * Created by Admin on 04-09-2017.
 */

public class EMarketPojo {
    private String id, text, imageUrl;

    public EMarketPojo(){}

    public EMarketPojo(String id, String text, String imageUrl) {
        this.id = id;
        this.text = text;
        this.imageUrl = imageUrl;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

}
