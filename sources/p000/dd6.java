package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.github.mikephil.charting.utils.Utils;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: dd6 */
/* compiled from: SubtitlePainter */
public final class dd6 {

    /* renamed from: A */
    public int f10639A;

    /* renamed from: B */
    public int f10640B;

    /* renamed from: C */
    public int f10641C;

    /* renamed from: D */
    public int f10642D;

    /* renamed from: E */
    public StaticLayout f10643E;

    /* renamed from: F */
    public StaticLayout f10644F;

    /* renamed from: G */
    public int f10645G;

    /* renamed from: H */
    public int f10646H;

    /* renamed from: I */
    public int f10647I;

    /* renamed from: J */
    public Rect f10648J;

    /* renamed from: a */
    public final float f10649a;

    /* renamed from: b */
    public final float f10650b;

    /* renamed from: c */
    public final float f10651c;

    /* renamed from: d */
    public final float f10652d;

    /* renamed from: e */
    public final float f10653e;

    /* renamed from: f */
    public final TextPaint f10654f;

    /* renamed from: g */
    public final Paint f10655g;

    /* renamed from: h */
    public final Paint f10656h;

    /* renamed from: i */
    public CharSequence f10657i;

    /* renamed from: j */
    public Layout.Alignment f10658j;

    /* renamed from: k */
    public Bitmap f10659k;

    /* renamed from: l */
    public float f10660l;

    /* renamed from: m */
    public int f10661m;

    /* renamed from: n */
    public int f10662n;

    /* renamed from: o */
    public float f10663o;

    /* renamed from: p */
    public int f10664p;

    /* renamed from: q */
    public float f10665q;

    /* renamed from: r */
    public float f10666r;

    /* renamed from: s */
    public int f10667s;

    /* renamed from: t */
    public int f10668t;

    /* renamed from: u */
    public int f10669u;

    /* renamed from: v */
    public int f10670v;

    /* renamed from: w */
    public int f10671w;

    /* renamed from: x */
    public float f10672x;

    /* renamed from: y */
    public float f10673y;

    /* renamed from: z */
    public float f10674z;

    public dd6(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{16843287, 16843288}, 0, 0);
        this.f10653e = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f10652d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = (float) Math.round((((float) context.getResources().getDisplayMetrics().densityDpi) * 2.0f) / 160.0f);
        this.f10649a = round;
        this.f10650b = round;
        this.f10651c = round;
        TextPaint textPaint = new TextPaint();
        this.f10654f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f10655g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f10656h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* renamed from: a */
    public static boolean m15031a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo18730b(dx0 dx0, ib0 ib0, float f, float f2, float f3, Canvas canvas, int i, int i2, int i3, int i4) {
        boolean z;
        if (dx0.f10946g == null) {
            z = true;
        } else {
            z = false;
        }
        int i5 = -16777216;
        if (z) {
            if (!TextUtils.isEmpty(dx0.f10943a)) {
                if (dx0.f10937C) {
                    i5 = dx0.f10938H;
                } else {
                    i5 = ib0.f13238c;
                }
            } else {
                return;
            }
        }
        if (m15031a(this.f10657i, dx0.f10943a) && w67.m29346c(this.f10658j, dx0.f10944d) && this.f10659k == dx0.f10946g && this.f10660l == dx0.f10947k && this.f10661m == dx0.f10948r && w67.m29346c(Integer.valueOf(this.f10662n), Integer.valueOf(dx0.f10949s)) && this.f10663o == dx0.f10950x && w67.m29346c(Integer.valueOf(this.f10664p), Integer.valueOf(dx0.f10951y)) && this.f10665q == dx0.f10935A && this.f10666r == dx0.f10936B && this.f10667s == ib0.f13236a && this.f10668t == ib0.f13237b && this.f10669u == i5 && this.f10671w == ib0.f13239d && this.f10670v == ib0.f13240e && w67.m29346c(this.f10654f.getTypeface(), ib0.f13241f) && this.f10672x == f && this.f10673y == f2 && this.f10674z == f3 && this.f10639A == i && this.f10640B == i2 && this.f10641C == i3 && this.f10642D == i4) {
            mo18732d(canvas, z);
            return;
        }
        this.f10657i = dx0.f10943a;
        this.f10658j = dx0.f10944d;
        this.f10659k = dx0.f10946g;
        this.f10660l = dx0.f10947k;
        this.f10661m = dx0.f10948r;
        this.f10662n = dx0.f10949s;
        this.f10663o = dx0.f10950x;
        this.f10664p = dx0.f10951y;
        this.f10665q = dx0.f10935A;
        this.f10666r = dx0.f10936B;
        this.f10667s = ib0.f13236a;
        this.f10668t = ib0.f13237b;
        this.f10669u = i5;
        this.f10671w = ib0.f13239d;
        this.f10670v = ib0.f13240e;
        this.f10654f.setTypeface(ib0.f13241f);
        this.f10672x = f;
        this.f10673y = f2;
        this.f10674z = f3;
        this.f10639A = i;
        this.f10640B = i2;
        this.f10641C = i3;
        this.f10642D = i4;
        if (z) {
            C2725kr.m20985e(this.f10657i);
            mo18735g();
        } else {
            C2725kr.m20985e(this.f10659k);
            mo18734f();
        }
        mo18732d(canvas, z);
    }

    @RequiresNonNull({"cueBitmap", "bitmapRect"})
    /* renamed from: c */
    public final void mo18731c(Canvas canvas) {
        canvas.drawBitmap(this.f10659k, (Rect) null, this.f10648J, this.f10656h);
    }

    /* renamed from: d */
    public final void mo18732d(Canvas canvas, boolean z) {
        if (z) {
            mo18733e(canvas);
            return;
        }
        C2725kr.m20985e(this.f10648J);
        C2725kr.m20985e(this.f10659k);
        mo18731c(canvas);
    }

    /* renamed from: e */
    public final void mo18733e(Canvas canvas) {
        int i;
        StaticLayout staticLayout = this.f10643E;
        StaticLayout staticLayout2 = this.f10644F;
        if (staticLayout != null && staticLayout2 != null) {
            int save = canvas.save();
            canvas.translate((float) this.f10645G, (float) this.f10646H);
            if (Color.alpha(this.f10669u) > 0) {
                this.f10655g.setColor(this.f10669u);
                canvas.drawRect((float) (-this.f10647I), Utils.FLOAT_EPSILON, (float) (staticLayout.getWidth() + this.f10647I), (float) staticLayout.getHeight(), this.f10655g);
            }
            int i2 = this.f10671w;
            boolean z = true;
            if (i2 == 1) {
                this.f10654f.setStrokeJoin(Paint.Join.ROUND);
                this.f10654f.setStrokeWidth(this.f10649a);
                this.f10654f.setColor(this.f10670v);
                this.f10654f.setStyle(Paint.Style.FILL_AND_STROKE);
                staticLayout2.draw(canvas);
            } else if (i2 == 2) {
                TextPaint textPaint = this.f10654f;
                float f = this.f10650b;
                float f2 = this.f10651c;
                textPaint.setShadowLayer(f, f2, f2, this.f10670v);
            } else if (i2 == 3 || i2 == 4) {
                if (i2 != 3) {
                    z = false;
                }
                int i3 = -1;
                if (z) {
                    i = -1;
                } else {
                    i = this.f10670v;
                }
                if (z) {
                    i3 = this.f10670v;
                }
                float f3 = this.f10650b / 2.0f;
                this.f10654f.setColor(this.f10667s);
                this.f10654f.setStyle(Paint.Style.FILL);
                float f4 = -f3;
                this.f10654f.setShadowLayer(this.f10650b, f4, f4, i);
                staticLayout2.draw(canvas);
                this.f10654f.setShadowLayer(this.f10650b, f3, f3, i3);
            }
            this.f10654f.setColor(this.f10667s);
            this.f10654f.setStyle(Paint.Style.FILL);
            staticLayout.draw(canvas);
            this.f10654f.setShadowLayer(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0);
            canvas.restoreToCount(save);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"cueBitmap"})
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18734f() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f10659k
            int r1 = r7.f10641C
            int r2 = r7.f10639A
            int r1 = r1 - r2
            int r3 = r7.f10642D
            int r4 = r7.f10640B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f10663o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f10660l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.f10665q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.f10666r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x002e
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
            goto L_0x003f
        L_0x002e:
            float r3 = (float) r1
            int r5 = r0.getHeight()
            float r5 = (float) r5
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
        L_0x003f:
            int r3 = r7.f10664p
            r5 = 1
            r6 = 2
            if (r3 != r6) goto L_0x0048
            float r3 = (float) r1
        L_0x0046:
            float r2 = r2 - r3
            goto L_0x004e
        L_0x0048:
            if (r3 != r5) goto L_0x004e
            int r3 = r1 / 2
            float r3 = (float) r3
            goto L_0x0046
        L_0x004e:
            int r2 = java.lang.Math.round(r2)
            int r3 = r7.f10662n
            if (r3 != r6) goto L_0x0059
            float r3 = (float) r0
        L_0x0057:
            float r4 = r4 - r3
            goto L_0x005f
        L_0x0059:
            if (r3 != r5) goto L_0x005f
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L_0x0057
        L_0x005f:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.f10648J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dd6.mo18734f():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01a2  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"cueText"})
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18735g() {
        /*
            r26 = this;
            r0 = r26
            java.lang.CharSequence r1 = r0.f10657i
            boolean r2 = r1 instanceof android.text.SpannableStringBuilder
            if (r2 == 0) goto L_0x000b
            android.text.SpannableStringBuilder r1 = (android.text.SpannableStringBuilder) r1
            goto L_0x0012
        L_0x000b:
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r2 = r0.f10657i
            r1.<init>(r2)
        L_0x0012:
            int r2 = r0.f10641C
            int r3 = r0.f10639A
            int r2 = r2 - r3
            int r3 = r0.f10642D
            int r4 = r0.f10640B
            int r11 = r3 - r4
            android.text.TextPaint r3 = r0.f10654f
            float r4 = r0.f10672x
            r3.setTextSize(r4)
            float r3 = r0.f10672x
            r4 = 1040187392(0x3e000000, float:0.125)
            float r3 = r3 * r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r4
            int r12 = (int) r3
            int r13 = r12 * 2
            int r3 = r2 - r13
            float r4 = r0.f10665q
            r14 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r5 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x003d
            float r3 = (float) r3
            float r3 = r3 * r4
            int r3 = (int) r3
        L_0x003d:
            r15 = r3
            java.lang.String r10 = "SubtitlePainter"
            if (r15 > 0) goto L_0x0048
            java.lang.String r1 = "Skipped drawing subtitle cue (insufficient space)"
            p000.gk3.m18132i(r10, r1)
            return
        L_0x0048:
            float r3 = r0.f10673y
            r16 = 0
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            r4 = 16711680(0xff0000, float:2.3418052E-38)
            r9 = 0
            if (r3 <= 0) goto L_0x0062
            android.text.style.AbsoluteSizeSpan r3 = new android.text.style.AbsoluteSizeSpan
            float r5 = r0.f10673y
            int r5 = (int) r5
            r3.<init>(r5)
            int r5 = r1.length()
            r1.setSpan(r3, r9, r5, r4)
        L_0x0062:
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>(r1)
            int r3 = r0.f10671w
            r7 = 1
            if (r3 != r7) goto L_0x0085
            int r3 = r8.length()
            java.lang.Class<android.text.style.ForegroundColorSpan> r5 = android.text.style.ForegroundColorSpan.class
            java.lang.Object[] r3 = r8.getSpans(r9, r3, r5)
            android.text.style.ForegroundColorSpan[] r3 = (android.text.style.ForegroundColorSpan[]) r3
            int r5 = r3.length
            r6 = r9
        L_0x007a:
            if (r6 >= r5) goto L_0x0085
            r7 = r3[r6]
            r8.removeSpan(r7)
            int r6 = r6 + 1
            r7 = 1
            goto L_0x007a
        L_0x0085:
            int r3 = r0.f10668t
            int r3 = android.graphics.Color.alpha(r3)
            r7 = 2
            if (r3 <= 0) goto L_0x00b2
            int r3 = r0.f10671w
            if (r3 == 0) goto L_0x00a4
            if (r3 != r7) goto L_0x0095
            goto L_0x00a4
        L_0x0095:
            android.text.style.BackgroundColorSpan r3 = new android.text.style.BackgroundColorSpan
            int r5 = r0.f10668t
            r3.<init>(r5)
            int r5 = r8.length()
            r8.setSpan(r3, r9, r5, r4)
            goto L_0x00b2
        L_0x00a4:
            android.text.style.BackgroundColorSpan r3 = new android.text.style.BackgroundColorSpan
            int r5 = r0.f10668t
            r3.<init>(r5)
            int r5 = r1.length()
            r1.setSpan(r3, r9, r5, r4)
        L_0x00b2:
            android.text.Layout$Alignment r3 = r0.f10658j
            if (r3 != 0) goto L_0x00b8
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x00b8:
            r21 = r3
            android.text.StaticLayout r6 = new android.text.StaticLayout
            android.text.TextPaint r5 = r0.f10654f
            float r4 = r0.f10652d
            float r3 = r0.f10653e
            r18 = 1
            r19 = r3
            r3 = r6
            r20 = r4
            r4 = r1
            r14 = r6
            r6 = r15
            r7 = r21
            r23 = r8
            r8 = r20
            r25 = r12
            r12 = r9
            r9 = r19
            r12 = r10
            r10 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.f10643E = r14
            int r3 = r14.getHeight()
            android.text.StaticLayout r4 = r0.f10643E
            int r4 = r4.getLineCount()
            r5 = 0
            r9 = 0
        L_0x00eb:
            if (r9 >= r4) goto L_0x0100
            android.text.StaticLayout r6 = r0.f10643E
            float r6 = r6.getLineWidth(r9)
            double r6 = (double) r6
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            int r5 = java.lang.Math.max(r6, r5)
            int r9 = r9 + 1
            goto L_0x00eb
        L_0x0100:
            float r4 = r0.f10665q
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x010c
            if (r5 >= r15) goto L_0x010c
            goto L_0x010d
        L_0x010c:
            r15 = r5
        L_0x010d:
            int r15 = r15 + r13
            float r4 = r0.f10663o
            int r5 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x0139
            float r2 = (float) r2
            float r2 = r2 * r4
            int r2 = java.lang.Math.round(r2)
            int r4 = r0.f10639A
            int r2 = r2 + r4
            int r5 = r0.f10664p
            r6 = 1
            if (r5 == r6) goto L_0x0128
            r7 = 2
            if (r5 == r7) goto L_0x0126
            goto L_0x012d
        L_0x0126:
            int r2 = r2 - r15
            goto L_0x012d
        L_0x0128:
            r7 = 2
            int r2 = r2 * 2
            int r2 = r2 - r15
            int r2 = r2 / r7
        L_0x012d:
            int r2 = java.lang.Math.max(r2, r4)
            int r15 = r15 + r2
            int r4 = r0.f10641C
            int r4 = java.lang.Math.min(r15, r4)
            goto L_0x0142
        L_0x0139:
            r6 = 1
            r7 = 2
            int r2 = r2 - r15
            int r2 = r2 / r7
            int r4 = r0.f10639A
            int r2 = r2 + r4
            int r4 = r2 + r15
        L_0x0142:
            int r20 = r4 - r2
            if (r20 > 0) goto L_0x014c
            java.lang.String r1 = "Skipped drawing subtitle cue (invalid horizontal positioning)"
            p000.gk3.m18132i(r12, r1)
            return
        L_0x014c:
            float r4 = r0.f10660l
            r5 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x01a8
            int r5 = r0.f10661m
            if (r5 != 0) goto L_0x016e
            float r5 = (float) r11
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r5)
            int r5 = r0.f10640B
            int r4 = r4 + r5
            int r5 = r0.f10662n
            if (r5 != r7) goto L_0x0167
            goto L_0x0198
        L_0x0167:
            if (r5 != r6) goto L_0x0199
            int r4 = r4 * 2
            int r4 = r4 - r3
            int r4 = r4 / r7
            goto L_0x0199
        L_0x016e:
            android.text.StaticLayout r4 = r0.f10643E
            r5 = 0
            int r4 = r4.getLineBottom(r5)
            android.text.StaticLayout r6 = r0.f10643E
            int r5 = r6.getLineTop(r5)
            int r4 = r4 - r5
            float r5 = r0.f10660l
            int r6 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r6 < 0) goto L_0x018c
            float r4 = (float) r4
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r5)
            int r5 = r0.f10640B
            int r4 = r4 + r5
            goto L_0x0199
        L_0x018c:
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 + r6
            float r4 = (float) r4
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r5)
            int r5 = r0.f10642D
            int r4 = r4 + r5
        L_0x0198:
            int r4 = r4 - r3
        L_0x0199:
            int r5 = r4 + r3
            int r6 = r0.f10642D
            if (r5 <= r6) goto L_0x01a2
            int r4 = r6 - r3
            goto L_0x01b1
        L_0x01a2:
            int r3 = r0.f10640B
            if (r4 >= r3) goto L_0x01b1
            r11 = r3
            goto L_0x01b2
        L_0x01a8:
            int r4 = r0.f10642D
            int r4 = r4 - r3
            float r3 = (float) r11
            float r5 = r0.f10674z
            float r3 = r3 * r5
            int r3 = (int) r3
            int r4 = r4 - r3
        L_0x01b1:
            r11 = r4
        L_0x01b2:
            android.text.StaticLayout r12 = new android.text.StaticLayout
            android.text.TextPaint r5 = r0.f10654f
            float r8 = r0.f10652d
            float r9 = r0.f10653e
            r10 = 1
            r3 = r12
            r4 = r1
            r6 = r20
            r7 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.f10643E = r12
            android.text.StaticLayout r1 = new android.text.StaticLayout
            android.text.TextPaint r3 = r0.f10654f
            float r4 = r0.f10652d
            float r5 = r0.f10653e
            r24 = 1
            r17 = r1
            r18 = r23
            r19 = r3
            r22 = r4
            r23 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r0.f10644F = r1
            r0.f10645G = r2
            r0.f10646H = r11
            r1 = r25
            r0.f10647I = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dd6.mo18735g():void");
    }
}
