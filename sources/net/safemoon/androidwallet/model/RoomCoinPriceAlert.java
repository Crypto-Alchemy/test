package net.safemoon.androidwallet.model;

import com.google.gson.Gson;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u0016\u0010\b\u001a\u00020\u00058\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00058\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/RoomCoinPriceAlert;", "Lnet/safemoon/androidwallet/model/RoomCoin;", "cmcId", "", "symbol", "", "name", "slug", "cmcData", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCmcData", "()Ljava/lang/String;", "getCmcId", "()I", "getName", "getSlug", "getSymbol", "getCoinData", "Lnet/safemoon/androidwallet/model/Coin;", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: RoomCoinPriceAlert.kt */
public final class RoomCoinPriceAlert extends RoomCoin {
    private final String cmcData;
    private final int cmcId;
    private final String name;
    private final String slug;
    private final String symbol;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoomCoinPriceAlert(int i, String str, String str2, String str3, String str4) {
        super(i, str, str2, str3, str4);
        vx2.m53591g(str, "symbol");
        vx2.m53591g(str2, PublicResolver.FUNC_NAME);
        vx2.m53591g(str3, "slug");
        vx2.m53591g(str4, "cmcData");
        this.cmcId = i;
        this.symbol = str;
        this.name = str2;
        this.slug = str3;
        this.cmcData = str4;
    }

    public String getCmcData() {
        return this.cmcData;
    }

    public int getCmcId() {
        return this.cmcId;
    }

    public final Coin getCoinData() {
        try {
            return (Coin) new Gson().fromJson(getCmcData(), Coin.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public String getName() {
        return this.name;
    }

    public String getSlug() {
        return this.slug;
    }

    public String getSymbol() {
        return this.symbol;
    }
}
