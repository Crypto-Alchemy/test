package net.safemoon.androidwallet.model.rpc2.bitcoin;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\b\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\\\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u000bHÖ\u0001J\t\u0010%\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\b\u0010\u0012R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011¨\u0006&"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/bitcoin/Vout;", "", "scriptPubKey", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/ScriptPubKey;", "addresses", "", "", "hex", "isAddress", "", "n", "", "value", "(Lnet/safemoon/androidwallet/model/rpc2/bitcoin/ScriptPubKey;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;)V", "getAddresses", "()Ljava/util/List;", "getHex", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getN", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getScriptPubKey", "()Lnet/safemoon/androidwallet/model/rpc2/bitcoin/ScriptPubKey;", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lnet/safemoon/androidwallet/model/rpc2/bitcoin/ScriptPubKey;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;)Lnet/safemoon/androidwallet/model/rpc2/bitcoin/Vout;", "equals", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@Keep
/* compiled from: BitcoinTxSpecificResponse.kt */
public final class Vout {
    @SerializedName("addresses")
    private final List<String> addresses;
    @SerializedName("hex")
    private final String hex;
    @SerializedName("isAddress")
    private final Boolean isAddress;
    @SerializedName("n")

    /* renamed from: n */
    private final Integer f42472n;
    @SerializedName("scriptPubKey")
    private final ScriptPubKey scriptPubKey;
    @SerializedName("value")
    private final String value;

    public Vout(ScriptPubKey scriptPubKey2, List<String> list, String str, Boolean bool, Integer num, String str2) {
        this.scriptPubKey = scriptPubKey2;
        this.addresses = list;
        this.hex = str;
        this.isAddress = bool;
        this.f42472n = num;
        this.value = str2;
    }

    public static /* synthetic */ Vout copy$default(Vout vout, ScriptPubKey scriptPubKey2, List<String> list, String str, Boolean bool, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            scriptPubKey2 = vout.scriptPubKey;
        }
        if ((i & 2) != 0) {
            list = vout.addresses;
        }
        List<String> list2 = list;
        if ((i & 4) != 0) {
            str = vout.hex;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            bool = vout.isAddress;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            num = vout.f42472n;
        }
        Integer num2 = num;
        if ((i & 32) != 0) {
            str2 = vout.value;
        }
        return vout.copy(scriptPubKey2, list2, str3, bool2, num2, str2);
    }

    public final ScriptPubKey component1() {
        return this.scriptPubKey;
    }

    public final List<String> component2() {
        return this.addresses;
    }

    public final String component3() {
        return this.hex;
    }

    public final Boolean component4() {
        return this.isAddress;
    }

    public final Integer component5() {
        return this.f42472n;
    }

    public final String component6() {
        return this.value;
    }

    public final Vout copy(ScriptPubKey scriptPubKey2, List<String> list, String str, Boolean bool, Integer num, String str2) {
        return new Vout(scriptPubKey2, list, str, bool, num, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vout)) {
            return false;
        }
        Vout vout = (Vout) obj;
        return vx2.m53586b(this.scriptPubKey, vout.scriptPubKey) && vx2.m53586b(this.addresses, vout.addresses) && vx2.m53586b(this.hex, vout.hex) && vx2.m53586b(this.isAddress, vout.isAddress) && vx2.m53586b(this.f42472n, vout.f42472n) && vx2.m53586b(this.value, vout.value);
    }

    public final List<String> getAddresses() {
        return this.addresses;
    }

    public final String getHex() {
        return this.hex;
    }

    public final Integer getN() {
        return this.f42472n;
    }

    public final ScriptPubKey getScriptPubKey() {
        return this.scriptPubKey;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        ScriptPubKey scriptPubKey2 = this.scriptPubKey;
        int i = 0;
        int hashCode = (scriptPubKey2 == null ? 0 : scriptPubKey2.hashCode()) * 31;
        List<String> list = this.addresses;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.hex;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isAddress;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f42472n;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.value;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode5 + i;
    }

    public final Boolean isAddress() {
        return this.isAddress;
    }

    public String toString() {
        ScriptPubKey scriptPubKey2 = this.scriptPubKey;
        List<String> list = this.addresses;
        String str = this.hex;
        Boolean bool = this.isAddress;
        Integer num = this.f42472n;
        String str2 = this.value;
        return "Vout(scriptPubKey=" + scriptPubKey2 + ", addresses=" + list + ", hex=" + str + ", isAddress=" + bool + ", n=" + num + ", value=" + str2 + ")";
    }
}
