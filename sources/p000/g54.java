package p000;

import android.view.View;
import android.view.ViewParent;

/* renamed from: g54 */
/* compiled from: NestedScrollingChildHelper */
public class g54 {

    /* renamed from: a */
    public ViewParent f12180a;

    /* renamed from: b */
    public ViewParent f12181b;

    /* renamed from: c */
    public final View f12182c;

    /* renamed from: d */
    public boolean f12183d;

    /* renamed from: e */
    public int[] f12184e;

    public g54(View view) {
        this.f12182c = view;
    }

    /* renamed from: a */
    public boolean mo20368a(float f, float f2, boolean z) {
        ViewParent h;
        if (!mo20379l() || (h = mo20375h(0)) == null) {
            return false;
        }
        return pd7.m24819a(h, this.f12182c, f, f2, z);
    }

    /* renamed from: b */
    public boolean mo20369b(float f, float f2) {
        ViewParent h;
        if (!mo20379l() || (h = mo20375h(0)) == null) {
            return false;
        }
        return pd7.m24820b(h, this.f12182c, f, f2);
    }

    /* renamed from: c */
    public boolean mo20370c(int i, int i2, int[] iArr, int[] iArr2) {
        return mo20371d(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean mo20371d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent h;
        int i4;
        int i5;
        if (!mo20379l() || (h = mo20375h(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.f12182c.getLocationInWindow(iArr2);
                i5 = iArr2[0];
                i4 = iArr2[1];
            } else {
                i5 = 0;
                i4 = 0;
            }
            if (iArr == null) {
                iArr = mo20376i();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            pd7.m24821c(h, this.f12182c, i, i2, iArr, i3);
            if (iArr2 != null) {
                this.f12182c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i5;
                iArr2[1] = iArr2[1] - i4;
            }
            if (iArr[0] == 0 && iArr[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    /* renamed from: e */
    public void mo20372e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        mo20374g(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: f */
    public boolean mo20373f(int i, int i2, int i3, int i4, int[] iArr) {
        return mo20374g(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    /* renamed from: g */
    public final boolean mo20374g(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent h;
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!mo20379l() || (h = mo20375h(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f12182c.getLocationInWindow(iArr4);
            i7 = iArr4[0];
            i6 = iArr4[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            int[] i8 = mo20376i();
            i8[0] = 0;
            i8[1] = 0;
            iArr3 = i8;
        } else {
            iArr3 = iArr2;
        }
        pd7.m24822d(h, this.f12182c, i, i2, i3, i4, i5, iArr3);
        if (iArr4 != null) {
            this.f12182c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i7;
            iArr4[1] = iArr4[1] - i6;
        }
        return true;
    }

    /* renamed from: h */
    public final ViewParent mo20375h(int i) {
        if (i == 0) {
            return this.f12180a;
        }
        if (i != 1) {
            return null;
        }
        return this.f12181b;
    }

    /* renamed from: i */
    public final int[] mo20376i() {
        if (this.f12184e == null) {
            this.f12184e = new int[2];
        }
        return this.f12184e;
    }

    /* renamed from: j */
    public boolean mo20377j() {
        return mo20378k(0);
    }

    /* renamed from: k */
    public boolean mo20378k(int i) {
        if (mo20375h(i) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean mo20379l() {
        return this.f12183d;
    }

    /* renamed from: m */
    public void mo20380m(boolean z) {
        if (this.f12183d) {
            ga7.m17742O0(this.f12182c);
        }
        this.f12183d = z;
    }

    /* renamed from: n */
    public final void mo20381n(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f12180a = viewParent;
        } else if (i == 1) {
            this.f12181b = viewParent;
        }
    }

    /* renamed from: o */
    public boolean mo20382o(int i) {
        return mo20383p(i, 0);
    }

    /* renamed from: p */
    public boolean mo20383p(int i, int i2) {
        if (mo20378k(i2)) {
            return true;
        }
        if (!mo20379l()) {
            return false;
        }
        View view = this.f12182c;
        for (ViewParent parent = this.f12182c.getParent(); parent != null; parent = parent.getParent()) {
            if (pd7.m24824f(parent, view, this.f12182c, i, i2)) {
                mo20381n(i2, parent);
                pd7.m24823e(parent, view, this.f12182c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: q */
    public void mo20384q() {
        mo20385r(0);
    }

    /* renamed from: r */
    public void mo20385r(int i) {
        ViewParent h = mo20375h(i);
        if (h != null) {
            pd7.m24825g(h, this.f12182c, i);
            mo20381n(i, (ViewParent) null);
        }
    }
}
