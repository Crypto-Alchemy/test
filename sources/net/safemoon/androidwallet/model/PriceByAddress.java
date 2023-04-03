package net.safemoon.androidwallet.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/PriceByAddress;", "", "priceNative", "", "priceUsd", "(Ljava/lang/String;Ljava/lang/String;)V", "getPriceNative", "()Ljava/lang/String;", "getPriceUsd", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: PriceByAddress.kt */
public final class PriceByAddress {
    @SerializedName("priceNative")
    private final String priceNative;
    @SerializedName("priceUsd")
    private final String priceUsd;

    public PriceByAddress(String str, String str2) {
        this.priceNative = str;
        this.priceUsd = str2;
    }

    public static /* synthetic */ PriceByAddress copy$default(PriceByAddress priceByAddress, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = priceByAddress.priceNative;
        }
        if ((i & 2) != 0) {
            str2 = priceByAddress.priceUsd;
        }
        return priceByAddress.copy(str, str2);
    }

    public final String component1() {
        return this.priceNative;
    }

    public final String component2() {
        return this.priceUsd;
    }

    public final PriceByAddress copy(String str, String str2) {
        return new PriceByAddress(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceByAddress)) {
            return false;
        }
        PriceByAddress priceByAddress = (PriceByAddress) obj;
        return vx2.m53586b(this.priceNative, priceByAddress.priceNative) && vx2.m53586b(this.priceUsd, priceByAddress.priceUsd);
    }

    public final String getPriceNative() {
        return this.priceNative;
    }

    public final String getPriceUsd() {
        return this.priceUsd;
    }

    public int hashCode() {
        String str = this.priceNative;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.priceUsd;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.priceNative;
        String str2 = this.priceUsd;
        return "PriceByAddress(priceNative=" + str + ", priceUsd=" + str2 + ")";
    }
}
