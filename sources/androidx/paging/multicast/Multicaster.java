package androidx.paging.multicast;

import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bb\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0018\u0012\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001c\u0012\b\b\u0002\u0010!\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0013\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR3\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001c8\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001a\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, mo44877d2 = {"Landroidx/paging/multicast/Multicaster;", "T", "", "Lr37;", "g", "(Lns0;)Ljava/lang/Object;", "Landroidx/paging/multicast/ChannelManager;", "a", "Lef3;", "h", "()Landroidx/paging/multicast/ChannelManager;", "channelManager", "Lz42;", "b", "Lz42;", "i", "()Lz42;", "flow", "Lhu0;", "c", "Lhu0;", "scope", "d", "source", "", "e", "Z", "piggybackingDownstream", "Lkotlin/Function2;", "Lns0;", "f", "Lfd2;", "onEach", "keepUpstreamAlive", "", "bufferSize", "<init>", "(Lhu0;ILz42;ZLfd2;Z)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: Multicaster.kt */
public final class Multicaster<T> {

    /* renamed from: a */
    public final ef3 f6267a;

    /* renamed from: b */
    public final z42<T> f6268b;

    /* renamed from: c */
    public final hu0 f6269c;

    /* renamed from: d */
    public final z42<T> f6270d;

    /* renamed from: e */
    public final boolean f6271e;

    /* renamed from: f */
    public final fd2<T, ns0<? super r37>, Object> f6272f;

    /* renamed from: g */
    public final boolean f6273g;

    public Multicaster(hu0 hu0, int i, z42<? extends T> z42, boolean z, fd2<? super T, ? super ns0<? super r37>, ? extends Object> fd2, boolean z2) {
        vx2.m53591g(hu0, "scope");
        vx2.m53591g(z42, "source");
        vx2.m53591g(fd2, "onEach");
        this.f6269c = hu0;
        this.f6270d = z42;
        this.f6271e = z;
        this.f6272f = fd2;
        this.f6273g = z2;
        this.f6267a = C6169a.m47233b(LazyThreadSafetyMode.SYNCHRONIZED, new Multicaster$channelManager$2(this, i));
        this.f6268b = e52.m57228t(new Multicaster$flow$1(this, (ns0) null));
    }

    /* renamed from: g */
    public final Object mo8793g(ns0<? super r37> ns0) {
        Object h = mo8794h().mo8764h(ns0);
        if (h == wx2.m54101d()) {
            return h;
        }
        return r37.f33317a;
    }

    /* renamed from: h */
    public final ChannelManager<T> mo8794h() {
        return (ChannelManager) this.f6267a.getValue();
    }

    /* renamed from: i */
    public final z42<T> mo8795i() {
        return this.f6268b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Multicaster(hu0 hu0, int i, z42 z42, boolean z, fd2 fd2, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(hu0, (i2 & 2) != 0 ? 0 : i, z42, (i2 & 8) != 0 ? false : z, fd2, (i2 & 32) != 0 ? false : z2);
    }
}
