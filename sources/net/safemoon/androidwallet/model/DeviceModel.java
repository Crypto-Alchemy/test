package net.safemoon.androidwallet.model;

import com.google.gson.annotations.SerializedName;

public class DeviceModel {
    @SerializedName("blockchainAccountAddress")
    private String blockchainAccountAddress;
    @SerializedName("deviceToken")
    private String deviceToken;
    @SerializedName("platform")
    private String platform;

    public String getBlockchainAccountAddress() {
        return this.blockchainAccountAddress;
    }

    public String getDeviceToken() {
        return this.deviceToken;
    }

    public String getPlatform() {
        return this.platform;
    }
}
