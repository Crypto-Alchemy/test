package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.pqc.crypto.xmss.C9050e;

/* renamed from: org.bouncycastle.pqc.crypto.xmss.b */
public final class C9043b extends C9050e {

    /* renamed from: e */
    public final int f43809e;

    /* renamed from: f */
    public final int f43810f;

    /* renamed from: g */
    public final int f43811g;

    /* renamed from: org.bouncycastle.pqc.crypto.xmss.b$b */
    public static class C9045b extends C9050e.C9051a<C9045b> {

        /* renamed from: e */
        public int f43812e = 0;

        /* renamed from: f */
        public int f43813f = 0;

        /* renamed from: g */
        public int f43814g = 0;

        public C9045b() {
            super(1);
        }

        /* renamed from: l */
        public C9050e mo64635l() {
            return new C9043b(this);
        }

        /* renamed from: m */
        public C9045b mo64627e() {
            return this;
        }

        /* renamed from: n */
        public C9045b mo64637n(int i) {
            this.f43812e = i;
            return this;
        }

        /* renamed from: o */
        public C9045b mo64638o(int i) {
            this.f43813f = i;
            return this;
        }

        /* renamed from: p */
        public C9045b mo64639p(int i) {
            this.f43814g = i;
            return this;
        }
    }

    public C9043b(C9045b bVar) {
        super(bVar);
        this.f43809e = bVar.f43812e;
        this.f43810f = bVar.f43813f;
        this.f43811g = bVar.f43814g;
    }

    /* renamed from: d */
    public byte[] mo64624d() {
        byte[] d = super.mo64624d();
        ek4.m57383c(this.f43809e, d, 16);
        ek4.m57383c(this.f43810f, d, 20);
        ek4.m57383c(this.f43811g, d, 24);
        return d;
    }

    /* renamed from: e */
    public int mo64632e() {
        return this.f43809e;
    }

    /* renamed from: f */
    public int mo64633f() {
        return this.f43810f;
    }

    /* renamed from: g */
    public int mo64634g() {
        return this.f43811g;
    }
}
