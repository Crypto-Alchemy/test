package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import kotlin.jvm.internal.Lambda;

/* compiled from: TypeUtils.kt */
public final class TypeUtilsKt$requiresTypeAliasExpansion$1 extends Lambda implements rc2<w47, Boolean> {
    public static final TypeUtilsKt$requiresTypeAliasExpansion$1 INSTANCE = new TypeUtilsKt$requiresTypeAliasExpansion$1();

    public TypeUtilsKt$requiresTypeAliasExpansion$1() {
        super(1);
    }

    public final Boolean invoke(w47 w47) {
        vx2.m53591g(w47, "it");
        eg0 d = w47.mo51134H0().mo51180d();
        boolean z = false;
        if (d != null && ((d instanceof hz6) || (d instanceof a17))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
