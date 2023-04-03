package p000;

import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;

/* renamed from: pf3 */
/* compiled from: context.kt */
public final class pf3 {

    /* renamed from: a */
    public final y13 f44042a;

    /* renamed from: b */
    public final e17 f44043b;

    /* renamed from: c */
    public final ef3<k23> f44044c;

    /* renamed from: d */
    public final ef3 f44045d;

    /* renamed from: e */
    public final JavaTypeResolver f44046e;

    public pf3(y13 y13, e17 e17, ef3<k23> ef3) {
        vx2.m53591g(y13, "components");
        vx2.m53591g(e17, "typeParameterResolver");
        vx2.m53591g(ef3, "delegateForDefaultTypeQualifiers");
        this.f44042a = y13;
        this.f44043b = e17;
        this.f44044c = ef3;
        this.f44045d = ef3;
        this.f44046e = new JavaTypeResolver(this, e17);
    }

    /* renamed from: a */
    public final y13 mo65296a() {
        return this.f44042a;
    }

    /* renamed from: b */
    public final k23 mo65297b() {
        return (k23) this.f44045d.getValue();
    }

    /* renamed from: c */
    public final ef3<k23> mo65298c() {
        return this.f44044c;
    }

    /* renamed from: d */
    public final mx3 mo65299d() {
        return this.f44042a.mo67010m();
    }

    /* renamed from: e */
    public final da6 mo65300e() {
        return this.f44042a.mo67018u();
    }

    /* renamed from: f */
    public final e17 mo65301f() {
        return this.f44043b;
    }

    /* renamed from: g */
    public final JavaTypeResolver mo65302g() {
        return this.f44046e;
    }
}
