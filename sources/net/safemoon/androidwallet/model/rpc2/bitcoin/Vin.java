package net.safemoon.androidwallet.model.rpc2.bitcoin;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b%\b\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u0011J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u000bHÖ\u0001J\t\u00101\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\b\u0010\u0014R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\"\u0010\u0017¨\u00062"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/bitcoin/Vin;", "", "scriptSig", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/ScriptSig;", "txinwitness", "", "", "addresses", "isAddress", "", "n", "", "sequence", "", "txid", "value", "vout", "(Lnet/safemoon/androidwallet/model/rpc2/bitcoin/ScriptSig;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAddresses", "()Ljava/util/List;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getN", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getScriptSig", "()Lnet/safemoon/androidwallet/model/rpc2/bitcoin/ScriptSig;", "getSequence", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTxid", "()Ljava/lang/String;", "getTxinwitness", "getValue", "getVout", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lnet/safemoon/androidwallet/model/rpc2/bitcoin/ScriptSig;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lnet/safemoon/androidwallet/model/rpc2/bitcoin/Vin;", "equals", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@Keep
/* compiled from: BitcoinTxSpecificResponse.kt */
public final class Vin {
    @SerializedName("addresses")
    private final List<String> addresses;
    @SerializedName("isAddress")
    private final Boolean isAddress;
    @SerializedName("n")

    /* renamed from: n */
    private final Integer f42471n;
    @SerializedName("scriptSig")
    private final ScriptSig scriptSig;
    @SerializedName("sequence")
    private final Long sequence;
    @SerializedName("txid")
    private final String txid;
    @SerializedName("txinwitness")
    private final List<String> txinwitness;
    @SerializedName("value")
    private final String value;
    @SerializedName("vout")
    private final Integer vout;

    public Vin(ScriptSig scriptSig2, List<String> list, List<String> list2, Boolean bool, Integer num, Long l, String str, String str2, Integer num2) {
        this.scriptSig = scriptSig2;
        this.txinwitness = list;
        this.addresses = list2;
        this.isAddress = bool;
        this.f42471n = num;
        this.sequence = l;
        this.txid = str;
        this.value = str2;
        this.vout = num2;
    }

    public static /* synthetic */ Vin copy$default(Vin vin, ScriptSig scriptSig2, List list, List list2, Boolean bool, Integer num, Long l, String str, String str2, Integer num2, int i, Object obj) {
        Vin vin2 = vin;
        int i2 = i;
        return vin.copy((i2 & 1) != 0 ? vin2.scriptSig : scriptSig2, (i2 & 2) != 0 ? vin2.txinwitness : list, (i2 & 4) != 0 ? vin2.addresses : list2, (i2 & 8) != 0 ? vin2.isAddress : bool, (i2 & 16) != 0 ? vin2.f42471n : num, (i2 & 32) != 0 ? vin2.sequence : l, (i2 & 64) != 0 ? vin2.txid : str, (i2 & 128) != 0 ? vin2.value : str2, (i2 & 256) != 0 ? vin2.vout : num2);
    }

    public final ScriptSig component1() {
        return this.scriptSig;
    }

    public final List<String> component2() {
        return this.txinwitness;
    }

    public final List<String> component3() {
        return this.addresses;
    }

    public final Boolean component4() {
        return this.isAddress;
    }

    public final Integer component5() {
        return this.f42471n;
    }

    public final Long component6() {
        return this.sequence;
    }

    public final String component7() {
        return this.txid;
    }

    public final String component8() {
        return this.value;
    }

    public final Integer component9() {
        return this.vout;
    }

    public final Vin copy(ScriptSig scriptSig2, List<String> list, List<String> list2, Boolean bool, Integer num, Long l, String str, String str2, Integer num2) {
        return new Vin(scriptSig2, list, list2, bool, num, l, str, str2, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vin)) {
            return false;
        }
        Vin vin = (Vin) obj;
        return vx2.m53586b(this.scriptSig, vin.scriptSig) && vx2.m53586b(this.txinwitness, vin.txinwitness) && vx2.m53586b(this.addresses, vin.addresses) && vx2.m53586b(this.isAddress, vin.isAddress) && vx2.m53586b(this.f42471n, vin.f42471n) && vx2.m53586b(this.sequence, vin.sequence) && vx2.m53586b(this.txid, vin.txid) && vx2.m53586b(this.value, vin.value) && vx2.m53586b(this.vout, vin.vout);
    }

    public final List<String> getAddresses() {
        return this.addresses;
    }

    public final Integer getN() {
        return this.f42471n;
    }

    public final ScriptSig getScriptSig() {
        return this.scriptSig;
    }

    public final Long getSequence() {
        return this.sequence;
    }

    public final String getTxid() {
        return this.txid;
    }

    public final List<String> getTxinwitness() {
        return this.txinwitness;
    }

    public final String getValue() {
        return this.value;
    }

    public final Integer getVout() {
        return this.vout;
    }

    public int hashCode() {
        ScriptSig scriptSig2 = this.scriptSig;
        int i = 0;
        int hashCode = (scriptSig2 == null ? 0 : scriptSig2.hashCode()) * 31;
        List<String> list = this.txinwitness;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.addresses;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.isAddress;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f42471n;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.sequence;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.txid;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.value;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.vout;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode8 + i;
    }

    public final Boolean isAddress() {
        return this.isAddress;
    }

    public String toString() {
        ScriptSig scriptSig2 = this.scriptSig;
        List<String> list = this.txinwitness;
        List<String> list2 = this.addresses;
        Boolean bool = this.isAddress;
        Integer num = this.f42471n;
        Long l = this.sequence;
        String str = this.txid;
        String str2 = this.value;
        Integer num2 = this.vout;
        return "Vin(scriptSig=" + scriptSig2 + ", txinwitness=" + list + ", addresses=" + list2 + ", isAddress=" + bool + ", n=" + num + ", sequence=" + l + ", txid=" + str + ", value=" + str2 + ", vout=" + num2 + ")";
    }
}
