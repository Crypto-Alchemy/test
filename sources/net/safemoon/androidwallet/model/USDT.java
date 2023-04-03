package net.safemoon.androidwallet.model;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.lang.reflect.Type;

public class USDT implements Serializable {
    @SerializedName("last_updated")
    @Expose
    private String lastUpdated;
    @SerializedName("market_cap")
    @Expose
    private Double marketCap;
    @SerializedName("percent_change_1h")
    @Expose
    private Double percentChange1h;
    @SerializedName("percent_change_24h")
    @Expose
    private Double percentChange24h;
    @SerializedName("percent_change_30d")
    @Expose
    private Double percentChange30d;
    @SerializedName("percent_change_60d")
    @Expose
    private Double percentChange60d;
    @SerializedName("percent_change_7d")
    @Expose
    private Double percentChange7d;
    @SerializedName("percent_change_90d")
    @Expose
    private Double percentChange90d;
    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("volume_24h")
    @Expose
    private Double volume24h;

    public String getLastUpdated() {
        return this.lastUpdated;
    }

    public Double getMarketCap() {
        return this.marketCap;
    }

    public Double getPercentChange1h() {
        return this.percentChange1h;
    }

    public Double getPercentChange24h() {
        return this.percentChange24h;
    }

    public Double getPercentChange7d() {
        return this.percentChange7d;
    }

    public Double getPrice() {
        return this.price;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public Double getVolume24h() {
        return this.volume24h;
    }

    public void setLastUpdated(String str) {
        this.lastUpdated = str;
    }

    public void setMarketCap(Double d) {
        this.marketCap = d;
    }

    public void setPercentChange1h(Double d) {
        this.percentChange1h = d;
    }

    public void setPercentChange24h(Double d) {
        this.percentChange24h = d;
    }

    public void setPercentChange7d(Double d) {
        this.percentChange7d = d;
    }

    public void setPrice(Double d) {
        this.price = d;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public void setVolume24h(Double d) {
        this.volume24h = d;
    }

    public String toString() {
        return new Gson().toJson((Object) this, (Type) USDT.class);
    }
}
