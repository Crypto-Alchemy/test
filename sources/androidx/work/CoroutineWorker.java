package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import p000.y23;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0013\u0010\u0005\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002J\u0006\u0010\u000b\u001a\u00020\nR\u001a\u0010\u0010\u001a\u00020\f8\u0000X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0000X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u001d\u001a\u00020\u00178\u0016X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0012\u0010\u001a\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, mo44877d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Lhi3;", "Landroidx/work/ListenableWorker$a;", "p", "r", "(Lns0;)Ljava/lang/Object;", "Lw72;", "t", "d", "Lr37;", "m", "Lhm0;", "Lhm0;", "w", "()Lhm0;", "job", "Lry5;", "s", "Lry5;", "v", "()Lry5;", "future", "Lkotlinx/coroutines/CoroutineDispatcher;", "x", "Lkotlinx/coroutines/CoroutineDispatcher;", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineContext$annotations", "()V", "coroutineContext", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* compiled from: CoroutineWorker.kt */
public abstract class CoroutineWorker extends ListenableWorker {

    /* renamed from: r */
    public final hm0 f7462r = i33.m58814b((y23) null, 1, (Object) null);

    /* renamed from: s */
    public final ry5<ListenableWorker.C1509a> f7463s;

    /* renamed from: x */
    public final CoroutineDispatcher f7464x;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo44877d2 = {"Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 5, 1})
    /* renamed from: androidx.work.CoroutineWorker$a */
    /* compiled from: CoroutineWorker.kt */
    public static final class C1507a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ CoroutineWorker f7465a;

        public C1507a(CoroutineWorker coroutineWorker) {
            this.f7465a = coroutineWorker;
        }

        public final void run() {
            if (this.f7465a.mo10856v().isCancelled()) {
                y23.C9621a.m74226a(this.f7465a.mo10857w(), (CancellationException) null, 1, (Object) null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        vx2.m53591g(context, "appContext");
        vx2.m53591g(workerParameters, "params");
        ry5<ListenableWorker.C1509a> t = ry5.m26468t();
        vx2.m53590f(t, "create()");
        this.f7463s = t;
        t.mo10867l(new C1507a(this), mo10873h().mo11701c());
        this.f7464x = qh1.m71264a();
    }

    /* renamed from: u */
    public static /* synthetic */ Object m10405u(CoroutineWorker coroutineWorker, ns0 ns0) {
        throw new IllegalStateException("Not implemented");
    }

    /* renamed from: d */
    public final hi3<w72> mo10850d() {
        hm0 b = i33.m58814b((y23) null, 1, (Object) null);
        hu0 a = iu0.m59111a(mo10854s().plus(b));
        JobListenableFuture jobListenableFuture = new JobListenableFuture(b, (ry5) null, 2, (DefaultConstructorMarker) null);
        y23 unused = d50.m56748b(a, (CoroutineContext) null, (CoroutineStart) null, new CoroutineWorker$getForegroundInfoAsync$1(jobListenableFuture, this, (ns0<? super CoroutineWorker$getForegroundInfoAsync$1>) null), 3, (Object) null);
        return jobListenableFuture;
    }

    /* renamed from: m */
    public final void mo10851m() {
        super.mo10851m();
        this.f7463s.cancel(false);
    }

    /* renamed from: p */
    public final hi3<ListenableWorker.C1509a> mo10852p() {
        y23 unused = d50.m56748b(iu0.m59111a(mo10854s().plus(this.f7462r)), (CoroutineContext) null, (CoroutineStart) null, new CoroutineWorker$startWork$1(this, (ns0<? super CoroutineWorker$startWork$1>) null), 3, (Object) null);
        return this.f7463s;
    }

    /* renamed from: r */
    public abstract Object mo10853r(ns0<? super ListenableWorker.C1509a> ns0);

    /* renamed from: s */
    public CoroutineDispatcher mo10854s() {
        return this.f7464x;
    }

    /* renamed from: t */
    public Object mo10855t(ns0<? super w72> ns0) {
        return m10405u(this, ns0);
    }

    /* renamed from: v */
    public final ry5<ListenableWorker.C1509a> mo10856v() {
        return this.f7463s;
    }

    /* renamed from: w */
    public final hm0 mo10857w() {
        return this.f7462r;
    }
}
