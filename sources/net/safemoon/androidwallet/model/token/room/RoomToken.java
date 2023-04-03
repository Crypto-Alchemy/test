package net.safemoon.androidwallet.model.token.room;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.model.token.abstraction.IToken;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b%\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003Bg\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0010HÆ\u0003J\t\u0010)\u001a\u00020\u0010HÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J\t\u00101\u001a\u00020\u000eHÆ\u0003J\t\u00102\u001a\u00020\u0010HÆ\u0003J\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u000bHÆ\u0001J\u0013\u00104\u001a\u00020\u000e2\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u00020\u000bHÖ\u0001J\t\u00108\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\r\u001a\u00020\u000e8\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00058\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\f\u001a\u00020\u000b8\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00058\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\u00058\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0016\u0010\u000f\u001a\u00020\u00108\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\"R\u0016\u0010\u0012\u001a\u00020\u00108\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0016\u0010\u0011\u001a\u00020\u00108\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0016\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001a¨\u00069"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/token/room/RoomToken;", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "origin", "(Lnet/safemoon/androidwallet/model/token/abstraction/IToken;)V", "symbolWithType", "", "symbol", "name", "iconResName", "contractAddress", "chainId", "", "decimals", "allowSwap", "", "nativeBalance", "", "priceInUsdt", "percentChange1h", "order", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZDDDI)V", "getAllowSwap", "()Z", "getChainId", "()I", "getContractAddress", "()Ljava/lang/String;", "getDecimals", "getIconResName", "getName", "getNativeBalance", "()D", "getOrder", "setOrder", "(I)V", "getPercentChange1h", "getPriceInUsdt", "getSymbol", "getSymbolWithType", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: RoomToken.kt */
public final class RoomToken implements IToken {
    private final boolean allowSwap;
    private final int chainId;
    private final String contractAddress;
    private final int decimals;
    private final String iconResName;
    private final String name;
    private final double nativeBalance;
    private int order;
    private final double percentChange1h;
    private final double priceInUsdt;
    private final String symbol;
    private final String symbolWithType;

    public RoomToken(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, double d, double d2, double d3, int i3) {
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
        this.order = i3;
    }

    public static /* synthetic */ RoomToken copy$default(RoomToken roomToken, String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, double d, double d2, double d3, int i3, int i4, Object obj) {
        int i5;
        int i6 = i4;
        String symbolWithType2 = (i6 & 1) != 0 ? roomToken.getSymbolWithType() : str;
        String symbol2 = (i6 & 2) != 0 ? roomToken.getSymbol() : str2;
        String name2 = (i6 & 4) != 0 ? roomToken.getName() : str3;
        String iconResName2 = (i6 & 8) != 0 ? roomToken.getIconResName() : str4;
        String contractAddress2 = (i6 & 16) != 0 ? roomToken.getContractAddress() : str5;
        int chainId2 = (i6 & 32) != 0 ? roomToken.getChainId() : i;
        int decimals2 = (i6 & 64) != 0 ? roomToken.getDecimals() : i2;
        boolean allowSwap2 = (i6 & 128) != 0 ? roomToken.getAllowSwap() : z;
        double nativeBalance2 = (i6 & 256) != 0 ? roomToken.getNativeBalance() : d;
        double priceInUsdt2 = (i6 & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? roomToken.getPriceInUsdt() : d2;
        double percentChange1h2 = (i6 & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) != 0 ? roomToken.getPercentChange1h() : d3;
        if ((i6 & 2048) != 0) {
            i5 = roomToken.order;
        } else {
            RoomToken roomToken2 = roomToken;
            i5 = i3;
        }
        return roomToken.copy(symbolWithType2, symbol2, name2, iconResName2, contractAddress2, chainId2, decimals2, allowSwap2, nativeBalance2, priceInUsdt2, percentChange1h2, i5);
    }

    public final String component1() {
        return getSymbolWithType();
    }

    public final double component10() {
        return getPriceInUsdt();
    }

    public final double component11() {
        return getPercentChange1h();
    }

    public final int component12() {
        return this.order;
    }

    public final String component2() {
        return getSymbol();
    }

    public final String component3() {
        return getName();
    }

    public final String component4() {
        return getIconResName();
    }

    public final String component5() {
        return getContractAddress();
    }

    public final int component6() {
        return getChainId();
    }

    public final int component7() {
        return getDecimals();
    }

    public final boolean component8() {
        return getAllowSwap();
    }

    public final double component9() {
        return getNativeBalance();
    }

    public final RoomToken copy(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, double d, double d2, double d3, int i3) {
        String str6 = str;
        vx2.m53591g(str6, "symbolWithType");
        String str7 = str2;
        vx2.m53591g(str7, "symbol");
        String str8 = str3;
        vx2.m53591g(str8, PublicResolver.FUNC_NAME);
        String str9 = str4;
        vx2.m53591g(str9, "iconResName");
        String str10 = str5;
        vx2.m53591g(str10, "contractAddress");
        return new RoomToken(str6, str7, str8, str9, str10, i, i2, z, d, d2, d3, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomToken)) {
            return false;
        }
        RoomToken roomToken = (RoomToken) obj;
        return vx2.m53586b(getSymbolWithType(), roomToken.getSymbolWithType()) && vx2.m53586b(getSymbol(), roomToken.getSymbol()) && vx2.m53586b(getName(), roomToken.getName()) && vx2.m53586b(getIconResName(), roomToken.getIconResName()) && vx2.m53586b(getContractAddress(), roomToken.getContractAddress()) && getChainId() == roomToken.getChainId() && getDecimals() == roomToken.getDecimals() && getAllowSwap() == roomToken.getAllowSwap() && Double.compare(getNativeBalance(), roomToken.getNativeBalance()) == 0 && Double.compare(getPriceInUsdt(), roomToken.getPriceInUsdt()) == 0 && Double.compare(getPercentChange1h(), roomToken.getPercentChange1h()) == 0 && this.order == roomToken.order;
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

    public final int getOrder() {
        return this.order;
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
        int hashCode = ((((((((((((getSymbolWithType().hashCode() * 31) + getSymbol().hashCode()) * 31) + getName().hashCode()) * 31) + getIconResName().hashCode()) * 31) + getContractAddress().hashCode()) * 31) + getChainId()) * 31) + getDecimals()) * 31;
        boolean allowSwap2 = getAllowSwap();
        if (allowSwap2) {
            allowSwap2 = true;
        }
        return ((((((((hashCode + (allowSwap2 ? 1 : 0)) * 31) + Double.doubleToLongBits(getNativeBalance())) * 31) + Double.doubleToLongBits(getPriceInUsdt())) * 31) + Double.doubleToLongBits(getPercentChange1h())) * 31) + this.order;
    }

    public final void setOrder(int i) {
        this.order = i;
    }

    public String toString() {
        String symbolWithType2 = getSymbolWithType();
        String symbol2 = getSymbol();
        String name2 = getName();
        String iconResName2 = getIconResName();
        String contractAddress2 = getContractAddress();
        int chainId2 = getChainId();
        int decimals2 = getDecimals();
        boolean allowSwap2 = getAllowSwap();
        double nativeBalance2 = getNativeBalance();
        double priceInUsdt2 = getPriceInUsdt();
        double percentChange1h2 = getPercentChange1h();
        int i = this.order;
        return "RoomToken(symbolWithType=" + symbolWithType2 + ", symbol=" + symbol2 + ", name=" + name2 + ", iconResName=" + iconResName2 + ", contractAddress=" + contractAddress2 + ", chainId=" + chainId2 + ", decimals=" + decimals2 + ", allowSwap=" + allowSwap2 + ", nativeBalance=" + nativeBalance2 + ", priceInUsdt=" + priceInUsdt2 + ", percentChange1h=" + percentChange1h2 + ", order=" + i + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoomToken(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, double d, double d2, double d3, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, i, i2, z, d, d2, d3, (i4 & 2048) != 0 ? 0 : i3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RoomToken(IToken iToken) {
        this(iToken.getSymbolWithType(), iToken.getSymbol(), iToken.getName(), iToken.getIconResName(), iToken.getContractAddress(), iToken.getChainId(), iToken.getDecimals(), iToken.getAllowSwap(), iToken.getNativeBalance(), iToken.getPriceInUsdt(), iToken.getPercentChange1h(), 0);
        vx2.m53591g(iToken, "origin");
    }
}
