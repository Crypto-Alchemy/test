package com.google.android.play.core.assetpacks;

import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.assetpacks.l */
public final class C4480l {

    /* renamed from: a */
    public final C4469b f24754a;

    /* renamed from: b */
    public final rt7<yw7> f24755b;

    /* renamed from: c */
    public final C4477i f24756c;

    /* renamed from: d */
    public final rt7<Executor> f24757d;

    /* renamed from: e */
    public final rs7 f24758e;

    /* renamed from: f */
    public final cq7 f24759f;

    public C4480l(C4469b bVar, rt7<yw7> rt7, C4477i iVar, rt7<Executor> rt72, rs7 rs7, cq7 cq7) {
        this.f24754a = bVar;
        this.f24755b = rt7;
        this.f24756c = iVar;
        this.f24757d = rt72;
        this.f24758e = rs7;
        this.f24759f = cq7;
    }

    /* renamed from: a */
    public final void mo34224a(hu7 hu7) {
        Runnable runnable;
        Executor executor;
        File x = this.f24754a.mo34182x(hu7.f34708b, hu7.f29736c, hu7.f29737d);
        File D = this.f24754a.mo34156D(hu7.f34708b, hu7.f29736c, hu7.f29737d);
        if (!x.exists() || !D.exists()) {
            throw new C4470bj(String.format("Cannot find pack files to move for pack %s.", new Object[]{hu7.f34708b}), hu7.f34707a);
        }
        File t = this.f24754a.mo34178t(hu7.f34708b, hu7.f29736c, hu7.f29737d);
        t.mkdirs();
        if (x.renameTo(t)) {
            new File(this.f24754a.mo34178t(hu7.f34708b, hu7.f29736c, hu7.f29737d), "merge.tmp").delete();
            File u = this.f24754a.mo34179u(hu7.f34708b, hu7.f29736c, hu7.f29737d);
            u.mkdirs();
            if (D.renameTo(u)) {
                if (this.f24759f.mo41632a()) {
                    executor = this.f24757d.mo47486a();
                    runnable = new iu7(this, hu7);
                } else {
                    executor = this.f24757d.mo47486a();
                    C4469b bVar = this.f24754a;
                    bVar.getClass();
                    runnable = ju7.m46771a(bVar);
                }
                executor.execute(runnable);
                this.f24756c.mo34208f(hu7.f34708b, hu7.f29736c, hu7.f29737d);
                this.f24758e.mo47475a(hu7.f34708b);
                this.f24755b.mo47486a().mo29744d(hu7.f34707a, hu7.f34708b);
                return;
            }
            throw new C4470bj("Cannot move metadata files to final location.", hu7.f34707a);
        }
        throw new C4470bj("Cannot move merged pack files to final location.", hu7.f34707a);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo34225b(hu7 hu7) {
        this.f24754a.mo34157E(hu7.f34708b, hu7.f29736c, hu7.f29737d);
    }
}
