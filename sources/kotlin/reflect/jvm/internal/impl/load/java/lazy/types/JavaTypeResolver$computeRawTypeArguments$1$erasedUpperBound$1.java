package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.internal.Lambda;

/* compiled from: JavaTypeResolver.kt */
public final class JavaTypeResolver$computeRawTypeArguments$1$erasedUpperBound$1 extends Lambda implements pc2<xc3> {
    public final /* synthetic */ f23 $attr;
    public final /* synthetic */ yz6 $constructor;
    public final /* synthetic */ x03 $javaType;
    public final /* synthetic */ a17 $parameter;
    public final /* synthetic */ JavaTypeResolver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JavaTypeResolver$computeRawTypeArguments$1$erasedUpperBound$1(JavaTypeResolver javaTypeResolver, a17 a17, x03 x03, f23 f23, yz6 yz6) {
        super(0);
        this.this$0 = javaTypeResolver;
        this.$parameter = a17;
        this.$javaType = x03;
        this.$attr = f23;
        this.$constructor = yz6;
    }

    public final xc3 invoke() {
        TypeParameterUpperBoundEraser a = this.this$0.f39559c;
        a17 a17 = this.$parameter;
        boolean s = this.$javaType.mo66804s();
        f23 f23 = this.$attr;
        eg0 d = this.$constructor.mo51180d();
        xc3 c = a.mo53672c(a17, s, f23.mo51586h(d != null ? d.mo51464n() : null));
        vx2.m53590f(c, "typeParameterUpperBoundE…efaultType)\n            )");
        return c;
    }
}
