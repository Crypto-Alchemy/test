package net.safemoon.androidwallet.model.swap;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0016R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR \u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\b¨\u0006\u0018"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/swap/Token;", "Ljava/io/Serializable;", "()V", "contractAddress", "", "getContractAddress", "()Ljava/lang/String;", "setContractAddress", "(Ljava/lang/String;)V", "decimals", "", "getDecimals", "()Ljava/lang/Integer;", "setDecimals", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "name", "getName", "setName", "symbol", "getSymbol", "setSymbol", "toString", "Companion", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: Token.kt */
public final class Token implements Serializable {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 4229498155653876591L;
    @SerializedName(alternate = {"address"}, value = "contractAddress")
    @Expose
    private String contractAddress;
    @SerializedName("decimals")
    @Expose
    private Integer decimals;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName(alternate = {"token"}, value = "symbol")
    @Expose
    private String symbol;

    @Metadata(mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/swap/Token$Companion;", "", "()V", "serialVersionUID", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: Token.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getContractAddress() {
        return this.contractAddress;
    }

    public final Integer getDecimals() {
        return this.decimals;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final void setContractAddress(String str) {
        this.contractAddress = str;
    }

    public final void setDecimals(Integer num) {
        this.decimals = num;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setSymbol(String str) {
        this.symbol = str;
    }

    public String toString() {
        String json = new Gson().toJson((Object) this);
        vx2.m53590f(json, "Gson().toJson(this)");
        return json;
    }
}
