package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Lh06;", "T", "", "Lz42;", "a", "Lz42;", "upstream", "", "b", "I", "extraBufferCapacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "c", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlin/coroutines/CoroutineContext;", "d", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lz42;ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: h06 */
/* compiled from: Share.kt */
public final class h06<T> {

    /* renamed from: a */
    public final z42<T> f38138a;

    /* renamed from: b */
    public final int f38139b;

    /* renamed from: c */
    public final BufferOverflow f38140c;

    /* renamed from: d */
    public final CoroutineContext f38141d;

    public h06(z42<? extends T> z42, int i, BufferOverflow bufferOverflow, CoroutineContext coroutineContext) {
        this.f38138a = z42;
        this.f38139b = i;
        this.f38140c = bufferOverflow;
        this.f38141d = coroutineContext;
    }
}
