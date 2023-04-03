package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "throwable", "Lr37;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: Recomposer.kt */
public final class Recomposer$effectJob$1$1 extends Lambda implements rc2<Throwable, r37> {
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$effectJob$1$1(Recomposer recomposer) {
        super(1);
        this.this$0 = recomposer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return r37.f33317a;
    }

    public final void invoke(Throwable th) {
        ma0 ma0;
        ma0 ma02;
        CancellationException a = pu1.m71118a("Recomposer effect job completed", th);
        Object E = this.this$0.f1543e;
        Recomposer recomposer = this.this$0;
        synchronized (E) {
            y23 B = recomposer.f1544f;
            ma0 = null;
            if (B != null) {
                recomposer.f1558t.setValue(Recomposer.State.ShuttingDown);
                if (!recomposer.f1556r) {
                    B.mo52179c(a);
                } else if (recomposer.f1554p != null) {
                    ma02 = recomposer.f1554p;
                    recomposer.f1554p = null;
                    B.mo55519p(new Recomposer$effectJob$1$1$1$1(recomposer, th));
                    ma0 = ma02;
                }
                ma02 = null;
                recomposer.f1554p = null;
                B.mo55519p(new Recomposer$effectJob$1$1$1$1(recomposer, th));
                ma0 = ma02;
            } else {
                recomposer.f1545g = a;
                recomposer.f1558t.setValue(Recomposer.State.ShutDown);
                r37 r37 = r37.f33317a;
            }
        }
        if (ma0 != null) {
            Result.C6167a aVar = Result.Companion;
            ma0.resumeWith(Result.m75635constructorimpl(r37.f33317a));
        }
    }
}
