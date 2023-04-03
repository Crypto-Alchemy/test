package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.p001os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.github.mikephil.charting.utils.Utils;
import java.lang.ref.WeakReference;
import java.util.Locale;
import p000.uf5;

/* renamed from: ln */
/* compiled from: AppCompatTextHelper */
public class C2765ln {

    /* renamed from: a */
    public final TextView f14590a;

    /* renamed from: b */
    public wq6 f14591b;

    /* renamed from: c */
    public wq6 f14592c;

    /* renamed from: d */
    public wq6 f14593d;

    /* renamed from: e */
    public wq6 f14594e;

    /* renamed from: f */
    public wq6 f14595f;

    /* renamed from: g */
    public wq6 f14596g;

    /* renamed from: h */
    public wq6 f14597h;

    /* renamed from: i */
    public final C3284sn f14598i;

    /* renamed from: j */
    public int f14599j = 0;

    /* renamed from: k */
    public int f14600k = -1;

    /* renamed from: l */
    public Typeface f14601l;

    /* renamed from: m */
    public boolean f14602m;

    /* renamed from: ln$a */
    /* compiled from: AppCompatTextHelper */
    public class C2766a extends uf5.C3410e {

        /* renamed from: a */
        public final /* synthetic */ int f14603a;

        /* renamed from: b */
        public final /* synthetic */ int f14604b;

        /* renamed from: c */
        public final /* synthetic */ WeakReference f14605c;

        public C2766a(int i, int i2, WeakReference weakReference) {
            this.f14603a = i;
            this.f14604b = i2;
            this.f14605c = weakReference;
        }

        /* renamed from: h */
        public void mo22881h(int i) {
        }

        /* renamed from: i */
        public void mo22882i(Typeface typeface) {
            int i;
            boolean z;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f14603a) != -1) {
                if ((this.f14604b & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                typeface = C2772g.m21626a(typeface, i, z);
            }
            C2765ln.this.mo22868n(this.f14605c, typeface);
        }
    }

    /* renamed from: ln$b */
    /* compiled from: AppCompatTextHelper */
    public class C2767b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ TextView f14607a;

        /* renamed from: d */
        public final /* synthetic */ Typeface f14608d;

        /* renamed from: e */
        public final /* synthetic */ int f14609e;

        public C2767b(TextView textView, Typeface typeface, int i) {
            this.f14607a = textView;
            this.f14608d = typeface;
            this.f14609e = i;
        }

        public void run() {
            this.f14607a.setTypeface(this.f14608d, this.f14609e);
        }
    }

    /* renamed from: ln$c */
    /* compiled from: AppCompatTextHelper */
    public static class C2768c {
        /* renamed from: a */
        public static Drawable[] m21616a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        public static void m21617b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: c */
        public static void m21618c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* renamed from: ln$d */
    /* compiled from: AppCompatTextHelper */
    public static class C2769d {
        /* renamed from: a */
        public static Locale m21619a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* renamed from: ln$e */
    /* compiled from: AppCompatTextHelper */
    public static class C2770e {
        /* renamed from: a */
        public static LocaleList m21620a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        /* renamed from: b */
        public static void m21621b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* renamed from: ln$f */
    /* compiled from: AppCompatTextHelper */
    public static class C2771f {
        /* renamed from: a */
        public static int m21622a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        /* renamed from: b */
        public static void m21623b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        /* renamed from: c */
        public static void m21624c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        /* renamed from: d */
        public static boolean m21625d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* renamed from: ln$g */
    /* compiled from: AppCompatTextHelper */
    public static class C2772g {
        /* renamed from: a */
        public static Typeface m21626a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public C2765ln(TextView textView) {
        this.f14590a = textView;
        this.f14598i = new C3284sn(textView);
    }

    /* renamed from: d */
    public static wq6 m21585d(Context context, C3743zm zmVar, int i) {
        ColorStateList f = zmVar.mo28529f(context, i);
        if (f == null) {
            return null;
        }
        wq6 wq6 = new wq6();
        wq6.f19223d = true;
        wq6.f19220a = f;
        return wq6;
    }

    /* renamed from: A */
    public void mo22853A(int i, float f) {
        if (!C3759zt.f20681c && !mo22866l()) {
            mo22854B(i, f);
        }
    }

    /* renamed from: B */
    public final void mo22854B(int i, float f) {
        this.f14598i.mo25893t(i, f);
    }

    /* renamed from: C */
    public final void mo22855C(Context context, yq6 yq6) {
        String o;
        boolean z;
        boolean z2;
        this.f14599j = yq6.mo28185k(j65.TextAppearance_android_textStyle, this.f14599j);
        int i = Build.VERSION.SDK_INT;
        boolean z3 = false;
        if (i >= 28) {
            int k = yq6.mo28185k(j65.TextAppearance_android_textFontWeight, -1);
            this.f14600k = k;
            if (k != -1) {
                this.f14599j = (this.f14599j & 2) | 0;
            }
        }
        int i2 = j65.TextAppearance_android_fontFamily;
        if (yq6.mo28193s(i2) || yq6.mo28193s(j65.TextAppearance_fontFamily)) {
            this.f14601l = null;
            int i3 = j65.TextAppearance_fontFamily;
            if (yq6.mo28193s(i3)) {
                i2 = i3;
            }
            int i4 = this.f14600k;
            int i5 = this.f14599j;
            if (!context.isRestricted()) {
                try {
                    Typeface j = yq6.mo28184j(i2, this.f14599j, new C2766a(i4, i5, new WeakReference(this.f14590a)));
                    if (j != null) {
                        if (i < 28 || this.f14600k == -1) {
                            this.f14601l = j;
                        } else {
                            Typeface create = Typeface.create(j, 0);
                            int i6 = this.f14600k;
                            if ((this.f14599j & 2) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            this.f14601l = C2772g.m21626a(create, i6, z2);
                        }
                    }
                    if (this.f14601l == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f14602m = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f14601l == null && (o = yq6.mo28189o(i2)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f14600k == -1) {
                    this.f14601l = Typeface.create(o, this.f14599j);
                    return;
                }
                Typeface create2 = Typeface.create(o, 0);
                int i7 = this.f14600k;
                if ((this.f14599j & 2) != 0) {
                    z3 = true;
                }
                this.f14601l = C2772g.m21626a(create2, i7, z3);
                return;
            }
            return;
        }
        int i8 = j65.TextAppearance_android_typeface;
        if (yq6.mo28193s(i8)) {
            this.f14602m = false;
            int k2 = yq6.mo28185k(i8, 1);
            if (k2 == 1) {
                this.f14601l = Typeface.SANS_SERIF;
            } else if (k2 == 2) {
                this.f14601l = Typeface.SERIF;
            } else if (k2 == 3) {
                this.f14601l = Typeface.MONOSPACE;
            }
        }
    }

    /* renamed from: a */
    public final void mo22856a(Drawable drawable, wq6 wq6) {
        if (drawable != null && wq6 != null) {
            C3743zm.m31371i(drawable, wq6, this.f14590a.getDrawableState());
        }
    }

    /* renamed from: b */
    public void mo22857b() {
        if (!(this.f14591b == null && this.f14592c == null && this.f14593d == null && this.f14594e == null)) {
            Drawable[] compoundDrawables = this.f14590a.getCompoundDrawables();
            mo22856a(compoundDrawables[0], this.f14591b);
            mo22856a(compoundDrawables[1], this.f14592c);
            mo22856a(compoundDrawables[2], this.f14593d);
            mo22856a(compoundDrawables[3], this.f14594e);
        }
        if (this.f14595f != null || this.f14596g != null) {
            Drawable[] a = C2768c.m21616a(this.f14590a);
            mo22856a(a[0], this.f14595f);
            mo22856a(a[2], this.f14596g);
        }
    }

    /* renamed from: c */
    public void mo22858c() {
        this.f14598i.mo25876a();
    }

    /* renamed from: e */
    public int mo22859e() {
        return this.f14598i.mo25881f();
    }

    /* renamed from: f */
    public int mo22860f() {
        return this.f14598i.mo25882g();
    }

    /* renamed from: g */
    public int mo22861g() {
        return this.f14598i.mo25883h();
    }

    /* renamed from: h */
    public int[] mo22862h() {
        return this.f14598i.mo25884i();
    }

    /* renamed from: i */
    public int mo22863i() {
        return this.f14598i.mo25885j();
    }

    /* renamed from: j */
    public ColorStateList mo22864j() {
        wq6 wq6 = this.f14597h;
        if (wq6 != null) {
            return wq6.f19220a;
        }
        return null;
    }

    /* renamed from: k */
    public PorterDuff.Mode mo22865k() {
        wq6 wq6 = this.f14597h;
        if (wq6 != null) {
            return wq6.f19221b;
        }
        return null;
    }

    /* renamed from: l */
    public boolean mo22866l() {
        return this.f14598i.mo25887n();
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0208  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22867m(android.util.AttributeSet r20, int r21) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            android.widget.TextView r0 = r7.f14590a
            android.content.Context r10 = r0.getContext()
            zm r11 = p000.C3743zm.m31368b()
            int[] r2 = p000.j65.AppCompatTextHelper
            r12 = 0
            yq6 r13 = p000.yq6.m30733v(r10, r8, r2, r9, r12)
            android.widget.TextView r0 = r7.f14590a
            android.content.Context r1 = r0.getContext()
            android.content.res.TypedArray r4 = r13.mo28192r()
            r6 = 0
            r3 = r20
            r5 = r21
            p000.ga7.m17781n0(r0, r1, r2, r3, r4, r5, r6)
            int r0 = p000.j65.AppCompatTextHelper_android_textAppearance
            r14 = -1
            int r0 = r13.mo28188n(r0, r14)
            int r1 = p000.j65.AppCompatTextHelper_android_drawableLeft
            boolean r2 = r13.mo28193s(r1)
            if (r2 == 0) goto L_0x0042
            int r1 = r13.mo28188n(r1, r12)
            wq6 r1 = m21585d(r10, r11, r1)
            r7.f14591b = r1
        L_0x0042:
            int r1 = p000.j65.AppCompatTextHelper_android_drawableTop
            boolean r2 = r13.mo28193s(r1)
            if (r2 == 0) goto L_0x0054
            int r1 = r13.mo28188n(r1, r12)
            wq6 r1 = m21585d(r10, r11, r1)
            r7.f14592c = r1
        L_0x0054:
            int r1 = p000.j65.AppCompatTextHelper_android_drawableRight
            boolean r2 = r13.mo28193s(r1)
            if (r2 == 0) goto L_0x0066
            int r1 = r13.mo28188n(r1, r12)
            wq6 r1 = m21585d(r10, r11, r1)
            r7.f14593d = r1
        L_0x0066:
            int r1 = p000.j65.AppCompatTextHelper_android_drawableBottom
            boolean r2 = r13.mo28193s(r1)
            if (r2 == 0) goto L_0x0078
            int r1 = r13.mo28188n(r1, r12)
            wq6 r1 = m21585d(r10, r11, r1)
            r7.f14594e = r1
        L_0x0078:
            int r1 = android.os.Build.VERSION.SDK_INT
            int r2 = p000.j65.AppCompatTextHelper_android_drawableStart
            boolean r3 = r13.mo28193s(r2)
            if (r3 == 0) goto L_0x008c
            int r2 = r13.mo28188n(r2, r12)
            wq6 r2 = m21585d(r10, r11, r2)
            r7.f14595f = r2
        L_0x008c:
            int r2 = p000.j65.AppCompatTextHelper_android_drawableEnd
            boolean r3 = r13.mo28193s(r2)
            if (r3 == 0) goto L_0x009e
            int r2 = r13.mo28188n(r2, r12)
            wq6 r2 = m21585d(r10, r11, r2)
            r7.f14596g = r2
        L_0x009e:
            r13.mo28194w()
            android.widget.TextView r2 = r7.f14590a
            android.text.method.TransformationMethod r2 = r2.getTransformationMethod()
            boolean r2 = r2 instanceof android.text.method.PasswordTransformationMethod
            r3 = 26
            if (r0 == r14) goto L_0x00ea
            int[] r5 = p000.j65.TextAppearance
            yq6 r0 = p000.yq6.m30731t(r10, r0, r5)
            if (r2 != 0) goto L_0x00c3
            int r5 = p000.j65.TextAppearance_textAllCaps
            boolean r6 = r0.mo28193s(r5)
            if (r6 == 0) goto L_0x00c3
            boolean r5 = r0.mo28175a(r5, r12)
            r6 = 1
            goto L_0x00c5
        L_0x00c3:
            r5 = r12
            r6 = r5
        L_0x00c5:
            r7.mo22855C(r10, r0)
            int r15 = p000.j65.TextAppearance_textLocale
            boolean r16 = r0.mo28193s(r15)
            if (r16 == 0) goto L_0x00d5
            java.lang.String r15 = r0.mo28189o(r15)
            goto L_0x00d6
        L_0x00d5:
            r15 = 0
        L_0x00d6:
            if (r1 < r3) goto L_0x00e5
            int r4 = p000.j65.TextAppearance_fontVariationSettings
            boolean r17 = r0.mo28193s(r4)
            if (r17 == 0) goto L_0x00e5
            java.lang.String r4 = r0.mo28189o(r4)
            goto L_0x00e6
        L_0x00e5:
            r4 = 0
        L_0x00e6:
            r0.mo28194w()
            goto L_0x00ee
        L_0x00ea:
            r5 = r12
            r6 = r5
            r4 = 0
            r15 = 0
        L_0x00ee:
            int[] r0 = p000.j65.TextAppearance
            yq6 r0 = p000.yq6.m30733v(r10, r8, r0, r9, r12)
            if (r2 != 0) goto L_0x0105
            int r13 = p000.j65.TextAppearance_textAllCaps
            boolean r18 = r0.mo28193s(r13)
            if (r18 == 0) goto L_0x0105
            boolean r5 = r0.mo28175a(r13, r12)
            r16 = 1
            goto L_0x0107
        L_0x0105:
            r16 = r6
        L_0x0107:
            int r6 = p000.j65.TextAppearance_textLocale
            boolean r13 = r0.mo28193s(r6)
            if (r13 == 0) goto L_0x0113
            java.lang.String r15 = r0.mo28189o(r6)
        L_0x0113:
            if (r1 < r3) goto L_0x0121
            int r3 = p000.j65.TextAppearance_fontVariationSettings
            boolean r6 = r0.mo28193s(r3)
            if (r6 == 0) goto L_0x0121
            java.lang.String r4 = r0.mo28189o(r3)
        L_0x0121:
            r3 = 28
            if (r1 < r3) goto L_0x0139
            int r3 = p000.j65.TextAppearance_android_textSize
            boolean r6 = r0.mo28193s(r3)
            if (r6 == 0) goto L_0x0139
            int r3 = r0.mo28180f(r3, r14)
            if (r3 != 0) goto L_0x0139
            android.widget.TextView r3 = r7.f14590a
            r6 = 0
            r3.setTextSize(r12, r6)
        L_0x0139:
            r7.mo22855C(r10, r0)
            r0.mo28194w()
            if (r2 != 0) goto L_0x0146
            if (r16 == 0) goto L_0x0146
            r7.mo22873s(r5)
        L_0x0146:
            android.graphics.Typeface r0 = r7.f14601l
            if (r0 == 0) goto L_0x015b
            int r2 = r7.f14600k
            if (r2 != r14) goto L_0x0156
            android.widget.TextView r2 = r7.f14590a
            int r3 = r7.f14599j
            r2.setTypeface(r0, r3)
            goto L_0x015b
        L_0x0156:
            android.widget.TextView r2 = r7.f14590a
            r2.setTypeface(r0)
        L_0x015b:
            if (r4 == 0) goto L_0x0162
            android.widget.TextView r0 = r7.f14590a
            p000.C2765ln.C2771f.m21625d(r0, r4)
        L_0x0162:
            if (r15 == 0) goto L_0x0183
            r0 = 24
            if (r1 < r0) goto L_0x0172
            android.widget.TextView r0 = r7.f14590a
            android.os.LocaleList r1 = p000.C2765ln.C2770e.m21620a(r15)
            p000.C2765ln.C2770e.m21621b(r0, r1)
            goto L_0x0183
        L_0x0172:
            java.lang.String r0 = ","
            java.lang.String[] r0 = r15.split(r0)
            r0 = r0[r12]
            android.widget.TextView r1 = r7.f14590a
            java.util.Locale r0 = p000.C2765ln.C2769d.m21619a(r0)
            p000.C2765ln.C2768c.m21618c(r1, r0)
        L_0x0183:
            sn r0 = r7.f14598i
            r0.mo25888o(r8, r9)
            boolean r0 = p000.C3759zt.f20681c
            if (r0 == 0) goto L_0x01c7
            sn r0 = r7.f14598i
            int r0 = r0.mo25885j()
            if (r0 == 0) goto L_0x01c7
            sn r0 = r7.f14598i
            int[] r0 = r0.mo25884i()
            int r1 = r0.length
            if (r1 <= 0) goto L_0x01c7
            android.widget.TextView r1 = r7.f14590a
            int r1 = p000.C2765ln.C2771f.m21622a(r1)
            float r1 = (float) r1
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x01c2
            android.widget.TextView r0 = r7.f14590a
            sn r1 = r7.f14598i
            int r1 = r1.mo25882g()
            sn r2 = r7.f14598i
            int r2 = r2.mo25881f()
            sn r3 = r7.f14598i
            int r3 = r3.mo25883h()
            p000.C2765ln.C2771f.m21623b(r0, r1, r2, r3, r12)
            goto L_0x01c7
        L_0x01c2:
            android.widget.TextView r1 = r7.f14590a
            p000.C2765ln.C2771f.m21624c(r1, r0, r12)
        L_0x01c7:
            int[] r0 = p000.j65.AppCompatTextView
            yq6 r8 = p000.yq6.m30732u(r10, r8, r0)
            int r0 = p000.j65.AppCompatTextView_drawableLeftCompat
            int r0 = r8.mo28188n(r0, r14)
            if (r0 == r14) goto L_0x01db
            android.graphics.drawable.Drawable r0 = r11.mo28527c(r10, r0)
            r1 = r0
            goto L_0x01dc
        L_0x01db:
            r1 = 0
        L_0x01dc:
            int r0 = p000.j65.AppCompatTextView_drawableTopCompat
            int r0 = r8.mo28188n(r0, r14)
            if (r0 == r14) goto L_0x01ea
            android.graphics.drawable.Drawable r0 = r11.mo28527c(r10, r0)
            r2 = r0
            goto L_0x01eb
        L_0x01ea:
            r2 = 0
        L_0x01eb:
            int r0 = p000.j65.AppCompatTextView_drawableRightCompat
            int r0 = r8.mo28188n(r0, r14)
            if (r0 == r14) goto L_0x01f9
            android.graphics.drawable.Drawable r0 = r11.mo28527c(r10, r0)
            r3 = r0
            goto L_0x01fa
        L_0x01f9:
            r3 = 0
        L_0x01fa:
            int r0 = p000.j65.AppCompatTextView_drawableBottomCompat
            int r0 = r8.mo28188n(r0, r14)
            if (r0 == r14) goto L_0x0208
            android.graphics.drawable.Drawable r0 = r11.mo28527c(r10, r0)
            r4 = r0
            goto L_0x0209
        L_0x0208:
            r4 = 0
        L_0x0209:
            int r0 = p000.j65.AppCompatTextView_drawableStartCompat
            int r0 = r8.mo28188n(r0, r14)
            if (r0 == r14) goto L_0x0217
            android.graphics.drawable.Drawable r0 = r11.mo28527c(r10, r0)
            r5 = r0
            goto L_0x0218
        L_0x0217:
            r5 = 0
        L_0x0218:
            int r0 = p000.j65.AppCompatTextView_drawableEndCompat
            int r0 = r8.mo28188n(r0, r14)
            if (r0 == r14) goto L_0x0226
            android.graphics.drawable.Drawable r0 = r11.mo28527c(r10, r0)
            r6 = r0
            goto L_0x0227
        L_0x0226:
            r6 = 0
        L_0x0227:
            r0 = r19
            r0.mo22879y(r1, r2, r3, r4, r5, r6)
            int r0 = p000.j65.AppCompatTextView_drawableTint
            boolean r1 = r8.mo28193s(r0)
            if (r1 == 0) goto L_0x023d
            android.content.res.ColorStateList r0 = r8.mo28177c(r0)
            android.widget.TextView r1 = r7.f14590a
            p000.lo6.m21654h(r1, r0)
        L_0x023d:
            int r0 = p000.j65.AppCompatTextView_drawableTintMode
            boolean r1 = r8.mo28193s(r0)
            if (r1 == 0) goto L_0x0253
            int r0 = r8.mo28185k(r0, r14)
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = p000.sj1.m26923e(r0, r1)
            android.widget.TextView r1 = r7.f14590a
            p000.lo6.m21655i(r1, r0)
        L_0x0253:
            int r0 = p000.j65.AppCompatTextView_firstBaselineToTopHeight
            int r0 = r8.mo28180f(r0, r14)
            int r1 = p000.j65.AppCompatTextView_lastBaselineToBottomHeight
            int r1 = r8.mo28180f(r1, r14)
            int r2 = p000.j65.AppCompatTextView_lineHeight
            int r2 = r8.mo28180f(r2, r14)
            r8.mo28194w()
            if (r0 == r14) goto L_0x026f
            android.widget.TextView r3 = r7.f14590a
            p000.lo6.m21657k(r3, r0)
        L_0x026f:
            if (r1 == r14) goto L_0x0276
            android.widget.TextView r0 = r7.f14590a
            p000.lo6.m21658l(r0, r1)
        L_0x0276:
            if (r2 == r14) goto L_0x027d
            android.widget.TextView r0 = r7.f14590a
            p000.lo6.m21659m(r0, r2)
        L_0x027d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2765ln.mo22867m(android.util.AttributeSet, int):void");
    }

    /* renamed from: n */
    public void mo22868n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f14602m) {
            this.f14601l = typeface;
            TextView textView = weakReference.get();
            if (textView == null) {
                return;
            }
            if (ga7.m17746S(textView)) {
                textView.post(new C2767b(textView, typeface, this.f14599j));
            } else {
                textView.setTypeface(typeface, this.f14599j);
            }
        }
    }

    /* renamed from: o */
    public void mo22869o(boolean z, int i, int i2, int i3, int i4) {
        if (!C3759zt.f20681c) {
            mo22858c();
        }
    }

    /* renamed from: p */
    public void mo22870p() {
        mo22857b();
    }

    /* renamed from: q */
    public void mo22871q(Context context, int i) {
        String o;
        yq6 t = yq6.m30731t(context, i, j65.TextAppearance);
        int i2 = j65.TextAppearance_textAllCaps;
        if (t.mo28193s(i2)) {
            mo22873s(t.mo28175a(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        int i4 = j65.TextAppearance_android_textSize;
        if (t.mo28193s(i4) && t.mo28180f(i4, -1) == 0) {
            this.f14590a.setTextSize(0, Utils.FLOAT_EPSILON);
        }
        mo22855C(context, t);
        if (i3 >= 26) {
            int i5 = j65.TextAppearance_fontVariationSettings;
            if (t.mo28193s(i5) && (o = t.mo28189o(i5)) != null) {
                C2771f.m21625d(this.f14590a, o);
            }
        }
        t.mo28194w();
        Typeface typeface = this.f14601l;
        if (typeface != null) {
            this.f14590a.setTypeface(typeface, this.f14599j);
        }
    }

    /* renamed from: r */
    public void mo22872r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            un1.m28364f(editorInfo, textView.getText());
        }
    }

    /* renamed from: s */
    public void mo22873s(boolean z) {
        this.f14590a.setAllCaps(z);
    }

    /* renamed from: t */
    public void mo22874t(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f14598i.mo25889p(i, i2, i3, i4);
    }

    /* renamed from: u */
    public void mo22875u(int[] iArr, int i) throws IllegalArgumentException {
        this.f14598i.mo25890q(iArr, i);
    }

    /* renamed from: v */
    public void mo22876v(int i) {
        this.f14598i.mo25891r(i);
    }

    /* renamed from: w */
    public void mo22877w(ColorStateList colorStateList) {
        boolean z;
        if (this.f14597h == null) {
            this.f14597h = new wq6();
        }
        wq6 wq6 = this.f14597h;
        wq6.f19220a = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        wq6.f19223d = z;
        mo22880z();
    }

    /* renamed from: x */
    public void mo22878x(PorterDuff.Mode mode) {
        boolean z;
        if (this.f14597h == null) {
            this.f14597h = new wq6();
        }
        wq6 wq6 = this.f14597h;
        wq6.f19221b = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        wq6.f19222c = z;
        mo22880z();
    }

    /* renamed from: y */
    public final void mo22879y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] a = C2768c.m21616a(this.f14590a);
            TextView textView = this.f14590a;
            if (drawable5 == null) {
                drawable5 = a[0];
            }
            if (drawable2 == null) {
                drawable2 = a[1];
            }
            if (drawable6 == null) {
                drawable6 = a[2];
            }
            if (drawable4 == null) {
                drawable4 = a[3];
            }
            C2768c.m21617b(textView, drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            Drawable[] a2 = C2768c.m21616a(this.f14590a);
            Drawable drawable7 = a2[0];
            if (drawable7 == null && a2[2] == null) {
                Drawable[] compoundDrawables = this.f14590a.getCompoundDrawables();
                TextView textView2 = this.f14590a;
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            TextView textView3 = this.f14590a;
            if (drawable2 == null) {
                drawable2 = a2[1];
            }
            Drawable drawable8 = a2[2];
            if (drawable4 == null) {
                drawable4 = a2[3];
            }
            C2768c.m21617b(textView3, drawable7, drawable2, drawable8, drawable4);
        }
    }

    /* renamed from: z */
    public final void mo22880z() {
        wq6 wq6 = this.f14597h;
        this.f14591b = wq6;
        this.f14592c = wq6;
        this.f14593d = wq6;
        this.f14594e = wq6;
        this.f14595f = wq6;
        this.f14596g = wq6;
    }
}
