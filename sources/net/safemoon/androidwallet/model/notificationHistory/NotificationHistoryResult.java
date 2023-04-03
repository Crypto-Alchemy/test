package net.safemoon.androidwallet.model.notificationHistory;

import com.google.gson.annotations.SerializedName;

public class NotificationHistoryResult {
    @SerializedName("body")
    public String body;
    @SerializedName("createdAt")
    public String createdAt;
    @SerializedName("data")
    public Data data;
    @SerializedName("id")

    /* renamed from: id */
    public String f42459id;
    @SerializedName("read")
    public boolean read;
    @SerializedName("title")
    public String title;

    public class Data {
        @SerializedName("status")
        public boolean status;
        @SerializedName("transactionHash")
        public String transactionHash;

        public Data() {
        }
    }
}
