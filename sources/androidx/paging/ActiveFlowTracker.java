package androidx.paging;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001:\u0001\bJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, mo44877d2 = {"Landroidx/paging/ActiveFlowTracker;", "", "Landroidx/paging/ActiveFlowTracker$FlowType;", "flowType", "Lr37;", "b", "(Landroidx/paging/ActiveFlowTracker$FlowType;Lns0;)Ljava/lang/Object;", "a", "FlowType", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: CachedPagingData.kt */
public interface ActiveFlowTracker {

    @Metadata(mo44875bv = {1, 0, 3}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo44877d2 = {"Landroidx/paging/ActiveFlowTracker$FlowType;", "", "(Ljava/lang/String;I)V", "PAGED_DATA_FLOW", "PAGE_EVENT_FLOW", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* compiled from: CachedPagingData.kt */
    public enum FlowType {
        PAGED_DATA_FLOW,
        PAGE_EVENT_FLOW
    }

    /* renamed from: a */
    Object mo8625a(FlowType flowType, ns0<? super r37> ns0);

    /* renamed from: b */
    Object mo8626b(FlowType flowType, ns0<? super r37> ns0);
}
