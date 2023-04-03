package p000;

import kotlin.Metadata;
import kotlinx.coroutines.channels.AbstractChannel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00038DX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038DX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00038DX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00038DX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005¨\u0006\u0013"}, mo44877d2 = {"Lsd5;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "", "J", "()Z", "isBufferAlwaysEmpty", "K", "isBufferEmpty", "q", "isBufferAlwaysFull", "s", "isBufferFull", "Lkotlin/Function1;", "Lr37;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lrc2;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: sd5 */
/* compiled from: RendezvousChannel.kt */
public class sd5<E> extends AbstractChannel<E> {
    public sd5(rc2<? super E, r37> rc2) {
        super(rc2);
    }

    /* renamed from: J */
    public final boolean mo51251J() {
        return true;
    }

    /* renamed from: K */
    public final boolean mo51252K() {
        return true;
    }

    /* renamed from: q */
    public final boolean mo51261q() {
        return true;
    }

    /* renamed from: s */
    public final boolean mo51262s() {
        return true;
    }
}
