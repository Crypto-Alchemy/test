package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aC\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, mo44877d2 = {"Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "state", "Lkotlin/Function2;", "Lhu0;", "Lns0;", "Lr37;", "", "block", "a", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lfd2;Lns0;)Ljava/lang/Object;", "lifecycle-runtime-ktx_release"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* compiled from: RepeatOnLifecycle.kt */
public final class RepeatOnLifecycleKt {
    /* renamed from: a */
    public static final Object m5055a(Lifecycle lifecycle, Lifecycle.State state, fd2<? super hu0, ? super ns0<? super r37>, ? extends Object> fd2, ns0<? super r37> ns0) {
        boolean z;
        if (state != Lifecycle.State.INITIALIZED) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
        } else if (lifecycle.mo6296b() == Lifecycle.State.DESTROYED) {
            return r37.f33317a;
        } else {
            Object e = iu0.m59115e(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, fd2, (ns0<? super RepeatOnLifecycleKt$repeatOnLifecycle$3>) null), ns0);
            if (e == wx2.m54101d()) {
                return e;
            }
            return r37.f33317a;
        }
    }
}
