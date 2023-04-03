package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\bf\u0018\u0000 \b2\u00020\u0001:\u0001\tJ-\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0001\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0003"}, mo44877d2 = {"Lyx3;", "Lkotlin/coroutines/CoroutineContext$a;", "R", "Lkotlin/Function1;", "", "onFrame", "d", "(Lrc2;Lns0;)Ljava/lang/Object;", "n", "b", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: yx3 */
/* compiled from: MonotonicFrameClock.kt */
public interface yx3 extends CoroutineContext.C6188a {

    /* renamed from: n */
    public static final C3701b f20400n = C3701b.f20401a;

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: yx3$a */
    /* compiled from: MonotonicFrameClock.kt */
    public static final class C3700a {
        /* renamed from: a */
        public static <R> R m30852a(yx3 yx3, R r, fd2<? super R, ? super CoroutineContext.C6188a, ? extends R> fd2) {
            vx2.m53591g(fd2, "operation");
            return CoroutineContext.C6188a.C6189a.m47418a(yx3, r, fd2);
        }

        /* renamed from: b */
        public static <E extends CoroutineContext.C6188a> E m30853b(yx3 yx3, CoroutineContext.C6190b<E> bVar) {
            vx2.m53591g(bVar, "key");
            return CoroutineContext.C6188a.C6189a.m47419b(yx3, bVar);
        }

        /* renamed from: c */
        public static CoroutineContext m30854c(yx3 yx3, CoroutineContext.C6190b<?> bVar) {
            vx2.m53591g(bVar, "key");
            return CoroutineContext.C6188a.C6189a.m47420c(yx3, bVar);
        }

        /* renamed from: d */
        public static CoroutineContext m30855d(yx3 yx3, CoroutineContext coroutineContext) {
            vx2.m53591g(coroutineContext, "context");
            return CoroutineContext.C6188a.C6189a.m47421d(yx3, coroutineContext);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo44877d2 = {"Lyx3$b;", "Lkotlin/coroutines/CoroutineContext$b;", "Lyx3;", "<init>", "()V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: yx3$b */
    /* compiled from: MonotonicFrameClock.kt */
    public static final class C3701b implements CoroutineContext.C6190b<yx3> {

        /* renamed from: a */
        public static final /* synthetic */ C3701b f20401a = new C3701b();
    }

    /* renamed from: d */
    <R> Object mo2869d(rc2<? super Long, ? extends R> rc2, ns0<? super R> ns0);
}
