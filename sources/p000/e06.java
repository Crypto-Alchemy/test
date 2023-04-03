package p000;

import android.content.SharedPreferences;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: e06 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class e06 {

    /* renamed from: a */
    public final SharedPreferences f28357a;

    /* renamed from: b */
    public final String f28358b;

    /* renamed from: c */
    public final String f28359c;

    /* renamed from: d */
    public final ArrayDeque<String> f28360d = new ArrayDeque<>();

    /* renamed from: e */
    public final Executor f28361e;

    /* renamed from: f */
    public boolean f28362f = false;

    public e06(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f28357a = sharedPreferences;
        this.f28358b = "topic_operation_queue";
        this.f28359c = ",";
        this.f28361e = executor;
    }

    /* renamed from: c */
    public static e06 m43751c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        e06 e06 = new e06(sharedPreferences, "topic_operation_queue", ",", executor);
        e06.mo42101d();
        return e06;
    }

    /* renamed from: b */
    public final boolean mo42100b(boolean z) {
        if (!z || this.f28362f) {
            return z;
        }
        mo42106i();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42101d() {
        /*
            r6 = this;
            java.util.ArrayDeque<java.lang.String> r0 = r6.f28360d
            monitor-enter(r0)
            java.util.ArrayDeque<java.lang.String> r1 = r6.f28360d     // Catch:{ all -> 0x0040 }
            r1.clear()     // Catch:{ all -> 0x0040 }
            android.content.SharedPreferences r1 = r6.f28357a     // Catch:{ all -> 0x0040 }
            java.lang.String r2 = r6.f28358b     // Catch:{ all -> 0x0040 }
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)     // Catch:{ all -> 0x0040 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0040 }
            if (r2 != 0) goto L_0x003e
            java.lang.String r2 = r6.f28359c     // Catch:{ all -> 0x0040 }
            boolean r2 = r1.contains(r2)     // Catch:{ all -> 0x0040 }
            if (r2 != 0) goto L_0x0021
            goto L_0x003e
        L_0x0021:
            java.lang.String r2 = r6.f28359c     // Catch:{ all -> 0x0040 }
            r3 = -1
            java.lang.String[] r1 = r1.split(r2, r3)     // Catch:{ all -> 0x0040 }
            int r2 = r1.length     // Catch:{ all -> 0x0040 }
            r3 = 0
        L_0x002a:
            if (r3 >= r2) goto L_0x003c
            r4 = r1[r3]     // Catch:{ all -> 0x0040 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0040 }
            if (r5 != 0) goto L_0x0039
            java.util.ArrayDeque<java.lang.String> r5 = r6.f28360d     // Catch:{ all -> 0x0040 }
            r5.add(r4)     // Catch:{ all -> 0x0040 }
        L_0x0039:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x003e:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x0040:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e06.mo42101d():void");
    }

    /* renamed from: e */
    public String mo42102e() {
        String peek;
        synchronized (this.f28360d) {
            peek = this.f28360d.peek();
        }
        return peek;
    }

    /* renamed from: f */
    public boolean mo42103f(Object obj) {
        boolean remove;
        synchronized (this.f28360d) {
            remove = this.f28360d.remove(obj);
            mo42100b(remove);
        }
        return remove;
    }

    /* renamed from: g */
    public String mo42104g() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f28360d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.f28359c);
        }
        return sb.toString();
    }

    /* renamed from: h */
    public final void mo42099a() {
        synchronized (this.f28360d) {
            this.f28357a.edit().putString(this.f28358b, mo42104g()).commit();
        }
    }

    /* renamed from: i */
    public final void mo42106i() {
        this.f28361e.execute(new d06(this));
    }
}
