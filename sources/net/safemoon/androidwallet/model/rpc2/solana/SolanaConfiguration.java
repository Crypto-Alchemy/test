package net.safemoon.androidwallet.model.rpc2.solana;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaConfiguration;", "", "encoding", "", "(I)V", "getEncoding", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SolanaSendTransactionMessageRequest.kt */
public final class SolanaConfiguration {
    @SerializedName("maxRetries")
    @Expose
    private final int encoding;

    public SolanaConfiguration() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public SolanaConfiguration(int i) {
        this.encoding = i;
    }

    public static /* synthetic */ SolanaConfiguration copy$default(SolanaConfiguration solanaConfiguration, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = solanaConfiguration.encoding;
        }
        return solanaConfiguration.copy(i);
    }

    public final int component1() {
        return this.encoding;
    }

    public final SolanaConfiguration copy(int i) {
        return new SolanaConfiguration(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SolanaConfiguration) && this.encoding == ((SolanaConfiguration) obj).encoding;
    }

    public final int getEncoding() {
        return this.encoding;
    }

    public int hashCode() {
        return this.encoding;
    }

    public String toString() {
        int i = this.encoding;
        return "SolanaConfiguration(encoding=" + i + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SolanaConfiguration(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 5 : i);
    }
}
