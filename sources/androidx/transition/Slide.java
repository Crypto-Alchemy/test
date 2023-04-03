package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import org.xmlpull.v1.XmlPullParser;

public class Slide extends Visibility {

    /* renamed from: B1 */
    public static final TimeInterpolator f7160B1 = new DecelerateInterpolator();

    /* renamed from: C1 */
    public static final TimeInterpolator f7161C1 = new AccelerateInterpolator();

    /* renamed from: D1 */
    public static final C1438g f7162D1 = new C1432a();

    /* renamed from: E1 */
    public static final C1438g f7163E1 = new C1433b();

    /* renamed from: F1 */
    public static final C1438g f7164F1 = new C1434c();

    /* renamed from: G1 */
    public static final C1438g f7165G1 = new C1435d();

    /* renamed from: H1 */
    public static final C1438g f7166H1 = new C1436e();

    /* renamed from: I1 */
    public static final C1438g f7167I1 = new C1437f();

    /* renamed from: A1 */
    public int f7168A1 = 80;

    /* renamed from: z1 */
    public C1438g f7169z1 = f7167I1;

    /* renamed from: androidx.transition.Slide$a */
    public static class C1432a extends C1439h {
        public C1432a() {
            super((C1432a) null);
        }

        /* renamed from: b */
        public float mo10490b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.Slide$b */
    public static class C1433b extends C1439h {
        public C1433b() {
            super((C1432a) null);
        }

        /* renamed from: b */
        public float mo10490b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (ga7.m17715B(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() + ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.Slide$c */
    public static class C1434c extends C1440i {
        public C1434c() {
            super((C1432a) null);
        }

        /* renamed from: a */
        public float mo10491a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: androidx.transition.Slide$d */
    public static class C1435d extends C1439h {
        public C1435d() {
            super((C1432a) null);
        }

        /* renamed from: b */
        public float mo10490b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.Slide$e */
    public static class C1436e extends C1439h {
        public C1436e() {
            super((C1432a) null);
        }

        /* renamed from: b */
        public float mo10490b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (ga7.m17715B(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() - ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.Slide$f */
    public static class C1437f extends C1440i {
        public C1437f() {
            super((C1432a) null);
        }

        /* renamed from: a */
        public float mo10491a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: androidx.transition.Slide$g */
    public interface C1438g {
        /* renamed from: a */
        float mo10491a(ViewGroup viewGroup, View view);

        /* renamed from: b */
        float mo10490b(ViewGroup viewGroup, View view);
    }

    /* renamed from: androidx.transition.Slide$h */
    public static abstract class C1439h implements C1438g {
        public C1439h() {
        }

        public /* synthetic */ C1439h(C1432a aVar) {
            this();
        }

        /* renamed from: a */
        public float mo10491a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    /* renamed from: androidx.transition.Slide$i */
    public static abstract class C1440i implements C1438g {
        public C1440i() {
        }

        public /* synthetic */ C1440i(C1432a aVar) {
            this();
        }

        /* renamed from: b */
        public float mo10490b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public Slide() {
        mo10489F0(80);
    }

    /* renamed from: u0 */
    private void m10062u0(bx6 bx6) {
        int[] iArr = new int[2];
        bx6.f8292b.getLocationOnScreen(iArr);
        bx6.f8291a.put("android:slide:screenPosition", iArr);
    }

    /* renamed from: B0 */
    public Animator mo10482B0(ViewGroup viewGroup, View view, bx6 bx6, bx6 bx62) {
        if (bx6 == null) {
            return null;
        }
        int[] iArr = (int[]) bx6.f8291a.get("android:slide:screenPosition");
        return C1465e.m10223a(view, bx6, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f7169z1.mo10490b(viewGroup, view), this.f7169z1.mo10491a(viewGroup, view), f7161C1, this);
    }

    /* renamed from: F0 */
    public void mo10489F0(int i) {
        if (i == 3) {
            this.f7169z1 = f7162D1;
        } else if (i == 5) {
            this.f7169z1 = f7165G1;
        } else if (i == 48) {
            this.f7169z1 = f7164F1;
        } else if (i == 80) {
            this.f7169z1 = f7167I1;
        } else if (i == 8388611) {
            this.f7169z1 = f7163E1;
        } else if (i == 8388613) {
            this.f7169z1 = f7166H1;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.f7168A1 = i;
        z06 z06 = new z06();
        z06.mo28289j(i);
        mo10533p0(z06);
    }

    /* renamed from: i */
    public void mo10405i(bx6 bx6) {
        super.mo10405i(bx6);
        m10062u0(bx6);
    }

    /* renamed from: m */
    public void mo10406m(bx6 bx6) {
        super.mo10406m(bx6);
        m10062u0(bx6);
    }

    /* renamed from: z0 */
    public Animator mo10484z0(ViewGroup viewGroup, View view, bx6 bx6, bx6 bx62) {
        if (bx62 == null) {
            return null;
        }
        int[] iArr = (int[]) bx62.f8291a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C1465e.m10223a(view, bx62, iArr[0], iArr[1], this.f7169z1.mo10490b(viewGroup, view), this.f7169z1.mo10491a(viewGroup, view), translationX, translationY, f7160B1, this);
    }

    public Slide(int i) {
        mo10489F0(i);
    }

    @SuppressLint({"RestrictedApi"})
    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fc6.f11771h);
        int g = e27.m15648g(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        mo10489F0(g);
    }
}
