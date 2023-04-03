package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Lambda;

/* compiled from: SpecialTypes.kt */
public final class LazyWrappedType$refine$1 extends Lambda implements pc2<xc3> {
    public final /* synthetic */ bd3 $kotlinTypeRefiner;
    public final /* synthetic */ LazyWrappedType this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyWrappedType$refine$1(bd3 bd3, LazyWrappedType lazyWrappedType) {
        super(0);
        this.$kotlinTypeRefiner = bd3;
        this.this$0 = lazyWrappedType;
    }

    public final xc3 invoke() {
        return this.$kotlinTypeRefiner.mo50562h((ad3) this.this$0.f40268e.invoke());
    }
}
