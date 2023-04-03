package androidx.compose.p004ui.platform;

import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p000.yx3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, mo44877d2 = {"Landroidx/compose/ui/platform/AndroidUiFrameClock;", "Lyx3;", "R", "Lkotlin/Function1;", "", "onFrame", "d", "(Lrc2;Lns0;)Ljava/lang/Object;", "Landroid/view/Choreographer;", "a", "Landroid/view/Choreographer;", "f", "()Landroid/view/Choreographer;", "choreographer", "<init>", "(Landroid/view/Choreographer;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.AndroidUiFrameClock */
/* compiled from: AndroidUiFrameClock.android.kt */
public final class AndroidUiFrameClock implements yx3 {

    /* renamed from: a */
    public final Choreographer f2012a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"R", "", "frameTimeNanos", "Lr37;", "doFrame", "(J)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.AndroidUiFrameClock$a */
    /* compiled from: AndroidUiFrameClock.android.kt */
    public static final class C0425a implements Choreographer.FrameCallback {

        /* renamed from: a */
        public final /* synthetic */ ma0<R> f2013a;

        /* renamed from: d */
        public final /* synthetic */ AndroidUiFrameClock f2014d;

        /* renamed from: e */
        public final /* synthetic */ rc2<Long, R> f2015e;

        public C0425a(ma0<? super R> ma0, AndroidUiFrameClock androidUiFrameClock, rc2<? super Long, ? extends R> rc2) {
            this.f2013a = ma0;
            this.f2014d = androidUiFrameClock;
            this.f2015e = rc2;
        }

        public final void doFrame(long j) {
            Object obj;
            ma0<R> ma0 = this.f2013a;
            rc2<Long, R> rc2 = this.f2015e;
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

    public AndroidUiFrameClock(Choreographer choreographer) {
        vx2.m53591g(choreographer, "choreographer");
        this.f2012a = choreographer;
    }

    /* renamed from: d */
    public <R> Object mo2869d(rc2<? super Long, ? extends R> rc2, ns0<? super R> ns0) {
        AndroidUiDispatcher androidUiDispatcher;
        CoroutineContext.C6188a aVar = ns0.getContext().get(ps0.f32794h);
        if (aVar instanceof AndroidUiDispatcher) {
            androidUiDispatcher = (AndroidUiDispatcher) aVar;
        } else {
            androidUiDispatcher = null;
        }
        na0 na0 = new na0(IntrinsicsKt__IntrinsicsJvmKt.m47425c(ns0), 1);
        na0.mo56425x();
        C0425a aVar2 = new C0425a(na0, this, rc2);
        if (androidUiDispatcher == null || !vx2.m53586b(androidUiDispatcher.mo3887X(), mo3902f())) {
            mo3902f().postFrameCallback(aVar2);
            na0.mo56166t(new AndroidUiFrameClock$withFrameNanos$2$2(this, aVar2));
        } else {
            androidUiDispatcher.mo3892g0(aVar2);
            na0.mo56166t(new AndroidUiFrameClock$withFrameNanos$2$1(androidUiDispatcher, aVar2));
        }
        Object s = na0.mo56421s();
        if (s == wx2.m54101d()) {
            a31.m31656c(ns0);
        }
        return s;
    }

    /* renamed from: f */
    public final Choreographer mo3902f() {
        return this.f2012a;
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
