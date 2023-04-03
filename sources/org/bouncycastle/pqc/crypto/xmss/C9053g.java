package org.bouncycastle.pqc.crypto.xmss;

import java.io.IOException;
import org.bouncycastle.pqc.crypto.xmss.C9046c;

/* renamed from: org.bouncycastle.pqc.crypto.xmss.g */
public final class C9053g extends oo7 implements cp1 {

    /* renamed from: e */
    public final zo7 f43833e;

    /* renamed from: g */
    public final byte[] f43834g;

    /* renamed from: k */
    public final byte[] f43835k;

    /* renamed from: r */
    public final byte[] f43836r;

    /* renamed from: s */
    public final byte[] f43837s;

    /* renamed from: x */
    public volatile BDS f43838x;

    /* renamed from: org.bouncycastle.pqc.crypto.xmss.g$b */
    public static class C9055b {

        /* renamed from: a */
        public final zo7 f43839a;

        /* renamed from: b */
        public int f43840b = 0;

        /* renamed from: c */
        public int f43841c = -1;

        /* renamed from: d */
        public byte[] f43842d = null;

        /* renamed from: e */
        public byte[] f43843e = null;

        /* renamed from: f */
        public byte[] f43844f = null;

        /* renamed from: g */
        public byte[] f43845g = null;

        /* renamed from: h */
        public BDS f43846h = null;

        /* renamed from: i */
        public byte[] f43847i = null;

        public C9055b(zo7 zo7) {
            this.f43839a = zo7;
        }

        /* renamed from: j */
        public C9053g mo64667j() {
            return new C9053g(this);
        }

        /* renamed from: k */
        public C9055b mo64668k(BDS bds) {
            this.f43846h = bds;
            return this;
        }

        /* renamed from: l */
        public C9055b mo64669l(int i) {
            this.f43840b = i;
            return this;
        }

        /* renamed from: m */
        public C9055b mo64670m(int i) {
            this.f43841c = i;
            return this;
        }

        /* renamed from: n */
        public C9055b mo64671n(byte[] bArr) {
            this.f43844f = dp7.m56993c(bArr);
            return this;
        }

        /* renamed from: o */
        public C9055b mo64672o(byte[] bArr) {
            this.f43845g = dp7.m56993c(bArr);
            return this;
        }

        /* renamed from: p */
        public C9055b mo64673p(byte[] bArr) {
            this.f43843e = dp7.m56993c(bArr);
            return this;
        }

        /* renamed from: q */
        public C9055b mo64674q(byte[] bArr) {
            this.f43842d = dp7.m56993c(bArr);
            return this;
        }
    }

    public C9053g(C9055b bVar) {
        super(true, bVar.f43839a.mo67370f());
        zo7 a = bVar.f43839a;
        this.f43833e = a;
        if (a != null) {
            int h = a.mo67372h();
            byte[] b = bVar.f43847i;
            if (b != null) {
                int b2 = a.mo67366b();
                int a2 = ek4.m57381a(b, 0);
                if (dp7.m57002l(b2, (long) a2)) {
                    this.f43834g = dp7.m56997g(b, 4, h);
                    int i = 4 + h;
                    this.f43835k = dp7.m56997g(b, i, h);
                    int i2 = i + h;
                    this.f43836r = dp7.m56997g(b, i2, h);
                    int i3 = i2 + h;
                    this.f43837s = dp7.m56997g(b, i3, h);
                    int i4 = i3 + h;
                    try {
                        BDS bds = (BDS) dp7.m56996f(dp7.m56997g(b, i4, b.length - i4), BDS.class);
                        if (bds.getIndex() == a2) {
                            this.f43838x = bds.withWOTSDigest(bVar.f43839a.mo67371g());
                            return;
                        }
                        throw new IllegalStateException("serialized BDS has wrong index");
                    } catch (IOException e) {
                        throw new IllegalArgumentException(e.getMessage(), e);
                    } catch (ClassNotFoundException e2) {
                        throw new IllegalArgumentException(e2.getMessage(), e2);
                    }
                } else {
                    throw new IllegalArgumentException("index out of bounds");
                }
            } else {
                byte[] c = bVar.f43842d;
                if (c == null) {
                    this.f43834g = new byte[h];
                } else if (c.length == h) {
                    this.f43834g = c;
                } else {
                    throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
                }
                byte[] d = bVar.f43843e;
                if (d == null) {
                    this.f43835k = new byte[h];
                } else if (d.length == h) {
                    this.f43835k = d;
                } else {
                    throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
                }
                byte[] e3 = bVar.f43844f;
                if (e3 == null) {
                    this.f43836r = new byte[h];
                } else if (e3.length == h) {
                    this.f43836r = e3;
                } else {
                    throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
                }
                byte[] f = bVar.f43845g;
                if (f == null) {
                    this.f43837s = new byte[h];
                } else if (f.length == h) {
                    this.f43837s = f;
                } else {
                    throw new IllegalArgumentException("size of root needs to be equal size of digest");
                }
                BDS g = bVar.f43846h;
                this.f43838x = g == null ? (bVar.f43840b >= (1 << a.mo67366b()) + -2 || e3 == null || c == null) ? new BDS(a, (1 << a.mo67366b()) - 1, bVar.f43840b) : new BDS(a, e3, c, (C9046c) new C9046c.C9048b().mo64643l(), bVar.f43840b) : g;
                if (bVar.f43841c >= 0 && bVar.f43841c != this.f43838x.getMaxIndex()) {
                    throw new IllegalArgumentException("maxIndex set but not reflected in state");
                }
            }
        } else {
            throw new NullPointerException("params == null");
        }
    }

    /* renamed from: b */
    public C9053g mo64662b(int i) {
        C9053g j;
        if (i >= 1) {
            synchronized (this) {
                long j2 = (long) i;
                if (j2 <= mo64665e()) {
                    j = new C9055b(this.f43833e).mo64674q(this.f43834g).mo64673p(this.f43835k).mo64671n(this.f43836r).mo64672o(this.f43837s).mo64669l(mo64663c()).mo64668k(this.f43838x.withMaxIndex((this.f43838x.getIndex() + i) - 1, this.f43833e.mo67371g())).mo64667j();
                    if (j2 == mo64665e()) {
                        this.f43838x = new BDS(this.f43833e, this.f43838x.getMaxIndex(), mo64663c() + i);
                    } else {
                        C9046c cVar = (C9046c) new C9046c.C9048b().mo64643l();
                        for (int i2 = 0; i2 != i; i2++) {
                            this.f43838x = this.f43838x.getNextState(this.f43836r, this.f43834g, cVar);
                        }
                    }
                } else {
                    throw new IllegalArgumentException("usageCount exceeds usages remaining");
                }
            }
            return j;
        }
        throw new IllegalArgumentException("cannot ask for a shard with 0 keys");
    }

    /* renamed from: c */
    public int mo64663c() {
        return this.f43838x.getIndex();
    }

    /* renamed from: d */
    public zo7 mo64664d() {
        return this.f43833e;
    }

    /* renamed from: e */
    public long mo64665e() {
        long maxIndex;
        synchronized (this) {
            maxIndex = (long) ((this.f43838x.getMaxIndex() - mo64663c()) + 1);
        }
        return maxIndex;
    }

    /* renamed from: f */
    public byte[] mo64666f() {
        byte[] j;
        synchronized (this) {
            int h = this.f43833e.mo67372h();
            byte[] bArr = new byte[(h + 4 + h + h + h)];
            ek4.m57383c(this.f43838x.getIndex(), bArr, 0);
            dp7.m56995e(bArr, this.f43834g, 4);
            int i = 4 + h;
            dp7.m56995e(bArr, this.f43835k, i);
            int i2 = i + h;
            dp7.m56995e(bArr, this.f43836r, i2);
            dp7.m56995e(bArr, this.f43837s, i2 + h);
            try {
                j = C9367tq.m72426j(bArr, dp7.m57006p(this.f43838x));
            } catch (IOException e) {
                throw new RuntimeException("error serializing bds state: " + e.getMessage());
            }
        }
        return j;
    }

    public byte[] getEncoded() throws IOException {
        byte[] f;
        synchronized (this) {
            f = mo64666f();
        }
        return f;
    }
}
