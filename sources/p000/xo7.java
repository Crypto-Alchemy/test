package p000;

import java.io.IOException;

/* renamed from: xo7 */
public final class xo7 extends ro7 implements cp1 {

    /* renamed from: e */
    public final to7 f45992e;

    /* renamed from: g */
    public final int f45993g;

    /* renamed from: k */
    public final byte[] f45994k;

    /* renamed from: r */
    public final byte[] f45995r;

    /* renamed from: xo7$b */
    public static class C9607b {

        /* renamed from: a */
        public final to7 f45996a;

        /* renamed from: b */
        public byte[] f45997b = null;

        /* renamed from: c */
        public byte[] f45998c = null;

        /* renamed from: d */
        public byte[] f45999d = null;

        public C9607b(to7 to7) {
            this.f45996a = to7;
        }

        /* renamed from: e */
        public xo7 mo66912e() {
            return new xo7(this);
        }

        /* renamed from: f */
        public C9607b mo66913f(byte[] bArr) {
            this.f45999d = dp7.m56993c(bArr);
            return this;
        }

        /* renamed from: g */
        public C9607b mo66914g(byte[] bArr) {
            this.f45998c = dp7.m56993c(bArr);
            return this;
        }

        /* renamed from: h */
        public C9607b mo66915h(byte[] bArr) {
            this.f45997b = dp7.m56993c(bArr);
            return this;
        }
    }

    public xo7(C9607b bVar) {
        super(false, bVar.f45996a.mo66106e());
        to7 a = bVar.f45996a;
        this.f45992e = a;
        if (a != null) {
            int f = a.mo66107f();
            byte[] b = bVar.f45999d;
            if (b == null) {
                if (a.mo66105d() != null) {
                    this.f45993g = a.mo66105d().mo66669a();
                } else {
                    this.f45993g = 0;
                }
                byte[] c = bVar.f45997b;
                if (c == null) {
                    this.f45994k = new byte[f];
                } else if (c.length == f) {
                    this.f45994k = c;
                } else {
                    throw new IllegalArgumentException("length of root must be equal to length of digest");
                }
                byte[] d = bVar.f45998c;
                if (d == null) {
                    this.f45995r = new byte[f];
                } else if (d.length == f) {
                    this.f45995r = d;
                } else {
                    throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
                }
            } else if (b.length == f + f) {
                this.f45993g = 0;
                this.f45994k = dp7.m56997g(b, 0, f);
                this.f45995r = dp7.m56997g(b, f + 0, f);
            } else if (b.length == f + 4 + f) {
                this.f45993g = ek4.m57381a(b, 0);
                this.f45994k = dp7.m56997g(b, 4, f);
                this.f45995r = dp7.m56997g(b, 4 + f, f);
            } else {
                throw new IllegalArgumentException("public key has wrong size");
            }
        } else {
            throw new NullPointerException("params == null");
        }
    }

    /* renamed from: b */
    public to7 mo66908b() {
        return this.f45992e;
    }

    /* renamed from: c */
    public byte[] mo66909c() {
        return dp7.m56993c(this.f45995r);
    }

    /* renamed from: d */
    public byte[] mo66910d() {
        return dp7.m56993c(this.f45994k);
    }

    /* renamed from: e */
    public byte[] mo66911e() {
        byte[] bArr;
        int f = this.f45992e.mo66107f();
        int i = this.f45993g;
        int i2 = 0;
        if (i != 0) {
            bArr = new byte[(f + 4 + f)];
            ek4.m57383c(i, bArr, 0);
            i2 = 4;
        } else {
            bArr = new byte[(f + f)];
        }
        dp7.m56995e(bArr, this.f45994k, i2);
        dp7.m56995e(bArr, this.f45995r, i2 + f);
        return bArr;
    }

    public byte[] getEncoded() throws IOException {
        return mo66911e();
    }
}
