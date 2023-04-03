package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B)\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0013\u0010\u0006\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\tR\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0010\u0010\u0018\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, mo44877d2 = {"Landroidx/paging/MulticastedPagingData;", "", "T", "Lcl4;", "a", "Lr37;", "b", "(Lns0;)Ljava/lang/Object;", "Landroidx/paging/CachedPageEventFlow;", "Landroidx/paging/CachedPageEventFlow;", "accumulated", "Lhu0;", "Lhu0;", "getScope", "()Lhu0;", "scope", "c", "Lcl4;", "getParent", "()Lcl4;", "parent", "Landroidx/paging/ActiveFlowTracker;", "d", "Landroidx/paging/ActiveFlowTracker;", "()Landroidx/paging/ActiveFlowTracker;", "tracker", "<init>", "(Lhu0;Lcl4;Landroidx/paging/ActiveFlowTracker;)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: CachedPagingData.kt */
public final class MulticastedPagingData<T> {

    /* renamed from: a */
    public final CachedPageEventFlow<T> f6142a;

    /* renamed from: b */
    public final hu0 f6143b;

    /* renamed from: c */
    public final cl4<T> f6144c;

    /* renamed from: d */
    public final ActiveFlowTracker f6145d;

    public MulticastedPagingData(hu0 hu0, cl4<T> cl4, ActiveFlowTracker activeFlowTracker) {
        vx2.m53591g(hu0, "scope");
        vx2.m53591g(cl4, "parent");
        this.f6143b = hu0;
        this.f6144c = cl4;
        this.f6145d = activeFlowTracker;
        this.f6142a = new CachedPageEventFlow<>(e52.m57201B(e52.m57203D(cl4.mo12107a(), new MulticastedPagingData$accumulated$1(this, (ns0) null)), new MulticastedPagingData$accumulated$2(this, (ns0) null)), hu0);
    }

    /* renamed from: a */
    public final cl4<T> mo8660a() {
        return new cl4<>(this.f6142a.mo8642e(), this.f6144c.mo12108b());
    }

    /* renamed from: b */
    public final Object mo8661b(ns0<? super r37> ns0) {
        Object d = this.f6142a.mo8641d(ns0);
        if (d == wx2.m54101d()) {
            return d;
        }
        return r37.f33317a;
    }

    /* renamed from: c */
    public final ActiveFlowTracker mo8662c() {
        return this.f6145d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MulticastedPagingData(hu0 hu0, cl4 cl4, ActiveFlowTracker activeFlowTracker, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(hu0, cl4, (i & 4) != 0 ? null : activeFlowTracker);
    }
}
