package p000;

import com.google.crypto.tink.C4642c;
import com.google.crypto.tink.C4650d;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import p000.sx3;

/* renamed from: pm3 */
/* compiled from: MacWrapper */
public class pm3 implements ev4<lm3, lm3> {

    /* renamed from: a */
    public static final Logger f32739a = Logger.getLogger(pm3.class.getName());

    /* renamed from: b */
    public static final byte[] f32740b = {0};

    /* renamed from: pm3$b */
    /* compiled from: MacWrapper */
    public static class C6364b implements lm3 {

        /* renamed from: a */
        public final C4642c<lm3> f32741a;

        /* renamed from: b */
        public final sx3.C6506a f32742b;

        /* renamed from: c */
        public final sx3.C6506a f32743c;

        /* renamed from: a */
        public void mo45449a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            byte[] bArr3;
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (C4642c.C4645c next : this.f32741a.mo35262f(copyOf)) {
                    if (next.mo35274d().equals(OutputPrefixType.LEGACY)) {
                        bArr3 = g70.m44636a(bArr2, pm3.f32740b);
                    } else {
                        bArr3 = bArr2;
                    }
                    try {
                        ((lm3) next.mo35276f()).mo45449a(copyOfRange, bArr3);
                        this.f32743c.mo47892a(next.mo35273c(), (long) bArr3.length);
                        return;
                    } catch (GeneralSecurityException e) {
                        Logger e2 = pm3.f32739a;
                        e2.info("tag prefix matches a key, but cannot verify: " + e);
                    }
                }
                for (C4642c.C4645c next2 : this.f32741a.mo35264h()) {
                    try {
                        ((lm3) next2.mo35276f()).mo45449a(bArr, bArr2);
                        this.f32743c.mo47892a(next2.mo35273c(), (long) bArr2.length);
                        return;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                this.f32743c.mo47893b();
                throw new GeneralSecurityException("invalid MAC");
            }
            this.f32743c.mo47893b();
            throw new GeneralSecurityException("tag too short");
        }

        /* renamed from: b */
        public byte[] mo45450b(byte[] bArr) throws GeneralSecurityException {
            if (this.f32741a.mo35261e().mo35274d().equals(OutputPrefixType.LEGACY)) {
                bArr = g70.m44636a(bArr, pm3.f32740b);
            }
            try {
                byte[] a = g70.m44636a(this.f32741a.mo35261e().mo35271a(), this.f32741a.mo35261e().mo35276f().mo45450b(bArr));
                this.f32742b.mo47892a(this.f32741a.mo35261e().mo35273c(), (long) bArr.length);
                return a;
            } catch (GeneralSecurityException e) {
                this.f32742b.mo47893b();
                throw e;
            }
        }

        public C6364b(C4642c<lm3> cVar) {
            this.f32741a = cVar;
            if (cVar.mo35265i()) {
                sx3 a = n04.m48577b().mo45942a();
                tx3 a2 = ux3.m53032a(cVar);
                this.f32742b = a.mo45943a(a2, "mac", "compute");
                this.f32743c = a.mo45943a(a2, "mac", "verify");
                return;
            }
            sx3.C6506a aVar = ux3.f34747a;
            this.f32742b = aVar;
            this.f32743c = aVar;
        }
    }

    /* renamed from: f */
    public static void m50000f() throws GeneralSecurityException {
        C4650d.m37117m(new pm3());
    }

    /* renamed from: b */
    public Class<lm3> mo42435b() {
        return lm3.class;
    }

    /* renamed from: c */
    public Class<lm3> mo42436c() {
        return lm3.class;
    }

    /* renamed from: g */
    public final void mo46780g(C4642c<lm3> cVar) throws GeneralSecurityException {
        for (List<C4642c.C4645c<lm3>> it : cVar.mo35259c()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    C4642c.C4645c cVar2 = (C4642c.C4645c) it2.next();
                    if (cVar2.mo35272b() instanceof nm3) {
                        nm3 nm3 = (nm3) cVar2.mo35272b();
                        e70 a = e70.m43803a(cVar2.mo35271a());
                        if (!a.equals(nm3.mo45740b())) {
                            throw new GeneralSecurityException("Mac Key with parameters " + nm3.mo28899a() + " has wrong output prefix (" + nm3.mo45740b() + ") instead of (" + a + ")");
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public lm3 mo42434a(C4642c<lm3> cVar) throws GeneralSecurityException {
        mo46780g(cVar);
        return new C6364b(cVar);
    }
}
