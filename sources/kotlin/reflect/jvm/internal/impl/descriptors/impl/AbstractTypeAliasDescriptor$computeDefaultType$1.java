package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.Lambda;

/* compiled from: AbstractTypeAliasDescriptor.kt */
public final class AbstractTypeAliasDescriptor$computeDefaultType$1 extends Lambda implements rc2<bd3, d36> {
    public final /* synthetic */ AbstractTypeAliasDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractTypeAliasDescriptor$computeDefaultType$1(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        super(1);
        this.this$0 = abstractTypeAliasDescriptor;
    }

    public final d36 invoke(bd3 bd3) {
        eg0 f = bd3.mo50560f(this.this$0);
        if (f != null) {
            return f.mo51464n();
        }
        return null;
    }
}
