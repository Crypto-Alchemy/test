package p000;

import java.io.IOException;
import java.util.Map;
import java.util.WeakHashMap;
import org.bouncycastle.pqc.crypto.ExhaustedPrivateKeyException;
import org.bouncycastle.pqc.crypto.lms.LMOtsParameters;
import org.bouncycastle.pqc.crypto.lms.LMSigParameters;

/* renamed from: pd3 */
public class pd3 extends od3 {

    /* renamed from: C */
    public static C9177a f44026C;

    /* renamed from: H */
    public static C9177a[] f44027H;

    /* renamed from: A */
    public int f44028A;

    /* renamed from: B */
    public qd3 f44029B;

    /* renamed from: d */
    public final byte[] f44030d;

    /* renamed from: e */
    public final LMSigParameters f44031e;

    /* renamed from: g */
    public final LMOtsParameters f44032g;

    /* renamed from: k */
    public final int f44033k;

    /* renamed from: r */
    public final byte[] f44034r;

    /* renamed from: s */
    public final Map<C9177a, byte[]> f44035s;

    /* renamed from: x */
    public final int f44036x;

    /* renamed from: y */
    public final ig1 f44037y;

    /* renamed from: pd3$a */
    public static class C9177a {

        /* renamed from: a */
        public final int f44038a;

        public C9177a(int i) {
            this.f44038a = i;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C9177a) && ((C9177a) obj).f44038a == this.f44038a;
        }

        public int hashCode() {
            return this.f44038a;
        }
    }

    static {
        C9177a aVar = new C9177a(1);
        f44026C = aVar;
        C9177a[] aVarArr = new C9177a[129];
        f44027H = aVarArr;
        aVarArr[1] = aVar;
        int i = 2;
        while (true) {
            C9177a[] aVarArr2 = f44027H;
            if (i < aVarArr2.length) {
                aVarArr2[i] = new C9177a(i);
                i++;
            } else {
                return;
            }
        }
    }

    public pd3(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters, int i, byte[] bArr, int i2, byte[] bArr2) {
        super(true);
        this.f44031e = lMSigParameters;
        this.f44032g = lMOtsParameters;
        this.f44028A = i;
        this.f44030d = C9367tq.m72422f(bArr);
        this.f44033k = i2;
        this.f44034r = C9367tq.m72422f(bArr2);
        this.f44036x = 1 << (lMSigParameters.mo64589c() + 1);
        this.f44035s = new WeakHashMap();
        this.f44037y = mg1.m64327a(lMSigParameters.mo64588b());
    }

    public pd3(pd3 pd3, int i, int i2) {
        super(true);
        LMSigParameters lMSigParameters = pd3.f44031e;
        this.f44031e = lMSigParameters;
        this.f44032g = pd3.f44032g;
        this.f44028A = i;
        this.f44030d = pd3.f44030d;
        this.f44033k = i2;
        this.f44034r = pd3.f44034r;
        this.f44036x = 1 << lMSigParameters.mo64589c();
        this.f44035s = pd3.f44035s;
        this.f44037y = mg1.m64327a(lMSigParameters.mo64588b());
        this.f44029B = pd3.f44029B;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.pd3 m70985h(java.lang.Object r8) throws java.io.IOException {
        /*
            boolean r0 = r8 instanceof p000.pd3
            if (r0 == 0) goto L_0x0007
            pd3 r8 = (p000.pd3) r8
            return r8
        L_0x0007:
            boolean r0 = r8 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x0075
            java.io.DataInputStream r8 = (java.io.DataInputStream) r8
            int r0 = r8.readInt()
            if (r0 != 0) goto L_0x006d
            int r0 = r8.readInt()
            org.bouncycastle.pqc.crypto.lms.LMSigParameters r2 = org.bouncycastle.pqc.crypto.lms.LMSigParameters.m70497e(r0)
            int r0 = r8.readInt()
            org.bouncycastle.pqc.crypto.lms.LMOtsParameters r3 = org.bouncycastle.pqc.crypto.lms.LMOtsParameters.m70489f(r0)
            r0 = 16
            byte[] r5 = new byte[r0]
            r8.readFully(r5)
            int r4 = r8.readInt()
            int r6 = r8.readInt()
            int r0 = r8.readInt()
            if (r0 < 0) goto L_0x0065
            int r1 = r8.available()
            if (r0 > r1) goto L_0x004a
            byte[] r7 = new byte[r0]
            r8.readFully(r7)
            pd3 r8 = new pd3
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r8
        L_0x004a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "secret length exceeded "
            r1.append(r2)
            int r8 = r8.available()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L_0x0065:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "secret length less than zero"
            r8.<init>(r0)
            throw r8
        L_0x006d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "expected version 0 lms private key"
            r8.<init>(r0)
            throw r8
        L_0x0075:
            boolean r0 = r8 instanceof byte[]
            if (r0 == 0) goto L_0x0098
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x0091 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0091 }
            byte[] r8 = (byte[]) r8     // Catch:{ all -> 0x0091 }
            r2.<init>(r8)     // Catch:{ all -> 0x0091 }
            r1.<init>(r2)     // Catch:{ all -> 0x0091 }
            pd3 r8 = m70985h(r1)     // Catch:{ all -> 0x008e }
            r1.close()
            return r8
        L_0x008e:
            r8 = move-exception
            r0 = r1
            goto L_0x0092
        L_0x0091:
            r8 = move-exception
        L_0x0092:
            if (r0 == 0) goto L_0x0097
            r0.close()
        L_0x0097:
            throw r8
        L_0x0098:
            boolean r0 = r8 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x00a7
            java.io.InputStream r8 = (java.io.InputStream) r8
            byte[] r8 = p000.ya6.m74322c(r8)
            pd3 r8 = m70985h(r8)
            return r8
        L_0x00a7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cannot parse "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.pd3.m70985h(java.lang.Object):pd3");
    }

    /* renamed from: i */
    public static pd3 m70986i(byte[] bArr, byte[] bArr2) throws IOException {
        pd3 h = m70985h(bArr);
        h.f44029B = qd3.m71247a(bArr2);
        return h;
    }

    /* renamed from: a */
    public final byte[] mo65277a(int i) {
        int c = 1 << mo65290n().mo64589c();
        if (i >= c) {
            si3.m71950a(mo65283f(), this.f44037y);
            si3.m71952c(i, this.f44037y);
            si3.m71951b(-32126, this.f44037y);
            si3.m71950a(sd3.m71908d(mo65288l(), mo65283f(), i - c, mo65286j()), this.f44037y);
            byte[] bArr = new byte[this.f44037y.mo50202e()];
            this.f44037y.mo50198a(bArr, 0);
            return bArr;
        }
        int i2 = i * 2;
        byte[] c2 = mo65279c(i2);
        byte[] c3 = mo65279c(i2 + 1);
        si3.m71950a(mo65283f(), this.f44037y);
        si3.m71952c(i, this.f44037y);
        si3.m71951b(-31869, this.f44037y);
        si3.m71950a(c2, this.f44037y);
        si3.m71950a(c3, this.f44037y);
        byte[] bArr2 = new byte[this.f44037y.mo50202e()];
        this.f44037y.mo50198a(bArr2, 0);
        return bArr2;
    }

    /* renamed from: b */
    public pd3 mo65278b(int i) {
        pd3 pd3;
        synchronized (this) {
            int i2 = this.f44028A;
            if (i2 + i < this.f44033k) {
                pd3 = new pd3(this, i2, i2 + i);
                this.f44028A += i;
            } else {
                throw new IllegalArgumentException("usageCount exceeds usages remaining");
            }
        }
        return pd3;
    }

    /* renamed from: c */
    public byte[] mo65279c(int i) {
        if (i >= this.f44036x) {
            return mo65277a(i);
        }
        C9177a[] aVarArr = f44027H;
        return mo65280d(i < aVarArr.length ? aVarArr[i] : new C9177a(i));
    }

    /* renamed from: d */
    public final byte[] mo65280d(C9177a aVar) {
        synchronized (this.f44035s) {
            byte[] bArr = this.f44035s.get(aVar);
            if (bArr != null) {
                return bArr;
            }
            byte[] a = mo65277a(aVar.f44038a);
            this.f44035s.put(aVar, a);
            return a;
        }
    }

    /* renamed from: e */
    public md3 mo65281e() {
        int c = mo65290n().mo64589c();
        int g = mo65284g();
        jd3 k = mo65287k();
        int i = (1 << c) + g;
        byte[][] bArr = new byte[c][];
        for (int i2 = 0; i2 < c; i2++) {
            bArr[i2] = mo65279c((i / (1 << i2)) ^ 1);
        }
        return k.mo52672e(mo65290n(), bArr);
    }

    public boolean equals(Object obj) {
        qd3 qd3;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        pd3 pd3 = (pd3) obj;
        if (this.f44028A != pd3.f44028A || this.f44033k != pd3.f44033k || !C9367tq.m72417a(this.f44030d, pd3.f44030d)) {
            return false;
        }
        LMSigParameters lMSigParameters = this.f44031e;
        if (lMSigParameters == null ? pd3.f44031e != null : !lMSigParameters.equals(pd3.f44031e)) {
            return false;
        }
        LMOtsParameters lMOtsParameters = this.f44032g;
        if (lMOtsParameters == null ? pd3.f44032g != null : !lMOtsParameters.equals(pd3.f44032g)) {
            return false;
        }
        if (!C9367tq.m72417a(this.f44034r, pd3.f44034r)) {
            return false;
        }
        qd3 qd32 = this.f44029B;
        if (qd32 == null || (qd3 = pd3.f44029B) == null) {
            return true;
        }
        return qd32.equals(qd3);
    }

    /* renamed from: f */
    public byte[] mo65283f() {
        return C9367tq.m72422f(this.f44030d);
    }

    /* renamed from: g */
    public synchronized int mo65284g() {
        return this.f44028A;
    }

    public byte[] getEncoded() throws IOException {
        return on0.m70404f().mo64504i(0).mo64504i(this.f44031e.mo64591f()).mo64504i(this.f44032g.mo64586g()).mo64500d(this.f44030d).mo64504i(this.f44028A).mo64504i(this.f44033k).mo64504i(this.f44034r.length).mo64500d(this.f44034r).mo64498b();
    }

    public int hashCode() {
        int u = ((this.f44028A * 31) + C9367tq.m72437u(this.f44030d)) * 31;
        LMSigParameters lMSigParameters = this.f44031e;
        int i = 0;
        int hashCode = (u + (lMSigParameters != null ? lMSigParameters.hashCode() : 0)) * 31;
        LMOtsParameters lMOtsParameters = this.f44032g;
        int hashCode2 = (((((hashCode + (lMOtsParameters != null ? lMOtsParameters.hashCode() : 0)) * 31) + this.f44033k) * 31) + C9367tq.m72437u(this.f44034r)) * 31;
        qd3 qd3 = this.f44029B;
        if (qd3 != null) {
            i = qd3.hashCode();
        }
        return hashCode2 + i;
    }

    /* renamed from: j */
    public byte[] mo65286j() {
        return C9367tq.m72422f(this.f44034r);
    }

    /* renamed from: k */
    public jd3 mo65287k() {
        jd3 jd3;
        synchronized (this) {
            int i = this.f44028A;
            if (i < this.f44033k) {
                jd3 = new jd3(this.f44032g, this.f44030d, i, this.f44034r);
                mo65292p();
            } else {
                throw new ExhaustedPrivateKeyException("ots private key exhausted");
            }
        }
        return jd3;
    }

    /* renamed from: l */
    public LMOtsParameters mo65288l() {
        return this.f44032g;
    }

    /* renamed from: m */
    public qd3 mo65289m() {
        qd3 qd3;
        synchronized (this) {
            if (this.f44029B == null) {
                this.f44029B = new qd3(this.f44031e, this.f44032g, mo65280d(f44026C), this.f44030d);
            }
            qd3 = this.f44029B;
        }
        return qd3;
    }

    /* renamed from: n */
    public LMSigParameters mo65290n() {
        return this.f44031e;
    }

    /* renamed from: o */
    public long mo65291o() {
        return (long) (this.f44033k - this.f44028A);
    }

    /* renamed from: p */
    public synchronized void mo65292p() {
        this.f44028A++;
    }
}
