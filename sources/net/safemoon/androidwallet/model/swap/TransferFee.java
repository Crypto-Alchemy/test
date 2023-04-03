package net.safemoon.androidwallet.model.swap;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J$\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001a"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/swap/TransferFee;", "", "transferFee", "", "amount", "(Ljava/lang/Double;D)V", "getAmount", "()D", "setAmount", "(D)V", "getTransferFee", "()Ljava/lang/Double;", "setTransferFee", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "component1", "component2", "copy", "(Ljava/lang/Double;D)Lnet/safemoon/androidwallet/model/swap/TransferFee;", "equals", "", "other", "hashCode", "", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: TransferFee.kt */
public final class TransferFee {
    @SerializedName("amount")
    private double amount;
    @SerializedName("transferFee")
    private Double transferFee;

    public TransferFee(Double d, double d2) {
        this.transferFee = d;
        this.amount = d2;
    }

    public static /* synthetic */ TransferFee copy$default(TransferFee transferFee2, Double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = transferFee2.transferFee;
        }
        if ((i & 2) != 0) {
            d2 = transferFee2.amount;
        }
        return transferFee2.copy(d, d2);
    }

    public final Double component1() {
        return this.transferFee;
    }

    public final double component2() {
        return this.amount;
    }

    public final TransferFee copy(Double d, double d2) {
        return new TransferFee(d, d2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferFee)) {
            return false;
        }
        TransferFee transferFee2 = (TransferFee) obj;
        return vx2.m53586b(this.transferFee, transferFee2.transferFee) && Double.compare(this.amount, transferFee2.amount) == 0;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final Double getTransferFee() {
        return this.transferFee;
    }

    public int hashCode() {
        Double d = this.transferFee;
        return ((d == null ? 0 : d.hashCode()) * 31) + Double.doubleToLongBits(this.amount);
    }

    public final void setAmount(double d) {
        this.amount = d;
    }

    public final void setTransferFee(Double d) {
        this.transferFee = d;
    }

    public String toString() {
        Double d = this.transferFee;
        double d2 = this.amount;
        return "TransferFee(transferFee=" + d + ", amount=" + d2 + ")";
    }
}
