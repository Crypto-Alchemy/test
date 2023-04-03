package com.google.android.play.core.assetpacks;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.play.core.assetpacks.g */
public final class C4475g {

    /* renamed from: j */
    public static final pq7 f24729j = new pq7("ExtractorLooper");

    /* renamed from: a */
    public final C4477i f24730a;

    /* renamed from: b */
    public final C4474f f24731b;

    /* renamed from: c */
    public final C4484p f24732c;

    /* renamed from: d */
    public final C4479k f24733d;

    /* renamed from: e */
    public final C4480l f24734e;

    /* renamed from: f */
    public final C4481m f24735f;

    /* renamed from: g */
    public final rt7<yw7> f24736g;

    /* renamed from: h */
    public final C4478j f24737h;

    /* renamed from: i */
    public final AtomicBoolean f24738i = new AtomicBoolean(false);

    public C4475g(C4477i iVar, rt7<yw7> rt7, C4474f fVar, C4484p pVar, C4479k kVar, C4480l lVar, C4481m mVar, C4478j jVar) {
        this.f24730a = iVar;
        this.f24736g = rt7;
        this.f24731b = fVar;
        this.f24732c = pVar;
        this.f24733d = kVar;
        this.f24734e = lVar;
        this.f24735f = mVar;
        this.f24737h = jVar;
    }

    /* renamed from: a */
    public final void mo34200a() {
        pq7 pq7 = f24729j;
        pq7.mo46852a("Run extractor loop", new Object[0]);
        if (this.f24738i.compareAndSet(false, true)) {
            while (true) {
                ut7 ut7 = null;
                try {
                    ut7 = this.f24737h.mo34221a();
                } catch (C4470bj e) {
                    f24729j.mo46853b("Error while getting next extraction task: %s", e.getMessage());
                    if (e.f24713a >= 0) {
                        this.f24736g.mo47486a().mo29742b(e.f24713a);
                        mo34201b(e.f24713a, e);
                    }
                }
                if (ut7 != null) {
                    try {
                        if (ut7 instanceof os7) {
                            this.f24731b.mo34198a((os7) ut7);
                        } else if (ut7 instanceof uu7) {
                            this.f24732c.mo34242a((uu7) ut7);
                        } else if (ut7 instanceof fu7) {
                            this.f24733d.mo34223a((fu7) ut7);
                        } else if (ut7 instanceof hu7) {
                            this.f24734e.mo34224a((hu7) ut7);
                        } else if (ut7 instanceof mu7) {
                            this.f24735f.mo34226a((mu7) ut7);
                        } else {
                            f24729j.mo46853b("Unknown task type: %s", ut7.getClass().getName());
                        }
                    } catch (Exception e2) {
                        f24729j.mo46853b("Error during extraction task: %s", e2.getMessage());
                        this.f24736g.mo47486a().mo29742b(ut7.f34707a);
                        mo34201b(ut7.f34707a, e2);
                    }
                } else {
                    this.f24738i.set(false);
                    return;
                }
            }
        } else {
            pq7.mo46856e("runLoop already looping; return", new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo34201b(int i, Exception exc) {
        try {
            this.f24730a.mo34217o(i);
            this.f24730a.mo34209g(i);
        } catch (C4470bj unused) {
            f24729j.mo46853b("Error during error handling: %s", exc.getMessage());
        }
    }
}
