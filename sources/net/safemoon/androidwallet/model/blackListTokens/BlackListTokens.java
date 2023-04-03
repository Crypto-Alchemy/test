package net.safemoon.androidwallet.model.blackListTokens;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BlackListTokens implements Serializable {
    private static final long serialVersionUID = -2143937244102023218L;
    @SerializedName("data")
    @Expose
    public List<Data> data = new ArrayList();

    public class Data implements Serializable {
        private static final long serialVersionUID = -1486855278736611721L;
        @SerializedName("isBlacklist")
        @Expose
        public Boolean isBlacklist;
        @SerializedName("tokenContractAddress")
        @Expose
        public String tokenContractAddress;

        public Data() {
        }
    }
}
