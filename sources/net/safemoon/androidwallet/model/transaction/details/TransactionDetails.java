package net.safemoon.androidwallet.model.transaction.details;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/transaction/details/TransactionDetails;", "", "data", "Lnet/safemoon/androidwallet/model/transaction/details/TransactionDetailsData;", "(Lnet/safemoon/androidwallet/model/transaction/details/TransactionDetailsData;)V", "getData", "()Lnet/safemoon/androidwallet/model/transaction/details/TransactionDetailsData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: TransactionDetails.kt */
public final class TransactionDetails {
    @SerializedName("data")
    private final TransactionDetailsData data;

    public TransactionDetails(TransactionDetailsData transactionDetailsData) {
        vx2.m53591g(transactionDetailsData, "data");
        this.data = transactionDetailsData;
    }

    public static /* synthetic */ TransactionDetails copy$default(TransactionDetails transactionDetails, TransactionDetailsData transactionDetailsData, int i, Object obj) {
        if ((i & 1) != 0) {
            transactionDetailsData = transactionDetails.data;
        }
        return transactionDetails.copy(transactionDetailsData);
    }

    public final TransactionDetailsData component1() {
        return this.data;
    }

    public final TransactionDetails copy(TransactionDetailsData transactionDetailsData) {
        vx2.m53591g(transactionDetailsData, "data");
        return new TransactionDetails(transactionDetailsData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TransactionDetails) && vx2.m53586b(this.data, ((TransactionDetails) obj).data);
    }

    public final TransactionDetailsData getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        TransactionDetailsData transactionDetailsData = this.data;
        return "TransactionDetails(data=" + transactionDetailsData + ")";
    }
}
