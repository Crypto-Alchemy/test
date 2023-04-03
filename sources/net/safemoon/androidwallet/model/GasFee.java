package net.safemoon.androidwallet.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class GasFee implements Serializable {
    private static final long serialVersionUID = 6273532486794841250L;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("message")
    @Expose
    private String message;

    public class Data implements Serializable {
        private static final long serialVersionUID = -4755758722132112641L;
        @SerializedName("amount")
        @Expose
        private Float amount;

        public Data() {
        }

        public Float getAmount() {
            return this.amount;
        }

        public void setAmount(Float f) {
            this.amount = f;
        }
    }

    public String getCode() {
        return this.code;
    }

    public Data getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setData(Data data2) {
        this.data = data2;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
