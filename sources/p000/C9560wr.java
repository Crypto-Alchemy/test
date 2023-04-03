package p000;

import java.util.concurrent.Callable;
import java8.util.concurrent.CompletableFuture;

/* renamed from: wr */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C9560wr implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ CompletableFuture f45748a;

    /* renamed from: d */
    public final /* synthetic */ Callable f45749d;

    public /* synthetic */ C9560wr(CompletableFuture completableFuture, Callable callable) {
        this.f45748a = completableFuture;
        this.f45749d = callable;
    }

    public final void run() {
        C9649yr.lambda$run$1(this.f45748a, this.f45749d);
    }
}
