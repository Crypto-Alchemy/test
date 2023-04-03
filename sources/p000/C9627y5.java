package p000;

import com.fasterxml.jackson.core.JsonFactory;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobSupport;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u001f\u0012\u0006\u00102\u001a\u00020%\u0012\u0006\u00103\u001a\u00020\f\u0012\u0006\u00104\u001a\u00020\f¢\u0006\u0004\b5\u00106J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\u0012\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0004J\u001e\u0010\u0016\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\tJ\u0012\u0010\u0017\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u001b\u0010\u001cJJ\u0010#\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00028\u00012\"\u0010\"\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00110!ø\u0001\u0000¢\u0006\u0004\b#\u0010$R\u001d\u0010,\u001a\u00020%8\u0006¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010)R\u0014\u00101\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b/\u00100\u0002\u0004\n\u0002\b\u0019¨\u00067"}, mo44877d2 = {"Ly5;", "T", "Lkotlinx/coroutines/JobSupport;", "Ly23;", "Lns0;", "Lhu0;", "value", "Lr37;", "R0", "(Ljava/lang/Object;)V", "", "cause", "", "handled", "Q0", "", "V", "", "state", "z0", "Lkotlin/Result;", "result", "resumeWith", "P0", "exception", "k0", "(Ljava/lang/Throwable;)V", "u0", "()Ljava/lang/String;", "R", "Lkotlinx/coroutines/CoroutineStart;", "start", "receiver", "Lkotlin/Function2;", "block", "S0", "(Lkotlinx/coroutines/CoroutineStart;Ljava/lang/Object;Lfd2;)V", "Lkotlin/coroutines/CoroutineContext;", "d", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getContext$annotations", "()V", "context", "A", "coroutineContext", "a", "()Z", "isActive", "parentContext", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;ZZ)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: y5 */
/* compiled from: AbstractCoroutine.kt */
public abstract class C9627y5<T> extends JobSupport implements ns0<T>, hu0 {

    /* renamed from: d */
    public final CoroutineContext f46127d;

    public C9627y5(CoroutineContext coroutineContext, boolean z, boolean z2) {
        super(z2);
        if (z) {
            mo55516l0((y23) coroutineContext.get(y23.f46117l));
        }
        this.f46127d = coroutineContext.plus(this);
    }

    /* renamed from: A */
    public CoroutineContext mo6303A() {
        return this.f46127d;
    }

    /* renamed from: P0 */
    public void mo52756P0(Object obj) {
        mo52755N(obj);
    }

    /* renamed from: Q0 */
    public void mo67036Q0(Throwable th, boolean z) {
    }

    /* renamed from: R0 */
    public void mo67037R0(T t) {
    }

    /* renamed from: S0 */
    public final <R> void mo67038S0(CoroutineStart coroutineStart, R r, fd2<? super R, ? super ns0<? super T>, ? extends Object> fd2) {
        coroutineStart.invoke(fd2, r, this);
    }

    /* renamed from: V */
    public String mo55498V() {
        return b31.m55722a(this) + " was cancelled";
    }

    /* renamed from: a */
    public boolean mo55502a() {
        return super.mo55502a();
    }

    public final CoroutineContext getContext() {
        return this.f46127d;
    }

    /* renamed from: k0 */
    public final void mo55515k0(Throwable th) {
        gu0.m58254a(this.f46127d, th);
    }

    public final void resumeWith(Object obj) {
        Object s0 = mo55523s0(om0.m70402d(obj, (rc2) null, 1, (Object) null));
        if (s0 != k33.f38851b) {
            mo52756P0(s0);
        }
    }

    /* renamed from: u0 */
    public String mo55527u0() {
        String b = CoroutineContextKt.m63131b(this.f46127d);
        if (b == null) {
            return super.mo55527u0();
        }
        return JsonFactory.DEFAULT_QUOTE_CHAR + b + "\":" + super.mo55527u0();
    }

    /* renamed from: z0 */
    public final void mo55533z0(Object obj) {
        if (obj instanceof lm0) {
            lm0 lm0 = (lm0) obj;
            mo67036Q0(lm0.f40642a, lm0.mo55923a());
            return;
        }
        mo67037R0(obj);
    }
}
