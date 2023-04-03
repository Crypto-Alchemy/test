package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0006J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, mo44877d2 = {"Lqc6;", "T", "Lrh3;", "Lnc6;", "Lr37;", "P", "()V", "O", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "closed", "w", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "Lpc6;", "s", "onSubscribe", "(Lpc6;)V", "t", "onNext", "(Ljava/lang/Object;)V", "onComplete", "", "e", "onError", "(Ljava/lang/Throwable;)V", "", "g", "I", "request", "<init>", "(I)V", "kotlinx-coroutines-reactive"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: qc6 */
/* compiled from: Channel.kt */
public final class qc6<T> extends rh3<T> implements nc6<T> {

    /* renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f44168k;

    /* renamed from: r */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f44169r;
    private volatile /* synthetic */ int _requested;
    private volatile /* synthetic */ Object _subscription;

    /* renamed from: g */
    public final int f44170g;

    static {
        Class<qc6> cls = qc6.class;
        f44168k = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_subscription");
        f44169r = AtomicIntegerFieldUpdater.newUpdater(cls, "_requested");
    }

    public qc6(int i) {
        super((rc2) null);
        boolean z;
        this.f44170g = i;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this._subscription = null;
            this._requested = 0;
            return;
        }
        throw new IllegalArgumentException(("Invalid request size: " + i).toString());
    }

    /* renamed from: O */
    public void mo55577O() {
        f44169r.incrementAndGet(this);
    }

    /* renamed from: P */
    public void mo55578P() {
        pc6 pc6;
        int i;
        while (true) {
            int i2 = this._requested;
            pc6 = (pc6) this._subscription;
            i = i2 - 1;
            if (pc6 != null && i < 0) {
                int i3 = this.f44170g;
                if (i2 == i3 || f44169r.compareAndSet(this, i2, i3)) {
                    pc6.request((long) (this.f44170g - i));
                }
            } else if (f44169r.compareAndSet(this, i2, i)) {
                return;
            }
        }
        pc6.request((long) (this.f44170g - i));
    }

    public void onComplete() {
        mo26028z((Throwable) null);
    }

    public void onError(Throwable th) {
        mo26028z(th);
    }

    public void onNext(T t) {
        f44169r.decrementAndGet(this);
        mo52181o(t);
    }

    public void onSubscribe(pc6 pc6) {
        this._subscription = pc6;
        while (!mo52176E()) {
            int i = this._requested;
            int i2 = this.f44170g;
            if (i < i2) {
                if (f44169r.compareAndSet(this, i, i2)) {
                    pc6.request((long) (this.f44170g - i));
                    return;
                }
            } else {
                return;
            }
        }
        pc6.cancel();
    }

    /* renamed from: w */
    public void mo65441w(LockFreeLinkedListNode lockFreeLinkedListNode) {
        pc6 pc6 = (pc6) f44168k.getAndSet(this, (Object) null);
        if (pc6 != null) {
            pc6.cancel();
        }
    }
}
