package androidx.work;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\u0001J\u0011\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nH\u0001J\u0018\u0010\f\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000H\u0001¢\u0006\u0004\b\f\u0010\rJ0\u0010\f\u001a\n \u0004*\u0004\u0018\u00018\u00008\u00002\u0006\u0010\u0005\u001a\u00020\u000e2\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u000f0\u000fH\u0003¢\u0006\u0004\b\f\u0010\u0010J\t\u0010\u0011\u001a\u00020\nH\u0001J\t\u0010\u0012\u001a\u00020\nH\u0001J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, mo44877d2 = {"Landroidx/work/JobListenableFuture;", "R", "Lhi3;", "Ljava/lang/Runnable;", "kotlin.jvm.PlatformType", "p0", "Ljava/util/concurrent/Executor;", "p1", "Lr37;", "l", "", "cancel", "get", "()Ljava/lang/Object;", "", "Ljava/util/concurrent/TimeUnit;", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "isCancelled", "isDone", "result", "b", "(Ljava/lang/Object;)V", "Ly23;", "a", "Ly23;", "job", "Lry5;", "d", "Lry5;", "underlying", "<init>", "(Ly23;Lry5;)V", "work-runtime-ktx_release"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* compiled from: ListenableFuture.kt */
public final class JobListenableFuture<R> implements hi3<R> {

    /* renamed from: a */
    public final y23 f7467a;

    /* renamed from: d */
    public final ry5<R> f7468d;

    public JobListenableFuture(y23 y23, ry5<R> ry5) {
        vx2.m53591g(y23, "job");
        vx2.m53591g(ry5, "underlying");
        this.f7467a = y23;
        this.f7468d = ry5;
        y23.mo55519p(new rc2<Throwable, r37>(this) {
            public final /* synthetic */ JobListenableFuture<R> this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return r37.f33317a;
            }

            public final void invoke(Throwable th) {
                if (th == null) {
                    if (!this.this$0.f7468d.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                } else if (th instanceof CancellationException) {
                    this.this$0.f7468d.cancel(true);
                } else {
                    ry5 a = this.this$0.f7468d;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    a.mo11045q(th);
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo10861b(R r) {
        this.f7468d.mo11044p(r);
    }

    public boolean cancel(boolean z) {
        return this.f7468d.cancel(z);
    }

    public R get() {
        return this.f7468d.get();
    }

    public R get(long j, TimeUnit timeUnit) {
        return this.f7468d.get(j, timeUnit);
    }

    public boolean isCancelled() {
        return this.f7468d.isCancelled();
    }

    public boolean isDone() {
        return this.f7468d.isDone();
    }

    /* renamed from: l */
    public void mo10867l(Runnable runnable, Executor executor) {
        this.f7468d.mo10867l(runnable, executor);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ JobListenableFuture(p000.y23 r1, p000.ry5 r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000d
            ry5 r2 = p000.ry5.m26468t()
            java.lang.String r3 = "create()"
            p000.vx2.m53590f(r2, r3)
        L_0x000d:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.JobListenableFuture.<init>(y23, ry5, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
