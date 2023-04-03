package net.safemoon.androidwallet.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WalletModel {
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
        @SerializedName("address")
        @Expose
        public String address;
        @SerializedName("privateKey")
        @Expose
        public String privateKey;

        public Data() {
        }
    }
}
