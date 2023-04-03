package net.safemoon.androidwallet.model.rpc2.bitcoin;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001e"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BitcoinUTXOResponseItem;", "", "confirmations", "", "height", "txid", "", "value", "vout", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getConfirmations", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeight", "getTxid", "()Ljava/lang/String;", "getValue", "getVout", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BitcoinUTXOResponseItem;", "equals", "", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@Keep
/* compiled from: BitcoinUTXOResponseItem.kt */
public final class BitcoinUTXOResponseItem {
    @SerializedName("confirmations")
    private final Integer confirmations;
    @SerializedName("height")
    private final Integer height;
    @SerializedName("txid")
    private final String txid;
    @SerializedName("value")
    private final String value;
    @SerializedName("vout")
    private final Integer vout;

    public BitcoinUTXOResponseItem(Integer num, Integer num2, String str, String str2, Integer num3) {
        this.confirmations = num;
        this.height = num2;
        this.txid = str;
        this.value = str2;
        this.vout = num3;
    }

    public static /* synthetic */ BitcoinUTXOResponseItem copy$default(BitcoinUTXOResponseItem bitcoinUTXOResponseItem, Integer num, Integer num2, String str, String str2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = bitcoinUTXOResponseItem.confirmations;
        }
        if ((i & 2) != 0) {
            num2 = bitcoinUTXOResponseItem.height;
        }
        Integer num4 = num2;
        if ((i & 4) != 0) {
            str = bitcoinUTXOResponseItem.txid;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = bitcoinUTXOResponseItem.value;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            num3 = bitcoinUTXOResponseItem.vout;
        }
        return bitcoinUTXOResponseItem.copy(num, num4, str3, str4, num3);
    }

    public final Integer component1() {
        return this.confirmations;
    }

    public final Integer component2() {
        return this.height;
    }

    public final String component3() {
        return this.txid;
    }

    public final String component4() {
        return this.value;
    }

    public final Integer component5() {
        return this.vout;
    }

    public final BitcoinUTXOResponseItem copy(Integer num, Integer num2, String str, String str2, Integer num3) {
        return new BitcoinUTXOResponseItem(num, num2, str, str2, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinUTXOResponseItem)) {
            return false;
        }
        BitcoinUTXOResponseItem bitcoinUTXOResponseItem = (BitcoinUTXOResponseItem) obj;
        return vx2.m53586b(this.confirmations, bitcoinUTXOResponseItem.confirmations) && vx2.m53586b(this.height, bitcoinUTXOResponseItem.height) && vx2.m53586b(this.txid, bitcoinUTXOResponseItem.txid) && vx2.m53586b(this.value, bitcoinUTXOResponseItem.value) && vx2.m53586b(this.vout, bitcoinUTXOResponseItem.vout);
    }

    public final Integer getConfirmations() {
        return this.confirmations;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getTxid() {
        return this.txid;
    }

    public final String getValue() {
        return this.value;
    }

    public final Integer getVout() {
        return this.vout;
    }

    public int hashCode() {
        Integer num = this.confirmations;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.height;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.txid;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.value;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.vout;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        Integer num = this.confirmations;
        Integer num2 = this.height;
        String str = this.txid;
        String str2 = this.value;
        Integer num3 = this.vout;
        return "BitcoinUTXOResponseItem(confirmations=" + num + ", height=" + num2 + ", txid=" + str + ", value=" + str2 + ", vout=" + num3 + ")";
    }
}
