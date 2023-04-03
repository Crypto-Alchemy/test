package p000;

import kotlin.Metadata;
import kotlinx.coroutines.JobSupport;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, mo44877d2 = {"Lj33;", "Lnm0;", "Lzh1;", "Lmt2;", "Lr37;", "dispose", "", "toString", "Lkotlinx/coroutines/JobSupport;", "g", "Lkotlinx/coroutines/JobSupport;", "B", "()Lkotlinx/coroutines/JobSupport;", "C", "(Lkotlinx/coroutines/JobSupport;)V", "job", "", "a", "()Z", "isActive", "Le84;", "c", "()Le84;", "list", "<init>", "()V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: j33 */
/* compiled from: JobSupport.kt */
public abstract class j33 extends nm0 implements zh1, mt2 {

    /* renamed from: g */
    public JobSupport f38582g;

    /* renamed from: B */
    public final JobSupport mo52613B() {
        JobSupport jobSupport = this.f38582g;
        if (jobSupport != null) {
            return jobSupport;
        }
        vx2.m53605u("job");
        return null;
    }

    /* renamed from: C */
    public final void mo52614C(JobSupport jobSupport) {
        this.f38582g = jobSupport;
    }

    /* renamed from: a */
    public boolean mo51282a() {
        return true;
    }

    /* renamed from: c */
    public e84 mo51283c() {
        return null;
    }

    public void dispose() {
        mo52613B().mo55478D0(this);
    }

    public String toString() {
        return b31.m55722a(this) + '@' + b31.m55723b(this) + "[job@" + b31.m55723b(mo52613B()) + ']';
    }
}
