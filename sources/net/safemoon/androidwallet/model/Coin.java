package net.safemoon.androidwallet.model;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Objects;

public class Coin implements Serializable {
    @SerializedName("circulating_supply")
    @Expose
    private Double circulatingSupply;
    @SerializedName("cmc_rank")
    @Expose
    private Integer cmcRank;
    @SerializedName("date_added")
    @Expose
    private String dateAdded;
    @SerializedName("id")
    @Expose

    /* renamed from: id */
    private Integer f42444id;
    @SerializedName("last_updated")
    @Expose
    private String lastUpdated;
    @SerializedName("max_supply")
    @Expose
    private Double maxSupply;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("num_market_pairs")
    @Expose
    private Integer numMarketPairs;
    @SerializedName("quote")
    @Expose
    private Quote quote;
    @SerializedName("self_reported_circulating_supply")
    @Expose
    private Double selfReportedCirculatingSupply;
    @SerializedName("self_reported_market_cap")
    @Expose
    private Double selfReportedMarketCap;
    @SerializedName("slug")
    @Expose
    private String slug;
    private String sortType = "24h";
    @SerializedName("symbol")
    @Expose
    private String symbol;
    @SerializedName("total_supply")
    @Expose
    private Double totalSupply;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Coin)) {
            return false;
        }
        Coin coin = (Coin) obj;
        if (!Objects.equals(getId(), coin.getId()) || !Objects.equals(getName(), coin.getName()) || !Objects.equals(getSymbol(), coin.getSymbol()) || !Objects.equals(getSlug(), coin.getSlug()) || !Objects.equals(getCirculatingSupply(), coin.getCirculatingSupply()) || !Objects.equals(getTotalSupply(), coin.getTotalSupply()) || !Objects.equals(getMaxSupply(), coin.getMaxSupply()) || !Objects.equals(getDateAdded(), coin.getDateAdded()) || !Objects.equals(getNumMarketPairs(), coin.getNumMarketPairs()) || !Objects.equals(getCmcRank(), coin.getCmcRank()) || !Objects.equals(getLastUpdated(), coin.getLastUpdated()) || !Objects.equals(getQuote(), coin.getQuote()) || !Objects.equals(getSelfReportedMarketCap(), coin.getSelfReportedMarketCap()) || !Objects.equals(getSelfReportedCirculatingSupply(), coin.getSelfReportedCirculatingSupply()) || !Objects.equals(getSortType(), coin.getSortType())) {
            return false;
        }
        return true;
    }

    public Double getCirculatingSupply() {
        return this.circulatingSupply;
    }

    public Integer getCmcRank() {
        return this.cmcRank;
    }

    public String getDateAdded() {
        return this.dateAdded;
    }

    public Integer getId() {
        return this.f42444id;
    }

    public String getLastUpdated() {
        return this.lastUpdated;
    }

    public Double getMaxSupply() {
        return this.maxSupply;
    }

    public String getName() {
        return this.name;
    }

    public Integer getNumMarketPairs() {
        return this.numMarketPairs;
    }

    public Quote getQuote() {
        return this.quote;
    }

    public Double getSelfReportedCirculatingSupply() {
        return this.selfReportedCirculatingSupply;
    }

    public Double getSelfReportedMarketCap() {
        return this.selfReportedMarketCap;
    }

    public String getSlug() {
        return this.slug;
    }

    public String getSortType() {
        return this.sortType;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public Double getTotalSupply() {
        return this.totalSupply;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{getId(), getName(), getSymbol(), getSlug(), getCirculatingSupply(), getTotalSupply(), getMaxSupply(), getDateAdded(), getNumMarketPairs(), getCmcRank(), getLastUpdated(), getQuote(), getSelfReportedMarketCap(), getSelfReportedCirculatingSupply(), getSortType()});
    }

    public void setCirculatingSupply(Double d) {
        this.circulatingSupply = d;
    }

    public void setCmcRank(Integer num) {
        this.cmcRank = num;
    }

    public void setDateAdded(String str) {
        this.dateAdded = str;
    }

    public void setId(Integer num) {
        this.f42444id = num;
    }

    public void setLastUpdated(String str) {
        this.lastUpdated = str;
    }

    public void setMaxSupply(Double d) {
        this.maxSupply = d;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNumMarketPairs(Integer num) {
        this.numMarketPairs = num;
    }

    public void setQuote(Quote quote2) {
        this.quote = quote2;
    }

    public void setSelfReportedCirculatingSupply(Double d) {
        this.selfReportedCirculatingSupply = d;
    }

    public void setSelfReportedMarketCap(Double d) {
        this.selfReportedMarketCap = d;
    }

    public void setSlug(String str) {
        this.slug = str;
    }

    public void setSortType(String str) {
        this.sortType = str;
    }

    public void setSymbol(String str) {
        this.symbol = str;
    }

    public void setTotalSupply(Double d) {
        this.totalSupply = d;
    }

    public String toString() {
        return new Gson().toJson((Object) this, (Type) Coin.class);
    }
}
