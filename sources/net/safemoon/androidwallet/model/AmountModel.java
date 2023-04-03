package net.safemoon.androidwallet.model;

import com.google.gson.annotations.SerializedName;
import java.text.DecimalFormat;

public class AmountModel {
    @SerializedName("amount")
    private float amount;

    public float getAmount() {
        return this.amount;
    }

    public String getAmountFormat() {
        return new DecimalFormat("#.##").format((double) this.amount);
    }

    public void setAmount(float f) {
        this.amount = f;
    }
}
