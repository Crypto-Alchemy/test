package com.p011rd;

import p000.e87;

/* renamed from: com.rd.a */
/* compiled from: IndicatorManager */
public class C5366a implements e87.C5755a {

    /* renamed from: a */
    public bj1 f26642a;

    /* renamed from: b */
    public C5739dl f26643b;

    /* renamed from: c */
    public C5367a f26644c;

    /* renamed from: com.rd.a$a */
    /* compiled from: IndicatorManager */
    public interface C5367a {
        /* renamed from: b */
        void mo39184b();
    }

    public C5366a(C5367a aVar) {
        this.f26644c = aVar;
        bj1 bj1 = new bj1();
        this.f26642a = bj1;
        this.f26643b = new C5739dl(bj1.mo29617b(), this);
    }

    /* renamed from: a */
    public void mo39246a(c87 c87) {
        this.f26642a.mo29622g(c87);
        C5367a aVar = this.f26644c;
        if (aVar != null) {
            aVar.mo39184b();
        }
    }

    /* renamed from: b */
    public C5739dl mo39247b() {
        return this.f26643b;
    }

    /* renamed from: c */
    public bj1 mo39248c() {
        return this.f26642a;
    }

    /* renamed from: d */
    public zt2 mo39249d() {
        return this.f26642a.mo29617b();
    }
}
