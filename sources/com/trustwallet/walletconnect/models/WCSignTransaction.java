package com.trustwallet.walletconnect.models;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/models/WCSignTransaction;", "", "network", "", "transaction", "", "(ILjava/lang/String;)V", "getNetwork", "()I", "getTransaction", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCSignTransaction.kt */
public final class WCSignTransaction {
    private final int network;
    private final String transaction;

    public WCSignTransaction(int i, String str) {
        vx2.m53591g(str, "transaction");
        this.network = i;
        this.transaction = str;
    }

    public static /* synthetic */ WCSignTransaction copy$default(WCSignTransaction wCSignTransaction, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wCSignTransaction.network;
        }
        if ((i2 & 2) != 0) {
            str = wCSignTransaction.transaction;
        }
        return wCSignTransaction.copy(i, str);
    }

    public final int component1() {
        return this.network;
    }

    public final String component2() {
        return this.transaction;
    }

    public final WCSignTransaction copy(int i, String str) {
        vx2.m53591g(str, "transaction");
        return new WCSignTransaction(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WCSignTransaction)) {
            return false;
        }
        WCSignTransaction wCSignTransaction = (WCSignTransaction) obj;
        return this.network == wCSignTransaction.network && vx2.m53586b(this.transaction, wCSignTransaction.transaction);
    }

    public final int getNetwork() {
        return this.network;
    }

    public final String getTransaction() {
        return this.transaction;
    }

    public int hashCode() {
        return (this.network * 31) + this.transaction.hashCode();
    }

    public String toString() {
        return "WCSignTransaction(network=" + this.network + ", transaction=" + this.transaction + ')';
    }
}
