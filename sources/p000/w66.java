package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.play.core.internal.C4487bf;
import com.google.android.play.core.splitinstall.C4495l;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: w66 */
public class w66 {

    /* renamed from: d */
    public static final AtomicReference<w66> f35238d = new AtomicReference<>((Object) null);

    /* renamed from: a */
    public final ot7 f35239a;

    /* renamed from: b */
    public final Set<String> f35240b = new HashSet();

    /* renamed from: c */
    public final gq7 f35241c;

    public w66(Context context) {
        try {
            ot7 ot7 = new ot7(context);
            this.f35239a = ot7;
            this.f35241c = new gq7(ot7);
        } catch (PackageManager.NameNotFoundException e) {
            throw new C4487bf((Throwable) e);
        }
    }

    /* renamed from: a */
    public static boolean m53741a(Context context) {
        return m53745e(context, true);
    }

    /* renamed from: b */
    public static boolean m53742b() {
        return f35238d.get() != null;
    }

    /* renamed from: d */
    public static boolean m53744d() {
        return false;
    }

    /* renamed from: e */
    public static boolean m53745e(Context context, boolean z) {
        if (m53744d()) {
            return false;
        }
        AtomicReference<w66> atomicReference = f35238d;
        boolean a = ao0.m10672a(atomicReference, (Object) null, new w66(context));
        w66 w66 = atomicReference.get();
        if (a) {
            C4495l.f24780a.mo34293b(new lr7(context, lw7.m47960a(), new pr7(context, w66.f35239a, new rr7(), (byte[]) null), w66.f35239a, new lw7()));
            jw7.m46798a(new yv7(w66));
            lw7.m47960a().execute(new bw7(context));
        }
        try {
            w66.mo48910f(context, z);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: g */
    public static boolean m53746g(Context context) {
        return m53745e(context, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x0195 A[SYNTHETIC, Splitter:B:79:0x0195] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo48910f(android.content.Context r9, boolean r10) throws java.io.IOException {
        /*
            r8 = this;
            monitor-enter(r8)
            if (r10 == 0) goto L_0x0009
            ot7 r0 = r8.f35239a     // Catch:{ all -> 0x0223 }
            r0.mo46518a()     // Catch:{ all -> 0x0223 }
            goto L_0x0015
        L_0x0009:
            java.util.concurrent.Executor r0 = p000.lw7.m47960a()     // Catch:{ all -> 0x0223 }
            ew7 r1 = new ew7     // Catch:{ all -> 0x0223 }
            r1.<init>(r8)     // Catch:{ all -> 0x0223 }
            r0.execute(r1)     // Catch:{ all -> 0x0223 }
        L_0x0015:
            java.lang.String r0 = r9.getPackageName()     // Catch:{ all -> 0x0223 }
            r1 = 0
            android.content.pm.PackageManager r2 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0211 }
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r0, r1)     // Catch:{ NameNotFoundException -> 0x0211 }
            java.lang.String[] r2 = r2.splitNames     // Catch:{ NameNotFoundException -> 0x0211 }
            if (r2 != 0) goto L_0x002c
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x0211 }
            r2.<init>()     // Catch:{ NameNotFoundException -> 0x0211 }
            goto L_0x0030
        L_0x002c:
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch:{ NameNotFoundException -> 0x0211 }
        L_0x0030:
            ot7 r0 = r8.f35239a     // Catch:{ all -> 0x0223 }
            java.util.Set r0 = r0.mo46526i()     // Catch:{ all -> 0x0223 }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x0223 }
            r3.<init>()     // Catch:{ all -> 0x0223 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x0223 }
        L_0x003f:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0223 }
            if (r5 == 0) goto L_0x0064
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0223 }
            qw7 r5 = (p000.qw7) r5     // Catch:{ all -> 0x0223 }
            java.lang.String r5 = r5.mo47287b()     // Catch:{ all -> 0x0223 }
            boolean r6 = r2.contains(r5)     // Catch:{ all -> 0x0223 }
            if (r6 == 0) goto L_0x003f
            if (r10 == 0) goto L_0x005d
            ot7 r6 = r8.f35239a     // Catch:{ all -> 0x0223 }
            r6.mo46531n(r5)     // Catch:{ all -> 0x0223 }
            goto L_0x0060
        L_0x005d:
            r3.add(r5)     // Catch:{ all -> 0x0223 }
        L_0x0060:
            r4.remove()     // Catch:{ all -> 0x0223 }
            goto L_0x003f
        L_0x0064:
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x0223 }
            if (r4 != 0) goto L_0x0076
            java.util.concurrent.Executor r4 = p000.lw7.m47960a()     // Catch:{ all -> 0x0223 }
            iw7 r5 = new iw7     // Catch:{ all -> 0x0223 }
            r5.<init>(r8, r3)     // Catch:{ all -> 0x0223 }
            r4.execute(r5)     // Catch:{ all -> 0x0223 }
        L_0x0076:
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x0223 }
            r3.<init>()     // Catch:{ all -> 0x0223 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x0223 }
        L_0x007f:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0223 }
            if (r5 == 0) goto L_0x0099
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0223 }
            qw7 r5 = (p000.qw7) r5     // Catch:{ all -> 0x0223 }
            java.lang.String r5 = r5.mo47287b()     // Catch:{ all -> 0x0223 }
            boolean r6 = p000.mw7.m48522b(r5)     // Catch:{ all -> 0x0223 }
            if (r6 != 0) goto L_0x007f
            r3.add(r5)     // Catch:{ all -> 0x0223 }
            goto L_0x007f
        L_0x0099:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0223 }
        L_0x009d:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0223 }
            if (r4 == 0) goto L_0x00b3
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0223 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0223 }
            boolean r5 = p000.mw7.m48522b(r4)     // Catch:{ all -> 0x0223 }
            if (r5 != 0) goto L_0x009d
            r3.add(r4)     // Catch:{ all -> 0x0223 }
            goto L_0x009d
        L_0x00b3:
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x0223 }
            int r4 = r0.size()     // Catch:{ all -> 0x0223 }
            r2.<init>(r4)     // Catch:{ all -> 0x0223 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0223 }
        L_0x00c0:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0223 }
            if (r4 == 0) goto L_0x00f6
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0223 }
            qw7 r4 = (p000.qw7) r4     // Catch:{ all -> 0x0223 }
            java.lang.String r5 = r4.mo47287b()     // Catch:{ all -> 0x0223 }
            boolean r5 = p000.mw7.m48521a(r5)     // Catch:{ all -> 0x0223 }
            if (r5 != 0) goto L_0x00f2
            java.lang.String r5 = r4.mo47287b()     // Catch:{ all -> 0x0223 }
            boolean r6 = p000.mw7.m48521a(r5)     // Catch:{ all -> 0x0223 }
            if (r6 == 0) goto L_0x00e3
            java.lang.String r5 = ""
            goto L_0x00ec
        L_0x00e3:
            java.lang.String r6 = "\\.config\\."
            r7 = 2
            java.lang.String[] r5 = r5.split(r6, r7)     // Catch:{ all -> 0x0223 }
            r5 = r5[r1]     // Catch:{ all -> 0x0223 }
        L_0x00ec:
            boolean r5 = r3.contains(r5)     // Catch:{ all -> 0x0223 }
            if (r5 == 0) goto L_0x00c0
        L_0x00f2:
            r2.add(r4)     // Catch:{ all -> 0x0223 }
            goto L_0x00c0
        L_0x00f6:
            tv7 r0 = new tv7     // Catch:{ all -> 0x0223 }
            ot7 r1 = r8.f35239a     // Catch:{ all -> 0x0223 }
            r0.<init>(r1)     // Catch:{ all -> 0x0223 }
            qr7 r1 = p000.rr7.m51232a()     // Catch:{ all -> 0x0223 }
            java.lang.ClassLoader r3 = r9.getClassLoader()     // Catch:{ all -> 0x0223 }
            if (r10 == 0) goto L_0x010f
            java.util.Set r0 = r0.mo48235a()     // Catch:{ all -> 0x0223 }
            r1.mo42043b(r3, r0)     // Catch:{ all -> 0x0223 }
            goto L_0x012d
        L_0x010f:
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x0223 }
        L_0x0113:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0223 }
            if (r5 == 0) goto L_0x012d
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0223 }
            qw7 r5 = (p000.qw7) r5     // Catch:{ all -> 0x0223 }
            java.util.Set r5 = r0.mo48236b(r5)     // Catch:{ all -> 0x0223 }
            if (r5 != 0) goto L_0x0129
            r4.remove()     // Catch:{ all -> 0x0223 }
            goto L_0x0113
        L_0x0129:
            r1.mo42043b(r3, r5)     // Catch:{ all -> 0x0223 }
            goto L_0x0113
        L_0x012d:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0223 }
            r0.<init>()     // Catch:{ all -> 0x0223 }
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x0223 }
        L_0x0136:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0223 }
            if (r5 == 0) goto L_0x019e
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0223 }
            qw7 r5 = (p000.qw7) r5     // Catch:{ all -> 0x0223 }
            java.util.zip.ZipFile r6 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x0191 }
            java.io.File r7 = r5.mo47286a()     // Catch:{ IOException -> 0x0191 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x0191 }
            java.lang.String r7 = "classes.dex"
            java.util.zip.ZipEntry r7 = r6.getEntry(r7)     // Catch:{ IOException -> 0x018f }
            r6.close()     // Catch:{ IOException -> 0x018f }
            if (r7 == 0) goto L_0x0187
            ot7 r6 = r8.f35239a     // Catch:{ all -> 0x0223 }
            java.lang.String r7 = r5.mo47287b()     // Catch:{ all -> 0x0223 }
            java.io.File r6 = r6.mo46525h(r7)     // Catch:{ all -> 0x0223 }
            java.io.File r7 = r5.mo47286a()     // Catch:{ all -> 0x0223 }
            boolean r6 = r1.mo42042a(r3, r6, r7, r10)     // Catch:{ all -> 0x0223 }
            if (r6 == 0) goto L_0x016b
            goto L_0x0187
        L_0x016b:
            java.io.File r5 = r5.mo47286a()     // Catch:{ all -> 0x0223 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0223 }
            int r6 = r5.length()     // Catch:{ all -> 0x0223 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0223 }
            int r6 = r6 + 24
            r7.<init>(r6)     // Catch:{ all -> 0x0223 }
            java.lang.String r6 = "split was not installed "
            r7.append(r6)     // Catch:{ all -> 0x0223 }
            r7.append(r5)     // Catch:{ all -> 0x0223 }
            goto L_0x0136
        L_0x0187:
            java.io.File r5 = r5.mo47286a()     // Catch:{ all -> 0x0223 }
            r0.add(r5)     // Catch:{ all -> 0x0223 }
            goto L_0x0136
        L_0x018f:
            r9 = move-exception
            goto L_0x0193
        L_0x0191:
            r9 = move-exception
            r6 = 0
        L_0x0193:
            if (r6 == 0) goto L_0x019d
            r6.close()     // Catch:{ IOException -> 0x0199 }
            goto L_0x019d
        L_0x0199:
            r10 = move-exception
            p000.mt7.m48481a(r9, r10)     // Catch:{ all -> 0x0223 }
        L_0x019d:
            throw r9     // Catch:{ all -> 0x0223 }
        L_0x019e:
            gq7 r10 = r8.f35241c     // Catch:{ all -> 0x0223 }
            r10.mo42950a(r9, r0)     // Catch:{ all -> 0x0223 }
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x0223 }
            r9.<init>()     // Catch:{ all -> 0x0223 }
            java.util.Iterator r10 = r2.iterator()     // Catch:{ all -> 0x0223 }
        L_0x01ac:
            boolean r1 = r10.hasNext()     // Catch:{ all -> 0x0223 }
            if (r1 == 0) goto L_0x0203
            java.lang.Object r1 = r10.next()     // Catch:{ all -> 0x0223 }
            qw7 r1 = (p000.qw7) r1     // Catch:{ all -> 0x0223 }
            java.io.File r2 = r1.mo47286a()     // Catch:{ all -> 0x0223 }
            boolean r2 = r0.contains(r2)     // Catch:{ all -> 0x0223 }
            if (r2 == 0) goto L_0x01e6
            java.lang.String r2 = r1.mo47287b()     // Catch:{ all -> 0x0223 }
            int r3 = r2.length()     // Catch:{ all -> 0x0223 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0223 }
            int r3 = r3 + 30
            r4.<init>(r3)     // Catch:{ all -> 0x0223 }
            java.lang.String r3 = "Split '"
            r4.append(r3)     // Catch:{ all -> 0x0223 }
            r4.append(r2)     // Catch:{ all -> 0x0223 }
            java.lang.String r2 = "' installation emulated"
            r4.append(r2)     // Catch:{ all -> 0x0223 }
            java.lang.String r1 = r1.mo47287b()     // Catch:{ all -> 0x0223 }
            r9.add(r1)     // Catch:{ all -> 0x0223 }
            goto L_0x01ac
        L_0x01e6:
            java.lang.String r1 = r1.mo47287b()     // Catch:{ all -> 0x0223 }
            int r2 = r1.length()     // Catch:{ all -> 0x0223 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0223 }
            int r2 = r2 + 35
            r3.<init>(r2)     // Catch:{ all -> 0x0223 }
            java.lang.String r2 = "Split '"
            r3.append(r2)     // Catch:{ all -> 0x0223 }
            r3.append(r1)     // Catch:{ all -> 0x0223 }
            java.lang.String r1 = "' installation not emulated."
            r3.append(r1)     // Catch:{ all -> 0x0223 }
            goto L_0x01ac
        L_0x0203:
            java.util.Set<java.lang.String> r10 = r8.f35240b     // Catch:{ all -> 0x0223 }
            monitor-enter(r10)     // Catch:{ all -> 0x0223 }
            java.util.Set<java.lang.String> r0 = r8.f35240b     // Catch:{ all -> 0x020e }
            r0.addAll(r9)     // Catch:{ all -> 0x020e }
            monitor-exit(r10)     // Catch:{ all -> 0x020e }
            monitor-exit(r8)
            return
        L_0x020e:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x020e }
            throw r9     // Catch:{ all -> 0x0223 }
        L_0x0211:
            r9 = move-exception
            java.io.IOException r10 = new java.io.IOException     // Catch:{ all -> 0x0223 }
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0223 }
            r2[r1] = r0     // Catch:{ all -> 0x0223 }
            java.lang.String r0 = "Cannot load data for application '%s'"
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x0223 }
            r10.<init>(r0, r9)     // Catch:{ all -> 0x0223 }
            throw r10     // Catch:{ all -> 0x0223 }
        L_0x0223:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.w66.mo48910f(android.content.Context, boolean):void");
    }
}
