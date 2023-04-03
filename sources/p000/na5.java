package p000;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.ArraysKt___ArraysKt;
import p000.ka5;

/* renamed from: na5 */
/* compiled from: ReflectJavaWildcardType.kt */
public final class na5 extends ka5 implements t23 {

    /* renamed from: b */
    public final WildcardType f41130b;

    /* renamed from: c */
    public final Collection<h03> f41131c = ck0.m33062j();

    /* renamed from: d */
    public final boolean f41132d;

    public na5(WildcardType wildcardType) {
        vx2.m53591g(wildcardType, "reflectType");
        this.f41130b = wildcardType;
    }

    /* renamed from: D */
    public boolean mo51412D() {
        return this.f41132d;
    }

    /* renamed from: K */
    public boolean mo56427K() {
        Type[] upperBounds = mo52425P().getUpperBounds();
        vx2.m53590f(upperBounds, "reflectType.upperBounds");
        return !vx2.m53586b(ArraysKt___ArraysKt.m47257I(upperBounds), Object.class);
    }

    /* renamed from: Q */
    public ka5 mo56430w() {
        Type[] upperBounds = mo52425P().getUpperBounds();
        Type[] lowerBounds = mo52425P().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + mo52425P());
        } else if (lowerBounds.length == 1) {
            ka5.C7340a aVar = ka5.f38877a;
            vx2.m53590f(lowerBounds, "lowerBounds");
            Object d0 = ArraysKt___ArraysKt.m47278d0(lowerBounds);
            vx2.m53590f(d0, "lowerBounds.single()");
            return aVar.mo52886a((Type) d0);
        } else if (upperBounds.length != 1) {
            return null;
        } else {
            vx2.m53590f(upperBounds, "upperBounds");
            Type type = (Type) ArraysKt___ArraysKt.m47278d0(upperBounds);
            if (vx2.m53586b(type, Object.class)) {
                return null;
            }
            ka5.C7340a aVar2 = ka5.f38877a;
            vx2.m53590f(type, "ub");
            return aVar2.mo52886a(type);
        }
    }

    /* renamed from: R */
    public WildcardType mo52425P() {
        return this.f41130b;
    }

    public Collection<h03> getAnnotations() {
        return this.f41131c;
    }
}
