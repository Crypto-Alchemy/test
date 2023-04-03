package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Map;

/* compiled from: resolvers.kt */
public final class LazyJavaTypeParameterResolver implements e17 {

    /* renamed from: a */
    public final pf3 f39456a;

    /* renamed from: b */
    public final d31 f39457b;

    /* renamed from: c */
    public final int f39458c;

    /* renamed from: d */
    public final Map<h23, Integer> f39459d;

    /* renamed from: e */
    public final ws3<h23, rf3> f39460e;

    public LazyJavaTypeParameterResolver(pf3 pf3, d31 d31, i23 i23, int i) {
        vx2.m53591g(pf3, "c");
        vx2.m53591g(d31, "containingDeclaration");
        vx2.m53591g(i23, "typeParameterOwner");
        this.f39456a = pf3;
        this.f39457b = d31;
        this.f39458c = i;
        this.f39459d = ak0.m55534d(i23.getTypeParameters());
        this.f39460e = pf3.mo65300e().mo51159d(new LazyJavaTypeParameterResolver$resolve$1(this));
    }

    /* renamed from: a */
    public a17 mo51350a(h23 h23) {
        vx2.m53591g(h23, "javaTypeParameter");
        rf3 invoke = this.f39460e.invoke(h23);
        if (invoke != null) {
            return invoke;
        }
        return this.f39456a.mo65301f().mo51350a(h23);
    }
}
