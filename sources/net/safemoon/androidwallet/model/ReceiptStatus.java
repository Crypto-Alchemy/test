package net.safemoon.androidwallet.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ReceiptStatus implements Serializable {
    private static final long serialVersionUID = 1449916715373268921L;
    @SerializedName("message")
    @Expose
    public String message;
    @SerializedName("result")
    @Expose
    public Result result;
    @SerializedName("status")
    @Expose
    public String status;

    public class Result implements Serializable {
        private static final long serialVersionUID = -5884007262121049816L;
        @SerializedName("status")
        @Expose
        public String status;

        public Result() {
        }
    }

    public ReceiptStatus() {
    }

    public ReceiptStatus(Result result2) {
        this.result = result2;
    }
}
