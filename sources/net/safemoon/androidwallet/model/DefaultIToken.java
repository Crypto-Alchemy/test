package net.safemoon.androidwallet.model;

import kotlin.Metadata;
import net.safemoon.androidwallet.model.token.abstraction.IToken;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0002\u0010\u0011R\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\n\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0014\u0010\u000f\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0010\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017¨\u0006!"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/DefaultIToken;", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "symbolWithType", "", "name", "symbol", "iconResName", "contractAddress", "chainId", "", "decimals", "allowSwap", "", "priceInUsdt", "", "nativeBalance", "percentChange1h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZDDD)V", "getAllowSwap", "()Z", "getChainId", "()I", "getContractAddress", "()Ljava/lang/String;", "getDecimals", "getIconResName", "getName", "getNativeBalance", "()D", "getPercentChange1h", "getPriceInUsdt", "getSymbol", "getSymbolWithType", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: DefaultIToken.kt */
public final class DefaultIToken implements IToken {
    private final boolean allowSwap;
    private final int chainId;
    private final String contractAddress;
    private final int decimals;
    private final String iconResName;
    private final String name;
    private final double nativeBalance;
    private final double percentChange1h;
    private final double priceInUsdt;
    private final String symbol;
    private final String symbolWithType;

    public DefaultIToken(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, double d, double d2, double d3) {
        vx2.m53591g(str, "symbolWithType");
        vx2.m53591g(str2, PublicResolver.FUNC_NAME);
        vx2.m53591g(str3, "symbol");
        vx2.m53591g(str4, "iconResName");
        vx2.m53591g(str5, "contractAddress");
        this.symbolWithType = str;
        this.name = str2;
        this.symbol = str3;
        this.iconResName = str4;
        this.contractAddress = str5;
        this.chainId = i;
        this.decimals = i2;
        this.allowSwap = z;
        this.priceInUsdt = d;
        this.nativeBalance = d2;
        this.percentChange1h = d3;
    }

    public boolean getAllowSwap() {
        return this.allowSwap;
    }

    public int getChainId() {
        return this.chainId;
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

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DefaultIToken(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, int r24, int r25, boolean r26, double r27, double r29, double r31, int r33, kotlin.jvm.internal.DefaultConstructorMarker r34) {
        /*
            r18 = this;
            r0 = r33
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r4 = r2
            goto L_0x000c
        L_0x000a:
            r4 = r19
        L_0x000c:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0012
            r5 = r2
            goto L_0x0014
        L_0x0012:
            r5 = r20
        L_0x0014:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x001a
            r7 = r2
            goto L_0x001c
        L_0x001a:
            r7 = r22
        L_0x001c:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0022
            r8 = r2
            goto L_0x0024
        L_0x0022:
            r8 = r23
        L_0x0024:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x002b
            r10 = r2
            goto L_0x002d
        L_0x002b:
            r10 = r25
        L_0x002d:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0033
            r11 = r2
            goto L_0x0035
        L_0x0033:
            r11 = r26
        L_0x0035:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r2 = 0
            if (r1 == 0) goto L_0x003d
            r12 = r2
            goto L_0x003f
        L_0x003d:
            r12 = r27
        L_0x003f:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0045
            r14 = r2
            goto L_0x0047
        L_0x0045:
            r14 = r29
        L_0x0047:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x004e
            r16 = r2
            goto L_0x0050
        L_0x004e:
            r16 = r31
        L_0x0050:
            r3 = r18
            r6 = r21
            r9 = r24
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.model.DefaultIToken.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, boolean, double, double, double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
