package p000;

import com.google.crypto.tink.C4642c;
import com.google.crypto.tink.C4650d;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import p000.sx3;

/* renamed from: ie1 */
/* compiled from: DeterministicAeadWrapper */
public class ie1 implements ev4<ge1, ge1> {

    /* renamed from: a */
    public static final Logger f29901a = Logger.getLogger(ie1.class.getName());

    /* renamed from: ie1$a */
    /* compiled from: DeterministicAeadWrapper */
    public static class C5958a implements ge1 {

        /* renamed from: a */
        public final C4642c<ge1> f29902a;

        /* renamed from: b */
        public final sx3.C6506a f29903b;

        /* renamed from: c */
        public final sx3.C6506a f29904c;

        public C5958a(C4642c<ge1> cVar) {
            this.f29902a = cVar;
            if (cVar.mo35265i()) {
                sx3 a = n04.m48577b().mo45942a();
                tx3 a2 = ux3.m53032a(cVar);
                this.f29903b = a.mo45943a(a2, "daead", "encrypt");
                this.f29904c = a.mo45943a(a2, "daead", "decrypt");
                return;
            }
            sx3.C6506a aVar = ux3.f34747a;
            this.f29903b = aVar;
            this.f29904c = aVar;
        }

        /* renamed from: a */
        public byte[] mo42881a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            try {
                byte[] a = g70.m44636a(this.f29902a.mo35261e().mo35271a(), this.f29902a.mo35261e().mo35276f().mo42881a(bArr, bArr2));
                this.f29903b.mo47892a(this.f29902a.mo35261e().mo35273c(), (long) bArr.length);
                return a;
            } catch (GeneralSecurityException e) {
                this.f29903b.mo47893b();
                throw e;
            }
        }

        /* renamed from: b */
        public byte[] mo42882b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (C4642c.C4645c next : this.f29902a.mo35262f(copyOf)) {
                    try {
                        byte[] b = ((ge1) next.mo35276f()).mo42882b(copyOfRange, bArr2);
                        this.f29904c.mo47892a(next.mo35273c(), (long) copyOfRange.length);
                        return b;
                    } catch (GeneralSecurityException e) {
                        Logger d = ie1.f29901a;
                        d.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
                    }
                }
            }
            for (C4642c.C4645c next2 : this.f29902a.mo35264h()) {
                try {
                    byte[] b2 = ((ge1) next2.mo35276f()).mo42882b(bArr, bArr2);
                    this.f29904c.mo47892a(next2.mo35273c(), (long) bArr.length);
                    return b2;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f29904c.mo47893b();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    /* renamed from: e */
    public static void m45692e() throws GeneralSecurityException {
        C4650d.m37117m(new ie1());
    }

    /* renamed from: b */
    public Class<ge1> mo42435b() {
        return ge1.class;
    }

    /* renamed from: c */
    public Class<ge1> mo42436c() {
        return ge1.class;
    }

    /* renamed from: f */
    public ge1 mo42434a(C4642c<ge1> cVar) {
        return new C5958a(cVar);
    }
}
