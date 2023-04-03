package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bg7 */
public class bg7 {

    /* renamed from: n */
    public static ScheduledExecutorService f21286n;

    /* renamed from: o */
    public static volatile C3893a f21287o = new q48();

    /* renamed from: a */
    public final Object f21288a;

    /* renamed from: b */
    public final PowerManager.WakeLock f21289b;

    /* renamed from: c */
    public WorkSource f21290c;

    /* renamed from: d */
    public final int f21291d;

    /* renamed from: e */
    public final String f21292e;

    /* renamed from: f */
    public final String f21293f;

    /* renamed from: g */
    public final String f21294g;

    /* renamed from: h */
    public final Context f21295h;

    /* renamed from: i */
    public boolean f21296i;

    /* renamed from: j */
    public final Map<String, Integer[]> f21297j;

    /* renamed from: k */
    public final Set<Future<?>> f21298k;

    /* renamed from: l */
    public int f21299l;

    /* renamed from: m */
    public AtomicInteger f21300m;

    /* renamed from: bg7$a */
    public interface C3893a {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public bg7(Context context, int i, String str) {
        this(context, i, str, (String) null, context == null ? null : context.getPackageName());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r2 == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (r13.f21299l == 0) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        p000.eg7.m43971a().mo42314c(r13.f21295h, p000.p96.m49833a(r13.f21289b, r6), 7, r13.f21292e, r6, (java.lang.String) null, r13.f21291d, mo29575e(), r14);
        r13.f21299l++;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29571a(long r14) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r13.f21300m
            r0.incrementAndGet()
            r0 = 0
            java.lang.String r6 = r13.mo29574d(r0)
            java.lang.Object r0 = r13.f21288a
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f21297j     // Catch:{ all -> 0x0096 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0096 }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            int r1 = r13.f21299l     // Catch:{ all -> 0x0096 }
            if (r1 <= 0) goto L_0x0029
        L_0x001a:
            android.os.PowerManager$WakeLock r1 = r13.f21289b     // Catch:{ all -> 0x0096 }
            boolean r1 = r1.isHeld()     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0029
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f21297j     // Catch:{ all -> 0x0096 }
            r1.clear()     // Catch:{ all -> 0x0096 }
            r13.f21299l = r2     // Catch:{ all -> 0x0096 }
        L_0x0029:
            boolean r1 = r13.f21296i     // Catch:{ all -> 0x0096 }
            r12 = 1
            if (r1 == 0) goto L_0x0056
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f21297j     // Catch:{ all -> 0x0096 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0096 }
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0047
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f21297j     // Catch:{ all -> 0x0096 }
            java.lang.Integer[] r3 = new java.lang.Integer[r12]     // Catch:{ all -> 0x0096 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0096 }
            r3[r2] = r4     // Catch:{ all -> 0x0096 }
            r1.put(r6, r3)     // Catch:{ all -> 0x0096 }
            r2 = r12
            goto L_0x0054
        L_0x0047:
            r3 = r1[r2]     // Catch:{ all -> 0x0096 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0096 }
            int r3 = r3 + r12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0096 }
            r1[r2] = r3     // Catch:{ all -> 0x0096 }
        L_0x0054:
            if (r2 != 0) goto L_0x005e
        L_0x0056:
            boolean r1 = r13.f21296i     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x007d
            int r1 = r13.f21299l     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x007d
        L_0x005e:
            eg7 r1 = p000.eg7.m43971a()     // Catch:{ all -> 0x0096 }
            android.content.Context r2 = r13.f21295h     // Catch:{ all -> 0x0096 }
            android.os.PowerManager$WakeLock r3 = r13.f21289b     // Catch:{ all -> 0x0096 }
            java.lang.String r3 = p000.p96.m49833a(r3, r6)     // Catch:{ all -> 0x0096 }
            r4 = 7
            java.lang.String r5 = r13.f21292e     // Catch:{ all -> 0x0096 }
            r7 = 0
            int r8 = r13.f21291d     // Catch:{ all -> 0x0096 }
            java.util.List r9 = r13.mo29575e()     // Catch:{ all -> 0x0096 }
            r10 = r14
            r1.mo42314c(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0096 }
            int r1 = r13.f21299l     // Catch:{ all -> 0x0096 }
            int r1 = r1 + r12
            r13.f21299l = r1     // Catch:{ all -> 0x0096 }
        L_0x007d:
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            android.os.PowerManager$WakeLock r0 = r13.f21289b
            r0.acquire()
            r0 = 0
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0095
            java.util.concurrent.ScheduledExecutorService r0 = f21286n
            ka8 r1 = new ka8
            r1.<init>(r13)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r14, r2)
        L_0x0095:
            return
        L_0x0096:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bg7.mo29571a(long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        if (r1 != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (r12.f21299l == 1) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        p000.eg7.m43971a().mo42313b(r12.f21295h, p000.p96.m49833a(r12.f21289b, r6), 8, r12.f21292e, r6, (java.lang.String) null, r12.f21291d, mo29575e());
        r12.f21299l--;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29572b() {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r12.f21300m
            int r0 = r0.decrementAndGet()
            if (r0 >= 0) goto L_0x0013
            java.lang.String r0 = r12.f21292e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = " release without a matched acquire!"
            r0.concat(r1)
        L_0x0013:
            r0 = 0
            java.lang.String r6 = r12.mo29574d(r0)
            java.lang.Object r0 = r12.f21288a
            monitor-enter(r0)
            boolean r1 = r12.f21296i     // Catch:{ all -> 0x0078 }
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L_0x004c
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.f21297j     // Catch:{ all -> 0x0078 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0078 }
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch:{ all -> 0x0078 }
            if (r1 != 0) goto L_0x002d
        L_0x002b:
            r1 = r11
            goto L_0x004a
        L_0x002d:
            r2 = r1[r11]     // Catch:{ all -> 0x0078 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0078 }
            if (r2 != r10) goto L_0x003c
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.f21297j     // Catch:{ all -> 0x0078 }
            r1.remove(r6)     // Catch:{ all -> 0x0078 }
            r1 = r10
            goto L_0x004a
        L_0x003c:
            r2 = r1[r11]     // Catch:{ all -> 0x0078 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0078 }
            int r2 = r2 - r10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0078 }
            r1[r11] = r2     // Catch:{ all -> 0x0078 }
            goto L_0x002b
        L_0x004a:
            if (r1 != 0) goto L_0x0054
        L_0x004c:
            boolean r1 = r12.f21296i     // Catch:{ all -> 0x0078 }
            if (r1 != 0) goto L_0x0073
            int r1 = r12.f21299l     // Catch:{ all -> 0x0078 }
            if (r1 != r10) goto L_0x0073
        L_0x0054:
            eg7 r1 = p000.eg7.m43971a()     // Catch:{ all -> 0x0078 }
            android.content.Context r2 = r12.f21295h     // Catch:{ all -> 0x0078 }
            android.os.PowerManager$WakeLock r3 = r12.f21289b     // Catch:{ all -> 0x0078 }
            java.lang.String r3 = p000.p96.m49833a(r3, r6)     // Catch:{ all -> 0x0078 }
            r4 = 8
            java.lang.String r5 = r12.f21292e     // Catch:{ all -> 0x0078 }
            r7 = 0
            int r8 = r12.f21291d     // Catch:{ all -> 0x0078 }
            java.util.List r9 = r12.mo29575e()     // Catch:{ all -> 0x0078 }
            r1.mo42313b(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0078 }
            int r1 = r12.f21299l     // Catch:{ all -> 0x0078 }
            int r1 = r1 - r10
            r12.f21299l = r1     // Catch:{ all -> 0x0078 }
        L_0x0073:
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            r12.mo29576f(r11)
            return
        L_0x0078:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bg7.mo29572b():void");
    }

    /* renamed from: c */
    public void mo29573c(boolean z) {
        this.f21289b.setReferenceCounted(z);
        this.f21296i = z;
    }

    /* renamed from: d */
    public final String mo29574d(String str) {
        if (!this.f21296i) {
            return this.f21293f;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return this.f21293f;
    }

    /* renamed from: e */
    public final List<String> mo29575e() {
        return zm7.m55148d(this.f21290c);
    }

    /* renamed from: f */
    public final void mo29576f(int i) {
        if (this.f21289b.isHeld()) {
            try {
                this.f21289b.release();
            } catch (RuntimeException e) {
                if (e.getClass().equals(RuntimeException.class)) {
                    String.valueOf(this.f21292e).concat(" was already released!");
                } else {
                    throw e;
                }
            }
            this.f21289b.isHeld();
        }
    }

    public bg7(Context context, int i, String str, String str2, String str3) {
        this(context, i, str, (String) null, str3, (String) null);
    }

    @SuppressLint({"UnwrappedWakeLock"})
    public bg7(Context context, int i, String str, String str2, String str3, String str4) {
        this.f21288a = this;
        this.f21296i = true;
        this.f21297j = new HashMap();
        this.f21298k = Collections.synchronizedSet(new HashSet());
        this.f21300m = new AtomicInteger(0);
        cu4.m43222l(context, "WakeLock: context must not be null");
        cu4.m43218h(str, "WakeLock: wakeLockName must not be empty");
        this.f21291d = i;
        this.f21293f = null;
        this.f21294g = null;
        Context applicationContext = context.getApplicationContext();
        this.f21295h = applicationContext;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            this.f21292e = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        } else {
            this.f21292e = str;
        }
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(i, str);
        this.f21289b = newWakeLock;
        if (zm7.m55149e(context)) {
            WorkSource b = zm7.m55146b(context, qb6.m50490a(str3) ? context.getPackageName() : str3);
            this.f21290c = b;
            if (b != null && zm7.m55149e(applicationContext)) {
                WorkSource workSource = this.f21290c;
                if (workSource != null) {
                    workSource.add(b);
                } else {
                    this.f21290c = b;
                }
                try {
                    newWakeLock.setWorkSource(this.f21290c);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    Log.wtf("WakeLock", e.toString());
                }
            }
        }
        if (f21286n == null) {
            f21286n = us4.m52992a().mo28880a();
        }
    }
}
