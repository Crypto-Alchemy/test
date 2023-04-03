package p018io.reactivex.disposables;

import p018io.reactivex.internal.disposables.EmptyDisposable;

/* renamed from: io.reactivex.disposables.a */
/* compiled from: Disposables */
public final class C5978a {
    /* renamed from: a */
    public static th1 m45831a() {
        return EmptyDisposable.INSTANCE;
    }

    /* renamed from: b */
    public static th1 m45832b(Runnable runnable) {
        af4.m31828d(runnable, "run is null");
        return new RunnableDisposable(runnable);
    }
}
