package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.jvm.internal.FunctionReference;

/* compiled from: DescriptorUtils.kt */
public /* synthetic */ class DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 extends FunctionReference implements rc2<n87, Boolean> {
    public static final DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 INSTANCE = new DescriptorUtilsKt$declaresOrInheritsDefaultValue$2();

    public DescriptorUtilsKt$declaresOrInheritsDefaultValue$2() {
        super(1);
    }

    public final String getName() {
        return "declaresDefaultValue";
    }

    public final y83 getOwner() {
        return ua5.m52727b(n87.class);
    }

    public final String getSignature() {
        return "declaresDefaultValue()Z";
    }

    public final Boolean invoke(n87 n87) {
        vx2.m53591g(n87, "p0");
        return Boolean.valueOf(n87.mo53318v0());
    }
}
