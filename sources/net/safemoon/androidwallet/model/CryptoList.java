package net.safemoon.androidwallet.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class CryptoList implements Serializable {
    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("status")
    @Expose
    private Status status;

    public Data getData() {
        return this.data;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setData(Data data2) {
        this.data = data2;
    }

    public void setStatus(Status status2) {
        this.status = status2;
    }
}
