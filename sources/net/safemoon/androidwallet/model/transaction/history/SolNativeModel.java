package net.safemoon.androidwallet.model.transaction.history;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;

public class SolNativeModel implements Serializable {
    @SerializedName("data")
    @Expose
    public ArrayList<SolNativeData> data = new ArrayList<>();

    public class SolNativeData implements Serializable {
        @SerializedName("blockTime")
        @Expose
        public long blockTime;
        @SerializedName("decimals")
        @Expose
        public int decimals;
        @SerializedName("dst")
        @Expose
        public String dst;
        @SerializedName("fee")
        @Expose
        public long fee;
        @SerializedName("_id")
        @Expose

        /* renamed from: id */
        public String f42486id;
        @SerializedName("isInner")
        @Expose
        public Boolean isInner;
        @SerializedName("lamport")
        @Expose
        public long lamport;
        @SerializedName("slot")
        @Expose
        public long slot;
        @SerializedName("src")
        @Expose
        public String src;
        @SerializedName("status")
        @Expose
        public String status;
        @SerializedName("txHash")
        @Expose
        public String txHash;
        @SerializedName("txNumberSolTransfer")
        @Expose
        public int txNumberSolTransfer;

        public SolNativeData() {
        }
    }
}
