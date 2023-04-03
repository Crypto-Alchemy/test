package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import p000.yx3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J-\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, mo44877d2 = {"Landroidx/compose/runtime/PausableMonotonicFrameClock;", "Lyx3;", "Lr37;", "f", "i", "R", "Lkotlin/Function1;", "", "onFrame", "d", "(Lrc2;Lns0;)Ljava/lang/Object;", "a", "Lyx3;", "frameClock", "Landroidx/compose/runtime/Latch;", "Landroidx/compose/runtime/Latch;", "latch", "<init>", "(Lyx3;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: PausableMonotonicFrameClock.kt */
public final class PausableMonotonicFrameClock implements yx3 {

    /* renamed from: a */
    public final yx3 f1520a;

    /* renamed from: d */
    public final Latch f1521d = new Latch();

    public PausableMonotonicFrameClock(yx3 yx3) {
        vx2.m53591g(yx3, "frameClock");
        this.f1520a = yx3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063 A[PHI: r7 
      PHI: (r7v2 java.lang.Object) = (r7v4 java.lang.Object), (r7v1 java.lang.Object) binds: [B:19:0x0060, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <R> java.lang.Object mo2869d(p000.rc2<? super java.lang.Long, ? extends R> r6, p000.ns0<? super R> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 r0 = (androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 r0 = new androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            p000.hg5.m45199b(r7)
            goto L_0x0063
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.L$1
            rc2 r6 = (p000.rc2) r6
            java.lang.Object r2 = r0.L$0
            androidx.compose.runtime.PausableMonotonicFrameClock r2 = (androidx.compose.runtime.PausableMonotonicFrameClock) r2
            p000.hg5.m45199b(r7)
            goto L_0x0053
        L_0x0040:
            p000.hg5.m45199b(r7)
            androidx.compose.runtime.Latch r7 = r5.f1521d
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.mo3029c(r0)
            if (r7 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r2 = r5
        L_0x0053:
            yx3 r7 = r2.f1520a
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = r7.mo2869d(r6, r0)
            if (r7 != r1) goto L_0x0063
            return r1
        L_0x0063:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.PausableMonotonicFrameClock.mo2869d(rc2, ns0):java.lang.Object");
    }

    /* renamed from: f */
    public final void mo3042f() {
        this.f1521d.mo3030d();
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

    /* renamed from: i */
    public final void mo3043i() {
        this.f1521d.mo3032f();
    }

    public CoroutineContext minusKey(CoroutineContext.C6190b<?> bVar) {
        return yx3.C3700a.m30854c(this, bVar);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return yx3.C3700a.m30855d(this, coroutineContext);
    }
}
