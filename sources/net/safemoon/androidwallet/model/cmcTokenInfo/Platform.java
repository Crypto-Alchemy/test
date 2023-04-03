package net.safemoon.androidwallet.model.cmcTokenInfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Platform implements Serializable {
    private static final long serialVersionUID = 8859644860166156163L;
    @SerializedName("id")
    @Expose

    /* renamed from: id */
    public Integer f42451id;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("slug")
    @Expose
    public String slug;
    @SerializedName("symbol")
    @Expose
    public String symbol;
    @SerializedName("token_address")
    @Expose
    public String tokenAddress;
}
