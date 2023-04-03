package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u0015"}, mo44877d2 = {"Lkotlinx/coroutines/c;", "T", "Ljn5;", "", "state", "Lr37;", "N", "(Ljava/lang/Object;)V", "P0", "U0", "()Ljava/lang/Object;", "", "W0", "()Z", "V0", "Lkotlin/coroutines/CoroutineContext;", "context", "Lns0;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lns0;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.c */
/* compiled from: Builders.common.kt */
public final class C7759c<T> extends jn5<T> {

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f40365g = AtomicIntegerFieldUpdater.newUpdater(C7759c.class, "_decision");
    private volatile /* synthetic */ int _decision = 0;

    public C7759c(CoroutineContext coroutineContext, ns0<? super T> ns0) {
        super(coroutineContext, ns0);
    }

    /* renamed from: N */
    public void mo52755N(Object obj) {
        mo52756P0(obj);
    }

    /* renamed from: P0 */
    public void mo52756P0(Object obj) {
        if (!mo55571V0()) {
            mh1.m64330c(IntrinsicsKt__IntrinsicsJvmKt.m47425c(this.f38749e), om0.m70399a(obj, this.f38749e), (rc2) null, 2, (Object) null);
        }
    }

    /* renamed from: U0 */
    public final Object mo55570U0() {
        if (mo55572W0()) {
            return wx2.m54101d();
        }
        Object h = k33.m59674h(mo55512i0());
        if (!(h instanceof lm0)) {
            return h;
        }
        throw ((lm0) h).f40642a;
    }

    /* renamed from: V0 */
    public final boolean mo55571V0() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f40365g.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: W0 */
    public final boolean mo55572W0() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f40365g.compareAndSet(this, 0, 1));
        return true;
    }
}
