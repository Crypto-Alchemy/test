package net.safemoon.androidwallet.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Status implements Serializable {
    @SerializedName("credit_count")
    @Expose
    private Integer creditCount;
    @SerializedName("elapsed")
    @Expose
    private Integer elapsed;
    @SerializedName("error_code")
    @Expose
    private Integer errorCode;
    @SerializedName("error_message")
    @Expose
    private Object errorMessage;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;

    public Integer getCreditCount() {
        return this.creditCount;
    }

    public Integer getElapsed() {
        return this.elapsed;
    }

    public Integer getErrorCode() {
        return this.errorCode;
    }

    public Object getErrorMessage() {
        return this.errorMessage;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setCreditCount(Integer num) {
        this.creditCount = num;
    }

    public void setElapsed(Integer num) {
        this.elapsed = num;
    }

    public void setErrorCode(Integer num) {
        this.errorCode = num;
    }

    public void setErrorMessage(Object obj) {
        this.errorMessage = obj;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }
}
