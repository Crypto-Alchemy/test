package net.safemoon.androidwallet.model.cmcTokenInfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Status implements Serializable {
    private static final long serialVersionUID = -8638062777236148223L;
    @SerializedName("credit_count")
    @Expose
    public Integer creditCount;
    @SerializedName("elapsed")
    @Expose
    public Integer elapsed;
    @SerializedName("error_code")
    @Expose
    public Integer errorCode;
    @SerializedName("error_message")
    @Expose
    public Object errorMessage;
    @SerializedName("notice")
    @Expose
    public Object notice;
    @SerializedName("timestamp")
    @Expose
    public String timestamp;
}
