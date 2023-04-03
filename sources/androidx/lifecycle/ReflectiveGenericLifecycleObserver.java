package androidx.lifecycle;

import androidx.lifecycle.C0710b;
import androidx.lifecycle.Lifecycle;

@Deprecated
class ReflectiveGenericLifecycleObserver implements C0715e {

    /* renamed from: a */
    public final Object f3918a;

    /* renamed from: d */
    public final C0710b.C0711a f3919d;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3918a = obj;
        this.f3919d = C0710b.f3947c.mo6377c(obj.getClass());
    }

    /* renamed from: f */
    public void mo907f(ug3 ug3, Lifecycle.Event event) {
        this.f3919d.mo6380a(ug3, event, this.f3918a);
    }
}
