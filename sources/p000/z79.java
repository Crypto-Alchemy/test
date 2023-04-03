package p000;

import java.io.IOException;

/* renamed from: z79 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class z79<T> implements n89<T> {

    /* renamed from: a */
    public final r79 f35999a;

    /* renamed from: b */
    public final z99<?, ?> f36000b;

    /* renamed from: c */
    public final boolean f36001c;

    /* renamed from: d */
    public final w29<?> f36002d;

    public z79(z99<?, ?> z99, w29<?> w29, r79 r79) {
        this.f36000b = z99;
        this.f36001c = w29.mo48881a(r79);
        this.f36002d = w29;
        this.f35999a = r79;
    }

    /* renamed from: i */
    public static <T> z79<T> m55010i(z99<?, ?> z99, w29<?> w29, r79 r79) {
        return new z79<>(z99, w29, r79);
    }

    /* renamed from: a */
    public final int mo46034a(T t) {
        int hashCode = this.f36000b.mo42194d(t).hashCode();
        if (!this.f36001c) {
            return hashCode;
        }
        this.f36002d.mo48882b(t);
        throw null;
    }

    /* renamed from: b */
    public final void mo46035b(T t, j29 j29) throws IOException {
        this.f36002d.mo48882b(t);
        throw null;
    }

    /* renamed from: c */
    public final boolean mo46036c(T t, T t2) {
        if (!this.f36000b.mo42194d(t).equals(this.f36000b.mo42194d(t2))) {
            return false;
        }
        if (!this.f36001c) {
            return true;
        }
        this.f36002d.mo48882b(t);
        this.f36002d.mo48882b(t2);
        throw null;
    }

    /* renamed from: d */
    public final int mo46037d(T t) {
        z99<?, ?> z99 = this.f36000b;
        int g = z99.mo42197g(z99.mo42194d(t));
        if (!this.f36001c) {
            return g;
        }
        this.f36002d.mo48882b(t);
        throw null;
    }

    /* renamed from: e */
    public final boolean mo46038e(T t) {
        this.f36002d.mo48882b(t);
        throw null;
    }

    /* renamed from: f */
    public final void mo46039f(T t) {
        this.f36000b.mo42195e(t);
        this.f36002d.mo48883c(t);
    }

    /* renamed from: g */
    public final void mo46040g(T t, T t2) {
        q89.m50435f(this.f36000b, t, t2);
        if (this.f36001c) {
            q89.m50434e(this.f36002d, t, t2);
        }
    }

    /* renamed from: h */
    public final void mo46041h(T t, byte[] bArr, int i, int i2, b09 b09) throws IOException {
        s49 s49 = (s49) t;
        if (s49.zzc == ca9.m32878a()) {
            s49.zzc = ca9.m32879b();
        }
        k49 k49 = (k49) t;
        throw null;
    }

    public final T zza() {
        return this.f35999a.mo47344a().mo46665q();
    }
}
