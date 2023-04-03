package net.safemoon.androidwallet.model.swap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR \u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR \u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR \u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001e¨\u0006#"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/swap/PairsData;", "Ljava/io/Serializable;", "()V", "chainId", "", "getChainId", "()Ljava/lang/Integer;", "setChainId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "pairAddress", "", "getPairAddress", "()Ljava/lang/String;", "setPairAddress", "(Ljava/lang/String;)V", "pairId", "getPairId", "setPairId", "reserve0", "getReserve0", "setReserve0", "reserve1", "getReserve1", "setReserve1", "token0", "Lnet/safemoon/androidwallet/model/swap/Token;", "getToken0", "()Lnet/safemoon/androidwallet/model/swap/Token;", "setToken0", "(Lnet/safemoon/androidwallet/model/swap/Token;)V", "token1", "getToken1", "setToken1", "Companion", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: Pairs.kt */
public final class PairsData implements Serializable {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long serialVersionUID = -1588178562492023974L;
    @SerializedName("chainId")
    @Expose
    private Integer chainId;
    @SerializedName("pairAddress")
    @Expose
    private String pairAddress;
    @SerializedName("pairId")
    @Expose
    private String pairId;
    @SerializedName("reserve0")
    @Expose
    private String reserve0;
    @SerializedName("reserve1")
    @Expose
    private String reserve1;
    @SerializedName("token0")
    @Expose
    private Token token0;
    @SerializedName("token1")
    @Expose
    private Token token1;

    @Metadata(mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/swap/PairsData$Companion;", "", "()V", "serialVersionUID", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: Pairs.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Integer getChainId() {
        return this.chainId;
    }

    public final String getPairAddress() {
        return this.pairAddress;
    }

    public final String getPairId() {
        return this.pairId;
    }

    public final String getReserve0() {
        return this.reserve0;
    }

    public final String getReserve1() {
        return this.reserve1;
    }

    public final Token getToken0() {
        return this.token0;
    }

    public final Token getToken1() {
        return this.token1;
    }

    public final void setChainId(Integer num) {
        this.chainId = num;
    }

    public final void setPairAddress(String str) {
        this.pairAddress = str;
    }

    public final void setPairId(String str) {
        this.pairId = str;
    }

    public final void setReserve0(String str) {
        this.reserve0 = str;
    }

    public final void setReserve1(String str) {
        this.reserve1 = str;
    }

    public final void setToken0(Token token) {
        this.token0 = token;
    }

    public final void setToken1(Token token) {
        this.token1 = token;
    }
}
