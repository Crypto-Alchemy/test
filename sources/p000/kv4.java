package p000;

import java.io.IOException;
import org.bouncycastle.pqc.crypto.xmss.BDS;
import org.bouncycastle.pqc.crypto.xmss.BDSStateMap;
import org.bouncycastle.pqc.crypto.xmss.C9053g;
import p000.vo7;

/* renamed from: kv4 */
public class kv4 {
    /* renamed from: a */
    public static short[] m63624a(byte[] bArr) {
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i = 0; i != length; i++) {
            sArr[i] = ek4.m57391k(bArr, i * 2);
        }
        return sArr;
    }

    /* renamed from: b */
    public static C9414ur m63625b(lv4 lv4) throws IOException {
        C9156p4 r = lv4.mo55985t().mo50159r();
        if (r.mo65222S(C7056ew.f37634W)) {
            return new iz4(r77.m71477e(lv4.mo55985t()), C9203q4.m71176L(lv4.mo55983A()).mo65418M());
        } else if (r.mo65963B(C7056ew.f37664s)) {
            return new nj5(C9203q4.m71176L(lv4.mo55983A()).mo65418M(), r77.m71479g(lj5.m63846r(lv4.mo55985t().mo50160t())));
        } else {
            if (r.mo65963B(C7056ew.f37649f0)) {
                return new k24(m63624a(C9203q4.m71176L(lv4.mo55983A()).mo65418M()));
            }
            if (r.mo65963B(wj4.f45596I0)) {
                byte[] M = C9203q4.m71176L(lv4.mo55983A()).mo65418M();
                C9584x3 u = lv4.mo55986u();
                if (ek4.m57381a(M, 0) == 1) {
                    if (u == null) {
                        return pd3.m70985h(C9367tq.m72430n(M, 4, M.length));
                    }
                    byte[] N = u.mo66825N();
                    return pd3.m70986i(C9367tq.m72430n(M, 4, M.length), C9367tq.m72430n(N, 4, N.length));
                } else if (u == null) {
                    return nk2.m69788c(C9367tq.m72430n(M, 4, M.length));
                } else {
                    return nk2.m69789d(C9367tq.m72430n(M, 4, M.length), u.mo66825N());
                }
            } else if (r.mo65963B(C7056ew.f37668w)) {
                po7 s = po7.m71049s(lv4.mo55985t().mo50160t());
                C9156p4 r2 = s.mo65330t().mo50159r();
                ap7 t = ap7.m55620t(lv4.mo55983A());
                try {
                    C9053g.C9055b o = new C9053g.C9055b(new zo7(s.mo65329r(), r77.m71474b(r2))).mo64669l(t.mo50291s()).mo64674q(t.mo50288D()).mo64673p(t.mo50287B()).mo64671n(t.mo50293w()).mo64672o(t.mo50286A());
                    if (t.mo50289E() != 0) {
                        o.mo64670m(t.mo50292u());
                    }
                    if (t.mo50290r() != null) {
                        o.mo64668k(((BDS) dp7.m56996f(t.mo50290r(), BDS.class)).withWOTSDigest(r2));
                    }
                    return o.mo64667j();
                } catch (ClassNotFoundException e) {
                    throw new IOException("ClassNotFoundException processing BDS state: " + e.getMessage());
                }
            } else if (r.mo65963B(bk4.f36848F)) {
                so7 s2 = so7.m71990s(lv4.mo55985t().mo50160t());
                C9156p4 r3 = s2.mo65882u().mo50159r();
                try {
                    uo7 t2 = uo7.m72946t(lv4.mo55983A());
                    vo7.C9465b p = new vo7.C9465b(new to7(s2.mo65880r(), s2.mo65881t(), r77.m71474b(r3))).mo66556m(t2.mo66348s()).mo66561r(t2.mo66345D()).mo66560q(t2.mo66344B()).mo66558o(t2.mo66350w()).mo66559p(t2.mo66343A());
                    if (t2.mo66346E() != 0) {
                        p.mo66557n(t2.mo66349u());
                    }
                    if (t2.mo66347r() != null) {
                        p.mo66555l(((BDSStateMap) dp7.m56996f(t2.mo66347r(), BDSStateMap.class)).withWOTSDigest(r3));
                    }
                    return p.mo66554k();
                } catch (ClassNotFoundException e2) {
                    throw new IOException("ClassNotFoundException processing BDS state: " + e2.getMessage());
                }
            } else if (r.mo65963B(bk4.f36881n)) {
                xp3 u2 = xp3.m74054u(lv4.mo55983A());
                return new yp3(u2.mo66916A(), u2.mo66921w(), u2.mo66919s(), u2.mo66920t(), u2.mo66917B(), r77.m71475c(u2.mo66918r().mo50159r()));
            } else {
                throw new RuntimeException("algorithm identifier in private key not recognised");
            }
        }
    }
}
