package net.safemoon.androidwallet.model.transaction.history;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public class TransactionHistoryModel {
    @SerializedName("message")
    @Expose
    public String message;
    @SerializedName("result")
    @Expose
    public ArrayList<Result> result = new ArrayList<>();
    @SerializedName("status")
    @Expose
    public String status;
}
