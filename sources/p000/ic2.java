package p000;

import android.content.Context;
import com.facebook.drawee.view.SimpleDraweeView;

/* renamed from: ic2 */
/* compiled from: Fresco */
public class ic2 {

    /* renamed from: a */
    public static final Class<?> f13245a = ic2.class;

    /* renamed from: b */
    public static to4 f13246b = null;

    /* renamed from: c */
    public static volatile boolean f13247c = false;

    /* renamed from: a */
    public static void m19550a(Context context) {
        m19551b(context, (mr2) null, (zj1) null);
    }

    /* renamed from: b */
    public static void m19551b(Context context, mr2 mr2, zj1 zj1) {
        m19552c(context, mr2, zj1, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (p000.lc2.m21369d() != false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        p000.u34.m28056b(new p000.jk6());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
        if (p000.lc2.m21369d() == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        p000.u34.m28056b(new p000.jk6());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        if (p000.lc2.m21369d() == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        p000.u34.m28056b(new p000.jk6());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        if (p000.lc2.m21369d() == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        p000.u34.m28056b(new p000.jk6());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0087, code lost:
        if (p000.lc2.m21369d() == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0089, code lost:
        p000.lc2.m21367b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0091, code lost:
        if (p000.lc2.m21369d() != false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0093, code lost:
        p000.lc2.m21367b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0096, code lost:
        throw r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:18:0x004e, B:22:0x005d, B:26:0x006c, B:30:0x007b] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x004e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x005d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x006c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x007b */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x007b=Splitter:B:30:0x007b, B:26:0x006c=Splitter:B:26:0x006c, B:22:0x005d=Splitter:B:22:0x005d, B:18:0x004e=Splitter:B:18:0x004e} */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m19552c(android.content.Context r5, p000.mr2 r6, p000.zj1 r7, boolean r8) {
        /*
            boolean r0 = p000.lc2.m21369d()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "Fresco#initialize"
            p000.lc2.m21366a(r0)
        L_0x000b:
            boolean r0 = f13247c
            r1 = 1
            if (r0 == 0) goto L_0x0018
            java.lang.Class<?> r0 = f13245a
            java.lang.String r2 = "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!"
            p000.oy1.m24433t(r0, r2)
            goto L_0x001a
        L_0x0018:
            f13247c = r1
        L_0x001a:
            p000.q34.m25368b(r8)
            boolean r8 = p000.u34.m28057c()
            if (r8 != 0) goto L_0x0097
            boolean r8 = p000.lc2.m21369d()
            if (r8 == 0) goto L_0x002e
            java.lang.String r8 = "Fresco.initialize->SoLoader.init"
            p000.lc2.m21366a(r8)
        L_0x002e:
            java.lang.Class<com.facebook.imagepipeline.nativecode.NativeCodeInitializer> r8 = com.facebook.imagepipeline.nativecode.NativeCodeInitializer.class
            java.lang.String r0 = "init"
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x007b, IllegalAccessException -> 0x006c, InvocationTargetException -> 0x005d, NoSuchMethodException -> 0x004e }
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r4 = 0
            r2[r4] = r3     // Catch:{ ClassNotFoundException -> 0x007b, IllegalAccessException -> 0x006c, InvocationTargetException -> 0x005d, NoSuchMethodException -> 0x004e }
            java.lang.reflect.Method r8 = r8.getMethod(r0, r2)     // Catch:{ ClassNotFoundException -> 0x007b, IllegalAccessException -> 0x006c, InvocationTargetException -> 0x005d, NoSuchMethodException -> 0x004e }
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ ClassNotFoundException -> 0x007b, IllegalAccessException -> 0x006c, InvocationTargetException -> 0x005d, NoSuchMethodException -> 0x004e }
            r1[r4] = r5     // Catch:{ ClassNotFoundException -> 0x007b, IllegalAccessException -> 0x006c, InvocationTargetException -> 0x005d, NoSuchMethodException -> 0x004e }
            r8.invoke(r0, r1)     // Catch:{ ClassNotFoundException -> 0x007b, IllegalAccessException -> 0x006c, InvocationTargetException -> 0x005d, NoSuchMethodException -> 0x004e }
            boolean r8 = p000.lc2.m21369d()
            if (r8 == 0) goto L_0x0097
            goto L_0x0089
        L_0x004c:
            r5 = move-exception
            goto L_0x008d
        L_0x004e:
            jk6 r8 = new jk6     // Catch:{ all -> 0x004c }
            r8.<init>()     // Catch:{ all -> 0x004c }
            p000.u34.m28056b(r8)     // Catch:{ all -> 0x004c }
            boolean r8 = p000.lc2.m21369d()
            if (r8 == 0) goto L_0x0097
            goto L_0x0089
        L_0x005d:
            jk6 r8 = new jk6     // Catch:{ all -> 0x004c }
            r8.<init>()     // Catch:{ all -> 0x004c }
            p000.u34.m28056b(r8)     // Catch:{ all -> 0x004c }
            boolean r8 = p000.lc2.m21369d()
            if (r8 == 0) goto L_0x0097
            goto L_0x0089
        L_0x006c:
            jk6 r8 = new jk6     // Catch:{ all -> 0x004c }
            r8.<init>()     // Catch:{ all -> 0x004c }
            p000.u34.m28056b(r8)     // Catch:{ all -> 0x004c }
            boolean r8 = p000.lc2.m21369d()
            if (r8 == 0) goto L_0x0097
            goto L_0x0089
        L_0x007b:
            jk6 r8 = new jk6     // Catch:{ all -> 0x004c }
            r8.<init>()     // Catch:{ all -> 0x004c }
            p000.u34.m28056b(r8)     // Catch:{ all -> 0x004c }
            boolean r8 = p000.lc2.m21369d()
            if (r8 == 0) goto L_0x0097
        L_0x0089:
            p000.lc2.m21367b()
            goto L_0x0097
        L_0x008d:
            boolean r6 = p000.lc2.m21369d()
            if (r6 == 0) goto L_0x0096
            p000.lc2.m21367b()
        L_0x0096:
            throw r5
        L_0x0097:
            android.content.Context r5 = r5.getApplicationContext()
            if (r6 != 0) goto L_0x00a1
            p000.pr2.m25148v(r5)
            goto L_0x00a4
        L_0x00a1:
            p000.pr2.m25147u(r6)
        L_0x00a4:
            m19553d(r5, r7)
            boolean r5 = p000.lc2.m21369d()
            if (r5 == 0) goto L_0x00b0
            p000.lc2.m21367b()
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ic2.m19552c(android.content.Context, mr2, zj1, boolean):void");
    }

    /* renamed from: d */
    public static void m19553d(Context context, zj1 zj1) {
        if (lc2.m21369d()) {
            lc2.m21366a("Fresco.initializeDrawee");
        }
        to4 to4 = new to4(context, zj1);
        f13246b = to4;
        SimpleDraweeView.m13425i(to4);
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
    }

    /* renamed from: e */
    public static so4 m19554e() {
        return f13246b.get();
    }
}
