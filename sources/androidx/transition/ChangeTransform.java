package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.github.mikephil.charting.utils.Utils;
import org.xmlpull.v1.XmlPullParser;

public class ChangeTransform extends Transition {

    /* renamed from: A1 */
    public static final String[] f7120A1 = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* renamed from: B1 */
    public static final Property<C1428e, float[]> f7121B1 = new C1424a(float[].class, "nonTranslations");

    /* renamed from: C1 */
    public static final Property<C1428e, PointF> f7122C1 = new C1425b(PointF.class, "translations");

    /* renamed from: D1 */
    public static final boolean f7123D1 = true;

    /* renamed from: x1 */
    public boolean f7124x1 = true;

    /* renamed from: y1 */
    public boolean f7125y1 = true;

    /* renamed from: z1 */
    public Matrix f7126z1 = new Matrix();

    /* renamed from: androidx.transition.ChangeTransform$a */
    public static class C1424a extends Property<C1428e, float[]> {
        public C1424a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public float[] get(C1428e eVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C1428e eVar, float[] fArr) {
            eVar.mo10478d(fArr);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$b */
    public static class C1425b extends Property<C1428e, PointF> {
        public C1425b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C1428e eVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C1428e eVar, PointF pointF) {
            eVar.mo10477c(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$c */
    public class C1426c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f7127a;

        /* renamed from: d */
        public Matrix f7128d = new Matrix();

        /* renamed from: e */
        public final /* synthetic */ boolean f7129e;

        /* renamed from: g */
        public final /* synthetic */ Matrix f7130g;

        /* renamed from: k */
        public final /* synthetic */ View f7131k;

        /* renamed from: r */
        public final /* synthetic */ C1429f f7132r;

        /* renamed from: s */
        public final /* synthetic */ C1428e f7133s;

        public C1426c(boolean z, Matrix matrix, View view, C1429f fVar, C1428e eVar) {
            this.f7129e = z;
            this.f7130g = matrix;
            this.f7131k = view;
            this.f7132r = fVar;
            this.f7133s = eVar;
        }

        /* renamed from: a */
        public final void mo10470a(Matrix matrix) {
            this.f7128d.set(matrix);
            this.f7131k.setTag(e35.transition_transform, this.f7128d);
            this.f7132r.mo10479a(this.f7131k);
        }

        public void onAnimationCancel(Animator animator) {
            this.f7127a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f7127a) {
                if (!this.f7129e || !ChangeTransform.this.f7124x1) {
                    this.f7131k.setTag(e35.transition_transform, (Object) null);
                    this.f7131k.setTag(e35.parent_matrix, (Object) null);
                } else {
                    mo10470a(this.f7130g);
                }
            }
            qe7.m25630f(this.f7131k, (Matrix) null);
            this.f7132r.mo10479a(this.f7131k);
        }

        public void onAnimationPause(Animator animator) {
            mo10470a(this.f7133s.mo10475a());
        }

        public void onAnimationResume(Animator animator) {
            ChangeTransform.m10025z0(this.f7131k);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$d */
    public static class C1427d extends C1459b {

        /* renamed from: a */
        public View f7135a;

        /* renamed from: d */
        public cg2 f7136d;

        public C1427d(View view, cg2 cg2) {
            this.f7135a = view;
            this.f7136d = cg2;
        }

        public void onTransitionEnd(Transition transition) {
            transition.mo10517e0(this);
            gg2.m18064b(this.f7135a);
            this.f7135a.setTag(e35.transition_transform, (Object) null);
            this.f7135a.setTag(e35.parent_matrix, (Object) null);
        }

        public void onTransitionPause(Transition transition) {
            this.f7136d.setVisibility(4);
        }

        public void onTransitionResume(Transition transition) {
            this.f7136d.setVisibility(0);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$e */
    public static class C1428e {

        /* renamed from: a */
        public final Matrix f7137a = new Matrix();

        /* renamed from: b */
        public final View f7138b;

        /* renamed from: c */
        public final float[] f7139c;

        /* renamed from: d */
        public float f7140d;

        /* renamed from: e */
        public float f7141e;

        public C1428e(View view, float[] fArr) {
            this.f7138b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f7139c = fArr2;
            this.f7140d = fArr2[2];
            this.f7141e = fArr2[5];
            mo10476b();
        }

        /* renamed from: a */
        public Matrix mo10475a() {
            return this.f7137a;
        }

        /* renamed from: b */
        public final void mo10476b() {
            float[] fArr = this.f7139c;
            fArr[2] = this.f7140d;
            fArr[5] = this.f7141e;
            this.f7137a.setValues(fArr);
            qe7.m25630f(this.f7138b, this.f7137a);
        }

        /* renamed from: c */
        public void mo10477c(PointF pointF) {
            this.f7140d = pointF.x;
            this.f7141e = pointF.y;
            mo10476b();
        }

        /* renamed from: d */
        public void mo10478d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f7139c, 0, fArr.length);
            mo10476b();
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$f */
    public static class C1429f {

        /* renamed from: a */
        public final float f7142a;

        /* renamed from: b */
        public final float f7143b;

        /* renamed from: c */
        public final float f7144c;

        /* renamed from: d */
        public final float f7145d;

        /* renamed from: e */
        public final float f7146e;

        /* renamed from: f */
        public final float f7147f;

        /* renamed from: g */
        public final float f7148g;

        /* renamed from: h */
        public final float f7149h;

        public C1429f(View view) {
            this.f7142a = view.getTranslationX();
            this.f7143b = view.getTranslationY();
            this.f7144c = ga7.m17735L(view);
            this.f7145d = view.getScaleX();
            this.f7146e = view.getScaleY();
            this.f7147f = view.getRotationX();
            this.f7148g = view.getRotationY();
            this.f7149h = view.getRotation();
        }

        /* renamed from: a */
        public void mo10479a(View view) {
            ChangeTransform.m10024B0(view, this.f7142a, this.f7143b, this.f7144c, this.f7145d, this.f7146e, this.f7147f, this.f7148g, this.f7149h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1429f)) {
                return false;
            }
            C1429f fVar = (C1429f) obj;
            if (fVar.f7142a == this.f7142a && fVar.f7143b == this.f7143b && fVar.f7144c == this.f7144c && fVar.f7145d == this.f7145d && fVar.f7146e == this.f7146e && fVar.f7147f == this.f7147f && fVar.f7148g == this.f7148g && fVar.f7149h == this.f7149h) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            float f = this.f7142a;
            int i8 = 0;
            if (f != Utils.FLOAT_EPSILON) {
                i = Float.floatToIntBits(f);
            } else {
                i = 0;
            }
            int i9 = i * 31;
            float f2 = this.f7143b;
            if (f2 != Utils.FLOAT_EPSILON) {
                i2 = Float.floatToIntBits(f2);
            } else {
                i2 = 0;
            }
            int i10 = (i9 + i2) * 31;
            float f3 = this.f7144c;
            if (f3 != Utils.FLOAT_EPSILON) {
                i3 = Float.floatToIntBits(f3);
            } else {
                i3 = 0;
            }
            int i11 = (i10 + i3) * 31;
            float f4 = this.f7145d;
            if (f4 != Utils.FLOAT_EPSILON) {
                i4 = Float.floatToIntBits(f4);
            } else {
                i4 = 0;
            }
            int i12 = (i11 + i4) * 31;
            float f5 = this.f7146e;
            if (f5 != Utils.FLOAT_EPSILON) {
                i5 = Float.floatToIntBits(f5);
            } else {
                i5 = 0;
            }
            int i13 = (i12 + i5) * 31;
            float f6 = this.f7147f;
            if (f6 != Utils.FLOAT_EPSILON) {
                i6 = Float.floatToIntBits(f6);
            } else {
                i6 = 0;
            }
            int i14 = (i13 + i6) * 31;
            float f7 = this.f7148g;
            if (f7 != Utils.FLOAT_EPSILON) {
                i7 = Float.floatToIntBits(f7);
            } else {
                i7 = 0;
            }
            int i15 = (i14 + i7) * 31;
            float f8 = this.f7149h;
            if (f8 != Utils.FLOAT_EPSILON) {
                i8 = Float.floatToIntBits(f8);
            }
            return i15 + i8;
        }
    }

    public ChangeTransform() {
    }

    /* renamed from: B0 */
    public static void m10024B0(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        ga7.m17734K0(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    /* renamed from: z0 */
    public static void m10025z0(View view) {
        m10024B0(view, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 1.0f, 1.0f, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
    }

    /* renamed from: A0 */
    public final void mo10457A0(bx6 bx6, bx6 bx62) {
        Matrix matrix = (Matrix) bx62.f8291a.get("android:changeTransform:parentMatrix");
        bx62.f8292b.setTag(e35.parent_matrix, matrix);
        Matrix matrix2 = this.f7126z1;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) bx6.f8291a.get("android:changeTransform:matrix");
        if (matrix3 == null) {
            matrix3 = new Matrix();
            bx6.f8291a.put("android:changeTransform:matrix", matrix3);
        }
        matrix3.postConcat((Matrix) bx6.f8291a.get("android:changeTransform:parentMatrix"));
        matrix3.postConcat(matrix2);
    }

    /* renamed from: M */
    public String[] mo10404M() {
        return f7120A1;
    }

    /* renamed from: i */
    public void mo10405i(bx6 bx6) {
        mo10458u0(bx6);
    }

    /* renamed from: m */
    public void mo10406m(bx6 bx6) {
        mo10458u0(bx6);
        if (!f7123D1) {
            ((ViewGroup) bx6.f8292b.getParent()).startViewTransition(bx6.f8292b);
        }
    }

    /* renamed from: t */
    public Animator mo10407t(ViewGroup viewGroup, bx6 bx6, bx6 bx62) {
        boolean z;
        if (bx6 == null || bx62 == null || !bx6.f8291a.containsKey("android:changeTransform:parent") || !bx62.f8291a.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) bx6.f8291a.get("android:changeTransform:parent");
        ViewGroup viewGroup3 = (ViewGroup) bx62.f8291a.get("android:changeTransform:parent");
        if (!this.f7125y1 || mo10461x0(viewGroup2, viewGroup3)) {
            z = false;
        } else {
            z = true;
        }
        Matrix matrix = (Matrix) bx6.f8291a.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            bx6.f8291a.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) bx6.f8291a.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            bx6.f8291a.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z) {
            mo10457A0(bx6, bx62);
        }
        ObjectAnimator w0 = mo10460w0(bx6, bx62, z);
        if (z && w0 != null && this.f7124x1) {
            mo10459v0(viewGroup, bx6, bx62);
        } else if (!f7123D1) {
            viewGroup2.endViewTransition(bx6.f8292b);
        }
        return w0;
    }

    /* renamed from: u0 */
    public final void mo10458u0(bx6 bx6) {
        Matrix matrix;
        View view = bx6.f8292b;
        if (view.getVisibility() != 8) {
            bx6.f8291a.put("android:changeTransform:parent", view.getParent());
            bx6.f8291a.put("android:changeTransform:transforms", new C1429f(view));
            Matrix matrix2 = view.getMatrix();
            if (matrix2 == null || matrix2.isIdentity()) {
                matrix = null;
            } else {
                matrix = new Matrix(matrix2);
            }
            bx6.f8291a.put("android:changeTransform:matrix", matrix);
            if (this.f7125y1) {
                Matrix matrix3 = new Matrix();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                qe7.m25634j(viewGroup, matrix3);
                matrix3.preTranslate((float) (-viewGroup.getScrollX()), (float) (-viewGroup.getScrollY()));
                bx6.f8291a.put("android:changeTransform:parentMatrix", matrix3);
                bx6.f8291a.put("android:changeTransform:intermediateMatrix", view.getTag(e35.transition_transform));
                bx6.f8291a.put("android:changeTransform:intermediateParentMatrix", view.getTag(e35.parent_matrix));
            }
        }
    }

    /* renamed from: v0 */
    public final void mo10459v0(ViewGroup viewGroup, bx6 bx6, bx6 bx62) {
        View view = bx62.f8292b;
        Matrix matrix = new Matrix((Matrix) bx62.f8291a.get("android:changeTransform:parentMatrix"));
        qe7.m25635k(viewGroup, matrix);
        cg2 a = gg2.m18063a(view, viewGroup, matrix);
        if (a != null) {
            a.mo12059a((ViewGroup) bx6.f8291a.get("android:changeTransform:parent"), bx6.f8292b);
            Transition transition = this;
            while (true) {
                Transition transition2 = transition.f7181Q;
                if (transition2 == null) {
                    break;
                }
                transition = transition2;
            }
            transition.mo10510a(new C1427d(view, a));
            if (f7123D1) {
                View view2 = bx6.f8292b;
                if (view2 != bx62.f8292b) {
                    qe7.m25632h(view2, Utils.FLOAT_EPSILON);
                }
                qe7.m25632h(view, 1.0f);
            }
        }
    }

    /* renamed from: w0 */
    public final ObjectAnimator mo10460w0(bx6 bx6, bx6 bx62, boolean z) {
        Matrix matrix = (Matrix) bx6.f8291a.get("android:changeTransform:matrix");
        Matrix matrix2 = (Matrix) bx62.f8291a.get("android:changeTransform:matrix");
        if (matrix == null) {
            matrix = kp3.f14265a;
        }
        if (matrix2 == null) {
            matrix2 = kp3.f14265a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        View view = bx62.f8292b;
        m10025z0(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        C1428e eVar = new C1428e(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar, new PropertyValuesHolder[]{PropertyValuesHolder.ofObject(f7121B1, new p42(new float[9]), new float[][]{fArr, fArr2}), px4.m25198a(f7122C1, mo10495E().mo10399a(fArr[2], fArr[5], fArr2[2], fArr2[5]))});
        C1426c cVar = new C1426c(z, matrix3, view, (C1429f) bx62.f8291a.get("android:changeTransform:transforms"), eVar);
        ofPropertyValuesHolder.addListener(cVar);
        C2688kl.m20816a(ofPropertyValuesHolder, cVar);
        return ofPropertyValuesHolder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r5 == r4.f8292b) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r4 == r5) goto L_0x001e;
     */
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo10461x0(android.view.ViewGroup r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            boolean r0 = r3.mo10504R(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            boolean r0 = r3.mo10504R(r5)
            if (r0 != 0) goto L_0x000f
            goto L_0x001a
        L_0x000f:
            bx6 r4 = r3.mo10493C(r4, r1)
            if (r4 == 0) goto L_0x001f
            android.view.View r4 = r4.f8292b
            if (r5 != r4) goto L_0x001d
            goto L_0x001e
        L_0x001a:
            if (r4 != r5) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = r2
        L_0x001e:
            r2 = r1
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeTransform.mo10461x0(android.view.ViewGroup, android.view.ViewGroup):boolean");
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fc6.f11770g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f7124x1 = e27.m15642a(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f7125y1 = e27.m15642a(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }
}
