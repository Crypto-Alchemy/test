package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* compiled from: modifierChecks.kt */
public final class OperatorChecks$checks$3 extends Lambda implements rc2<C7425c, String> {
    public static final OperatorChecks$checks$3 INSTANCE = new OperatorChecks$checks$3();

    public OperatorChecks$checks$3() {
        super(1);
    }

    public final String invoke(C7425c cVar) {
        boolean z;
        vx2.m53591g(cVar, "$this$$receiver");
        h85 G = cVar.mo51311G();
        if (G == null) {
            G = cVar.mo51315J();
        }
        OperatorChecks operatorChecks = OperatorChecks.f40312a;
        boolean z2 = false;
        if (G != null) {
            xc3 returnType = cVar.getReturnType();
            if (returnType != null) {
                xc3 type = G.getType();
                vx2.m53590f(type, "receiver.type");
                z = TypeUtilsKt.m62959o(returnType, type);
            } else {
                z = false;
            }
            if (z || operatorChecks.mo55391d(cVar, G)) {
                z2 = true;
            }
        }
        if (!z2) {
            return "receiver must be a supertype of the return type";
        }
        return null;
    }
}
