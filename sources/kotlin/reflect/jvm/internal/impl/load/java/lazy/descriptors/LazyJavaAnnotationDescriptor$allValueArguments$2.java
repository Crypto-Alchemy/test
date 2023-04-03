package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C6177b;
import kotlin.jvm.internal.Lambda;

/* compiled from: LazyJavaAnnotationDescriptor.kt */
public final class LazyJavaAnnotationDescriptor$allValueArguments$2 extends Lambda implements pc2<Map<r24, ? extends fq0<?>>> {
    public final /* synthetic */ LazyJavaAnnotationDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaAnnotationDescriptor$allValueArguments$2(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        super(0);
        this.this$0 = lazyJavaAnnotationDescriptor;
    }

    public final Map<r24, fq0<?>> invoke() {
        Collection<i03> b = this.this$0.f39474b.mo52088b();
        LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = this.this$0;
        ArrayList arrayList = new ArrayList();
        for (i03 i03 : b) {
            r24 name = i03.getName();
            if (name == null) {
                name = t73.f44655c;
            }
            fq0 d = lazyJavaAnnotationDescriptor.mo53509l(i03);
            Pair a = d != null ? wy6.m54142a(name, d) : null;
            if (a != null) {
                arrayList.add(a);
            }
        }
        return C6177b.m47369q(arrayList);
    }
}
