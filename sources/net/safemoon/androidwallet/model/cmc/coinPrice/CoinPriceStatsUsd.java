package net.safemoon.androidwallet.model.cmc.coinPrice;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/cmc/coinPrice/CoinPriceStatsUsd;", "Ljava/io/Serializable;", "openValue", "", "closeValue", "highValue", "lowValue", "(FFFF)V", "getCloseValue", "()F", "setCloseValue", "(F)V", "getHighValue", "setHighValue", "getLowValue", "setLowValue", "getOpenValue", "setOpenValue", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: CoinPriceStatsUsd.kt */
public final class CoinPriceStatsUsd implements Serializable {
    @SerializedName("close")
    private float closeValue;
    @SerializedName("high")
    private float highValue;
    @SerializedName("low")
    private float lowValue;
    @SerializedName("open")
    private float openValue;

    public CoinPriceStatsUsd(float f, float f2, float f3, float f4) {
        this.openValue = f;
        this.closeValue = f2;
        this.highValue = f3;
        this.lowValue = f4;
    }

    public static /* synthetic */ CoinPriceStatsUsd copy$default(CoinPriceStatsUsd coinPriceStatsUsd, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = coinPriceStatsUsd.openValue;
        }
        if ((i & 2) != 0) {
            f2 = coinPriceStatsUsd.closeValue;
        }
        if ((i & 4) != 0) {
            f3 = coinPriceStatsUsd.highValue;
        }
        if ((i & 8) != 0) {
            f4 = coinPriceStatsUsd.lowValue;
        }
        return coinPriceStatsUsd.copy(f, f2, f3, f4);
    }

    public final float component1() {
        return this.openValue;
    }

    public final float component2() {
        return this.closeValue;
    }

    public final float component3() {
        return this.highValue;
    }

    public final float component4() {
        return this.lowValue;
    }

    public final CoinPriceStatsUsd copy(float f, float f2, float f3, float f4) {
        return new CoinPriceStatsUsd(f, f2, f3, f4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoinPriceStatsUsd)) {
            return false;
        }
        CoinPriceStatsUsd coinPriceStatsUsd = (CoinPriceStatsUsd) obj;
        return Float.compare(this.openValue, coinPriceStatsUsd.openValue) == 0 && Float.compare(this.closeValue, coinPriceStatsUsd.closeValue) == 0 && Float.compare(this.highValue, coinPriceStatsUsd.highValue) == 0 && Float.compare(this.lowValue, coinPriceStatsUsd.lowValue) == 0;
    }

    public final float getCloseValue() {
        return this.closeValue;
    }

    public final float getHighValue() {
        return this.highValue;
    }

    public final float getLowValue() {
        return this.lowValue;
    }

    public final float getOpenValue() {
        return this.openValue;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.openValue) * 31) + Float.floatToIntBits(this.closeValue)) * 31) + Float.floatToIntBits(this.highValue)) * 31) + Float.floatToIntBits(this.lowValue);
    }

    public final void setCloseValue(float f) {
        this.closeValue = f;
    }

    public final void setHighValue(float f) {
        this.highValue = f;
    }

    public final void setLowValue(float f) {
        this.lowValue = f;
    }

    public final void setOpenValue(float f) {
        this.openValue = f;
    }

    public String toString() {
        float f = this.openValue;
        float f2 = this.closeValue;
        float f3 = this.highValue;
        float f4 = this.lowValue;
        return "CoinPriceStatsUsd(openValue=" + f + ", closeValue=" + f2 + ", highValue=" + f3 + ", lowValue=" + f4 + ")";
    }
}
