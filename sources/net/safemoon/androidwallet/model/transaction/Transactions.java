package net.safemoon.androidwallet.model.transaction;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.transaction.history.TransactionHistoryModel;

@Metadata(mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/transaction/Transactions;", "", "code", "", "message", "data", "Lnet/safemoon/androidwallet/model/transaction/history/TransactionHistoryModel;", "(Ljava/lang/String;Ljava/lang/String;Lnet/safemoon/androidwallet/model/transaction/history/TransactionHistoryModel;)V", "getCode", "()Ljava/lang/String;", "getData", "()Lnet/safemoon/androidwallet/model/transaction/history/TransactionHistoryModel;", "getMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: transactions.kt */
public final class Transactions {
    @SerializedName("code")
    private final String code;
    @SerializedName("data")
    private final TransactionHistoryModel data;
    @SerializedName("message")
    private final String message;

    public Transactions(String str, String str2, TransactionHistoryModel transactionHistoryModel) {
        vx2.m53591g(str, "code");
        vx2.m53591g(str2, ThrowableDeserializer.PROP_NAME_MESSAGE);
        vx2.m53591g(transactionHistoryModel, "data");
        this.code = str;
        this.message = str2;
        this.data = transactionHistoryModel;
    }

    public static /* synthetic */ Transactions copy$default(Transactions transactions, String str, String str2, TransactionHistoryModel transactionHistoryModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transactions.code;
        }
        if ((i & 2) != 0) {
            str2 = transactions.message;
        }
        if ((i & 4) != 0) {
            transactionHistoryModel = transactions.data;
        }
        return transactions.copy(str, str2, transactionHistoryModel);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final TransactionHistoryModel component3() {
        return this.data;
    }

    public final Transactions copy(String str, String str2, TransactionHistoryModel transactionHistoryModel) {
        vx2.m53591g(str, "code");
        vx2.m53591g(str2, ThrowableDeserializer.PROP_NAME_MESSAGE);
        vx2.m53591g(transactionHistoryModel, "data");
        return new Transactions(str, str2, transactionHistoryModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Transactions)) {
            return false;
        }
        Transactions transactions = (Transactions) obj;
        return vx2.m53586b(this.code, transactions.code) && vx2.m53586b(this.message, transactions.message) && vx2.m53586b(this.data, transactions.data);
    }

    public final String getCode() {
        return this.code;
    }

    public final TransactionHistoryModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (((this.code.hashCode() * 31) + this.message.hashCode()) * 31) + this.data.hashCode();
    }

    public String toString() {
        String str = this.code;
        String str2 = this.message;
        TransactionHistoryModel transactionHistoryModel = this.data;
        return "Transactions(code=" + str + ", message=" + str2 + ", data=" + transactionHistoryModel + ")";
    }
}
