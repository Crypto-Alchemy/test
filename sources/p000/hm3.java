package p000;

import android.annotation.SuppressLint;
import p000.xs3;

/* renamed from: hm3 */
/* compiled from: LruResourceCache */
public class hm3 extends dm3<z93, bf5<?>> implements xs3 {

    /* renamed from: e */
    public xs3.C3640a f12960e;

    public hm3(long j) {
        super(j);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo21282a(int i) {
        if (i >= 40) {
            mo18842b();
        } else if (i >= 20 || i == 15) {
            mo18850m(mo18845h() / 2);
        }
    }

    /* renamed from: c */
    public void mo21283c(xs3.C3640a aVar) {
        this.f12960e = aVar;
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ bf5 mo21284d(z93 z93, bf5 bf5) {
        return (bf5) super.mo18848k(z93, bf5);
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ bf5 mo21285e(z93 z93) {
        return (bf5) super.mo18849l(z93);
    }

    /* renamed from: n */
    public int mo18846i(bf5<?> bf5) {
        if (bf5 == null) {
            return super.mo18846i(null);
        }
        return bf5.getSize();
    }

    /* renamed from: o */
    public void mo18847j(z93 z93, bf5<?> bf5) {
        xs3.C3640a aVar = this.f12960e;
        if (aVar != null && bf5 != null) {
            aVar.mo12520d(bf5);
        }
    }
}
