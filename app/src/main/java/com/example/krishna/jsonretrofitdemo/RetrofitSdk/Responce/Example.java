package com.example.krishna.jsonretrofitdemo.RetrofitSdk.Responce;

import com.example.krishna.jsonretrofitdemo.RetrofitSdk.Model.Emarket;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by pc41 on 28-10-2017.
 */

public class Example {

    @SerializedName("result")
    @Expose
    private String result;
    @SerializedName("emarket")
    @Expose
    private List<Emarket> emarket = null;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<Emarket> getEmarket() {
        return emarket;
    }

    public void setEmarket(List<Emarket> emarket) {
        this.emarket = emarket;
    }

}