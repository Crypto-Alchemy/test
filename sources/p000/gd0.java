package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt__ChannelsKt;
import kotlinx.coroutines.flow.internal.ChannelFlow;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0006\u0010%\u001a\u00020#\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b&\u0010'J-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u000f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010$\u0002\u0004\n\u0002\b\u0019¨\u0006("}, mo44877d2 = {"Lgd0;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "j", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lz42;", "k", "()Lz42;", "Lcw4;", "scope", "Lr37;", "i", "(Lcw4;Lns0;)Ljava/lang/Object;", "Lhu0;", "Lz75;", "n", "(Lhu0;)Lz75;", "La52;", "collector", "a", "(La52;Lns0;)Ljava/lang/Object;", "", "f", "()Ljava/lang/String;", "o", "()V", "g", "Lz75;", "channel", "", "Z", "consume", "<init>", "(Lz75;ZLkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: gd0 */
/* compiled from: Channels.kt */
public final class gd0<T> extends ChannelFlow<T> {

    /* renamed from: r */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f38007r = AtomicIntegerFieldUpdater.newUpdater(gd0.class, "consumed");
    private volatile /* synthetic */ int consumed;

    /* renamed from: g */
    public final z75<T> f38008g;

    /* renamed from: k */
    public final boolean f38009k;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gd0(z75 z75, boolean z, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z75, z, (i2 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i2 & 8) != 0 ? -3 : i, (i2 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* renamed from: a */
    public Object mo8646a(a52<? super T> a52, ns0<? super r37> ns0) {
        if (this.f40453d == -3) {
            mo51903o();
            Object a = FlowKt__ChannelsKt.m63337d(a52, this.f38008g, this.f38009k, ns0);
            if (a == wx2.m54101d()) {
                return a;
            }
            return r37.f33317a;
        }
        Object a2 = super.mo8646a(a52, ns0);
        if (a2 == wx2.m54101d()) {
            return a2;
        }
        return r37.f33317a;
    }

    /* renamed from: f */
    public String mo51898f() {
        return "channel=" + this.f38008g;
    }

    /* renamed from: i */
    public Object mo51899i(cw4<? super T> cw4, ns0<? super r37> ns0) {
        Object a = FlowKt__ChannelsKt.m63337d(new gv5(cw4), this.f38008g, this.f38009k, ns0);
        if (a == wx2.m54101d()) {
            return a;
        }
        return r37.f33317a;
    }

    /* renamed from: j */
    public ChannelFlow<T> mo51900j(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return new gd0(this.f38008g, this.f38009k, coroutineContext, i, bufferOverflow);
    }

    /* renamed from: k */
    public z42<T> mo51901k() {
        return new gd0(this.f38008g, this.f38009k, (CoroutineContext) null, 0, (BufferOverflow) null, 28, (DefaultConstructorMarker) null);
    }

    /* renamed from: n */
    public z75<T> mo51902n(hu0 hu0) {
        mo51903o();
        if (this.f40453d == -3) {
            return this.f38008g;
        }
        return super.mo51902n(hu0);
    }

    /* renamed from: o */
    public final void mo51903o() {
        if (this.f38009k) {
            boolean z = true;
            if (f38007r.getAndSet(this, 1) != 0) {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }

    public gd0(z75<? extends T> z75, boolean z, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.f38008g = z75;
        this.f38009k = z;
        this.consumed = 0;
    }
}
