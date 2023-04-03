package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.collections.C6177b;
import kotlin.jvm.internal.Lambda;

/* compiled from: JavaAnnotationMapper.kt */
public final class JavaRetentionAnnotationDescriptor$allValueArguments$2 extends Lambda implements pc2<Map<r24, ? extends fq0<?>>> {
    public final /* synthetic */ JavaRetentionAnnotationDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JavaRetentionAnnotationDescriptor$allValueArguments$2(JavaRetentionAnnotationDescriptor javaRetentionAnnotationDescriptor) {
        super(0);
        this.this$0 = javaRetentionAnnotationDescriptor;
    }

    public final Map<r24, fq0<?>> invoke() {
        fq0<?> a = JavaAnnotationTargetMapper.f39435a.mo53480a(this.this$0.mo53477a());
        Map<r24, fq0<?>> f = a != null ? ao3.m31894f(wy6.m54142a(k03.f38828a.mo52838c(), a)) : null;
        return f == null ? C6177b.m47361i() : f;
    }
}
