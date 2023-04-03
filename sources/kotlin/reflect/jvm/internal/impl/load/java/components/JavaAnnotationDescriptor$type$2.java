package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.internal.Lambda;

/* compiled from: JavaAnnotationMapper.kt */
public final class JavaAnnotationDescriptor$type$2 extends Lambda implements pc2<d36> {

    /* renamed from: $c */
    public final /* synthetic */ pf3 f39434$c;
    public final /* synthetic */ JavaAnnotationDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JavaAnnotationDescriptor$type$2(pf3 pf3, JavaAnnotationDescriptor javaAnnotationDescriptor) {
        super(0);
        this.f39434$c = pf3;
        this.this$0 = javaAnnotationDescriptor;
    }

    public final d36 invoke() {
        d36 n = this.f39434$c.mo65299d().mo51535k().mo53175o(this.this$0.mo53263e()).mo51464n();
        vx2.m53590f(n, "c.module.builtIns.getBui…qName(fqName).defaultType");
        return n;
    }
}
