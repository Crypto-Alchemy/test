package p000;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;

/* renamed from: lb0 */
/* compiled from: CapturedTypeConstructor.kt */
public final class lb0 implements kb0 {

    /* renamed from: a */
    public final f17 f40594a;

    /* renamed from: b */
    public NewCapturedTypeConstructor f40595b;

    public lb0(f17 f17) {
        vx2.m53591g(f17, "projection");
        this.f40594a = f17;
        mo52887c().mo51409c();
        Variance variance = Variance.INVARIANT;
    }

    /* renamed from: c */
    public f17 mo52887c() {
        return this.f40594a;
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ eg0 mo51180d() {
        return (eg0) mo55851f();
    }

    /* renamed from: e */
    public boolean mo51809e() {
        return false;
    }

    /* renamed from: f */
    public Void mo55851f() {
        return null;
    }

    /* renamed from: g */
    public Collection<xc3> mo51811g() {
        Object obj;
        if (mo52887c().mo51409c() == Variance.OUT_VARIANCE) {
            obj = mo52887c().getType();
        } else {
            obj = mo51813k().mo53151I();
        }
        vx2.m53590f(obj, "if (projection.projectio… builtIns.nullableAnyType");
        return bk0.m32598e(obj);
    }

    public List<a17> getParameters() {
        return ck0.m33062j();
    }

    /* renamed from: h */
    public final NewCapturedTypeConstructor mo55852h() {
        return this.f40595b;
    }

    /* renamed from: i */
    public lb0 mo51808a(bd3 bd3) {
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        f17 a = mo52887c().mo51407a(bd3);
        vx2.m53590f(a, "projection.refine(kotlinTypeRefiner)");
        return new lb0(a);
    }

    /* renamed from: j */
    public final void mo55854j(NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this.f40595b = newCapturedTypeConstructor;
    }

    /* renamed from: k */
    public C7389b mo51813k() {
        C7389b k = mo52887c().getType().mo51134H0().mo51813k();
        vx2.m53590f(k, "projection.type.constructor.builtIns");
        return k;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + mo52887c() + ')';
    }
}
