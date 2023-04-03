package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

/* compiled from: ConstantValueFactory.kt */
public final class ConstantValueFactory$createArrayValue$3 extends Lambda implements rc2<mx3, xc3> {
    public final /* synthetic */ PrimitiveType $componentType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstantValueFactory$createArrayValue$3(PrimitiveType primitiveType) {
        super(1);
        this.$componentType = primitiveType;
    }

    public final xc3 invoke(mx3 mx3) {
        vx2.m53591g(mx3, "module");
        d36 O = mx3.mo51535k().mo53156O(this.$componentType);
        vx2.m53590f(O, "module.builtIns.getPrimi…KotlinType(componentType)");
        return O;
    }
}
