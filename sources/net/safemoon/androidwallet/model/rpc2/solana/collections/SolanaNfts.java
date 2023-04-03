package net.safemoon.androidwallet.model.rpc2.solana.collections;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\b\u0010\u0014\u001a\u00020\u0003H\u0016R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/collections/SolanaNfts;", "", "associatedTokenAddress", "", "mint", "(Ljava/lang/String;Ljava/lang/String;)V", "getAssociatedTokenAddress", "()Ljava/lang/String;", "setAssociatedTokenAddress", "(Ljava/lang/String;)V", "getMint", "setMint", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SolanaNfts.kt */
public final class SolanaNfts {
    @SerializedName("associatedTokenAddress")
    private String associatedTokenAddress;
    @SerializedName("mint")
    private String mint;

    public SolanaNfts() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public SolanaNfts(String str, String str2) {
        this.associatedTokenAddress = str;
        this.mint = str2;
    }

    public static /* synthetic */ SolanaNfts copy$default(SolanaNfts solanaNfts, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = solanaNfts.associatedTokenAddress;
        }
        if ((i & 2) != 0) {
            str2 = solanaNfts.mint;
        }
        return solanaNfts.copy(str, str2);
    }

    public final String component1() {
        return this.associatedTokenAddress;
    }

    public final String component2() {
        return this.mint;
    }

    public final SolanaNfts copy(String str, String str2) {
        return new SolanaNfts(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SolanaNfts)) {
            return false;
        }
        SolanaNfts solanaNfts = (SolanaNfts) obj;
        return vx2.m53586b(this.associatedTokenAddress, solanaNfts.associatedTokenAddress) && vx2.m53586b(this.mint, solanaNfts.mint);
    }

    public final String getAssociatedTokenAddress() {
        return this.associatedTokenAddress;
    }

    public final String getMint() {
        return this.mint;
    }

    public int hashCode() {
        String str = this.associatedTokenAddress;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mint;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final void setAssociatedTokenAddress(String str) {
        this.associatedTokenAddress = str;
    }

    public final void setMint(String str) {
        this.mint = str;
    }

    public String toString() {
        String json = new Gson().toJson((Object) this);
        vx2.m53590f(json, "Gson().toJson(this)");
        return json;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SolanaNfts(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
