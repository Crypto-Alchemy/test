package net.safemoon.androidwallet.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Error {
    @SerializedName("code")
    @Expose
    public String code;
    @SerializedName("message")
    @Expose
    public String message;
}
