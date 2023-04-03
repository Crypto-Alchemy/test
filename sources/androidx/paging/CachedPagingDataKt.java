package androidx.paging;

import androidx.paging.multicast.Multicaster;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001aB\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¨\u0006\n"}, mo44877d2 = {"", "T", "Lz42;", "Lcl4;", "Lhu0;", "scope", "a", "Landroidx/paging/ActiveFlowTracker;", "tracker", "b", "paging-common"}, mo44878k = 2, mo44879mv = {1, 4, 2})
/* compiled from: CachedPagingData.kt */
public final class CachedPagingDataKt {
    /* renamed from: a */
    public static final <T> z42<cl4<T>> m8399a(z42<cl4<T>> z42, hu0 hu0) {
        vx2.m53591g(z42, "$this$cachedIn");
        vx2.m53591g(hu0, "scope");
        return m8400b(z42, hu0, (ActiveFlowTracker) null);
    }

    /* renamed from: b */
    public static final <T> z42<cl4<T>> m8400b(z42<cl4<T>> z42, hu0 hu0, ActiveFlowTracker activeFlowTracker) {
        vx2.m53591g(z42, "$this$cachedIn");
        vx2.m53591g(hu0, "scope");
        return new Multicaster(hu0, 1, e52.m57201B(e52.m57203D(new CachedPagingDataKt$cachedIn$$inlined$map$2(FlowExtKt.m8410b(new CachedPagingDataKt$cachedIn$$inlined$map$1(z42, hu0), new CachedPagingDataKt$cachedIn$multicastedFlow$2((ns0) null))), new CachedPagingDataKt$cachedIn$multicastedFlow$4(activeFlowTracker, (ns0) null)), new CachedPagingDataKt$cachedIn$multicastedFlow$5(activeFlowTracker, (ns0) null)), false, new CachedPagingDataKt$cachedIn$1((ns0) null), true, 8, (DefaultConstructorMarker) null).mo8795i();
    }
}
