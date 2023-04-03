package p000;

import com.google.crypto.tink.shaded.protobuf.C4729i0;
import com.google.crypto.tink.shaded.protobuf.C4731j0;
import com.google.crypto.tink.shaded.protobuf.C4734l;
import com.google.crypto.tink.shaded.protobuf.C4758t;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: ey4 */
/* compiled from: Protobuf */
public final class ey4 {

    /* renamed from: c */
    public static final ey4 f28697c = new ey4();

    /* renamed from: a */
    public final an5 f28698a = new jn3();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, C4731j0<?>> f28699b = new ConcurrentHashMap();

    /* renamed from: a */
    public static ey4 m44106a() {
        return f28697c;
    }

    /* renamed from: b */
    public <T> void mo42450b(T t, C4729i0 i0Var, C4734l lVar) throws IOException {
        mo42453e(t).mo35728i(t, i0Var, lVar);
    }

    /* renamed from: c */
    public C4731j0<?> mo42451c(Class<?> cls, C4731j0<?> j0Var) {
        C4758t.m38321b(cls, "messageType");
        C4758t.m38321b(j0Var, "schema");
        return this.f28699b.putIfAbsent(cls, j0Var);
    }

    /* renamed from: d */
    public <T> C4731j0<T> mo42452d(Class<T> cls) {
        C4758t.m38321b(cls, "messageType");
        C4731j0<T> j0Var = this.f28699b.get(cls);
        if (j0Var != null) {
            return j0Var;
        }
        C4731j0<T> a = this.f28698a.mo29027a(cls);
        C4731j0<?> c = mo42451c(cls, a);
        if (c != null) {
            return c;
        }
        return a;
    }

    /* renamed from: e */
    public <T> C4731j0<T> mo42453e(T t) {
        return mo42452d(t.getClass());
    }
}
