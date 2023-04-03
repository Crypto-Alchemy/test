package p000;

import kotlin.Metadata;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J)\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, mo44877d2 = {"Lzz5;", "Ld7;", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "flow", "", "c", "", "Lns0;", "Lr37;", "d", "(Lkotlinx/coroutines/flow/SharedFlowImpl;)[Lns0;", "", "a", "J", "index", "b", "Lns0;", "cont", "<init>", "()V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: zz5 */
/* compiled from: SharedFlow.kt */
public final class zz5 extends C6966d7<SharedFlowImpl<?>> {

    /* renamed from: a */
    public long f46511a = -1;

    /* renamed from: b */
    public ns0<? super r37> f46512b;

    /* renamed from: c */
    public boolean mo51147a(SharedFlowImpl<?> sharedFlowImpl) {
        if (this.f46511a >= 0) {
            return false;
        }
        this.f46511a = sharedFlowImpl.mo55644Y();
        return true;
    }

    /* renamed from: d */
    public ns0<r37>[] mo51148b(SharedFlowImpl<?> sharedFlowImpl) {
        long j = this.f46511a;
        this.f46511a = -1;
        this.f46512b = null;
        return sharedFlowImpl.mo55643X(j);
    }
}
