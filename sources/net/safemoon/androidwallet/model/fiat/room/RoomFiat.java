package net.safemoon.androidwallet.model.fiat.room;

import kotlin.Metadata;
import net.safemoon.androidwallet.model.fiat.abstraction.IFiat;

@Metadata(mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\rJ0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0016X\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/fiat/room/RoomFiat;", "Lnet/safemoon/androidwallet/model/fiat/abstraction/IFiat;", "origin", "(Lnet/safemoon/androidwallet/model/fiat/abstraction/IFiat;)V", "symbol", "", "name", "rate", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getName", "()Ljava/lang/String;", "getRate", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSymbol", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lnet/safemoon/androidwallet/model/fiat/room/RoomFiat;", "equals", "", "other", "", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: RoomFiat.kt */
public final class RoomFiat implements IFiat {
    private final String name;
    private final Double rate;
    private final String symbol;

    public RoomFiat(String str, String str2, Double d) {
        vx2.m53591g(str, "symbol");
        this.symbol = str;
        this.name = str2;
        this.rate = d;
    }

    public static /* synthetic */ RoomFiat copy$default(RoomFiat roomFiat, String str, String str2, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = roomFiat.getSymbol();
        }
        if ((i & 2) != 0) {
            str2 = roomFiat.getName();
        }
        if ((i & 4) != 0) {
            d = roomFiat.getRate();
        }
        return roomFiat.copy(str, str2, d);
    }

    public final String component1() {
        return getSymbol();
    }

    public final String component2() {
        return getName();
    }

    public final Double component3() {
        return getRate();
    }

    public final RoomFiat copy(String str, String str2, Double d) {
        vx2.m53591g(str, "symbol");
        return new RoomFiat(str, str2, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomFiat)) {
            return false;
        }
        RoomFiat roomFiat = (RoomFiat) obj;
        return vx2.m53586b(getSymbol(), roomFiat.getSymbol()) && vx2.m53586b(getName(), roomFiat.getName()) && vx2.m53586b(getRate(), roomFiat.getRate());
    }

    public String getName() {
        return this.name;
    }

    public Double getRate() {
        return this.rate;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((getSymbol().hashCode() * 31) + (getName() == null ? 0 : getName().hashCode())) * 31;
        if (getRate() != null) {
            i = getRate().hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String symbol2 = getSymbol();
        String name2 = getName();
        Double rate2 = getRate();
        return "RoomFiat(symbol=" + symbol2 + ", name=" + name2 + ", rate=" + rate2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RoomFiat(IFiat iFiat) {
        this(iFiat.getSymbol(), iFiat.getName(), iFiat.getRate());
        vx2.m53591g(iFiat, "origin");
    }
}
