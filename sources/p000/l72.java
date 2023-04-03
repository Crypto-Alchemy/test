package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p000.s72;

/* renamed from: l72 */
/* compiled from: FontRequestWorker */
public class l72 {

    /* renamed from: a */
    public static final em3<String, Typeface> f14428a = new em3<>(16);

    /* renamed from: b */
    public static final ExecutorService f14429b = ee5.m16080a("fonts-androidx", 10, 10000);

    /* renamed from: c */
    public static final Object f14430c = new Object();

    /* renamed from: d */
    public static final y16<String, ArrayList<yq0<C2747e>>> f14431d = new y16<>();

    /* renamed from: l72$a */
    /* compiled from: FontRequestWorker */
    public class C2743a implements Callable<C2747e> {

        /* renamed from: a */
        public final /* synthetic */ String f14432a;

        /* renamed from: d */
        public final /* synthetic */ Context f14433d;

        /* renamed from: e */
        public final /* synthetic */ j72 f14434e;

        /* renamed from: g */
        public final /* synthetic */ int f14435g;

        public C2743a(String str, Context context, j72 j72, int i) {
            this.f14432a = str;
            this.f14433d = context;
            this.f14434e = j72;
            this.f14435g = i;
        }

        /* renamed from: a */
        public C2747e call() {
            return l72.m21299c(this.f14432a, this.f14433d, this.f14434e, this.f14435g);
        }
    }

    /* renamed from: l72$b */
    /* compiled from: FontRequestWorker */
    public class C2744b implements yq0<C2747e> {

        /* renamed from: a */
        public final /* synthetic */ r90 f14436a;

        public C2744b(r90 r90) {
            this.f14436a = r90;
        }

        /* renamed from: a */
        public void accept(C2747e eVar) {
            if (eVar == null) {
                eVar = new C2747e(-3);
            }
            this.f14436a.mo25353b(eVar);
        }
    }

    /* renamed from: l72$c */
    /* compiled from: FontRequestWorker */
    public class C2745c implements Callable<C2747e> {

        /* renamed from: a */
        public final /* synthetic */ String f14437a;

        /* renamed from: d */
        public final /* synthetic */ Context f14438d;

        /* renamed from: e */
        public final /* synthetic */ j72 f14439e;

        /* renamed from: g */
        public final /* synthetic */ int f14440g;

        public C2745c(String str, Context context, j72 j72, int i) {
            this.f14437a = str;
            this.f14438d = context;
            this.f14439e = j72;
            this.f14440g = i;
        }

        /* renamed from: a */
        public C2747e call() {
            try {
                return l72.m21299c(this.f14437a, this.f14438d, this.f14439e, this.f14440g);
            } catch (Throwable unused) {
                return new C2747e(-3);
            }
        }
    }

    /* renamed from: l72$d */
    /* compiled from: FontRequestWorker */
    public class C2746d implements yq0<C2747e> {

        /* renamed from: a */
        public final /* synthetic */ String f14441a;

        public C2746d(String str) {
            this.f14441a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            if (r0 >= r2.size()) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
            ((p000.yq0) r2.get(r0)).accept(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            r0 = 0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void accept(p000.l72.C2747e r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p000.l72.f14430c
                monitor-enter(r0)
                y16<java.lang.String, java.util.ArrayList<yq0<l72$e>>> r1 = p000.l72.f14431d     // Catch:{ all -> 0x002b }
                java.lang.String r2 = r4.f14441a     // Catch:{ all -> 0x002b }
                java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x002b }
                java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002b }
                if (r2 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                return
            L_0x0011:
                java.lang.String r3 = r4.f14441a     // Catch:{ all -> 0x002b }
                r1.remove(r3)     // Catch:{ all -> 0x002b }
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                r0 = 0
            L_0x0018:
                int r1 = r2.size()
                if (r0 >= r1) goto L_0x002a
                java.lang.Object r1 = r2.get(r0)
                yq0 r1 = (p000.yq0) r1
                r1.accept(r5)
                int r0 = r0 + 1
                goto L_0x0018
            L_0x002a:
                return
            L_0x002b:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.l72.C2746d.accept(l72$e):void");
        }
    }

    /* renamed from: a */
    public static String m21297a(j72 j72, int i) {
        return j72.mo21783d() + "-" + i;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    public static int m21298b(s72.C3249a aVar) {
        int i = 1;
        if (aVar.mo25654c() == 0) {
            s72.C3250b[] b = aVar.mo25653b();
            if (!(b == null || b.length == 0)) {
                int length = b.length;
                i = 0;
                int i2 = 0;
                while (i2 < length) {
                    int b2 = b[i2].mo25655b();
                    if (b2 == 0) {
                        i2++;
                    } else if (b2 < 0) {
                        return -3;
                    } else {
                        return b2;
                    }
                }
            }
            return i;
        } else if (aVar.mo25654c() != 1) {
            return -3;
        } else {
            return -2;
        }
    }

    /* renamed from: c */
    public static C2747e m21299c(String str, Context context, j72 j72, int i) {
        em3<String, Typeface> em3 = f14428a;
        Typeface c = em3.mo19372c(str);
        if (c != null) {
            return new C2747e(c);
        }
        try {
            s72.C3249a e = i72.m19442e(context, j72, (CancellationSignal) null);
            int b = m21298b(e);
            if (b != 0) {
                return new C2747e(b);
            }
            Typeface b2 = g27.m17572b(context, (CancellationSignal) null, e.mo25653b(), i);
            if (b2 == null) {
                return new C2747e(-3);
            }
            em3.mo19373d(str, b2);
            return new C2747e(b2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C2747e(-1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r9 = new p000.l72.C2745c(r0, r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r8 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r8 = f14429b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        p000.ee5.m16081b(r8, r9, new p000.l72.C2746d(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return null;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m21300d(android.content.Context r5, p000.j72 r6, int r7, java.util.concurrent.Executor r8, p000.r90 r9) {
        /*
            java.lang.String r0 = m21297a(r6, r7)
            em3<java.lang.String, android.graphics.Typeface> r1 = f14428a
            java.lang.Object r1 = r1.mo19372c(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0017
            l72$e r5 = new l72$e
            r5.<init>((android.graphics.Typeface) r1)
            r9.mo25353b(r5)
            return r1
        L_0x0017:
            l72$b r1 = new l72$b
            r1.<init>(r9)
            java.lang.Object r9 = f14430c
            monitor-enter(r9)
            y16<java.lang.String, java.util.ArrayList<yq0<l72$e>>> r2 = f14431d     // Catch:{ all -> 0x004d }
            java.lang.Object r3 = r2.get(r0)     // Catch:{ all -> 0x004d }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x004d }
            r4 = 0
            if (r3 == 0) goto L_0x002f
            r3.add(r1)     // Catch:{ all -> 0x004d }
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            return r4
        L_0x002f:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x004d }
            r3.<init>()     // Catch:{ all -> 0x004d }
            r3.add(r1)     // Catch:{ all -> 0x004d }
            r2.put(r0, r3)     // Catch:{ all -> 0x004d }
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            l72$c r9 = new l72$c
            r9.<init>(r0, r5, r6, r7)
            if (r8 != 0) goto L_0x0044
            java.util.concurrent.ExecutorService r8 = f14429b
        L_0x0044:
            l72$d r5 = new l72$d
            r5.<init>(r0)
            p000.ee5.m16081b(r8, r9, r5)
            return r4
        L_0x004d:
            r5 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.l72.m21300d(android.content.Context, j72, int, java.util.concurrent.Executor, r90):android.graphics.Typeface");
    }

    /* renamed from: e */
    public static Typeface m21301e(Context context, j72 j72, r90 r90, int i, int i2) {
        String a = m21297a(j72, i);
        Typeface c = f14428a.mo19372c(a);
        if (c != null) {
            r90.mo25353b(new C2747e(c));
            return c;
        } else if (i2 == -1) {
            C2747e c2 = m21299c(a, context, j72, i);
            r90.mo25353b(c2);
            return c2.f14442a;
        } else {
            try {
                C2747e eVar = (C2747e) ee5.m16082c(f14429b, new C2743a(a, context, j72, i), i2);
                r90.mo25353b(eVar);
                return eVar.f14442a;
            } catch (InterruptedException unused) {
                r90.mo25353b(new C2747e(-3));
                return null;
            }
        }
    }

    /* renamed from: l72$e */
    /* compiled from: FontRequestWorker */
    public static final class C2747e {

        /* renamed from: a */
        public final Typeface f14442a;

        /* renamed from: b */
        public final int f14443b;

        public C2747e(int i) {
            this.f14442a = null;
            this.f14443b = i;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: a */
        public boolean mo22676a() {
            if (this.f14443b == 0) {
                return true;
            }
            return false;
        }

        @SuppressLint({"WrongConstant"})
        public C2747e(Typeface typeface) {
            this.f14442a = typeface;
            this.f14443b = 0;
        }
    }
}
