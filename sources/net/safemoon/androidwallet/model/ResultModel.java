package net.safemoon.androidwallet.model;

import com.google.gson.annotations.SerializedName;

public class ResultModel {
    @SerializedName("result")
    private String result;

    public String getResult() {
        return this.result;
    }
}
