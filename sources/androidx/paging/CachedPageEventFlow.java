package androidx.paging;

import androidx.paging.multicast.Multicaster;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B#\u0012\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR&\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000f0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R#\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u00148\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, mo44877d2 = {"Landroidx/paging/CachedPageEventFlow;", "", "T", "Lr37;", "d", "(Lns0;)Ljava/lang/Object;", "Landroidx/paging/FlattenedPageController;", "a", "Landroidx/paging/FlattenedPageController;", "pageController", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "collectedFromSource", "Landroidx/paging/multicast/Multicaster;", "Lwt2;", "Lvk4;", "c", "Landroidx/paging/multicast/Multicaster;", "multicastedSrc", "Lz42;", "Lz42;", "e", "()Lz42;", "downstreamFlow", "src", "Lhu0;", "scope", "<init>", "(Lz42;Lhu0;)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: CachedPageEventFlow.kt */
public final class CachedPageEventFlow<T> {

    /* renamed from: a */
    public final FlattenedPageController<T> f6109a;

    /* renamed from: b */
    public final AtomicBoolean f6110b = new AtomicBoolean(false);

    /* renamed from: c */
    public final Multicaster<wt2<vk4<T>>> f6111c;

    /* renamed from: d */
    public final z42<vk4<T>> f6112d;

    public CachedPageEventFlow(z42<? extends vk4<T>> z42, hu0 hu0) {
        vx2.m53591g(z42, "src");
        vx2.m53591g(hu0, "scope");
        FlattenedPageController<T> flattenedPageController = new FlattenedPageController<>();
        this.f6109a = flattenedPageController;
        this.f6111c = new Multicaster(hu0, 0, e52.m57228t(new CachedPageEventFlow$multicastedSrc$1(this, z42, (ns0) null)), false, new CachedPageEventFlow$multicastedSrc$2(flattenedPageController), true, 8, (DefaultConstructorMarker) null);
        this.f6112d = SimpleChannelFlowKt.m8542a(new CachedPageEventFlow$downstreamFlow$1(this, (ns0) null));
    }

    /* renamed from: d */
    public final Object mo8641d(ns0<? super r37> ns0) {
        Object g = this.f6111c.mo8793g(ns0);
        if (g == wx2.m54101d()) {
            return g;
        }
        return r37.f33317a;
    }

    /* renamed from: e */
    public final z42<vk4<T>> mo8642e() {
        return this.f6112d;
    }
}
