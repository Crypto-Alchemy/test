package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.Lambda;

/* compiled from: PrimitiveType.kt */
public final class PrimitiveType$arrayTypeFqName$2 extends Lambda implements pc2<u82> {
    public final /* synthetic */ PrimitiveType this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PrimitiveType$arrayTypeFqName$2(PrimitiveType primitiveType) {
        super(0);
        this.this$0 = primitiveType;
    }

    public final u82 invoke() {
        u82 c = C7395c.f39113r.mo66196c(this.this$0.getArrayTypeName());
        vx2.m53590f(c, "BUILT_INS_PACKAGE_FQ_NAME.child(arrayTypeName)");
        return c;
    }
}
