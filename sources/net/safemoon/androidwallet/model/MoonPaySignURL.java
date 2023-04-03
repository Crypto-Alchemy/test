package net.safemoon.androidwallet.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class MoonPaySignURL implements Serializable {
    private static final long serialVersionUID = 1044715113951217091L;
    @SerializedName("urlWithSignature")
    @Expose
    public String urlWithSignature;
}
