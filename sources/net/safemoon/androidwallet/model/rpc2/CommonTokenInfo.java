package net.safemoon.androidwallet.model.rpc2;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\b¨\u0006\u0016"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/CommonTokenInfo;", "", "()V", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "decimals", "", "getDecimals", "()Ljava/lang/Integer;", "setDecimals", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "name", "getName", "setName", "symbol", "getSymbol", "setSymbol", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: CommonTokenInfo.kt */
public final class CommonTokenInfo {
    private String address;
    private Integer decimals;
    private String name;
    private String symbol;

    public final String getAddress() {
        return this.address;
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

    public final void setAddress(String str) {
        this.address = str;
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
}
