package net.safemoon.androidwallet.model.rpc2.solana;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/Commitment;", "", "commitment", "", "(Ljava/lang/String;)V", "getCommitment", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: Common.kt */
public final class Commitment {
    @SerializedName("commitment")
    @Expose
    private final String commitment;

    public Commitment(String str) {
        vx2.m53591g(str, "commitment");
        this.commitment = str;
    }

    public static /* synthetic */ Commitment copy$default(Commitment commitment2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commitment2.commitment;
        }
        return commitment2.copy(str);
    }

    public final String component1() {
        return this.commitment;
    }

    public final Commitment copy(String str) {
        vx2.m53591g(str, "commitment");
        return new Commitment(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Commitment) && vx2.m53586b(this.commitment, ((Commitment) obj).commitment);
    }

    public final String getCommitment() {
        return this.commitment;
    }

    public int hashCode() {
        return this.commitment.hashCode();
    }

    public String toString() {
        String str = this.commitment;
        return "Commitment(commitment=" + str + ")";
    }
}
