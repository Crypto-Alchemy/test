package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000R\u001a\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo44877d2 = {"Lgi4;", "", "affected", "c", "", "toString", "that", "", "b", "Ljs;", "a", "()Ljs;", "atomicOp", "<init>", "()V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: gi4 */
/* compiled from: Atomic.kt */
public abstract class gi4 {
    /* renamed from: a */
    public abstract C7311js<?> mo51927a();

    /* renamed from: b */
    public final boolean mo51928b(gi4 gi4) {
        C7311js<?> a;
        C7311js<?> a2 = mo51927a();
        if (a2 == null || (a = gi4.mo51927a()) == null || a2.mo52782f() >= a.mo52782f()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public abstract Object mo51929c(Object obj);

    public String toString() {
        return b31.m55722a(this) + '@' + b31.m55723b(this);
    }
}
