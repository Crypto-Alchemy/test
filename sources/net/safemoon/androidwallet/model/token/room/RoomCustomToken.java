package net.safemoon.androidwallet.model.token.room;

import kotlin.Metadata;
import net.safemoon.androidwallet.model.token.abstraction.IToken;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003B]\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0002\u0010\u0013R\u0016\u0010\r\u001a\u00020\u000e8\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\u000b8\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u00020\u00058\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u00020\u000b8\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00058\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00058\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0016\u0010\u000f\u001a\u00020\u00108\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0012\u001a\u00020\u00108\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0016\u0010\u0011\u001a\u00020\u00108\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0016\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019¨\u0006#"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/token/room/RoomCustomToken;", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "origin", "(Lnet/safemoon/androidwallet/model/token/abstraction/IToken;)V", "symbolWithType", "", "symbol", "name", "iconResName", "contractAddress", "chainId", "", "decimals", "allowSwap", "", "nativeBalance", "", "priceInUsdt", "percentChange1h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZDDD)V", "getAllowSwap", "()Z", "getChainId", "()I", "getContractAddress", "()Ljava/lang/String;", "getDecimals", "getIconResName", "getName", "getNativeBalance", "()D", "getPercentChange1h", "getPriceInUsdt", "getSymbol", "getSymbolWithType", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: RoomCustomToken.kt */
public final class RoomCustomToken implements IToken {
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

    public RoomCustomToken(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, double d, double d2, double d3) {
        vx2.m53591g(str, "symbolWithType");
        vx2.m53591g(str2, "symbol");
        vx2.m53591g(str3, PublicResolver.FUNC_NAME);
        vx2.m53591g(str4, "iconResName");
        vx2.m53591g(str5, "contractAddress");
        this.symbolWithType = str;
        this.symbol = str2;
        this.name = str3;
        this.iconResName = str4;
        this.contractAddress = str5;
        this.chainId = i;
        this.decimals = i2;
        this.allowSwap = z;
        this.nativeBalance = d;
        this.priceInUsdt = d2;
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

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RoomCustomToken(IToken iToken) {
        this(iToken.getSymbolWithType(), iToken.getSymbol(), iToken.getName(), iToken.getIconResName(), iToken.getContractAddress(), iToken.getChainId(), iToken.getDecimals(), iToken.getAllowSwap(), iToken.getNativeBalance(), iToken.getPriceInUsdt(), iToken.getPercentChange1h());
        vx2.m53591g(iToken, "origin");
    }
}
