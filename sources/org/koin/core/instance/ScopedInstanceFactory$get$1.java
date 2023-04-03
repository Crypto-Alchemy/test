package org.koin.core.instance;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"T", "Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: ScopedInstanceFactory.kt */
public final class ScopedInstanceFactory$get$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ xv2 $context;
    public final /* synthetic */ ScopedInstanceFactory<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScopedInstanceFactory$get$1(ScopedInstanceFactory<T> scopedInstanceFactory, xv2 xv2) {
        super(0);
        this.this$0 = scopedInstanceFactory;
        this.$context = xv2;
    }

    public final void invoke() {
        if (!this.this$0.mo64981f(this.$context)) {
            this.this$0.f43939c.put(this.$context.mo66944c().mo64992i(), this.this$0.mo64978a(this.$context));
        }
    }
}
