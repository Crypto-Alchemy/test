package p000;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 !2\u00020\u0001:\u0001\u001eJ\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'J\b\u0010\u0006\u001a\u00020\u0005H&J\u001a\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH'J\u0013\u0010\u000e\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0015\u001a\u00020\u00142\u0018\u0010\u0013\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\b0\u0010j\u0002`\u0012H&J6\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\u0018\u0010\u0013\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\b0\u0010j\u0002`\u0012H'R\u0014\u0010\u001b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00000\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, mo44877d2 = {"Ly23;", "Lkotlin/coroutines/CoroutineContext$a;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "h", "", "start", "cause", "Lr37;", "c", "Lje0;", "child", "Lhe0;", "G", "g", "(Lns0;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lzh1;", "p", "onCancelling", "invokeImmediately", "v", "a", "()Z", "isActive", "isCancelled", "Lhw5;", "b", "()Lhw5;", "children", "l", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: y23 */
/* compiled from: Job.kt */
public interface y23 extends CoroutineContext.C6188a {

    /* renamed from: l */
    public static final C9622b f46117l = C9622b.f46118a;

    @Metadata(mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* renamed from: y23$a */
    /* compiled from: Job.kt */
    public static final class C9621a {
        /* renamed from: a */
        public static /* synthetic */ void m74226a(y23 y23, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                y23.mo52179c(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: b */
        public static <R> R m74227b(y23 y23, R r, fd2<? super R, ? super CoroutineContext.C6188a, ? extends R> fd2) {
            return CoroutineContext.C6188a.C6189a.m47418a(y23, r, fd2);
        }

        /* renamed from: c */
        public static <E extends CoroutineContext.C6188a> E m74228c(y23 y23, CoroutineContext.C6190b<E> bVar) {
            return CoroutineContext.C6188a.C6189a.m47419b(y23, bVar);
        }

        /* renamed from: d */
        public static /* synthetic */ zh1 m74229d(y23 y23, boolean z, boolean z2, rc2 rc2, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return y23.mo55528v(z, z2, rc2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        /* renamed from: e */
        public static CoroutineContext m74230e(y23 y23, CoroutineContext.C6190b<?> bVar) {
            return CoroutineContext.C6188a.C6189a.m47420c(y23, bVar);
        }

        /* renamed from: f */
        public static CoroutineContext m74231f(y23 y23, CoroutineContext coroutineContext) {
            return CoroutineContext.C6188a.C6189a.m47421d(y23, coroutineContext);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo44877d2 = {"Ly23$b;", "Lkotlin/coroutines/CoroutineContext$b;", "Ly23;", "<init>", "()V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: y23$b */
    /* compiled from: Job.kt */
    public static final class C9622b implements CoroutineContext.C6190b<y23> {

        /* renamed from: a */
        public static final /* synthetic */ C9622b f46118a = new C9622b();
    }

    /* renamed from: G */
    he0 mo55481G(je0 je0);

    /* renamed from: a */
    boolean mo55502a();

    /* renamed from: b */
    hw5<y23> mo55504b();

    /* renamed from: c */
    void mo52179c(CancellationException cancellationException);

    /* renamed from: g */
    Object mo55508g(ns0<? super r37> ns0);

    /* renamed from: h */
    CancellationException mo55510h();

    boolean isCancelled();

    /* renamed from: p */
    zh1 mo55519p(rc2<? super Throwable, r37> rc2);

    boolean start();

    /* renamed from: v */
    zh1 mo55528v(boolean z, boolean z2, rc2<? super Throwable, r37> rc2);
}
