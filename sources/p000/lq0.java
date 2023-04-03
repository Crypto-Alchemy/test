package p000;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: lq0 */
/* compiled from: ConstraintTracker */
public abstract class lq0<T> {

    /* renamed from: f */
    public static final String f14630f = qk3.m25728f("ConstraintTracker");

    /* renamed from: a */
    public final bm6 f14631a;

    /* renamed from: b */
    public final Context f14632b;

    /* renamed from: c */
    public final Object f14633c = new Object();

    /* renamed from: d */
    public final Set<kq0<T>> f14634d = new LinkedHashSet();

    /* renamed from: e */
    public T f14635e;

    /* renamed from: lq0$a */
    /* compiled from: ConstraintTracker */
    public class C2783a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ List f14636a;

        public C2783a(List list) {
            this.f14636a = list;
        }

        public void run() {
            for (kq0 a : this.f14636a) {
                a.mo21613a(lq0.this.f14635e);
            }
        }
    }

    public lq0(Context context, bm6 bm6) {
        this.f14632b = context.getApplicationContext();
        this.f14631a = bm6;
    }

    /* renamed from: a */
    public void mo22921a(kq0<T> kq0) {
        synchronized (this.f14633c) {
            if (this.f14634d.add(kq0)) {
                if (this.f14634d.size() == 1) {
                    this.f14635e = mo19843b();
                    qk3.m25726c().mo25135a(f14630f, String.format("%s: initial state = %s", new Object[]{getClass().getSimpleName(), this.f14635e}), new Throwable[0]);
                    mo20940e();
                }
                kq0.mo21613a(this.f14635e);
            }
        }
    }

    /* renamed from: b */
    public abstract T mo19843b();

    /* renamed from: c */
    public void mo22922c(kq0<T> kq0) {
        synchronized (this.f14633c) {
            if (this.f14634d.remove(kq0) && this.f14634d.isEmpty()) {
                mo20941f();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22923d(T r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f14633c
            monitor-enter(r0)
            T r1 = r3.f14635e     // Catch:{ all -> 0x002b }
            if (r1 == r4) goto L_0x0029
            if (r1 == 0) goto L_0x0010
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0010
            goto L_0x0029
        L_0x0010:
            r3.f14635e = r4     // Catch:{ all -> 0x002b }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x002b }
            java.util.Set<kq0<T>> r1 = r3.f14634d     // Catch:{ all -> 0x002b }
            r4.<init>(r1)     // Catch:{ all -> 0x002b }
            bm6 r1 = r3.f14631a     // Catch:{ all -> 0x002b }
            java.util.concurrent.Executor r1 = r1.mo11699a()     // Catch:{ all -> 0x002b }
            lq0$a r2 = new lq0$a     // Catch:{ all -> 0x002b }
            r2.<init>(r4)     // Catch:{ all -> 0x002b }
            r1.execute(r2)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lq0.mo22923d(java.lang.Object):void");
    }

    /* renamed from: e */
    public abstract void mo20940e();

    /* renamed from: f */
    public abstract void mo20941f();
}
