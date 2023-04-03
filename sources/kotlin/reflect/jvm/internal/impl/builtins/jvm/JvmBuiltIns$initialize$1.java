package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;

/* compiled from: JvmBuiltIns.kt */
public final class JvmBuiltIns$initialize$1 extends Lambda implements pc2<JvmBuiltIns.C7401a> {
    public final /* synthetic */ boolean $isAdditionalBuiltInsFeatureSupported;
    public final /* synthetic */ mx3 $moduleDescriptor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns$initialize$1(mx3 mx3, boolean z) {
        super(0);
        this.$moduleDescriptor = mx3;
        this.$isAdditionalBuiltInsFeatureSupported = z;
    }

    public final JvmBuiltIns.C7401a invoke() {
        return new JvmBuiltIns.C7401a(this.$moduleDescriptor, this.$isAdditionalBuiltInsFeatureSupported);
    }
}
