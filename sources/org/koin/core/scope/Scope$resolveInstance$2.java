package org.koin.core.scope;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"T", "Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: Scope.kt */
public final class Scope$resolveInstance$2 extends Lambda implements pc2<r37> {
    public final /* synthetic */ ul4 $parameters;
    public final /* synthetic */ Scope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Scope$resolveInstance$2(Scope scope, ul4 ul4) {
        super(0);
        this.this$0 = scope;
        this.$parameters = ul4;
    }

    public final void invoke() {
        this.this$0.mo64997n().addFirst(this.$parameters);
    }
}
