package androidx.compose.runtime;

import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p000.yx3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u000b\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, mo44877d2 = {"Landroidx/compose/runtime/DefaultChoreographerFrameClock;", "Lyx3;", "R", "Lkotlin/Function1;", "", "onFrame", "d", "(Lrc2;Lns0;)Ljava/lang/Object;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "Landroid/view/Choreographer;", "choreographer", "<init>", "()V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ActualAndroid.android.kt */
public final class DefaultChoreographerFrameClock implements yx3 {

    /* renamed from: a */
    public static final DefaultChoreographerFrameClock f1510a = new DefaultChoreographerFrameClock();

    /* renamed from: d */
    public static final Choreographer f1511d = ((Choreographer) b50.m55766c(qh1.m71266c().mo55551K(), new DefaultChoreographerFrameClock$choreographer$1((ns0<? super DefaultChoreographerFrameClock$choreographer$1>) null)));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"R", "", "frameTimeNanos", "Lr37;", "doFrame", "(J)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.runtime.DefaultChoreographerFrameClock$a */
    /* compiled from: ActualAndroid.android.kt */
    public static final class C0340a implements Choreographer.FrameCallback {

        /* renamed from: a */
        public final /* synthetic */ ma0<R> f1512a;

        /* renamed from: d */
        public final /* synthetic */ rc2<Long, R> f1513d;

        public C0340a(ma0<? super R> ma0, rc2<? super Long, ? extends R> rc2) {
            this.f1512a = ma0;
            this.f1513d = rc2;
        }

        public final void doFrame(long j) {
            Object obj;
            ma0<R> ma0 = this.f1512a;
            DefaultChoreographerFrameClock defaultChoreographerFrameClock = DefaultChoreographerFrameClock.f1510a;
            rc2<Long, R> rc2 = this.f1513d;
            try {
                Result.C6167a aVar = Result.Companion;
                obj = Result.m75635constructorimpl(rc2.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                Result.C6167a aVar2 = Result.Companion;
                obj = Result.m75635constructorimpl(hg5.m45198a(th));
            }
            ma0.resumeWith(obj);
        }
    }

    /* renamed from: d */
    public <R> Object mo2869d(rc2<? super Long, ? extends R> rc2, ns0<? super R> ns0) {
        na0 na0 = new na0(IntrinsicsKt__IntrinsicsJvmKt.m47425c(ns0), 1);
        na0.mo56425x();
        C0340a aVar = new C0340a(na0, rc2);
        f1511d.postFrameCallback(aVar);
        na0.mo56166t(new DefaultChoreographerFrameClock$withFrameNanos$2$1(aVar));
        Object s = na0.mo56421s();
        if (s == wx2.m54101d()) {
            a31.m31656c(ns0);
        }
        return s;
    }

    public <R> R fold(R r, fd2<? super R, ? super CoroutineContext.C6188a, ? extends R> fd2) {
        return yx3.C3700a.m30852a(this, r, fd2);
    }

    public <E extends CoroutineContext.C6188a> E get(CoroutineContext.C6190b<E> bVar) {
        return yx3.C3700a.m30853b(this, bVar);
    }

    public /* synthetic */ CoroutineContext.C6190b getKey() {
        return xx3.m30341a(this);
    }

    public CoroutineContext minusKey(CoroutineContext.C6190b<?> bVar) {
        return yx3.C3700a.m30854c(this, bVar);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return yx3.C3700a.m30855d(this, coroutineContext);
    }
}
