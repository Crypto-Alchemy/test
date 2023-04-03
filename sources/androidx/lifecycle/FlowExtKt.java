package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¨\u0006\u0007"}, mo44877d2 = {"T", "Lz42;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle$State;", "minActiveState", "a", "lifecycle-runtime-ktx_release"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* compiled from: FlowExt.kt */
public final class FlowExtKt {
    /* renamed from: a */
    public static final <T> z42<T> m5022a(z42<? extends T> z42, Lifecycle lifecycle, Lifecycle.State state) {
        vx2.m53591g(z42, "<this>");
        vx2.m53591g(lifecycle, "lifecycle");
        vx2.m53591g(state, "minActiveState");
        return e52.m57213e(new FlowExtKt$flowWithLifecycle$1(lifecycle, state, z42, (ns0<? super FlowExtKt$flowWithLifecycle$1>) null));
    }
}
