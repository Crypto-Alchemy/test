package net.safemoon.androidwallet.model.transaction.solana;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/transaction/solana/Params;", "", "amount", "", "destination", "", "source", "(ILjava/lang/String;Ljava/lang/String;)V", "getAmount", "()I", "getDestination", "()Ljava/lang/String;", "getSource", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: Params.kt */
public final class Params {
    private final int amount;
    private final String destination;
    private final String source;

    public Params(int i, String str, String str2) {
        vx2.m53591g(str, "destination");
        vx2.m53591g(str2, "source");
        this.amount = i;
        this.destination = str;
        this.source = str2;
    }

    public static /* synthetic */ Params copy$default(Params params, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = params.amount;
        }
        if ((i2 & 2) != 0) {
            str = params.destination;
        }
        if ((i2 & 4) != 0) {
            str2 = params.source;
        }
        return params.copy(i, str, str2);
    }

    public final int component1() {
        return this.amount;
    }

    public final String component2() {
        return this.destination;
    }

    public final String component3() {
        return this.source;
    }

    public final Params copy(int i, String str, String str2) {
        vx2.m53591g(str, "destination");
        vx2.m53591g(str2, "source");
        return new Params(i, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Params)) {
            return false;
        }
        Params params = (Params) obj;
        return this.amount == params.amount && vx2.m53586b(this.destination, params.destination) && vx2.m53586b(this.source, params.source);
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getDestination() {
        return this.destination;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return (((this.amount * 31) + this.destination.hashCode()) * 31) + this.source.hashCode();
    }

    public String toString() {
        int i = this.amount;
        String str = this.destination;
        String str2 = this.source;
        return "Params(amount=" + i + ", destination=" + str + ", source=" + str2 + ")";
    }
}
