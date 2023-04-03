package net.safemoon.androidwallet.model.transaction.solana;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/transaction/solana/SolStatus;", "", "fee", "", "slot", "status", "", "txHash", "(IILjava/lang/String;Ljava/lang/String;)V", "getFee", "()I", "getSlot", "getStatus", "()Ljava/lang/String;", "getTxHash", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SolStatus.kt */
public final class SolStatus {
    private final int fee;
    private final int slot;
    private final String status;
    private final String txHash;

    public SolStatus(int i, int i2, String str, String str2) {
        vx2.m53591g(str, "status");
        vx2.m53591g(str2, "txHash");
        this.fee = i;
        this.slot = i2;
        this.status = str;
        this.txHash = str2;
    }

    public static /* synthetic */ SolStatus copy$default(SolStatus solStatus, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = solStatus.fee;
        }
        if ((i3 & 2) != 0) {
            i2 = solStatus.slot;
        }
        if ((i3 & 4) != 0) {
            str = solStatus.status;
        }
        if ((i3 & 8) != 0) {
            str2 = solStatus.txHash;
        }
        return solStatus.copy(i, i2, str, str2);
    }

    public final int component1() {
        return this.fee;
    }

    public final int component2() {
        return this.slot;
    }

    public final String component3() {
        return this.status;
    }

    public final String component4() {
        return this.txHash;
    }

    public final SolStatus copy(int i, int i2, String str, String str2) {
        vx2.m53591g(str, "status");
        vx2.m53591g(str2, "txHash");
        return new SolStatus(i, i2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SolStatus)) {
            return false;
        }
        SolStatus solStatus = (SolStatus) obj;
        return this.fee == solStatus.fee && this.slot == solStatus.slot && vx2.m53586b(this.status, solStatus.status) && vx2.m53586b(this.txHash, solStatus.txHash);
    }

    public final int getFee() {
        return this.fee;
    }

    public final int getSlot() {
        return this.slot;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTxHash() {
        return this.txHash;
    }

    public int hashCode() {
        return (((((this.fee * 31) + this.slot) * 31) + this.status.hashCode()) * 31) + this.txHash.hashCode();
    }

    public String toString() {
        int i = this.fee;
        int i2 = this.slot;
        String str = this.status;
        String str2 = this.txHash;
        return "SolStatus(fee=" + i + ", slot=" + i2 + ", status=" + str + ", txHash=" + str2 + ")";
    }
}
