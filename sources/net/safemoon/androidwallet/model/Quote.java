package net.safemoon.androidwallet.model;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.lang.reflect.Type;

public class Quote implements Serializable {
    @SerializedName("USD")
    @Expose
    private USDT USD;
    @SerializedName("USDT")
    @Expose
    private USDT USDT;

    public USDT getUSD() {
        USDT usdt = this.USD;
        if (usdt == null) {
            return this.USDT;
        }
        return usdt;
    }

    public String toString() {
        return new Gson().toJson((Object) this, (Type) Quote.class);
    }
}
