package p000;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: ca */
/* compiled from: ActivityFragmentLifecycle */
public class C1672ca implements lg3 {

    /* renamed from: a */
    public final Set<sg3> f8372a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public boolean f8373b;

    /* renamed from: c */
    public boolean f8374c;

    /* renamed from: a */
    public void mo12019a(sg3 sg3) {
        this.f8372a.add(sg3);
        if (this.f8374c) {
            sg3.mo20968c();
        } else if (this.f8373b) {
            sg3.mo19468b();
        } else {
            sg3.mo19473n();
        }
    }

    /* renamed from: b */
    public void mo12020b(sg3 sg3) {
        this.f8372a.remove(sg3);
    }

    /* renamed from: c */
    public void mo12021c() {
        this.f8374c = true;
        for (T c : p67.m24682j(this.f8372a)) {
            c.mo20968c();
        }
    }

    /* renamed from: d */
    public void mo12022d() {
        this.f8373b = true;
        for (T b : p67.m24682j(this.f8372a)) {
            b.mo19468b();
        }
    }

    /* renamed from: e */
    public void mo12023e() {
        this.f8373b = false;
        for (T n : p67.m24682j(this.f8372a)) {
            n.mo19473n();
        }
    }
}
