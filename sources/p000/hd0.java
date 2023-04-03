package p000;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010#\u001a\u00020\"\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010$\u001a\u00020\u0007\u0012\u0006\u0010%\u001a\u00020\u0007¢\u0006\u0004\b&\u0010'J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0003J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eHAø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u0000HAø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u000b\u001a\u00028\u0000H\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0019\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00078\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u0001\u0010 \u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006("}, mo44877d2 = {"Lhd0;", "E", "Ly5;", "Lr37;", "Lfd0;", "", "cause", "", "z", "Lmd0;", "iterator", "element", "offer", "(Ljava/lang/Object;)Z", "Lqd0;", "D", "(Lns0;)Ljava/lang/Object;", "u", "(Ljava/lang/Object;Lns0;)Ljava/lang/Object;", "r", "()Ljava/lang/Object;", "o", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "c", "S", "e", "Lfd0;", "T0", "()Lfd0;", "_channel", "()Z", "isClosedForSend", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lfd0;ZZ)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: hd0 */
/* compiled from: ChannelCoroutine.kt */
public class hd0<E> extends C9627y5<r37> implements fd0<E> {

    /* renamed from: e */
    public final fd0<E> f38193e;

    public hd0(CoroutineContext coroutineContext, fd0<E> fd0, boolean z, boolean z2) {
        super(coroutineContext, z, z2);
        this.f38193e = fd0;
    }

    /* renamed from: D */
    public Object mo52175D(ns0<? super qd0<? extends E>> ns0) {
        Object D = this.f38193e.mo52175D(ns0);
        wx2.m54101d();
        return D;
    }

    /* renamed from: E */
    public boolean mo52176E() {
        return this.f38193e.mo52176E();
    }

    /* renamed from: S */
    public void mo52177S(Throwable th) {
        CancellationException I0 = JobSupport.m63145I0(this, th, (String) null, 1, (Object) null);
        this.f38193e.mo52179c(I0);
        mo55494Q(I0);
    }

    /* renamed from: T0 */
    public final fd0<E> mo52178T0() {
        return this.f38193e;
    }

    /* renamed from: c */
    public final void mo52179c(CancellationException cancellationException) {
        if (!isCancelled()) {
            if (cancellationException == null) {
                cancellationException = new JobCancellationException(mo55498V(), (Throwable) null, this);
            }
            mo52177S(cancellationException);
        }
    }

    public md0<E> iterator() {
        return this.f38193e.iterator();
    }

    /* renamed from: o */
    public Object mo52181o(E e) {
        return this.f38193e.mo52181o(e);
    }

    public boolean offer(E e) {
        return this.f38193e.offer(e);
    }

    /* renamed from: r */
    public Object mo52183r() {
        return this.f38193e.mo52183r();
    }

    /* renamed from: u */
    public Object mo26027u(E e, ns0<? super r37> ns0) {
        return this.f38193e.mo26027u(e, ns0);
    }

    /* renamed from: z */
    public boolean mo26028z(Throwable th) {
        return this.f38193e.mo26028z(th);
    }
}
