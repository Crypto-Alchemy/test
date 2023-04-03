package p000;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.facebook.drawee.generic.RoundingParams;
import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;
import java.util.List;
import p000.xl5;

/* renamed from: hf2 */
/* compiled from: GenericDraweeHierarchyBuilder */
public class hf2 {

    /* renamed from: t */
    public static final xl5.C3616b f12848t = xl5.C3616b.f19900h;

    /* renamed from: u */
    public static final xl5.C3616b f12849u = xl5.C3616b.f19901i;

    /* renamed from: a */
    public Resources f12850a;

    /* renamed from: b */
    public int f12851b;

    /* renamed from: c */
    public float f12852c;

    /* renamed from: d */
    public Drawable f12853d;

    /* renamed from: e */
    public xl5.C3616b f12854e;

    /* renamed from: f */
    public Drawable f12855f;

    /* renamed from: g */
    public xl5.C3616b f12856g;

    /* renamed from: h */
    public Drawable f12857h;

    /* renamed from: i */
    public xl5.C3616b f12858i;

    /* renamed from: j */
    public Drawable f12859j;

    /* renamed from: k */
    public xl5.C3616b f12860k;

    /* renamed from: l */
    public xl5.C3616b f12861l;

    /* renamed from: m */
    public Matrix f12862m;

    /* renamed from: n */
    public PointF f12863n;

    /* renamed from: o */
    public ColorFilter f12864o;

    /* renamed from: p */
    public Drawable f12865p;

    /* renamed from: q */
    public List<Drawable> f12866q;

    /* renamed from: r */
    public Drawable f12867r;

    /* renamed from: s */
    public RoundingParams f12868s;

    public hf2(Resources resources) {
        this.f12850a = resources;
        mo21150t();
    }

    /* renamed from: A */
    public hf2 mo21121A(Drawable drawable) {
        if (drawable == null) {
            this.f12866q = null;
        } else {
            this.f12866q = Arrays.asList(new Drawable[]{drawable});
        }
        return this;
    }

    /* renamed from: B */
    public hf2 mo21122B(Drawable drawable) {
        this.f12853d = drawable;
        return this;
    }

    /* renamed from: C */
    public hf2 mo21123C(xl5.C3616b bVar) {
        this.f12854e = bVar;
        return this;
    }

    /* renamed from: D */
    public hf2 mo21124D(Drawable drawable) {
        if (drawable == null) {
            this.f12867r = null;
        } else {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, drawable);
            this.f12867r = stateListDrawable;
        }
        return this;
    }

    /* renamed from: E */
    public hf2 mo21125E(Drawable drawable) {
        this.f12859j = drawable;
        return this;
    }

    /* renamed from: F */
    public hf2 mo21126F(xl5.C3616b bVar) {
        this.f12860k = bVar;
        return this;
    }

    /* renamed from: G */
    public hf2 mo21127G(Drawable drawable) {
        this.f12855f = drawable;
        return this;
    }

    /* renamed from: H */
    public hf2 mo21128H(xl5.C3616b bVar) {
        this.f12856g = bVar;
        return this;
    }

    /* renamed from: I */
    public hf2 mo21129I(RoundingParams roundingParams) {
        this.f12868s = roundingParams;
        return this;
    }

    /* renamed from: J */
    public final void mo21130J() {
        List<Drawable> list = this.f12866q;
        if (list != null) {
            for (Drawable g : list) {
                au4.m10792g(g);
            }
        }
    }

    /* renamed from: a */
    public gf2 mo21131a() {
        mo21130J();
        return new gf2(this);
    }

    /* renamed from: b */
    public ColorFilter mo21132b() {
        return this.f12864o;
    }

    /* renamed from: c */
    public PointF mo21133c() {
        return this.f12863n;
    }

    /* renamed from: d */
    public xl5.C3616b mo21134d() {
        return this.f12861l;
    }

    /* renamed from: e */
    public Drawable mo21135e() {
        return this.f12865p;
    }

    /* renamed from: f */
    public float mo21136f() {
        return this.f12852c;
    }

    /* renamed from: g */
    public int mo21137g() {
        return this.f12851b;
    }

    /* renamed from: h */
    public Drawable mo21138h() {
        return this.f12857h;
    }

    /* renamed from: i */
    public xl5.C3616b mo21139i() {
        return this.f12858i;
    }

    /* renamed from: j */
    public List<Drawable> mo21140j() {
        return this.f12866q;
    }

    /* renamed from: k */
    public Drawable mo21141k() {
        return this.f12853d;
    }

    /* renamed from: l */
    public xl5.C3616b mo21142l() {
        return this.f12854e;
    }

    /* renamed from: m */
    public Drawable mo21143m() {
        return this.f12867r;
    }

    /* renamed from: n */
    public Drawable mo21144n() {
        return this.f12859j;
    }

    /* renamed from: o */
    public xl5.C3616b mo21145o() {
        return this.f12860k;
    }

    /* renamed from: p */
    public Resources mo21146p() {
        return this.f12850a;
    }

    /* renamed from: q */
    public Drawable mo21147q() {
        return this.f12855f;
    }

    /* renamed from: r */
    public xl5.C3616b mo21148r() {
        return this.f12856g;
    }

    /* renamed from: s */
    public RoundingParams mo21149s() {
        return this.f12868s;
    }

    /* renamed from: t */
    public final void mo21150t() {
        this.f12851b = 300;
        this.f12852c = Utils.FLOAT_EPSILON;
        this.f12853d = null;
        xl5.C3616b bVar = f12848t;
        this.f12854e = bVar;
        this.f12855f = null;
        this.f12856g = bVar;
        this.f12857h = null;
        this.f12858i = bVar;
        this.f12859j = null;
        this.f12860k = bVar;
        this.f12861l = f12849u;
        this.f12862m = null;
        this.f12863n = null;
        this.f12864o = null;
        this.f12865p = null;
        this.f12866q = null;
        this.f12867r = null;
        this.f12868s = null;
    }

    /* renamed from: u */
    public hf2 mo21151u(xl5.C3616b bVar) {
        this.f12861l = bVar;
        this.f12862m = null;
        return this;
    }

    /* renamed from: v */
    public hf2 mo21152v(Drawable drawable) {
        this.f12865p = drawable;
        return this;
    }

    /* renamed from: w */
    public hf2 mo21153w(float f) {
        this.f12852c = f;
        return this;
    }

    /* renamed from: x */
    public hf2 mo21154x(int i) {
        this.f12851b = i;
        return this;
    }

    /* renamed from: y */
    public hf2 mo21155y(Drawable drawable) {
        this.f12857h = drawable;
        return this;
    }

    /* renamed from: z */
    public hf2 mo21156z(xl5.C3616b bVar) {
        this.f12858i = bVar;
        return this;
    }
}
