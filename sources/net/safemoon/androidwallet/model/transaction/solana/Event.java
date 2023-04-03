package net.safemoon.androidwallet.model.transaction.solana;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006\""}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/transaction/solana/Event;", "", "amount", "", "decimals", "destination", "", "source", "symbol", "tokenAddress", "type", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()I", "getDecimals", "getDestination", "()Ljava/lang/String;", "getSource", "getSymbol", "getTokenAddress", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: Event.kt */
public final class Event {
    private final int amount;
    private final int decimals;
    private final String destination;
    private final String source;
    private final String symbol;
    private final String tokenAddress;
    private final String type;

    public Event(int i, int i2, String str, String str2, String str3, String str4, String str5) {
        vx2.m53591g(str, "destination");
        vx2.m53591g(str2, "source");
        vx2.m53591g(str3, "symbol");
        vx2.m53591g(str4, "tokenAddress");
        vx2.m53591g(str5, "type");
        this.amount = i;
        this.decimals = i2;
        this.destination = str;
        this.source = str2;
        this.symbol = str3;
        this.tokenAddress = str4;
        this.type = str5;
    }

    public static /* synthetic */ Event copy$default(Event event, int i, int i2, String str, String str2, String str3, String str4, String str5, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = event.amount;
        }
        if ((i3 & 2) != 0) {
            i2 = event.decimals;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            str = event.destination;
        }
        String str6 = str;
        if ((i3 & 8) != 0) {
            str2 = event.source;
        }
        String str7 = str2;
        if ((i3 & 16) != 0) {
            str3 = event.symbol;
        }
        String str8 = str3;
        if ((i3 & 32) != 0) {
            str4 = event.tokenAddress;
        }
        String str9 = str4;
        if ((i3 & 64) != 0) {
            str5 = event.type;
        }
        return event.copy(i, i4, str6, str7, str8, str9, str5);
    }

    public final int component1() {
        return this.amount;
    }

    public final int component2() {
        return this.decimals;
    }

    public final String component3() {
        return this.destination;
    }

    public final String component4() {
        return this.source;
    }

    public final String component5() {
        return this.symbol;
    }

    public final String component6() {
        return this.tokenAddress;
    }

    public final String component7() {
        return this.type;
    }

    public final Event copy(int i, int i2, String str, String str2, String str3, String str4, String str5) {
        vx2.m53591g(str, "destination");
        vx2.m53591g(str2, "source");
        vx2.m53591g(str3, "symbol");
        vx2.m53591g(str4, "tokenAddress");
        String str6 = str5;
        vx2.m53591g(str6, "type");
        return new Event(i, i2, str, str2, str3, str4, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        return this.amount == event.amount && this.decimals == event.decimals && vx2.m53586b(this.destination, event.destination) && vx2.m53586b(this.source, event.source) && vx2.m53586b(this.symbol, event.symbol) && vx2.m53586b(this.tokenAddress, event.tokenAddress) && vx2.m53586b(this.type, event.type);
    }

    public final int getAmount() {
        return this.amount;
    }

    public final int getDecimals() {
        return this.decimals;
    }

    public final String getDestination() {
        return this.destination;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((((this.amount * 31) + this.decimals) * 31) + this.destination.hashCode()) * 31) + this.source.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.tokenAddress.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        int i = this.amount;
        int i2 = this.decimals;
        String str = this.destination;
        String str2 = this.source;
        String str3 = this.symbol;
        String str4 = this.tokenAddress;
        String str5 = this.type;
        return "Event(amount=" + i + ", decimals=" + i2 + ", destination=" + str + ", source=" + str2 + ", symbol=" + str3 + ", tokenAddress=" + str4 + ", type=" + str5 + ")";
    }
}
