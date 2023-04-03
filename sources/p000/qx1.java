package p000;

import kotlin.Metadata;
import net.safemoon.androidwallet.model.Coin;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, mo44877d2 = {"Lqx1;", "", "Lnet/safemoon/androidwallet/model/Coin;", "coin", "", "isSelected", "a", "", "toString", "", "hashCode", "other", "equals", "Lnet/safemoon/androidwallet/model/Coin;", "c", "()Lnet/safemoon/androidwallet/model/Coin;", "b", "Z", "d", "()Z", "setSelected", "(Z)V", "<init>", "(Lnet/safemoon/androidwallet/model/Coin;Z)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: qx1 */
/* compiled from: CMCListViewModel.kt */
public final class qx1 {

    /* renamed from: a */
    public final Coin f44259a;

    /* renamed from: b */
    public boolean f44260b;

    public qx1(Coin coin, boolean z) {
        vx2.m53591g(coin, "coin");
        this.f44259a = coin;
        this.f44260b = z;
    }

    /* renamed from: b */
    public static /* synthetic */ qx1 m71381b(qx1 qx1, Coin coin, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            coin = qx1.f44259a;
        }
        if ((i & 2) != 0) {
            z = qx1.f44260b;
        }
        return qx1.mo65537a(coin, z);
    }

    /* renamed from: a */
    public final qx1 mo65537a(Coin coin, boolean z) {
        vx2.m53591g(coin, "coin");
        return new qx1(coin, z);
    }

    /* renamed from: c */
    public final Coin mo65538c() {
        return this.f44259a;
    }

    /* renamed from: d */
    public final boolean mo65539d() {
        return this.f44260b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx1)) {
            return false;
        }
        qx1 qx1 = (qx1) obj;
        return vx2.m53586b(this.f44259a, qx1.f44259a) && this.f44260b == qx1.f44260b;
    }

    public int hashCode() {
        int hashCode = this.f44259a.hashCode() * 31;
        boolean z = this.f44260b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        Coin coin = this.f44259a;
        boolean z = this.f44260b;
        return "ExtendCoin(coin=" + coin + ", isSelected=" + z + ")";
    }
}
