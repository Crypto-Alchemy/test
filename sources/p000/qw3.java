package p000;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qw3 */
/* compiled from: ModelToResourceClassCache */
public class qw3 {

    /* renamed from: a */
    public final AtomicReference<mz3> f17079a = new AtomicReference<>();

    /* renamed from: b */
    public final C2781lq<mz3, List<Class<?>>> f17080b = new C2781lq<>();

    /* renamed from: a */
    public List<Class<?>> mo25277a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        mz3 andSet = this.f17079a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new mz3(cls, cls2, cls3);
        } else {
            andSet.mo23435a(cls, cls2, cls3);
        }
        synchronized (this.f17080b) {
            list = this.f17080b.get(andSet);
        }
        this.f17079a.set(andSet);
        return list;
    }

    /* renamed from: b */
    public void mo25278b(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f17080b) {
            this.f17080b.put(new mz3(cls, cls2, cls3), list);
        }
    }
}
