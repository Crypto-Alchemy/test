package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Lambda;

/* compiled from: IntersectionTypeConstructor.kt */
public final class IntersectionTypeConstructor$makeDebugNameForIntersectionType$3 extends Lambda implements rc2<xc3, CharSequence> {
    public final /* synthetic */ rc2<xc3, Object> $getProperTypeRelatedToStringify;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IntersectionTypeConstructor$makeDebugNameForIntersectionType$3(rc2<? super xc3, ? extends Object> rc2) {
        super(1);
        this.$getProperTypeRelatedToStringify = rc2;
    }

    public final CharSequence invoke(xc3 xc3) {
        rc2<xc3, Object> rc2 = this.$getProperTypeRelatedToStringify;
        vx2.m53590f(xc3, "it");
        return rc2.invoke(xc3).toString();
    }
}
