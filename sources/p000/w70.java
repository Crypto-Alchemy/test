package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.abi.datatypes.Address;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0006\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010 \u001a\u00020\u001a\u0012\u0006\u0010#\u001a\u00020\u0007¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u0010\u0010\u000bR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\r\u0010\u0016R\"\u0010 \u001a\u00020\u001a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0017\u0010#\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b\u0018\u0010\"¨\u0006&"}, mo44877d2 = {"Lw70;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "address", "b", "c", "cmcId", "d", "cmcSlug", "h", "symbol", "e", "I", "()I", "decimal", "f", "chainId", "", "g", "D", "()D", "i", "(D)V", "nativeBalance", "Z", "()Z", "hasSwap", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIDZ)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: w70 */
/* compiled from: PreFetchData.kt */
public final class w70 {

    /* renamed from: a */
    public final String f45450a;

    /* renamed from: b */
    public final String f45451b;

    /* renamed from: c */
    public final String f45452c;

    /* renamed from: d */
    public final String f45453d;

    /* renamed from: e */
    public final int f45454e;

    /* renamed from: f */
    public final int f45455f;

    /* renamed from: g */
    public double f45456g;

    /* renamed from: h */
    public final boolean f45457h;

    public w70(String str, String str2, String str3, String str4, int i, int i2, double d, boolean z) {
        vx2.m53591g(str, Address.TYPE_NAME);
        vx2.m53591g(str2, "cmcId");
        vx2.m53591g(str3, "cmcSlug");
        vx2.m53591g(str4, "symbol");
        this.f45450a = str;
        this.f45451b = str2;
        this.f45452c = str3;
        this.f45453d = str4;
        this.f45454e = i;
        this.f45455f = i2;
        this.f45456g = d;
        this.f45457h = z;
    }

    /* renamed from: a */
    public final String mo66642a() {
        return this.f45450a;
    }

    /* renamed from: b */
    public final int mo66643b() {
        return this.f45455f;
    }

    /* renamed from: c */
    public final String mo66644c() {
        return this.f45451b;
    }

    /* renamed from: d */
    public final String mo66645d() {
        return this.f45452c;
    }

    /* renamed from: e */
    public final int mo66646e() {
        return this.f45454e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w70)) {
            return false;
        }
        w70 w70 = (w70) obj;
        return vx2.m53586b(this.f45450a, w70.f45450a) && vx2.m53586b(this.f45451b, w70.f45451b) && vx2.m53586b(this.f45452c, w70.f45452c) && vx2.m53586b(this.f45453d, w70.f45453d) && this.f45454e == w70.f45454e && this.f45455f == w70.f45455f && Double.compare(this.f45456g, w70.f45456g) == 0 && this.f45457h == w70.f45457h;
    }

    /* renamed from: f */
    public final boolean mo66648f() {
        return this.f45457h;
    }

    /* renamed from: g */
    public final double mo66649g() {
        return this.f45456g;
    }

    /* renamed from: h */
    public final String mo66650h() {
        return this.f45453d;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.f45450a.hashCode() * 31) + this.f45451b.hashCode()) * 31) + this.f45452c.hashCode()) * 31) + this.f45453d.hashCode()) * 31) + this.f45454e) * 31) + this.f45455f) * 31) + Double.doubleToLongBits(this.f45456g)) * 31;
        boolean z = this.f45457h;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    /* renamed from: i */
    public final void mo66652i(double d) {
        this.f45456g = d;
    }

    public String toString() {
        String str = this.f45450a;
        String str2 = this.f45451b;
        String str3 = this.f45452c;
        String str4 = this.f45453d;
        int i = this.f45454e;
        int i2 = this.f45455f;
        double d = this.f45456g;
        boolean z = this.f45457h;
        return "CMCToken(address=" + str + ", cmcId=" + str2 + ", cmcSlug=" + str3 + ", symbol=" + str4 + ", decimal=" + i + ", chainId=" + i2 + ", nativeBalance=" + d + ", hasSwap=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w70(String str, String str2, String str3, String str4, int i, int i2, double d, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i, i2, (i3 & 64) != 0 ? 0.0d : d, z);
    }
}
