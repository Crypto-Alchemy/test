package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HAø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0014\u0010\u0017\u001a\u00028\u00008\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, mo44877d2 = {"Lt75;", "T", "Lt86;", "", "Lge2;", "La52;", "collector", "", "a", "(La52;Lns0;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lz42;", "d", "Ly23;", "Ly23;", "job", "getValue", "()Ljava/lang/Object;", "value", "flow", "<init>", "(Lt86;Ly23;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: t75 */
/* compiled from: Share.kt */
public final class t75<T> implements t86<T>, z42, ge2<T> {

    /* renamed from: a */
    public final y23 f44675a;

    /* renamed from: d */
    public final /* synthetic */ t86<T> f44676d;

    public t75(t86<? extends T> t86, y23 y23) {
        this.f44675a = y23;
        this.f44676d = t86;
    }

    /* renamed from: a */
    public Object mo8646a(a52<? super T> a52, ns0<?> ns0) {
        return this.f44676d.mo8646a(a52, ns0);
    }

    /* renamed from: d */
    public z42<T> mo51907d(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return u86.m72661d(this, coroutineContext, i, bufferOverflow);
    }

    public T getValue() {
        return this.f44676d.getValue();
    }
}
