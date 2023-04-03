package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J,\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, mo44877d2 = {"Lge2;", "T", "Lz42;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "d", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: ge2 */
/* compiled from: ChannelFlow.kt */
public interface ge2<T> extends z42<T> {

    @Metadata(mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* renamed from: ge2$a */
    /* compiled from: ChannelFlow.kt */
    public static final class C7125a {
        /* renamed from: a */
        public static /* synthetic */ z42 m58110a(ge2 ge2, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    coroutineContext = EmptyCoroutineContext.INSTANCE;
                }
                if ((i2 & 2) != 0) {
                    i = -3;
                }
                if ((i2 & 4) != 0) {
                    bufferOverflow = BufferOverflow.SUSPEND;
                }
                return ge2.mo51907d(coroutineContext, i, bufferOverflow);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    /* renamed from: d */
    z42<T> mo51907d(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow);
}
