package net.safemoon.androidwallet.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TokenInfo implements Serializable {
    private static final long serialVersionUID = -5365754718459450541L;
    @SerializedName("message")
    @Expose
    public String message;
    @SerializedName("result")
    @Expose
    public List<Result> result = new ArrayList();
    @SerializedName("status")
    @Expose
    public String status;

    public class Result implements Serializable {
        private static final long serialVersionUID = -9114276782638627348L;
        @SerializedName("bitcointalk")
        @Expose
        public String bitcointalk;
        @SerializedName("blog")
        @Expose
        public String blog;
        @SerializedName("blueCheckmark")
        @Expose
        public String blueCheckmark;
        @SerializedName("contractAddress")
        @Expose
        public String contractAddress;
        @SerializedName("description")
        @Expose
        public String description;
        @SerializedName("discord")
        @Expose
        public String discord;
        @SerializedName("divisor")
        @Expose
        public String divisor;
        @SerializedName("email")
        @Expose
        public String email;
        @SerializedName("facebook")
        @Expose
        public String facebook;
        @SerializedName("github")
        @Expose
        public String github;
        @SerializedName("linkedin")
        @Expose
        public String linkedin;
        @SerializedName("reddit")
        @Expose
        public String reddit;
        @SerializedName("slack")
        @Expose
        public String slack;
        @SerializedName("symbol")
        @Expose
        public String symbol;
        @SerializedName("telegram")
        @Expose
        public String telegram;
        @SerializedName("tokenName")
        @Expose
        public String tokenName;
        @SerializedName("tokenPriceUSD")
        @Expose
        public String tokenPriceUSD;
        @SerializedName("tokenType")
        @Expose
        public String tokenType;
        @SerializedName("totalSupply")
        @Expose
        public String totalSupply;
        @SerializedName("twitter")
        @Expose
        public String twitter;
        @SerializedName("website")
        @Expose
        public String website;
        @SerializedName("wechat")
        @Expose
        public String wechat;
        @SerializedName("whitepaper")
        @Expose
        public String whitepaper;

        public Result() {
        }
    }
}
