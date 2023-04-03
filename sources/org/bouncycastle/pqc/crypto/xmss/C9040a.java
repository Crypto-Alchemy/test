package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.pqc.crypto.xmss.C9050e;

/* renamed from: org.bouncycastle.pqc.crypto.xmss.a */
public final class C9040a extends C9050e {

    /* renamed from: e */
    public final int f43804e;

    /* renamed from: f */
    public final int f43805f;

    /* renamed from: g */
    public final int f43806g;

    /* renamed from: org.bouncycastle.pqc.crypto.xmss.a$b */
    public static class C9042b extends C9050e.C9051a<C9042b> {

        /* renamed from: e */
        public int f43807e = 0;

        /* renamed from: f */
        public int f43808f = 0;

        public C9042b() {
            super(2);
        }

        /* renamed from: k */
        public C9050e mo64628k() {
            return new C9040a(this);
        }

        /* renamed from: l */
        public C9042b mo64627e() {
            return this;
        }

        /* renamed from: m */
        public C9042b mo64630m(int i) {
            this.f43807e = i;
            return this;
        }

        /* renamed from: n */
        public C9042b mo64631n(int i) {
            this.f43808f = i;
            return this;
        }
    }

    public C9040a(C9042b bVar) {
        super(bVar);
        this.f43804e = 0;
        this.f43805f = bVar.f43807e;
        this.f43806g = bVar.f43808f;
    }

    /* renamed from: d */
    public byte[] mo64624d() {
        byte[] d = super.mo64624d();
        ek4.m57383c(this.f43804e, d, 16);
        ek4.m57383c(this.f43805f, d, 20);
        ek4.m57383c(this.f43806g, d, 24);
        return d;
    }

    /* renamed from: e */
    public int mo64625e() {
        return this.f43805f;
    }

    /* renamed from: f */
    public int mo64626f() {
        return this.f43806g;
    }
}
