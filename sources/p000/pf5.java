package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: pf5 */
/* compiled from: ResourceManagerInternal */
public final class pf5 {

    /* renamed from: h */
    public static final PorterDuff.Mode f16429h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i */
    public static pf5 f16430i;

    /* renamed from: j */
    public static final C3056c f16431j = new C3056c(6);

    /* renamed from: a */
    public WeakHashMap<Context, j66<ColorStateList>> f16432a;

    /* renamed from: b */
    public y16<String, C3058e> f16433b;

    /* renamed from: c */
    public j66<String> f16434c;

    /* renamed from: d */
    public final WeakHashMap<Context, hl3<WeakReference<Drawable.ConstantState>>> f16435d = new WeakHashMap<>(0);

    /* renamed from: e */
    public TypedValue f16436e;

    /* renamed from: f */
    public boolean f16437f;

    /* renamed from: g */
    public C3059f f16438g;

    /* renamed from: pf5$a */
    /* compiled from: ResourceManagerInternal */
    public static class C3054a implements C3058e {
        /* renamed from: a */
        public Drawable mo24570a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C3196rk.m26230m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: pf5$b */
    /* compiled from: ResourceManagerInternal */
    public static class C3055b implements C3058e {
        /* renamed from: a */
        public Drawable mo24570a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C3273sk.m26936a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: pf5$c */
    /* compiled from: ResourceManagerInternal */
    public static class C3056c extends em3<Integer, PorterDuffColorFilter> {
        public C3056c(int i) {
            super(i);
        }

        /* renamed from: j */
        public static int m24891j(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* renamed from: k */
        public PorterDuffColorFilter mo24571k(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) mo19372c(Integer.valueOf(m24891j(i, mode)));
        }

        /* renamed from: l */
        public PorterDuffColorFilter mo24572l(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo19373d(Integer.valueOf(m24891j(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: pf5$d */
    /* compiled from: ResourceManagerInternal */
    public static class C3057d implements C3058e {
        /* renamed from: a */
        public Drawable mo24570a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) C3057d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    bm0.m11448c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    /* renamed from: pf5$e */
    /* compiled from: ResourceManagerInternal */
    public interface C3058e {
        /* renamed from: a */
        Drawable mo24570a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: pf5$f */
    /* compiled from: ResourceManagerInternal */
    public interface C3059f {
        /* renamed from: a */
        Drawable mo24573a(pf5 pf5, Context context, int i);

        /* renamed from: b */
        ColorStateList mo24574b(Context context, int i);

        /* renamed from: c */
        boolean mo24575c(Context context, int i, Drawable drawable);

        /* renamed from: d */
        PorterDuff.Mode mo24576d(int i);

        /* renamed from: e */
        boolean mo24577e(Context context, int i, Drawable drawable);
    }

    /* renamed from: pf5$g */
    /* compiled from: ResourceManagerInternal */
    public static class C3060g implements C3058e {
        /* renamed from: a */
        public Drawable mo24570a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return t87.m27603c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: e */
    public static long m24865e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: g */
    public static PorterDuffColorFilter m24866g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m24868l(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: h */
    public static synchronized pf5 m24867h() {
        pf5 pf5;
        synchronized (pf5.class) {
            if (f16430i == null) {
                pf5 pf52 = new pf5();
                f16430i = pf52;
                m24869p(pf52);
            }
            pf5 = f16430i;
        }
        return pf5;
    }

    /* renamed from: l */
    public static synchronized PorterDuffColorFilter m24868l(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter k;
        synchronized (pf5.class) {
            C3056c cVar = f16431j;
            k = cVar.mo24571k(i, mode);
            if (k == null) {
                k = new PorterDuffColorFilter(i, mode);
                cVar.mo24572l(i, mode, k);
            }
        }
        return k;
    }

    /* renamed from: p */
    public static void m24869p(pf5 pf5) {
        if (Build.VERSION.SDK_INT < 24) {
            pf5.mo24553a("vector", new C3060g());
            pf5.mo24553a("animated-vector", new C3055b());
            pf5.mo24553a("animated-selector", new C3054a());
            pf5.mo24553a("drawable", new C3057d());
        }
    }

    /* renamed from: q */
    public static boolean m24870q(Drawable drawable) {
        if ((drawable instanceof t87) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public static void m24871w(Drawable drawable, wq6 wq6, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        boolean z;
        int[] state = drawable.getState();
        if (sj1.m26919a(drawable)) {
            if (drawable.mutate() == drawable) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return;
            }
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = wq6.f19223d;
        if (z2 || wq6.f19222c) {
            if (z2) {
                colorStateList = wq6.f19220a;
            } else {
                colorStateList = null;
            }
            if (wq6.f19222c) {
                mode = wq6.f19221b;
            } else {
                mode = f16429h;
            }
            drawable.setColorFilter(m24866g(colorStateList, mode, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: a */
    public final void mo24553a(String str, C3058e eVar) {
        if (this.f16433b == null) {
            this.f16433b = new y16<>();
        }
        this.f16433b.put(str, eVar);
    }

    /* renamed from: b */
    public final synchronized boolean mo24554b(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        hl3 hl3 = this.f16435d.get(context);
        if (hl3 == null) {
            hl3 = new hl3();
            this.f16435d.put(context, hl3);
        }
        hl3.mo21214o(j, new WeakReference(constantState));
        return true;
    }

    /* renamed from: c */
    public final void mo24555c(Context context, int i, ColorStateList colorStateList) {
        if (this.f16432a == null) {
            this.f16432a = new WeakHashMap<>();
        }
        j66 j66 = this.f16432a.get(context);
        if (j66 == null) {
            j66 = new j66();
            this.f16432a.put(context, j66);
        }
        j66.mo21749a(i, colorStateList);
    }

    /* renamed from: d */
    public final void mo24556d(Context context) {
        if (!this.f16437f) {
            this.f16437f = true;
            Drawable j = mo24559j(context, o25.abc_vector_test);
            if (j == null || !m24870q(j)) {
                this.f16437f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: f */
    public final Drawable mo24557f(Context context, int i) {
        Drawable drawable;
        if (this.f16436e == null) {
            this.f16436e = new TypedValue();
        }
        TypedValue typedValue = this.f16436e;
        context.getResources().getValue(i, typedValue, true);
        long e = m24865e(typedValue);
        Drawable i2 = mo24558i(context, e);
        if (i2 != null) {
            return i2;
        }
        C3059f fVar = this.f16438g;
        if (fVar == null) {
            drawable = null;
        } else {
            drawable = fVar.mo24573a(this, context, i);
        }
        if (drawable != null) {
            drawable.setChangingConfigurations(typedValue.changingConfigurations);
            mo24554b(context, e, drawable);
        }
        return drawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable mo24558i(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, hl3<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f16435d     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            hl3 r0 = (p000.hl3) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo21209h(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.mo21216r(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.pf5.mo24558i(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: j */
    public synchronized Drawable mo24559j(Context context, int i) {
        return mo24560k(context, i, false);
    }

    /* renamed from: k */
    public synchronized Drawable mo24560k(Context context, int i, boolean z) {
        Drawable r;
        mo24556d(context);
        r = mo24564r(context, i);
        if (r == null) {
            r = mo24557f(context, i);
        }
        if (r == null) {
            r = zr0.m31442e(context, i);
        }
        if (r != null) {
            r = mo24568v(context, i, z, r);
        }
        if (r != null) {
            sj1.m26920b(r);
        }
        return r;
    }

    /* renamed from: m */
    public synchronized ColorStateList mo24561m(Context context, int i) {
        ColorStateList n;
        n = mo24562n(context, i);
        if (n == null) {
            C3059f fVar = this.f16438g;
            if (fVar == null) {
                n = null;
            } else {
                n = fVar.mo24574b(context, i);
            }
            if (n != null) {
                mo24555c(context, i, n);
            }
        }
        return n;
    }

    /* renamed from: n */
    public final ColorStateList mo24562n(Context context, int i) {
        j66 j66;
        WeakHashMap<Context, j66<ColorStateList>> weakHashMap = this.f16432a;
        if (weakHashMap == null || (j66 = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) j66.mo21756i(i);
    }

    /* renamed from: o */
    public PorterDuff.Mode mo24563o(int i) {
        C3059f fVar = this.f16438g;
        if (fVar == null) {
            return null;
        }
        return fVar.mo24576d(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo24564r(android.content.Context r11, int r12) {
        /*
            r10 = this;
            y16<java.lang.String, pf5$e> r0 = r10.f16433b
            r1 = 0
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00aa
            j66<java.lang.String> r0 = r10.f16434c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.mo21756i(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            y16<java.lang.String, pf5$e> r3 = r10.f16433b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            j66 r0 = new j66
            r0.<init>()
            r10.f16434c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f16436e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f16436e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f16436e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = m24865e(r0)
            android.graphics.drawable.Drawable r6 = r10.mo24558i(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00a2
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00a2
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            j66<java.lang.String> r8 = r10.f16434c     // Catch:{ Exception -> 0x00a2 }
            r8.mo21749a(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            y16<java.lang.String, pf5$e> r8 = r10.f16433b     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            pf5$e r3 = (p000.pf5.C3058e) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.mo24570a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00a2
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.mo24554b(r11, r4, r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00a2
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            if (r6 != 0) goto L_0x00a9
            j66<java.lang.String> r11 = r10.f16434c
            r11.mo21749a(r12, r2)
        L_0x00a9:
            return r6
        L_0x00aa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.pf5.mo24564r(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: s */
    public synchronized void mo24565s(Context context) {
        hl3 hl3 = this.f16435d.get(context);
        if (hl3 != null) {
            hl3.mo21204b();
        }
    }

    /* renamed from: t */
    public synchronized Drawable mo24566t(Context context, u87 u87, int i) {
        Drawable r = mo24564r(context, i);
        if (r == null) {
            r = u87.mo28428a(i);
        }
        if (r == null) {
            return null;
        }
        return mo24568v(context, i, false, r);
    }

    /* renamed from: u */
    public synchronized void mo24567u(C3059f fVar) {
        this.f16438g = fVar;
    }

    /* renamed from: v */
    public final Drawable mo24568v(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList m = mo24561m(context, i);
        if (m != null) {
            if (sj1.m26919a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r = ij1.m19659r(drawable);
            ij1.m19656o(r, m);
            PorterDuff.Mode o = mo24563o(i);
            if (o == null) {
                return r;
            }
            ij1.m19657p(r, o);
            return r;
        }
        C3059f fVar = this.f16438g;
        if ((fVar == null || !fVar.mo24577e(context, i, drawable)) && !mo24569x(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* renamed from: x */
    public boolean mo24569x(Context context, int i, Drawable drawable) {
        C3059f fVar = this.f16438g;
        if (fVar == null || !fVar.mo24575c(context, i, drawable)) {
            return false;
        }
        return true;
    }
}
