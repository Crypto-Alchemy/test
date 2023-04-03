package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* compiled from: LazyJavaClassDescriptor.kt */
public final class LazyJavaClassDescriptor$moduleAnnotations$2 extends Lambda implements pc2<List<? extends h03>> {
    public final /* synthetic */ LazyJavaClassDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor$moduleAnnotations$2(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        super(0);
        this.this$0 = lazyJavaClassDescriptor;
    }

    public final List<h03> invoke() {
        nf0 g = DescriptorUtilsKt.m62446g(this.this$0);
        if (g != null) {
            return this.this$0.mo53519L0().mo65296a().mo67003f().mo52892a(g);
        }
        return null;
    }
}
