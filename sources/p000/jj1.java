package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;

/* renamed from: jj1 */
/* compiled from: DrawableContainer */
public class jj1 extends Drawable implements Drawable.Callback {

    /* renamed from: A */
    public long f13620A;

    /* renamed from: B */
    public long f13621B;

    /* renamed from: C */
    public C2606c f13622C;

    /* renamed from: a */
    public C2607d f13623a;

    /* renamed from: d */
    public Rect f13624d;

    /* renamed from: e */
    public Drawable f13625e;

    /* renamed from: g */
    public Drawable f13626g;

    /* renamed from: k */
    public int f13627k = 255;

    /* renamed from: r */
    public boolean f13628r;

    /* renamed from: s */
    public int f13629s = -1;

    /* renamed from: x */
    public boolean f13630x;

    /* renamed from: y */
    public Runnable f13631y;

    /* renamed from: jj1$a */
    /* compiled from: DrawableContainer */
    public class C2604a implements Runnable {
        public C2604a() {
        }

        public void run() {
            jj1.this.mo21860a(true);
            jj1.this.invalidateSelf();
        }
    }

    /* renamed from: jj1$b */
    /* compiled from: DrawableContainer */
    public static class C2605b {
        /* renamed from: a */
        public static boolean m20150a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        /* renamed from: b */
        public static void m20151b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        /* renamed from: c */
        public static Resources m20152c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* renamed from: jj1$c */
    /* compiled from: DrawableContainer */
    public static class C2606c implements Drawable.Callback {

        /* renamed from: a */
        public Drawable.Callback f13633a;

        /* renamed from: a */
        public Drawable.Callback mo21904a() {
            Drawable.Callback callback = this.f13633a;
            this.f13633a = null;
            return callback;
        }

        /* renamed from: b */
        public C2606c mo21905b(Drawable.Callback callback) {
            this.f13633a = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f13633a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f13633a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: jj1$d */
    /* compiled from: DrawableContainer */
    public static abstract class C2607d extends Drawable.ConstantState {

        /* renamed from: A */
        public int f13634A = 0;

        /* renamed from: B */
        public int f13635B = 0;

        /* renamed from: C */
        public boolean f13636C;

        /* renamed from: D */
        public ColorFilter f13637D;

        /* renamed from: E */
        public boolean f13638E;

        /* renamed from: F */
        public ColorStateList f13639F;

        /* renamed from: G */
        public PorterDuff.Mode f13640G;

        /* renamed from: H */
        public boolean f13641H;

        /* renamed from: I */
        public boolean f13642I;

        /* renamed from: a */
        public final jj1 f13643a;

        /* renamed from: b */
        public Resources f13644b;

        /* renamed from: c */
        public int f13645c;

        /* renamed from: d */
        public int f13646d;

        /* renamed from: e */
        public int f13647e;

        /* renamed from: f */
        public SparseArray<Drawable.ConstantState> f13648f;

        /* renamed from: g */
        public Drawable[] f13649g;

        /* renamed from: h */
        public int f13650h;

        /* renamed from: i */
        public boolean f13651i = false;

        /* renamed from: j */
        public boolean f13652j;

        /* renamed from: k */
        public Rect f13653k;

        /* renamed from: l */
        public boolean f13654l = false;

        /* renamed from: m */
        public boolean f13655m;

        /* renamed from: n */
        public int f13656n;

        /* renamed from: o */
        public int f13657o;

        /* renamed from: p */
        public int f13658p;

        /* renamed from: q */
        public int f13659q;

        /* renamed from: r */
        public boolean f13660r;

        /* renamed from: s */
        public int f13661s;

        /* renamed from: t */
        public boolean f13662t;

        /* renamed from: u */
        public boolean f13663u;

        /* renamed from: v */
        public boolean f13664v;

        /* renamed from: w */
        public boolean f13665w;

        /* renamed from: x */
        public boolean f13666x = true;

        /* renamed from: y */
        public boolean f13667y;

        /* renamed from: z */
        public int f13668z;

        public C2607d(C2607d dVar, jj1 jj1, Resources resources) {
            Resources resources2;
            int i;
            this.f13643a = jj1;
            Rect rect = null;
            if (resources != null) {
                resources2 = resources;
            } else if (dVar != null) {
                resources2 = dVar.f13644b;
            } else {
                resources2 = null;
            }
            this.f13644b = resources2;
            if (dVar != null) {
                i = dVar.f13645c;
            } else {
                i = 0;
            }
            int f = jj1.m20141f(resources, i);
            this.f13645c = f;
            if (dVar != null) {
                this.f13646d = dVar.f13646d;
                this.f13647e = dVar.f13647e;
                this.f13664v = true;
                this.f13665w = true;
                this.f13651i = dVar.f13651i;
                this.f13654l = dVar.f13654l;
                this.f13666x = dVar.f13666x;
                this.f13667y = dVar.f13667y;
                this.f13668z = dVar.f13668z;
                this.f13634A = dVar.f13634A;
                this.f13635B = dVar.f13635B;
                this.f13636C = dVar.f13636C;
                this.f13637D = dVar.f13637D;
                this.f13638E = dVar.f13638E;
                this.f13639F = dVar.f13639F;
                this.f13640G = dVar.f13640G;
                this.f13641H = dVar.f13641H;
                this.f13642I = dVar.f13642I;
                if (dVar.f13645c == f) {
                    if (dVar.f13652j) {
                        this.f13653k = dVar.f13653k != null ? new Rect(dVar.f13653k) : rect;
                        this.f13652j = true;
                    }
                    if (dVar.f13655m) {
                        this.f13656n = dVar.f13656n;
                        this.f13657o = dVar.f13657o;
                        this.f13658p = dVar.f13658p;
                        this.f13659q = dVar.f13659q;
                        this.f13655m = true;
                    }
                }
                if (dVar.f13660r) {
                    this.f13661s = dVar.f13661s;
                    this.f13660r = true;
                }
                if (dVar.f13662t) {
                    this.f13663u = dVar.f13663u;
                    this.f13662t = true;
                }
                Drawable[] drawableArr = dVar.f13649g;
                this.f13649g = new Drawable[drawableArr.length];
                this.f13650h = dVar.f13650h;
                SparseArray<Drawable.ConstantState> sparseArray = dVar.f13648f;
                if (sparseArray != null) {
                    this.f13648f = sparseArray.clone();
                } else {
                    this.f13648f = new SparseArray<>(this.f13650h);
                }
                int i2 = this.f13650h;
                for (int i3 = 0; i3 < i2; i3++) {
                    Drawable drawable = drawableArr[i3];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f13648f.put(i3, constantState);
                        } else {
                            this.f13649g[i3] = drawableArr[i3];
                        }
                    }
                }
                return;
            }
            this.f13649g = new Drawable[10];
            this.f13650h = 0;
        }

        /* renamed from: a */
        public final int mo21909a(Drawable drawable) {
            int i = this.f13650h;
            if (i >= this.f13649g.length) {
                mo21925o(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f13643a);
            this.f13649g[i] = drawable;
            this.f13650h++;
            this.f13647e = drawable.getChangingConfigurations() | this.f13647e;
            mo21926p();
            this.f13653k = null;
            this.f13652j = false;
            this.f13655m = false;
            this.f13664v = false;
            return i;
        }

        /* renamed from: b */
        public final void mo21910b(Resources.Theme theme) {
            if (theme != null) {
                mo21914e();
                int i = this.f13650h;
                Drawable[] drawableArr = this.f13649g;
                for (int i2 = 0; i2 < i; i2++) {
                    Drawable drawable = drawableArr[i2];
                    if (drawable != null && ij1.m19643b(drawable)) {
                        ij1.m19642a(drawableArr[i2], theme);
                        this.f13647e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                mo21935y(C2605b.m20152c(theme));
            }
        }

        /* renamed from: c */
        public boolean mo21911c() {
            if (this.f13664v) {
                return this.f13665w;
            }
            mo21914e();
            this.f13664v = true;
            int i = this.f13650h;
            Drawable[] drawableArr = this.f13649g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f13665w = false;
                    return false;
                }
            }
            this.f13665w = true;
            return true;
        }

        public boolean canApplyTheme() {
            int i = this.f13650h;
            Drawable[] drawableArr = this.f13649g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f13648f.get(i2);
                    if (constantState != null && C2605b.m20150a(constantState)) {
                        return true;
                    }
                } else if (ij1.m19643b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public void mo21913d() {
            this.f13655m = true;
            mo21914e();
            int i = this.f13650h;
            Drawable[] drawableArr = this.f13649g;
            this.f13657o = -1;
            this.f13656n = -1;
            this.f13659q = 0;
            this.f13658p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f13656n) {
                    this.f13656n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f13657o) {
                    this.f13657o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f13658p) {
                    this.f13658p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f13659q) {
                    this.f13659q = minimumHeight;
                }
            }
        }

        /* renamed from: e */
        public final void mo21914e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f13648f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f13649g[this.f13648f.keyAt(i)] = mo21929s(this.f13648f.valueAt(i).newDrawable(this.f13644b));
                }
                this.f13648f = null;
            }
        }

        /* renamed from: f */
        public final int mo21915f() {
            return this.f13649g.length;
        }

        /* renamed from: g */
        public final Drawable mo21916g(int i) {
            int indexOfKey;
            Drawable drawable = this.f13649g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f13648f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable s = mo21929s(this.f13648f.valueAt(indexOfKey).newDrawable(this.f13644b));
            this.f13649g[i] = s;
            this.f13648f.removeAt(indexOfKey);
            if (this.f13648f.size() == 0) {
                this.f13648f = null;
            }
            return s;
        }

        public int getChangingConfigurations() {
            return this.f13646d | this.f13647e;
        }

        /* renamed from: h */
        public final int mo21918h() {
            return this.f13650h;
        }

        /* renamed from: i */
        public final int mo21919i() {
            if (!this.f13655m) {
                mo21913d();
            }
            return this.f13657o;
        }

        /* renamed from: j */
        public final int mo21920j() {
            if (!this.f13655m) {
                mo21913d();
            }
            return this.f13659q;
        }

        /* renamed from: k */
        public final int mo21921k() {
            if (!this.f13655m) {
                mo21913d();
            }
            return this.f13658p;
        }

        /* renamed from: l */
        public final Rect mo21922l() {
            Rect rect = null;
            if (this.f13651i) {
                return null;
            }
            Rect rect2 = this.f13653k;
            if (rect2 != null || this.f13652j) {
                return rect2;
            }
            mo21914e();
            Rect rect3 = new Rect();
            int i = this.f13650h;
            Drawable[] drawableArr = this.f13649g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect3.left;
                    if (i3 > rect.left) {
                        rect.left = i3;
                    }
                    int i4 = rect3.top;
                    if (i4 > rect.top) {
                        rect.top = i4;
                    }
                    int i5 = rect3.right;
                    if (i5 > rect.right) {
                        rect.right = i5;
                    }
                    int i6 = rect3.bottom;
                    if (i6 > rect.bottom) {
                        rect.bottom = i6;
                    }
                }
            }
            this.f13652j = true;
            this.f13653k = rect;
            return rect;
        }

        /* renamed from: m */
        public final int mo21923m() {
            if (!this.f13655m) {
                mo21913d();
            }
            return this.f13656n;
        }

        /* renamed from: n */
        public final int mo21924n() {
            int i;
            if (this.f13660r) {
                return this.f13661s;
            }
            mo21914e();
            int i2 = this.f13650h;
            Drawable[] drawableArr = this.f13649g;
            if (i2 > 0) {
                i = drawableArr[0].getOpacity();
            } else {
                i = -2;
            }
            for (int i3 = 1; i3 < i2; i3++) {
                i = Drawable.resolveOpacity(i, drawableArr[i3].getOpacity());
            }
            this.f13661s = i;
            this.f13660r = true;
            return i;
        }

        /* renamed from: o */
        public void mo21925o(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.f13649g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.f13649g = drawableArr;
        }

        /* renamed from: p */
        public void mo21926p() {
            this.f13660r = false;
            this.f13662t = false;
        }

        /* renamed from: q */
        public final boolean mo21927q() {
            return this.f13654l;
        }

        /* renamed from: r */
        public abstract void mo21928r();

        /* renamed from: s */
        public final Drawable mo21929s(Drawable drawable) {
            ij1.m19654m(drawable, this.f13668z);
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f13643a);
            return mutate;
        }

        /* renamed from: t */
        public final void mo21930t(boolean z) {
            this.f13654l = z;
        }

        /* renamed from: u */
        public final void mo21931u(int i) {
            this.f13634A = i;
        }

        /* renamed from: v */
        public final void mo21932v(int i) {
            this.f13635B = i;
        }

        /* renamed from: w */
        public final boolean mo21933w(int i, int i2) {
            int i3 = this.f13650h;
            Drawable[] drawableArr = this.f13649g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    boolean m = ij1.m19654m(drawable, i);
                    if (i4 == i2) {
                        z = m;
                    }
                }
            }
            this.f13668z = i;
            return z;
        }

        /* renamed from: x */
        public final void mo21934x(boolean z) {
            this.f13651i = z;
        }

        /* renamed from: y */
        public final void mo21935y(Resources resources) {
            if (resources != null) {
                this.f13644b = resources;
                int f = jj1.m20141f(resources, this.f13645c);
                int i = this.f13645c;
                this.f13645c = f;
                if (i != f) {
                    this.f13655m = false;
                    this.f13652j = false;
                }
            }
        }
    }

    /* renamed from: f */
    public static int m20141f(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo21860a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f13628r = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f13625e
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0036
            long r9 = r13.f13620A
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0038
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f13627k
            r3.setAlpha(r9)
            r13.f13620A = r7
            goto L_0x0038
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            jj1$d r10 = r13.f13623a
            int r10 = r10.f13634A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f13627k
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L_0x0039
        L_0x0036:
            r13.f13620A = r7
        L_0x0038:
            r3 = r6
        L_0x0039:
            android.graphics.drawable.Drawable r9 = r13.f13626g
            if (r9 == 0) goto L_0x0061
            long r10 = r13.f13621B
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0063
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0050
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f13626g = r0
            r13.f13621B = r7
            goto L_0x0063
        L_0x0050:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            jj1$d r4 = r13.f13623a
            int r4 = r4.f13635B
            int r3 = r3 / r4
            int r4 = r13.f13627k
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0064
        L_0x0061:
            r13.f13621B = r7
        L_0x0063:
            r0 = r3
        L_0x0064:
            if (r14 == 0) goto L_0x0070
            if (r0 == 0) goto L_0x0070
            java.lang.Runnable r14 = r13.f13631y
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.jj1.mo21860a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        this.f13623a.mo21910b(theme);
    }

    /* renamed from: b */
    public C2607d mo21862b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo21863c() {
        return this.f13629s;
    }

    public boolean canApplyTheme() {
        return this.f13623a.canApplyTheme();
    }

    /* renamed from: d */
    public final void mo21865d(Drawable drawable) {
        if (this.f13622C == null) {
            this.f13622C = new C2606c();
        }
        drawable.setCallback(this.f13622C.mo21905b(drawable.getCallback()));
        try {
            if (this.f13623a.f13634A <= 0 && this.f13628r) {
                drawable.setAlpha(this.f13627k);
            }
            C2607d dVar = this.f13623a;
            if (dVar.f13638E) {
                drawable.setColorFilter(dVar.f13637D);
            } else {
                if (dVar.f13641H) {
                    ij1.m19656o(drawable, dVar.f13639F);
                }
                C2607d dVar2 = this.f13623a;
                if (dVar2.f13642I) {
                    ij1.m19657p(drawable, dVar2.f13640G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f13623a.f13666x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            ij1.m19654m(drawable, ij1.m19647f(this));
            ij1.m19651j(drawable, this.f13623a.f13636C);
            Rect rect = this.f13624d;
            if (rect != null) {
                ij1.m19653l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f13622C.mo21904a());
        }
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f13625e;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f13626g;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* renamed from: e */
    public final boolean mo21867e() {
        if (!isAutoMirrored() || ij1.m19647f(this) != 1) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo21868g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f13629s
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            jj1$d r0 = r9.f13623a
            int r0 = r0.f13635B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f13626g
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f13625e
            if (r0 == 0) goto L_0x0029
            r9.f13626g = r0
            jj1$d r0 = r9.f13623a
            int r0 = r0.f13635B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f13621B = r0
            goto L_0x0035
        L_0x0029:
            r9.f13626g = r4
            r9.f13621B = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f13625e
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            jj1$d r0 = r9.f13623a
            int r1 = r0.f13650h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.mo21916g(r10)
            r9.f13625e = r0
            r9.f13629s = r10
            if (r0 == 0) goto L_0x005a
            jj1$d r10 = r9.f13623a
            int r10 = r10.f13634A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f13620A = r2
        L_0x0051:
            r9.mo21865d(r0)
            goto L_0x005a
        L_0x0055:
            r9.f13625e = r4
            r10 = -1
            r9.f13629s = r10
        L_0x005a:
            long r0 = r9.f13620A
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L_0x0067
            long r1 = r9.f13621B
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r10 = r9.f13631y
            if (r10 != 0) goto L_0x0073
            jj1$a r10 = new jj1$a
            r10.<init>()
            r9.f13631y = r10
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r10)
        L_0x0076:
            r9.mo21860a(r0)
        L_0x0079:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.jj1.mo21868g(int):boolean");
    }

    public int getAlpha() {
        return this.f13627k;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f13623a.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f13623a.mo21911c()) {
            return null;
        }
        this.f13623a.f13646d = getChangingConfigurations();
        return this.f13623a;
    }

    public Drawable getCurrent() {
        return this.f13625e;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f13624d;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f13623a.mo21927q()) {
            return this.f13623a.mo21919i();
        }
        Drawable drawable = this.f13625e;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f13623a.mo21927q()) {
            return this.f13623a.mo21923m();
        }
        Drawable drawable = this.f13625e;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f13623a.mo21927q()) {
            return this.f13623a.mo21920j();
        }
        Drawable drawable = this.f13625e;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f13623a.mo21927q()) {
            return this.f13623a.mo21921k();
        }
        Drawable drawable = this.f13625e;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f13625e;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f13623a.mo21924n();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f13625e;
        if (drawable != null) {
            C2605b.m20151b(drawable, outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect l = this.f13623a.mo21922l();
        if (l != null) {
            rect.set(l);
            if ((l.right | l.left | l.top | l.bottom) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            Drawable drawable = this.f13625e;
            if (drawable != null) {
                z = drawable.getPadding(rect);
            } else {
                z = super.getPadding(rect);
            }
        }
        if (mo21867e()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    /* renamed from: h */
    public void mo21881h(C2607d dVar) {
        this.f13623a = dVar;
        int i = this.f13629s;
        if (i >= 0) {
            Drawable g = dVar.mo21916g(i);
            this.f13625e = g;
            if (g != null) {
                mo21865d(g);
            }
        }
        this.f13626g = null;
    }

    /* renamed from: i */
    public final void mo21882i(Resources resources) {
        this.f13623a.mo21935y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        C2607d dVar = this.f13623a;
        if (dVar != null) {
            dVar.mo21926p();
        }
        if (drawable == this.f13625e && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f13623a.f13636C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f13626g;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f13626g = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f13625e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f13628r) {
                this.f13625e.setAlpha(this.f13627k);
            }
        }
        if (this.f13621B != 0) {
            this.f13621B = 0;
            z = true;
        }
        if (this.f13620A != 0) {
            this.f13620A = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f13630x && super.mutate() == this) {
            C2607d b = mo21862b();
            b.mo21928r();
            mo21881h(b);
            this.f13630x = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f13626g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f13625e;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f13623a.mo21933w(i, mo21863c());
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.f13626g;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f13625e;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f13626g;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f13625e;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f13625e && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f13628r || this.f13627k != i) {
            this.f13628r = true;
            this.f13627k = i;
            Drawable drawable = this.f13625e;
            if (drawable == null) {
                return;
            }
            if (this.f13620A == 0) {
                drawable.setAlpha(i);
            } else {
                mo21860a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        C2607d dVar = this.f13623a;
        if (dVar.f13636C != z) {
            dVar.f13636C = z;
            Drawable drawable = this.f13625e;
            if (drawable != null) {
                ij1.m19651j(drawable, z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C2607d dVar = this.f13623a;
        dVar.f13638E = true;
        if (dVar.f13637D != colorFilter) {
            dVar.f13637D = colorFilter;
            Drawable drawable = this.f13625e;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        C2607d dVar = this.f13623a;
        if (dVar.f13666x != z) {
            dVar.f13666x = z;
            Drawable drawable = this.f13625e;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f13625e;
        if (drawable != null) {
            ij1.m19652k(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f13624d;
        if (rect == null) {
            this.f13624d = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f13625e;
        if (drawable != null) {
            ij1.m19653l(drawable, i, i2, i3, i4);
        }
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        C2607d dVar = this.f13623a;
        dVar.f13641H = true;
        if (dVar.f13639F != colorStateList) {
            dVar.f13639F = colorStateList;
            ij1.m19656o(this.f13625e, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C2607d dVar = this.f13623a;
        dVar.f13642I = true;
        if (dVar.f13640G != mode) {
            dVar.f13640G = mode;
            ij1.m19657p(this.f13625e, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f13626g;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f13625e;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f13625e && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
