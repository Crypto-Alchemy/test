package p000;

import com.google.protobuf.C4982i0;
import com.google.protobuf.C4984j0;
import com.google.protobuf.C4987l;
import com.google.protobuf.C5011t;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: dy4 */
/* compiled from: Protobuf */
public final class dy4 {

    /* renamed from: c */
    public static final dy4 f28339c = new dy4();

    /* renamed from: a */
    public final zm5 f28340a = new kn3();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, C4984j0<?>> f28341b = new ConcurrentHashMap();

    /* renamed from: a */
    public static dy4 m43731a() {
        return f28339c;
    }

    /* renamed from: b */
    public <T> void mo42087b(T t, C4982i0 i0Var, C4987l lVar) throws IOException {
        mo42090e(t).mo37185i(t, i0Var, lVar);
    }

    /* renamed from: c */
    public C4984j0<?> mo42088c(Class<?> cls, C4984j0<?> j0Var) {
        C5011t.m39928b(cls, "messageType");
        C5011t.m39928b(j0Var, "schema");
        return this.f28341b.putIfAbsent(cls, j0Var);
    }

    /* renamed from: d */
    public <T> C4984j0<T> mo42089d(Class<T> cls) {
        C5011t.m39928b(cls, "messageType");
        C4984j0<T> j0Var = this.f28341b.get(cls);
        if (j0Var != null) {
            return j0Var;
        }
        C4984j0<T> a = this.f28340a.mo44845a(cls);
        C4984j0<?> c = mo42088c(cls, a);
        if (c != null) {
            return c;
        }
        return a;
    }

    /* renamed from: e */
    public <T> C4984j0<T> mo42090e(T t) {
        return mo42089d(t.getClass());
    }
}
