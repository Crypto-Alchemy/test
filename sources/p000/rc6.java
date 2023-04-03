package p000;

import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo44877d2 = {"Lrc6;", "Lt86;", "", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "delta", "", "a0", "Z", "()Ljava/lang/Integer;", "value", "initialValue", "<init>", "(I)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: rc6 */
/* compiled from: AbstractSharedFlow.kt */
public final class rc6 extends SharedFlowImpl<Integer> implements t86<Integer> {
    public rc6(int i) {
        super(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
        mo55645b(Integer.valueOf(i));
    }

    /* renamed from: Z */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(((Number) mo55632M()).intValue());
        }
        return valueOf;
    }

    /* renamed from: a0 */
    public final boolean mo65632a0(int i) {
        boolean b;
        synchronized (this) {
            b = mo55645b(Integer.valueOf(((Number) mo55632M()).intValue() + i));
        }
        return b;
    }
}
