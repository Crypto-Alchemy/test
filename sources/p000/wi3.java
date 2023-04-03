package p000;

import com.bumptech.glide.load.engine.C1759e;
import com.bumptech.glide.load.engine.C1776i;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: wi3 */
/* compiled from: LoadPathCache */
public class wi3 {

    /* renamed from: c */
    public static final C1776i<?, ?, ?> f19136c = new C1776i(Object.class, Object.class, Object.class, Collections.singletonList(new C1759e(Object.class, Object.class, Object.class, Collections.emptyList(), new v37(), (ys4<List<Throwable>>) null)), (ys4<List<Throwable>>) null);

    /* renamed from: a */
    public final C2781lq<mz3, C1776i<?, ?, ?>> f19137a = new C2781lq<>();

    /* renamed from: b */
    public final AtomicReference<mz3> f19138b = new AtomicReference<>();

    /* renamed from: a */
    public <Data, TResource, Transcode> C1776i<Data, TResource, Transcode> mo27545a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C1776i<Data, TResource, Transcode> iVar;
        mz3 b = mo27546b(cls, cls2, cls3);
        synchronized (this.f19137a) {
            iVar = this.f19137a.get(b);
        }
        this.f19138b.set(b);
        return iVar;
    }

    /* renamed from: b */
    public final mz3 mo27546b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        mz3 andSet = this.f19138b.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new mz3();
        }
        andSet.mo23435a(cls, cls2, cls3);
        return andSet;
    }

    /* renamed from: c */
    public boolean mo27547c(C1776i<?, ?, ?> iVar) {
        return f19136c.equals(iVar);
    }

    /* renamed from: d */
    public void mo27548d(Class<?> cls, Class<?> cls2, Class<?> cls3, C1776i<?, ?, ?> iVar) {
        synchronized (this.f19137a) {
            C2781lq<mz3, C1776i<?, ?, ?>> lqVar = this.f19137a;
            mz3 mz3 = new mz3(cls, cls2, cls3);
            if (iVar == null) {
                iVar = f19136c;
            }
            lqVar.put(mz3, iVar);
        }
    }
}
