package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;

/* compiled from: JvmBuiltInsCustomizer.kt */
public final class JvmBuiltInsCustomizer$notConsideredDeprecation$2 extends Lambda implements pc2<C6983dm> {
    public final /* synthetic */ JvmBuiltInsCustomizer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$notConsideredDeprecation$2(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        super(0);
        this.this$0 = jvmBuiltInsCustomizer;
    }

    public final C6983dm invoke() {
        return C6983dm.f37317b.mo51227a(bk0.m32598e(AnnotationUtilKt.m60333b(this.this$0.f39228a.mo51535k(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", (String) null, (String) null, 6, (Object) null)));
    }
}
