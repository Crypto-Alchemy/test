package p000;

/* renamed from: vp8 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class vp8 {

    /* renamed from: a */
    public static final sp8 f34985a;

    /* renamed from: b */
    public static final int f34986b;

    /* renamed from: vp8$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static final class C6604a extends sp8 {
        /* renamed from: a */
        public final void mo42649a(Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    static {
        /*
            r0 = 1
            java.lang.Integer r1 = m53449a()     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0015
            int r2 = r1.intValue()     // Catch:{ all -> 0x002a }
            r3 = 19
            if (r2 < r3) goto L_0x0015
            jq8 r2 = new jq8     // Catch:{ all -> 0x002a }
            r2.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x005f
        L_0x0015:
            java.lang.String r2 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r2 = java.lang.Boolean.getBoolean(r2)     // Catch:{ all -> 0x002a }
            r2 = r2 ^ r0
            if (r2 == 0) goto L_0x0024
            fq8 r2 = new fq8     // Catch:{ all -> 0x002a }
            r2.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x005f
        L_0x0024:
            vp8$a r2 = new vp8$a     // Catch:{ all -> 0x002a }
            r2.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x005f
        L_0x002a:
            r2 = move-exception
            goto L_0x002e
        L_0x002c:
            r2 = move-exception
            r1 = 0
        L_0x002e:
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.Class<vp8$a> r4 = p000.vp8.C6604a.class
            java.lang.String r4 = r4.getName()
            int r5 = r4.length()
            int r5 = r5 + 133
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = "will be used. The error is: "
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r3.println(r4)
            java.io.PrintStream r3 = java.lang.System.err
            r2.printStackTrace(r3)
            vp8$a r2 = new vp8$a
            r2.<init>()
        L_0x005f:
            f34985a = r2
            if (r1 != 0) goto L_0x0064
            goto L_0x0068
        L_0x0064:
            int r0 = r1.intValue()
        L_0x0068:
            f34986b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vp8.<clinit>():void");
    }

    /* renamed from: a */
    public static Integer m53449a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object) null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    /* renamed from: b */
    public static void m53450b(Throwable th) {
        f34985a.mo42649a(th);
    }
}
