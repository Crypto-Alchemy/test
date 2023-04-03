package net.safemoon.androidwallet.model.rpc2.doge.details;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/doge/details/Spent;", "", "hash", "", "pos", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getHash", "()Ljava/lang/String;", "getPos", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lnet/safemoon/androidwallet/model/rpc2/doge/details/Spent;", "equals", "", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@Keep
/* compiled from: Spent.kt */
public final class Spent {
    @SerializedName("hash")
    private final String hash;
    @SerializedName("pos")
    private final Integer pos;

    public Spent(String str, Integer num) {
        this.hash = str;
        this.pos = num;
    }

    public static /* synthetic */ Spent copy$default(Spent spent, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spent.hash;
        }
        if ((i & 2) != 0) {
            num = spent.pos;
        }
        return spent.copy(str, num);
    }

    public final String component1() {
        return this.hash;
    }

    public final Integer component2() {
        return this.pos;
    }

    public final Spent copy(String str, Integer num) {
        return new Spent(str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Spent)) {
            return false;
        }
        Spent spent = (Spent) obj;
        return vx2.m53586b(this.hash, spent.hash) && vx2.m53586b(this.pos, spent.pos);
    }

    public final String getHash() {
        return this.hash;
    }

    public final Integer getPos() {
        return this.pos;
    }

    public int hashCode() {
        String str = this.hash;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.pos;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.hash;
        Integer num = this.pos;
        return "Spent(hash=" + str + ", pos=" + num + ")";
    }
}
