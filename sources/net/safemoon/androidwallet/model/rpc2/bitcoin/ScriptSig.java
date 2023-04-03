package net.safemoon.androidwallet.model.rpc2.bitcoin;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/bitcoin/ScriptSig;", "", "asm", "", "hex", "(Ljava/lang/String;Ljava/lang/String;)V", "getAsm", "()Ljava/lang/String;", "getHex", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@Keep
/* compiled from: BitcoinTxSpecificResponse.kt */
public final class ScriptSig {
    @SerializedName("asm")
    private final String asm;
    @SerializedName("hex")
    private final String hex;

    public ScriptSig(String str, String str2) {
        this.asm = str;
        this.hex = str2;
    }

    public static /* synthetic */ ScriptSig copy$default(ScriptSig scriptSig, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scriptSig.asm;
        }
        if ((i & 2) != 0) {
            str2 = scriptSig.hex;
        }
        return scriptSig.copy(str, str2);
    }

    public final String component1() {
        return this.asm;
    }

    public final String component2() {
        return this.hex;
    }

    public final ScriptSig copy(String str, String str2) {
        return new ScriptSig(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScriptSig)) {
            return false;
        }
        ScriptSig scriptSig = (ScriptSig) obj;
        return vx2.m53586b(this.asm, scriptSig.asm) && vx2.m53586b(this.hex, scriptSig.hex);
    }

    public final String getAsm() {
        return this.asm;
    }

    public final String getHex() {
        return this.hex;
    }

    public int hashCode() {
        String str = this.asm;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.hex;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.asm;
        String str2 = this.hex;
        return "ScriptSig(asm=" + str + ", hex=" + str2 + ")";
    }
}
