package net.safemoon.androidwallet.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class TransferModel {
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("data")
    @Expose
    private TransferData data;
    @SerializedName("message")
    @Expose
    private String message;

    public static class TransferData {
        @SerializedName("blockHash")
        @Expose
        private String blockHash;
        @SerializedName("blockNumber")
        @Expose
        private Integer blockNumber;
        @SerializedName("contractAddress")
        @Expose
        private Object contractAddress;
        @SerializedName("cumulativeGasUsed")
        @Expose
        private Integer cumulativeGasUsed;
        @SerializedName("from")
        @Expose
        private String from;
        @SerializedName("gasUsed")
        @Expose
        private Double gasUsed;
        @SerializedName("logs")
        @Expose
        private List<TransferLog> logs = null;
        @SerializedName("logsBloom")
        @Expose
        private String logsBloom;
        @SerializedName("status")
        @Expose
        private Boolean status;
        @SerializedName("to")
        @Expose

        /* renamed from: to */
        private String f42448to;
        @SerializedName("transactionHash")
        @Expose
        private String transactionHash;
        @SerializedName("transactionIndex")
        @Expose
        private Integer transactionIndex;
        @SerializedName("type")
        @Expose
        private String type;

        public String getBlockHash() {
            return this.blockHash;
        }

        public Integer getBlockNumber() {
            return this.blockNumber;
        }

        public Object getContractAddress() {
            return this.contractAddress;
        }

        public Integer getCumulativeGasUsed() {
            return this.cumulativeGasUsed;
        }

        public String getFrom() {
            return this.from;
        }

        public Double getGasUsed() {
            return this.gasUsed;
        }

        public List<TransferLog> getLogs() {
            return this.logs;
        }

        public String getLogsBloom() {
            return this.logsBloom;
        }

        public Boolean getStatus() {
            return this.status;
        }

        public String getTo() {
            return this.f42448to;
        }

        public String getTransactionHash() {
            return this.transactionHash;
        }

        public Integer getTransactionIndex() {
            return this.transactionIndex;
        }

        public String getType() {
            return this.type;
        }

        public void setBlockHash(String str) {
            this.blockHash = str;
        }

        public void setBlockNumber(Integer num) {
            this.blockNumber = num;
        }

        public void setContractAddress(Object obj) {
            this.contractAddress = obj;
        }

        public void setCumulativeGasUsed(Integer num) {
            this.cumulativeGasUsed = num;
        }

        public void setFrom(String str) {
            this.from = str;
        }

        public void setGasUsed(Double d) {
            this.gasUsed = d;
        }

        public void setLogs(List<TransferLog> list) {
            this.logs = list;
        }

        public void setLogsBloom(String str) {
            this.logsBloom = str;
        }

        public void setStatus(Boolean bool) {
            this.status = bool;
        }

        public void setTo(String str) {
            this.f42448to = str;
        }

        public void setTransactionHash(String str) {
            this.transactionHash = str;
        }

        public void setTransactionIndex(Integer num) {
            this.transactionIndex = num;
        }

        public void setType(String str) {
            this.type = str;
        }
    }

    public static class TransferLog {
        @SerializedName("address")
        @Expose
        private String address;
        @SerializedName("blockHash")
        @Expose
        private String blockHash;
        @SerializedName("blockNumber")
        @Expose
        private Integer blockNumber;
        @SerializedName("data")
        @Expose
        private String data;
        @SerializedName("id")
        @Expose

        /* renamed from: id */
        private String f42449id;
        @SerializedName("logIndex")
        @Expose
        private Integer logIndex;
        @SerializedName("removed")
        @Expose
        private Boolean removed;
        @SerializedName("topics")
        @Expose
        private List<String> topics = null;
        @SerializedName("transactionHash")
        @Expose
        private String transactionHash;
        @SerializedName("transactionIndex")
        @Expose
        private Integer transactionIndex;

        public String getAddress() {
            return this.address;
        }

        public String getBlockHash() {
            return this.blockHash;
        }

        public Integer getBlockNumber() {
            return this.blockNumber;
        }

        public String getData() {
            return this.data;
        }

        public String getId() {
            return this.f42449id;
        }

        public Integer getLogIndex() {
            return this.logIndex;
        }

        public Boolean getRemoved() {
            return this.removed;
        }

        public List<String> getTopics() {
            return this.topics;
        }

        public String getTransactionHash() {
            return this.transactionHash;
        }

        public Integer getTransactionIndex() {
            return this.transactionIndex;
        }

        public void setAddress(String str) {
            this.address = str;
        }

        public void setBlockHash(String str) {
            this.blockHash = str;
        }

        public void setBlockNumber(Integer num) {
            this.blockNumber = num;
        }

        public void setData(String str) {
            this.data = str;
        }

        public void setId(String str) {
            this.f42449id = str;
        }

        public void setLogIndex(Integer num) {
            this.logIndex = num;
        }

        public void setRemoved(Boolean bool) {
            this.removed = bool;
        }

        public void setTopics(List<String> list) {
            this.topics = list;
        }

        public void setTransactionHash(String str) {
            this.transactionHash = str;
        }

        public void setTransactionIndex(Integer num) {
            this.transactionIndex = num;
        }
    }

    public String getCode() {
        return this.code;
    }

    public TransferData getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setData(TransferData transferData) {
        this.data = transferData;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
