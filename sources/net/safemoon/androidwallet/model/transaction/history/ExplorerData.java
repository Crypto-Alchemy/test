package net.safemoon.androidwallet.model.transaction.history;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/transaction/history/ExplorerData;", "", "tx", "Lnet/safemoon/androidwallet/model/transaction/history/Tx;", "begin", "", "(Lnet/safemoon/androidwallet/model/transaction/history/Tx;Ljava/lang/Integer;)V", "getBegin", "()Ljava/lang/Integer;", "setBegin", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTx", "()Lnet/safemoon/androidwallet/model/transaction/history/Tx;", "setTx", "(Lnet/safemoon/androidwallet/model/transaction/history/Tx;)V", "component1", "component2", "copy", "(Lnet/safemoon/androidwallet/model/transaction/history/Tx;Ljava/lang/Integer;)Lnet/safemoon/androidwallet/model/transaction/history/ExplorerData;", "equals", "", "other", "hashCode", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SolSplFromExplorer.kt */
public final class ExplorerData {
    @SerializedName("begin")
    private Integer begin;
    @SerializedName("tx")

    /* renamed from: tx */
    private C8604Tx f42484tx;

    public ExplorerData() {
        this((C8604Tx) null, (Integer) null, 3, (DefaultConstructorMarker) null);
    }

    public ExplorerData(C8604Tx tx, Integer num) {
        this.f42484tx = tx;
        this.begin = num;
    }

    public static /* synthetic */ ExplorerData copy$default(ExplorerData explorerData, C8604Tx tx, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            tx = explorerData.f42484tx;
        }
        if ((i & 2) != 0) {
            num = explorerData.begin;
        }
        return explorerData.copy(tx, num);
    }

    public final C8604Tx component1() {
        return this.f42484tx;
    }

    public final Integer component2() {
        return this.begin;
    }

    public final ExplorerData copy(C8604Tx tx, Integer num) {
        return new ExplorerData(tx, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExplorerData)) {
            return false;
        }
        ExplorerData explorerData = (ExplorerData) obj;
        return vx2.m53586b(this.f42484tx, explorerData.f42484tx) && vx2.m53586b(this.begin, explorerData.begin);
    }

    public final Integer getBegin() {
        return this.begin;
    }

    public final C8604Tx getTx() {
        return this.f42484tx;
    }

    public int hashCode() {
        C8604Tx tx = this.f42484tx;
        int i = 0;
        int hashCode = (tx == null ? 0 : tx.hashCode()) * 31;
        Integer num = this.begin;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public final void setBegin(Integer num) {
        this.begin = num;
    }

    public final void setTx(C8604Tx tx) {
        this.f42484tx = tx;
    }

    public String toString() {
        C8604Tx tx = this.f42484tx;
        Integer num = this.begin;
        return "ExplorerData(tx=" + tx + ", begin=" + num + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExplorerData(C8604Tx tx, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C8604Tx((ArrayList) null, (Integer) null, (Boolean) null, 7, (DefaultConstructorMarker) null) : tx, (i & 2) != 0 ? null : num);
    }
}
