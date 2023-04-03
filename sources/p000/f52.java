package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;
import p000.ge2;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\b"}, mo44877d2 = {"T", "Lz42;", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "a", "c", "kotlinx-coroutines-core"}, mo44878k = 5, mo44879mv = {1, 6, 0}, mo44882xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: f52 */
/* compiled from: Context.kt */
public final /* synthetic */ class f52 {
    /* renamed from: a */
    public static final <T> z42<T> m57616a(z42<? extends T> z42, int i, BufferOverflow bufferOverflow) {
        boolean z;
        BufferOverflow bufferOverflow2;
        int i2;
        boolean z2 = true;
        if (i >= 0 || i == -2 || i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i == -1 && bufferOverflow != BufferOverflow.SUSPEND) {
                z2 = false;
            }
            if (z2) {
                if (i == -1) {
                    bufferOverflow2 = BufferOverflow.DROP_OLDEST;
                    i2 = 0;
                } else {
                    i2 = i;
                    bufferOverflow2 = bufferOverflow;
                }
                if (z42 instanceof ge2) {
                    return ge2.C7125a.m58110a((ge2) z42, (CoroutineContext) null, i2, bufferOverflow2, 1, (Object) null);
                }
                return new ld0(z42, (CoroutineContext) null, i2, bufferOverflow2, 2, (DefaultConstructorMarker) null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i).toString());
    }

    /* renamed from: b */
    public static /* synthetic */ z42 m57617b(z42 z42, int i, BufferOverflow bufferOverflow, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return e52.m57211c(z42, i, bufferOverflow);
    }

    /* renamed from: c */
    public static final <T> z42<T> m57618c(z42<? extends T> z42) {
        return m57617b(z42, -1, (BufferOverflow) null, 2, (Object) null);
    }
}
