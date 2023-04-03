package com.walletconnect.web3.wallet.client;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u001a\u0010\u0007\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0019"}, mo44877d2 = {"com/walletconnect/web3/wallet/client/Wallet$Model$Cacao$Signature", "Lhg7;", "", "", "component1", "component2", "component3", "t", "s", "m", "Lcom/walletconnect/web3/wallet/client/Wallet$Model$Cacao$Signature;", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getT", "()Ljava/lang/String;", "getS", "getM", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
@Keep
/* compiled from: Wallet.kt */
public final class Wallet$Model$Cacao$Signature extends hg7 {

    /* renamed from: m */
    private final String f27837m;

    /* renamed from: s */
    private final String f27838s;

    /* renamed from: t */
    private final String f27839t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Wallet$Model$Cacao$Signature(String str, String str2, String str3) {
        super((DefaultConstructorMarker) null);
        vx2.m53591g(str, "t");
        vx2.m53591g(str2, "s");
        this.f27839t = str;
        this.f27838s = str2;
        this.f27837m = str3;
    }

    public static /* synthetic */ Wallet$Model$Cacao$Signature copy$default(Wallet$Model$Cacao$Signature wallet$Model$Cacao$Signature, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wallet$Model$Cacao$Signature.getT();
        }
        if ((i & 2) != 0) {
            str2 = wallet$Model$Cacao$Signature.getS();
        }
        if ((i & 4) != 0) {
            str3 = wallet$Model$Cacao$Signature.getM();
        }
        return wallet$Model$Cacao$Signature.copy(str, str2, str3);
    }

    public final String component1() {
        return getT();
    }

    public final String component2() {
        return getS();
    }

    public final String component3() {
        return getM();
    }

    public final Wallet$Model$Cacao$Signature copy(String str, String str2, String str3) {
        vx2.m53591g(str, "t");
        vx2.m53591g(str2, "s");
        return new Wallet$Model$Cacao$Signature(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wallet$Model$Cacao$Signature)) {
            return false;
        }
        Wallet$Model$Cacao$Signature wallet$Model$Cacao$Signature = (Wallet$Model$Cacao$Signature) obj;
        return vx2.m53586b(getT(), wallet$Model$Cacao$Signature.getT()) && vx2.m53586b(getS(), wallet$Model$Cacao$Signature.getS()) && vx2.m53586b(getM(), wallet$Model$Cacao$Signature.getM());
    }

    public String getM() {
        return this.f27837m;
    }

    public String getS() {
        return this.f27838s;
    }

    public String getT() {
        return this.f27839t;
    }

    public int hashCode() {
        return (((getT().hashCode() * 31) + getS().hashCode()) * 31) + (getM() == null ? 0 : getM().hashCode());
    }

    public String toString() {
        String t = getT();
        String s = getS();
        String m = getM();
        return "Signature(t=" + t + ", s=" + s + ", m=" + m + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Wallet$Model$Cacao$Signature(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
