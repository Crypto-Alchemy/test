package p000;

import com.google.crypto.tink.C4642c;
import com.google.crypto.tink.C4650d;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import p000.sx3;

/* renamed from: kd */
/* compiled from: AeadWrapper */
public class C6141kd implements ev4<C5954id, C5954id> {

    /* renamed from: a */
    public static final Logger f30847a = Logger.getLogger(C6141kd.class.getName());

    /* renamed from: kd$b */
    /* compiled from: AeadWrapper */
    public static class C6143b implements C5954id {

        /* renamed from: a */
        public final C4642c<C5954id> f30848a;

        /* renamed from: b */
        public final sx3.C6506a f30849b;

        /* renamed from: c */
        public final sx3.C6506a f30850c;

        /* renamed from: a */
        public byte[] mo29526a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            try {
                byte[] a = g70.m44636a(this.f30848a.mo35261e().mo35271a(), this.f30848a.mo35261e().mo35276f().mo29526a(bArr, bArr2));
                this.f30849b.mo47892a(this.f30848a.mo35261e().mo35273c(), (long) bArr.length);
                return a;
            } catch (GeneralSecurityException e) {
                this.f30849b.mo47893b();
                throw e;
            }
        }

        /* renamed from: b */
        public byte[] mo29527b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (C4642c.C4645c next : this.f30848a.mo35262f(copyOf)) {
                    try {
                        byte[] b = ((C5954id) next.mo35276f()).mo29527b(copyOfRange, bArr2);
                        this.f30850c.mo47892a(next.mo35273c(), (long) copyOfRange.length);
                        return b;
                    } catch (GeneralSecurityException e) {
                        Logger d = C6141kd.f30847a;
                        d.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
                    }
                }
            }
            for (C4642c.C4645c next2 : this.f30848a.mo35264h()) {
                try {
                    byte[] b2 = ((C5954id) next2.mo35276f()).mo29527b(bArr, bArr2);
                    this.f30850c.mo47892a(next2.mo35273c(), (long) bArr.length);
                    return b2;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f30850c.mo47893b();
            throw new GeneralSecurityException("decryption failed");
        }

        public C6143b(C4642c<C5954id> cVar) {
            this.f30848a = cVar;
            if (cVar.mo35265i()) {
                sx3 a = n04.m48577b().mo45942a();
                tx3 a2 = ux3.m53032a(cVar);
                this.f30849b = a.mo45943a(a2, "aead", "encrypt");
                this.f30850c = a.mo45943a(a2, "aead", "decrypt");
                return;
            }
            sx3.C6506a aVar = ux3.f34747a;
            this.f30849b = aVar;
            this.f30850c = aVar;
        }
    }

    /* renamed from: e */
    public static void m46995e() throws GeneralSecurityException {
        C4650d.m37117m(new C6141kd());
    }

    /* renamed from: b */
    public Class<C5954id> mo42435b() {
        return C5954id.class;
    }

    /* renamed from: c */
    public Class<C5954id> mo42436c() {
        return C5954id.class;
    }

    /* renamed from: f */
    public C5954id mo42434a(C4642c<C5954id> cVar) throws GeneralSecurityException {
        return new C6143b(cVar);
    }
}
