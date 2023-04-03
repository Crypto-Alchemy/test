package net.safemoon.androidwallet.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public class Data implements Serializable {
    private final String BNB_TOKEN = "BNB";
    private final String SAFE_MOON_TOKEN = "SAFEMOON";
    private final String SAFE_MOON_V2_TOKEN = "SFM";
    @SerializedName("BNB")
    @Expose
    private Coin bnb;
    @SerializedName("id")
    @Expose

    /* renamed from: id */
    private Integer f42445id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("quotes")
    @Expose
    private List<HistoricalDatum> quotes = null;
    @SerializedName("SAFEMOON")
    @Expose
    private Coin safemoon;
    @SerializedName("SFM")
    @Expose
    private Coin safemoonv2;
    @SerializedName("symbol")
    @Expose
    private String symbol;

    public Coin getBnb() {
        return this.bnb;
    }

    public Integer getId() {
        return this.f42445id;
    }

    public String getName() {
        return this.name;
    }

    public List<HistoricalDatum> getQuotes() {
        return this.quotes;
    }

    public Coin getSafemoon() {
        return this.safemoon;
    }

    public Coin getSafemoonV2() {
        return this.safemoonv2;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public void setBnb(Coin coin) {
        this.bnb = coin;
    }

    public void setId(Integer num) {
        this.f42445id = num;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setQuotes(List<HistoricalDatum> list) {
        this.quotes = list;
    }

    public void setSafemoon(Coin coin) {
        this.safemoon = coin;
    }

    public void setSafemoonv2(Coin coin) {
        this.safemoonv2 = coin;
    }

    public void setSymbol(String str) {
        this.symbol = str;
    }
}
