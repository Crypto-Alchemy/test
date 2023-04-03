package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* compiled from: RawType.kt */
public final class RawSubstitution$eraseInflexibleBasedOnClassDescriptor$2 extends Lambda implements rc2<bd3, d36> {
    public final /* synthetic */ f23 $attr;
    public final /* synthetic */ if0 $declaration;
    public final /* synthetic */ d36 $type;
    public final /* synthetic */ RawSubstitution this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RawSubstitution$eraseInflexibleBasedOnClassDescriptor$2(if0 if0, RawSubstitution rawSubstitution, d36 d36, f23 f23) {
        super(1);
        this.$declaration = if0;
        this.this$0 = rawSubstitution;
        this.$type = d36;
        this.$attr = f23;
    }

    public final d36 invoke(bd3 bd3) {
        nf0 g;
        if0 b;
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        if0 if0 = this.$declaration;
        if (!(if0 instanceof if0)) {
            if0 = null;
        }
        if (if0 == null || (g = DescriptorUtilsKt.m62446g(if0)) == null || (b = bd3.mo50556b(g)) == null || vx2.m53586b(b, this.$declaration)) {
            return null;
        }
        return (d36) this.this$0.mo53663l(this.$type, b, this.$attr).getFirst();
    }
}
