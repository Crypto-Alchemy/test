package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import com.github.mikephil.charting.utils.Utils;
import p000.uf5;

/* renamed from: bn6 */
/* compiled from: TextAppearance */
public class bn6 {

    /* renamed from: a */
    public final ColorStateList f21403a;

    /* renamed from: b */
    public final ColorStateList f21404b;

    /* renamed from: c */
    public final ColorStateList f21405c;

    /* renamed from: d */
    public final ColorStateList f21406d;

    /* renamed from: e */
    public final String f21407e;

    /* renamed from: f */
    public final int f21408f;

    /* renamed from: g */
    public final int f21409g;

    /* renamed from: h */
    public final boolean f21410h;

    /* renamed from: i */
    public final float f21411i;

    /* renamed from: j */
    public final float f21412j;

    /* renamed from: k */
    public final float f21413k;

    /* renamed from: l */
    public final boolean f21414l;

    /* renamed from: m */
    public final float f21415m;

    /* renamed from: n */
    public float f21416n;

    /* renamed from: o */
    public final int f21417o;

    /* renamed from: p */
    public boolean f21418p = false;

    /* renamed from: q */
    public Typeface f21419q;

    /* renamed from: bn6$a */
    /* compiled from: TextAppearance */
    public class C3904a extends uf5.C3410e {

        /* renamed from: a */
        public final /* synthetic */ dn6 f21420a;

        public C3904a(dn6 dn6) {
            this.f21420a = dn6;
        }

        /* renamed from: h */
        public void mo22881h(int i) {
            boolean unused = bn6.this.f21418p = true;
            this.f21420a.mo29667a(i);
        }

        /* renamed from: i */
        public void mo22882i(Typeface typeface) {
            bn6 bn6 = bn6.this;
            Typeface unused = bn6.f21419q = Typeface.create(typeface, bn6.f21408f);
            boolean unused2 = bn6.this.f21418p = true;
            this.f21420a.mo29668b(bn6.this.f21419q, false);
        }
    }

    /* renamed from: bn6$b */
    /* compiled from: TextAppearance */
    public class C3905b extends dn6 {

        /* renamed from: a */
        public final /* synthetic */ TextPaint f21422a;

        /* renamed from: b */
        public final /* synthetic */ dn6 f21423b;

        public C3905b(TextPaint textPaint, dn6 dn6) {
            this.f21422a = textPaint;
            this.f21423b = dn6;
        }

        /* renamed from: a */
        public void mo29667a(int i) {
            this.f21423b.mo29667a(i);
        }

        /* renamed from: b */
        public void mo29668b(Typeface typeface, boolean z) {
            bn6.this.mo29666l(this.f21422a, typeface);
            this.f21423b.mo29668b(typeface, z);
        }
    }

    public bn6(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, u55.TextAppearance);
        this.f21416n = obtainStyledAttributes.getDimension(u55.TextAppearance_android_textSize, Utils.FLOAT_EPSILON);
        this.f21403a = to3.m52391b(context, obtainStyledAttributes, u55.TextAppearance_android_textColor);
        this.f21404b = to3.m52391b(context, obtainStyledAttributes, u55.TextAppearance_android_textColorHint);
        this.f21405c = to3.m52391b(context, obtainStyledAttributes, u55.TextAppearance_android_textColorLink);
        this.f21408f = obtainStyledAttributes.getInt(u55.TextAppearance_android_textStyle, 0);
        this.f21409g = obtainStyledAttributes.getInt(u55.TextAppearance_android_typeface, 1);
        int e = to3.m52394e(obtainStyledAttributes, u55.TextAppearance_fontFamily, u55.TextAppearance_android_fontFamily);
        this.f21417o = obtainStyledAttributes.getResourceId(e, 0);
        this.f21407e = obtainStyledAttributes.getString(e);
        this.f21410h = obtainStyledAttributes.getBoolean(u55.TextAppearance_textAllCaps, false);
        this.f21406d = to3.m52391b(context, obtainStyledAttributes, u55.TextAppearance_android_shadowColor);
        this.f21411i = obtainStyledAttributes.getFloat(u55.TextAppearance_android_shadowDx, Utils.FLOAT_EPSILON);
        this.f21412j = obtainStyledAttributes.getFloat(u55.TextAppearance_android_shadowDy, Utils.FLOAT_EPSILON);
        this.f21413k = obtainStyledAttributes.getFloat(u55.TextAppearance_android_shadowRadius, Utils.FLOAT_EPSILON);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, u55.MaterialTextAppearance);
        int i2 = u55.MaterialTextAppearance_android_letterSpacing;
        this.f21414l = obtainStyledAttributes2.hasValue(i2);
        this.f21415m = obtainStyledAttributes2.getFloat(i2, Utils.FLOAT_EPSILON);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: d */
    public final void mo29658d() {
        String str;
        if (this.f21419q == null && (str = this.f21407e) != null) {
            this.f21419q = Typeface.create(str, this.f21408f);
        }
        if (this.f21419q == null) {
            int i = this.f21409g;
            if (i == 1) {
                this.f21419q = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f21419q = Typeface.SERIF;
            } else if (i != 3) {
                this.f21419q = Typeface.DEFAULT;
            } else {
                this.f21419q = Typeface.MONOSPACE;
            }
            this.f21419q = Typeface.create(this.f21419q, this.f21408f);
        }
    }

    /* renamed from: e */
    public Typeface mo29659e() {
        mo29658d();
        return this.f21419q;
    }

    /* renamed from: f */
    public Typeface mo29660f(Context context) {
        if (this.f21418p) {
            return this.f21419q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface h = uf5.m28225h(context, this.f21417o);
                this.f21419q = h;
                if (h != null) {
                    this.f21419q = Typeface.create(h, this.f21408f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception unused2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error loading font ");
                sb.append(this.f21407e);
            }
        }
        mo29658d();
        this.f21418p = true;
        return this.f21419q;
    }

    /* renamed from: g */
    public void mo29661g(Context context, dn6 dn6) {
        if (mo29663i(context)) {
            mo29660f(context);
        } else {
            mo29658d();
        }
        int i = this.f21417o;
        if (i == 0) {
            this.f21418p = true;
        }
        if (this.f21418p) {
            dn6.mo29668b(this.f21419q, true);
            return;
        }
        try {
            uf5.m28227j(context, i, new C3904a(dn6), (Handler) null);
        } catch (Resources.NotFoundException unused) {
            this.f21418p = true;
            dn6.mo29667a(1);
        } catch (Exception unused2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error loading font ");
            sb.append(this.f21407e);
            this.f21418p = true;
            dn6.mo29667a(-3);
        }
    }

    /* renamed from: h */
    public void mo29662h(Context context, TextPaint textPaint, dn6 dn6) {
        mo29666l(textPaint, mo29659e());
        mo29661g(context, new C3905b(textPaint, dn6));
    }

    /* renamed from: i */
    public final boolean mo29663i(Context context) {
        Typeface typeface;
        if (cn6.m33126a()) {
            return true;
        }
        int i = this.f21417o;
        if (i != 0) {
            typeface = uf5.m28220c(context, i);
        } else {
            typeface = null;
        }
        if (typeface != null) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void mo29664j(Context context, TextPaint textPaint, dn6 dn6) {
        int i;
        int i2;
        mo29665k(context, textPaint, dn6);
        ColorStateList colorStateList = this.f21403a;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        float f = this.f21413k;
        float f2 = this.f21411i;
        float f3 = this.f21412j;
        ColorStateList colorStateList2 = this.f21406d;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i2 = 0;
        }
        textPaint.setShadowLayer(f, f2, f3, i2);
    }

    /* renamed from: k */
    public void mo29665k(Context context, TextPaint textPaint, dn6 dn6) {
        if (mo29663i(context)) {
            mo29666l(textPaint, mo29660f(context));
        } else {
            mo29662h(context, textPaint, dn6);
        }
    }

    /* renamed from: l */
    public void mo29666l(TextPaint textPaint, Typeface typeface) {
        boolean z;
        float f;
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f21408f;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if ((i & 2) != 0) {
            f = -0.25f;
        } else {
            f = Utils.FLOAT_EPSILON;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.f21416n);
        if (this.f21414l) {
            textPaint.setLetterSpacing(this.f21415m);
        }
    }
}
