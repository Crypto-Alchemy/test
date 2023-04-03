package p000;

import android.content.Context;
import com.google.android.gms.internal.measurement.C4084a;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: lx8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public abstract class lx8<T> {

    /* renamed from: g */
    public static final Object f31447g = new Object();

    /* renamed from: h */
    public static volatile jx8 f31448h;

    /* renamed from: i */
    public static final AtomicReference<Collection<lx8<?>>> f31449i = new AtomicReference<>();

    /* renamed from: j */
    public static final rx8 f31450j = new rx8(tw8.f34399a);

    /* renamed from: k */
    public static final AtomicInteger f31451k = new AtomicInteger();

    /* renamed from: a */
    public final gx8 f31452a;

    /* renamed from: b */
    public final String f31453b;

    /* renamed from: c */
    public final T f31454c;

    /* renamed from: d */
    public volatile int f31455d = -1;

    /* renamed from: e */
    public volatile T f31456e;

    /* renamed from: f */
    public final boolean f31457f;

    public /* synthetic */ lx8(gx8 gx8, String str, Object obj, boolean z, ww8 ww8) {
        if (gx8.f29389b != null) {
            this.f31452a = gx8;
            this.f31453b = str;
            this.f31454c = obj;
            this.f31457f = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    @Deprecated
    /* renamed from: b */
    public static void m47973b(Context context) {
        synchronized (f31447g) {
            jx8 jx8 = f31448h;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (jx8 == null || jx8.mo44627a() != context) {
                kv8.m47558e();
                ox8.m49607c();
                gw8.m44960d();
                f31448h = new ou8(context, C4084a.m34123a(new rw8(context)));
                f31451k.incrementAndGet();
            }
        }
    }

    /* renamed from: c */
    public static void m47974c() {
        f31451k.incrementAndGet();
    }

    /* renamed from: a */
    public abstract T mo29378a(Object obj);

    /* renamed from: d */
    public final String mo45549d() {
        String str = this.f31452a.f29391d;
        return this.f31453b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e1  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo45550e() {
        /*
            r6 = this;
            boolean r0 = r6.f31457f
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = r6.f31453b
            if (r0 == 0) goto L_0x0009
            goto L_0x0011
        L_0x0009:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "flagName must not be null"
            r0.<init>(r1)
            throw r0
        L_0x0011:
            java.util.concurrent.atomic.AtomicInteger r0 = f31451k
            int r0 = r0.get()
            int r1 = r6.f31455d
            if (r1 >= r0) goto L_0x010c
            monitor-enter(r6)
            int r1 = r6.f31455d     // Catch:{ all -> 0x0109 }
            if (r1 >= r0) goto L_0x0107
            jx8 r1 = f31448h     // Catch:{ all -> 0x0109 }
            java.lang.String r2 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L_0x0101
            gx8 r2 = r6.f31452a     // Catch:{ all -> 0x0109 }
            boolean r2 = r2.f29393f     // Catch:{ all -> 0x0109 }
            android.content.Context r2 = r1.mo44627a()     // Catch:{ all -> 0x0109 }
            gw8 r2 = p000.gw8.m44959b(r2)     // Catch:{ all -> 0x0109 }
            java.lang.String r3 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.String r2 = r2.mo43014a(r3)     // Catch:{ all -> 0x0109 }
            r3 = 0
            if (r2 == 0) goto L_0x0065
            java.util.regex.Pattern r4 = p000.ku8.f31085c     // Catch:{ all -> 0x0109 }
            java.util.regex.Matcher r2 = r4.matcher(r2)     // Catch:{ all -> 0x0109 }
            boolean r2 = r2.matches()     // Catch:{ all -> 0x0109 }
            if (r2 == 0) goto L_0x0065
            java.lang.String r2 = "PhenotypeFlag"
            r4 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r4)     // Catch:{ all -> 0x0109 }
            if (r2 == 0) goto L_0x0063
            java.lang.String r2 = "Bypass reading Phenotype values for flag: "
            java.lang.String r4 = r6.mo45549d()     // Catch:{ all -> 0x0109 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0109 }
            int r5 = r4.length()     // Catch:{ all -> 0x0109 }
            if (r5 == 0) goto L_0x0063
            r2.concat(r4)     // Catch:{ all -> 0x0109 }
        L_0x0063:
            r2 = r3
            goto L_0x00ac
        L_0x0065:
            gx8 r2 = r6.f31452a     // Catch:{ all -> 0x0109 }
            android.net.Uri r2 = r2.f29389b     // Catch:{ all -> 0x0109 }
            if (r2 == 0) goto L_0x0090
            android.content.Context r2 = r1.mo44627a()     // Catch:{ all -> 0x0109 }
            gx8 r4 = r6.f31452a     // Catch:{ all -> 0x0109 }
            android.net.Uri r4 = r4.f29389b     // Catch:{ all -> 0x0109 }
            boolean r2 = p000.mw8.m48523a(r2, r4)     // Catch:{ all -> 0x0109 }
            if (r2 == 0) goto L_0x008e
            gx8 r2 = r6.f31452a     // Catch:{ all -> 0x0109 }
            boolean r2 = r2.f29395h     // Catch:{ all -> 0x0109 }
            android.content.Context r2 = r1.mo44627a()     // Catch:{ all -> 0x0109 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x0109 }
            gx8 r4 = r6.f31452a     // Catch:{ all -> 0x0109 }
            android.net.Uri r4 = r4.f29389b     // Catch:{ all -> 0x0109 }
            kv8 r2 = p000.kv8.m47557b(r2, r4)     // Catch:{ all -> 0x0109 }
            goto L_0x009c
        L_0x008e:
            r2 = r3
            goto L_0x009c
        L_0x0090:
            android.content.Context r2 = r1.mo44627a()     // Catch:{ all -> 0x0109 }
            gx8 r4 = r6.f31452a     // Catch:{ all -> 0x0109 }
            java.lang.String r4 = r4.f29388a     // Catch:{ all -> 0x0109 }
            ox8 r2 = p000.ox8.m49606b(r2, r3)     // Catch:{ all -> 0x0109 }
        L_0x009c:
            if (r2 == 0) goto L_0x0063
            java.lang.String r4 = r6.mo45549d()     // Catch:{ all -> 0x0109 }
            java.lang.Object r2 = r2.mo43014a(r4)     // Catch:{ all -> 0x0109 }
            if (r2 == 0) goto L_0x0063
            java.lang.Object r2 = r6.mo29378a(r2)     // Catch:{ all -> 0x0109 }
        L_0x00ac:
            if (r2 == 0) goto L_0x00af
            goto L_0x00d1
        L_0x00af:
            gx8 r2 = r6.f31452a     // Catch:{ all -> 0x0109 }
            boolean r2 = r2.f29392e     // Catch:{ all -> 0x0109 }
            android.content.Context r2 = r1.mo44627a()     // Catch:{ all -> 0x0109 }
            gw8 r2 = p000.gw8.m44959b(r2)     // Catch:{ all -> 0x0109 }
            gx8 r4 = r6.f31452a     // Catch:{ all -> 0x0109 }
            boolean r4 = r4.f29392e     // Catch:{ all -> 0x0109 }
            java.lang.String r4 = r6.f31453b     // Catch:{ all -> 0x0109 }
            java.lang.String r2 = r2.mo43014a(r4)     // Catch:{ all -> 0x0109 }
            if (r2 == 0) goto L_0x00cc
            java.lang.Object r2 = r6.mo29378a(r2)     // Catch:{ all -> 0x0109 }
            goto L_0x00cd
        L_0x00cc:
            r2 = r3
        L_0x00cd:
            if (r2 != 0) goto L_0x00d1
            T r2 = r6.f31454c     // Catch:{ all -> 0x0109 }
        L_0x00d1:
            qy8 r1 = r1.mo44628b()     // Catch:{ all -> 0x0109 }
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x0109 }
            com.google.android.gms.internal.measurement.zzhz r1 = (com.google.android.gms.internal.measurement.zzhz) r1     // Catch:{ all -> 0x0109 }
            boolean r4 = r1.zza()     // Catch:{ all -> 0x0109 }
            if (r4 == 0) goto L_0x00fc
            java.lang.Object r1 = r1.zzb()     // Catch:{ all -> 0x0109 }
            jw8 r1 = (p000.jw8) r1     // Catch:{ all -> 0x0109 }
            gx8 r2 = r6.f31452a     // Catch:{ all -> 0x0109 }
            android.net.Uri r4 = r2.f29389b     // Catch:{ all -> 0x0109 }
            java.lang.String r2 = r2.f29391d     // Catch:{ all -> 0x0109 }
            java.lang.String r5 = r6.f31453b     // Catch:{ all -> 0x0109 }
            java.lang.String r1 = r1.mo44625a(r4, r3, r2, r5)     // Catch:{ all -> 0x0109 }
            if (r1 != 0) goto L_0x00f8
            T r2 = r6.f31454c     // Catch:{ all -> 0x0109 }
            goto L_0x00fc
        L_0x00f8:
            java.lang.Object r2 = r6.mo29378a(r1)     // Catch:{ all -> 0x0109 }
        L_0x00fc:
            r6.f31456e = r2     // Catch:{ all -> 0x0109 }
            r6.f31455d = r0     // Catch:{ all -> 0x0109 }
            goto L_0x0107
        L_0x0101:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0109 }
            r0.<init>(r2)     // Catch:{ all -> 0x0109 }
            throw r0     // Catch:{ all -> 0x0109 }
        L_0x0107:
            monitor-exit(r6)     // Catch:{ all -> 0x0109 }
            goto L_0x010c
        L_0x0109:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0109 }
            throw r0
        L_0x010c:
            T r0 = r6.f31456e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lx8.mo45550e():java.lang.Object");
    }
}
