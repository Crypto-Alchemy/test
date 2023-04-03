package net.safemoon.androidwallet.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AllCryptoList implements Serializable {
    @SerializedName("data")
    @Expose
    private List<Coin> data;

    public AllCryptoList() {
        this.data = new ArrayList();
    }

    public List<Coin> getData() {
        return this.data;
    }

    public void setData(List<Coin> list) {
        this.data = this.data;
    }

    public AllCryptoList(List<Coin> list) {
        new ArrayList();
        this.data = list;
    }
}
