package net.safemoon.androidwallet.model.rpc2.solana;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/Encoding;", "", "encoding", "", "(Ljava/lang/String;)V", "getEncoding", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: Common.kt */
public final class Encoding {
    @SerializedName("encoding")
    @Expose
    private final String encoding;

    public Encoding() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public Encoding(String str) {
        vx2.m53591g(str, "encoding");
        this.encoding = str;
    }

    public static /* synthetic */ Encoding copy$default(Encoding encoding2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = encoding2.encoding;
        }
        return encoding2.copy(str);
    }

    public final String component1() {
        return this.encoding;
    }

    public final Encoding copy(String str) {
        vx2.m53591g(str, "encoding");
        return new Encoding(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Encoding) && vx2.m53586b(this.encoding, ((Encoding) obj).encoding);
    }

    public final String getEncoding() {
        return this.encoding;
    }

    public int hashCode() {
        return this.encoding.hashCode();
    }

    public String toString() {
        String str = this.encoding;
        return "Encoding(encoding=" + str + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Encoding(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "jsonParsed" : str);
    }
}
