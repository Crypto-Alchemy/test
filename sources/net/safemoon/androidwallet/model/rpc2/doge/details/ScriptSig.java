package net.safemoon.androidwallet.model.rpc2.doge.details;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/doge/details/ScriptSig;", "", "hex", "", "(Ljava/lang/String;)V", "getHex", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@Keep
/* compiled from: ScriptSig.kt */
public final class ScriptSig {
    @SerializedName("hex")
    private final String hex;

    public ScriptSig(String str) {
        this.hex = str;
    }

    public static /* synthetic */ ScriptSig copy$default(ScriptSig scriptSig, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scriptSig.hex;
        }
        return scriptSig.copy(str);
    }

    public final String component1() {
        return this.hex;
    }

    public final ScriptSig copy(String str) {
        return new ScriptSig(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScriptSig) && vx2.m53586b(this.hex, ((ScriptSig) obj).hex);
    }

    public final String getHex() {
        return this.hex;
    }

    public int hashCode() {
        String str = this.hex;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.hex;
        return "ScriptSig(hex=" + str + ")";
    }
}
