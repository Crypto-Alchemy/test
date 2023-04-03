package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: rz5 */
/* compiled from: ShapeAppearanceModel */
public class rz5 {

    /* renamed from: m */
    public static final du0 f33675m = new dc5(0.5f);

    /* renamed from: a */
    public eu0 f33676a;

    /* renamed from: b */
    public eu0 f33677b;

    /* renamed from: c */
    public eu0 f33678c;

    /* renamed from: d */
    public eu0 f33679d;

    /* renamed from: e */
    public du0 f33680e;

    /* renamed from: f */
    public du0 f33681f;

    /* renamed from: g */
    public du0 f33682g;

    /* renamed from: h */
    public du0 f33683h;

    /* renamed from: i */
    public mn1 f33684i;

    /* renamed from: j */
    public mn1 f33685j;

    /* renamed from: k */
    public mn1 f33686k;

    /* renamed from: l */
    public mn1 f33687l;

    /* renamed from: rz5$c */
    /* compiled from: ShapeAppearanceModel */
    public interface C6471c {
        /* renamed from: a */
        du0 mo47612a(du0 du0);
    }

    /* renamed from: a */
    public static C6470b m51446a() {
        return new C6470b();
    }

    /* renamed from: b */
    public static C6470b m51447b(Context context, int i, int i2) {
        return m51448c(context, i, i2, 0);
    }

    /* renamed from: c */
    public static C6470b m51448c(Context context, int i, int i2, int i3) {
        return m51449d(context, i, i2, new C6340p5((float) i3));
    }

    /* renamed from: d */
    public static C6470b m51449d(Context context, int i, int i2, du0 du0) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, u55.ShapeAppearance);
        try {
            int i3 = obtainStyledAttributes.getInt(u55.ShapeAppearance_cornerFamily, 0);
            int i4 = obtainStyledAttributes.getInt(u55.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = obtainStyledAttributes.getInt(u55.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = obtainStyledAttributes.getInt(u55.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = obtainStyledAttributes.getInt(u55.ShapeAppearance_cornerFamilyBottomLeft, i3);
            du0 m = m51453m(obtainStyledAttributes, u55.ShapeAppearance_cornerSize, du0);
            du0 m2 = m51453m(obtainStyledAttributes, u55.ShapeAppearance_cornerSizeTopLeft, m);
            du0 m3 = m51453m(obtainStyledAttributes, u55.ShapeAppearance_cornerSizeTopRight, m);
            du0 m4 = m51453m(obtainStyledAttributes, u55.ShapeAppearance_cornerSizeBottomRight, m);
            return new C6470b().mo47591C(i4, m2).mo47595G(i5, m3).mo47609x(i6, m4).mo47605t(i7, m51453m(obtainStyledAttributes, u55.ShapeAppearance_cornerSizeBottomLeft, m));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static C6470b m51450e(Context context, AttributeSet attributeSet, int i, int i2) {
        return m51451f(context, attributeSet, i, i2, 0);
    }

    /* renamed from: f */
    public static C6470b m51451f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return m51452g(context, attributeSet, i, i2, new C6340p5((float) i3));
    }

    /* renamed from: g */
    public static C6470b m51452g(Context context, AttributeSet attributeSet, int i, int i2, du0 du0) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u55.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(u55.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(u55.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return m51449d(context, resourceId, resourceId2, du0);
    }

    /* renamed from: m */
    public static du0 m51453m(TypedArray typedArray, int i, du0 du0) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return du0;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new C6340p5((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i2 == 6) {
            return new dc5(peekValue.getFraction(1.0f, 1.0f));
        }
        return du0;
    }

    /* renamed from: h */
    public mn1 mo47572h() {
        return this.f33686k;
    }

    /* renamed from: i */
    public eu0 mo47573i() {
        return this.f33679d;
    }

    /* renamed from: j */
    public du0 mo47574j() {
        return this.f33683h;
    }

    /* renamed from: k */
    public eu0 mo47575k() {
        return this.f33678c;
    }

    /* renamed from: l */
    public du0 mo47576l() {
        return this.f33682g;
    }

    /* renamed from: n */
    public mn1 mo47577n() {
        return this.f33687l;
    }

    /* renamed from: o */
    public mn1 mo47578o() {
        return this.f33685j;
    }

    /* renamed from: p */
    public mn1 mo47579p() {
        return this.f33684i;
    }

    /* renamed from: q */
    public eu0 mo47580q() {
        return this.f33676a;
    }

    /* renamed from: r */
    public du0 mo47581r() {
        return this.f33680e;
    }

    /* renamed from: s */
    public eu0 mo47582s() {
        return this.f33677b;
    }

    /* renamed from: t */
    public du0 mo47583t() {
        return this.f33681f;
    }

    /* renamed from: u */
    public boolean mo47584u(RectF rectF) {
        boolean z;
        boolean z2;
        boolean z3;
        Class<mn1> cls = mn1.class;
        if (!this.f33687l.getClass().equals(cls) || !this.f33685j.getClass().equals(cls) || !this.f33684i.getClass().equals(cls) || !this.f33686k.getClass().equals(cls)) {
            z = false;
        } else {
            z = true;
        }
        float a = this.f33680e.mo29529a(rectF);
        if (this.f33681f.mo29529a(rectF) == a && this.f33683h.mo29529a(rectF) == a && this.f33682g.mo29529a(rectF) == a) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(this.f33677b instanceof fi5) || !(this.f33676a instanceof fi5) || !(this.f33678c instanceof fi5) || !(this.f33679d instanceof fi5)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public C6470b mo47585v() {
        return new C6470b(this);
    }

    /* renamed from: w */
    public rz5 mo47586w(float f) {
        return mo47585v().mo47600o(f).mo47599m();
    }

    /* renamed from: x */
    public rz5 mo47587x(du0 du0) {
        return mo47585v().mo47601p(du0).mo47599m();
    }

    /* renamed from: y */
    public rz5 mo47588y(C6471c cVar) {
        return mo47585v().mo47594F(cVar.mo47612a(mo47581r())).mo47598J(cVar.mo47612a(mo47583t())).mo47608w(cVar.mo47612a(mo47574j())).mo47589A(cVar.mo47612a(mo47576l())).mo47599m();
    }

    public rz5(C6470b bVar) {
        this.f33676a = bVar.f33688a;
        this.f33677b = bVar.f33689b;
        this.f33678c = bVar.f33690c;
        this.f33679d = bVar.f33691d;
        this.f33680e = bVar.f33692e;
        this.f33681f = bVar.f33693f;
        this.f33682g = bVar.f33694g;
        this.f33683h = bVar.f33695h;
        this.f33684i = bVar.f33696i;
        this.f33685j = bVar.f33697j;
        this.f33686k = bVar.f33698k;
        this.f33687l = bVar.f33699l;
    }

    /* renamed from: rz5$b */
    /* compiled from: ShapeAppearanceModel */
    public static final class C6470b {

        /* renamed from: a */
        public eu0 f33688a = vo3.m53440b();

        /* renamed from: b */
        public eu0 f33689b = vo3.m53440b();

        /* renamed from: c */
        public eu0 f33690c = vo3.m53440b();

        /* renamed from: d */
        public eu0 f33691d = vo3.m53440b();

        /* renamed from: e */
        public du0 f33692e = new C6340p5(Utils.FLOAT_EPSILON);

        /* renamed from: f */
        public du0 f33693f = new C6340p5(Utils.FLOAT_EPSILON);

        /* renamed from: g */
        public du0 f33694g = new C6340p5(Utils.FLOAT_EPSILON);

        /* renamed from: h */
        public du0 f33695h = new C6340p5(Utils.FLOAT_EPSILON);

        /* renamed from: i */
        public mn1 f33696i = vo3.m53441c();

        /* renamed from: j */
        public mn1 f33697j = vo3.m53441c();

        /* renamed from: k */
        public mn1 f33698k = vo3.m53441c();

        /* renamed from: l */
        public mn1 f33699l = vo3.m53441c();

        public C6470b() {
        }

        /* renamed from: n */
        public static float m51483n(eu0 eu0) {
            if (eu0 instanceof fi5) {
                return ((fi5) eu0).f28883a;
            }
            if (eu0 instanceof az0) {
                return ((az0) eu0).f21093a;
            }
            return -1.0f;
        }

        /* renamed from: A */
        public C6470b mo47589A(du0 du0) {
            this.f33694g = du0;
            return this;
        }

        /* renamed from: B */
        public C6470b mo47590B(mn1 mn1) {
            this.f33696i = mn1;
            return this;
        }

        /* renamed from: C */
        public C6470b mo47591C(int i, du0 du0) {
            return mo47592D(vo3.m53439a(i)).mo47594F(du0);
        }

        /* renamed from: D */
        public C6470b mo47592D(eu0 eu0) {
            this.f33688a = eu0;
            float n = m51483n(eu0);
            if (n != -1.0f) {
                mo47593E(n);
            }
            return this;
        }

        /* renamed from: E */
        public C6470b mo47593E(float f) {
            this.f33692e = new C6340p5(f);
            return this;
        }

        /* renamed from: F */
        public C6470b mo47594F(du0 du0) {
            this.f33692e = du0;
            return this;
        }

        /* renamed from: G */
        public C6470b mo47595G(int i, du0 du0) {
            return mo47596H(vo3.m53439a(i)).mo47598J(du0);
        }

        /* renamed from: H */
        public C6470b mo47596H(eu0 eu0) {
            this.f33689b = eu0;
            float n = m51483n(eu0);
            if (n != -1.0f) {
                mo47597I(n);
            }
            return this;
        }

        /* renamed from: I */
        public C6470b mo47597I(float f) {
            this.f33693f = new C6340p5(f);
            return this;
        }

        /* renamed from: J */
        public C6470b mo47598J(du0 du0) {
            this.f33693f = du0;
            return this;
        }

        /* renamed from: m */
        public rz5 mo47599m() {
            return new rz5(this);
        }

        /* renamed from: o */
        public C6470b mo47600o(float f) {
            return mo47593E(f).mo47597I(f).mo47611z(f).mo47607v(f);
        }

        /* renamed from: p */
        public C6470b mo47601p(du0 du0) {
            return mo47594F(du0).mo47598J(du0).mo47589A(du0).mo47608w(du0);
        }

        /* renamed from: q */
        public C6470b mo47602q(int i, float f) {
            return mo47603r(vo3.m53439a(i)).mo47600o(f);
        }

        /* renamed from: r */
        public C6470b mo47603r(eu0 eu0) {
            return mo47592D(eu0).mo47596H(eu0).mo47610y(eu0).mo47606u(eu0);
        }

        /* renamed from: s */
        public C6470b mo47604s(mn1 mn1) {
            this.f33698k = mn1;
            return this;
        }

        /* renamed from: t */
        public C6470b mo47605t(int i, du0 du0) {
            return mo47606u(vo3.m53439a(i)).mo47608w(du0);
        }

        /* renamed from: u */
        public C6470b mo47606u(eu0 eu0) {
            this.f33691d = eu0;
            float n = m51483n(eu0);
            if (n != -1.0f) {
                mo47607v(n);
            }
            return this;
        }

        /* renamed from: v */
        public C6470b mo47607v(float f) {
            this.f33695h = new C6340p5(f);
            return this;
        }

        /* renamed from: w */
        public C6470b mo47608w(du0 du0) {
            this.f33695h = du0;
            return this;
        }

        /* renamed from: x */
        public C6470b mo47609x(int i, du0 du0) {
            return mo47610y(vo3.m53439a(i)).mo47589A(du0);
        }

        /* renamed from: y */
        public C6470b mo47610y(eu0 eu0) {
            this.f33690c = eu0;
            float n = m51483n(eu0);
            if (n != -1.0f) {
                mo47611z(n);
            }
            return this;
        }

        /* renamed from: z */
        public C6470b mo47611z(float f) {
            this.f33694g = new C6340p5(f);
            return this;
        }

        public C6470b(rz5 rz5) {
            this.f33688a = rz5.f33676a;
            this.f33689b = rz5.f33677b;
            this.f33690c = rz5.f33678c;
            this.f33691d = rz5.f33679d;
            this.f33692e = rz5.f33680e;
            this.f33693f = rz5.f33681f;
            this.f33694g = rz5.f33682g;
            this.f33695h = rz5.f33683h;
            this.f33696i = rz5.f33684i;
            this.f33697j = rz5.f33685j;
            this.f33698k = rz5.f33686k;
            this.f33699l = rz5.f33687l;
        }
    }

    public rz5() {
        this.f33676a = vo3.m53440b();
        this.f33677b = vo3.m53440b();
        this.f33678c = vo3.m53440b();
        this.f33679d = vo3.m53440b();
        this.f33680e = new C6340p5(Utils.FLOAT_EPSILON);
        this.f33681f = new C6340p5(Utils.FLOAT_EPSILON);
        this.f33682g = new C6340p5(Utils.FLOAT_EPSILON);
        this.f33683h = new C6340p5(Utils.FLOAT_EPSILON);
        this.f33684i = vo3.m53441c();
        this.f33685j = vo3.m53441c();
        this.f33686k = vo3.m53441c();
        this.f33687l = vo3.m53441c();
    }
}
