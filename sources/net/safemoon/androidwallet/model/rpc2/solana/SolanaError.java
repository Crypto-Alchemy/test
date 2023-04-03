package net.safemoon.androidwallet.model.rpc2.solana;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaError;", "", "code", "", "message", "", "(JLjava/lang/String;)V", "getCode", "()J", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SolanaResponse.kt */
public final class SolanaError {
    @SerializedName("code")
    @Expose
    private final long code;
    @SerializedName("message")
    @Expose
    private final String message;

    public SolanaError(long j, String str) {
        vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
        this.code = j;
        this.message = str;
    }

    public static /* synthetic */ SolanaError copy$default(SolanaError solanaError, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = solanaError.code;
        }
        if ((i & 2) != 0) {
            str = solanaError.message;
        }
        return solanaError.copy(j, str);
    }

    public final long component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final SolanaError copy(long j, String str) {
        vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
        return new SolanaError(j, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SolanaError)) {
            return false;
        }
        SolanaError solanaError = (SolanaError) obj;
        return this.code == solanaError.code && vx2.m53586b(this.message, solanaError.message);
    }

    public final long getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (au0.m10781a(this.code) * 31) + this.message.hashCode();
    }

    public String toString() {
        long j = this.code;
        String str = this.message;
        return "SolanaError(code=" + j + ", message=" + str + ")";
    }
}
