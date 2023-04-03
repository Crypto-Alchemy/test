package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* compiled from: JavaAnnotationMapper.kt */
public final class JavaAnnotationTargetMapper$mapJavaTargetArguments$1 extends Lambda implements rc2<mx3, xc3> {
    public static final JavaAnnotationTargetMapper$mapJavaTargetArguments$1 INSTANCE = new JavaAnnotationTargetMapper$mapJavaTargetArguments$1();

    public JavaAnnotationTargetMapper$mapJavaTargetArguments$1() {
        super(1);
    }

    public final xc3 invoke(mx3 mx3) {
        vx2.m53591g(mx3, "module");
        n87 b = ad1.m55454b(k03.f38828a.mo52839d(), mx3.mo51535k().mo53175o(C7395c.C7396a.f39134H));
        xc3 type = b != null ? b.getType() : null;
        return type == null ? nr1.m70033d(ErrorTypeKind.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
    }
}
