package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.pqc.crypto.xmss.C9050e;

/* renamed from: org.bouncycastle.pqc.crypto.xmss.c */
public final class C9046c extends C9050e {

    /* renamed from: e */
    public final int f43815e;

    /* renamed from: f */
    public final int f43816f;

    /* renamed from: g */
    public final int f43817g;

    /* renamed from: org.bouncycastle.pqc.crypto.xmss.c$b */
    public static class C9048b extends C9050e.C9051a<C9048b> {

        /* renamed from: e */
        public int f43818e = 0;

        /* renamed from: f */
        public int f43819f = 0;

        /* renamed from: g */
        public int f43820g = 0;

        public C9048b() {
            super(0);
        }

        /* renamed from: l */
        public C9050e mo64643l() {
            return new C9046c(this);
        }

        /* renamed from: m */
        public C9048b mo64627e() {
            return this;
        }

        /* renamed from: n */
        public C9048b mo64645n(int i) {
            this.f43819f = i;
            return this;
        }

        /* renamed from: o */
        public C9048b mo64646o(int i) {
            this.f43820g = i;
            return this;
        }

        /* renamed from: p */
        public C9048b mo64647p(int i) {
            this.f43818e = i;
            return this;
        }
    }

    public C9046c(C9048b bVar) {
        super(bVar);
        this.f43815e = bVar.f43818e;
        this.f43816f = bVar.f43819f;
        this.f43817g = bVar.f43820g;
    }

    /* renamed from: d */
    public byte[] mo64624d() {
        byte[] d = super.mo64624d();
        ek4.m57383c(this.f43815e, d, 16);
        ek4.m57383c(this.f43816f, d, 20);
        ek4.m57383c(this.f43817g, d, 24);
        return d;
    }

    /* renamed from: e */
    public int mo64640e() {
        return this.f43816f;
    }

    /* renamed from: f */
    public int mo64641f() {
        return this.f43817g;
    }

    /* renamed from: g */
    public int mo64642g() {
        return this.f43815e;
    }
}
