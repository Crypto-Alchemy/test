package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.fragment.app.g */
/* compiled from: FragmentLifecycleCallbacksDispatcher */
public class C0678g {

    /* renamed from: a */
    public final CopyOnWriteArrayList<C0679a> f3840a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public final FragmentManager f3841b;

    /* renamed from: androidx.fragment.app.g$a */
    /* compiled from: FragmentLifecycleCallbacksDispatcher */
    public static final class C0679a {

        /* renamed from: a */
        public final FragmentManager.C0642k f3842a;

        /* renamed from: b */
        public final boolean f3843b;

        public C0679a(FragmentManager.C0642k kVar, boolean z) {
            this.f3842a = kVar;
            this.f3843b = z;
        }
    }

    public C0678g(FragmentManager fragmentManager) {
        this.f3841b = fragmentManager;
    }

    /* renamed from: a */
    public void mo6193a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment A0 = this.f3841b.mo5913A0();
        if (A0 != null) {
            A0.getParentFragmentManager().mo6024z0().mo6193a(fragment, bundle, true);
        }
        Iterator<C0679a> it = this.f3840a.iterator();
        while (it.hasNext()) {
            C0679a next = it.next();
            if (!z || next.f3843b) {
                next.f3842a.mo6048a(this.f3841b, fragment, bundle);
            }
        }
    }

    /* renamed from: b */
    public void mo6194b(Fragment fragment, boolean z) {
        Context f = this.f3841b.mo6018x0().mo6184f();
        Fragment A0 = this.f3841b.mo5913A0();
        if (A0 != null) {
            A0.getParentFragmentManager().mo6024z0().mo6194b(fragment, true);
        }
        Iterator<C0679a> it = this.f3840a.iterator();
        while (it.hasNext()) {
            C0679a next = it.next();
            if (!z || next.f3843b) {
                next.f3842a.mo6049b(this.f3841b, fragment, f);
            }
        }
    }

    /* renamed from: c */
    public void mo6195c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment A0 = this.f3841b.mo5913A0();
        if (A0 != null) {
            A0.getParentFragmentManager().mo6024z0().mo6195c(fragment, bundle, true);
        }
        Iterator<C0679a> it = this.f3840a.iterator();
        while (it.hasNext()) {
            C0679a next = it.next();
            if (!z || next.f3843b) {
                next.f3842a.mo6050c(this.f3841b, fragment, bundle);
            }
        }
    }

    /* renamed from: d */
    public void mo6196d(Fragment fragment, boolean z) {
        Fragment A0 = this.f3841b.mo5913A0();
        if (A0 != null) {
            A0.getParentFragmentManager().mo6024z0().mo6196d(fragment, true);
        }
        Iterator<C0679a> it = this.f3840a.iterator();
        while (it.hasNext()) {
            C0679a next = it.next();
            if (!z || next.f3843b) {
                next.f3842a.mo6051d(this.f3841b, fragment);
            }
        }
    }

    /* renamed from: e */
    public void mo6197e(Fragment fragment, boolean z) {
        Fragment A0 = this.f3841b.mo5913A0();
        if (A0 != null) {
            A0.getParentFragmentManager().mo6024z0().mo6197e(fragment, true);
        }
        Iterator<C0679a> it = this.f3840a.iterator();
        while (it.hasNext()) {
            C0679a next = it.next();
            if (!z || next.f3843b) {
                next.f3842a.mo6052e(this.f3841b, fragment);
            }
        }
    }

    /* renamed from: f */
    public void mo6198f(Fragment fragment, boolean z) {
        Fragment A0 = this.f3841b.mo5913A0();
        if (A0 != null) {
            A0.getParentFragmentManager().mo6024z0().mo6198f(fragment, true);
        }
        Iterator<C0679a> it = this.f3840a.iterator();
        while (it.hasNext()) {
            C0679a next = it.next();
            if (!z || next.f3843b) {
                next.f3842a.mo6053f(this.f3841b, fragment);
            }
        }
    }

    /* renamed from: g */
    public void mo6199g(Fragment fragment, boolean z) {
        Context f = this.f3841b.mo6018x0().mo6184f();
        Fragment A0 = this.f3841b.mo5913A0();
        if (A0 != null) {
            A0.getParentFragmentManager().mo6024z0().mo6199g(fragment, true);
        }
        Iterator<C0679a> it = this.f3840a.iterator();
        while (it.hasNext()) {
            C0679a next = it.next();
            if (!z || next.f3843b) {
                next.f3842a.mo6054g(this.f3841b, fragment, f);
            }
        }
    }

    /* renamed from: h */
    public void mo6200h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment A0 = this.f3841b.mo5913A0();
        if (A0 != null) {
            A0.getParentFragmentManager().mo6024z0().mo6200h(fragment, bundle, true);
        }
        Iterator<C0679a> it = this.f3840a.iterator();
        while (it.hasNext()) {
            C0679a next = it.next();
            if (!z || next.f3843b) {
                next.f3842a.mo6055h(this.f3841b, fragment, bundle);
            }
        }
    }

    /* renamed from: i */
    public void mo6201i(Fragment fragment, boolean z) {
        Fragment A0 = this.f3841b.mo5913A0();
        if (A0 != null) {
            A0.getParentFragmentManager().mo6024z0().mo6201i(fragment, true);
        }
        Iterator<C0679a> it = this.f3840a.iterator();
        while (it.hasNext()) {
            C0679a next = it.next();
            if (!z || next.f3843b) {
                next.f3842a.mo6056i(this.f3841b, fragment);
            }
        }
    }

    /* renamed from: j */
    public void mo6202j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment A0 = this.f3841b.mo5913A0();
        if (A0 != null) {
            A0.getParentFragmentManager().mo6024z0().mo6202j(fragment, bundle, true);
        }
        Iterator<C0679a> it = this.f3840a.iterator();
        while (it.hasNext()) {
            C0679a next = it.next();
            if (!z || next.f3843b) {
                next.f3842a.mo6057j(this.f3841b, fragment, bundle);
            }
        }
    }

    /* renamed from: k */
    public void mo6203k(Fragment fragment, boolean z) {
        Fragment A0 = this.f3841b.mo5913A0();
        if (A0 != null) {
            A0.getParentFragmentManager().mo6024z0().mo6203k(fragment, true);
        }
        Iterator<C0679a> it = this.f3840a.iterator();
        while (it.hasNext()) {
            C0679a next = it.next();
            if (!z || next.f3843b) {
                next.f3842a.mo6058k(this.f3841b, fragment);
            }
        }
    }

    /* renamed from: l */
    public void mo6204l(Fragment fragment, boolean z) {
        Fragment A0 = this.f3841b.mo5913A0();
        if (A0 != null) {
            A0.getParentFragmentManager().mo6024z0().mo6204l(fragment, true);
        }
        Iterator<C0679a> it = this.f3840a.iterator();
        while (it.hasNext()) {
            C0679a next = it.next();
            if (!z || next.f3843b) {
                next.f3842a.mo6059l(this.f3841b, fragment);
            }
        }
    }

    /* renamed from: m */
    public void mo6205m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment A0 = this.f3841b.mo5913A0();
        if (A0 != null) {
            A0.getParentFragmentManager().mo6024z0().mo6205m(fragment, view, bundle, true);
        }
        Iterator<C0679a> it = this.f3840a.iterator();
        while (it.hasNext()) {
            C0679a next = it.next();
            if (!z || next.f3843b) {
                next.f3842a.mo6060m(this.f3841b, fragment, view, bundle);
            }
        }
    }

    /* renamed from: n */
    public void mo6206n(Fragment fragment, boolean z) {
        Fragment A0 = this.f3841b.mo5913A0();
        if (A0 != null) {
            A0.getParentFragmentManager().mo6024z0().mo6206n(fragment, true);
        }
        Iterator<C0679a> it = this.f3840a.iterator();
        while (it.hasNext()) {
            C0679a next = it.next();
            if (!z || next.f3843b) {
                next.f3842a.mo6061n(this.f3841b, fragment);
            }
        }
    }

    /* renamed from: o */
    public void mo6207o(FragmentManager.C0642k kVar, boolean z) {
        this.f3840a.add(new C0679a(kVar, z));
    }

    /* renamed from: p */
    public void mo6208p(FragmentManager.C0642k kVar) {
        synchronized (this.f3840a) {
            int i = 0;
            int size = this.f3840a.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (this.f3840a.get(i).f3842a == kVar) {
                    this.f3840a.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }
}
