package p000;

import java.io.IOException;

/* renamed from: cp7 */
public final class cp7 extends oo7 implements cp1 {

    /* renamed from: e */
    public final zo7 f37182e;

    /* renamed from: g */
    public final int f37183g;

    /* renamed from: k */
    public final byte[] f37184k;

    /* renamed from: r */
    public final byte[] f37185r;

    /* renamed from: cp7$b */
    public static class C6951b {

        /* renamed from: a */
        public final zo7 f37186a;

        /* renamed from: b */
        public byte[] f37187b = null;

        /* renamed from: c */
        public byte[] f37188c = null;

        /* renamed from: d */
        public byte[] f37189d = null;

        public C6951b(zo7 zo7) {
            this.f37186a = zo7;
        }

        /* renamed from: e */
        public cp7 mo50941e() {
            return new cp7(this);
        }

        /* renamed from: f */
        public C6951b mo50942f(byte[] bArr) {
            this.f37189d = dp7.m56993c(bArr);
            return this;
        }

        /* renamed from: g */
        public C6951b mo50943g(byte[] bArr) {
            this.f37188c = dp7.m56993c(bArr);
            return this;
        }

        /* renamed from: h */
        public C6951b mo50944h(byte[] bArr) {
            this.f37187b = dp7.m56993c(bArr);
            return this;
        }
    }

    public cp7(C6951b bVar) {
        super(false, bVar.f37186a.mo67370f());
        zo7 a = bVar.f37186a;
        this.f37182e = a;
        if (a != null) {
            int h = a.mo67372h();
            byte[] b = bVar.f37189d;
            if (b == null) {
                if (a.mo67369e() != null) {
                    this.f37183g = a.mo67369e().mo66669a();
                } else {
                    this.f37183g = 0;
                }
                byte[] c = bVar.f37187b;
                if (c == null) {
                    this.f37184k = new byte[h];
                } else if (c.length == h) {
                    this.f37184k = c;
                } else {
                    throw new IllegalArgumentException("length of root must be equal to length of digest");
                }
                byte[] d = bVar.f37188c;
                if (d == null) {
                    this.f37185r = new byte[h];
                } else if (d.length == h) {
                    this.f37185r = d;
                } else {
                    throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
                }
            } else if (b.length == h + h) {
                this.f37183g = 0;
                this.f37184k = dp7.m56997g(b, 0, h);
                this.f37185r = dp7.m56997g(b, h + 0, h);
            } else if (b.length == h + 4 + h) {
                this.f37183g = ek4.m57381a(b, 0);
                this.f37184k = dp7.m56997g(b, 4, h);
                this.f37185r = dp7.m56997g(b, 4 + h, h);
            } else {
                throw new IllegalArgumentException("public key has wrong size");
            }
        } else {
            throw new NullPointerException("params == null");
        }
    }

    /* renamed from: b */
    public zo7 mo50937b() {
        return this.f37182e;
    }

    /* renamed from: c */
    public byte[] mo50938c() {
        return dp7.m56993c(this.f37185r);
    }

    /* renamed from: d */
    public byte[] mo50939d() {
        return dp7.m56993c(this.f37184k);
    }

    /* renamed from: e */
    public byte[] mo50940e() {
        byte[] bArr;
        int h = this.f37182e.mo67372h();
        int i = this.f37183g;
        int i2 = 0;
        if (i != 0) {
            bArr = new byte[(h + 4 + h)];
            ek4.m57383c(i, bArr, 0);
            i2 = 4;
        } else {
            bArr = new byte[(h + h)];
        }
        dp7.m56995e(bArr, this.f37184k, i2);
        dp7.m56995e(bArr, this.f37185r, i2 + h);
        return bArr;
    }

    public byte[] getEncoded() throws IOException {
        return mo50940e();
    }
}
