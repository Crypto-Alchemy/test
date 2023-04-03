package p000;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;

/* renamed from: l64 */
/* compiled from: NewKotlinTypeChecker.kt */
public final class l64 implements k64 {

    /* renamed from: c */
    public final bd3 f40576c;

    /* renamed from: d */
    public final KotlinTypePreparator f40577d;

    /* renamed from: e */
    public final OverridingUtil f40578e;

    public l64(bd3 bd3, KotlinTypePreparator kotlinTypePreparator) {
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        vx2.m53591g(kotlinTypePreparator, "kotlinTypePreparator");
        this.f40576c = bd3;
        this.f40577d = kotlinTypePreparator;
        OverridingUtil m = OverridingUtil.m62377m(mo52870d());
        vx2.m53590f(m, "createWithTypeRefiner(kotlinTypeRefiner)");
        this.f40578e = m;
    }

    /* renamed from: a */
    public OverridingUtil mo52869a() {
        return this.f40578e;
    }

    /* renamed from: b */
    public boolean mo55822b(xc3 xc3, xc3 xc32) {
        vx2.m53591g(xc3, "a");
        vx2.m53591g(xc32, "b");
        return mo55824e(ag0.m55488b(false, false, (bg0) null, mo55825f(), mo52870d(), 6, (Object) null), xc3.mo64506K0(), xc32.mo64506K0());
    }

    /* renamed from: c */
    public boolean mo55823c(xc3 xc3, xc3 xc32) {
        vx2.m53591g(xc3, "subtype");
        vx2.m53591g(xc32, "supertype");
        return mo55826g(ag0.m55488b(true, false, (bg0) null, mo55825f(), mo52870d(), 6, (Object) null), xc3.mo64506K0(), xc32.mo64506K0());
    }

    /* renamed from: d */
    public bd3 mo52870d() {
        return this.f40576c;
    }

    /* renamed from: e */
    public final boolean mo55824e(TypeCheckerState typeCheckerState, w47 w47, w47 w472) {
        vx2.m53591g(typeCheckerState, "<this>");
        vx2.m53591g(w47, "a");
        vx2.m53591g(w472, "b");
        return AbstractTypeChecker.f40248a.mo55263k(typeCheckerState, w47, w472);
    }

    /* renamed from: f */
    public KotlinTypePreparator mo55825f() {
        return this.f40577d;
    }

    /* renamed from: g */
    public final boolean mo55826g(TypeCheckerState typeCheckerState, w47 w47, w47 w472) {
        vx2.m53591g(typeCheckerState, "<this>");
        vx2.m53591g(w47, "subType");
        vx2.m53591g(w472, "superType");
        return AbstractTypeChecker.m62792t(AbstractTypeChecker.f40248a, typeCheckerState, w47, w472, false, 8, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l64(bd3 bd3, KotlinTypePreparator kotlinTypePreparator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bd3, (i & 2) != 0 ? KotlinTypePreparator.C7727a.f40292a : kotlinTypePreparator);
    }
}
