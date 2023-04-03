package net.safemoon.androidwallet.model.transaction.history;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Result implements Serializable {
    @SerializedName("blockHash")
    @Expose
    public String blockHash;
    @SerializedName("blockNumber")
    @Expose
    public String blockNumber;
    @SerializedName("confirmations")
    @Expose
    public String confirmations;
    @SerializedName("contractAddress")
    @Expose
    public String contractAddress;
    @SerializedName("cumulativeGasUsed")
    @Expose
    public String cumulativeGasUsed;
    @SerializedName("from")
    @Expose
    public String from;
    @SerializedName("gas")
    @Expose
    public String gas;
    @SerializedName("gasPrice")
    @Expose
    public String gasPrice;
    @SerializedName("gasUsed")
    @Expose
    public String gasUsed;
    @SerializedName("hash")
    @Expose
    public String hash;
    @SerializedName("input")
    @Expose
    public String input;
    @SerializedName("nonce")
    @Expose
    public String nonce;
    public boolean offlinePending;
    @SerializedName("timeStamp")
    @Expose
    public String timeStamp;
    @SerializedName("to")
    @Expose

    /* renamed from: to */
    public String f42485to;
    @SerializedName("tokenDecimal")
    @Expose
    public Integer tokenDecimal;
    @SerializedName("tokenName")
    @Expose
    public String tokenName;
    @SerializedName("tokenSymbol")
    @Expose
    public String tokenSymbol;
    @SerializedName("transactionIndex")
    @Expose
    public String transactionIndex;
    @SerializedName("txreceipt_status")
    @Expose
    public String txreceiptStatus;
    @SerializedName("value")
    @Expose
    public String value;

    public Result() {
        this.gasPrice = String.valueOf(1);
        this.txreceiptStatus = "1";
        this.offlinePending = false;
    }

    public Result(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8) {
        String.valueOf(1);
        this.txreceiptStatus = "1";
        this.offlinePending = false;
        this.timeStamp = str;
        this.hash = str2;
        this.from = str3;
        this.f42485to = str4;
        this.value = str5;
        this.gasUsed = str6;
        this.gasPrice = str7;
        this.tokenDecimal = Integer.valueOf(i);
        this.txreceiptStatus = str8;
    }

    public Result(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i) {
        String.valueOf(1);
        this.txreceiptStatus = "1";
        this.offlinePending = false;
        this.timeStamp = str;
        this.hash = str2;
        this.from = str3;
        this.f42485to = str4;
        this.tokenSymbol = str5;
        this.contractAddress = str6;
        this.value = str7;
        this.gasUsed = str8;
        this.gasPrice = str9;
        this.tokenDecimal = Integer.valueOf(i);
    }
}
