package p000;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.util.TriState;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: gk7 */
/* compiled from: WebpTranscodeProducer */
public class gk7 implements vv4<gp1> {

    /* renamed from: a */
    public final Executor f12408a;

    /* renamed from: b */
    public final qs4 f12409b;

    /* renamed from: c */
    public final vv4<gp1> f12410c;

    /* renamed from: gk7$a */
    /* compiled from: WebpTranscodeProducer */
    public class C2392a extends f96<gp1> {

        /* renamed from: r */
        public final /* synthetic */ gp1 f12411r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2392a(vq0 vq0, aw4 aw4, wv4 wv4, String str, gp1 gp1) {
            super(vq0, aw4, wv4, str);
            this.f12411r = gp1;
        }

        /* renamed from: d */
        public void mo19821d() {
            gp1.m18285c(this.f12411r);
            super.mo19821d();
        }

        /* renamed from: e */
        public void mo19822e(Exception exc) {
            gp1.m18285c(this.f12411r);
            super.mo19822e(exc);
        }

        /* renamed from: j */
        public void mo13406b(gp1 gp1) {
            gp1.m18285c(gp1);
        }

        /* renamed from: k */
        public gp1 mo13407c() throws Exception {
            nh0 v;
            ss4 c = gk7.this.f12409b.mo19481c();
            try {
                gk7.m18146f(this.f12411r, c);
                v = nh0.m23181v(c.mo13354a());
                gp1 gp1 = new gp1((nh0<PooledByteBuffer>) v);
                gp1.mo20744d(this.f12411r);
                nh0.m23178h(v);
                c.close();
                return gp1;
            } catch (Throwable th) {
                c.close();
                throw th;
            }
        }

        /* renamed from: l */
        public void mo19452f(gp1 gp1) {
            gp1.m18285c(this.f12411r);
            super.mo19452f(gp1);
        }
    }

    /* renamed from: gk7$b */
    /* compiled from: WebpTranscodeProducer */
    public class C2393b extends sb1<gp1, gp1> {

        /* renamed from: c */
        public final wv4 f12413c;

        /* renamed from: d */
        public TriState f12414d = TriState.UNSET;

        public C2393b(vq0<gp1> vq0, wv4 wv4) {
            super(vq0);
            this.f12413c = wv4;
        }

        /* renamed from: q */
        public void mo11352i(gp1 gp1, int i) {
            if (this.f12414d == TriState.UNSET && gp1 != null) {
                this.f12414d = gk7.m18147g(gp1);
            }
            if (this.f12414d == TriState.NO) {
                mo25710p().mo27294c(gp1, i);
            } else if (!C3766zx.m31566e(i)) {
            } else {
                if (this.f12414d != TriState.YES || gp1 == null) {
                    mo25710p().mo27294c(gp1, i);
                } else {
                    gk7.this.mo20629h(gp1, mo25710p(), this.f12413c);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, vv4<gp1>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gk7(java.util.concurrent.Executor r1, p000.qs4 r2, p000.vv4<p000.gp1> r3) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = p000.au4.m10792g(r1)
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            r0.f12408a = r1
            java.lang.Object r1 = p000.au4.m10792g(r2)
            qs4 r1 = (p000.qs4) r1
            r0.f12409b = r1
            java.lang.Object r1 = p000.au4.m10792g(r3)
            vv4 r1 = (p000.vv4) r1
            r0.f12410c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gk7.<init>(java.util.concurrent.Executor, qs4, vv4):void");
    }

    /* renamed from: f */
    public static void m18146f(gp1 gp1, ss4 ss4) throws Exception {
        InputStream inputStream = (InputStream) au4.m10792g(gp1.mo20752l());
        rq2 c = sq2.m27065c(inputStream);
        if (c == r81.f17202f || c == r81.f17204h) {
            ik7.m19689a().mo13384c(inputStream, ss4, 80);
            gp1.mo20738P(r81.f17197a);
        } else if (c == r81.f17203g || c == r81.f17205i) {
            ik7.m19689a().mo13382a(inputStream, ss4);
            gp1.mo20738P(r81.f17198b);
        } else {
            throw new IllegalArgumentException("Wrong image format");
        }
    }

    /* renamed from: g */
    public static TriState m18147g(gp1 gp1) {
        au4.m10792g(gp1);
        rq2 c = sq2.m27065c((InputStream) au4.m10792g(gp1.mo20752l()));
        if (r81.m26115a(c)) {
            hk7 a = ik7.m19689a();
            if (a == null) {
                return TriState.NO;
            }
            return TriState.valueOf(!a.mo13383b(c));
        } else if (c == rq2.f17332c) {
            return TriState.UNSET;
        } else {
            return TriState.NO;
        }
    }

    /* renamed from: a */
    public void mo11350a(vq0<gp1> vq0, wv4 wv4) {
        this.f12410c.mo11350a(new C2393b(vq0, wv4), wv4);
    }

    /* renamed from: h */
    public final void mo20629h(gp1 gp1, vq0<gp1> vq0, wv4 wv4) {
        au4.m10792g(gp1);
        vq0<gp1> vq02 = vq0;
        this.f12408a.execute(new C2392a(vq02, wv4.mo20281g(), wv4, "WebpTranscodeProducer", gp1.m18284b(gp1)));
    }
}
