package net.safemoon.androidwallet.model.rpc2.bitcoin;

import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0006HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001a\u0010\u0016R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001e\u0010\u0016R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001f\u0010\u0016¨\u00061"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/bitcoin/CoinSpecificData;", "", "hash", "", "hex", "locktime", "", "size", "txid", "version", "vin", "", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/Vin;", "vout", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/Vout;", "vsize", "weight", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getHash", "()Ljava/lang/String;", "getHex", "getLocktime", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSize", "getTxid", "getVersion", "getVin", "()Ljava/util/List;", "getVout", "getVsize", "getWeight", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)Lnet/safemoon/androidwallet/model/rpc2/bitcoin/CoinSpecificData;", "equals", "", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@Keep
/* compiled from: BitcoinTxSpecificResponse.kt */
public final class CoinSpecificData {
    @SerializedName("hash")
    private final String hash;
    @SerializedName("hex")
    private final String hex;
    @SerializedName("locktime")
    private final Integer locktime;
    @SerializedName("size")
    private final Integer size;
    @SerializedName("txid")
    private final String txid;
    @SerializedName("version")
    private final Integer version;
    @SerializedName("vin")
    private final List<Vin> vin;
    @SerializedName("vout")
    private final List<Vout> vout;
    @SerializedName("vsize")
    private final Integer vsize;
    @SerializedName("weight")
    private final Integer weight;

    public CoinSpecificData(String str, String str2, Integer num, Integer num2, String str3, Integer num3, List<Vin> list, List<Vout> list2, Integer num4, Integer num5) {
        this.hash = str;
        this.hex = str2;
        this.locktime = num;
        this.size = num2;
        this.txid = str3;
        this.version = num3;
        this.vin = list;
        this.vout = list2;
        this.vsize = num4;
        this.weight = num5;
    }

    public static /* synthetic */ CoinSpecificData copy$default(CoinSpecificData coinSpecificData, String str, String str2, Integer num, Integer num2, String str3, Integer num3, List list, List list2, Integer num4, Integer num5, int i, Object obj) {
        CoinSpecificData coinSpecificData2 = coinSpecificData;
        int i2 = i;
        return coinSpecificData.copy((i2 & 1) != 0 ? coinSpecificData2.hash : str, (i2 & 2) != 0 ? coinSpecificData2.hex : str2, (i2 & 4) != 0 ? coinSpecificData2.locktime : num, (i2 & 8) != 0 ? coinSpecificData2.size : num2, (i2 & 16) != 0 ? coinSpecificData2.txid : str3, (i2 & 32) != 0 ? coinSpecificData2.version : num3, (i2 & 64) != 0 ? coinSpecificData2.vin : list, (i2 & 128) != 0 ? coinSpecificData2.vout : list2, (i2 & 256) != 0 ? coinSpecificData2.vsize : num4, (i2 & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? coinSpecificData2.weight : num5);
    }

    public final String component1() {
        return this.hash;
    }

    public final Integer component10() {
        return this.weight;
    }

    public final String component2() {
        return this.hex;
    }

    public final Integer component3() {
        return this.locktime;
    }

    public final Integer component4() {
        return this.size;
    }

    public final String component5() {
        return this.txid;
    }

    public final Integer component6() {
        return this.version;
    }

    public final List<Vin> component7() {
        return this.vin;
    }

    public final List<Vout> component8() {
        return this.vout;
    }

    public final Integer component9() {
        return this.vsize;
    }

    public final CoinSpecificData copy(String str, String str2, Integer num, Integer num2, String str3, Integer num3, List<Vin> list, List<Vout> list2, Integer num4, Integer num5) {
        return new CoinSpecificData(str, str2, num, num2, str3, num3, list, list2, num4, num5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoinSpecificData)) {
            return false;
        }
        CoinSpecificData coinSpecificData = (CoinSpecificData) obj;
        return vx2.m53586b(this.hash, coinSpecificData.hash) && vx2.m53586b(this.hex, coinSpecificData.hex) && vx2.m53586b(this.locktime, coinSpecificData.locktime) && vx2.m53586b(this.size, coinSpecificData.size) && vx2.m53586b(this.txid, coinSpecificData.txid) && vx2.m53586b(this.version, coinSpecificData.version) && vx2.m53586b(this.vin, coinSpecificData.vin) && vx2.m53586b(this.vout, coinSpecificData.vout) && vx2.m53586b(this.vsize, coinSpecificData.vsize) && vx2.m53586b(this.weight, coinSpecificData.weight);
    }

    public final String getHash() {
        return this.hash;
    }

    public final String getHex() {
        return this.hex;
    }

    public final Integer getLocktime() {
        return this.locktime;
    }

    public final Integer getSize() {
        return this.size;
    }

    public final String getTxid() {
        return this.txid;
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

    public final Integer getWeight() {
        return this.weight;
    }

    public int hashCode() {
        String str = this.hash;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.hex;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.locktime;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.size;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.txid;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.version;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<Vin> list = this.vin;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<Vout> list2 = this.vout;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num4 = this.vsize;
        int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.weight;
        if (num5 != null) {
            i = num5.hashCode();
        }
        return hashCode9 + i;
    }

    public String toString() {
        String str = this.hash;
        String str2 = this.hex;
        Integer num = this.locktime;
        Integer num2 = this.size;
        String str3 = this.txid;
        Integer num3 = this.version;
        List<Vin> list = this.vin;
        List<Vout> list2 = this.vout;
        Integer num4 = this.vsize;
        Integer num5 = this.weight;
        return "CoinSpecificData(hash=" + str + ", hex=" + str2 + ", locktime=" + num + ", size=" + num2 + ", txid=" + str3 + ", version=" + num3 + ", vin=" + list + ", vout=" + list2 + ", vsize=" + num4 + ", weight=" + num5 + ")";
    }
}
