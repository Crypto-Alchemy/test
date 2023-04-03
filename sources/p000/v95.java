package p000;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import p000.t03;

/* renamed from: v95 */
/* compiled from: ReflectJavaClassFinder.kt */
public final class v95 implements t03 {

    /* renamed from: a */
    public final ClassLoader f45247a;

    public v95(ClassLoader classLoader) {
        vx2.m53591g(classLoader, "classLoader");
        this.f45247a = classLoader;
    }

    /* renamed from: a */
    public Set<String> mo65953a(u82 u82) {
        vx2.m53591g(u82, "packageFqName");
        return null;
    }

    /* renamed from: b */
    public s13 mo65954b(u82 u82, boolean z) {
        vx2.m53591g(u82, "fqName");
        return new ha5(u82);
    }

    /* renamed from: c */
    public p03 mo65955c(t03.C9320b bVar) {
        vx2.m53591g(bVar, "request");
        nf0 a = bVar.mo65956a();
        u82 h = a.mo62678h();
        vx2.m53590f(h, "classId.packageFqName");
        String b = a.mo62680i().mo66195b();
        vx2.m53590f(b, "classId.relativeClassName.asString()");
        String H = yb6.m74331H(b, '.', DecodedChar.FNC1, false, 4, (Object) null);
        if (!h.mo66197d()) {
            H = h.mo66195b() + '.' + H;
        }
        Class<?> a2 = w95.m73523a(this.f45247a, H);
        if (a2 != null) {
            return new ReflectJavaClass(a2);
        }
        return null;
    }
}
