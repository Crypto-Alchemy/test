package p000;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets$Builder;
import android.view.WindowInsets$Type;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: hl7 */
/* compiled from: WindowInsetsCompat */
public class hl7 {

    /* renamed from: b */
    public static final hl7 f12927b;

    /* renamed from: a */
    public final C2491l f12928a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: hl7$a */
    /* compiled from: WindowInsetsCompat */
    public static class C2480a {

        /* renamed from: a */
        public static Field f12929a;

        /* renamed from: b */
        public static Field f12930b;

        /* renamed from: c */
        public static Field f12931c;

        /* renamed from: d */
        public static boolean f12932d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f12929a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f12930b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f12931c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to get visible insets from AttachInfo ");
                sb.append(e.getMessage());
            }
        }

        /* renamed from: a */
        public static hl7 m18999a(View view) {
            if (f12932d && view.isAttachedToWindow()) {
                try {
                    Object obj = f12929a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f12930b.get(obj);
                        Rect rect2 = (Rect) f12931c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            hl7 a = new C2481b().mo21251b(qv2.m25932c(rect)).mo21252c(qv2.m25932c(rect2)).mo21250a();
                            a.mo21247u(a);
                            a.mo21229d(view.getRootView());
                            return a;
                        }
                    }
                } catch (IllegalAccessException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to get insets from AttachInfo. ");
                    sb.append(e.getMessage());
                }
            }
            return null;
        }
    }

    /* renamed from: hl7$e */
    /* compiled from: WindowInsetsCompat */
    public static class C2484e extends C2483d {
        public C2484e() {
        }

        public C2484e(hl7 hl7) {
            super(hl7);
        }
    }

    /* renamed from: hl7$f */
    /* compiled from: WindowInsetsCompat */
    public static class C2485f {

        /* renamed from: a */
        public final hl7 f12941a;

        /* renamed from: b */
        public qv2[] f12942b;

        public C2485f() {
            this(new hl7((hl7) null));
        }

        /* renamed from: a */
        public final void mo21259a() {
            qv2[] qv2Arr = this.f12942b;
            if (qv2Arr != null) {
                qv2 qv2 = qv2Arr[C2492m.m19067a(1)];
                qv2 qv22 = this.f12942b[C2492m.m19067a(2)];
                if (qv22 == null) {
                    qv22 = this.f12941a.mo21232f(2);
                }
                if (qv2 == null) {
                    qv2 = this.f12941a.mo21232f(1);
                }
                mo21255f(qv2.m25930a(qv2, qv22));
                qv2 qv23 = this.f12942b[C2492m.m19067a(16)];
                if (qv23 != null) {
                    mo21257e(qv23);
                }
                qv2 qv24 = this.f12942b[C2492m.m19067a(32)];
                if (qv24 != null) {
                    mo21256c(qv24);
                }
                qv2 qv25 = this.f12942b[C2492m.m19067a(64)];
                if (qv25 != null) {
                    mo21258g(qv25);
                }
            }
        }

        /* renamed from: b */
        public hl7 mo21253b() {
            throw null;
        }

        /* renamed from: c */
        public void mo21256c(qv2 qv2) {
        }

        /* renamed from: d */
        public void mo21254d(qv2 qv2) {
            throw null;
        }

        /* renamed from: e */
        public void mo21257e(qv2 qv2) {
        }

        /* renamed from: f */
        public void mo21255f(qv2 qv2) {
            throw null;
        }

        /* renamed from: g */
        public void mo21258g(qv2 qv2) {
        }

        public C2485f(hl7 hl7) {
            this.f12941a = hl7;
        }
    }

    /* renamed from: hl7$i */
    /* compiled from: WindowInsetsCompat */
    public static class C2488i extends C2487h {
        public C2488i(hl7 hl7, WindowInsets windowInsets) {
            super(hl7, windowInsets);
        }

        /* renamed from: a */
        public hl7 mo21276a() {
            return hl7.m18975x(this.f12948c.consumeDisplayCutout());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2488i)) {
                return false;
            }
            C2488i iVar = (C2488i) obj;
            if (!Objects.equals(this.f12948c, iVar.f12948c) || !Objects.equals(this.f12952g, iVar.f12952g)) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public rh1 mo21277f() {
            return rh1.m26192e(this.f12948c.getDisplayCutout());
        }

        public int hashCode() {
            return this.f12948c.hashCode();
        }

        public C2488i(hl7 hl7, C2488i iVar) {
            super(hl7, (C2487h) iVar);
        }
    }

    /* renamed from: hl7$k */
    /* compiled from: WindowInsetsCompat */
    public static class C2490k extends C2489j {

        /* renamed from: q */
        public static final hl7 f12957q = hl7.m18975x(WindowInsets.CONSUMED);

        public C2490k(hl7 hl7, WindowInsets windowInsets) {
            super(hl7, windowInsets);
        }

        /* renamed from: d */
        public final void mo21260d(View view) {
        }

        /* renamed from: g */
        public qv2 mo21263g(int i) {
            return qv2.m25933d(this.f12948c.getInsets(C2493n.m19069a(i)));
        }

        public C2490k(hl7 hl7, C2490k kVar) {
            super(hl7, (C2489j) kVar);
        }
    }

    /* renamed from: hl7$l */
    /* compiled from: WindowInsetsCompat */
    public static class C2491l {

        /* renamed from: b */
        public static final hl7 f12958b = new C2481b().mo21250a().mo21226a().mo21227b().mo21228c();

        /* renamed from: a */
        public final hl7 f12959a;

        public C2491l(hl7 hl7) {
            this.f12959a = hl7;
        }

        /* renamed from: a */
        public hl7 mo21276a() {
            return this.f12959a;
        }

        /* renamed from: b */
        public hl7 mo21271b() {
            return this.f12959a;
        }

        /* renamed from: c */
        public hl7 mo21272c() {
            return this.f12959a;
        }

        /* renamed from: d */
        public void mo21260d(View view) {
        }

        /* renamed from: e */
        public void mo21261e(hl7 hl7) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2491l)) {
                return false;
            }
            C2491l lVar = (C2491l) obj;
            if (mo21266o() != lVar.mo21266o() || mo21274n() != lVar.mo21274n() || !mf4.m22283a(mo21264k(), lVar.mo21264k()) || !mf4.m22283a(mo21273i(), lVar.mo21273i()) || !mf4.m22283a(mo21277f(), lVar.mo21277f())) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public rh1 mo21277f() {
            return null;
        }

        /* renamed from: g */
        public qv2 mo21263g(int i) {
            return qv2.f17073e;
        }

        /* renamed from: h */
        public qv2 mo21279h() {
            return mo21264k();
        }

        public int hashCode() {
            return mf4.m22284b(Boolean.valueOf(mo21266o()), Boolean.valueOf(mo21274n()), mo21264k(), mo21273i(), mo21277f());
        }

        /* renamed from: i */
        public qv2 mo21273i() {
            return qv2.f17073e;
        }

        /* renamed from: j */
        public qv2 mo21280j() {
            return mo21264k();
        }

        /* renamed from: k */
        public qv2 mo21264k() {
            return qv2.f17073e;
        }

        /* renamed from: l */
        public qv2 mo21281l() {
            return mo21264k();
        }

        /* renamed from: m */
        public hl7 mo21265m(int i, int i2, int i3, int i4) {
            return f12958b;
        }

        /* renamed from: n */
        public boolean mo21274n() {
            return false;
        }

        /* renamed from: o */
        public boolean mo21266o() {
            return false;
        }

        /* renamed from: p */
        public void mo21267p(qv2[] qv2Arr) {
        }

        /* renamed from: q */
        public void mo21268q(qv2 qv2) {
        }

        /* renamed from: r */
        public void mo21269r(hl7 hl7) {
        }

        /* renamed from: s */
        public void mo21275s(qv2 qv2) {
        }
    }

    /* renamed from: hl7$m */
    /* compiled from: WindowInsetsCompat */
    public static final class C2492m {
        /* renamed from: a */
        public static int m19067a(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
        }

        /* renamed from: b */
        public static int m19068b() {
            return 7;
        }
    }

    /* renamed from: hl7$n */
    /* compiled from: WindowInsetsCompat */
    public static final class C2493n {
        /* renamed from: a */
        public static int m19069a(int i) {
            int i2;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i & i4) != 0) {
                    if (i4 == 1) {
                        i2 = WindowInsets$Type.statusBars();
                    } else if (i4 == 2) {
                        i2 = WindowInsets$Type.navigationBars();
                    } else if (i4 == 4) {
                        i2 = WindowInsets$Type.captionBar();
                    } else if (i4 == 8) {
                        i2 = WindowInsets$Type.ime();
                    } else if (i4 == 16) {
                        i2 = WindowInsets$Type.systemGestures();
                    } else if (i4 == 32) {
                        i2 = WindowInsets$Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        i2 = WindowInsets$Type.tappableElement();
                    } else if (i4 == 128) {
                        i2 = WindowInsets$Type.displayCutout();
                    }
                    i3 |= i2;
                }
            }
            return i3;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f12927b = C2490k.f12957q;
        } else {
            f12927b = C2491l.f12958b;
        }
    }

    public hl7(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f12928a = new C2490k(this, windowInsets);
        } else if (i >= 29) {
            this.f12928a = new C2489j(this, windowInsets);
        } else if (i >= 28) {
            this.f12928a = new C2488i(this, windowInsets);
        } else {
            this.f12928a = new C2487h(this, windowInsets);
        }
    }

    /* renamed from: p */
    public static qv2 m18974p(qv2 qv2, int i, int i2, int i3, int i4) {
        int max = Math.max(0, qv2.f17074a - i);
        int max2 = Math.max(0, qv2.f17075b - i2);
        int max3 = Math.max(0, qv2.f17076c - i3);
        int max4 = Math.max(0, qv2.f17077d - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return qv2;
        }
        return qv2.m25931b(max, max2, max3, max4);
    }

    /* renamed from: x */
    public static hl7 m18975x(WindowInsets windowInsets) {
        return m18976y(windowInsets, (View) null);
    }

    /* renamed from: y */
    public static hl7 m18976y(WindowInsets windowInsets, View view) {
        hl7 hl7 = new hl7((WindowInsets) gu4.m18428f(windowInsets));
        if (view != null && ga7.m17746S(view)) {
            hl7.mo21247u(ga7.m17729I(view));
            hl7.mo21229d(view.getRootView());
        }
        return hl7;
    }

    @Deprecated
    /* renamed from: a */
    public hl7 mo21226a() {
        return this.f12928a.mo21276a();
    }

    @Deprecated
    /* renamed from: b */
    public hl7 mo21227b() {
        return this.f12928a.mo21271b();
    }

    @Deprecated
    /* renamed from: c */
    public hl7 mo21228c() {
        return this.f12928a.mo21272c();
    }

    /* renamed from: d */
    public void mo21229d(View view) {
        this.f12928a.mo21260d(view);
    }

    /* renamed from: e */
    public rh1 mo21230e() {
        return this.f12928a.mo21277f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl7)) {
            return false;
        }
        return mf4.m22283a(this.f12928a, ((hl7) obj).f12928a);
    }

    /* renamed from: f */
    public qv2 mo21232f(int i) {
        return this.f12928a.mo21263g(i);
    }

    @Deprecated
    /* renamed from: g */
    public qv2 mo21233g() {
        return this.f12928a.mo21279h();
    }

    @Deprecated
    /* renamed from: h */
    public qv2 mo21234h() {
        return this.f12928a.mo21273i();
    }

    public int hashCode() {
        C2491l lVar = this.f12928a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public qv2 mo21236i() {
        return this.f12928a.mo21280j();
    }

    @Deprecated
    /* renamed from: j */
    public int mo21237j() {
        return this.f12928a.mo21264k().f17077d;
    }

    @Deprecated
    /* renamed from: k */
    public int mo21238k() {
        return this.f12928a.mo21264k().f17074a;
    }

    @Deprecated
    /* renamed from: l */
    public int mo21239l() {
        return this.f12928a.mo21264k().f17076c;
    }

    @Deprecated
    /* renamed from: m */
    public int mo21240m() {
        return this.f12928a.mo21264k().f17075b;
    }

    @Deprecated
    /* renamed from: n */
    public boolean mo21241n() {
        return !this.f12928a.mo21264k().equals(qv2.f17073e);
    }

    /* renamed from: o */
    public hl7 mo21242o(int i, int i2, int i3, int i4) {
        return this.f12928a.mo21265m(i, i2, i3, i4);
    }

    /* renamed from: q */
    public boolean mo21243q() {
        return this.f12928a.mo21274n();
    }

    @Deprecated
    /* renamed from: r */
    public hl7 mo21244r(int i, int i2, int i3, int i4) {
        return new C2481b(this).mo21252c(qv2.m25931b(i, i2, i3, i4)).mo21250a();
    }

    /* renamed from: s */
    public void mo21245s(qv2[] qv2Arr) {
        this.f12928a.mo21267p(qv2Arr);
    }

    /* renamed from: t */
    public void mo21246t(qv2 qv2) {
        this.f12928a.mo21268q(qv2);
    }

    /* renamed from: u */
    public void mo21247u(hl7 hl7) {
        this.f12928a.mo21269r(hl7);
    }

    /* renamed from: v */
    public void mo21248v(qv2 qv2) {
        this.f12928a.mo21275s(qv2);
    }

    /* renamed from: w */
    public WindowInsets mo21249w() {
        C2491l lVar = this.f12928a;
        if (lVar instanceof C2486g) {
            return ((C2486g) lVar).f12948c;
        }
        return null;
    }

    /* renamed from: hl7$c */
    /* compiled from: WindowInsetsCompat */
    public static class C2482c extends C2485f {

        /* renamed from: e */
        public static Field f12934e = null;

        /* renamed from: f */
        public static boolean f12935f = false;

        /* renamed from: g */
        public static Constructor<WindowInsets> f12936g = null;

        /* renamed from: h */
        public static boolean f12937h = false;

        /* renamed from: c */
        public WindowInsets f12938c;

        /* renamed from: d */
        public qv2 f12939d;

        public C2482c() {
            this.f12938c = m19003h();
        }

        /* renamed from: h */
        private static WindowInsets m19003h() {
            if (!f12935f) {
                try {
                    f12934e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f12935f = true;
            }
            Field field = f12934e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f12937h) {
                try {
                    f12936g = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException unused3) {
                }
                f12937h = true;
            }
            Constructor<WindowInsets> constructor = f12936g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        /* renamed from: b */
        public hl7 mo21253b() {
            mo21259a();
            hl7 x = hl7.m18975x(this.f12938c);
            x.mo21245s(this.f12942b);
            x.mo21248v(this.f12939d);
            return x;
        }

        /* renamed from: d */
        public void mo21254d(qv2 qv2) {
            this.f12939d = qv2;
        }

        /* renamed from: f */
        public void mo21255f(qv2 qv2) {
            WindowInsets windowInsets = this.f12938c;
            if (windowInsets != null) {
                this.f12938c = windowInsets.replaceSystemWindowInsets(qv2.f17074a, qv2.f17075b, qv2.f17076c, qv2.f17077d);
            }
        }

        public C2482c(hl7 hl7) {
            super(hl7);
            this.f12938c = hl7.mo21249w();
        }
    }

    /* renamed from: hl7$d */
    /* compiled from: WindowInsetsCompat */
    public static class C2483d extends C2485f {

        /* renamed from: c */
        public final WindowInsets$Builder f12940c;

        public C2483d() {
            this.f12940c = new WindowInsets$Builder();
        }

        /* renamed from: b */
        public hl7 mo21253b() {
            mo21259a();
            hl7 x = hl7.m18975x(this.f12940c.build());
            x.mo21245s(this.f12942b);
            return x;
        }

        /* renamed from: c */
        public void mo21256c(qv2 qv2) {
            this.f12940c.setMandatorySystemGestureInsets(qv2.mo25273e());
        }

        /* renamed from: d */
        public void mo21254d(qv2 qv2) {
            this.f12940c.setStableInsets(qv2.mo25273e());
        }

        /* renamed from: e */
        public void mo21257e(qv2 qv2) {
            this.f12940c.setSystemGestureInsets(qv2.mo25273e());
        }

        /* renamed from: f */
        public void mo21255f(qv2 qv2) {
            this.f12940c.setSystemWindowInsets(qv2.mo25273e());
        }

        /* renamed from: g */
        public void mo21258g(qv2 qv2) {
            this.f12940c.setTappableElementInsets(qv2.mo25273e());
        }

        public C2483d(hl7 hl7) {
            super(hl7);
            WindowInsets$Builder windowInsets$Builder;
            WindowInsets w = hl7.mo21249w();
            if (w != null) {
                windowInsets$Builder = new WindowInsets$Builder(w);
            } else {
                new WindowInsets$Builder
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0011: CONSTRUCTOR  (r0v1 ? I:android.view.WindowInsets$Builder) =  call: android.view.WindowInsets$Builder.<init>():void type: CONSTRUCTOR in method: hl7.d.<init>(hl7):void, dex: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v1 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 51 more
                    */
                /*
                    this = this;
                    r1.<init>(r2)
                    android.view.WindowInsets r2 = r2.mo21249w()
                    if (r2 == 0) goto L_0x000f
                    android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
                    r0.<init>(r2)
                    goto L_0x0014
                L_0x000f:
                    android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
                    r0.<init>()
                L_0x0014:
                    r1.f12940c = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.hl7.C2483d.<init>(hl7):void");
            }
        }

        /* renamed from: hl7$h */
        /* compiled from: WindowInsetsCompat */
        public static class C2487h extends C2486g {

            /* renamed from: m */
            public qv2 f12953m = null;

            public C2487h(hl7 hl7, WindowInsets windowInsets) {
                super(hl7, windowInsets);
            }

            /* renamed from: b */
            public hl7 mo21271b() {
                return hl7.m18975x(this.f12948c.consumeStableInsets());
            }

            /* renamed from: c */
            public hl7 mo21272c() {
                return hl7.m18975x(this.f12948c.consumeSystemWindowInsets());
            }

            /* renamed from: i */
            public final qv2 mo21273i() {
                if (this.f12953m == null) {
                    this.f12953m = qv2.m25931b(this.f12948c.getStableInsetLeft(), this.f12948c.getStableInsetTop(), this.f12948c.getStableInsetRight(), this.f12948c.getStableInsetBottom());
                }
                return this.f12953m;
            }

            /* renamed from: n */
            public boolean mo21274n() {
                return this.f12948c.isConsumed();
            }

            /* renamed from: s */
            public void mo21275s(qv2 qv2) {
                this.f12953m = qv2;
            }

            public C2487h(hl7 hl7, C2487h hVar) {
                super(hl7, (C2486g) hVar);
                this.f12953m = hVar.f12953m;
            }
        }

        /* renamed from: hl7$g */
        /* compiled from: WindowInsetsCompat */
        public static class C2486g extends C2491l {

            /* renamed from: h */
            public static boolean f12943h = false;

            /* renamed from: i */
            public static Method f12944i;

            /* renamed from: j */
            public static Class<?> f12945j;

            /* renamed from: k */
            public static Field f12946k;

            /* renamed from: l */
            public static Field f12947l;

            /* renamed from: c */
            public final WindowInsets f12948c;

            /* renamed from: d */
            public qv2[] f12949d;

            /* renamed from: e */
            public qv2 f12950e;

            /* renamed from: f */
            public hl7 f12951f;

            /* renamed from: g */
            public qv2 f12952g;

            public C2486g(hl7 hl7, WindowInsets windowInsets) {
                super(hl7);
                this.f12950e = null;
                this.f12948c = windowInsets;
            }

            @SuppressLint({"WrongConstant"})
            /* renamed from: t */
            private qv2 m19020t(int i, boolean z) {
                qv2 qv2 = qv2.f17073e;
                for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                    if ((i & i2) != 0) {
                        qv2 = qv2.m25930a(qv2, mo21270u(i2, z));
                    }
                }
                return qv2;
            }

            /* renamed from: v */
            private qv2 m19021v() {
                hl7 hl7 = this.f12951f;
                if (hl7 != null) {
                    return hl7.mo21234h();
                }
                return qv2.f17073e;
            }

            /* renamed from: w */
            private qv2 m19022w(View view) {
                if (Build.VERSION.SDK_INT < 30) {
                    if (!f12943h) {
                        m19023x();
                    }
                    Method method = f12944i;
                    if (!(method == null || f12945j == null || f12946k == null)) {
                        try {
                            Object invoke = method.invoke(view, new Object[0]);
                            if (invoke == null) {
                                return null;
                            }
                            Rect rect = (Rect) f12946k.get(f12947l.get(invoke));
                            if (rect != null) {
                                return qv2.m25932c(rect);
                            }
                            return null;
                        } catch (ReflectiveOperationException e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Failed to get visible insets. (Reflection error). ");
                            sb.append(e.getMessage());
                        }
                    }
                    return null;
                }
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }

            @SuppressLint({"PrivateApi"})
            /* renamed from: x */
            private static void m19023x() {
                try {
                    f12944i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                    Class<?> cls = Class.forName("android.view.View$AttachInfo");
                    f12945j = cls;
                    f12946k = cls.getDeclaredField("mVisibleInsets");
                    f12947l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                    f12946k.setAccessible(true);
                    f12947l.setAccessible(true);
                } catch (ReflectiveOperationException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to get visible insets. (Reflection error). ");
                    sb.append(e.getMessage());
                }
                f12943h = true;
            }

            /* renamed from: d */
            public void mo21260d(View view) {
                qv2 w = m19022w(view);
                if (w == null) {
                    w = qv2.f17073e;
                }
                mo21268q(w);
            }

            /* renamed from: e */
            public void mo21261e(hl7 hl7) {
                hl7.mo21247u(this.f12951f);
                hl7.mo21246t(this.f12952g);
            }

            public boolean equals(Object obj) {
                if (!super.equals(obj)) {
                    return false;
                }
                return Objects.equals(this.f12952g, ((C2486g) obj).f12952g);
            }

            /* renamed from: g */
            public qv2 mo21263g(int i) {
                return m19020t(i, false);
            }

            /* renamed from: k */
            public final qv2 mo21264k() {
                if (this.f12950e == null) {
                    this.f12950e = qv2.m25931b(this.f12948c.getSystemWindowInsetLeft(), this.f12948c.getSystemWindowInsetTop(), this.f12948c.getSystemWindowInsetRight(), this.f12948c.getSystemWindowInsetBottom());
                }
                return this.f12950e;
            }

            /* renamed from: m */
            public hl7 mo21265m(int i, int i2, int i3, int i4) {
                C2481b bVar = new C2481b(hl7.m18975x(this.f12948c));
                bVar.mo21252c(hl7.m18974p(mo21264k(), i, i2, i3, i4));
                bVar.mo21251b(hl7.m18974p(mo21273i(), i, i2, i3, i4));
                return bVar.mo21250a();
            }

            /* renamed from: o */
            public boolean mo21266o() {
                return this.f12948c.isRound();
            }

            /* renamed from: p */
            public void mo21267p(qv2[] qv2Arr) {
                this.f12949d = qv2Arr;
            }

            /* renamed from: q */
            public void mo21268q(qv2 qv2) {
                this.f12952g = qv2;
            }

            /* renamed from: r */
            public void mo21269r(hl7 hl7) {
                this.f12951f = hl7;
            }

            /* renamed from: u */
            public qv2 mo21270u(int i, boolean z) {
                int i2;
                rh1 rh1;
                if (i != 1) {
                    qv2 qv2 = null;
                    if (i != 2) {
                        if (i == 8) {
                            qv2[] qv2Arr = this.f12949d;
                            if (qv2Arr != null) {
                                qv2 = qv2Arr[C2492m.m19067a(8)];
                            }
                            if (qv2 != null) {
                                return qv2;
                            }
                            qv2 k = mo21264k();
                            qv2 v = m19021v();
                            int i3 = k.f17077d;
                            if (i3 > v.f17077d) {
                                return qv2.m25931b(0, 0, 0, i3);
                            }
                            qv2 qv22 = this.f12952g;
                            if (qv22 == null || qv22.equals(qv2.f17073e) || (i2 = this.f12952g.f17077d) <= v.f17077d) {
                                return qv2.f17073e;
                            }
                            return qv2.m25931b(0, 0, 0, i2);
                        } else if (i == 16) {
                            return mo21280j();
                        } else {
                            if (i == 32) {
                                return mo21279h();
                            }
                            if (i == 64) {
                                return mo21281l();
                            }
                            if (i != 128) {
                                return qv2.f17073e;
                            }
                            hl7 hl7 = this.f12951f;
                            if (hl7 != null) {
                                rh1 = hl7.mo21230e();
                            } else {
                                rh1 = mo21277f();
                            }
                            if (rh1 != null) {
                                return qv2.m25931b(rh1.mo25379b(), rh1.mo25381d(), rh1.mo25380c(), rh1.mo25378a());
                            }
                            return qv2.f17073e;
                        }
                    } else if (z) {
                        qv2 v2 = m19021v();
                        qv2 i4 = mo21273i();
                        return qv2.m25931b(Math.max(v2.f17074a, i4.f17074a), 0, Math.max(v2.f17076c, i4.f17076c), Math.max(v2.f17077d, i4.f17077d));
                    } else {
                        qv2 k2 = mo21264k();
                        hl7 hl72 = this.f12951f;
                        if (hl72 != null) {
                            qv2 = hl72.mo21234h();
                        }
                        int i5 = k2.f17077d;
                        if (qv2 != null) {
                            i5 = Math.min(i5, qv2.f17077d);
                        }
                        return qv2.m25931b(k2.f17074a, 0, k2.f17076c, i5);
                    }
                } else if (z) {
                    return qv2.m25931b(0, Math.max(m19021v().f17075b, mo21264k().f17075b), 0, 0);
                } else {
                    return qv2.m25931b(0, mo21264k().f17075b, 0, 0);
                }
            }

            public C2486g(hl7 hl7, C2486g gVar) {
                this(hl7, new WindowInsets(gVar.f12948c));
            }
        }

        /* renamed from: hl7$j */
        /* compiled from: WindowInsetsCompat */
        public static class C2489j extends C2488i {

            /* renamed from: n */
            public qv2 f12954n = null;

            /* renamed from: o */
            public qv2 f12955o = null;

            /* renamed from: p */
            public qv2 f12956p = null;

            public C2489j(hl7 hl7, WindowInsets windowInsets) {
                super(hl7, windowInsets);
            }

            /* renamed from: h */
            public qv2 mo21279h() {
                if (this.f12955o == null) {
                    this.f12955o = qv2.m25933d(this.f12948c.getMandatorySystemGestureInsets());
                }
                return this.f12955o;
            }

            /* renamed from: j */
            public qv2 mo21280j() {
                if (this.f12954n == null) {
                    this.f12954n = qv2.m25933d(this.f12948c.getSystemGestureInsets());
                }
                return this.f12954n;
            }

            /* renamed from: l */
            public qv2 mo21281l() {
                if (this.f12956p == null) {
                    this.f12956p = qv2.m25933d(this.f12948c.getTappableElementInsets());
                }
                return this.f12956p;
            }

            /* renamed from: m */
            public hl7 mo21265m(int i, int i2, int i3, int i4) {
                return hl7.m18975x(this.f12948c.inset(i, i2, i3, i4));
            }

            /* renamed from: s */
            public void mo21275s(qv2 qv2) {
            }

            public C2489j(hl7 hl7, C2489j jVar) {
                super(hl7, (C2488i) jVar);
            }
        }

        /* renamed from: hl7$b */
        /* compiled from: WindowInsetsCompat */
        public static final class C2481b {

            /* renamed from: a */
            public final C2485f f12933a;

            public C2481b() {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    this.f12933a = new C2484e();
                } else if (i >= 29) {
                    this.f12933a = new C2483d();
                } else {
                    this.f12933a = new C2482c();
                }
            }

            /* renamed from: a */
            public hl7 mo21250a() {
                return this.f12933a.mo21253b();
            }

            @Deprecated
            /* renamed from: b */
            public C2481b mo21251b(qv2 qv2) {
                this.f12933a.mo21254d(qv2);
                return this;
            }

            @Deprecated
            /* renamed from: c */
            public C2481b mo21252c(qv2 qv2) {
                this.f12933a.mo21255f(qv2);
                return this;
            }

            public C2481b(hl7 hl7) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    this.f12933a = new C2484e(hl7);
                } else if (i >= 29) {
                    this.f12933a = new C2483d(hl7);
                } else {
                    this.f12933a = new C2482c(hl7);
                }
            }
        }

        public hl7(hl7 hl7) {
            if (hl7 != null) {
                C2491l lVar = hl7.f12928a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && (lVar instanceof C2490k)) {
                    this.f12928a = new C2490k(this, (C2490k) lVar);
                } else if (i >= 29 && (lVar instanceof C2489j)) {
                    this.f12928a = new C2489j(this, (C2489j) lVar);
                } else if (i >= 28 && (lVar instanceof C2488i)) {
                    this.f12928a = new C2488i(this, (C2488i) lVar);
                } else if (lVar instanceof C2487h) {
                    this.f12928a = new C2487h(this, (C2487h) lVar);
                } else if (lVar instanceof C2486g) {
                    this.f12928a = new C2486g(this, (C2486g) lVar);
                } else {
                    this.f12928a = new C2491l(this);
                }
                lVar.mo21261e(this);
                return;
            }
            this.f12928a = new C2491l(this);
        }
    }
