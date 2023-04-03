package net.safemoon.androidwallet.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/Result;", "", "LastBlock", "", "SafeGasPrice", "ProposeGasPrice", "FastGasPrice", "suggestBaseFee", "gasUsedRatio", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFastGasPrice", "()Ljava/lang/String;", "getLastBlock", "getProposeGasPrice", "getSafeGasPrice", "getGasUsedRatio", "getSuggestBaseFee", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: EthGasPrice.kt */
public final class Result {
    @SerializedName("FastGasPrice")
    @Expose
    private final String FastGasPrice;
    @SerializedName("LastBlock")
    @Expose
    private final String LastBlock;
    @SerializedName("ProposeGasPrice")
    @Expose
    private final String ProposeGasPrice;
    @SerializedName("SafeGasPrice")
    @Expose
    private final String SafeGasPrice;
    @SerializedName("gasUsedRatio")
    @Expose
    private final String gasUsedRatio;
    @SerializedName("suggestBaseFee")
    @Expose
    private final String suggestBaseFee;

    public Result(String str, String str2, String str3, String str4, String str5, String str6) {
        vx2.m53591g(str, "LastBlock");
        vx2.m53591g(str2, "SafeGasPrice");
        vx2.m53591g(str3, "ProposeGasPrice");
        vx2.m53591g(str4, "FastGasPrice");
        vx2.m53591g(str5, "suggestBaseFee");
        vx2.m53591g(str6, "gasUsedRatio");
        this.LastBlock = str;
        this.SafeGasPrice = str2;
        this.ProposeGasPrice = str3;
        this.FastGasPrice = str4;
        this.suggestBaseFee = str5;
        this.gasUsedRatio = str6;
    }

    public static /* synthetic */ Result copy$default(Result result, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = result.LastBlock;
        }
        if ((i & 2) != 0) {
            str2 = result.SafeGasPrice;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = result.ProposeGasPrice;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = result.FastGasPrice;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = result.suggestBaseFee;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = result.gasUsedRatio;
        }
        return result.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.LastBlock;
    }

    public final String component2() {
        return this.SafeGasPrice;
    }

    public final String component3() {
        return this.ProposeGasPrice;
    }

    public final String component4() {
        return this.FastGasPrice;
    }

    public final String component5() {
        return this.suggestBaseFee;
    }

    public final String component6() {
        return this.gasUsedRatio;
    }

    public final Result copy(String str, String str2, String str3, String str4, String str5, String str6) {
        vx2.m53591g(str, "LastBlock");
        vx2.m53591g(str2, "SafeGasPrice");
        vx2.m53591g(str3, "ProposeGasPrice");
        vx2.m53591g(str4, "FastGasPrice");
        vx2.m53591g(str5, "suggestBaseFee");
        vx2.m53591g(str6, "gasUsedRatio");
        return new Result(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Result)) {
            return false;
        }
        Result result = (Result) obj;
        return vx2.m53586b(this.LastBlock, result.LastBlock) && vx2.m53586b(this.SafeGasPrice, result.SafeGasPrice) && vx2.m53586b(this.ProposeGasPrice, result.ProposeGasPrice) && vx2.m53586b(this.FastGasPrice, result.FastGasPrice) && vx2.m53586b(this.suggestBaseFee, result.suggestBaseFee) && vx2.m53586b(this.gasUsedRatio, result.gasUsedRatio);
    }

    public final String getFastGasPrice() {
        return this.FastGasPrice;
    }

    public final String getGasUsedRatio() {
        return this.gasUsedRatio;
    }

    public final String getLastBlock() {
        return this.LastBlock;
    }

    public final String getProposeGasPrice() {
        return this.ProposeGasPrice;
    }

    public final String getSafeGasPrice() {
        return this.SafeGasPrice;
    }

    public final String getSuggestBaseFee() {
        return this.suggestBaseFee;
    }

    public int hashCode() {
        return (((((((((this.LastBlock.hashCode() * 31) + this.SafeGasPrice.hashCode()) * 31) + this.ProposeGasPrice.hashCode()) * 31) + this.FastGasPrice.hashCode()) * 31) + this.suggestBaseFee.hashCode()) * 31) + this.gasUsedRatio.hashCode();
    }

    public String toString() {
        String str = this.LastBlock;
        String str2 = this.SafeGasPrice;
        String str3 = this.ProposeGasPrice;
        String str4 = this.FastGasPrice;
        String str5 = this.suggestBaseFee;
        String str6 = this.gasUsedRatio;
        return "Result(LastBlock=" + str + ", SafeGasPrice=" + str2 + ", ProposeGasPrice=" + str3 + ", FastGasPrice=" + str4 + ", suggestBaseFee=" + str5 + ", gasUsedRatio=" + str6 + ")";
    }
}
