package p000;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p000.cp7;
import p000.xo7;

/* renamed from: uy4 */
public class uy4 {

    /* renamed from: a */
    public static Map f45191a;

    /* renamed from: uy4$b */
    public static class C9417b extends C9422g {
        public C9417b() {
            super();
        }

        /* renamed from: a */
        public C9414ur mo66367a(ic6 ic6, Object obj) throws IOException {
            byte[] M = C9203q4.m71176L(ic6.mo52432u()).mo65418M();
            if (ek4.m57381a(M, 0) == 1) {
                return qd3.m71247a(C9367tq.m72430n(M, 4, M.length));
            }
            if (M.length == 64) {
                M = C9367tq.m72430n(M, 4, M.length);
            }
            return ok2.m70298a(M);
        }
    }

    /* renamed from: uy4$c */
    public static class C9418c extends C9422g {
        public C9418c() {
            super();
        }

        /* renamed from: a */
        public C9414ur mo66367a(ic6 ic6, Object obj) throws IOException {
            zp3 t = zp3.m75184t(ic6.mo52432u());
            return new aq3(t.mo67378u(), t.mo67379w(), t.mo67377s(), r77.m71475c(t.mo67376r().mo50159r()));
        }
    }

    /* renamed from: uy4$d */
    public static class C9419d extends C9422g {
        public C9419d() {
            super();
        }

        /* renamed from: a */
        public C9414ur mo66367a(ic6 ic6, Object obj) throws IOException {
            return new l24(ic6.mo52431t().mo66824J());
        }
    }

    /* renamed from: uy4$e */
    public static class C9420e extends C9422g {
        public C9420e() {
            super();
        }

        /* renamed from: a */
        public C9414ur mo66367a(ic6 ic6, Object obj) throws IOException {
            return new jz4(r77.m71477e(ic6.mo52430r()), ic6.mo52431t().mo66825N());
        }
    }

    /* renamed from: uy4$f */
    public static class C9421f extends C9422g {
        public C9421f() {
            super();
        }

        /* renamed from: a */
        public C9414ur mo66367a(ic6 ic6, Object obj) throws IOException {
            return new oj5(ic6.mo52431t().mo66824J(), r77.m71479g(lj5.m63846r(ic6.mo52430r().mo50160t())));
        }
    }

    /* renamed from: uy4$g */
    public static abstract class C9422g {
        public C9422g() {
        }

        /* renamed from: a */
        public abstract C9414ur mo66367a(ic6 ic6, Object obj) throws IOException;
    }

    /* renamed from: uy4$h */
    public static class C9423h extends C9422g {
        public C9423h() {
            super();
        }

        /* renamed from: a */
        public C9414ur mo66367a(ic6 ic6, Object obj) throws IOException {
            cp7.C6951b f;
            po7 s = po7.m71049s(ic6.mo52430r().mo50160t());
            if (s != null) {
                C9156p4 r = s.mo65330t().mo50159r();
                bp7 r2 = bp7.m56110r(ic6.mo52432u());
                f = new cp7.C6951b(new zo7(s.mo65329r(), r77.m71474b(r))).mo50943g(r2.mo50690s()).mo50944h(r2.mo50691t());
            } else {
                byte[] M = C9203q4.m71176L(ic6.mo52432u()).mo65418M();
                f = new cp7.C6951b(zo7.m75168k(ek4.m57381a(M, 0))).mo50942f(M);
            }
            return f.mo50941e();
        }
    }

    /* renamed from: uy4$i */
    public static class C9424i extends C9422g {
        public C9424i() {
            super();
        }

        /* renamed from: a */
        public C9414ur mo66367a(ic6 ic6, Object obj) throws IOException {
            xo7.C9607b f;
            so7 s = so7.m71990s(ic6.mo52430r().mo50160t());
            if (s != null) {
                C9156p4 r = s.mo65882u().mo50159r();
                bp7 r2 = bp7.m56110r(ic6.mo52432u());
                f = new xo7.C9607b(new to7(s.mo65880r(), s.mo65881t(), r77.m71474b(r))).mo66914g(r2.mo50690s()).mo66915h(r2.mo50691t());
            } else {
                byte[] M = C9203q4.m71176L(ic6.mo52432u()).mo65418M();
                f = new xo7.C9607b(to7.m72383i(ek4.m57381a(M, 0))).mo66913f(M);
            }
            return f.mo66912e();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f45191a = hashMap;
        hashMap.put(bk4.f36866X, new C9420e());
        f45191a.put(bk4.f36867Y, new C9420e());
        f45191a.put(bk4.f36885r, new C9421f());
        f45191a.put(bk4.f36889v, new C9419d());
        f45191a.put(bk4.f36890w, new C9423h());
        f45191a.put(bk4.f36848F, new C9424i());
        f45191a.put(py2.f44128a, new C9423h());
        f45191a.put(py2.f44129b, new C9424i());
        f45191a.put(wj4.f45596I0, new C9417b());
        f45191a.put(bk4.f36881n, new C9418c());
    }

    /* renamed from: a */
    public static C9414ur m72994a(ic6 ic6) throws IOException {
        return m72995b(ic6, (Object) null);
    }

    /* renamed from: b */
    public static C9414ur m72995b(ic6 ic6, Object obj) throws IOException {
        C6825af r = ic6.mo52430r();
        C9422g gVar = (C9422g) f45191a.get(r.mo50159r());
        if (gVar != null) {
            return gVar.mo66367a(ic6, obj);
        }
        throw new IOException("algorithm identifier in public key not recognised: " + r.mo50159r());
    }
}
