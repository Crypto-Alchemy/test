package p000;

import com.google.android.gms.internal.clearcut.C4056e;
import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzco;
import com.google.android.gms.internal.clearcut.zzfq;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: hk8 */
public final class hk8<T> implements hm8<T> {

    /* renamed from: a */
    public final tj8 f29655a;

    /* renamed from: b */
    public final go8<?, ?> f29656b;

    /* renamed from: c */
    public final boolean f29657c;

    /* renamed from: d */
    public final id8<?> f29658d;

    public hk8(go8<?, ?> go8, id8<?> id8, tj8 tj8) {
        this.f29656b = go8;
        this.f29657c = id8.mo30765g(tj8);
        this.f29658d = id8;
        this.f29655a = tj8;
    }

    /* renamed from: j */
    public static <T> hk8<T> m45276j(go8<?, ?> go8, id8<?> id8, tj8 tj8) {
        return new hk8<>(go8, id8, tj8);
    }

    /* renamed from: a */
    public final void mo41955a(T t) {
        this.f29656b.mo42939d(t);
        this.f29658d.mo30764f(t);
    }

    /* renamed from: b */
    public final T mo41956b() {
        return this.f29655a.mo30773m().mo30783s();
    }

    /* renamed from: c */
    public final int mo41957c(T t) {
        int hashCode = this.f29656b.mo42946k(t).hashCode();
        return this.f29657c ? (hashCode * 53) + this.f29658d.mo30760b(t).hashCode() : hashCode;
    }

    /* renamed from: d */
    public final boolean mo41958d(T t, T t2) {
        if (!this.f29656b.mo42946k(t).equals(this.f29656b.mo42946k(t2))) {
            return false;
        }
        if (this.f29657c) {
            return this.f29658d.mo30760b(t).equals(this.f29658d.mo30760b(t2));
        }
        return true;
    }

    /* renamed from: e */
    public final void mo41959e(T t, byte[] bArr, int i, int i2, t98 t98) throws IOException {
        C4056e eVar = (C4056e) t;
        jo8 jo8 = eVar.zzjp;
        if (jo8 == jo8.m46688h()) {
            jo8 = jo8.m46689i();
            eVar.zzjp = jo8;
        }
        jo8 jo82 = jo8;
        while (i < i2) {
            int e = q98.m50475e(bArr, i, t98);
            int i3 = t98.f34169a;
            if (i3 != 11) {
                i = (i3 & 7) == 2 ? q98.m50473c(i3, bArr, e, i2, jo82, t98) : q98.m50471a(i3, bArr, e, i2, t98);
            } else {
                int i4 = 0;
                zzbb zzbb = null;
                while (e < i2) {
                    e = q98.m50475e(bArr, e, t98);
                    int i5 = t98.f34169a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3 && i7 == 2) {
                            e = q98.m50483m(bArr, e, t98);
                            zzbb = (zzbb) t98.f34171c;
                        }
                    } else if (i7 == 0) {
                        e = q98.m50475e(bArr, e, t98);
                        i4 = t98.f34169a;
                    }
                    if (i5 == 12) {
                        break;
                    }
                    e = q98.m50471a(i5, bArr, e, i2, t98);
                }
                if (zzbb != null) {
                    jo82.mo44548e((i4 << 3) | 2, zzbb);
                }
                i = e;
            }
        }
        if (i != i2) {
            throw zzco.zzbo();
        }
    }

    /* renamed from: f */
    public final boolean mo41960f(T t) {
        return this.f29658d.mo30760b(t).mo48083d();
    }

    /* renamed from: g */
    public final void mo41961g(T t, T t2) {
        nm8.m48878i(this.f29656b, t, t2);
        if (this.f29657c) {
            nm8.m48876g(this.f29658d, t, t2);
        }
    }

    /* renamed from: h */
    public final int mo41962h(T t) {
        go8<?, ?> go8 = this.f29656b;
        int l = go8.mo42947l(go8.mo42946k(t)) + 0;
        return this.f29657c ? l + this.f29658d.mo30760b(t).mo48091m() : l;
    }

    /* renamed from: i */
    public final void mo41963i(T t, dr8 dr8) throws IOException {
        Iterator<Map.Entry<?, Object>> e = this.f29658d.mo30760b(t).mo48084e();
        while (e.hasNext()) {
            Map.Entry next = e.next();
            af8 af8 = (af8) next.getKey();
            if (af8.mo28962s() != zzfq.MESSAGE || af8.mo28959b0() || af8.mo28960q()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            dr8.mo42017f(af8.zzc(), next instanceof tg8 ? ((tg8) next).mo48108a().mo49482d() : next.getValue());
        }
        go8<?, ?> go8 = this.f29656b;
        go8.mo42940e(go8.mo42946k(t), dr8);
    }
}
