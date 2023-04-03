package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: pe7 */
/* compiled from: ViewUtils */
public class pe7 {

    /* renamed from: pe7$a */
    /* compiled from: ViewUtils */
    public static class C6351a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f32677a;

        public C6351a(View view) {
            this.f32677a = view;
        }

        public void run() {
            ((InputMethodManager) this.f32677a.getContext().getSystemService("input_method")).showSoftInput(this.f32677a, 1);
        }
    }

    /* renamed from: pe7$b */
    /* compiled from: ViewUtils */
    public static class C6352b implements C6355e {

        /* renamed from: a */
        public final /* synthetic */ boolean f32678a;

        /* renamed from: b */
        public final /* synthetic */ boolean f32679b;

        /* renamed from: c */
        public final /* synthetic */ boolean f32680c;

        /* renamed from: d */
        public final /* synthetic */ C6355e f32681d;

        public C6352b(boolean z, boolean z2, boolean z3, C6355e eVar) {
            this.f32678a = z;
            this.f32679b = z2;
            this.f32680c = z3;
            this.f32681d = eVar;
        }

        /* renamed from: a */
        public hl7 mo31828a(View view, hl7 hl7, C6356f fVar) {
            if (this.f32678a) {
                fVar.f32687d += hl7.mo21237j();
            }
            boolean h = pe7.m49902h(view);
            if (this.f32679b) {
                if (h) {
                    fVar.f32686c += hl7.mo21238k();
                } else {
                    fVar.f32684a += hl7.mo21238k();
                }
            }
            if (this.f32680c) {
                if (h) {
                    fVar.f32684a += hl7.mo21239l();
                } else {
                    fVar.f32686c += hl7.mo21239l();
                }
            }
            fVar.mo46721a(view);
            C6355e eVar = this.f32681d;
            if (eVar != null) {
                return eVar.mo31828a(view, hl7, fVar);
            }
            return hl7;
        }
    }

    /* renamed from: pe7$c */
    /* compiled from: ViewUtils */
    public static class C6353c implements xg4 {

        /* renamed from: a */
        public final /* synthetic */ C6355e f32682a;

        /* renamed from: b */
        public final /* synthetic */ C6356f f32683b;

        public C6353c(C6355e eVar, C6356f fVar) {
            this.f32682a = eVar;
            this.f32683b = fVar;
        }

        /* renamed from: a */
        public hl7 mo1158a(View view, hl7 hl7) {
            return this.f32682a.mo31828a(view, hl7, new C6356f(this.f32683b));
        }
    }

    /* renamed from: pe7$d */
    /* compiled from: ViewUtils */
    public static class C6354d implements View.OnAttachStateChangeListener {
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            ga7.m17779m0(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: pe7$e */
    /* compiled from: ViewUtils */
    public interface C6355e {
        /* renamed from: a */
        hl7 mo31828a(View view, hl7 hl7, C6356f fVar);
    }

    /* renamed from: a */
    public static void m49895a(View view, C6355e eVar) {
        ga7.m17720D0(view, new C6353c(eVar, new C6356f(ga7.m17725G(view), view.getPaddingTop(), ga7.m17723F(view), view.getPaddingBottom())));
        m49904j(view);
    }

    /* renamed from: b */
    public static void m49896b(View view, AttributeSet attributeSet, int i, int i2, C6355e eVar) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, u55.Insets, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(u55.Insets_paddingBottomSystemWindowInsets, false);
        boolean z2 = obtainStyledAttributes.getBoolean(u55.Insets_paddingLeftSystemWindowInsets, false);
        boolean z3 = obtainStyledAttributes.getBoolean(u55.Insets_paddingRightSystemWindowInsets, false);
        obtainStyledAttributes.recycle();
        m49895a(view, new C6352b(z, z2, z3, eVar));
    }

    /* renamed from: c */
    public static float m49897c(Context context, int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: d */
    public static ViewGroup m49898d(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    /* renamed from: e */
    public static nd7 m49899e(View view) {
        return m49900f(m49898d(view));
    }

    /* renamed from: f */
    public static nd7 m49900f(View view) {
        if (view == null) {
            return null;
        }
        return new ld7(view);
    }

    /* renamed from: g */
    public static float m49901g(View view) {
        float f = Utils.FLOAT_EPSILON;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += ga7.m17798w((View) parent);
        }
        return f;
    }

    /* renamed from: h */
    public static boolean m49902h(View view) {
        if (ga7.m17715B(view) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static PorterDuff.Mode m49903i(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: j */
    public static void m49904j(View view) {
        if (ga7.m17746S(view)) {
            ga7.m17779m0(view);
        } else {
            view.addOnAttachStateChangeListener(new C6354d());
        }
    }

    /* renamed from: k */
    public static void m49905k(View view) {
        view.requestFocus();
        view.post(new C6351a(view));
    }

    /* renamed from: pe7$f */
    /* compiled from: ViewUtils */
    public static class C6356f {

        /* renamed from: a */
        public int f32684a;

        /* renamed from: b */
        public int f32685b;

        /* renamed from: c */
        public int f32686c;

        /* renamed from: d */
        public int f32687d;

        public C6356f(int i, int i2, int i3, int i4) {
            this.f32684a = i;
            this.f32685b = i2;
            this.f32686c = i3;
            this.f32687d = i4;
        }

        /* renamed from: a */
        public void mo46721a(View view) {
            ga7.m17722E0(view, this.f32684a, this.f32685b, this.f32686c, this.f32687d);
        }

        public C6356f(C6356f fVar) {
            this.f32684a = fVar.f32684a;
            this.f32685b = fVar.f32685b;
            this.f32686c = fVar.f32686c;
            this.f32687d = fVar.f32687d;
        }
    }
}
