package net.safemoon.androidwallet.model.rpc2.doge.details;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/doge/details/DogeTxDetails;", "", "success", "", "transaction", "Lnet/safemoon/androidwallet/model/rpc2/doge/details/Transaction;", "(Ljava/lang/Integer;Lnet/safemoon/androidwallet/model/rpc2/doge/details/Transaction;)V", "getSuccess", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTransaction", "()Lnet/safemoon/androidwallet/model/rpc2/doge/details/Transaction;", "component1", "component2", "copy", "(Ljava/lang/Integer;Lnet/safemoon/androidwallet/model/rpc2/doge/details/Transaction;)Lnet/safemoon/androidwallet/model/rpc2/doge/details/DogeTxDetails;", "equals", "", "other", "hashCode", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@Keep
/* compiled from: DogeTxDetails.kt */
public final class DogeTxDetails {
    @SerializedName("success")
    private final Integer success;
    @SerializedName("transaction")
    private final Transaction transaction;

    public DogeTxDetails(Integer num, Transaction transaction2) {
        this.success = num;
        this.transaction = transaction2;
    }

    public static /* synthetic */ DogeTxDetails copy$default(DogeTxDetails dogeTxDetails, Integer num, Transaction transaction2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = dogeTxDetails.success;
        }
        if ((i & 2) != 0) {
            transaction2 = dogeTxDetails.transaction;
        }
        return dogeTxDetails.copy(num, transaction2);
    }

    public final Integer component1() {
        return this.success;
    }

    public final Transaction component2() {
        return this.transaction;
    }

    public final DogeTxDetails copy(Integer num, Transaction transaction2) {
        return new DogeTxDetails(num, transaction2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DogeTxDetails)) {
            return false;
        }
        DogeTxDetails dogeTxDetails = (DogeTxDetails) obj;
        return vx2.m53586b(this.success, dogeTxDetails.success) && vx2.m53586b(this.transaction, dogeTxDetails.transaction);
    }

    public final Integer getSuccess() {
        return this.success;
    }

    public final Transaction getTransaction() {
        return this.transaction;
    }

    public int hashCode() {
        Integer num = this.success;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Transaction transaction2 = this.transaction;
        if (transaction2 != null) {
            i = transaction2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        Integer num = this.success;
        Transaction transaction2 = this.transaction;
        return "DogeTxDetails(success=" + num + ", transaction=" + transaction2 + ")";
    }
}
