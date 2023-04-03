package p000;

import java.io.IOException;
import org.bouncycastle.pqc.crypto.xmss.BDSStateMap;

/* renamed from: vo7 */
public final class vo7 extends ro7 implements cp1 {

    /* renamed from: A */
    public volatile boolean f45342A;

    /* renamed from: e */
    public final to7 f45343e;

    /* renamed from: g */
    public final byte[] f45344g;

    /* renamed from: k */
    public final byte[] f45345k;

    /* renamed from: r */
    public final byte[] f45346r;

    /* renamed from: s */
    public final byte[] f45347s;

    /* renamed from: x */
    public volatile long f45348x;

    /* renamed from: y */
    public volatile BDSStateMap f45349y;

    /* renamed from: vo7$b */
    public static class C9465b {

        /* renamed from: a */
        public final to7 f45350a;

        /* renamed from: b */
        public long f45351b = 0;

        /* renamed from: c */
        public long f45352c = -1;

        /* renamed from: d */
        public byte[] f45353d = null;

        /* renamed from: e */
        public byte[] f45354e = null;

        /* renamed from: f */
        public byte[] f45355f = null;

        /* renamed from: g */
        public byte[] f45356g = null;

        /* renamed from: h */
        public BDSStateMap f45357h = null;

        /* renamed from: i */
        public byte[] f45358i = null;

        /* renamed from: j */
        public zo7 f45359j = null;

        public C9465b(to7 to7) {
            this.f45350a = to7;
        }

        /* renamed from: k */
        public vo7 mo66554k() {
            return new vo7(this);
        }

        /* renamed from: l */
        public C9465b mo66555l(BDSStateMap bDSStateMap) {
            if (bDSStateMap.getMaxIndex() == 0) {
                this.f45357h = new BDSStateMap(bDSStateMap, (1 << this.f45350a.mo66102a()) - 1);
            } else {
                this.f45357h = bDSStateMap;
            }
            return this;
        }

        /* renamed from: m */
        public C9465b mo66556m(long j) {
            this.f45351b = j;
            return this;
        }

        /* renamed from: n */
        public C9465b mo66557n(long j) {
            this.f45352c = j;
            return this;
        }

        /* renamed from: o */
        public C9465b mo66558o(byte[] bArr) {
            this.f45355f = dp7.m56993c(bArr);
            return this;
        }

        /* renamed from: p */
        public C9465b mo66559p(byte[] bArr) {
            this.f45356g = dp7.m56993c(bArr);
            return this;
        }

        /* renamed from: q */
        public C9465b mo66560q(byte[] bArr) {
            this.f45354e = dp7.m56993c(bArr);
            return this;
        }

        /* renamed from: r */
        public C9465b mo66561r(byte[] bArr) {
            this.f45353d = dp7.m56993c(bArr);
            return this;
        }
    }

    public vo7(C9465b bVar) {
        super(true, bVar.f45350a.mo66106e());
        to7 a = bVar.f45350a;
        this.f45343e = a;
        if (a != null) {
            int f = a.mo66107f();
            byte[] b = bVar.f45358i;
            if (b == null) {
                this.f45348x = bVar.f45351b;
                byte[] e = bVar.f45353d;
                if (e == null) {
                    this.f45344g = new byte[f];
                } else if (e.length == f) {
                    this.f45344g = e;
                } else {
                    throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
                }
                byte[] f2 = bVar.f45354e;
                if (f2 == null) {
                    this.f45345k = new byte[f];
                } else if (f2.length == f) {
                    this.f45345k = f2;
                } else {
                    throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
                }
                byte[] g = bVar.f45355f;
                if (g == null) {
                    this.f45346r = new byte[f];
                } else if (g.length == f) {
                    this.f45346r = g;
                } else {
                    throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
                }
                byte[] h = bVar.f45356g;
                if (h == null) {
                    this.f45347s = new byte[f];
                } else if (h.length == f) {
                    this.f45347s = h;
                } else {
                    throw new IllegalArgumentException("size of root needs to be equal size of digest");
                }
                BDSStateMap i = bVar.f45357h;
                if (i == null) {
                    i = (!dp7.m57002l(a.mo66102a(), bVar.f45351b) || g == null || e == null) ? new BDSStateMap(bVar.f45352c + 1) : new BDSStateMap(a, bVar.f45351b, g, e);
                }
                this.f45349y = i;
                if (bVar.f45352c >= 0 && bVar.f45352c != this.f45349y.getMaxIndex()) {
                    throw new IllegalArgumentException("maxIndex set but not reflected in state");
                }
            } else if (bVar.f45359j != null) {
                int a2 = a.mo66102a();
                int i2 = (a2 + 7) / 8;
                this.f45348x = dp7.m56991a(b, 0, i2);
                if (dp7.m57002l(a2, this.f45348x)) {
                    int i3 = i2 + 0;
                    this.f45344g = dp7.m56997g(b, i3, f);
                    int i4 = i3 + f;
                    this.f45345k = dp7.m56997g(b, i4, f);
                    int i5 = i4 + f;
                    this.f45346r = dp7.m56997g(b, i5, f);
                    int i6 = i5 + f;
                    this.f45347s = dp7.m56997g(b, i6, f);
                    int i7 = i6 + f;
                    try {
                        this.f45349y = ((BDSStateMap) dp7.m56996f(dp7.m56997g(b, i7, b.length - i7), BDSStateMap.class)).withWOTSDigest(bVar.f45359j.mo67371g());
                    } catch (IOException e2) {
                        throw new IllegalArgumentException(e2.getMessage(), e2);
                    } catch (ClassNotFoundException e3) {
                        throw new IllegalArgumentException(e3.getMessage(), e3);
                    }
                } else {
                    throw new IllegalArgumentException("index out of bounds");
                }
            } else {
                throw new NullPointerException("xmss == null");
            }
        } else {
            throw new NullPointerException("params == null");
        }
    }

    /* renamed from: b */
    public vo7 mo66548b(int i) {
        vo7 k;
        if (i >= 1) {
            synchronized (this) {
                long j = (long) i;
                if (j <= mo66551e()) {
                    k = new C9465b(this.f45343e).mo66561r(this.f45344g).mo66560q(this.f45345k).mo66558o(this.f45346r).mo66559p(this.f45347s).mo66556m(mo66549c()).mo66555l(new BDSStateMap(this.f45349y, (mo66549c() + j) - 1)).mo66554k();
                    for (int i2 = 0; i2 != i; i2++) {
                        mo66552f();
                    }
                } else {
                    throw new IllegalArgumentException("usageCount exceeds usages remaining");
                }
            }
            return k;
        }
        throw new IllegalArgumentException("cannot ask for a shard with 0 keys");
    }

    /* renamed from: c */
    public long mo66549c() {
        return this.f45348x;
    }

    /* renamed from: d */
    public to7 mo66550d() {
        return this.f45343e;
    }

    /* renamed from: e */
    public long mo66551e() {
        long maxIndex;
        synchronized (this) {
            maxIndex = (this.f45349y.getMaxIndex() - mo66549c()) + 1;
        }
        return maxIndex;
    }

    /* renamed from: f */
    public vo7 mo66552f() {
        synchronized (this) {
            if (mo66549c() < this.f45349y.getMaxIndex()) {
                this.f45349y.updateState(this.f45343e, this.f45348x, this.f45346r, this.f45344g);
                this.f45348x++;
            } else {
                this.f45348x = this.f45349y.getMaxIndex() + 1;
                this.f45349y = new BDSStateMap(this.f45349y.getMaxIndex());
            }
            this.f45342A = false;
        }
        return this;
    }

    /* renamed from: g */
    public byte[] mo66553g() {
        byte[] j;
        synchronized (this) {
            int f = this.f45343e.mo66107f();
            int a = (this.f45343e.mo66102a() + 7) / 8;
            byte[] bArr = new byte[(a + f + f + f + f)];
            dp7.m56995e(bArr, dp7.m57007q(this.f45348x, a), 0);
            int i = a + 0;
            dp7.m56995e(bArr, this.f45344g, i);
            int i2 = i + f;
            dp7.m56995e(bArr, this.f45345k, i2);
            int i3 = i2 + f;
            dp7.m56995e(bArr, this.f45346r, i3);
            dp7.m56995e(bArr, this.f45347s, i3 + f);
            try {
                j = C9367tq.m72426j(bArr, dp7.m57006p(this.f45349y));
            } catch (IOException e) {
                throw new IllegalStateException("error serializing bds state: " + e.getMessage(), e);
            }
        }
        return j;
    }

    public byte[] getEncoded() throws IOException {
        byte[] g;
        synchronized (this) {
            g = mo66553g();
        }
        return g;
    }
}
