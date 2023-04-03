package p000;

import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* renamed from: w27 */
/* compiled from: constantValues.kt */
public final class w27 extends t47<Integer> {
    public w27(int i) {
        super(Integer.valueOf(i));
    }

    /* renamed from: a */
    public xc3 mo50070a(mx3 mx3) {
        d36 d36;
        vx2.m53591g(mx3, "module");
        if0 a = FindClassInModuleKt.m60278a(mx3, C7395c.C7396a.f39121A0);
        if (a != null) {
            d36 = a.mo51464n();
        } else {
            d36 = null;
        }
        if (d36 == null) {
            return nr1.m70033d(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "UInt");
        }
        return d36;
    }

    public String toString() {
        return ((Number) mo51739b()).intValue() + ".toUInt()";
    }
}
