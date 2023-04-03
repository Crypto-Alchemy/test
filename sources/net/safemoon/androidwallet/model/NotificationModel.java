package net.safemoon.androidwallet.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class NotificationModel {
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("data")
    @Expose
    private NotificationData data;
    @SerializedName("message")
    @Expose
    private String message;

    public static class Data__1 {
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("transactionHash")
        @Expose
        private String transactionHash;

        public String getStatus() {
            return this.status;
        }

        public String getTransactionHash() {
            return this.transactionHash;
        }

        public void setStatus(String str) {
            this.status = str;
        }

        public void setTransactionHash(String str) {
            this.transactionHash = str;
        }
    }

    public static class NotificationData {
        @SerializedName("result")
        @Expose
        private List<NotificationResult> result = null;
        @SerializedName("total")
        @Expose
        private Integer total;

        public List<NotificationResult> getResult() {
            return this.result;
        }

        public Integer getTotal() {
            return this.total;
        }

        public void setResult(List<NotificationResult> list) {
            this.result = list;
        }

        public void setTotal(Integer num) {
            this.total = num;
        }
    }

    public static class NotificationResult {
        @SerializedName("body")
        @Expose
        private String body;
        @SerializedName("data")
        @Expose
        private Data__1 data;
        @SerializedName("id")
        @Expose

        /* renamed from: id */
        private Integer f42446id;
        @SerializedName("read")
        @Expose
        private Boolean read;
        @SerializedName("title")
        @Expose
        private String title;

        public String getBody() {
            return this.body;
        }

        public Data__1 getData() {
            return this.data;
        }

        public Integer getId() {
            return this.f42446id;
        }

        public Boolean getRead() {
            return this.read;
        }

        public String getTitle() {
            return this.title;
        }

        public void setBody(String str) {
            this.body = str;
        }

        public void setData(Data__1 data__1) {
            this.data = data__1;
        }

        public void setId(Integer num) {
            this.f42446id = num;
        }

        public void setRead(Boolean bool) {
            this.read = bool;
        }

        public void setTitle(String str) {
            this.title = str;
        }
    }

    public String getCode() {
        return this.code;
    }

    public NotificationData getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setData(NotificationData notificationData) {
        this.data = notificationData;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
