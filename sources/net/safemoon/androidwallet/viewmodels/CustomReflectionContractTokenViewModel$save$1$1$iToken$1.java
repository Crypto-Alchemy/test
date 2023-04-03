package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.token.abstraction.IToken;

@Metadata(mo44876d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u0015XD¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0015XD¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u0015XD¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\rR\u0014\u0010\u001e\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\r¨\u0006 "}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/CustomReflectionContractTokenViewModel$save$1$1$iToken$1", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "allowSwap", "", "getAllowSwap", "()Z", "chainId", "", "getChainId", "()I", "contractAddress", "", "getContractAddress", "()Ljava/lang/String;", "decimals", "getDecimals", "iconResName", "getIconResName", "name", "getName", "nativeBalance", "", "getNativeBalance", "()D", "percentChange1h", "getPercentChange1h", "priceInUsdt", "getPriceInUsdt", "symbol", "getSymbol", "symbolWithType", "getSymbolWithType", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: CustomReflectionContractTokenViewModel.kt */
public final class CustomReflectionContractTokenViewModel$save$1$1$iToken$1 implements IToken {
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

    public CustomReflectionContractTokenViewModel$save$1$1$iToken$1(CustomReflectionContractTokenViewModel customReflectionContractTokenViewModel, String str, String str2, String str3, String str4, String str5) {
        Integer num;
        TokenType t = customReflectionContractTokenViewModel.mo61190t();
        if (t != null) {
            num = Integer.valueOf(t.getChainId());
        } else {
            num = null;
        }
        this.symbolWithType = "CUSTOM_" + num + "_" + str;
        this.name = str2;
        this.symbol = str3;
        vx2.m53590f(str4, "iconResName");
        this.iconResName = str4;
        this.contractAddress = str;
        TokenType t2 = customReflectionContractTokenViewModel.mo61190t();
        vx2.m53588d(t2);
        this.chainId = t2.getChainId();
        this.decimals = Integer.parseInt(str5);
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
}
