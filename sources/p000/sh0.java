package p000;

import kotlin.Metadata;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0010\u001a\u00020\b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006#"}, mo44877d2 = {"Lsh0;", "E", "Lgu5;", "Lg85;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$b;", "otherOp", "Lxj6;", "D", "Lr37;", "A", "value", "f", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$b;)Lxj6;", "e", "(Ljava/lang/Object;)V", "closed", "C", "", "toString", "", "g", "Ljava/lang/Throwable;", "closeCause", "I", "()Ljava/lang/Throwable;", "sendException", "H", "receiveException", "F", "()Lsh0;", "offerResult", "G", "pollResult", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: sh0 */
/* compiled from: AbstractChannel.kt */
public final class sh0<E> extends gu5 implements g85<E> {

    /* renamed from: g */
    public final Throwable f44562g;

    public sh0(Throwable th) {
        this.f44562g = th;
    }

    /* renamed from: A */
    public void mo52015A() {
    }

    /* renamed from: C */
    public void mo52017C(sh0<?> sh0) {
    }

    /* renamed from: D */
    public xj6 mo52018D(LockFreeLinkedListNode.C7797b bVar) {
        return oa0.f43593a;
    }

    /* renamed from: F */
    public sh0<E> mo51882b() {
        return this;
    }

    /* renamed from: G */
    public sh0<E> mo52016B() {
        return this;
    }

    /* renamed from: H */
    public final Throwable mo65852H() {
        Throwable th = this.f44562g;
        if (th == null) {
            return new ClosedReceiveChannelException("Channel was closed");
        }
        return th;
    }

    /* renamed from: I */
    public final Throwable mo65853I() {
        Throwable th = this.f44562g;
        if (th == null) {
            return new ClosedSendChannelException("Channel was closed");
        }
        return th;
    }

    /* renamed from: e */
    public void mo51883e(E e) {
    }

    /* renamed from: f */
    public xj6 mo51884f(E e, LockFreeLinkedListNode.C7797b bVar) {
        return oa0.f43593a;
    }

    public String toString() {
        return "Closed@" + b31.m55723b(this) + '[' + this.f44562g + ']';
    }
}
