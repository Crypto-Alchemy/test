package net.safemoon.androidwallet.model;

import java.io.Serializable;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tR\u0014\u0010\b\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/RoomCoin;", "Ljava/io/Serializable;", "cmcId", "", "symbol", "", "name", "slug", "cmcData", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCmcData", "()Ljava/lang/String;", "getCmcId", "()I", "getName", "getSlug", "getSymbol", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: RoomCoin.kt */
public class RoomCoin implements Serializable {
    private final String cmcData;
    private final int cmcId;
    private final String name;
    private final String slug;
    private final String symbol;

    public RoomCoin(int i, String str, String str2, String str3, String str4) {
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
