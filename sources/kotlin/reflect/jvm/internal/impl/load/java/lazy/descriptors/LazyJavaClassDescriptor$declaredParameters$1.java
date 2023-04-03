package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* compiled from: LazyJavaClassDescriptor.kt */
public final class LazyJavaClassDescriptor$declaredParameters$1 extends Lambda implements pc2<List<? extends a17>> {
    public final /* synthetic */ LazyJavaClassDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor$declaredParameters$1(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        super(0);
        this.this$0 = lazyJavaClassDescriptor;
    }

    public final List<a17> invoke() {
        List<h23> typeParameters = this.this$0.mo53517J0().getTypeParameters();
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.this$0;
        ArrayList arrayList = new ArrayList(dk0.m43495u(typeParameters, 10));
        for (h23 h23 : typeParameters) {
            a17 a = lazyJavaClassDescriptor.f39485C.mo65301f().mo51350a(h23);
            if (a != null) {
                arrayList.add(a);
            } else {
                throw new AssertionError("Parameter " + h23 + " surely belongs to class " + lazyJavaClassDescriptor.mo53517J0() + ", so it must be resolved");
            }
        }
        return arrayList;
    }
}
