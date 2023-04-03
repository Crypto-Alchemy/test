package net.safemoon.androidwallet.model.transaction.history;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public class SolSplData implements Serializable {
    @SerializedName("address")
    @Expose
    public String address;
    @SerializedName("balance")
    @Expose
    public Balance balance;
    @SerializedName("blockTime")
    @Expose
    public Integer blockTime;
    @SerializedName("changeAmount")
    @Expose
    public Long changeAmount;
    @SerializedName("changeType")
    @Expose
    public String changeType;
    @SerializedName("decimals")
    @Expose
    public Integer decimals;
    @SerializedName("fee")
    @Expose
    public Integer fee;
    @SerializedName("_id")
    @Expose

    /* renamed from: id */
    public String f42487id;
    @SerializedName("owner")
    @Expose
    public String owner;
    @SerializedName("postBalance")
    @Expose
    public String postBalance;
    @SerializedName("preBalance")
    @Expose
    public String preBalance;
    @SerializedName("signature")
    @Expose
    public List<String> signature = null;
    @SerializedName("slot")
    @Expose
    public Integer slot;
    @SerializedName("symbol")
    @Expose
    public String symbol;
    @SerializedName("tokenAddress")
    @Expose
    public String tokenAddress;

    public class Balance implements Serializable {
        @SerializedName("amount")
        @Expose
        public String amount;
        @SerializedName("decimals")
        @Expose
        public Integer decimals;

        public Balance() {
        }
    }
}
