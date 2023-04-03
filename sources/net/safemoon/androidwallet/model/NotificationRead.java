package net.safemoon.androidwallet.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NotificationRead {
    @SerializedName("code")
    @Expose
    public String code;
    @SerializedName("data")
    @Expose
    public Data data;
    @SerializedName("message")
    @Expose
    public String message;

    public class Data {
        @SerializedName("result")
        @Expose
        public String result;

        public Data() {
        }
    }
}
