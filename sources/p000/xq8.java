package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: xq8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class xq8<V> extends FutureTask<V> implements Comparable<xq8<V>> {

    /* renamed from: a */
    public final long f35676a;

    /* renamed from: d */
    public final boolean f35677d;

    /* renamed from: e */
    public final String f35678e;

    /* renamed from: g */
    public final /* synthetic */ cr8 f35679g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xq8(cr8 cr8, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.f35679g = cr8;
        cu4.m43221k(str);
        long andIncrement = cr8.f27893l.getAndIncrement();
        this.f35676a = andIncrement;
        this.f35678e = str;
        this.f35677d = z;
        if (andIncrement == Long.MAX_VALUE) {
            cr8.f34342a.mo45237A().mo29670l().mo48769a("Tasks index overflow");
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        xq8 xq8 = (xq8) obj;
        boolean z = this.f35677d;
        if (z == xq8.f35677d) {
            int i = (this.f35676a > xq8.f35676a ? 1 : (this.f35676a == xq8.f35676a ? 0 : -1));
            if (i < 0) {
                return -1;
            }
            if (i > 0) {
                return 1;
            }
            this.f35679g.f34342a.mo45237A().mo29671m().mo48770b("Two tasks share the same index. index", Long.valueOf(this.f35676a));
            return 0;
        } else if (!z) {
            return 1;
        } else {
            return -1;
        }
    }

    public final void setException(Throwable th) {
        this.f35679g.f34342a.mo45237A().mo29670l().mo48770b(this.f35678e, th);
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xq8(cr8 cr8, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.f35679g = cr8;
        cu4.m43221k("Task exception on worker thread");
        long andIncrement = cr8.f27893l.getAndIncrement();
        this.f35676a = andIncrement;
        this.f35678e = "Task exception on worker thread";
        this.f35677d = z;
        if (andIncrement == Long.MAX_VALUE) {
            cr8.f34342a.mo45237A().mo29670l().mo48769a("Tasks index overflow");
        }
    }
}
