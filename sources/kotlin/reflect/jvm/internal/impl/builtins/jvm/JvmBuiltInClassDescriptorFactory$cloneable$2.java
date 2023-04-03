package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;

/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
public final class JvmBuiltInClassDescriptorFactory$cloneable$2 extends Lambda implements pc2<lf0> {
    public final /* synthetic */ da6 $storageManager;
    public final /* synthetic */ JvmBuiltInClassDescriptorFactory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltInClassDescriptorFactory$cloneable$2(JvmBuiltInClassDescriptorFactory jvmBuiltInClassDescriptorFactory, da6 da6) {
        super(0);
        this.this$0 = jvmBuiltInClassDescriptorFactory;
        this.$storageManager = da6;
    }

    public final lf0 invoke() {
        lf0 lf0 = new lf0((d31) this.this$0.f39217b.invoke(this.this$0.f39216a), JvmBuiltInClassDescriptorFactory.f39214g, Modality.ABSTRACT, ClassKind.INTERFACE, bk0.m32598e(this.this$0.f39216a.mo51535k().mo53169i()), a66.f36360a, false, this.$storageManager);
        lf0.mo55890E0(new eh0(this.$storageManager, lf0), ny5.m49095e(), (ef0) null);
        return lf0;
    }
}
