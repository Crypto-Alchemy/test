package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, mo44877d2 = {"Ldk3;", "", "E", "Lr37;", "b", "()V", "element", "", "a", "(Ljava/lang/Object;)Z", "d", "()Ljava/lang/Object;", "", "c", "()I", "size", "singleConsumer", "<init>", "(Z)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: dk3 */
/* compiled from: LockFreeTaskQueue.kt */
public class dk3<E> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f37313a = AtomicReferenceFieldUpdater.newUpdater(dk3.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public dk3(boolean z) {
        this._cur = new ek3(8, z);
    }

    /* renamed from: a */
    public final boolean mo51215a(E e) {
        while (true) {
            ek3 ek3 = (ek3) this._cur;
            int a = ek3.mo51492a(e);
            if (a == 0) {
                return true;
            }
            if (a == 1) {
                C2265f6.m16607a(f37313a, this, ek3, ek3.mo51500i());
            } else if (a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void mo51216b() {
        while (true) {
            ek3 ek3 = (ek3) this._cur;
            if (!ek3.mo51495d()) {
                C2265f6.m16607a(f37313a, this, ek3, ek3.mo51500i());
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final int mo51217c() {
        return ((ek3) this._cur).mo51497f();
    }

    /* renamed from: d */
    public final E mo51218d() {
        while (true) {
            ek3 ek3 = (ek3) this._cur;
            E j = ek3.mo51501j();
            if (j != ek3.f37566h) {
                return j;
            }
            C2265f6.m16607a(f37313a, this, ek3, ek3.mo51500i());
        }
    }
}
