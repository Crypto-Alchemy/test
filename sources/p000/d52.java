package p000;

import kotlin.Metadata;
import kotlinx.coroutines.flow.internal.AbortFlowException;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0000¨\u0006\u0005"}, mo44877d2 = {"Lkotlinx/coroutines/flow/internal/AbortFlowException;", "La52;", "owner", "Lr37;", "a", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: d52 */
/* compiled from: FlowExceptions.common.kt */
public final class d52 {
    /* renamed from: a */
    public static final void m56750a(AbortFlowException abortFlowException, a52<?> a52) {
        if (abortFlowException.owner != a52) {
            throw abortFlowException;
        }
    }
}
