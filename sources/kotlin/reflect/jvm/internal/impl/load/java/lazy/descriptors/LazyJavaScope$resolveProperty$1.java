package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.Lambda;

/* compiled from: LazyJavaScope.kt */
public final class LazyJavaScope$resolveProperty$1 extends Lambda implements pc2<gc4<? extends fq0<?>>> {
    public final /* synthetic */ f13 $field;
    public final /* synthetic */ gx4 $propertyDescriptor;
    public final /* synthetic */ LazyJavaScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$resolveProperty$1(LazyJavaScope lazyJavaScope, f13 f13, gx4 gx4) {
        super(0);
        this.this$0 = lazyJavaScope;
        this.$field = f13;
        this.$propertyDescriptor = gx4;
    }

    public final gc4<fq0<?>> invoke() {
        da6 e = this.this$0.mo53618w().mo65300e();
        final LazyJavaScope lazyJavaScope = this.this$0;
        final f13 f13 = this.$field;
        final gx4 gx4 = this.$propertyDescriptor;
        return e.mo51162g(new pc2<fq0<?>>() {
            public final fq0<?> invoke() {
                return lazyJavaScope.mo53618w().mo65296a().mo67004g().mo66391a(f13, gx4);
            }
        });
    }
}
