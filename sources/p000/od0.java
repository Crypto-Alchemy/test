package p000;

import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¨\u0006\n"}, mo44877d2 = {"E", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlin/Function1;", "Lr37;", "onUndeliveredElement", "Lfd0;", "a", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: od0 */
/* compiled from: Channel.kt */
public final class od0 {
    /* renamed from: a */
    public static final <E> fd0<E> m70235a(int i, BufferOverflow bufferOverflow, rc2<? super E, r37> rc2) {
        int i2 = 1;
        if (i == -2) {
            if (bufferOverflow == BufferOverflow.SUSPEND) {
                i2 = fd0.f37749f.mo51639a();
            }
            return new C6996dq(i2, bufferOverflow, rc2);
        } else if (i == -1) {
            if (bufferOverflow != BufferOverflow.SUSPEND) {
                i2 = 0;
            }
            if (i2 != 0) {
                return new kp0(rc2);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        } else if (i != 0) {
            if (i == Integer.MAX_VALUE) {
                return new rh3(rc2);
            }
            if (i == 1 && bufferOverflow == BufferOverflow.DROP_OLDEST) {
                return new kp0(rc2);
            }
            return new C6996dq(i, bufferOverflow, rc2);
        } else if (bufferOverflow == BufferOverflow.SUSPEND) {
            return new sd5(rc2);
        } else {
            return new C6996dq(1, bufferOverflow, rc2);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ fd0 m70236b(int i, BufferOverflow bufferOverflow, rc2 rc2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            rc2 = null;
        }
        return m70235a(i, bufferOverflow, rc2);
    }
}
