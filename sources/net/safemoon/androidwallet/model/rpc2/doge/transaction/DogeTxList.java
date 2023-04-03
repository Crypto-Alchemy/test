package net.safemoon.androidwallet.model.rpc2.doge.transaction;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/doge/transaction/DogeTxList;", "", "success", "", "dogeTransactions", "", "Lnet/safemoon/androidwallet/model/rpc2/doge/transaction/DogeTransaction;", "(ILjava/util/List;)V", "getDogeTransactions", "()Ljava/util/List;", "getSuccess", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@Keep
/* compiled from: DogeTxList.kt */
public final class DogeTxList {
    @SerializedName("transactions")
    private final List<DogeTransaction> dogeTransactions;
    @SerializedName("success")
    private final int success;

    public DogeTxList(int i, List<DogeTransaction> list) {
        vx2.m53591g(list, "dogeTransactions");
        this.success = i;
        this.dogeTransactions = list;
    }

    public static /* synthetic */ DogeTxList copy$default(DogeTxList dogeTxList, int i, List<DogeTransaction> list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dogeTxList.success;
        }
        if ((i2 & 2) != 0) {
            list = dogeTxList.dogeTransactions;
        }
        return dogeTxList.copy(i, list);
    }

    public final int component1() {
        return this.success;
    }

    public final List<DogeTransaction> component2() {
        return this.dogeTransactions;
    }

    public final DogeTxList copy(int i, List<DogeTransaction> list) {
        vx2.m53591g(list, "dogeTransactions");
        return new DogeTxList(i, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DogeTxList)) {
            return false;
        }
        DogeTxList dogeTxList = (DogeTxList) obj;
        return this.success == dogeTxList.success && vx2.m53586b(this.dogeTransactions, dogeTxList.dogeTransactions);
    }

    public final List<DogeTransaction> getDogeTransactions() {
        return this.dogeTransactions;
    }

    public final int getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return (this.success * 31) + this.dogeTransactions.hashCode();
    }

    public String toString() {
        int i = this.success;
        List<DogeTransaction> list = this.dogeTransactions;
        return "DogeTxList(success=" + i + ", dogeTransactions=" + list + ")";
    }
}
