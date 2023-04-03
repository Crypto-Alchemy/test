package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;

/* compiled from: context.kt */
public final class ContextKt {
    /* renamed from: a */
    public static final pf3 m60733a(pf3 pf3, d31 d31, i23 i23, int i, ef3<k23> ef3) {
        e17 e17;
        y13 a = pf3.mo65296a();
        if (i23 != null) {
            e17 = new LazyJavaTypeParameterResolver(pf3, d31, i23, i);
        } else {
            e17 = pf3.mo65301f();
        }
        return new pf3(a, e17, ef3);
    }

    /* renamed from: b */
    public static final pf3 m60734b(pf3 pf3, e17 e17) {
        vx2.m53591g(pf3, "<this>");
        vx2.m53591g(e17, "typeParameterResolver");
        return new pf3(pf3.mo65296a(), e17, pf3.mo65298c());
    }

    /* renamed from: c */
    public static final pf3 m60735c(pf3 pf3, rf0 rf0, i23 i23, int i) {
        vx2.m53591g(pf3, "<this>");
        vx2.m53591g(rf0, "containingDeclaration");
        return m60733a(pf3, rf0, i23, i, C6169a.m47233b(LazyThreadSafetyMode.NONE, new ContextKt$childForClassOrPackage$1(pf3, rf0)));
    }

    /* renamed from: d */
    public static /* synthetic */ pf3 m60736d(pf3 pf3, rf0 rf0, i23 i23, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i23 = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m60735c(pf3, rf0, i23, i);
    }

    /* renamed from: e */
    public static final pf3 m60737e(pf3 pf3, d31 d31, i23 i23, int i) {
        vx2.m53591g(pf3, "<this>");
        vx2.m53591g(d31, "containingDeclaration");
        vx2.m53591g(i23, "typeParameterOwner");
        return m60733a(pf3, d31, i23, i, pf3.mo65298c());
    }

    /* renamed from: f */
    public static /* synthetic */ pf3 m60738f(pf3 pf3, d31 d31, i23 i23, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m60737e(pf3, d31, i23, i);
    }

    /* renamed from: g */
    public static final k23 m60739g(pf3 pf3, C6983dm dmVar) {
        vx2.m53591g(pf3, "<this>");
        vx2.m53591g(dmVar, "additionalAnnotations");
        return pf3.mo65296a().mo66998a().mo53410c(pf3.mo65297b(), dmVar);
    }

    /* renamed from: h */
    public static final pf3 m60740h(pf3 pf3, C6983dm dmVar) {
        vx2.m53591g(pf3, "<this>");
        vx2.m53591g(dmVar, "additionalAnnotations");
        if (dmVar.isEmpty()) {
            return pf3;
        }
        return new pf3(pf3.mo65296a(), pf3.mo65301f(), C6169a.m47233b(LazyThreadSafetyMode.NONE, new ContextKt$copyWithNewDefaultTypeQualifiers$1(pf3, dmVar)));
    }

    /* renamed from: i */
    public static final pf3 m60741i(pf3 pf3, y13 y13) {
        vx2.m53591g(pf3, "<this>");
        vx2.m53591g(y13, "components");
        return new pf3(y13, pf3.mo65301f(), pf3.mo65298c());
    }
}
