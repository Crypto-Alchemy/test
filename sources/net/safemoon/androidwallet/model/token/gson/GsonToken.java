package net.safemoon.androidwallet.model.token.gson;

import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.token.abstraction.IToken;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0010HÆ\u0003J\t\u0010(\u001a\u00020\u0010HÆ\u0003J\t\u0010)\u001a\u00020\u0010HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010HÆ\u0001J\u0013\u00103\u001a\u00020\u000b2\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u00020\bHÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\n\u001a\u00020\u000b8\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\b8\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\r\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00038\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\t\u001a\u00020\b8\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00038\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0014\u0010\u0011\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0012\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0014\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0016\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0016\u0010\f\u001a\u00020\u00038\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001a¨\u00068"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/token/gson/GsonToken;", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "name", "", "symbol", "iconResName", "contractAddress", "chainId", "", "decimals", "allowSwap", "", "symbolWithType", "cmcId", "cmcSlug", "priceInUsdt", "", "nativeBalance", "percentChange1h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;ILjava/lang/String;DDD)V", "getAllowSwap", "()Z", "getChainId", "()I", "getCmcId", "getCmcSlug", "()Ljava/lang/String;", "getContractAddress", "getDecimals", "getIconResName", "getName", "getNativeBalance", "()D", "getPercentChange1h", "getPriceInUsdt", "getSymbol", "getSymbolWithType", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: GsonToken.kt */
public final class GsonToken implements IToken {
    @SerializedName("allowSwap")
    private final boolean allowSwap;
    @SerializedName("chainId")
    private final int chainId;
    @SerializedName("cmcId")
    private final int cmcId;
    @SerializedName("cmcSlug")
    private final String cmcSlug;
    @SerializedName("address")
    private final String contractAddress;
    @SerializedName("decimals")
    private final int decimals;
    @SerializedName("icon")
    private final String iconResName;
    @SerializedName("name")
    private final String name;
    private final double nativeBalance;
    private final double percentChange1h;
    private final double priceInUsdt;
    @SerializedName("symbol")
    private final String symbol;
    @SerializedName("symbolWithType")
    private final String symbolWithType;

    public GsonToken(String str, String str2, String str3, String str4, int i, int i2, boolean z, String str5, int i3, String str6, double d, double d2, double d3) {
        String str7 = str5;
        String str8 = str6;
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(str2, "symbol");
        vx2.m53591g(str3, "iconResName");
        vx2.m53591g(str4, "contractAddress");
        vx2.m53591g(str7, "symbolWithType");
        vx2.m53591g(str8, "cmcSlug");
        this.name = str;
        this.symbol = str2;
        this.iconResName = str3;
        this.contractAddress = str4;
        this.chainId = i;
        this.decimals = i2;
        this.allowSwap = z;
        this.symbolWithType = str7;
        this.cmcId = i3;
        this.cmcSlug = str8;
        this.priceInUsdt = d;
        this.nativeBalance = d2;
        this.percentChange1h = d3;
    }

    public static /* synthetic */ GsonToken copy$default(GsonToken gsonToken, String str, String str2, String str3, String str4, int i, int i2, boolean z, String str5, int i3, String str6, double d, double d2, double d3, int i4, Object obj) {
        GsonToken gsonToken2 = gsonToken;
        int i5 = i4;
        return gsonToken.copy((i5 & 1) != 0 ? gsonToken.getName() : str, (i5 & 2) != 0 ? gsonToken.getSymbol() : str2, (i5 & 4) != 0 ? gsonToken.getIconResName() : str3, (i5 & 8) != 0 ? gsonToken.getContractAddress() : str4, (i5 & 16) != 0 ? gsonToken.getChainId() : i, (i5 & 32) != 0 ? gsonToken.getDecimals() : i2, (i5 & 64) != 0 ? gsonToken.getAllowSwap() : z, (i5 & 128) != 0 ? gsonToken.getSymbolWithType() : str5, (i5 & 256) != 0 ? gsonToken2.cmcId : i3, (i5 & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? gsonToken2.cmcSlug : str6, (i5 & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) != 0 ? gsonToken.getPriceInUsdt() : d, (i5 & 2048) != 0 ? gsonToken.getNativeBalance() : d2, (i5 & 4096) != 0 ? gsonToken.getPercentChange1h() : d3);
    }

    public final String component1() {
        return getName();
    }

    public final String component10() {
        return this.cmcSlug;
    }

    public final double component11() {
        return getPriceInUsdt();
    }

    public final double component12() {
        return getNativeBalance();
    }

    public final double component13() {
        return getPercentChange1h();
    }

    public final String component2() {
        return getSymbol();
    }

    public final String component3() {
        return getIconResName();
    }

    public final String component4() {
        return getContractAddress();
    }

    public final int component5() {
        return getChainId();
    }

    public final int component6() {
        return getDecimals();
    }

    public final boolean component7() {
        return getAllowSwap();
    }

    public final String component8() {
        return getSymbolWithType();
    }

    public final int component9() {
        return this.cmcId;
    }

    public final GsonToken copy(String str, String str2, String str3, String str4, int i, int i2, boolean z, String str5, int i3, String str6, double d, double d2, double d3) {
        String str7 = str;
        vx2.m53591g(str7, PublicResolver.FUNC_NAME);
        vx2.m53591g(str2, "symbol");
        vx2.m53591g(str3, "iconResName");
        vx2.m53591g(str4, "contractAddress");
        vx2.m53591g(str5, "symbolWithType");
        vx2.m53591g(str6, "cmcSlug");
        return new GsonToken(str7, str2, str3, str4, i, i2, z, str5, i3, str6, d, d2, d3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GsonToken)) {
            return false;
        }
        GsonToken gsonToken = (GsonToken) obj;
        return vx2.m53586b(getName(), gsonToken.getName()) && vx2.m53586b(getSymbol(), gsonToken.getSymbol()) && vx2.m53586b(getIconResName(), gsonToken.getIconResName()) && vx2.m53586b(getContractAddress(), gsonToken.getContractAddress()) && getChainId() == gsonToken.getChainId() && getDecimals() == gsonToken.getDecimals() && getAllowSwap() == gsonToken.getAllowSwap() && vx2.m53586b(getSymbolWithType(), gsonToken.getSymbolWithType()) && this.cmcId == gsonToken.cmcId && vx2.m53586b(this.cmcSlug, gsonToken.cmcSlug) && Double.compare(getPriceInUsdt(), gsonToken.getPriceInUsdt()) == 0 && Double.compare(getNativeBalance(), gsonToken.getNativeBalance()) == 0 && Double.compare(getPercentChange1h(), gsonToken.getPercentChange1h()) == 0;
    }

    public boolean getAllowSwap() {
        return this.allowSwap;
    }

    public int getChainId() {
        return this.chainId;
    }

    public final int getCmcId() {
        return this.cmcId;
    }

    public final String getCmcSlug() {
        return this.cmcSlug;
    }

    public String getContractAddress() {
        return this.contractAddress;
    }

    public int getDecimals() {
        return this.decimals;
    }

    public String getIconResName() {
        return this.iconResName;
    }

    public String getName() {
        return this.name;
    }

    public double getNativeBalance() {
        return this.nativeBalance;
    }

    public double getPercentChange1h() {
        return this.percentChange1h;
    }

    public double getPriceInUsdt() {
        return this.priceInUsdt;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public String getSymbolWithType() {
        return this.symbolWithType;
    }

    public int hashCode() {
        int hashCode = ((((((((((getName().hashCode() * 31) + getSymbol().hashCode()) * 31) + getIconResName().hashCode()) * 31) + getContractAddress().hashCode()) * 31) + getChainId()) * 31) + getDecimals()) * 31;
        boolean allowSwap2 = getAllowSwap();
        if (allowSwap2) {
            allowSwap2 = true;
        }
        return ((((((((((((hashCode + (allowSwap2 ? 1 : 0)) * 31) + getSymbolWithType().hashCode()) * 31) + this.cmcId) * 31) + this.cmcSlug.hashCode()) * 31) + Double.doubleToLongBits(getPriceInUsdt())) * 31) + Double.doubleToLongBits(getNativeBalance())) * 31) + Double.doubleToLongBits(getPercentChange1h());
    }

    public String toString() {
        String name2 = getName();
        String symbol2 = getSymbol();
        String iconResName2 = getIconResName();
        String contractAddress2 = getContractAddress();
        int chainId2 = getChainId();
        int decimals2 = getDecimals();
        boolean allowSwap2 = getAllowSwap();
        String symbolWithType2 = getSymbolWithType();
        int i = this.cmcId;
        String str = this.cmcSlug;
        double priceInUsdt2 = getPriceInUsdt();
        double nativeBalance2 = getNativeBalance();
        double percentChange1h2 = getPercentChange1h();
        return "GsonToken(name=" + name2 + ", symbol=" + symbol2 + ", iconResName=" + iconResName2 + ", contractAddress=" + contractAddress2 + ", chainId=" + chainId2 + ", decimals=" + decimals2 + ", allowSwap=" + allowSwap2 + ", symbolWithType=" + symbolWithType2 + ", cmcId=" + i + ", cmcSlug=" + str + ", priceInUsdt=" + priceInUsdt2 + ", nativeBalance=" + nativeBalance2 + ", percentChange1h=" + percentChange1h2 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GsonToken(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, int r24, int r25, boolean r26, java.lang.String r27, int r28, java.lang.String r29, double r30, double r32, double r34, int r36, kotlin.jvm.internal.DefaultConstructorMarker r37) {
        /*
            r19 = this;
            r0 = r36
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r11 = r1
            goto L_0x000b
        L_0x0009:
            r11 = r28
        L_0x000b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0013
            java.lang.String r1 = ""
            r12 = r1
            goto L_0x0015
        L_0x0013:
            r12 = r29
        L_0x0015:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = 0
            if (r1 == 0) goto L_0x001d
            r13 = r2
            goto L_0x001f
        L_0x001d:
            r13 = r30
        L_0x001f:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0025
            r15 = r2
            goto L_0x0027
        L_0x0025:
            r15 = r32
        L_0x0027:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x002e
            r17 = r2
            goto L_0x0030
        L_0x002e:
            r17 = r34
        L_0x0030:
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.model.token.gson.GsonToken.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, boolean, java.lang.String, int, java.lang.String, double, double, double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
