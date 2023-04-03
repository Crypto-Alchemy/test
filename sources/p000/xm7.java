package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u0004J\u0015\u0010\u001d\u001a\u00020\u0011*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010%\u001a\u00020\"8@X\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8@X\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006*"}, mo44877d2 = {"Lxm7;", "", "Lvl6;", "h", "()Lvl6;", "task", "", "fair", "a", "(Lvl6;Z)Lvl6;", "victim", "", "l", "(Lxm7;)J", "k", "Lhh2;", "globalQueue", "Lr37;", "g", "(Lhh2;)V", "c", "(Lvl6;)Lvl6;", "blockingOnly", "m", "(Lxm7;Z)J", "queue", "j", "(Lhh2;)Z", "i", "d", "(Lvl6;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "", "e", "()I", "bufferSize", "f", "size", "<init>", "()V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: xm7 */
/* compiled from: WorkQueue.kt */
public final class xm7 {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f45970b;

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f45971c;

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f45972d;

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f45973e;

    /* renamed from: a */
    public final AtomicReferenceArray<vl6> f45974a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<xm7> cls = xm7.class;
        f45970b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f45971c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f45972d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f45973e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    /* renamed from: b */
    public static /* synthetic */ vl6 m73992b(xm7 xm7, vl6 vl6, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return xm7.mo66892a(vl6, z);
    }

    /* renamed from: a */
    public final vl6 mo66892a(vl6 vl6, boolean z) {
        if (z) {
            return mo66893c(vl6);
        }
        vl6 vl62 = (vl6) f45970b.getAndSet(this, vl6);
        if (vl62 == null) {
            return null;
        }
        return mo66893c(vl62);
    }

    /* renamed from: c */
    public final vl6 mo66893c(vl6 vl6) {
        boolean z = true;
        if (vl6.f45328d.mo50257b() != 1) {
            z = false;
        }
        if (z) {
            f45973e.incrementAndGet(this);
        }
        if (mo66895e() == 127) {
            return vl6;
        }
        int i = this.producerIndex & 127;
        while (this.f45974a.get(i) != null) {
            Thread.yield();
        }
        this.f45974a.lazySet(i, vl6);
        f45971c.incrementAndGet(this);
        return null;
    }

    /* renamed from: d */
    public final void mo66894d(vl6 vl6) {
        if (vl6 != null) {
            boolean z = true;
            if (vl6.f45328d.mo50257b() != 1) {
                z = false;
            }
            if (z) {
                f45973e.decrementAndGet(this);
            }
        }
    }

    /* renamed from: e */
    public final int mo66895e() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: f */
    public final int mo66896f() {
        if (this.lastScheduledTask != null) {
            return mo66895e() + 1;
        }
        return mo66895e();
    }

    /* renamed from: g */
    public final void mo66897g(hh2 hh2) {
        vl6 vl6 = (vl6) f45970b.getAndSet(this, (Object) null);
        if (vl6 != null) {
            hh2.mo51215a(vl6);
        }
        do {
        } while (mo66900j(hh2));
    }

    /* renamed from: h */
    public final vl6 mo66898h() {
        vl6 vl6 = (vl6) f45970b.getAndSet(this, (Object) null);
        if (vl6 == null) {
            return mo66899i();
        }
        return vl6;
    }

    /* renamed from: i */
    public final vl6 mo66899i() {
        vl6 andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f45972d.compareAndSet(this, i, i + 1) && (andSet = this.f45974a.getAndSet(i2, (Object) null)) != null) {
                mo66894d(andSet);
                return andSet;
            }
        }
    }

    /* renamed from: j */
    public final boolean mo66900j(hh2 hh2) {
        vl6 i = mo66899i();
        if (i == null) {
            return false;
        }
        hh2.mo51215a(i);
        return true;
    }

    /* renamed from: k */
    public final long mo66901k(xm7 xm7) {
        int i = xm7.consumerIndex;
        int i2 = xm7.producerIndex;
        AtomicReferenceArray<vl6> atomicReferenceArray = xm7.f45974a;
        while (true) {
            boolean z = true;
            if (i == i2) {
                break;
            }
            int i3 = i & 127;
            if (xm7.blockingTasksInBuffer == 0) {
                break;
            }
            vl6 vl6 = atomicReferenceArray.get(i3);
            if (vl6 != null) {
                if (vl6.f45328d.mo50257b() != 1) {
                    z = false;
                }
                if (z && wm7.m73690a(atomicReferenceArray, i3, vl6, (Object) null)) {
                    f45973e.decrementAndGet(xm7);
                    m73992b(this, vl6, false, 2, (Object) null);
                    return -1;
                }
            }
            i++;
        }
        return mo66903m(xm7, true);
    }

    /* renamed from: l */
    public final long mo66902l(xm7 xm7) {
        vl6 i = xm7.mo66899i();
        if (i == null) {
            return mo66903m(xm7, false);
        }
        m73992b(this, i, false, 2, (Object) null);
        return -1;
    }

    /* renamed from: m */
    public final long mo66903m(xm7 xm7, boolean z) {
        vl6 vl6;
        do {
            vl6 = (vl6) xm7.lastScheduledTask;
            if (vl6 == null) {
                return -2;
            }
            if (z) {
                boolean z2 = true;
                if (vl6.f45328d.mo50257b() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2;
                }
            }
            long a = km6.f38926e.mo51358a() - vl6.f45327a;
            long j = km6.f38922a;
            if (a < j) {
                return j - a;
            }
        } while (!C2265f6.m16607a(f45970b, xm7, vl6, (Object) null));
        m73992b(this, vl6, false, 2, (Object) null);
        return -1;
    }
}
