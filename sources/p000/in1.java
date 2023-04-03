package p000;

import java.io.ByteArrayOutputStream;

/* renamed from: in1 */
public class in1 {

    /* renamed from: a */
    public final C7218b f38417a = new C7218b();

    /* renamed from: b */
    public boolean f38418b;

    /* renamed from: c */
    public gn1 f38419c;

    /* renamed from: d */
    public hn1 f38420d;

    /* renamed from: in1$b */
    public static class C7218b extends ByteArrayOutputStream {
        public C7218b() {
        }

        /* renamed from: a */
        public synchronized byte[] mo52510a(gn1 gn1) {
            byte[] bArr;
            bArr = new byte[64];
            gn1.mo51943b(0, (byte[]) null, this.buf, 0, this.count, bArr, 0);
            reset();
            return bArr;
        }

        public synchronized void reset() {
            C9367tq.m72433q(this.buf, 0, this.count, (byte) 0);
            this.count = 0;
        }
    }

    /* renamed from: a */
    public byte[] mo52506a() {
        gn1 gn1;
        if (this.f38418b && (gn1 = this.f38419c) != null) {
            return this.f38417a.mo52510a(gn1);
        }
        throw new IllegalStateException("Ed25519Signer not initialised for signature generation.");
    }

    /* renamed from: b */
    public void mo52507b(boolean z, we0 we0) {
        this.f38418b = z;
        if (z) {
            this.f38419c = (gn1) we0;
            this.f38420d = null;
        } else {
            this.f38419c = null;
            this.f38420d = (hn1) we0;
        }
        mo52508c();
    }

    /* renamed from: c */
    public void mo52508c() {
        this.f38417a.reset();
    }

    /* renamed from: d */
    public void mo52509d(byte[] bArr, int i, int i2) {
        this.f38417a.write(bArr, i, i2);
    }
}
