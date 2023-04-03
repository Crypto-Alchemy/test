package net.safemoon.androidwallet.model.graph;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class TradingViewSymbol implements Serializable {
    private static final long serialVersionUID = 5087329592015299318L;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("exchange")
    @Expose
    public String exchange;
    @SerializedName("provider_id")
    @Expose
    public String providerId;
    @SerializedName("symbol")
    @Expose
    public String symbol;
    @SerializedName("type")
    @Expose
    public String type;
}
