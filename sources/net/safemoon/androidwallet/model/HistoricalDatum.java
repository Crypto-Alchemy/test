package net.safemoon.androidwallet.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class HistoricalDatum implements Serializable {
    @SerializedName("quote")
    @Expose
    private Quote quote;

    public Quote getQuote() {
        return this.quote;
    }

    public void setQuote(Quote quote2) {
        this.quote = quote2;
    }
}
