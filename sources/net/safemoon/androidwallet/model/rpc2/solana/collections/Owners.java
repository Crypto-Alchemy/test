package net.safemoon.androidwallet.model.rpc2.solana.collections;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ2\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\b\u0010\u001c\u001a\u00020\u0003H\u0016R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u001d"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/collections/Owners;", "", "address", "", "verified", "", "share", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getShare", "()Ljava/lang/Integer;", "setShare", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getVerified", "setVerified", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lnet/safemoon/androidwallet/model/rpc2/solana/collections/Owners;", "equals", "", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SolanaNft.kt */
public final class Owners {
    @SerializedName("address")
    private String address;
    @SerializedName("share")
    private Integer share;
    @SerializedName("verified")
    private Integer verified;

    public Owners() {
        this((String) null, (Integer) null, (Integer) null, 7, (DefaultConstructorMarker) null);
    }

    public Owners(String str, Integer num, Integer num2) {
        this.address = str;
        this.verified = num;
        this.share = num2;
    }

    public static /* synthetic */ Owners copy$default(Owners owners, String str, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = owners.address;
        }
        if ((i & 2) != 0) {
            num = owners.verified;
        }
        if ((i & 4) != 0) {
            num2 = owners.share;
        }
        return owners.copy(str, num, num2);
    }

    public final String component1() {
        return this.address;
    }

    public final Integer component2() {
        return this.verified;
    }

    public final Integer component3() {
        return this.share;
    }

    public final Owners copy(String str, Integer num, Integer num2) {
        return new Owners(str, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Owners)) {
            return false;
        }
        Owners owners = (Owners) obj;
        return vx2.m53586b(this.address, owners.address) && vx2.m53586b(this.verified, owners.verified) && vx2.m53586b(this.share, owners.share);
    }

    public final String getAddress() {
        return this.address;
    }

    public final Integer getShare() {
        return this.share;
    }

    public final Integer getVerified() {
        return this.verified;
    }

    public int hashCode() {
        String str = this.address;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.verified;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.share;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode2 + i;
    }

    public final void setAddress(String str) {
        this.address = str;
    }

    public final void setShare(Integer num) {
        this.share = num;
    }

    public final void setVerified(Integer num) {
        this.verified = num;
    }

    public String toString() {
        String json = new Gson().toJson((Object) this);
        vx2.m53590f(json, "Gson().toJson(this)");
        return json;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Owners(String str, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }
}
