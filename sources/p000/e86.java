package p000;

import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* renamed from: e86 */
/* compiled from: StarProjectionImpl.kt */
public final class e86 extends g17 {

    /* renamed from: a */
    public final xc3 f37492a;

    public e86(C7389b bVar) {
        vx2.m53591g(bVar, "kotlinBuiltIns");
        d36 I = bVar.mo53151I();
        vx2.m53590f(I, "kotlinBuiltIns.nullableAnyType");
        this.f37492a = I;
    }

    /* renamed from: a */
    public f17 mo51407a(bd3 bd3) {
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: b */
    public boolean mo51408b() {
        return true;
    }

    /* renamed from: c */
    public Variance mo51409c() {
        return Variance.OUT_VARIANCE;
    }

    public xc3 getType() {
        return this.f37492a;
    }
}
