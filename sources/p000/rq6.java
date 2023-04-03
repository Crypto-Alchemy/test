package p000;

import kotlin.Metadata;
import kotlinx.coroutines.TimeoutKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000f\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, mo44877d2 = {"Lrq6;", "U", "T", "Ljn5;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lr37;", "run", "", "u0", "()Ljava/lang/String;", "", "g", "J", "time", "Lns0;", "uCont", "<init>", "(JLns0;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: rq6 */
/* compiled from: Timeout.kt */
public final class rq6<U, T extends U> extends jn5<T> implements Runnable {

    /* renamed from: g */
    public final long f44445g;

    public rq6(long j, ns0<? super U> ns0) {
        super(ns0.getContext(), ns0);
        this.f44445g = j;
    }

    public void run() {
        mo55494Q(TimeoutKt.m63230a(this.f44445g, this));
    }

    /* renamed from: u0 */
    public String mo55527u0() {
        return super.mo55527u0() + "(timeMillis=" + this.f44445g + ')';
    }
}
