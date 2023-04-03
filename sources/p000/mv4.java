package p000;

import java.io.IOException;
import org.bouncycastle.pqc.crypto.xmss.BDS;
import org.bouncycastle.pqc.crypto.xmss.BDSStateMap;
import org.bouncycastle.pqc.crypto.xmss.C9053g;

/* renamed from: mv4 */
public class mv4 {
    /* renamed from: a */
    public static lv4 m64459a(C9414ur urVar, C9586x4 x4Var) throws IOException {
        if (urVar instanceof iz4) {
            iz4 iz4 = (iz4) urVar;
            return new lv4(r77.m71476d(iz4.mo52556b()), new yz0(iz4.mo52555a()), x4Var);
        } else if (urVar instanceof nj5) {
            nj5 nj5 = (nj5) urVar;
            return new lv4(new C6825af(bk4.f36885r, new lj5(r77.m71478f(nj5.mo56259a()))), new yz0(nj5.mo62701b()));
        } else if (urVar instanceof k24) {
            C6825af afVar = new C6825af(bk4.f36889v);
            short[] a = ((k24) urVar).mo52852a();
            byte[] bArr = new byte[(a.length * 2)];
            for (int i = 0; i != a.length; i++) {
                ek4.m57397q(a[i], bArr, i * 2);
            }
            return new lv4(afVar, new yz0(bArr));
        } else if (urVar instanceof pd3) {
            pd3 pd3 = (pd3) urVar;
            byte[] b = on0.m70404f().mo64504i(1).mo64499c(pd3).mo64498b();
            return new lv4(new C6825af(wj4.f45596I0), new yz0(b), x4Var, on0.m70404f().mo64504i(1).mo64499c(pd3.mo65289m()).mo64498b());
        } else if (urVar instanceof nk2) {
            nk2 nk2 = (nk2) urVar;
            byte[] b2 = on0.m70404f().mo64504i(nk2.mo62707f()).mo64499c(nk2).mo64498b();
            return new lv4(new C6825af(wj4.f45596I0), new yz0(b2), x4Var, on0.m70404f().mo64504i(nk2.mo62707f()).mo64499c(nk2.mo62708g().mo62935c()).mo64498b());
        } else if (urVar instanceof C9053g) {
            C9053g gVar = (C9053g) urVar;
            return new lv4(new C6825af(bk4.f36890w, new po7(gVar.mo64664d().mo67366b(), r77.m71480h(gVar.mo64524a()))), m64460b(gVar), x4Var);
        } else if (urVar instanceof vo7) {
            vo7 vo7 = (vo7) urVar;
            return new lv4(new C6825af(bk4.f36848F, new so7(vo7.mo66550d().mo66102a(), vo7.mo66550d().mo66103b(), r77.m71480h(vo7.mo65683a()))), m64461c(vo7), x4Var);
        } else if (urVar instanceof yp3) {
            yp3 yp3 = (yp3) urVar;
            return new lv4(new C6825af(bk4.f36881n), new xp3(yp3.mo67144f(), yp3.mo67143e(), yp3.mo67140b(), yp3.mo67141c(), yp3.mo67145g(), r77.m71473a(yp3.mo66759a())));
        } else {
            throw new IOException("key parameters not recognized");
        }
    }

    /* renamed from: b */
    public static ap7 m64460b(C9053g gVar) throws IOException {
        byte[] encoded = gVar.getEncoded();
        int h = gVar.mo64664d().mo67372h();
        int b = gVar.mo64664d().mo67366b();
        int a = (int) dp7.m56991a(encoded, 0, 4);
        if (dp7.m57002l(b, (long) a)) {
            byte[] g = dp7.m56997g(encoded, 4, h);
            int i = 4 + h;
            byte[] g2 = dp7.m56997g(encoded, i, h);
            int i2 = i + h;
            byte[] g3 = dp7.m56997g(encoded, i2, h);
            int i3 = i2 + h;
            byte[] g4 = dp7.m56997g(encoded, i3, h);
            int i4 = i3 + h;
            byte[] g5 = dp7.m56997g(encoded, i4, encoded.length - i4);
            try {
                BDS bds = (BDS) dp7.m56996f(g5, BDS.class);
                return bds.getMaxIndex() != (1 << b) - 1 ? new ap7(a, g, g2, g3, g4, g5, bds.getMaxIndex()) : new ap7(a, g, g2, g3, g4, g5);
            } catch (ClassNotFoundException e) {
                throw new IOException("cannot parse BDS: " + e.getMessage());
            }
        } else {
            throw new IllegalArgumentException("index out of bounds");
        }
    }

    /* renamed from: c */
    public static uo7 m64461c(vo7 vo7) throws IOException {
        byte[] encoded = vo7.getEncoded();
        int f = vo7.mo66550d().mo66107f();
        int a = vo7.mo66550d().mo66102a();
        int i = (a + 7) / 8;
        long a2 = (long) ((int) dp7.m56991a(encoded, 0, i));
        if (dp7.m57002l(a, a2)) {
            int i2 = i + 0;
            byte[] g = dp7.m56997g(encoded, i2, f);
            int i3 = i2 + f;
            byte[] g2 = dp7.m56997g(encoded, i3, f);
            int i4 = i3 + f;
            byte[] g3 = dp7.m56997g(encoded, i4, f);
            int i5 = i4 + f;
            byte[] g4 = dp7.m56997g(encoded, i5, f);
            int i6 = i5 + f;
            byte[] g5 = dp7.m56997g(encoded, i6, encoded.length - i6);
            try {
                BDSStateMap bDSStateMap = (BDSStateMap) dp7.m56996f(g5, BDSStateMap.class);
                return bDSStateMap.getMaxIndex() != (1 << a) - 1 ? new uo7(a2, g, g2, g3, g4, g5, bDSStateMap.getMaxIndex()) : new uo7(a2, g, g2, g3, g4, g5);
            } catch (ClassNotFoundException e) {
                throw new IOException("cannot parse BDSStateMap: " + e.getMessage());
            }
        } else {
            throw new IllegalArgumentException("index out of bounds");
        }
    }
}
