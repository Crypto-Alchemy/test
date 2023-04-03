package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import p000.yx3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, mo44877d2 = {"Landroidx/compose/runtime/SdkStubsFallbackFrameClock;", "Lyx3;", "R", "Lkotlin/Function1;", "", "onFrame", "d", "(Lrc2;Lns0;)Ljava/lang/Object;", "<init>", "()V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ActualAndroid.android.kt */
public final class SdkStubsFallbackFrameClock implements yx3 {

    /* renamed from: a */
    public static final SdkStubsFallbackFrameClock f1564a = new SdkStubsFallbackFrameClock();

    /* renamed from: d */
    public <R> Object mo2869d(rc2<? super Long, ? extends R> rc2, ns0<? super R> ns0) {
        return b50.m55768e(qh1.m71266c(), new SdkStubsFallbackFrameClock$withFrameNanos$2(rc2, (ns0<? super SdkStubsFallbackFrameClock$withFrameNanos$2>) null), ns0);
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
