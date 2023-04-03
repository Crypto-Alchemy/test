package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import com.github.mikephil.charting.utils.Utils;
import java.util.BitSet;
import p000.rz5;
import p000.sz5;
import p000.uz5;

/* renamed from: uo3 */
/* compiled from: MaterialShapeDrawable */
public class uo3 extends Drawable implements vz5 {

    /* renamed from: e0 */
    public static final String f34628e0 = uo3.class.getSimpleName();

    /* renamed from: k0 */
    public static final Paint f34629k0 = new Paint(1);

    /* renamed from: A */
    public final RectF f34630A;

    /* renamed from: B */
    public final Region f34631B;

    /* renamed from: C */
    public final Region f34632C;

    /* renamed from: H */
    public rz5 f34633H;

    /* renamed from: I */
    public final Paint f34634I;

    /* renamed from: L */
    public final Paint f34635L;

    /* renamed from: M */
    public final oz5 f34636M;

    /* renamed from: P */
    public final sz5.C6509b f34637P;

    /* renamed from: Q */
    public final sz5 f34638Q;

    /* renamed from: U */
    public PorterDuffColorFilter f34639U;

    /* renamed from: X */
    public PorterDuffColorFilter f34640X;

    /* renamed from: Y */
    public final RectF f34641Y;

    /* renamed from: Z */
    public boolean f34642Z;

    /* renamed from: a */
    public C6573c f34643a;

    /* renamed from: d */
    public final uz5.C6595g[] f34644d;

    /* renamed from: e */
    public final uz5.C6595g[] f34645e;

    /* renamed from: g */
    public final BitSet f34646g;

    /* renamed from: k */
    public boolean f34647k;

    /* renamed from: r */
    public final Matrix f34648r;

    /* renamed from: s */
    public final Path f34649s;

    /* renamed from: x */
    public final Path f34650x;

    /* renamed from: y */
    public final RectF f34651y;

    /* renamed from: uo3$a */
    /* compiled from: MaterialShapeDrawable */
    public class C6571a implements sz5.C6509b {
        public C6571a() {
        }

        /* renamed from: a */
        public void mo47949a(uz5 uz5, Matrix matrix, int i) {
            uo3.this.f34646g.set(i, uz5.mo48557e());
            uo3.this.f34644d[i] = uz5.mo48558f(matrix);
        }

        /* renamed from: b */
        public void mo47950b(uz5 uz5, Matrix matrix, int i) {
            uo3.this.f34646g.set(i + 4, uz5.mo48557e());
            uo3.this.f34645e[i] = uz5.mo48558f(matrix);
        }
    }

    /* renamed from: uo3$b */
    /* compiled from: MaterialShapeDrawable */
    public class C6572b implements rz5.C6471c {

        /* renamed from: a */
        public final /* synthetic */ float f34653a;

        public C6572b(float f) {
            this.f34653a = f;
        }

        /* renamed from: a */
        public du0 mo47612a(du0 du0) {
            if (du0 instanceof dc5) {
                return du0;
            }
            return new C3889bd(this.f34653a, du0);
        }
    }

    public /* synthetic */ uo3(C6573c cVar, C6571a aVar) {
        this(cVar);
    }

    /* renamed from: U */
    public static int m52887U(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    /* renamed from: m */
    public static uo3 m52892m(Context context, float f) {
        int c = ro3.m51197c(context, j15.colorSurface, uo3.class.getSimpleName());
        uo3 uo3 = new uo3();
        uo3.mo48430P(context);
        uo3.mo48440a0(ColorStateList.valueOf(c));
        uo3.mo48439Z(f);
        return uo3;
    }

    /* renamed from: A */
    public int mo48415A() {
        C6573c cVar = this.f34643a;
        return (int) (((double) cVar.f34673s) * Math.sin(Math.toRadians((double) cVar.f34674t)));
    }

    /* renamed from: B */
    public int mo48416B() {
        C6573c cVar = this.f34643a;
        return (int) (((double) cVar.f34673s) * Math.cos(Math.toRadians((double) cVar.f34674t)));
    }

    /* renamed from: C */
    public int mo48417C() {
        return this.f34643a.f34672r;
    }

    /* renamed from: D */
    public rz5 mo48418D() {
        return this.f34643a.f34655a;
    }

    /* renamed from: E */
    public ColorStateList mo48419E() {
        return this.f34643a.f34659e;
    }

    /* renamed from: F */
    public final float mo48420F() {
        if (mo48429O()) {
            return this.f34635L.getStrokeWidth() / 2.0f;
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: G */
    public float mo48421G() {
        return this.f34643a.f34666l;
    }

    /* renamed from: H */
    public ColorStateList mo48422H() {
        return this.f34643a.f34661g;
    }

    /* renamed from: I */
    public float mo48423I() {
        return this.f34643a.f34655a.mo47581r().mo29529a(mo48475u());
    }

    /* renamed from: J */
    public float mo48424J() {
        return this.f34643a.f34655a.mo47583t().mo29529a(mo48475u());
    }

    /* renamed from: K */
    public float mo48425K() {
        return this.f34643a.f34670p;
    }

    /* renamed from: L */
    public float mo48426L() {
        return mo48477w() + mo48425K();
    }

    /* renamed from: M */
    public final boolean mo48427M() {
        C6573c cVar = this.f34643a;
        int i = cVar.f34671q;
        if (i == 1 || cVar.f34672r <= 0 || (i != 2 && !mo48436W())) {
            return false;
        }
        return true;
    }

    /* renamed from: N */
    public final boolean mo48428N() {
        Paint.Style style = this.f34643a.f34676v;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public final boolean mo48429O() {
        Paint.Style style = this.f34643a.f34676v;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f34635L.getStrokeWidth() > Utils.FLOAT_EPSILON) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public void mo48430P(Context context) {
        this.f34643a.f34656b = new zn1(context);
        mo48468o0();
    }

    /* renamed from: Q */
    public final void mo48431Q() {
        super.invalidateSelf();
    }

    /* renamed from: R */
    public boolean mo48432R() {
        zn1 zn1 = this.f34643a.f34656b;
        if (zn1 == null || !zn1.mo49886e()) {
            return false;
        }
        return true;
    }

    /* renamed from: S */
    public boolean mo48433S() {
        return this.f34643a.f34655a.mo47584u(mo48475u());
    }

    /* renamed from: T */
    public final void mo48434T(Canvas canvas) {
        if (mo48427M()) {
            canvas.save();
            mo48435V(canvas);
            if (!this.f34642Z) {
                mo48465n(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f34641Y.width() - ((float) getBounds().width()));
            int height = (int) (this.f34641Y.height() - ((float) getBounds().height()));
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f34641Y.width()) + (this.f34643a.f34672r * 2) + width, ((int) this.f34641Y.height()) + (this.f34643a.f34672r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (float) ((getBounds().left - this.f34643a.f34672r) - width);
            float f2 = (float) ((getBounds().top - this.f34643a.f34672r) - height);
            canvas2.translate(-f, -f2);
            mo48465n(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    /* renamed from: V */
    public final void mo48435V(Canvas canvas) {
        canvas.translate((float) mo48415A(), (float) mo48416B());
    }

    /* renamed from: W */
    public boolean mo48436W() {
        int i = Build.VERSION.SDK_INT;
        if (mo48433S() || this.f34649s.isConvex() || i >= 29) {
            return false;
        }
        return true;
    }

    /* renamed from: X */
    public void mo48437X(float f) {
        setShapeAppearanceModel(this.f34643a.f34655a.mo47586w(f));
    }

    /* renamed from: Y */
    public void mo48438Y(du0 du0) {
        setShapeAppearanceModel(this.f34643a.f34655a.mo47587x(du0));
    }

    /* renamed from: Z */
    public void mo48439Z(float f) {
        C6573c cVar = this.f34643a;
        if (cVar.f34669o != f) {
            cVar.f34669o = f;
            mo48468o0();
        }
    }

    /* renamed from: a0 */
    public void mo48440a0(ColorStateList colorStateList) {
        C6573c cVar = this.f34643a;
        if (cVar.f34658d != colorStateList) {
            cVar.f34658d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: b0 */
    public void mo48441b0(float f) {
        C6573c cVar = this.f34643a;
        if (cVar.f34665k != f) {
            cVar.f34665k = f;
            this.f34647k = true;
            invalidateSelf();
        }
    }

    /* renamed from: c0 */
    public void mo48442c0(int i, int i2, int i3, int i4) {
        C6573c cVar = this.f34643a;
        if (cVar.f34663i == null) {
            cVar.f34663i = new Rect();
        }
        this.f34643a.f34663i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    /* renamed from: d0 */
    public void mo48443d0(Paint.Style style) {
        this.f34643a.f34676v = style;
        mo48431Q();
    }

    public void draw(Canvas canvas) {
        this.f34634I.setColorFilter(this.f34639U);
        int alpha = this.f34634I.getAlpha();
        this.f34634I.setAlpha(m52887U(alpha, this.f34643a.f34667m));
        this.f34635L.setColorFilter(this.f34640X);
        this.f34635L.setStrokeWidth(this.f34643a.f34666l);
        int alpha2 = this.f34635L.getAlpha();
        this.f34635L.setAlpha(m52887U(alpha2, this.f34643a.f34667m));
        if (this.f34647k) {
            mo48454i();
            mo48447g(mo48475u(), this.f34649s);
            this.f34647k = false;
        }
        mo48434T(canvas);
        if (mo48428N()) {
            mo48467o(canvas);
        }
        if (mo48429O()) {
            mo48471r(canvas);
        }
        this.f34634I.setAlpha(alpha);
        this.f34635L.setAlpha(alpha2);
    }

    /* renamed from: e0 */
    public void mo48444e0(float f) {
        C6573c cVar = this.f34643a;
        if (cVar.f34668n != f) {
            cVar.f34668n = f;
            mo48468o0();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r2 = r2.getColor();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.PorterDuffColorFilter mo48445f(android.graphics.Paint r2, boolean r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0014
            int r2 = r2.getColor()
            int r3 = r1.mo48461l(r2)
            if (r3 == r2) goto L_0x0014
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r0)
            return r2
        L_0x0014:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.uo3.mo48445f(android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    /* renamed from: f0 */
    public void mo48446f0(boolean z) {
        this.f34642Z = z;
    }

    /* renamed from: g */
    public final void mo48447g(RectF rectF, Path path) {
        mo48452h(rectF, path);
        if (this.f34643a.f34664j != 1.0f) {
            this.f34648r.reset();
            Matrix matrix = this.f34648r;
            float f = this.f34643a.f34664j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f34648r);
        }
        path.computeBounds(this.f34641Y, true);
    }

    /* renamed from: g0 */
    public void mo48448g0(int i) {
        this.f34636M.mo46581d(i);
        this.f34643a.f34675u = false;
        mo48431Q();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f34643a;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f34643a.f34671q != 2) {
            if (mo48433S()) {
                outline.setRoundRect(getBounds(), mo48423I() * this.f34643a.f34665k);
                return;
            }
            mo48447g(mo48475u(), this.f34649s);
            if (this.f34649s.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.f34649s);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f34643a.f34663i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.f34631B.set(getBounds());
        mo48447g(mo48475u(), this.f34649s);
        this.f34632C.setPath(this.f34649s, this.f34631B);
        this.f34631B.op(this.f34632C, Region.Op.DIFFERENCE);
        return this.f34631B;
    }

    /* renamed from: h */
    public final void mo48452h(RectF rectF, Path path) {
        sz5 sz5 = this.f34638Q;
        C6573c cVar = this.f34643a;
        rz5 rz5 = cVar.f34655a;
        float f = cVar.f34665k;
        sz5.mo47939d(rz5, f, rectF, this.f34637P, path);
    }

    /* renamed from: h0 */
    public void mo48453h0(int i) {
        C6573c cVar = this.f34643a;
        if (cVar.f34671q != i) {
            cVar.f34671q = i;
            mo48431Q();
        }
    }

    /* renamed from: i */
    public final void mo48454i() {
        rz5 y = mo48418D().mo47588y(new C6572b(-mo48420F()));
        this.f34633H = y;
        this.f34638Q.mo47940e(y, this.f34643a.f34665k, mo48476v(), this.f34650x);
    }

    /* renamed from: i0 */
    public void mo48455i0(float f, int i) {
        mo48462l0(f);
        mo48460k0(ColorStateList.valueOf(i));
    }

    public void invalidateSelf() {
        this.f34647k = true;
        super.invalidateSelf();
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (super.isStateful() || (((colorStateList = this.f34643a.f34661g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f34643a.f34660f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f34643a.f34659e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f34643a.f34658d) != null && colorStateList4.isStateful()))))) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final PorterDuffColorFilter mo48457j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = mo48461l(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: j0 */
    public void mo48458j0(float f, ColorStateList colorStateList) {
        mo48462l0(f);
        mo48460k0(colorStateList);
    }

    /* renamed from: k */
    public final PorterDuffColorFilter mo48459k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList == null || mode == null) {
            return mo48445f(paint, z);
        }
        return mo48457j(colorStateList, mode, z);
    }

    /* renamed from: k0 */
    public void mo48460k0(ColorStateList colorStateList) {
        C6573c cVar = this.f34643a;
        if (cVar.f34659e != colorStateList) {
            cVar.f34659e = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: l */
    public int mo48461l(int i) {
        float L = mo48426L() + mo48480z();
        zn1 zn1 = this.f34643a.f34656b;
        if (zn1 != null) {
            return zn1.mo49884c(i, L);
        }
        return i;
    }

    /* renamed from: l0 */
    public void mo48462l0(float f) {
        this.f34643a.f34666l = f;
        invalidateSelf();
    }

    /* renamed from: m0 */
    public final boolean mo48463m0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f34643a.f34658d == null || (color2 = this.f34634I.getColor()) == (colorForState2 = this.f34643a.f34658d.getColorForState(iArr, color2))) {
            z = false;
        } else {
            this.f34634I.setColor(colorForState2);
            z = true;
        }
        if (this.f34643a.f34659e == null || (color = this.f34635L.getColor()) == (colorForState = this.f34643a.f34659e.getColorForState(iArr, color))) {
            return z;
        }
        this.f34635L.setColor(colorForState);
        return true;
    }

    public Drawable mutate() {
        this.f34643a = new C6573c(this.f34643a);
        return this;
    }

    /* renamed from: n */
    public final void mo48465n(Canvas canvas) {
        this.f34646g.cardinality();
        if (this.f34643a.f34673s != 0) {
            canvas.drawPath(this.f34649s, this.f34636M.mo46580c());
        }
        for (int i = 0; i < 4; i++) {
            this.f34644d[i].mo48589a(this.f34636M, this.f34643a.f34672r, canvas);
            this.f34645e[i].mo48589a(this.f34636M, this.f34643a.f34672r, canvas);
        }
        if (this.f34642Z) {
            int A = mo48415A();
            int B = mo48416B();
            canvas.translate((float) (-A), (float) (-B));
            canvas.drawPath(this.f34649s, f34629k0);
            canvas.translate((float) A, (float) B);
        }
    }

    /* renamed from: n0 */
    public final boolean mo48466n0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f34639U;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f34640X;
        C6573c cVar = this.f34643a;
        this.f34639U = mo48459k(cVar.f34661g, cVar.f34662h, this.f34634I, true);
        C6573c cVar2 = this.f34643a;
        this.f34640X = mo48459k(cVar2.f34660f, cVar2.f34662h, this.f34635L, false);
        C6573c cVar3 = this.f34643a;
        if (cVar3.f34675u) {
            this.f34636M.mo46581d(cVar3.f34661g.getColorForState(getState(), 0));
        }
        if (!mf4.m22283a(porterDuffColorFilter, this.f34639U) || !mf4.m22283a(porterDuffColorFilter2, this.f34640X)) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final void mo48467o(Canvas canvas) {
        mo48469p(canvas, this.f34634I, this.f34649s, this.f34643a.f34655a, mo48475u());
    }

    /* renamed from: o0 */
    public final void mo48468o0() {
        float L = mo48426L();
        this.f34643a.f34672r = (int) Math.ceil((double) (0.75f * L));
        this.f34643a.f34673s = (int) Math.ceil((double) (L * 0.25f));
        mo48466n0();
        mo48431Q();
    }

    public void onBoundsChange(Rect rect) {
        this.f34647k = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z;
        boolean m0 = mo48463m0(iArr);
        boolean n0 = mo48466n0();
        if (m0 || n0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* renamed from: p */
    public final void mo48469p(Canvas canvas, Paint paint, Path path, rz5 rz5, RectF rectF) {
        if (rz5.mo47584u(rectF)) {
            float a = rz5.mo47583t().mo29529a(rectF) * this.f34643a.f34665k;
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: q */
    public void mo48470q(Canvas canvas, Paint paint, Path path, RectF rectF) {
        mo48469p(canvas, paint, path, this.f34643a.f34655a, rectF);
    }

    /* renamed from: r */
    public final void mo48471r(Canvas canvas) {
        mo48469p(canvas, this.f34635L, this.f34650x, this.f34633H, mo48476v());
    }

    /* renamed from: s */
    public float mo48472s() {
        return this.f34643a.f34655a.mo47574j().mo29529a(mo48475u());
    }

    public void setAlpha(int i) {
        C6573c cVar = this.f34643a;
        if (cVar.f34667m != i) {
            cVar.f34667m = i;
            mo48431Q();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f34643a.f34657c = colorFilter;
        mo48431Q();
    }

    public void setShapeAppearanceModel(rz5 rz5) {
        this.f34643a.f34655a = rz5;
        invalidateSelf();
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f34643a.f34661g = colorStateList;
        mo48466n0();
        mo48431Q();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C6573c cVar = this.f34643a;
        if (cVar.f34662h != mode) {
            cVar.f34662h = mode;
            mo48466n0();
            mo48431Q();
        }
    }

    /* renamed from: t */
    public float mo48474t() {
        return this.f34643a.f34655a.mo47576l().mo29529a(mo48475u());
    }

    /* renamed from: u */
    public RectF mo48475u() {
        this.f34651y.set(getBounds());
        return this.f34651y;
    }

    /* renamed from: v */
    public final RectF mo48476v() {
        this.f34630A.set(mo48475u());
        float F = mo48420F();
        this.f34630A.inset(F, F);
        return this.f34630A;
    }

    /* renamed from: w */
    public float mo48477w() {
        return this.f34643a.f34669o;
    }

    /* renamed from: x */
    public ColorStateList mo48478x() {
        return this.f34643a.f34658d;
    }

    /* renamed from: y */
    public float mo48479y() {
        return this.f34643a.f34665k;
    }

    /* renamed from: z */
    public float mo48480z() {
        return this.f34643a.f34668n;
    }

    public uo3() {
        this(new rz5());
    }

    public uo3(Context context, AttributeSet attributeSet, int i, int i2) {
        this(rz5.m51450e(context, attributeSet, i, i2).mo47599m());
    }

    public uo3(rz5 rz5) {
        this(new C6573c(rz5, (zn1) null));
    }

    public uo3(C6573c cVar) {
        this.f34644d = new uz5.C6595g[4];
        this.f34645e = new uz5.C6595g[4];
        this.f34646g = new BitSet(8);
        this.f34648r = new Matrix();
        this.f34649s = new Path();
        this.f34650x = new Path();
        this.f34651y = new RectF();
        this.f34630A = new RectF();
        this.f34631B = new Region();
        this.f34632C = new Region();
        Paint paint = new Paint(1);
        this.f34634I = paint;
        Paint paint2 = new Paint(1);
        this.f34635L = paint2;
        this.f34636M = new oz5();
        this.f34638Q = Looper.getMainLooper().getThread() == Thread.currentThread() ? sz5.m52000k() : new sz5();
        this.f34641Y = new RectF();
        this.f34642Z = true;
        this.f34643a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f34629k0;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        mo48466n0();
        mo48463m0(getState());
        this.f34637P = new C6571a();
    }

    /* renamed from: uo3$c */
    /* compiled from: MaterialShapeDrawable */
    public static final class C6573c extends Drawable.ConstantState {

        /* renamed from: a */
        public rz5 f34655a;

        /* renamed from: b */
        public zn1 f34656b;

        /* renamed from: c */
        public ColorFilter f34657c;

        /* renamed from: d */
        public ColorStateList f34658d = null;

        /* renamed from: e */
        public ColorStateList f34659e = null;

        /* renamed from: f */
        public ColorStateList f34660f = null;

        /* renamed from: g */
        public ColorStateList f34661g = null;

        /* renamed from: h */
        public PorterDuff.Mode f34662h = PorterDuff.Mode.SRC_IN;

        /* renamed from: i */
        public Rect f34663i = null;

        /* renamed from: j */
        public float f34664j = 1.0f;

        /* renamed from: k */
        public float f34665k = 1.0f;

        /* renamed from: l */
        public float f34666l;

        /* renamed from: m */
        public int f34667m = 255;

        /* renamed from: n */
        public float f34668n = Utils.FLOAT_EPSILON;

        /* renamed from: o */
        public float f34669o = Utils.FLOAT_EPSILON;

        /* renamed from: p */
        public float f34670p = Utils.FLOAT_EPSILON;

        /* renamed from: q */
        public int f34671q = 0;

        /* renamed from: r */
        public int f34672r = 0;

        /* renamed from: s */
        public int f34673s = 0;

        /* renamed from: t */
        public int f34674t = 0;

        /* renamed from: u */
        public boolean f34675u = false;

        /* renamed from: v */
        public Paint.Style f34676v = Paint.Style.FILL_AND_STROKE;

        public C6573c(rz5 rz5, zn1 zn1) {
            this.f34655a = rz5;
            this.f34656b = zn1;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            uo3 uo3 = new uo3(this, (C6571a) null);
            boolean unused = uo3.f34647k = true;
            return uo3;
        }

        public C6573c(C6573c cVar) {
            this.f34655a = cVar.f34655a;
            this.f34656b = cVar.f34656b;
            this.f34666l = cVar.f34666l;
            this.f34657c = cVar.f34657c;
            this.f34658d = cVar.f34658d;
            this.f34659e = cVar.f34659e;
            this.f34662h = cVar.f34662h;
            this.f34661g = cVar.f34661g;
            this.f34667m = cVar.f34667m;
            this.f34664j = cVar.f34664j;
            this.f34673s = cVar.f34673s;
            this.f34671q = cVar.f34671q;
            this.f34675u = cVar.f34675u;
            this.f34665k = cVar.f34665k;
            this.f34668n = cVar.f34668n;
            this.f34669o = cVar.f34669o;
            this.f34670p = cVar.f34670p;
            this.f34672r = cVar.f34672r;
            this.f34674t = cVar.f34674t;
            this.f34660f = cVar.f34660f;
            this.f34676v = cVar.f34676v;
            if (cVar.f34663i != null) {
                this.f34663i = new Rect(cVar.f34663i);
            }
        }
    }
}
