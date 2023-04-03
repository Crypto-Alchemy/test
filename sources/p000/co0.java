package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u0005\u001a\u00020\u00042\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001aK\u0010\u000e\u001a\u00020\r\"\b\b\u0000\u0010\u0007*\u00020\u0006\"\b\b\u0001\u0010\b*\u00020\u0006*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\n0\t2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, mo44877d2 = {"Ltp;", "applier", "Lwn0;", "parent", "Lvn0;", "a", "", "K", "V", "Leq2;", "Lfq2;", "key", "value", "Lr37;", "d", "(Leq2;Ljava/lang/Object;Ljava/lang/Object;)V", "Ljava/lang/Object;", "PendingApplyNoModifications", "runtime_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: co0 */
/* compiled from: Composition.kt */
public final class co0 {

    /* renamed from: a */
    public static final Object f8506a = new Object();

    /* renamed from: a */
    public static final vn0 m12004a(C3379tp<?> tpVar, wn0 wn0) {
        vx2.m53591g(tpVar, "applier");
        vx2.m53591g(wn0, "parent");
        return new bo0(wn0, tpVar, (CoroutineContext) null, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static final <K, V> void m12007d(eq2<K, fq2<V>> eq2, K k, V v) {
        if (eq2.mo19456b(k)) {
            fq2 e = eq2.mo19459e(k);
            if (e != null) {
                e.add(v);
                return;
            }
            return;
        }
        fq2 fq2 = new fq2();
        fq2.add(v);
        r37 r37 = r37.f33317a;
        eq2.mo19465k(k, fq2);
    }
}
