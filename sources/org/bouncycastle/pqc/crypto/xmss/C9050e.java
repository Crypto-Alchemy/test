package org.bouncycastle.pqc.crypto.xmss;

/* renamed from: org.bouncycastle.pqc.crypto.xmss.e */
public abstract class C9050e {

    /* renamed from: a */
    public final int f43825a;

    /* renamed from: b */
    public final long f43826b;

    /* renamed from: c */
    public final int f43827c;

    /* renamed from: d */
    public final int f43828d;

    /* renamed from: org.bouncycastle.pqc.crypto.xmss.e$a */
    public static abstract class C9051a<T extends C9051a> {

        /* renamed from: a */
        public final int f43829a;

        /* renamed from: b */
        public int f43830b = 0;

        /* renamed from: c */
        public long f43831c = 0;

        /* renamed from: d */
        public int f43832d = 0;

        public C9051a(int i) {
            this.f43829a = i;
        }

        /* renamed from: e */
        public abstract T mo64627e();

        /* renamed from: f */
        public T mo64659f(int i) {
            this.f43832d = i;
            return mo64627e();
        }

        /* renamed from: g */
        public T mo64660g(int i) {
            this.f43830b = i;
            return mo64627e();
        }

        /* renamed from: h */
        public T mo64661h(long j) {
            this.f43831c = j;
            return mo64627e();
        }
    }

    public C9050e(C9051a aVar) {
        this.f43825a = aVar.f43830b;
        this.f43826b = aVar.f43831c;
        this.f43827c = aVar.f43829a;
        this.f43828d = aVar.f43832d;
    }

    /* renamed from: a */
    public final int mo64656a() {
        return this.f43828d;
    }

    /* renamed from: b */
    public final int mo64657b() {
        return this.f43825a;
    }

    /* renamed from: c */
    public final long mo64658c() {
        return this.f43826b;
    }

    /* renamed from: d */
    public byte[] mo64624d() {
        byte[] bArr = new byte[32];
        ek4.m57383c(this.f43825a, bArr, 0);
        ek4.m57392l(this.f43826b, bArr, 4);
        ek4.m57383c(this.f43827c, bArr, 12);
        ek4.m57383c(this.f43828d, bArr, 28);
        return bArr;
    }
}
