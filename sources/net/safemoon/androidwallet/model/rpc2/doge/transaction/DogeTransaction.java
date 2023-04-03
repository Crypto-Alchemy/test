package net.safemoon.androidwallet.model.rpc2.doge.transaction;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/doge/transaction/DogeTransaction;", "", "block", "", "hash", "", "price", "time", "value", "(JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getBlock", "()J", "getHash", "()Ljava/lang/String;", "getPrice", "getTime", "getValue", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@Keep
/* compiled from: DogeTransaction.kt */
public final class DogeTransaction {
    @SerializedName("block")
    private final long block;
    @SerializedName("hash")
    private final String hash;
    @SerializedName("price")
    private final String price;
    @SerializedName("time")
    private final long time;
    @SerializedName("value")
    private final String value;

    public DogeTransaction(long j, String str, String str2, long j2, String str3) {
        vx2.m53591g(str, "hash");
        vx2.m53591g(str2, "price");
        vx2.m53591g(str3, "value");
        this.block = j;
        this.hash = str;
        this.price = str2;
        this.time = j2;
        this.value = str3;
    }

    public static /* synthetic */ DogeTransaction copy$default(DogeTransaction dogeTransaction, long j, String str, String str2, long j2, String str3, int i, Object obj) {
        DogeTransaction dogeTransaction2 = dogeTransaction;
        return dogeTransaction.copy((i & 1) != 0 ? dogeTransaction2.block : j, (i & 2) != 0 ? dogeTransaction2.hash : str, (i & 4) != 0 ? dogeTransaction2.price : str2, (i & 8) != 0 ? dogeTransaction2.time : j2, (i & 16) != 0 ? dogeTransaction2.value : str3);
    }

    public final long component1() {
        return this.block;
    }

    public final String component2() {
        return this.hash;
    }

    public final String component3() {
        return this.price;
    }

    public final long component4() {
        return this.time;
    }

    public final String component5() {
        return this.value;
    }

    public final DogeTransaction copy(long j, String str, String str2, long j2, String str3) {
        vx2.m53591g(str, "hash");
        vx2.m53591g(str2, "price");
        String str4 = str3;
        vx2.m53591g(str4, "value");
        return new DogeTransaction(j, str, str2, j2, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DogeTransaction)) {
            return false;
        }
        DogeTransaction dogeTransaction = (DogeTransaction) obj;
        return this.block == dogeTransaction.block && vx2.m53586b(this.hash, dogeTransaction.hash) && vx2.m53586b(this.price, dogeTransaction.price) && this.time == dogeTransaction.time && vx2.m53586b(this.value, dogeTransaction.value);
    }

    public final long getBlock() {
        return this.block;
    }

    public final String getHash() {
        return this.hash;
    }

    public final String getPrice() {
        return this.price;
    }

    public final long getTime() {
        return this.time;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((((au0.m10781a(this.block) * 31) + this.hash.hashCode()) * 31) + this.price.hashCode()) * 31) + au0.m10781a(this.time)) * 31) + this.value.hashCode();
    }

    public String toString() {
        long j = this.block;
        String str = this.hash;
        String str2 = this.price;
        long j2 = this.time;
        String str3 = this.value;
        return "DogeTransaction(block=" + j + ", hash=" + str + ", price=" + str2 + ", time=" + j2 + ", value=" + str3 + ")";
    }
}
