package net.safemoon.androidwallet.model.rpc2.bitcoin;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/bitcoin/SpendingOutpoint;", "", "n", "", "txIndex", "", "(Ljava/lang/Integer;Ljava/lang/Long;)V", "getN", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTxIndex", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;)Lnet/safemoon/androidwallet/model/rpc2/bitcoin/SpendingOutpoint;", "equals", "", "other", "hashCode", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@Keep
/* compiled from: BlockChainTransactionList.kt */
public final class SpendingOutpoint {
    @SerializedName("n")

    /* renamed from: n */
    private final Integer f42470n;
    @SerializedName("tx_index")
    private final Long txIndex;

    public SpendingOutpoint(Integer num, Long l) {
        this.f42470n = num;
        this.txIndex = l;
    }

    public static /* synthetic */ SpendingOutpoint copy$default(SpendingOutpoint spendingOutpoint, Integer num, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            num = spendingOutpoint.f42470n;
        }
        if ((i & 2) != 0) {
            l = spendingOutpoint.txIndex;
        }
        return spendingOutpoint.copy(num, l);
    }

    public final Integer component1() {
        return this.f42470n;
    }

    public final Long component2() {
        return this.txIndex;
    }

    public final SpendingOutpoint copy(Integer num, Long l) {
        return new SpendingOutpoint(num, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpendingOutpoint)) {
            return false;
        }
        SpendingOutpoint spendingOutpoint = (SpendingOutpoint) obj;
        return vx2.m53586b(this.f42470n, spendingOutpoint.f42470n) && vx2.m53586b(this.txIndex, spendingOutpoint.txIndex);
    }

    public final Integer getN() {
        return this.f42470n;
    }

    public final Long getTxIndex() {
        return this.txIndex;
    }

    public int hashCode() {
        Integer num = this.f42470n;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.txIndex;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        Integer num = this.f42470n;
        Long l = this.txIndex;
        return "SpendingOutpoint(n=" + num + ", txIndex=" + l + ")";
    }
}
