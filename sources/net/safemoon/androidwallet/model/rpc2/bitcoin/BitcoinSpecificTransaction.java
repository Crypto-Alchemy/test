package net.safemoon.androidwallet.model.rpc2.bitcoin;

import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003JÂ\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u0003HÖ\u0001J\t\u0010<\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001c\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001f\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b#\u0010\u0017R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b'\u0010\u0017¨\u0006="}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BitcoinSpecificTransaction;", "", "blockHeight", "", "blockTime", "blockhash", "", "confirmations", "fees", "hex", "size", "txid", "value", "valueIn", "version", "vin", "", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/Vin;", "vout", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/Vout;", "vsize", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)V", "getBlockHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBlockTime", "getBlockhash", "()Ljava/lang/String;", "getConfirmations", "getFees", "getHex", "getSize", "getTxid", "getValue", "getValueIn", "getVersion", "getVin", "()Ljava/util/List;", "getVout", "getVsize", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BitcoinSpecificTransaction;", "equals", "", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@Keep
/* compiled from: BitcoinTxSpecificResponse.kt */
public final class BitcoinSpecificTransaction {
    @SerializedName("blockHeight")
    private final Integer blockHeight;
    @SerializedName("blockTime")
    private final Integer blockTime;
    @SerializedName("blockhash")
    private final String blockhash;
    @SerializedName("confirmations")
    private final Integer confirmations;
    @SerializedName("fees")
    private final String fees;
    @SerializedName("hex")
    private final String hex;
    @SerializedName("size")
    private final Integer size;
    @SerializedName("txid")
    private final String txid;
    @SerializedName("value")
    private final String value;
    @SerializedName("valueIn")
    private final String valueIn;
    @SerializedName("version")
    private final Integer version;
    @SerializedName("vin")
    private final List<Vin> vin;
    @SerializedName("vout")
    private final List<Vout> vout;
    @SerializedName("vsize")
    private final Integer vsize;

    public BitcoinSpecificTransaction(Integer num, Integer num2, String str, Integer num3, String str2, String str3, Integer num4, String str4, String str5, String str6, Integer num5, List<Vin> list, List<Vout> list2, Integer num6) {
        this.blockHeight = num;
        this.blockTime = num2;
        this.blockhash = str;
        this.confirmations = num3;
        this.fees = str2;
        this.hex = str3;
        this.size = num4;
        this.txid = str4;
        this.value = str5;
        this.valueIn = str6;
        this.version = num5;
        this.vin = list;
        this.vout = list2;
        this.vsize = num6;
    }

    public static /* synthetic */ BitcoinSpecificTransaction copy$default(BitcoinSpecificTransaction bitcoinSpecificTransaction, Integer num, Integer num2, String str, Integer num3, String str2, String str3, Integer num4, String str4, String str5, String str6, Integer num5, List list, List list2, Integer num6, int i, Object obj) {
        BitcoinSpecificTransaction bitcoinSpecificTransaction2 = bitcoinSpecificTransaction;
        int i2 = i;
        return bitcoinSpecificTransaction.copy((i2 & 1) != 0 ? bitcoinSpecificTransaction2.blockHeight : num, (i2 & 2) != 0 ? bitcoinSpecificTransaction2.blockTime : num2, (i2 & 4) != 0 ? bitcoinSpecificTransaction2.blockhash : str, (i2 & 8) != 0 ? bitcoinSpecificTransaction2.confirmations : num3, (i2 & 16) != 0 ? bitcoinSpecificTransaction2.fees : str2, (i2 & 32) != 0 ? bitcoinSpecificTransaction2.hex : str3, (i2 & 64) != 0 ? bitcoinSpecificTransaction2.size : num4, (i2 & 128) != 0 ? bitcoinSpecificTransaction2.txid : str4, (i2 & 256) != 0 ? bitcoinSpecificTransaction2.value : str5, (i2 & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? bitcoinSpecificTransaction2.valueIn : str6, (i2 & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) != 0 ? bitcoinSpecificTransaction2.version : num5, (i2 & 2048) != 0 ? bitcoinSpecificTransaction2.vin : list, (i2 & 4096) != 0 ? bitcoinSpecificTransaction2.vout : list2, (i2 & 8192) != 0 ? bitcoinSpecificTransaction2.vsize : num6);
    }

    public final Integer component1() {
        return this.blockHeight;
    }

    public final String component10() {
        return this.valueIn;
    }

    public final Integer component11() {
        return this.version;
    }

    public final List<Vin> component12() {
        return this.vin;
    }

    public final List<Vout> component13() {
        return this.vout;
    }

    public final Integer component14() {
        return this.vsize;
    }

    public final Integer component2() {
        return this.blockTime;
    }

    public final String component3() {
        return this.blockhash;
    }

    public final Integer component4() {
        return this.confirmations;
    }

    public final String component5() {
        return this.fees;
    }

    public final String component6() {
        return this.hex;
    }

    public final Integer component7() {
        return this.size;
    }

    public final String component8() {
        return this.txid;
    }

    public final String component9() {
        return this.value;
    }

    public final BitcoinSpecificTransaction copy(Integer num, Integer num2, String str, Integer num3, String str2, String str3, Integer num4, String str4, String str5, String str6, Integer num5, List<Vin> list, List<Vout> list2, Integer num6) {
        return new BitcoinSpecificTransaction(num, num2, str, num3, str2, str3, num4, str4, str5, str6, num5, list, list2, num6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinSpecificTransaction)) {
            return false;
        }
        BitcoinSpecificTransaction bitcoinSpecificTransaction = (BitcoinSpecificTransaction) obj;
        return vx2.m53586b(this.blockHeight, bitcoinSpecificTransaction.blockHeight) && vx2.m53586b(this.blockTime, bitcoinSpecificTransaction.blockTime) && vx2.m53586b(this.blockhash, bitcoinSpecificTransaction.blockhash) && vx2.m53586b(this.confirmations, bitcoinSpecificTransaction.confirmations) && vx2.m53586b(this.fees, bitcoinSpecificTransaction.fees) && vx2.m53586b(this.hex, bitcoinSpecificTransaction.hex) && vx2.m53586b(this.size, bitcoinSpecificTransaction.size) && vx2.m53586b(this.txid, bitcoinSpecificTransaction.txid) && vx2.m53586b(this.value, bitcoinSpecificTransaction.value) && vx2.m53586b(this.valueIn, bitcoinSpecificTransaction.valueIn) && vx2.m53586b(this.version, bitcoinSpecificTransaction.version) && vx2.m53586b(this.vin, bitcoinSpecificTransaction.vin) && vx2.m53586b(this.vout, bitcoinSpecificTransaction.vout) && vx2.m53586b(this.vsize, bitcoinSpecificTransaction.vsize);
    }

    public final Integer getBlockHeight() {
        return this.blockHeight;
    }

    public final Integer getBlockTime() {
        return this.blockTime;
    }

    public final String getBlockhash() {
        return this.blockhash;
    }

    public final Integer getConfirmations() {
        return this.confirmations;
    }

    public final String getFees() {
        return this.fees;
    }

    public final String getHex() {
        return this.hex;
    }

    public final Integer getSize() {
        return this.size;
    }

    public final String getTxid() {
        return this.txid;
    }

    public final String getValue() {
        return this.value;
    }

    public final String getValueIn() {
        return this.valueIn;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public final List<Vin> getVin() {
        return this.vin;
    }

    public final List<Vout> getVout() {
        return this.vout;
    }

    public final Integer getVsize() {
        return this.vsize;
    }

    public int hashCode() {
        Integer num = this.blockHeight;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.blockTime;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.blockhash;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.confirmations;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.fees;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.hex;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.size;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str4 = this.txid;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.value;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.valueIn;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num5 = this.version;
        int hashCode11 = (hashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        List<Vin> list = this.vin;
        int hashCode12 = (hashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        List<Vout> list2 = this.vout;
        int hashCode13 = (hashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num6 = this.vsize;
        if (num6 != null) {
            i = num6.hashCode();
        }
        return hashCode13 + i;
    }

    public String toString() {
        Integer num = this.blockHeight;
        Integer num2 = this.blockTime;
        String str = this.blockhash;
        Integer num3 = this.confirmations;
        String str2 = this.fees;
        String str3 = this.hex;
        Integer num4 = this.size;
        String str4 = this.txid;
        String str5 = this.value;
        String str6 = this.valueIn;
        Integer num5 = this.version;
        List<Vin> list = this.vin;
        List<Vout> list2 = this.vout;
        Integer num6 = this.vsize;
        return "BitcoinSpecificTransaction(blockHeight=" + num + ", blockTime=" + num2 + ", blockhash=" + str + ", confirmations=" + num3 + ", fees=" + str2 + ", hex=" + str3 + ", size=" + num4 + ", txid=" + str4 + ", value=" + str5 + ", valueIn=" + str6 + ", version=" + num5 + ", vin=" + list + ", vout=" + list2 + ", vsize=" + num6 + ")";
    }
}
