package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.flow.StateFlowImpl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, mo44877d2 = {"Lv86;", "Ld7;", "Lkotlinx/coroutines/flow/StateFlowImpl;", "flow", "", "c", "(Lkotlinx/coroutines/flow/StateFlowImpl;)Z", "", "Lns0;", "Lr37;", "e", "(Lkotlinx/coroutines/flow/StateFlowImpl;)[Lns0;", "f", "()V", "g", "()Z", "d", "(Lns0;)Ljava/lang/Object;", "<init>", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: v86 */
/* compiled from: StateFlow.kt */
public final class v86 extends C6966d7<StateFlowImpl<?>> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f45246a = AtomicReferenceFieldUpdater.newUpdater(v86.class, Object.class, "_state");
    public volatile /* synthetic */ Object _state = null;

    /* renamed from: c */
    public boolean mo51147a(StateFlowImpl<?> stateFlowImpl) {
        if (this._state != null) {
            return false;
        }
        this._state = u86.f44929a;
        return true;
    }

    /* renamed from: d */
    public final Object mo66459d(ns0<? super r37> ns0) {
        na0 na0 = new na0(IntrinsicsKt__IntrinsicsJvmKt.m47425c(ns0), 1);
        na0.mo56425x();
        if (!C2265f6.m16607a(f45246a, this, u86.f44929a, na0)) {
            Result.C6167a aVar = Result.Companion;
            na0.resumeWith(Result.m75635constructorimpl(r37.f33317a));
        }
        Object s = na0.mo56421s();
        if (s == wx2.m54101d()) {
            a31.m31656c(ns0);
        }
        if (s == wx2.m54101d()) {
            return s;
        }
        return r37.f33317a;
    }

    /* renamed from: e */
    public ns0<r37>[] mo51148b(StateFlowImpl<?> stateFlowImpl) {
        this._state = null;
        return C6926c7.f37073a;
    }

    /* renamed from: f */
    public final void mo66461f() {
        while (true) {
            Object obj = this._state;
            if (obj != null && obj != u86.f44930b) {
                if (obj == u86.f44929a) {
                    if (C2265f6.m16607a(f45246a, this, obj, u86.f44930b)) {
                        return;
                    }
                } else if (C2265f6.m16607a(f45246a, this, obj, u86.f44929a)) {
                    Result.C6167a aVar = Result.Companion;
                    ((na0) obj).resumeWith(Result.m75635constructorimpl(r37.f33317a));
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public final boolean mo66462g() {
        Object andSet = f45246a.getAndSet(this, u86.f44929a);
        vx2.m53588d(andSet);
        if (andSet == u86.f44930b) {
            return true;
        }
        return false;
    }
}
