package net.safemoon.androidwallet.model.rpc2.bitcoin;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/bitcoin/ScriptPubKey;", "", "address", "", "asm", "desc", "hex", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getAsm", "getDesc", "getHex", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@Keep
/* compiled from: BitcoinTxSpecificResponse.kt */
public final class ScriptPubKey {
    @SerializedName("address")
    private final String address;
    @SerializedName("asm")
    private final String asm;
    @SerializedName("desc")
    private final String desc;
    @SerializedName("hex")
    private final String hex;
    @SerializedName("type")
    private final String type;

    public ScriptPubKey(String str, String str2, String str3, String str4, String str5) {
        this.address = str;
        this.asm = str2;
        this.desc = str3;
        this.hex = str4;
        this.type = str5;
    }

    public static /* synthetic */ ScriptPubKey copy$default(ScriptPubKey scriptPubKey, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scriptPubKey.address;
        }
        if ((i & 2) != 0) {
            str2 = scriptPubKey.asm;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = scriptPubKey.desc;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = scriptPubKey.hex;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = scriptPubKey.type;
        }
        return scriptPubKey.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.address;
    }

    public final String component2() {
        return this.asm;
    }

    public final String component3() {
        return this.desc;
    }

    public final String component4() {
        return this.hex;
    }

    public final String component5() {
        return this.type;
    }

    public final ScriptPubKey copy(String str, String str2, String str3, String str4, String str5) {
        return new ScriptPubKey(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScriptPubKey)) {
            return false;
        }
        ScriptPubKey scriptPubKey = (ScriptPubKey) obj;
        return vx2.m53586b(this.address, scriptPubKey.address) && vx2.m53586b(this.asm, scriptPubKey.asm) && vx2.m53586b(this.desc, scriptPubKey.desc) && vx2.m53586b(this.hex, scriptPubKey.hex) && vx2.m53586b(this.type, scriptPubKey.type);
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getAsm() {
        return this.asm;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getHex() {
        return this.hex;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.address;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.asm;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.desc;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.hex;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.type;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.address;
        String str2 = this.asm;
        String str3 = this.desc;
        String str4 = this.hex;
        String str5 = this.type;
        return "ScriptPubKey(address=" + str + ", asm=" + str2 + ", desc=" + str3 + ", hex=" + str4 + ", type=" + str5 + ")";
    }
}
