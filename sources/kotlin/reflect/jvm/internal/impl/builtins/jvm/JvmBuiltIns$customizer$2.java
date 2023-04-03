package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;

/* compiled from: JvmBuiltIns.kt */
public final class JvmBuiltIns$customizer$2 extends Lambda implements pc2<JvmBuiltInsCustomizer> {
    public final /* synthetic */ da6 $storageManager;
    public final /* synthetic */ JvmBuiltIns this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns$customizer$2(JvmBuiltIns jvmBuiltIns, da6 da6) {
        super(0);
        this.this$0 = jvmBuiltIns;
        this.$storageManager = da6;
    }

    public final JvmBuiltInsCustomizer invoke() {
        ModuleDescriptorImpl r = this.this$0.mo53178r();
        vx2.m53590f(r, "builtInsModule");
        da6 da6 = this.$storageManager;
        final JvmBuiltIns jvmBuiltIns = this.this$0;
        return new JvmBuiltInsCustomizer(r, da6, new pc2<JvmBuiltIns.C7401a>() {
            public final JvmBuiltIns.C7401a invoke() {
                pc2 E0 = jvmBuiltIns.f39221i;
                if (E0 != null) {
                    JvmBuiltIns.C7401a aVar = (JvmBuiltIns.C7401a) E0.invoke();
                    jvmBuiltIns.f39221i = null;
                    return aVar;
                }
                throw new AssertionError("JvmBuiltins instance has not been initialized properly");
            }
        });
    }
}
