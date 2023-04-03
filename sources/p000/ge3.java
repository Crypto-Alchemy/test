package p000;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import p000.y23;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B6\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R3\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, mo44877d2 = {"Lge3;", "Lnc5;", "Lr37;", "a", "c", "b", "Lkotlin/Function2;", "Lhu0;", "Lns0;", "", "Lfd2;", "task", "Lhu0;", "scope", "Ly23;", "Ly23;", "job", "Lkotlin/coroutines/CoroutineContext;", "parentCoroutineContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lfd2;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ge3 */
/* compiled from: Effects.kt */
public final class ge3 implements nc5 {

    /* renamed from: a */
    public final fd2<hu0, ns0<? super r37>, Object> f12303a;

    /* renamed from: b */
    public final hu0 f12304b;

    /* renamed from: c */
    public y23 f12305c;

    public ge3(CoroutineContext coroutineContext, fd2<? super hu0, ? super ns0<? super r37>, ? extends Object> fd2) {
        vx2.m53591g(coroutineContext, "parentCoroutineContext");
        vx2.m53591g(fd2, "task");
        this.f12303a = fd2;
        this.f12304b = iu0.m59111a(coroutineContext);
    }

    /* renamed from: a */
    public void mo2988a() {
        y23 y23 = this.f12305c;
        if (y23 != null) {
            i33.m58817e(y23, "Old job was still running!", (Throwable) null, 2, (Object) null);
        }
        this.f12305c = d50.m56748b(this.f12304b, (CoroutineContext) null, (CoroutineStart) null, this.f12303a, 3, (Object) null);
    }

    /* renamed from: b */
    public void mo2989b() {
        y23 y23 = this.f12305c;
        if (y23 != null) {
            y23.C9621a.m74226a(y23, (CancellationException) null, 1, (Object) null);
        }
        this.f12305c = null;
    }

    /* renamed from: c */
    public void mo2990c() {
        y23 y23 = this.f12305c;
        if (y23 != null) {
            y23.C9621a.m74226a(y23, (CancellationException) null, 1, (Object) null);
        }
        this.f12305c = null;
    }
}
