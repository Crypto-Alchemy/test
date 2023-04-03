package net.safemoon.androidwallet.model.token.abstraction;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0012\u0010\u0010\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0012\u0010\u0012\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0012\u0010\u001a\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0012\u0010\u001c\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\rR\u0012\u0010\u001e\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\r¨\u0006 "}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "Ljava/io/Serializable;", "allowSwap", "", "getAllowSwap", "()Z", "chainId", "", "getChainId", "()I", "contractAddress", "", "getContractAddress", "()Ljava/lang/String;", "decimals", "getDecimals", "iconResName", "getIconResName", "name", "getName", "nativeBalance", "", "getNativeBalance", "()D", "percentChange1h", "getPercentChange1h", "priceInUsdt", "getPriceInUsdt", "symbol", "getSymbol", "symbolWithType", "getSymbolWithType", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: IToken.kt */
public interface IToken extends Serializable {
    boolean getAllowSwap();

    int getChainId();

    String getContractAddress();

    int getDecimals();

    String getIconResName();

    String getName();

    double getNativeBalance();

    double getPercentChange1h();

    double getPriceInUsdt();

    String getSymbol();

    String getSymbolWithType();
}
