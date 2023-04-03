package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$LazyJavaClassTypeConstructor$parameters$1 */
/* compiled from: LazyJavaClassDescriptor.kt */
public final class C7455xbaf55d8a extends Lambda implements pc2<List<? extends a17>> {
    public final /* synthetic */ LazyJavaClassDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7455xbaf55d8a(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        super(0);
        this.this$0 = lazyJavaClassDescriptor;
    }

    public final List<a17> invoke() {
        return TypeParameterUtilsKt.m60322d(this.this$0);
    }
}
