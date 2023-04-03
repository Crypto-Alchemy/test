package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000H\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a%\u0010\f\u001a\u0004\u0018\u00010\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0010\u001a\u00020\u000f*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\"\u001a\u0010\u001c\u001a\u00020\u00188\u0000X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u0012\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, mo44877d2 = {"T", "", "replay", "extraBufferCapacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lr04;", "a", "", "", "", "index", "f", "([Ljava/lang/Object;J)Ljava/lang/Object;", "item", "Lr37;", "g", "([Ljava/lang/Object;JLjava/lang/Object;)V", "Lxz5;", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lz42;", "e", "Lxj6;", "Lxj6;", "getNO_VALUE$annotations", "()V", "NO_VALUE", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: yz5 */
/* compiled from: SharedFlow.kt */
public final class yz5 {

    /* renamed from: a */
    public static final xj6 f46310a = new xj6("NO_VALUE");

    /* renamed from: a */
    public static final <T> r04<T> m74702a(int i, int i2, BufferOverflow bufferOverflow) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i <= 0 && i2 <= 0 && bufferOverflow != BufferOverflow.SUSPEND) {
                    z3 = false;
                }
                if (z3) {
                    int i3 = i2 + i;
                    if (i3 < 0) {
                        i3 = Integer.MAX_VALUE;
                    }
                    return new SharedFlowImpl(i, i3, bufferOverflow);
                }
                throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + bufferOverflow).toString());
            }
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i2).toString());
        }
        throw new IllegalArgumentException(("replay cannot be negative, but was " + i).toString());
    }

    /* renamed from: b */
    public static /* synthetic */ r04 m74703b(int i, int i2, BufferOverflow bufferOverflow, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return m74702a(i, i2, bufferOverflow);
    }

    /* renamed from: e */
    public static final <T> z42<T> m74706e(xz5<? extends T> xz5, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        if ((i == 0 || i == -3) && bufferOverflow == BufferOverflow.SUSPEND) {
            return xz5;
        }
        return new ld0(xz5, coroutineContext, i, bufferOverflow);
    }

    /* renamed from: f */
    public static final Object m74707f(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    /* renamed from: g */
    public static final void m74708g(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }
}
