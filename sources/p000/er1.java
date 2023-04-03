package p000;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.C7387a;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;

/* renamed from: er1 */
/* compiled from: ErrorModuleDescriptor.kt */
public final class er1 implements mx3 {

    /* renamed from: a */
    public static final er1 f37594a = new er1();

    /* renamed from: d */
    public static final r24 f37595d;

    /* renamed from: e */
    public static final List<mx3> f37596e = ck0.m33062j();

    /* renamed from: g */
    public static final List<mx3> f37597g = ck0.m33062j();

    /* renamed from: k */
    public static final Set<mx3> f37598k = ny5.m49095e();

    /* renamed from: r */
    public static final C7389b f37599r = C7387a.f39079h.mo53142a();

    static {
        r24 m = r24.m71447m(ErrorEntity.ERROR_MODULE.getDebugText());
        vx2.m53590f(m, "special(ErrorEntity.ERROR_MODULE.debugText)");
        f37595d = m;
    }

    /* renamed from: N */
    public tk4 mo51532N(u82 u82) {
        vx2.m53591g(u82, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    /* renamed from: Q */
    public r24 mo51533Q() {
        return f37595d;
    }

    /* renamed from: a */
    public d31 mo50045a() {
        return this;
    }

    /* renamed from: b */
    public d31 mo51119b() {
        return null;
    }

    public C6983dm getAnnotations() {
        return C6983dm.f37317b.mo51228b();
    }

    public r24 getName() {
        return mo51533Q();
    }

    /* renamed from: j0 */
    public <R, D> R mo51120j0(h31<R, D> h31, D d) {
        vx2.m53591g(h31, "visitor");
        return null;
    }

    /* renamed from: k */
    public C7389b mo51535k() {
        return f37599r;
    }

    /* renamed from: l */
    public Collection<u82> mo51536l(u82 u82, rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(u82, "fqName");
        vx2.m53591g(rc2, "nameFilter");
        return ck0.m33062j();
    }

    /* renamed from: l0 */
    public <T> T mo51537l0(hx3<T> hx3) {
        vx2.m53591g(hx3, "capability");
        return null;
    }

    /* renamed from: u0 */
    public List<mx3> mo51538u0() {
        return f37597g;
    }

    /* renamed from: v */
    public boolean mo51539v(mx3 mx3) {
        vx2.m53591g(mx3, "targetModule");
        return false;
    }
}
