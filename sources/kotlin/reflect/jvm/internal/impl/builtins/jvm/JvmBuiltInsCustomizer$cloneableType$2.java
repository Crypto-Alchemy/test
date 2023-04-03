package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;

/* compiled from: JvmBuiltInsCustomizer.kt */
public final class JvmBuiltInsCustomizer$cloneableType$2 extends Lambda implements pc2<d36> {
    public final /* synthetic */ da6 $storageManager;
    public final /* synthetic */ JvmBuiltInsCustomizer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$cloneableType$2(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, da6 da6) {
        super(0);
        this.this$0 = jvmBuiltInsCustomizer;
        this.$storageManager = da6;
    }

    public final d36 invoke() {
        return FindClassInModuleKt.m60280c(this.this$0.mo53226s().mo53216a(), JvmBuiltInClassDescriptorFactory.f39211d.mo53211a(), new NotFoundClasses(this.$storageManager, this.this$0.mo53226s().mo53216a())).mo51464n();
    }
}
