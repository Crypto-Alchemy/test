package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* compiled from: JvmBuiltInsCustomizer.kt */
public final class JvmBuiltInsCustomizer$isMutabilityViolation$2 extends Lambda implements rc2<CallableMemberDescriptor, Boolean> {
    public final /* synthetic */ JvmBuiltInsCustomizer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$isMutabilityViolation$2(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        super(1);
        this.this$0 = jvmBuiltInsCustomizer;
    }

    public final Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
        boolean z;
        if (callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.DECLARATION) {
            d23 f = this.this$0.f39229b;
            d31 b = callableMemberDescriptor.mo51119b();
            vx2.m53589e(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            if (f.mo51030c((if0) b)) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
