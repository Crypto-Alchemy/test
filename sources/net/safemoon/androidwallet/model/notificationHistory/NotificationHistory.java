package net.safemoon.androidwallet.model.notificationHistory;

import com.google.gson.annotations.SerializedName;

public class NotificationHistory {
    @SerializedName("data")
    private NotificationHistoryData data;

    public NotificationHistoryData getData() {
        return this.data;
    }
}
