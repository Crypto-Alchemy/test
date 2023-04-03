package net.safemoon.androidwallet.model.rpc2.solana.collections;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\b\u0010#\u001a\u00020\u0003H\u0016R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011¨\u0006$"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/collections/SolanaNft;", "", "mint", "", "standard", "name", "symbol", "metaplex", "Lnet/safemoon/androidwallet/model/rpc2/solana/collections/Metaplex;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnet/safemoon/androidwallet/model/rpc2/solana/collections/Metaplex;)V", "getMetaplex", "()Lnet/safemoon/androidwallet/model/rpc2/solana/collections/Metaplex;", "setMetaplex", "(Lnet/safemoon/androidwallet/model/rpc2/solana/collections/Metaplex;)V", "getMint", "()Ljava/lang/String;", "setMint", "(Ljava/lang/String;)V", "getName", "setName", "getStandard", "setStandard", "getSymbol", "setSymbol", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SolanaNft.kt */
public final class SolanaNft {
    @SerializedName("metaplex")
    private Metaplex metaplex;
    @SerializedName("mint")
    private String mint;
    @SerializedName("name")
    private String name;
    @SerializedName("standard")
    private String standard;
    @SerializedName("symbol")
    private String symbol;

    public SolanaNft() {
        this((String) null, (String) null, (String) null, (String) null, (Metaplex) null, 31, (DefaultConstructorMarker) null);
    }

    public SolanaNft(String str, String str2, String str3, String str4, Metaplex metaplex2) {
        this.mint = str;
        this.standard = str2;
        this.name = str3;
        this.symbol = str4;
        this.metaplex = metaplex2;
    }

    public static /* synthetic */ SolanaNft copy$default(SolanaNft solanaNft, String str, String str2, String str3, String str4, Metaplex metaplex2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = solanaNft.mint;
        }
        if ((i & 2) != 0) {
            str2 = solanaNft.standard;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = solanaNft.name;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = solanaNft.symbol;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            metaplex2 = solanaNft.metaplex;
        }
        return solanaNft.copy(str, str5, str6, str7, metaplex2);
    }

    public final String component1() {
        return this.mint;
    }

    public final String component2() {
        return this.standard;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.symbol;
    }

    public final Metaplex component5() {
        return this.metaplex;
    }

    public final SolanaNft copy(String str, String str2, String str3, String str4, Metaplex metaplex2) {
        return new SolanaNft(str, str2, str3, str4, metaplex2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SolanaNft)) {
            return false;
        }
        SolanaNft solanaNft = (SolanaNft) obj;
        return vx2.m53586b(this.mint, solanaNft.mint) && vx2.m53586b(this.standard, solanaNft.standard) && vx2.m53586b(this.name, solanaNft.name) && vx2.m53586b(this.symbol, solanaNft.symbol) && vx2.m53586b(this.metaplex, solanaNft.metaplex);
    }

    public final Metaplex getMetaplex() {
        return this.metaplex;
    }

    public final String getMint() {
        return this.mint;
    }

    public final String getName() {
        return this.name;
    }

    public final String getStandard() {
        return this.standard;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.mint;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.standard;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.symbol;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Metaplex metaplex2 = this.metaplex;
        if (metaplex2 != null) {
            i = metaplex2.hashCode();
        }
        return hashCode4 + i;
    }

    public final void setMetaplex(Metaplex metaplex2) {
        this.metaplex = metaplex2;
    }

    public final void setMint(String str) {
        this.mint = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setStandard(String str) {
        this.standard = str;
    }

    public final void setSymbol(String str) {
        this.symbol = str;
    }

    public String toString() {
        String json = new Gson().toJson((Object) this);
        vx2.m53590f(json, "Gson().toJson(this)");
        return json;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SolanaNft(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, net.safemoon.androidwallet.model.rpc2.solana.collections.Metaplex r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r15 = this;
            r0 = r21 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0009
        L_0x0007:
            r0 = r16
        L_0x0009:
            r2 = r21 & 2
            if (r2 == 0) goto L_0x000f
            r2 = r1
            goto L_0x0011
        L_0x000f:
            r2 = r17
        L_0x0011:
            r3 = r21 & 4
            if (r3 == 0) goto L_0x0017
            r3 = r1
            goto L_0x0019
        L_0x0017:
            r3 = r18
        L_0x0019:
            r4 = r21 & 8
            if (r4 == 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r1 = r19
        L_0x0020:
            r4 = r21 & 16
            if (r4 == 0) goto L_0x0035
            net.safemoon.androidwallet.model.rpc2.solana.collections.Metaplex r4 = new net.safemoon.androidwallet.model.rpc2.solana.collections.Metaplex
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 127(0x7f, float:1.78E-43)
            r14 = 0
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0037
        L_0x0035:
            r4 = r20
        L_0x0037:
            r16 = r15
            r17 = r0
            r18 = r2
            r19 = r3
            r20 = r1
            r21 = r4
            r16.<init>(r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNft.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, net.safemoon.androidwallet.model.rpc2.solana.collections.Metaplex, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
