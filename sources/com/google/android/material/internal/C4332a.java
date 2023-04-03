package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import p000.ja0;

/* renamed from: com.google.android.material.internal.a */
/* compiled from: CollapsingTextHelper */
public final class C4332a {

    /* renamed from: j0 */
    public static final boolean f24027j0 = false;

    /* renamed from: k0 */
    public static final Paint f24028k0 = null;

    /* renamed from: A */
    public ja0 f24029A;

    /* renamed from: B */
    public CharSequence f24030B;

    /* renamed from: C */
    public CharSequence f24031C;

    /* renamed from: D */
    public boolean f24032D;

    /* renamed from: E */
    public boolean f24033E = true;

    /* renamed from: F */
    public boolean f24034F;

    /* renamed from: G */
    public Bitmap f24035G;

    /* renamed from: H */
    public Paint f24036H;

    /* renamed from: I */
    public float f24037I;

    /* renamed from: J */
    public float f24038J;

    /* renamed from: K */
    public int[] f24039K;

    /* renamed from: L */
    public boolean f24040L;

    /* renamed from: M */
    public final TextPaint f24041M;

    /* renamed from: N */
    public final TextPaint f24042N;

    /* renamed from: O */
    public TimeInterpolator f24043O;

    /* renamed from: P */
    public TimeInterpolator f24044P;

    /* renamed from: Q */
    public float f24045Q;

    /* renamed from: R */
    public float f24046R;

    /* renamed from: S */
    public float f24047S;

    /* renamed from: T */
    public ColorStateList f24048T;

    /* renamed from: U */
    public float f24049U;

    /* renamed from: V */
    public float f24050V;

    /* renamed from: W */
    public float f24051W;

    /* renamed from: X */
    public ColorStateList f24052X;

    /* renamed from: Y */
    public float f24053Y;

    /* renamed from: Z */
    public float f24054Z;

    /* renamed from: a */
    public final View f24055a;

    /* renamed from: a0 */
    public StaticLayout f24056a0;

    /* renamed from: b */
    public boolean f24057b;

    /* renamed from: b0 */
    public float f24058b0;

    /* renamed from: c */
    public float f24059c;

    /* renamed from: c0 */
    public float f24060c0;

    /* renamed from: d */
    public boolean f24061d;

    /* renamed from: d0 */
    public float f24062d0;

    /* renamed from: e */
    public float f24063e;

    /* renamed from: e0 */
    public CharSequence f24064e0;

    /* renamed from: f */
    public float f24065f;

    /* renamed from: f0 */
    public int f24066f0 = 1;

    /* renamed from: g */
    public int f24067g;

    /* renamed from: g0 */
    public float f24068g0 = Utils.FLOAT_EPSILON;

    /* renamed from: h */
    public final Rect f24069h;

    /* renamed from: h0 */
    public float f24070h0 = 1.0f;

    /* renamed from: i */
    public final Rect f24071i;

    /* renamed from: i0 */
    public int f24072i0 = StaticLayoutBuilderCompat.f24012n;

    /* renamed from: j */
    public final RectF f24073j;

    /* renamed from: k */
    public int f24074k = 16;

    /* renamed from: l */
    public int f24075l = 16;

    /* renamed from: m */
    public float f24076m = 15.0f;

    /* renamed from: n */
    public float f24077n = 15.0f;

    /* renamed from: o */
    public ColorStateList f24078o;

    /* renamed from: p */
    public ColorStateList f24079p;

    /* renamed from: q */
    public float f24080q;

    /* renamed from: r */
    public float f24081r;

    /* renamed from: s */
    public float f24082s;

    /* renamed from: t */
    public float f24083t;

    /* renamed from: u */
    public float f24084u;

    /* renamed from: v */
    public float f24085v;

    /* renamed from: w */
    public Typeface f24086w;

    /* renamed from: x */
    public Typeface f24087x;

    /* renamed from: y */
    public Typeface f24088y;

    /* renamed from: z */
    public ja0 f24089z;

    /* renamed from: com.google.android.material.internal.a$a */
    /* compiled from: CollapsingTextHelper */
    public class C4333a implements ja0.C6023a {
        public C4333a() {
        }

        /* renamed from: a */
        public void mo33093a(Typeface typeface) {
            C4332a.this.mo33048d0(typeface);
        }
    }

    /* renamed from: com.google.android.material.internal.a$b */
    /* compiled from: CollapsingTextHelper */
    public class C4334b implements ja0.C6023a {
        public C4334b() {
        }

        /* renamed from: a */
        public void mo33093a(Typeface typeface) {
            C4332a.this.mo33068n0(typeface);
        }
    }

    public C4332a(View view) {
        this.f24055a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f24041M = textPaint;
        this.f24042N = new TextPaint(textPaint);
        this.f24071i = new Rect();
        this.f24069h = new Rect();
        this.f24073j = new RectF();
        this.f24065f = mo33051f();
    }

    /* renamed from: O */
    public static boolean m35605O(float f, float f2) {
        if (Math.abs(f - f2) < 0.001f) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public static float m35606S(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C5807el.m43986a(f, f2, f3);
    }

    /* renamed from: W */
    public static boolean m35607W(Rect rect, int i, int i2, int i3, int i4) {
        if (rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int m35608a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: A */
    public int mo33015A() {
        return this.f24074k;
    }

    /* renamed from: A0 */
    public void mo33016A0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f24030B, charSequence)) {
            this.f24030B = charSequence;
            this.f24031C = null;
            mo33061k();
            mo33037U();
        }
    }

    /* renamed from: B */
    public float mo33017B() {
        mo33031M(this.f24042N);
        return -this.f24042N.ascent();
    }

    /* renamed from: B0 */
    public void mo33018B0(TimeInterpolator timeInterpolator) {
        this.f24044P = timeInterpolator;
        mo33037U();
    }

    /* renamed from: C */
    public Typeface mo33019C() {
        Typeface typeface = this.f24087x;
        if (typeface != null) {
            return typeface;
        }
        return Typeface.DEFAULT;
    }

    /* renamed from: C0 */
    public void mo33020C0(Typeface typeface) {
        boolean e0 = mo33050e0(typeface);
        boolean o0 = mo33070o0(typeface);
        if (e0 || o0) {
            mo33037U();
        }
    }

    /* renamed from: D */
    public float mo33021D() {
        return this.f24059c;
    }

    /* renamed from: D0 */
    public final boolean mo33022D0() {
        if (this.f24066f0 <= 1 || ((this.f24032D && !this.f24061d) || this.f24034F)) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public float mo33023E() {
        return this.f24065f;
    }

    /* renamed from: F */
    public int mo33024F() {
        return this.f24072i0;
    }

    /* renamed from: G */
    public int mo33025G() {
        StaticLayout staticLayout = this.f24056a0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    /* renamed from: H */
    public float mo33026H() {
        return this.f24056a0.getSpacingAdd();
    }

    /* renamed from: I */
    public float mo33027I() {
        return this.f24056a0.getSpacingMultiplier();
    }

    /* renamed from: J */
    public int mo33028J() {
        return this.f24066f0;
    }

    /* renamed from: K */
    public CharSequence mo33029K() {
        return this.f24030B;
    }

    /* renamed from: L */
    public final void mo33030L(TextPaint textPaint) {
        textPaint.setTextSize(this.f24077n);
        textPaint.setTypeface(this.f24086w);
        textPaint.setLetterSpacing(this.f24053Y);
    }

    /* renamed from: M */
    public final void mo33031M(TextPaint textPaint) {
        textPaint.setTextSize(this.f24076m);
        textPaint.setTypeface(this.f24087x);
        textPaint.setLetterSpacing(this.f24054Z);
    }

    /* renamed from: N */
    public final void mo33032N(float f) {
        Rect rect;
        if (this.f24061d) {
            RectF rectF = this.f24073j;
            if (f < this.f24065f) {
                rect = this.f24069h;
            } else {
                rect = this.f24071i;
            }
            rectF.set(rect);
            return;
        }
        this.f24073j.left = m35606S((float) this.f24069h.left, (float) this.f24071i.left, f, this.f24043O);
        this.f24073j.top = m35606S(this.f24080q, this.f24081r, f, this.f24043O);
        this.f24073j.right = m35606S((float) this.f24069h.right, (float) this.f24071i.right, f, this.f24043O);
        this.f24073j.bottom = m35606S((float) this.f24069h.bottom, (float) this.f24071i.bottom, f, this.f24043O);
    }

    /* renamed from: P */
    public final boolean mo33033P() {
        if (ga7.m17715B(this.f24055a) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public final boolean mo33034Q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f24079p;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = this.f24078o) == null || !colorStateList.isStateful())) {
            return false;
        }
        return true;
    }

    /* renamed from: R */
    public final boolean mo33035R(CharSequence charSequence, boolean z) {
        hn6 hn6;
        if (z) {
            hn6 = in6.f13327d;
        } else {
            hn6 = in6.f13326c;
        }
        return hn6.isRtl(charSequence, 0, charSequence.length());
    }

    /* renamed from: T */
    public void mo33036T() {
        boolean z;
        if (this.f24071i.width() <= 0 || this.f24071i.height() <= 0 || this.f24069h.width() <= 0 || this.f24069h.height() <= 0) {
            z = false;
        } else {
            z = true;
        }
        this.f24057b = z;
    }

    /* renamed from: U */
    public void mo33037U() {
        mo33038V(false);
    }

    /* renamed from: V */
    public void mo33038V(boolean z) {
        if ((this.f24055a.getHeight() > 0 && this.f24055a.getWidth() > 0) || z) {
            mo33043b(z);
            mo33047d();
        }
    }

    /* renamed from: X */
    public void mo33039X(int i, int i2, int i3, int i4) {
        if (!m35607W(this.f24071i, i, i2, i3, i4)) {
            this.f24071i.set(i, i2, i3, i4);
            this.f24040L = true;
            mo33036T();
        }
    }

    /* renamed from: Y */
    public void mo33040Y(Rect rect) {
        mo33039X(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: Z */
    public void mo33041Z(int i) {
        bn6 bn6 = new bn6(this.f24055a.getContext(), i);
        ColorStateList colorStateList = bn6.f21403a;
        if (colorStateList != null) {
            this.f24079p = colorStateList;
        }
        float f = bn6.f21416n;
        if (f != Utils.FLOAT_EPSILON) {
            this.f24077n = f;
        }
        ColorStateList colorStateList2 = bn6.f21406d;
        if (colorStateList2 != null) {
            this.f24048T = colorStateList2;
        }
        this.f24046R = bn6.f21411i;
        this.f24047S = bn6.f21412j;
        this.f24045Q = bn6.f21413k;
        this.f24053Y = bn6.f21415m;
        ja0 ja0 = this.f24029A;
        if (ja0 != null) {
            ja0.mo44072c();
        }
        this.f24029A = new ja0(new C4333a(), bn6.mo29659e());
        bn6.mo29661g(this.f24055a.getContext(), this.f24029A);
        mo33037U();
    }

    /* renamed from: a0 */
    public final void mo33042a0(float f) {
        this.f24058b0 = f;
        ga7.m17767g0(this.f24055a);
    }

    /* renamed from: b */
    public final void mo33043b(boolean z) {
        float f;
        float f2;
        float f3;
        StaticLayout staticLayout;
        float f4 = this.f24038J;
        mo33059j(this.f24077n, z);
        CharSequence charSequence = this.f24031C;
        if (!(charSequence == null || (staticLayout = this.f24056a0) == null)) {
            this.f24064e0 = TextUtils.ellipsize(charSequence, this.f24041M, (float) staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f24064e0;
        float f5 = Utils.FLOAT_EPSILON;
        if (charSequence2 != null) {
            f = this.f24041M.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f = 0.0f;
        }
        int b = pj2.m24971b(this.f24075l, this.f24032D ? 1 : 0);
        int i = b & 112;
        if (i == 48) {
            this.f24081r = (float) this.f24071i.top;
        } else if (i != 80) {
            this.f24081r = ((float) this.f24071i.centerY()) - ((this.f24041M.descent() - this.f24041M.ascent()) / 2.0f);
        } else {
            this.f24081r = ((float) this.f24071i.bottom) + this.f24041M.ascent();
        }
        int i2 = b & 8388615;
        if (i2 == 1) {
            this.f24083t = ((float) this.f24071i.centerX()) - (f / 2.0f);
        } else if (i2 != 5) {
            this.f24083t = (float) this.f24071i.left;
        } else {
            this.f24083t = ((float) this.f24071i.right) - f;
        }
        mo33059j(this.f24076m, z);
        StaticLayout staticLayout2 = this.f24056a0;
        if (staticLayout2 != null) {
            f2 = (float) staticLayout2.getHeight();
        } else {
            f2 = 0.0f;
        }
        CharSequence charSequence3 = this.f24031C;
        if (charSequence3 != null) {
            f3 = this.f24041M.measureText(charSequence3, 0, charSequence3.length());
        } else {
            f3 = 0.0f;
        }
        StaticLayout staticLayout3 = this.f24056a0;
        if (staticLayout3 != null && this.f24066f0 > 1) {
            f3 = (float) staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f24056a0;
        if (staticLayout4 != null) {
            if (this.f24066f0 > 1) {
                f5 = (float) staticLayout4.getLineStart(0);
            } else {
                f5 = staticLayout4.getLineLeft(0);
            }
        }
        this.f24062d0 = f5;
        int b2 = pj2.m24971b(this.f24074k, this.f24032D ? 1 : 0);
        int i3 = b2 & 112;
        if (i3 == 48) {
            this.f24080q = (float) this.f24069h.top;
        } else if (i3 != 80) {
            this.f24080q = ((float) this.f24069h.centerY()) - (f2 / 2.0f);
        } else {
            this.f24080q = (((float) this.f24069h.bottom) - f2) + this.f24041M.descent();
        }
        int i4 = b2 & 8388615;
        if (i4 == 1) {
            this.f24082s = ((float) this.f24069h.centerX()) - (f3 / 2.0f);
        } else if (i4 != 5) {
            this.f24082s = (float) this.f24069h.left;
        } else {
            this.f24082s = ((float) this.f24069h.right) - f3;
        }
        mo33061k();
        mo33080t0(f4);
    }

    /* renamed from: b0 */
    public void mo33044b0(ColorStateList colorStateList) {
        if (this.f24079p != colorStateList) {
            this.f24079p = colorStateList;
            mo33037U();
        }
    }

    /* renamed from: c */
    public float mo33045c() {
        if (this.f24030B == null) {
            return Utils.FLOAT_EPSILON;
        }
        mo33030L(this.f24042N);
        TextPaint textPaint = this.f24042N;
        CharSequence charSequence = this.f24030B;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: c0 */
    public void mo33046c0(int i) {
        if (this.f24075l != i) {
            this.f24075l = i;
            mo33037U();
        }
    }

    /* renamed from: d */
    public final void mo33047d() {
        mo33055h(this.f24059c);
    }

    /* renamed from: d0 */
    public void mo33048d0(Typeface typeface) {
        if (mo33050e0(typeface)) {
            mo33037U();
        }
    }

    /* renamed from: e */
    public final float mo33049e(float f) {
        float f2 = this.f24065f;
        if (f <= f2) {
            return C5807el.m43987b(1.0f, Utils.FLOAT_EPSILON, this.f24063e, f2, f);
        }
        return C5807el.m43987b(Utils.FLOAT_EPSILON, 1.0f, f2, 1.0f, f);
    }

    /* renamed from: e0 */
    public final boolean mo33050e0(Typeface typeface) {
        ja0 ja0 = this.f24029A;
        if (ja0 != null) {
            ja0.mo44072c();
        }
        if (this.f24086w == typeface) {
            return false;
        }
        this.f24086w = typeface;
        return true;
    }

    /* renamed from: f */
    public final float mo33051f() {
        float f = this.f24063e;
        return f + ((1.0f - f) * 0.5f);
    }

    /* renamed from: f0 */
    public void mo33052f0(int i) {
        this.f24067g = i;
    }

    /* renamed from: g */
    public final boolean mo33053g(CharSequence charSequence) {
        boolean P = mo33033P();
        if (this.f24033E) {
            return mo33035R(charSequence, P);
        }
        return P;
    }

    /* renamed from: g0 */
    public void mo33054g0(int i, int i2, int i3, int i4) {
        if (!m35607W(this.f24069h, i, i2, i3, i4)) {
            this.f24069h.set(i, i2, i3, i4);
            this.f24040L = true;
            mo33036T();
        }
    }

    /* renamed from: h */
    public final void mo33055h(float f) {
        float f2;
        mo33032N(f);
        if (!this.f24061d) {
            this.f24084u = m35606S(this.f24082s, this.f24083t, f, this.f24043O);
            this.f24085v = m35606S(this.f24080q, this.f24081r, f, this.f24043O);
            mo33080t0(m35606S(this.f24076m, this.f24077n, f, this.f24044P));
            f2 = f;
        } else if (f < this.f24065f) {
            this.f24084u = this.f24082s;
            this.f24085v = this.f24080q;
            mo33080t0(this.f24076m);
            f2 = 0.0f;
        } else {
            this.f24084u = this.f24083t;
            this.f24085v = this.f24081r - ((float) Math.max(0, this.f24067g));
            mo33080t0(this.f24077n);
            f2 = 1.0f;
        }
        TimeInterpolator timeInterpolator = C5807el.f28629b;
        mo33042a0(1.0f - m35606S(Utils.FLOAT_EPSILON, 1.0f, 1.0f - f, timeInterpolator));
        mo33060j0(m35606S(1.0f, Utils.FLOAT_EPSILON, f, timeInterpolator));
        if (this.f24079p != this.f24078o) {
            this.f24041M.setColor(m35608a(mo33089y(), mo33085w(), f2));
        } else {
            this.f24041M.setColor(mo33085w());
        }
        float f3 = this.f24053Y;
        float f4 = this.f24054Z;
        if (f3 != f4) {
            this.f24041M.setLetterSpacing(m35606S(f4, f3, f, timeInterpolator));
        } else {
            this.f24041M.setLetterSpacing(f3);
        }
        this.f24041M.setShadowLayer(m35606S(this.f24049U, this.f24045Q, f, (TimeInterpolator) null), m35606S(this.f24050V, this.f24046R, f, (TimeInterpolator) null), m35606S(this.f24051W, this.f24047S, f, (TimeInterpolator) null), m35608a(mo33087x(this.f24052X), mo33087x(this.f24048T), f));
        if (this.f24061d) {
            this.f24041M.setAlpha((int) (mo33049e(f) * 255.0f));
        }
        ga7.m17767g0(this.f24055a);
    }

    /* renamed from: h0 */
    public void mo33056h0(Rect rect) {
        mo33054g0(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: i */
    public final void mo33057i(float f) {
        mo33059j(f, false);
    }

    /* renamed from: i0 */
    public void mo33058i0(int i) {
        bn6 bn6 = new bn6(this.f24055a.getContext(), i);
        ColorStateList colorStateList = bn6.f21403a;
        if (colorStateList != null) {
            this.f24078o = colorStateList;
        }
        float f = bn6.f21416n;
        if (f != Utils.FLOAT_EPSILON) {
            this.f24076m = f;
        }
        ColorStateList colorStateList2 = bn6.f21406d;
        if (colorStateList2 != null) {
            this.f24052X = colorStateList2;
        }
        this.f24050V = bn6.f21411i;
        this.f24051W = bn6.f21412j;
        this.f24049U = bn6.f21413k;
        this.f24054Z = bn6.f21415m;
        ja0 ja0 = this.f24089z;
        if (ja0 != null) {
            ja0.mo44072c();
        }
        this.f24089z = new ja0(new C4334b(), bn6.mo29659e());
        bn6.mo29661g(this.f24055a.getContext(), this.f24089z);
        mo33037U();
    }

    /* renamed from: j */
    public final void mo33059j(float f, boolean z) {
        boolean z2;
        float f2;
        boolean z3;
        boolean z4;
        if (this.f24030B != null) {
            float width = (float) this.f24071i.width();
            float width2 = (float) this.f24069h.width();
            boolean z5 = false;
            int i = 1;
            if (m35605O(f, this.f24077n)) {
                f2 = this.f24077n;
                this.f24037I = 1.0f;
                Typeface typeface = this.f24088y;
                Typeface typeface2 = this.f24086w;
                if (typeface != typeface2) {
                    this.f24088y = typeface2;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                float f3 = this.f24076m;
                Typeface typeface3 = this.f24088y;
                Typeface typeface4 = this.f24087x;
                if (typeface3 != typeface4) {
                    this.f24088y = typeface4;
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (m35605O(f, f3)) {
                    this.f24037I = 1.0f;
                } else {
                    this.f24037I = f / this.f24076m;
                }
                float f4 = this.f24077n / this.f24076m;
                float f5 = width2 * f4;
                if (!z && f5 > width) {
                    width = Math.min(width / f4, width2);
                } else {
                    width = width2;
                }
                f2 = f3;
                z2 = z4;
            }
            if (width > Utils.FLOAT_EPSILON) {
                if (this.f24038J != f2 || this.f24040L || z2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f24038J = f2;
                this.f24040L = false;
            }
            if (this.f24031C == null || z2) {
                this.f24041M.setTextSize(this.f24038J);
                this.f24041M.setTypeface(this.f24088y);
                TextPaint textPaint = this.f24041M;
                if (this.f24037I != 1.0f) {
                    z5 = true;
                }
                textPaint.setLinearText(z5);
                this.f24032D = mo33053g(this.f24030B);
                if (mo33022D0()) {
                    i = this.f24066f0;
                }
                StaticLayout l = mo33063l(i, width, this.f24032D);
                this.f24056a0 = l;
                this.f24031C = l.getText();
            }
        }
    }

    /* renamed from: j0 */
    public final void mo33060j0(float f) {
        this.f24060c0 = f;
        ga7.m17767g0(this.f24055a);
    }

    /* renamed from: k */
    public final void mo33061k() {
        Bitmap bitmap = this.f24035G;
        if (bitmap != null) {
            bitmap.recycle();
            this.f24035G = null;
        }
    }

    /* renamed from: k0 */
    public void mo33062k0(ColorStateList colorStateList) {
        if (this.f24078o != colorStateList) {
            this.f24078o = colorStateList;
            mo33037U();
        }
    }

    /* renamed from: l */
    public final StaticLayout mo33063l(int i, float f, boolean z) {
        StaticLayout staticLayout;
        try {
            staticLayout = StaticLayoutBuilderCompat.m35595b(this.f24030B, this.f24041M, (int) f).mo33007d(TextUtils.TruncateAt.END).mo33010g(z).mo33006c(Layout.Alignment.ALIGN_NORMAL).mo33009f(false).mo33012i(i).mo33011h(this.f24068g0, this.f24070h0).mo33008e(this.f24072i0).mo33005a();
        } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e) {
            e.getCause().getMessage();
            staticLayout = null;
        }
        return (StaticLayout) gu4.m18428f(staticLayout);
    }

    /* renamed from: l0 */
    public void mo33064l0(int i) {
        if (this.f24074k != i) {
            this.f24074k = i;
            mo33037U();
        }
    }

    /* renamed from: m */
    public void mo33065m(Canvas canvas) {
        float f;
        int save = canvas.save();
        if (this.f24031C != null && this.f24057b) {
            boolean z = true;
            if (this.f24066f0 > 1) {
                f = (float) this.f24056a0.getLineStart(0);
            } else {
                f = this.f24056a0.getLineLeft(0);
            }
            float f2 = (this.f24084u + f) - (this.f24062d0 * 2.0f);
            this.f24041M.setTextSize(this.f24038J);
            float f3 = this.f24084u;
            float f4 = this.f24085v;
            if (!this.f24034F || this.f24035G == null) {
                z = false;
            }
            float f5 = this.f24037I;
            if (f5 != 1.0f && !this.f24061d) {
                canvas.scale(f5, f5, f3, f4);
            }
            if (z) {
                canvas.drawBitmap(this.f24035G, f3, f4, this.f24036H);
                canvas.restoreToCount(save);
                return;
            }
            if (!mo33022D0() || (this.f24061d && this.f24059c <= this.f24065f)) {
                canvas.translate(f3, f4);
                this.f24056a0.draw(canvas);
            } else {
                mo33067n(canvas, f2, f4);
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: m0 */
    public void mo33066m0(float f) {
        if (this.f24076m != f) {
            this.f24076m = f;
            mo33037U();
        }
    }

    /* renamed from: n */
    public final void mo33067n(Canvas canvas, float f, float f2) {
        int alpha = this.f24041M.getAlpha();
        canvas.translate(f, f2);
        float f3 = (float) alpha;
        this.f24041M.setAlpha((int) (this.f24060c0 * f3));
        this.f24056a0.draw(canvas);
        this.f24041M.setAlpha((int) (this.f24058b0 * f3));
        int lineBaseline = this.f24056a0.getLineBaseline(0);
        CharSequence charSequence = this.f24064e0;
        float f4 = (float) lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), Utils.FLOAT_EPSILON, f4, this.f24041M);
        if (!this.f24061d) {
            String trim = this.f24064e0.toString().trim();
            if (trim.endsWith("…")) {
                trim = trim.substring(0, trim.length() - 1);
            }
            String str = trim;
            this.f24041M.setAlpha(alpha);
            canvas.drawText(str, 0, Math.min(this.f24056a0.getLineEnd(0), str.length()), Utils.FLOAT_EPSILON, f4, this.f24041M);
        }
    }

    /* renamed from: n0 */
    public void mo33068n0(Typeface typeface) {
        if (mo33070o0(typeface)) {
            mo33037U();
        }
    }

    /* renamed from: o */
    public final void mo33069o() {
        if (this.f24035G == null && !this.f24069h.isEmpty() && !TextUtils.isEmpty(this.f24031C)) {
            mo33055h(Utils.FLOAT_EPSILON);
            int width = this.f24056a0.getWidth();
            int height = this.f24056a0.getHeight();
            if (width > 0 && height > 0) {
                this.f24035G = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f24056a0.draw(new Canvas(this.f24035G));
                if (this.f24036H == null) {
                    this.f24036H = new Paint(3);
                }
            }
        }
    }

    /* renamed from: o0 */
    public final boolean mo33070o0(Typeface typeface) {
        ja0 ja0 = this.f24089z;
        if (ja0 != null) {
            ja0.mo44072c();
        }
        if (this.f24087x == typeface) {
            return false;
        }
        this.f24087x = typeface;
        return true;
    }

    /* renamed from: p */
    public void mo33071p(RectF rectF, int i, int i2) {
        this.f24032D = mo33053g(this.f24030B);
        rectF.left = mo33079t(i, i2);
        rectF.top = (float) this.f24071i.top;
        rectF.right = mo33081u(rectF, i, i2);
        rectF.bottom = ((float) this.f24071i.top) + mo33077s();
    }

    /* renamed from: p0 */
    public void mo33072p0(float f) {
        float a = ep3.m16273a(f, Utils.FLOAT_EPSILON, 1.0f);
        if (a != this.f24059c) {
            this.f24059c = a;
            mo33047d();
        }
    }

    /* renamed from: q */
    public ColorStateList mo33073q() {
        return this.f24079p;
    }

    /* renamed from: q0 */
    public void mo33074q0(boolean z) {
        this.f24061d = z;
    }

    /* renamed from: r */
    public int mo33075r() {
        return this.f24075l;
    }

    /* renamed from: r0 */
    public void mo33076r0(float f) {
        this.f24063e = f;
        this.f24065f = mo33051f();
    }

    /* renamed from: s */
    public float mo33077s() {
        mo33030L(this.f24042N);
        return -this.f24042N.ascent();
    }

    /* renamed from: s0 */
    public void mo33078s0(int i) {
        this.f24072i0 = i;
    }

    /* renamed from: t */
    public final float mo33079t(int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (((float) i) / 2.0f) - (mo33045c() / 2.0f);
        }
        if ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) {
            if (this.f24032D) {
                return (float) this.f24071i.left;
            }
            return ((float) this.f24071i.right) - mo33045c();
        } else if (this.f24032D) {
            return ((float) this.f24071i.right) - mo33045c();
        } else {
            return (float) this.f24071i.left;
        }
    }

    /* renamed from: t0 */
    public final void mo33080t0(float f) {
        boolean z;
        mo33057i(f);
        if (!f24027j0 || this.f24037I == 1.0f) {
            z = false;
        } else {
            z = true;
        }
        this.f24034F = z;
        if (z) {
            mo33069o();
        }
        ga7.m17767g0(this.f24055a);
    }

    /* renamed from: u */
    public final float mo33081u(RectF rectF, int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (((float) i) / 2.0f) + (mo33045c() / 2.0f);
        }
        if ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) {
            if (this.f24032D) {
                return rectF.left + mo33045c();
            }
            return (float) this.f24071i.right;
        } else if (this.f24032D) {
            return (float) this.f24071i.right;
        } else {
            return rectF.left + mo33045c();
        }
    }

    /* renamed from: u0 */
    public void mo33082u0(float f) {
        this.f24068g0 = f;
    }

    /* renamed from: v */
    public Typeface mo33083v() {
        Typeface typeface = this.f24086w;
        if (typeface != null) {
            return typeface;
        }
        return Typeface.DEFAULT;
    }

    /* renamed from: v0 */
    public void mo33084v0(float f) {
        this.f24070h0 = f;
    }

    /* renamed from: w */
    public int mo33085w() {
        return mo33087x(this.f24079p);
    }

    /* renamed from: w0 */
    public void mo33086w0(int i) {
        if (i != this.f24066f0) {
            this.f24066f0 = i;
            mo33061k();
            mo33037U();
        }
    }

    /* renamed from: x */
    public final int mo33087x(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f24039K;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    /* renamed from: x0 */
    public void mo33088x0(TimeInterpolator timeInterpolator) {
        this.f24043O = timeInterpolator;
        mo33037U();
    }

    /* renamed from: y */
    public final int mo33089y() {
        return mo33087x(this.f24078o);
    }

    /* renamed from: y0 */
    public void mo33090y0(boolean z) {
        this.f24033E = z;
    }

    /* renamed from: z */
    public float mo33091z() {
        mo33031M(this.f24042N);
        return (-this.f24042N.ascent()) + this.f24042N.descent();
    }

    /* renamed from: z0 */
    public final boolean mo33092z0(int[] iArr) {
        this.f24039K = iArr;
        if (!mo33034Q()) {
            return false;
        }
        mo33037U();
        return true;
    }
}
