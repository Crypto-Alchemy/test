package p000;

import android.os.Looper;
import java.util.Map;

/* renamed from: ep6 */
/* compiled from: ThreadHandoffProducer */
public class ep6<T> implements vv4<T> {

    /* renamed from: a */
    public final vv4<T> f11301a;

    /* renamed from: b */
    public final fp6 f11302b;

    /* renamed from: ep6$a */
    /* compiled from: ThreadHandoffProducer */
    public class C2246a extends f96<T> {

        /* renamed from: r */
        public final /* synthetic */ aw4 f11303r;

        /* renamed from: s */
        public final /* synthetic */ wv4 f11304s;

        /* renamed from: x */
        public final /* synthetic */ vq0 f11305x;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2246a(vq0 vq0, aw4 aw4, wv4 wv4, String str, aw4 aw42, wv4 wv42, vq0 vq02) {
            super(vq0, aw4, wv4, str);
            this.f11303r = aw42;
            this.f11304s = wv42;
            this.f11305x = vq02;
        }

        /* renamed from: b */
        public void mo13406b(T t) {
        }

        /* renamed from: c */
        public T mo13407c() throws Exception {
            return null;
        }

        /* renamed from: f */
        public void mo19452f(T t) {
            this.f11303r.mo11170a(this.f11304s, "BackgroundThreadHandoffProducer", (Map<String, String>) null);
            ep6.this.f11301a.mo11350a(this.f11305x, this.f11304s);
        }
    }

    /* renamed from: ep6$b */
    /* compiled from: ThreadHandoffProducer */
    public class C2247b extends C2439gz {

        /* renamed from: a */
        public final /* synthetic */ f96 f11307a;

        public C2247b(f96 f96) {
            this.f11307a = f96;
        }

        /* renamed from: b */
        public void mo13412b() {
            this.f11307a.mo20438a();
            ep6.this.f11302b.mo20038a(this.f11307a);
        }
    }

    public ep6(vv4<T> vv4, fp6 fp6) {
        this.f11301a = (vv4) au4.m10792g(vv4);
        this.f11302b = fp6;
    }

    /* renamed from: d */
    public static String m16279d(wv4 wv4) {
        if (!kc2.m20627b()) {
            return null;
        }
        return "ThreadHandoffProducer_produceResults_" + wv4.getId();
    }

    /* renamed from: e */
    public static boolean m16280e(wv4 wv4) {
        if (wv4.mo20277c().mo23322D().mo24068o() && Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo11350a(vq0<T> vq0, wv4 wv4) {
        boolean d;
        try {
            if (lc2.m21369d()) {
                lc2.m21366a("ThreadHandoffProducer#produceResults");
            }
            aw4 g = wv4.mo20281g();
            if (m16280e(wv4)) {
                g.mo11176k(wv4, "BackgroundThreadHandoffProducer");
                g.mo11170a(wv4, "BackgroundThreadHandoffProducer", (Map<String, String>) null);
                this.f11301a.mo11350a(vq0, wv4);
                if (!d) {
                    return;
                }
                return;
            }
            C2246a aVar = new C2246a(vq0, g, wv4, "BackgroundThreadHandoffProducer", g, wv4, vq0);
            wv4.mo20292o(new C2247b(aVar));
            this.f11302b.mo20039b(kc2.m20626a(aVar, m16279d(wv4)));
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
        } finally {
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
        }
    }
}
