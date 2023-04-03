package net.safemoon.androidwallet.model.transaction.history;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public class Data {
    @SerializedName("result")
    private ArrayList<Result> result;

    public ArrayList<Result> getResult() {
        return this.result;
    }
}
