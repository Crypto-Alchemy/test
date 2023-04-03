package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* compiled from: LazyJavaAnnotationDescriptor.kt */
public final class LazyJavaAnnotationDescriptor$type$2 extends Lambda implements pc2<d36> {
    public final /* synthetic */ LazyJavaAnnotationDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaAnnotationDescriptor$type$2(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        super(0);
        this.this$0 = lazyJavaAnnotationDescriptor;
    }

    public final d36 invoke() {
        u82 e = this.this$0.mo53263e();
        if (e == null) {
            return nr1.m70033d(ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, this.this$0.f39474b.toString());
        }
        if0 f = d23.m56622f(d23.f37229a, e, this.this$0.f39473a.mo65299d().mo51535k(), (Integer) null, 4, (Object) null);
        if (f == null) {
            p03 t = this.this$0.f39474b.mo52091t();
            f = t != null ? this.this$0.f39473a.mo65296a().mo67011n().mo52549a(t) : null;
            if (f == null) {
                f = this.this$0.mo53505g(e);
            }
        }
        return f.mo51464n();
    }
}
