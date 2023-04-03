package com.alexvasilkov.gestures;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.github.mikephil.charting.utils.Utils;

public class Settings {

    /* renamed from: A */
    public long f8574A = 200;

    /* renamed from: a */
    public int f8575a;

    /* renamed from: b */
    public int f8576b;

    /* renamed from: c */
    public int f8577c;

    /* renamed from: d */
    public int f8578d;

    /* renamed from: e */
    public boolean f8579e;

    /* renamed from: f */
    public int f8580f;

    /* renamed from: g */
    public int f8581g;

    /* renamed from: h */
    public float f8582h = Utils.FLOAT_EPSILON;

    /* renamed from: i */
    public float f8583i = 2.0f;

    /* renamed from: j */
    public float f8584j = -1.0f;

    /* renamed from: k */
    public float f8585k = 2.0f;

    /* renamed from: l */
    public float f8586l;

    /* renamed from: m */
    public float f8587m;

    /* renamed from: n */
    public boolean f8588n = false;

    /* renamed from: o */
    public int f8589o = 17;

    /* renamed from: p */
    public Fit f8590p = Fit.INSIDE;

    /* renamed from: q */
    public Bounds f8591q = Bounds.NORMAL;

    /* renamed from: r */
    public boolean f8592r = true;

    /* renamed from: s */
    public boolean f8593s = true;

    /* renamed from: t */
    public boolean f8594t = true;

    /* renamed from: u */
    public boolean f8595u = false;

    /* renamed from: v */
    public boolean f8596v = false;

    /* renamed from: w */
    public boolean f8597w = true;

    /* renamed from: x */
    public ExitType f8598x = ExitType.ALL;

    /* renamed from: y */
    public int f8599y;

    /* renamed from: z */
    public int f8600z;

    public enum Bounds {
        NORMAL,
        INSIDE,
        OUTSIDE,
        PIVOT,
        NONE
    }

    public enum ExitType {
        ALL,
        SCROLL,
        ZOOM,
        NONE
    }

    public enum Fit {
        HORIZONTAL,
        VERTICAL,
        INSIDE,
        OUTSIDE,
        NONE
    }

    /* renamed from: A */
    public boolean mo12235A() {
        if (mo12257h() != ExitType.NONE) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public boolean mo12236B() {
        return this.f8588n;
    }

    /* renamed from: C */
    public boolean mo12237C() {
        if (!mo12238D() || !this.f8593s) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public boolean mo12238D() {
        if (this.f8599y <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public boolean mo12239E() {
        if (!mo12238D() || !this.f8592r) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    public boolean mo12240F() {
        if (this.f8600z <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public boolean mo12241G() {
        return this.f8596v;
    }

    /* renamed from: H */
    public boolean mo12242H() {
        if (!mo12238D() || !this.f8595u) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    public boolean mo12243I() {
        if (!mo12238D() || !this.f8594t) {
            return false;
        }
        return true;
    }

    /* renamed from: J */
    public Settings mo12244J(boolean z) {
        this.f8588n = z;
        return this;
    }

    /* renamed from: K */
    public Settings mo12245K(Fit fit) {
        this.f8590p = fit;
        return this;
    }

    /* renamed from: L */
    public Settings mo12246L(boolean z) {
        this.f8593s = z;
        return this;
    }

    /* renamed from: M */
    public Settings mo12247M(int i, int i2) {
        this.f8580f = i;
        this.f8581g = i2;
        return this;
    }

    /* renamed from: N */
    public Settings mo12248N(int i, int i2) {
        this.f8579e = true;
        this.f8577c = i;
        this.f8578d = i2;
        return this;
    }

    /* renamed from: O */
    public Settings mo12249O(int i, int i2) {
        this.f8575a = i;
        this.f8576b = i2;
        return this;
    }

    /* renamed from: a */
    public Settings mo12250a() {
        this.f8600z++;
        return this;
    }

    /* renamed from: b */
    public Settings mo12251b() {
        this.f8599y++;
        return this;
    }

    /* renamed from: c */
    public Settings mo12252c() {
        this.f8600z--;
        return this;
    }

    /* renamed from: d */
    public Settings mo12253d() {
        this.f8599y--;
        return this;
    }

    /* renamed from: e */
    public long mo12254e() {
        return this.f8574A;
    }

    /* renamed from: f */
    public Bounds mo12255f() {
        return this.f8591q;
    }

    /* renamed from: g */
    public float mo12256g() {
        return this.f8584j;
    }

    /* renamed from: h */
    public ExitType mo12257h() {
        if (mo12238D()) {
            return this.f8598x;
        }
        return ExitType.NONE;
    }

    /* renamed from: i */
    public Fit mo12258i() {
        return this.f8590p;
    }

    /* renamed from: j */
    public int mo12259j() {
        return this.f8589o;
    }

    /* renamed from: k */
    public int mo12260k() {
        return this.f8581g;
    }

    /* renamed from: l */
    public int mo12261l() {
        return this.f8580f;
    }

    /* renamed from: m */
    public float mo12262m() {
        return this.f8583i;
    }

    /* renamed from: n */
    public float mo12263n() {
        return this.f8582h;
    }

    /* renamed from: o */
    public int mo12264o() {
        if (this.f8579e) {
            return this.f8578d;
        }
        return this.f8576b;
    }

    /* renamed from: p */
    public int mo12265p() {
        if (this.f8579e) {
            return this.f8577c;
        }
        return this.f8575a;
    }

    /* renamed from: q */
    public float mo12266q() {
        return this.f8586l;
    }

    /* renamed from: r */
    public float mo12267r() {
        return this.f8587m;
    }

    /* renamed from: s */
    public float mo12268s() {
        return this.f8585k;
    }

    /* renamed from: t */
    public int mo12269t() {
        return this.f8576b;
    }

    /* renamed from: u */
    public int mo12270u() {
        return this.f8575a;
    }

    /* renamed from: v */
    public boolean mo12271v() {
        if (this.f8580f == 0 || this.f8581g == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public boolean mo12272w() {
        if (this.f8575a == 0 || this.f8576b == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public void mo12273x(Context context, AttributeSet attributeSet) {
        boolean z;
        ExitType exitType;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n55.GestureView);
            this.f8577c = obtainStyledAttributes.getDimensionPixelSize(n55.GestureView_gest_movementAreaWidth, this.f8577c);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(n55.GestureView_gest_movementAreaHeight, this.f8578d);
            this.f8578d = dimensionPixelSize;
            if (this.f8577c <= 0 || dimensionPixelSize <= 0) {
                z = false;
            } else {
                z = true;
            }
            this.f8579e = z;
            this.f8582h = obtainStyledAttributes.getFloat(n55.GestureView_gest_minZoom, this.f8582h);
            this.f8583i = obtainStyledAttributes.getFloat(n55.GestureView_gest_maxZoom, this.f8583i);
            this.f8584j = obtainStyledAttributes.getFloat(n55.GestureView_gest_doubleTapZoom, this.f8584j);
            this.f8585k = obtainStyledAttributes.getFloat(n55.GestureView_gest_overzoomFactor, this.f8585k);
            this.f8586l = obtainStyledAttributes.getDimension(n55.GestureView_gest_overscrollX, this.f8586l);
            this.f8587m = obtainStyledAttributes.getDimension(n55.GestureView_gest_overscrollY, this.f8587m);
            this.f8588n = obtainStyledAttributes.getBoolean(n55.GestureView_gest_fillViewport, this.f8588n);
            this.f8589o = obtainStyledAttributes.getInt(n55.GestureView_gest_gravity, this.f8589o);
            this.f8590p = Fit.values()[obtainStyledAttributes.getInteger(n55.GestureView_gest_fitMethod, this.f8590p.ordinal())];
            this.f8591q = Bounds.values()[obtainStyledAttributes.getInteger(n55.GestureView_gest_boundsType, this.f8591q.ordinal())];
            this.f8592r = obtainStyledAttributes.getBoolean(n55.GestureView_gest_panEnabled, this.f8592r);
            this.f8593s = obtainStyledAttributes.getBoolean(n55.GestureView_gest_flingEnabled, this.f8593s);
            this.f8594t = obtainStyledAttributes.getBoolean(n55.GestureView_gest_zoomEnabled, this.f8594t);
            this.f8595u = obtainStyledAttributes.getBoolean(n55.GestureView_gest_rotationEnabled, this.f8595u);
            this.f8596v = obtainStyledAttributes.getBoolean(n55.GestureView_gest_restrictRotation, this.f8596v);
            this.f8597w = obtainStyledAttributes.getBoolean(n55.GestureView_gest_doubleTapEnabled, this.f8597w);
            if (obtainStyledAttributes.getBoolean(n55.GestureView_gest_exitEnabled, true)) {
                exitType = this.f8598x;
            } else {
                exitType = ExitType.NONE;
            }
            this.f8598x = exitType;
            this.f8574A = (long) obtainStyledAttributes.getInt(n55.GestureView_gest_animationDuration, (int) this.f8574A);
            if (obtainStyledAttributes.getBoolean(n55.GestureView_gest_disableGestures, false)) {
                mo12251b();
            }
            if (obtainStyledAttributes.getBoolean(n55.GestureView_gest_disableBounds, false)) {
                mo12250a();
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: y */
    public boolean mo12274y() {
        if (!mo12238D() || !this.f8597w) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public boolean mo12275z() {
        if (!mo12238D() || (!this.f8592r && !this.f8594t && !this.f8595u && !this.f8597w)) {
            return false;
        }
        return true;
    }
}
