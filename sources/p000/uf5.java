package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: uf5 */
/* compiled from: ResourcesCompat */
public final class uf5 {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f18471a = new ThreadLocal<>();

    /* renamed from: b */
    public static final WeakHashMap<C3409d, SparseArray<C3408c>> f18472b = new WeakHashMap<>(0);

    /* renamed from: c */
    public static final Object f18473c = new Object();

    /* renamed from: uf5$a */
    /* compiled from: ResourcesCompat */
    public static class C3406a {
        /* renamed from: a */
        public static Drawable m28233a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        /* renamed from: b */
        public static Drawable m28234b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    /* renamed from: uf5$b */
    /* compiled from: ResourcesCompat */
    public static class C3407b {
        /* renamed from: a */
        public static int m28235a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        /* renamed from: b */
        public static ColorStateList m28236b(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* renamed from: uf5$c */
    /* compiled from: ResourcesCompat */
    public static class C3408c {

        /* renamed from: a */
        public final ColorStateList f18474a;

        /* renamed from: b */
        public final Configuration f18475b;

        /* renamed from: c */
        public final int f18476c;

        public C3408c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            int i;
            this.f18474a = colorStateList;
            this.f18475b = configuration;
            if (theme == null) {
                i = 0;
            } else {
                i = theme.hashCode();
            }
            this.f18476c = i;
        }
    }

    /* renamed from: uf5$d */
    /* compiled from: ResourcesCompat */
    public static final class C3409d {

        /* renamed from: a */
        public final Resources f18477a;

        /* renamed from: b */
        public final Resources.Theme f18478b;

        public C3409d(Resources resources, Resources.Theme theme) {
            this.f18477a = resources;
            this.f18478b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C3409d.class != obj.getClass()) {
                return false;
            }
            C3409d dVar = (C3409d) obj;
            if (!this.f18477a.equals(dVar.f18477a) || !mf4.m22283a(this.f18478b, dVar.f18478b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return mf4.m22284b(this.f18477a, this.f18478b);
        }
    }

    /* renamed from: uf5$e */
    /* compiled from: ResourcesCompat */
    public static abstract class C3410e {
        /* renamed from: e */
        public static Handler m28239e(Handler handler) {
            if (handler == null) {
                return new Handler(Looper.getMainLooper());
            }
            return handler;
        }

        /* renamed from: c */
        public final void mo26761c(int i, Handler handler) {
            m28239e(handler).post(new wf5(this, i));
        }

        /* renamed from: d */
        public final void mo26762d(Typeface typeface, Handler handler) {
            m28239e(handler).post(new vf5(this, typeface));
        }

        /* renamed from: h */
        public abstract void m28240f(int i);

        /* renamed from: i */
        public abstract void m28241g(Typeface typeface);
    }

    /* renamed from: uf5$f */
    /* compiled from: ResourcesCompat */
    public static final class C3411f {

        /* renamed from: uf5$f$a */
        /* compiled from: ResourcesCompat */
        public static class C3412a {

            /* renamed from: a */
            public static final Object f18479a = new Object();

            /* renamed from: b */
            public static Method f18480b;

            /* renamed from: c */
            public static boolean f18481c;

            /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|8|9|10) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0018 */
            @android.annotation.SuppressLint({"BanUncheckedReflection"})
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static void m28247a(android.content.res.Resources.Theme r6) {
                /*
                    java.lang.Object r0 = f18479a
                    monitor-enter(r0)
                    boolean r1 = f18481c     // Catch:{ all -> 0x0029 }
                    r2 = 0
                    if (r1 != 0) goto L_0x001a
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0018 }
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x0018 }
                    f18480b = r3     // Catch:{ NoSuchMethodException -> 0x0018 }
                    r3.setAccessible(r1)     // Catch:{ NoSuchMethodException -> 0x0018 }
                L_0x0018:
                    f18481c = r1     // Catch:{ all -> 0x0029 }
                L_0x001a:
                    java.lang.reflect.Method r1 = f18480b     // Catch:{ all -> 0x0029 }
                    if (r1 == 0) goto L_0x0027
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0024 }
                    r1.invoke(r6, r2)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0024 }
                    goto L_0x0027
                L_0x0024:
                    r6 = 0
                    f18480b = r6     // Catch:{ all -> 0x0029 }
                L_0x0027:
                    monitor-exit(r0)     // Catch:{ all -> 0x0029 }
                    return
                L_0x0029:
                    r6 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0029 }
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.uf5.C3411f.C3412a.m28247a(android.content.res.Resources$Theme):void");
            }
        }

        /* renamed from: uf5$f$b */
        /* compiled from: ResourcesCompat */
        public static class C3413b {
            /* renamed from: a */
            public static void m28248a(Resources.Theme theme) {
                xf5.m30071a(theme);
            }
        }

        /* renamed from: a */
        public static void m28246a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                C3413b.m28248a(theme);
            } else {
                C3412a.m28247a(theme);
            }
        }
    }

    /* renamed from: a */
    public static void m28218a(C3409d dVar, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f18473c) {
            WeakHashMap<C3409d, SparseArray<C3408c>> weakHashMap = f18472b;
            SparseArray sparseArray = weakHashMap.get(dVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(dVar, sparseArray);
            }
            sparseArray.append(i, new C3408c(colorStateList, dVar.f18477a.getConfiguration(), theme));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m28219b(p000.uf5.C3409d r5, int r6) {
        /*
            java.lang.Object r0 = f18473c
            monitor-enter(r0)
            java.util.WeakHashMap<uf5$d, android.util.SparseArray<uf5$c>> r1 = f18472b     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0045 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0042
            int r2 = r1.size()     // Catch:{ all -> 0x0045 }
            if (r2 <= 0) goto L_0x0042
            java.lang.Object r2 = r1.get(r6)     // Catch:{ all -> 0x0045 }
            uf5$c r2 = (p000.uf5.C3408c) r2     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0042
            android.content.res.Configuration r3 = r2.f18475b     // Catch:{ all -> 0x0045 }
            android.content.res.Resources r4 = r5.f18477a     // Catch:{ all -> 0x0045 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0045 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x003f
            android.content.res.Resources$Theme r5 = r5.f18478b     // Catch:{ all -> 0x0045 }
            if (r5 != 0) goto L_0x0031
            int r3 = r2.f18476c     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x003b
        L_0x0031:
            if (r5 == 0) goto L_0x003f
            int r3 = r2.f18476c     // Catch:{ all -> 0x0045 }
            int r5 = r5.hashCode()     // Catch:{ all -> 0x0045 }
            if (r3 != r5) goto L_0x003f
        L_0x003b:
            android.content.res.ColorStateList r5 = r2.f18474a     // Catch:{ all -> 0x0045 }
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return r5
        L_0x003f:
            r1.remove(r6)     // Catch:{ all -> 0x0045 }
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            r5 = 0
            return r5
        L_0x0045:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.uf5.m28219b(uf5$d, int):android.content.res.ColorStateList");
    }

    /* renamed from: c */
    public static Typeface m28220c(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m28231n(context, i, new TypedValue(), 0, (C3410e) null, (Handler) null, false, true);
    }

    /* renamed from: d */
    public static int m28221d(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        return C3407b.m28235a(resources, i, theme);
    }

    /* renamed from: e */
    public static ColorStateList m28222e(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        C3409d dVar = new C3409d(resources, theme);
        ColorStateList b = m28219b(dVar, i);
        if (b != null) {
            return b;
        }
        ColorStateList l = m28229l(resources, i, theme);
        if (l == null) {
            return C3407b.m28236b(resources, i, theme);
        }
        m28218a(dVar, i, l, theme);
        return l;
    }

    /* renamed from: f */
    public static Drawable m28223f(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        return C3406a.m28233a(resources, i, theme);
    }

    /* renamed from: g */
    public static Drawable m28224g(Resources resources, int i, int i2, Resources.Theme theme) throws Resources.NotFoundException {
        return C3406a.m28234b(resources, i, i2, theme);
    }

    /* renamed from: h */
    public static Typeface m28225h(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m28231n(context, i, new TypedValue(), 0, (C3410e) null, (Handler) null, false, false);
    }

    /* renamed from: i */
    public static Typeface m28226i(Context context, int i, TypedValue typedValue, int i2, C3410e eVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m28231n(context, i, typedValue, i2, eVar, (Handler) null, true, false);
    }

    /* renamed from: j */
    public static void m28227j(Context context, int i, C3410e eVar, Handler handler) throws Resources.NotFoundException {
        gu4.m18428f(eVar);
        if (context.isRestricted()) {
            eVar.mo26761c(-4, handler);
            return;
        }
        m28231n(context, i, new TypedValue(), 0, eVar, handler, false, false);
    }

    /* renamed from: k */
    public static TypedValue m28228k() {
        ThreadLocal<TypedValue> threadLocal = f18471a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: l */
    public static ColorStateList m28229l(Resources resources, int i, Resources.Theme theme) {
        if (m28230m(resources, i)) {
            return null;
        }
        try {
            return el0.m16164a(resources, resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static boolean m28230m(Resources resources, int i) {
        TypedValue k = m28228k();
        resources.getValue(i, k, true);
        int i2 = k.type;
        if (i2 < 28 || i2 > 31) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public static Typeface m28231n(Context context, int i, TypedValue typedValue, int i2, C3410e eVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        int i3 = i;
        resources.getValue(i, typedValue, true);
        Typeface o = m28232o(context, resources, typedValue, i, i2, eVar, handler, z, z2);
        if (o != null || eVar != null || z2) {
            return o;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009d  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m28232o(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, p000.uf5.C3410e r20, android.os.Handler r21, boolean r22, boolean r23) {
        /*
            r2 = r16
            r0 = r17
            r3 = r18
            r10 = r20
            r11 = r21
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto L_0x00a1
            java.lang.String r12 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = -3
            r14 = 0
            if (r1 != 0) goto L_0x0022
            if (r10 == 0) goto L_0x0021
            r10.mo26761c(r13, r11)
        L_0x0021:
            return r14
        L_0x0022:
            int r1 = r0.assetCookie
            r6 = r19
            android.graphics.Typeface r1 = p000.g27.m17576f(r2, r3, r12, r1, r6)
            if (r1 == 0) goto L_0x0032
            if (r10 == 0) goto L_0x0031
            r10.mo26762d(r1, r11)
        L_0x0031:
            return r1
        L_0x0032:
            if (r23 == 0) goto L_0x0035
            return r14
        L_0x0035:
            java.lang.String r1 = r12.toLowerCase()     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
            java.lang.String r4 = ".xml"
            boolean r1 = r1.endsWith(r4)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
            if (r1 == 0) goto L_0x0066
            android.content.res.XmlResourceParser r1 = r2.getXml(r3)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
            m72$b r1 = p000.m72.m22040b(r1, r2)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
            if (r1 != 0) goto L_0x0051
            if (r10 == 0) goto L_0x0050
            r10.mo26761c(r13, r11)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
        L_0x0050:
            return r14
        L_0x0051:
            int r5 = r0.assetCookie     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
            r0 = r15
            r2 = r16
            r3 = r18
            r4 = r12
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            android.graphics.Typeface r0 = p000.g27.m17573c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
            return r0
        L_0x0066:
            int r4 = r0.assetCookie     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
            r0 = r15
            r1 = r16
            r2 = r18
            r3 = r12
            r5 = r19
            android.graphics.Typeface r0 = p000.g27.m17574d(r0, r1, r2, r3, r4, r5)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
            if (r10 == 0) goto L_0x007f
            if (r0 == 0) goto L_0x007c
            r10.mo26762d(r0, r11)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
            goto L_0x007f
        L_0x007c:
            r10.mo26761c(r13, r11)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
        L_0x007f:
            return r0
        L_0x0080:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to read xml resource "
            r0.append(r1)
            r0.append(r12)
            goto L_0x009b
        L_0x008e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to parse xml resource "
            r0.append(r1)
            r0.append(r12)
        L_0x009b:
            if (r10 == 0) goto L_0x00a0
            r10.mo26761c(r13, r11)
        L_0x00a0:
            return r14
        L_0x00a1:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Resource \""
            r4.append(r5)
            java.lang.String r2 = r2.getResourceName(r3)
            r4.append(r2)
            java.lang.String r2 = "\" ("
            r4.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r18)
            r4.append(r2)
            java.lang.String r2 = ") is not a Font: "
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.uf5.m28232o(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, uf5$e, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
