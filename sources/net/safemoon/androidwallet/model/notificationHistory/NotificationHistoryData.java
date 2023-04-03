package net.safemoon.androidwallet.model.notificationHistory;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public class NotificationHistoryData {
    @SerializedName("result")
    private ArrayList<NotificationHistoryResult> result;

    public ArrayList<NotificationHistoryResult> getResult() {
        return this.result;
    }
}
