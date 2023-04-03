package p000;

import java.util.List;
import java.util.Map;

/* renamed from: mn8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class mn8 implements Runnable {

    /* renamed from: a */
    public final jn8 f31743a;

    /* renamed from: d */
    public final int f31744d;

    /* renamed from: e */
    public final Throwable f31745e;

    /* renamed from: g */
    public final byte[] f31746g;

    /* renamed from: k */
    public final String f31747k;

    /* renamed from: r */
    public final Map<String, List<String>> f31748r;

    public /* synthetic */ mn8(String str, jn8 jn8, int i, Throwable th, byte[] bArr, Map map, hn8 hn8) {
        cu4.m43221k(jn8);
        this.f31743a = jn8;
        this.f31744d = i;
        this.f31745e = th;
        this.f31746g = bArr;
        this.f31747k = str;
        this.f31748r = map;
    }

    public final void run() {
        this.f31743a.mo29878a(this.f31747k, this.f31744d, this.f31745e, this.f31746g, this.f31748r);
    }
}
