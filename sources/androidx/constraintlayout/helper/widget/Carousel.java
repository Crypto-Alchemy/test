package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.C0507a;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0532a;
import com.github.mikephil.charting.utils.Utils;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;

public class Carousel extends MotionHelper {

    /* renamed from: I */
    public C0496b f2615I = null;

    /* renamed from: L */
    public final ArrayList<View> f2616L = new ArrayList<>();

    /* renamed from: M */
    public int f2617M = 0;

    /* renamed from: P */
    public int f2618P = 0;

    /* renamed from: Q */
    public MotionLayout f2619Q;

    /* renamed from: U */
    public int f2620U = -1;

    /* renamed from: b1 */
    public int f2621b1 = -1;

    /* renamed from: e0 */
    public boolean f2622e0 = false;

    /* renamed from: e1 */
    public int f2623e1 = -1;

    /* renamed from: k0 */
    public int f2624k0 = -1;

    /* renamed from: o1 */
    public float f2625o1 = 0.9f;

    /* renamed from: p1 */
    public int f2626p1 = 0;

    /* renamed from: q1 */
    public int f2627q1 = 4;

    /* renamed from: r1 */
    public int f2628r1 = 1;

    /* renamed from: s1 */
    public float f2629s1 = 2.0f;

    /* renamed from: t1 */
    public int f2630t1 = -1;

    /* renamed from: u1 */
    public int f2631u1 = MlKitException.CODE_SCANNER_UNAVAILABLE;

    /* renamed from: v0 */
    public int f2632v0 = -1;

    /* renamed from: v1 */
    public int f2633v1 = -1;

    /* renamed from: w1 */
    public Runnable f2634w1 = new C0494a();

    /* renamed from: androidx.constraintlayout.helper.widget.Carousel$a */
    public class C0494a implements Runnable {

        /* renamed from: androidx.constraintlayout.helper.widget.Carousel$a$a */
        public class C0495a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ float f2636a;

            public C0495a(float f) {
                this.f2636a = f;
            }

            public void run() {
                Carousel.this.f2619Q.mo4712s0(5, 1.0f, this.f2636a);
            }
        }

        public C0494a() {
        }

        public void run() {
            Carousel.this.f2619Q.setProgress(Utils.FLOAT_EPSILON);
            Carousel.this.mo4576Q();
            Carousel.this.f2615I.mo4587a(Carousel.this.f2618P);
            float velocity = Carousel.this.f2619Q.getVelocity();
            if (Carousel.this.f2628r1 == 2 && velocity > Carousel.this.f2629s1 && Carousel.this.f2618P < Carousel.this.f2615I.count() - 1) {
                float L = velocity * Carousel.this.f2625o1;
                if (Carousel.this.f2618P == 0 && Carousel.this.f2617M > Carousel.this.f2618P) {
                    return;
                }
                if (Carousel.this.f2618P != Carousel.this.f2615I.count() - 1 || Carousel.this.f2617M >= Carousel.this.f2618P) {
                    Carousel.this.f2619Q.post(new C0495a(L));
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.helper.widget.Carousel$b */
    public interface C0496b {
        /* renamed from: a */
        void mo4587a(int i);

        /* renamed from: b */
        void mo4588b(View view, int i);

        int count();
    }

    public Carousel(Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m3781P() {
        this.f2619Q.setTransitionDuration(this.f2631u1);
        if (this.f2630t1 < this.f2618P) {
            this.f2619Q.mo4736x0(this.f2621b1, this.f2631u1);
        } else {
            this.f2619Q.mo4736x0(this.f2623e1, this.f2631u1);
        }
    }

    /* renamed from: N */
    public final boolean mo4574N(int i, boolean z) {
        MotionLayout motionLayout;
        C0507a.C0509b h0;
        if (i == -1 || (motionLayout = this.f2619Q) == null || (h0 = motionLayout.mo4688h0(i)) == null || z == h0.mo4831C()) {
            return false;
        }
        h0.mo4834F(z);
        return true;
    }

    /* renamed from: O */
    public final void mo4575O(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c65.Carousel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == c65.Carousel_carousel_firstView) {
                    this.f2620U = obtainStyledAttributes.getResourceId(index, this.f2620U);
                } else if (index == c65.Carousel_carousel_backwardTransition) {
                    this.f2624k0 = obtainStyledAttributes.getResourceId(index, this.f2624k0);
                } else if (index == c65.Carousel_carousel_forwardTransition) {
                    this.f2632v0 = obtainStyledAttributes.getResourceId(index, this.f2632v0);
                } else if (index == c65.Carousel_carousel_emptyViewsBehavior) {
                    this.f2627q1 = obtainStyledAttributes.getInt(index, this.f2627q1);
                } else if (index == c65.Carousel_carousel_previousState) {
                    this.f2621b1 = obtainStyledAttributes.getResourceId(index, this.f2621b1);
                } else if (index == c65.Carousel_carousel_nextState) {
                    this.f2623e1 = obtainStyledAttributes.getResourceId(index, this.f2623e1);
                } else if (index == c65.Carousel_carousel_touchUp_dampeningFactor) {
                    this.f2625o1 = obtainStyledAttributes.getFloat(index, this.f2625o1);
                } else if (index == c65.Carousel_carousel_touchUpMode) {
                    this.f2628r1 = obtainStyledAttributes.getInt(index, this.f2628r1);
                } else if (index == c65.Carousel_carousel_touchUp_velocityThreshold) {
                    this.f2629s1 = obtainStyledAttributes.getFloat(index, this.f2629s1);
                } else if (index == c65.Carousel_carousel_infinite) {
                    this.f2622e0 = obtainStyledAttributes.getBoolean(index, this.f2622e0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: Q */
    public final void mo4576Q() {
        C0496b bVar = this.f2615I;
        if (bVar != null && this.f2619Q != null && bVar.count() != 0) {
            int size = this.f2616L.size();
            for (int i = 0; i < size; i++) {
                View view = this.f2616L.get(i);
                int i2 = (this.f2618P + i) - this.f2626p1;
                if (this.f2622e0) {
                    if (i2 < 0) {
                        int i3 = this.f2627q1;
                        if (i3 != 4) {
                            mo4578S(view, i3);
                        } else {
                            mo4578S(view, 0);
                        }
                        if (i2 % this.f2615I.count() == 0) {
                            this.f2615I.mo4588b(view, 0);
                        } else {
                            C0496b bVar2 = this.f2615I;
                            bVar2.mo4588b(view, bVar2.count() + (i2 % this.f2615I.count()));
                        }
                    } else if (i2 >= this.f2615I.count()) {
                        if (i2 == this.f2615I.count()) {
                            i2 = 0;
                        } else if (i2 > this.f2615I.count()) {
                            i2 %= this.f2615I.count();
                        }
                        int i4 = this.f2627q1;
                        if (i4 != 4) {
                            mo4578S(view, i4);
                        } else {
                            mo4578S(view, 0);
                        }
                        this.f2615I.mo4588b(view, i2);
                    } else {
                        mo4578S(view, 0);
                        this.f2615I.mo4588b(view, i2);
                    }
                } else if (i2 < 0) {
                    mo4578S(view, this.f2627q1);
                } else if (i2 >= this.f2615I.count()) {
                    mo4578S(view, this.f2627q1);
                } else {
                    mo4578S(view, 0);
                    this.f2615I.mo4588b(view, i2);
                }
            }
            int i5 = this.f2630t1;
            if (i5 != -1 && i5 != this.f2618P) {
                this.f2619Q.post(new sb0(this));
            } else if (i5 == this.f2618P) {
                this.f2630t1 = -1;
            }
            if (this.f2624k0 != -1 && this.f2632v0 != -1 && !this.f2622e0) {
                int count = this.f2615I.count();
                if (this.f2618P == 0) {
                    mo4574N(this.f2624k0, false);
                } else {
                    mo4574N(this.f2624k0, true);
                    this.f2619Q.setTransition(this.f2624k0);
                }
                if (this.f2618P == count - 1) {
                    mo4574N(this.f2632v0, false);
                    return;
                }
                mo4574N(this.f2632v0, true);
                this.f2619Q.setTransition(this.f2632v0);
            }
        }
    }

    /* renamed from: R */
    public final boolean mo4577R(int i, View view, int i2) {
        C0532a.C0533a w;
        C0532a f0 = this.f2619Q.mo4673f0(i);
        if (f0 == null || (w = f0.mo5168w(view.getId())) == null) {
            return false;
        }
        w.f3222c.f3326c = 1;
        view.setVisibility(i2);
        return true;
    }

    /* renamed from: S */
    public final boolean mo4578S(View view, int i) {
        MotionLayout motionLayout = this.f2619Q;
        if (motionLayout == null) {
            return false;
        }
        int[] constraintSetIds = motionLayout.getConstraintSetIds();
        boolean z = false;
        for (int R : constraintSetIds) {
            z |= mo4577R(R, view, i);
        }
        return z;
    }

    /* renamed from: a */
    public void mo4579a(MotionLayout motionLayout, int i, int i2, float f) {
        this.f2633v1 = i;
    }

    /* renamed from: b */
    public void mo4580b(MotionLayout motionLayout, int i) {
        int i2 = this.f2618P;
        this.f2617M = i2;
        if (i == this.f2623e1) {
            this.f2618P = i2 + 1;
        } else if (i == this.f2621b1) {
            this.f2618P = i2 - 1;
        }
        if (this.f2622e0) {
            if (this.f2618P >= this.f2615I.count()) {
                this.f2618P = 0;
            }
            if (this.f2618P < 0) {
                this.f2618P = this.f2615I.count() - 1;
            }
        } else {
            if (this.f2618P >= this.f2615I.count()) {
                this.f2618P = this.f2615I.count() - 1;
            }
            if (this.f2618P < 0) {
                this.f2618P = 0;
            }
        }
        if (this.f2617M != this.f2618P) {
            this.f2619Q.post(this.f2634w1);
        }
    }

    public int getCount() {
        C0496b bVar = this.f2615I;
        if (bVar != null) {
            return bVar.count();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.f2618P;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            for (int i = 0; i < this.f3071d; i++) {
                int i2 = this.f3070a[i];
                View i3 = motionLayout.mo5078i(i2);
                if (this.f2620U == i2) {
                    this.f2626p1 = i;
                }
                this.f2616L.add(i3);
            }
            this.f2619Q = motionLayout;
            if (this.f2628r1 == 2) {
                C0507a.C0509b h0 = motionLayout.mo4688h0(this.f2632v0);
                if (h0 != null) {
                    h0.mo4836H(5);
                }
                C0507a.C0509b h02 = this.f2619Q.mo4688h0(this.f2624k0);
                if (h02 != null) {
                    h02.mo4836H(5);
                }
            }
            mo4576Q();
        }
    }

    public void setAdapter(C0496b bVar) {
        this.f2615I = bVar;
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo4575O(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo4575O(context, attributeSet);
    }
}
