package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.github.mikephil.charting.utils.Utils;
import java.util.Map;

public class ChangeBounds extends Transition {

    /* renamed from: A1 */
    public static final String[] f7075A1 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: B1 */
    public static final Property<Drawable, PointF> f7076B1 = new C1410b(PointF.class, "boundsOrigin");

    /* renamed from: C1 */
    public static final Property<C1419k, PointF> f7077C1 = new C1411c(PointF.class, "topLeft");

    /* renamed from: D1 */
    public static final Property<C1419k, PointF> f7078D1 = new C1412d(PointF.class, "bottomRight");

    /* renamed from: E1 */
    public static final Property<View, PointF> f7079E1 = new C1413e(PointF.class, "bottomRight");

    /* renamed from: F1 */
    public static final Property<View, PointF> f7080F1 = new C1414f(PointF.class, "topLeft");

    /* renamed from: G1 */
    public static final Property<View, PointF> f7081G1 = new C1415g(PointF.class, "position");

    /* renamed from: H1 */
    public static b95 f7082H1 = new b95();

    /* renamed from: x1 */
    public int[] f7083x1 = new int[2];

    /* renamed from: y1 */
    public boolean f7084y1 = false;

    /* renamed from: z1 */
    public boolean f7085z1 = false;

    /* renamed from: androidx.transition.ChangeBounds$a */
    public class C1409a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f7086a;

        /* renamed from: d */
        public final /* synthetic */ BitmapDrawable f7087d;

        /* renamed from: e */
        public final /* synthetic */ View f7088e;

        /* renamed from: g */
        public final /* synthetic */ float f7089g;

        public C1409a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f7086a = viewGroup;
            this.f7087d = bitmapDrawable;
            this.f7088e = view;
            this.f7089g = f;
        }

        public void onAnimationEnd(Animator animator) {
            qe7.m25626b(this.f7086a).mo19231b(this.f7087d);
            qe7.m25632h(this.f7088e, this.f7089g);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$b */
    public static class C1410b extends Property<Drawable, PointF> {

        /* renamed from: a */
        public Rect f7091a = new Rect();

        public C1410b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f7091a);
            Rect rect = this.f7091a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f7091a);
            this.f7091a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f7091a);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$c */
    public static class C1411c extends Property<C1419k, PointF> {
        public C1411c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C1419k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C1419k kVar, PointF pointF) {
            kVar.mo10444c(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$d */
    public static class C1412d extends Property<C1419k, PointF> {
        public C1412d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C1419k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C1419k kVar, PointF pointF) {
            kVar.mo10442a(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$e */
    public static class C1413e extends Property<View, PointF> {
        public C1413e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            qe7.m25631g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$f */
    public static class C1414f extends Property<View, PointF> {
        public C1414f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            qe7.m25631g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$g */
    public static class C1415g extends Property<View, PointF> {
        public C1415g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            qe7.m25631g(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$h */
    public class C1416h extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C1419k f7092a;
        private C1419k mViewBounds;

        public C1416h(C1419k kVar) {
            this.f7092a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$i */
    public class C1417i extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f7094a;

        /* renamed from: d */
        public final /* synthetic */ View f7095d;

        /* renamed from: e */
        public final /* synthetic */ Rect f7096e;

        /* renamed from: g */
        public final /* synthetic */ int f7097g;

        /* renamed from: k */
        public final /* synthetic */ int f7098k;

        /* renamed from: r */
        public final /* synthetic */ int f7099r;

        /* renamed from: s */
        public final /* synthetic */ int f7100s;

        public C1417i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f7095d = view;
            this.f7096e = rect;
            this.f7097g = i;
            this.f7098k = i2;
            this.f7099r = i3;
            this.f7100s = i4;
        }

        public void onAnimationCancel(Animator animator) {
            this.f7094a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f7094a) {
                ga7.m17799w0(this.f7095d, this.f7096e);
                qe7.m25631g(this.f7095d, this.f7097g, this.f7098k, this.f7099r, this.f7100s);
            }
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$j */
    public class C1418j extends C1459b {

        /* renamed from: a */
        public boolean f7102a = false;

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f7103d;

        public C1418j(ViewGroup viewGroup) {
            this.f7103d = viewGroup;
        }

        public void onTransitionCancel(Transition transition) {
            ic7.m19558d(this.f7103d, false);
            this.f7102a = true;
        }

        public void onTransitionEnd(Transition transition) {
            if (!this.f7102a) {
                ic7.m19558d(this.f7103d, false);
            }
            transition.mo10517e0(this);
        }

        public void onTransitionPause(Transition transition) {
            ic7.m19558d(this.f7103d, false);
        }

        public void onTransitionResume(Transition transition) {
            ic7.m19558d(this.f7103d, true);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$k */
    public static class C1419k {

        /* renamed from: a */
        public int f7105a;

        /* renamed from: b */
        public int f7106b;

        /* renamed from: c */
        public int f7107c;

        /* renamed from: d */
        public int f7108d;

        /* renamed from: e */
        public View f7109e;

        /* renamed from: f */
        public int f7110f;

        /* renamed from: g */
        public int f7111g;

        public C1419k(View view) {
            this.f7109e = view;
        }

        /* renamed from: a */
        public void mo10442a(PointF pointF) {
            this.f7107c = Math.round(pointF.x);
            this.f7108d = Math.round(pointF.y);
            int i = this.f7111g + 1;
            this.f7111g = i;
            if (this.f7110f == i) {
                mo10443b();
            }
        }

        /* renamed from: b */
        public final void mo10443b() {
            qe7.m25631g(this.f7109e, this.f7105a, this.f7106b, this.f7107c, this.f7108d);
            this.f7110f = 0;
            this.f7111g = 0;
        }

        /* renamed from: c */
        public void mo10444c(PointF pointF) {
            this.f7105a = Math.round(pointF.x);
            this.f7106b = Math.round(pointF.y);
            int i = this.f7110f + 1;
            this.f7110f = i;
            if (i == this.f7111g) {
                mo10443b();
            }
        }
    }

    public ChangeBounds() {
    }

    /* renamed from: M */
    public String[] mo10404M() {
        return f7075A1;
    }

    /* renamed from: i */
    public void mo10405i(bx6 bx6) {
        mo10408u0(bx6);
    }

    /* renamed from: m */
    public void mo10406m(bx6 bx6) {
        mo10408u0(bx6);
    }

    /* renamed from: t */
    public Animator mo10407t(ViewGroup viewGroup, bx6 bx6, bx6 bx62) {
        int i;
        View view;
        Animator animator;
        ObjectAnimator objectAnimator;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator2;
        bx6 bx63 = bx6;
        bx6 bx64 = bx62;
        if (bx63 == null || bx64 == null) {
            return null;
        }
        Map<String, Object> map = bx63.f8291a;
        Map<String, Object> map2 = bx64.f8291a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = bx64.f8292b;
        if (mo10409v0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) bx63.f8291a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) bx64.f8291a.get("android:changeBounds:bounds");
            int i3 = rect2.left;
            int i4 = rect3.left;
            int i5 = rect2.top;
            int i6 = rect3.top;
            int i7 = rect2.right;
            int i8 = rect3.right;
            int i9 = rect2.bottom;
            int i10 = rect3.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            View view3 = view2;
            Rect rect4 = (Rect) bx63.f8291a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) bx64.f8291a.get("android:changeBounds:clip");
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i++;
            }
            if (i <= 0) {
                return null;
            }
            Rect rect6 = rect5;
            Rect rect7 = rect4;
            if (!this.f7084y1) {
                view = view3;
                qe7.m25631g(view, i3, i5, i7, i9);
                if (i == 2) {
                    if (i11 == i13 && i12 == i14) {
                        animator = ue4.m28205a(view, f7081G1, mo10495E().mo10399a((float) i3, (float) i5, (float) i4, (float) i6));
                    } else {
                        C1419k kVar = new C1419k(view);
                        ObjectAnimator a = ue4.m28205a(kVar, f7077C1, mo10495E().mo10399a((float) i3, (float) i5, (float) i4, (float) i6));
                        ObjectAnimator a2 = ue4.m28205a(kVar, f7078D1, mo10495E().mo10399a((float) i7, (float) i9, (float) i8, (float) i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{a, a2});
                        animatorSet.addListener(new C1416h(kVar));
                        animator = animatorSet;
                    }
                } else if (i3 == i4 && i5 == i6) {
                    animator = ue4.m28205a(view, f7079E1, mo10495E().mo10399a((float) i7, (float) i9, (float) i8, (float) i10));
                } else {
                    animator = ue4.m28205a(view, f7080F1, mo10495E().mo10399a((float) i3, (float) i5, (float) i4, (float) i6));
                }
            } else {
                view = view3;
                qe7.m25631g(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                if (i3 == i4 && i5 == i6) {
                    objectAnimator = null;
                } else {
                    objectAnimator = ue4.m28205a(view, f7081G1, mo10495E().mo10399a((float) i3, (float) i5, (float) i4, (float) i6));
                }
                if (rect7 == null) {
                    i2 = 0;
                    rect = new Rect(0, 0, i11, i12);
                } else {
                    i2 = 0;
                    rect = rect7;
                }
                Rect rect8 = rect6 == null ? new Rect(i2, i2, i13, i14) : rect6;
                if (!rect.equals(rect8)) {
                    ga7.m17799w0(view, rect);
                    b95 b95 = f7082H1;
                    Object[] objArr = new Object[2];
                    objArr[i2] = rect;
                    objArr[1] = rect8;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", b95, objArr);
                    ofObject.addListener(new C1417i(view, rect6, i4, i6, i8, i10));
                    objectAnimator2 = ofObject;
                } else {
                    objectAnimator2 = null;
                }
                animator = C1463d.m10221c(objectAnimator, objectAnimator2);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                ic7.m19558d(viewGroup4, true);
                mo10510a(new C1418j(viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) bx63.f8291a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) bx63.f8291a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) bx64.f8291a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) bx64.f8291a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f7083x1);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c = qe7.m25627c(view2);
        qe7.m25632h(view2, Utils.FLOAT_EPSILON);
        qe7.m25626b(viewGroup).mo19230a(bitmapDrawable);
        PathMotion E = mo10495E();
        int[] iArr = this.f7083x1;
        int i15 = iArr[0];
        int i16 = iArr[1];
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{px4.m25198a(f7076B1, E.mo10399a((float) (intValue - i15), (float) (intValue2 - i16), (float) (intValue3 - i15), (float) (intValue4 - i16)))});
        ofPropertyValuesHolder.addListener(new C1409a(viewGroup, bitmapDrawable, view2, c));
        return ofPropertyValuesHolder;
    }

    /* renamed from: u0 */
    public final void mo10408u0(bx6 bx6) {
        View view = bx6.f8292b;
        if (ga7.m17747T(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            bx6.f8291a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            bx6.f8291a.put("android:changeBounds:parent", bx6.f8292b.getParent());
            if (this.f7085z1) {
                bx6.f8292b.getLocationInWindow(this.f7083x1);
                bx6.f8291a.put("android:changeBounds:windowX", Integer.valueOf(this.f7083x1[0]));
                bx6.f8291a.put("android:changeBounds:windowY", Integer.valueOf(this.f7083x1[1]));
            }
            if (this.f7084y1) {
                bx6.f8291a.put("android:changeBounds:clip", ga7.m17794u(view));
            }
        }
    }

    /* renamed from: v0 */
    public final boolean mo10409v0(View view, View view2) {
        if (!this.f7085z1) {
            return true;
        }
        bx6 C = mo10493C(view, true);
        if (C == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == C.f8292b) {
            return true;
        }
        return false;
    }

    /* renamed from: w0 */
    public void mo10410w0(boolean z) {
        this.f7084y1 = z;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fc6.f11767d);
        boolean a = e27.m15642a(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        mo10410w0(a);
    }
}
