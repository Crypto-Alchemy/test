package androidx.paging.multicast;

import androidx.paging.multicast.ChannelManager;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import p000.y23;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BJ\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012(\u0010\u0018\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0004\u001a\u00020\u0003J\u0013\u0010\u0005\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\u0003R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R9\u0010\u0018\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00148\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, mo44877d2 = {"Landroidx/paging/multicast/SharedFlowProducer;", "T", "", "Lr37;", "f", "e", "(Lns0;)Ljava/lang/Object;", "d", "Ly23;", "a", "Ly23;", "collectionJob", "Lhu0;", "b", "Lhu0;", "scope", "Lz42;", "c", "Lz42;", "src", "Lkotlin/Function2;", "Landroidx/paging/multicast/ChannelManager$b$b;", "Lns0;", "Lfd2;", "sendUpsteamMessage", "<init>", "(Lhu0;Lz42;Lfd2;)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: SharedFlowProducer.kt */
public final class SharedFlowProducer<T> {

    /* renamed from: a */
    public final y23 f6276a;

    /* renamed from: b */
    public final hu0 f6277b;

    /* renamed from: c */
    public final z42<T> f6278c;

    /* renamed from: d */
    public final fd2<ChannelManager.C1194b.C1196b<T>, ns0<? super r37>, Object> f6279d;

    public SharedFlowProducer(hu0 hu0, z42<? extends T> z42, fd2<? super ChannelManager.C1194b.C1196b<T>, ? super ns0<? super r37>, ? extends Object> fd2) {
        vx2.m53591g(hu0, "scope");
        vx2.m53591g(z42, "src");
        vx2.m53591g(fd2, "sendUpsteamMessage");
        this.f6277b = hu0;
        this.f6278c = z42;
        this.f6279d = fd2;
        this.f6276a = d50.m56748b(hu0, (CoroutineContext) null, CoroutineStart.LAZY, new SharedFlowProducer$collectionJob$1(this, (ns0) null), 1, (Object) null);
    }

    /* renamed from: d */
    public final void mo8797d() {
        y23.C9621a.m74226a(this.f6276a, (CancellationException) null, 1, (Object) null);
    }

    /* renamed from: e */
    public final Object mo8798e(ns0<? super r37> ns0) {
        Object g = g33.m58010g(this.f6276a, ns0);
        if (g == wx2.m54101d()) {
            return g;
        }
        return r37.f33317a;
    }

    /* renamed from: f */
    public final void mo8799f() {
        y23 unused = d50.m56748b(this.f6277b, (CoroutineContext) null, (CoroutineStart) null, new SharedFlowProducer$start$1(this, (ns0) null), 3, (Object) null);
    }
}
