package p000;

import java.io.IOException;

/* renamed from: jc6 */
public class jc6 {
    /* renamed from: a */
    public static ic6 m59342a(C9414ur urVar) throws IOException {
        if (urVar instanceof jz4) {
            jz4 jz4 = (jz4) urVar;
            return new ic6(r77.m71476d(jz4.mo52823b()), jz4.mo52822a());
        } else if (urVar instanceof oj5) {
            oj5 oj5 = (oj5) urVar;
            return new ic6(new C6825af(bk4.f36885r, new lj5(r77.m71478f(oj5.mo56259a()))), oj5.mo62933b());
        } else if (urVar instanceof l24) {
            return new ic6(new C6825af(bk4.f36889v), ((l24) urVar).mo55808a());
        } else {
            if (urVar instanceof qd3) {
                return new ic6(new C6825af(wj4.f45596I0), (C6843b4) new yz0(on0.m70404f().mo64504i(1).mo64499c((qd3) urVar).mo64498b()));
            } else if (urVar instanceof ok2) {
                ok2 ok2 = (ok2) urVar;
                return new ic6(new C6825af(wj4.f45596I0), (C6843b4) new yz0(on0.m70404f().mo64504i(ok2.mo62934b()).mo64499c(ok2.mo62935c()).mo64498b()));
            } else if (urVar instanceof cp7) {
                cp7 cp7 = (cp7) urVar;
                byte[] c = cp7.mo50938c();
                byte[] d = cp7.mo50939d();
                byte[] encoded = cp7.getEncoded();
                return encoded.length > c.length + d.length ? new ic6(new C6825af(py2.f44128a), (C6843b4) new yz0(encoded)) : new ic6(new C6825af(bk4.f36890w, new po7(cp7.mo50937b().mo67366b(), r77.m71480h(cp7.mo64524a()))), (C6843b4) new bp7(c, d));
            } else if (urVar instanceof xo7) {
                xo7 xo7 = (xo7) urVar;
                byte[] c2 = xo7.mo66909c();
                byte[] d2 = xo7.mo66910d();
                byte[] encoded2 = xo7.getEncoded();
                return encoded2.length > c2.length + d2.length ? new ic6(new C6825af(py2.f44129b), (C6843b4) new yz0(encoded2)) : new ic6(new C6825af(bk4.f36848F, new so7(xo7.mo66908b().mo66102a(), xo7.mo66908b().mo66103b(), r77.m71480h(xo7.mo65683a()))), (C6843b4) new wo7(xo7.mo66909c(), xo7.mo66910d()));
            } else if (urVar instanceof aq3) {
                aq3 aq3 = (aq3) urVar;
                return new ic6(new C6825af(bk4.f36881n), (C6843b4) new zp3(aq3.mo50307d(), aq3.mo50308e(), aq3.mo50305b(), r77.m71473a(aq3.mo66759a())));
            } else {
                throw new IOException("key parameters not recognized");
            }
        }
    }
}
