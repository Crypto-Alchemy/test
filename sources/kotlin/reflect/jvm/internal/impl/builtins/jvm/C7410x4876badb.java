package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getAdditionalFunctions$fakeJavaClassDescriptor$1 */
/* compiled from: JvmBuiltInsCustomizer.kt */
public final class C7410x4876badb extends Lambda implements pc2<if0> {
    public final /* synthetic */ LazyJavaClassDescriptor $javaAnalogueDescriptor;
    public final /* synthetic */ if0 $kotlinMutableClassIfContainer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7410x4876badb(LazyJavaClassDescriptor lazyJavaClassDescriptor, if0 if0) {
        super(0);
        this.$javaAnalogueDescriptor = lazyJavaClassDescriptor;
        this.$kotlinMutableClassIfContainer = if0;
    }

    public final if0 invoke() {
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.$javaAnalogueDescriptor;
        x13 x13 = x13.f45832a;
        vx2.m53590f(x13, "EMPTY");
        return lazyJavaClassDescriptor.mo53515H0(x13, this.$kotlinMutableClassIfContainer);
    }
}
