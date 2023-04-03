package p000;

/* renamed from: az */
/* compiled from: BaseNCodec */
public abstract class C3869az {
    @Deprecated

    /* renamed from: a */
    public final byte f21079a;

    /* renamed from: b */
    public final byte f21080b;

    /* renamed from: c */
    public final int f21081c;

    /* renamed from: d */
    public final int f21082d;

    /* renamed from: e */
    public final int f21083e;

    /* renamed from: f */
    public final int f21084f;

    /* renamed from: az$a */
    /* compiled from: BaseNCodec */
    public static class C3870a {

        /* renamed from: a */
        public int f21085a;

        /* renamed from: b */
        public long f21086b;

        /* renamed from: c */
        public byte[] f21087c;

        /* renamed from: d */
        public int f21088d;

        /* renamed from: e */
        public int f21089e;

        /* renamed from: f */
        public boolean f21090f;

        /* renamed from: g */
        public int f21091g;

        /* renamed from: h */
        public int f21092h;
    }

    public C3869az(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, (byte) 61);
    }

    /* renamed from: j */
    public static boolean m32299j(byte b) {
        return b == 9 || b == 10 || b == 13 || b == 32;
    }

    /* renamed from: a */
    public int mo29390a(C3870a aVar) {
        if (aVar.f21087c != null) {
            return aVar.f21088d - aVar.f21089e;
        }
        return 0;
    }

    /* renamed from: b */
    public boolean mo29391b(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (this.f21080b == b || mo29398i(b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public abstract void mo29392c(byte[] bArr, int i, int i2, C3870a aVar);

    /* renamed from: d */
    public byte[] mo29393d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        return mo29394e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public byte[] mo29394e(byte[] bArr, int i, int i2) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        C3870a aVar = new C3870a();
        mo29392c(bArr, i, i2, aVar);
        mo29392c(bArr, i, -1, aVar);
        int i3 = aVar.f21088d - aVar.f21089e;
        byte[] bArr2 = new byte[i3];
        mo29399k(bArr2, 0, i3, aVar);
        return bArr2;
    }

    /* renamed from: f */
    public byte[] mo29395f(int i, C3870a aVar) {
        byte[] bArr = aVar.f21087c;
        if (bArr == null || bArr.length < aVar.f21088d + i) {
            return mo29400l(aVar);
        }
        return bArr;
    }

    /* renamed from: g */
    public int mo29396g() {
        return 8192;
    }

    /* renamed from: h */
    public long mo29397h(byte[] bArr) {
        int length = bArr.length;
        int i = this.f21081c;
        long j = ((long) (((length + i) - 1) / i)) * ((long) this.f21082d);
        int i2 = this.f21083e;
        if (i2 > 0) {
            return j + ((((((long) i2) + j) - 1) / ((long) i2)) * ((long) this.f21084f));
        }
        return j;
    }

    /* renamed from: i */
    public abstract boolean mo29398i(byte b);

    /* renamed from: k */
    public int mo29399k(byte[] bArr, int i, int i2, C3870a aVar) {
        if (aVar.f21087c != null) {
            int min = Math.min(mo29390a(aVar), i2);
            System.arraycopy(aVar.f21087c, aVar.f21089e, bArr, i, min);
            int i3 = aVar.f21089e + min;
            aVar.f21089e = i3;
            if (i3 >= aVar.f21088d) {
                aVar.f21087c = null;
            }
            return min;
        } else if (aVar.f21090f) {
            return -1;
        } else {
            return 0;
        }
    }

    /* renamed from: l */
    public final byte[] mo29400l(C3870a aVar) {
        byte[] bArr = aVar.f21087c;
        if (bArr == null) {
            aVar.f21087c = new byte[mo29396g()];
            aVar.f21088d = 0;
            aVar.f21089e = 0;
        } else {
            byte[] bArr2 = new byte[(bArr.length * 2)];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            aVar.f21087c = bArr2;
        }
        return aVar.f21087c;
    }

    public C3869az(int i, int i2, int i3, int i4, byte b) {
        this.f21079a = 61;
        this.f21081c = i;
        this.f21082d = i2;
        this.f21083e = i3 > 0 && i4 > 0 ? (i3 / i2) * i2 : 0;
        this.f21084f = i4;
        this.f21080b = b;
    }
}
