package net.safemoon.androidwallet.model.rpc2.bitcoin;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\"\b\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0010J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014Jt\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0005HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001f\u0010\u0014R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b \u0010\u0014¨\u0006/"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/bitcoin/Out;", "", "addr", "", "n", "", "script", "spendingOutpoints", "", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/SpendingOutpoint;", "spent", "", "txIndex", "", "type", "value", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAddr", "()Ljava/lang/String;", "getN", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getScript", "getSpendingOutpoints", "()Ljava/util/List;", "getSpent", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTxIndex", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getType", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)Lnet/safemoon/androidwallet/model/rpc2/bitcoin/Out;", "equals", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@Keep
/* compiled from: BlockChainTransactionList.kt */
public final class Out {
    @SerializedName("addr")
    private final String addr;
    @SerializedName("n")

    /* renamed from: n */
    private final Integer f42468n;
    @SerializedName("script")
    private final String script;
    @SerializedName("spending_outpoints")
    private final List<SpendingOutpoint> spendingOutpoints;
    @SerializedName("spent")
    private final Boolean spent;
    @SerializedName("tx_index")
    private final Long txIndex;
    @SerializedName("type")
    private final Integer type;
    @SerializedName("value")
    private final Integer value;

    public Out(String str, Integer num, String str2, List<SpendingOutpoint> list, Boolean bool, Long l, Integer num2, Integer num3) {
        this.addr = str;
        this.f42468n = num;
        this.script = str2;
        this.spendingOutpoints = list;
        this.spent = bool;
        this.txIndex = l;
        this.type = num2;
        this.value = num3;
    }

    public static /* synthetic */ Out copy$default(Out out, String str, Integer num, String str2, List list, Boolean bool, Long l, Integer num2, Integer num3, int i, Object obj) {
        Out out2 = out;
        int i2 = i;
        return out.copy((i2 & 1) != 0 ? out2.addr : str, (i2 & 2) != 0 ? out2.f42468n : num, (i2 & 4) != 0 ? out2.script : str2, (i2 & 8) != 0 ? out2.spendingOutpoints : list, (i2 & 16) != 0 ? out2.spent : bool, (i2 & 32) != 0 ? out2.txIndex : l, (i2 & 64) != 0 ? out2.type : num2, (i2 & 128) != 0 ? out2.value : num3);
    }

    public final String component1() {
        return this.addr;
    }

    public final Integer component2() {
        return this.f42468n;
    }

    public final String component3() {
        return this.script;
    }

    public final List<SpendingOutpoint> component4() {
        return this.spendingOutpoints;
    }

    public final Boolean component5() {
        return this.spent;
    }

    public final Long component6() {
        return this.txIndex;
    }

    public final Integer component7() {
        return this.type;
    }

    public final Integer component8() {
        return this.value;
    }

    public final Out copy(String str, Integer num, String str2, List<SpendingOutpoint> list, Boolean bool, Long l, Integer num2, Integer num3) {
        return new Out(str, num, str2, list, bool, l, num2, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Out)) {
            return false;
        }
        Out out = (Out) obj;
        return vx2.m53586b(this.addr, out.addr) && vx2.m53586b(this.f42468n, out.f42468n) && vx2.m53586b(this.script, out.script) && vx2.m53586b(this.spendingOutpoints, out.spendingOutpoints) && vx2.m53586b(this.spent, out.spent) && vx2.m53586b(this.txIndex, out.txIndex) && vx2.m53586b(this.type, out.type) && vx2.m53586b(this.value, out.value);
    }

    public final String getAddr() {
        return this.addr;
    }

    public final Integer getN() {
        return this.f42468n;
    }

    public final String getScript() {
        return this.script;
    }

    public final List<SpendingOutpoint> getSpendingOutpoints() {
        return this.spendingOutpoints;
    }

    public final Boolean getSpent() {
        return this.spent;
    }

    public final Long getTxIndex() {
        return this.txIndex;
    }

    public final Integer getType() {
        return this.type;
    }

    public final Integer getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.addr;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f42468n;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.script;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<SpendingOutpoint> list = this.spendingOutpoints;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.spent;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.txIndex;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.type;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.value;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        String str = this.addr;
        Integer num = this.f42468n;
        String str2 = this.script;
        List<SpendingOutpoint> list = this.spendingOutpoints;
        Boolean bool = this.spent;
        Long l = this.txIndex;
        Integer num2 = this.type;
        Integer num3 = this.value;
        return "Out(addr=" + str + ", n=" + num + ", script=" + str2 + ", spendingOutpoints=" + list + ", spent=" + bool + ", txIndex=" + l + ", type=" + num2 + ", value=" + num3 + ")";
    }
}
