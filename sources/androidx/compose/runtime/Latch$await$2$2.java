package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "it", "Lr37;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: Latch.kt */
public final class Latch$await$2$2 extends Lambda implements rc2<Throwable, r37> {
    public final /* synthetic */ ma0<r37> $co;
    public final /* synthetic */ Latch this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Latch$await$2$2(Latch latch, ma0<? super r37> ma0) {
        super(1);
        this.this$0 = latch;
        this.$co = ma0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return r37.f33317a;
    }

    public final void invoke(Throwable th) {
        Object b = this.this$0.f1515a;
        Latch latch = this.this$0;
        ma0<r37> ma0 = this.$co;
        synchronized (b) {
            latch.f1516b.remove(ma0);
            r37 r37 = r37.f33317a;
        }
    }
}
