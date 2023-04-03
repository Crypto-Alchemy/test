package p000;

import kotlin.Metadata;
import org.web3j.abi.datatypes.Address;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b&\b\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0007\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010'\u001a\u00020\u0004\u0012\u0006\u0010*\u001a\u00020\u0007¢\u0006\u0004\b+\u0010,J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0018\u0010\fR\"\u0010\u001f\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\n\u001a\u0004\b\t\u0010\f\"\u0004\b \u0010!R\"\u0010%\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011\"\u0004\b#\u0010$R\"\u0010'\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011\"\u0004\b&\u0010$R\"\u0010*\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b(\u0010\u001c\"\u0004\b)\u0010\u001e¨\u0006-"}, mo44877d2 = {"Lvc;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "symbolWithType", "b", "I", "e", "()I", "iconResId", "c", "d", "iconFile", "f", "name", "g", "symbol", "Z", "i", "()Z", "j", "(Z)V", "isAdded", "setAddress", "(Ljava/lang/String;)V", "address", "setChainId", "(I)V", "chainId", "setDecimals", "decimals", "getAllowSwap", "setAllowSwap", "allowSwap", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IIZ)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: vc */
/* compiled from: AddNewTokenItemDisplayModel.kt */
public final class C9449vc {

    /* renamed from: a */
    public final String f45259a;

    /* renamed from: b */
    public final int f45260b;

    /* renamed from: c */
    public final String f45261c;

    /* renamed from: d */
    public final String f45262d;

    /* renamed from: e */
    public final String f45263e;

    /* renamed from: f */
    public boolean f45264f;

    /* renamed from: g */
    public String f45265g;

    /* renamed from: h */
    public int f45266h;

    /* renamed from: i */
    public int f45267i;

    /* renamed from: j */
    public boolean f45268j;

    public C9449vc(String str, int i, String str2, String str3, String str4, boolean z, String str5, int i2, int i3, boolean z2) {
        vx2.m53591g(str, "symbolWithType");
        vx2.m53591g(str2, "iconFile");
        vx2.m53591g(str3, PublicResolver.FUNC_NAME);
        vx2.m53591g(str4, "symbol");
        vx2.m53591g(str5, Address.TYPE_NAME);
        this.f45259a = str;
        this.f45260b = i;
        this.f45261c = str2;
        this.f45262d = str3;
        this.f45263e = str4;
        this.f45264f = z;
        this.f45265g = str5;
        this.f45266h = i2;
        this.f45267i = i3;
        this.f45268j = z2;
    }

    /* renamed from: a */
    public final String mo66468a() {
        return this.f45265g;
    }

    /* renamed from: b */
    public final int mo66469b() {
        return this.f45266h;
    }

    /* renamed from: c */
    public final int mo66470c() {
        return this.f45267i;
    }

    /* renamed from: d */
    public final String mo66471d() {
        return this.f45261c;
    }

    /* renamed from: e */
    public final int mo66472e() {
        return this.f45260b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9449vc)) {
            return false;
        }
        C9449vc vcVar = (C9449vc) obj;
        return vx2.m53586b(this.f45259a, vcVar.f45259a) && this.f45260b == vcVar.f45260b && vx2.m53586b(this.f45261c, vcVar.f45261c) && vx2.m53586b(this.f45262d, vcVar.f45262d) && vx2.m53586b(this.f45263e, vcVar.f45263e) && this.f45264f == vcVar.f45264f && vx2.m53586b(this.f45265g, vcVar.f45265g) && this.f45266h == vcVar.f45266h && this.f45267i == vcVar.f45267i && this.f45268j == vcVar.f45268j;
    }

    /* renamed from: f */
    public final String mo66474f() {
        return this.f45262d;
    }

    /* renamed from: g */
    public final String mo66475g() {
        return this.f45263e;
    }

    /* renamed from: h */
    public final String mo66476h() {
        return this.f45259a;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f45259a.hashCode() * 31) + this.f45260b) * 31) + this.f45261c.hashCode()) * 31) + this.f45262d.hashCode()) * 31) + this.f45263e.hashCode()) * 31;
        boolean z = this.f45264f;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode2 = (((((((hashCode + (z ? 1 : 0)) * 31) + this.f45265g.hashCode()) * 31) + this.f45266h) * 31) + this.f45267i) * 31;
        boolean z3 = this.f45268j;
        if (!z3) {
            z2 = z3;
        }
        return hashCode2 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo66478i() {
        return this.f45264f;
    }

    /* renamed from: j */
    public final void mo66479j(boolean z) {
        this.f45264f = z;
    }

    public String toString() {
        String str = this.f45259a;
        int i = this.f45260b;
        String str2 = this.f45261c;
        String str3 = this.f45262d;
        String str4 = this.f45263e;
        boolean z = this.f45264f;
        String str5 = this.f45265g;
        int i2 = this.f45266h;
        int i3 = this.f45267i;
        boolean z2 = this.f45268j;
        return "AddNewTokenItemDisplayModel(symbolWithType=" + str + ", iconResId=" + i + ", iconFile=" + str2 + ", name=" + str3 + ", symbol=" + str4 + ", isAdded=" + z + ", address=" + str5 + ", chainId=" + i2 + ", decimals=" + i3 + ", allowSwap=" + z2 + ")";
    }
}
