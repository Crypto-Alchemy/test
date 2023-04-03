package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118DX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158@X\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, mo44877d2 = {"Ljn5;", "T", "Ly5;", "Lju0;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "", "state", "Lr37;", "N", "P0", "Lns0;", "e", "Lns0;", "uCont", "getCallerFrame", "()Lju0;", "callerFrame", "", "n0", "()Z", "isScopedCoroutine", "Ly23;", "T0", "()Ly23;", "parent", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lns0;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: jn5 */
/* compiled from: Scopes.kt */
public class jn5<T> extends C9627y5<T> implements ju0 {

    /* renamed from: e */
    public final ns0<T> f38749e;

    public jn5(CoroutineContext coroutineContext, ns0<? super T> ns0) {
        super(coroutineContext, true, true);
        this.f38749e = ns0;
    }

    /* renamed from: N */
    public void mo52755N(Object obj) {
        mh1.m64330c(IntrinsicsKt__IntrinsicsJvmKt.m47425c(this.f38749e), om0.m70399a(obj, this.f38749e), (rc2) null, 2, (Object) null);
    }

    /* renamed from: P0 */
    public void mo52756P0(Object obj) {
        ns0<T> ns0 = this.f38749e;
        ns0.resumeWith(om0.m70399a(obj, ns0));
    }

    /* renamed from: T0 */
    public final y23 mo52757T0() {
        he0 h0 = mo55511h0();
        if (h0 != null) {
            return h0.getParent();
        }
        return null;
    }

    public final ju0 getCallerFrame() {
        ns0<T> ns0 = this.f38749e;
        if (ns0 instanceof ju0) {
            return (ju0) ns0;
        }
        return null;
    }

    /* renamed from: n0 */
    public final boolean mo52758n0() {
        return true;
    }
}
