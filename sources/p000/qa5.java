package p000;

import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import p000.nc3;

/* renamed from: qa5 */
/* compiled from: ReflectKotlinClassFinder.kt */
public final class qa5 implements nc3 {

    /* renamed from: a */
    public final ClassLoader f44160a;

    /* renamed from: b */
    public final n50 f44161b = new n50();

    public qa5(ClassLoader classLoader) {
        vx2.m53591g(classLoader, "classLoader");
        this.f44160a = classLoader;
    }

    /* renamed from: a */
    public nc3.C7933a mo56448a(p03 p03) {
        String b;
        vx2.m53591g(p03, "javaClass");
        u82 e = p03.mo53383e();
        if (e == null || (b = e.mo66195b()) == null) {
            return null;
        }
        return mo65432d(b);
    }

    /* renamed from: b */
    public InputStream mo65431b(u82 u82) {
        vx2.m53591g(u82, "packageFqName");
        if (!u82.mo66204i(C7395c.f39112q)) {
            return null;
        }
        return this.f44161b.mo56354a(h50.f38161n.mo52122n(u82));
    }

    /* renamed from: c */
    public nc3.C7933a mo56449c(nf0 nf0) {
        vx2.m53591g(nf0, "classId");
        return mo65432d(ra5.m71503b(nf0));
    }

    /* renamed from: d */
    public final nc3.C7933a mo65432d(String str) {
        pa5 a;
        Class<?> a2 = w95.m73523a(this.f44160a, str);
        if (a2 == null || (a = pa5.f44018c.mo65270a(a2)) == null) {
            return null;
        }
        return new nc3.C7933a.C7935b(a, (byte[]) null, 2, (DefaultConstructorMarker) null);
    }
}
