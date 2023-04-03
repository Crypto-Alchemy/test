package net.safemoon.androidwallet.model.transaction.history;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B7\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0019\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\fJ@\u0010\u001c\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\"\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R.\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006#"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/transaction/history/Tx;", "", "transactions", "Ljava/util/ArrayList;", "Lnet/safemoon/androidwallet/model/transaction/history/Transactions;", "Lkotlin/collections/ArrayList;", "total", "", "hasNext", "", "(Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getHasNext", "()Ljava/lang/Boolean;", "setHasNext", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getTotal", "()Ljava/lang/Integer;", "setTotal", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTransactions", "()Ljava/util/ArrayList;", "setTransactions", "(Ljava/util/ArrayList;)V", "component1", "component2", "component3", "copy", "(Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Boolean;)Lnet/safemoon/androidwallet/model/transaction/history/Tx;", "equals", "other", "hashCode", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: net.safemoon.androidwallet.model.transaction.history.Tx */
/* compiled from: SolSplFromExplorer.kt */
public final class C8604Tx {
    @SerializedName("hasNext")
    private Boolean hasNext;
    @SerializedName("total")
    private Integer total;
    @SerializedName("transactions")
    private ArrayList<Transactions> transactions;

    public C8604Tx() {
        this((ArrayList) null, (Integer) null, (Boolean) null, 7, (DefaultConstructorMarker) null);
    }

    public C8604Tx(ArrayList<Transactions> arrayList, Integer num, Boolean bool) {
        vx2.m53591g(arrayList, "transactions");
        this.transactions = arrayList;
        this.total = num;
        this.hasNext = bool;
    }

    public static /* synthetic */ C8604Tx copy$default(C8604Tx tx, ArrayList<Transactions> arrayList, Integer num, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = tx.transactions;
        }
        if ((i & 2) != 0) {
            num = tx.total;
        }
        if ((i & 4) != 0) {
            bool = tx.hasNext;
        }
        return tx.copy(arrayList, num, bool);
    }

    public final ArrayList<Transactions> component1() {
        return this.transactions;
    }

    public final Integer component2() {
        return this.total;
    }

    public final Boolean component3() {
        return this.hasNext;
    }

    public final C8604Tx copy(ArrayList<Transactions> arrayList, Integer num, Boolean bool) {
        vx2.m53591g(arrayList, "transactions");
        return new C8604Tx(arrayList, num, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8604Tx)) {
            return false;
        }
        C8604Tx tx = (C8604Tx) obj;
        return vx2.m53586b(this.transactions, tx.transactions) && vx2.m53586b(this.total, tx.total) && vx2.m53586b(this.hasNext, tx.hasNext);
    }

    public final Boolean getHasNext() {
        return this.hasNext;
    }

    public final Integer getTotal() {
        return this.total;
    }

    public final ArrayList<Transactions> getTransactions() {
        return this.transactions;
    }

    public int hashCode() {
        int hashCode = this.transactions.hashCode() * 31;
        Integer num = this.total;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.hasNext;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode2 + i;
    }

    public final void setHasNext(Boolean bool) {
        this.hasNext = bool;
    }

    public final void setTotal(Integer num) {
        this.total = num;
    }

    public final void setTransactions(ArrayList<Transactions> arrayList) {
        vx2.m53591g(arrayList, "<set-?>");
        this.transactions = arrayList;
    }

    public String toString() {
        ArrayList<Transactions> arrayList = this.transactions;
        Integer num = this.total;
        Boolean bool = this.hasNext;
        return "Tx(transactions=" + arrayList + ", total=" + num + ", hasNext=" + bool + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8604Tx(ArrayList arrayList, Integer num, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : arrayList, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool);
    }
}
