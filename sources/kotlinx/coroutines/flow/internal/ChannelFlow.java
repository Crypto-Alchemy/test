package kotlinx.coroutines.flow.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J&\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH$J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH¤@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u000e\u001a\u00020\u0012H\u0016J!\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001b\u001a\u00020\u0019H\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR9\u0010%\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0!\u0012\u0006\u0012\u0004\u0018\u00010\"0 8@X\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00078@X\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, mo44877d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlow;", "T", "Lge2;", "Lz42;", "k", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "d", "j", "Lcw4;", "scope", "Lr37;", "i", "(Lcw4;Lns0;)Ljava/lang/Object;", "Lhu0;", "Lz75;", "n", "La52;", "collector", "a", "(La52;Lns0;)Ljava/lang/Object;", "", "f", "toString", "Lkotlin/coroutines/CoroutineContext;", "I", "e", "Lkotlinx/coroutines/channels/BufferOverflow;", "Lkotlin/Function2;", "Lns0;", "", "l", "()Lfd2;", "collectToFun", "m", "()I", "produceCapacity", "<init>", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: ChannelFlow.kt */
public abstract class ChannelFlow<T> implements ge2<T> {

    /* renamed from: a */
    public final CoroutineContext f40452a;

    /* renamed from: d */
    public final int f40453d;

    /* renamed from: e */
    public final BufferOverflow f40454e;

    public ChannelFlow(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        this.f40452a = coroutineContext;
        this.f40453d = i;
        this.f40454e = bufferOverflow;
    }

    /* renamed from: h */
    public static /* synthetic */ Object m63442h(ChannelFlow channelFlow, a52 a52, ns0 ns0) {
        Object e = iu0.m59115e(new ChannelFlow$collect$2(a52, channelFlow, (ns0<? super ChannelFlow$collect$2>) null), ns0);
        if (e == wx2.m54101d()) {
            return e;
        }
        return r37.f33317a;
    }

    /* renamed from: a */
    public Object mo8646a(a52<? super T> a52, ns0<? super r37> ns0) {
        return m63442h(this, a52, ns0);
    }

    /* renamed from: d */
    public z42<T> mo51907d(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        CoroutineContext plus = coroutineContext.plus(this.f40452a);
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            int i2 = this.f40453d;
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2 && (i2 = i2 + i) < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
                i = i2;
            }
            bufferOverflow = this.f40454e;
        }
        if (vx2.m53586b(plus, this.f40452a) && i == this.f40453d && bufferOverflow == this.f40454e) {
            return this;
        }
        return mo51900j(plus, i, bufferOverflow);
    }

    /* renamed from: f */
    public String mo51898f() {
        return null;
    }

    /* renamed from: i */
    public abstract Object mo51899i(cw4<? super T> cw4, ns0<? super r37> ns0);

    /* renamed from: j */
    public abstract ChannelFlow<T> mo51900j(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow);

    /* renamed from: k */
    public z42<T> mo51901k() {
        return null;
    }

    /* renamed from: l */
    public final fd2<cw4<? super T>, ns0<? super r37>, Object> mo55665l() {
        return new ChannelFlow$collectToFun$1(this, (ns0<? super ChannelFlow$collectToFun$1>) null);
    }

    /* renamed from: m */
    public final int mo55666m() {
        int i = this.f40453d;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    /* renamed from: n */
    public z75<T> mo51902n(hu0 hu0) {
        return uv4.m72985c(hu0, this.f40452a, mo55666m(), this.f40454e, CoroutineStart.ATOMIC, (rc2) null, mo55665l(), 16, (Object) null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String f = mo51898f();
        if (f != null) {
            arrayList.add(f);
        }
        if (this.f40452a != EmptyCoroutineContext.INSTANCE) {
            arrayList.add("context=" + this.f40452a);
        }
        if (this.f40453d != -3) {
            arrayList.add("capacity=" + this.f40453d);
        }
        if (this.f40454e != BufferOverflow.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f40454e);
        }
        return b31.m55722a(this) + '[' + CollectionsKt___CollectionsKt.m47338i0(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 62, (Object) null) + ']';
    }
}
