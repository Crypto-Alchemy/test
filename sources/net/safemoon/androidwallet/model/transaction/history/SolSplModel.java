package net.safemoon.androidwallet.model.transaction.history;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;

public class SolSplModel implements Serializable {
    @SerializedName(alternate = {"transactions"}, value = "data")
    @Expose
    public ArrayList<SolSplData> data = new ArrayList<>();
}
