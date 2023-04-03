package net.safemoon.androidwallet.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010\u0005\u001a\u0004\u0018\u00010\fJ\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/EthBasGasPrice;", "", "result", "", "(Ljava/lang/String;)V", "getResult", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "Ljava/math/BigDecimal;", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: EthBasGasPrice.kt */
public final class EthBasGasPrice {
    @SerializedName("result")
    @Expose
    private final String result;

    public EthBasGasPrice(String str) {
        vx2.m53591g(str, "result");
        this.result = str;
    }

    public static /* synthetic */ EthBasGasPrice copy$default(EthBasGasPrice ethBasGasPrice, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ethBasGasPrice.result;
        }
        return ethBasGasPrice.copy(str);
    }

    public final String component1() {
        return this.result;
    }

    public final EthBasGasPrice copy(String str) {
        vx2.m53591g(str, "result");
        return new EthBasGasPrice(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EthBasGasPrice) && vx2.m53586b(this.result, ((EthBasGasPrice) obj).result);
    }

    public final String getResult() {
        return this.result;
    }

    public int hashCode() {
        return this.result.hashCode();
    }

    public String toString() {
        String str = this.result;
        return "EthBasGasPrice(result=" + str + ")";
    }

    /* renamed from: getResult  reason: collision with other method in class */
    public final BigDecimal m75645getResult() {
        try {
            BigInteger decodeQuantity = pc4.decodeQuantity(this.result);
            vx2.m53590f(decodeQuantity, "decodeQuantity(result)");
            BigDecimal bigDecimal = new BigDecimal(decodeQuantity);
            BigDecimal pow = BigDecimal.TEN.pow(9);
            vx2.m53590f(pow, "TEN.pow(9)");
            BigDecimal divide = bigDecimal.divide(pow, RoundingMode.HALF_EVEN);
            vx2.m53590f(divide, "this.divide(other, RoundingMode.HALF_EVEN)");
            return divide;
        } catch (Exception unused) {
            return null;
        }
    }
}
