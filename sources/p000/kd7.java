package p000;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: kd7 */
/* compiled from: ViewOscillator */
public abstract class kd7 extends ga3 {

    /* renamed from: kd7$a */
    /* compiled from: ViewOscillator */
    public static class C2661a extends kd7 {
        /* renamed from: j */
        public void mo22259j(View view, float f) {
            view.setAlpha(mo20440a(f));
        }
    }

    /* renamed from: kd7$b */
    /* compiled from: ViewOscillator */
    public static class C2662b extends kd7 {

        /* renamed from: h */
        public float[] f14040h = new float[1];

        /* renamed from: i */
        public ConstraintAttribute f14041i;

        /* renamed from: c */
        public void mo20442c(Object obj) {
            this.f14041i = (ConstraintAttribute) obj;
        }

        /* renamed from: j */
        public void mo22259j(View view, float f) {
            this.f14040h[0] = mo20440a(f);
            this.f14041i.mo5043k(view, this.f14040h);
        }
    }

    /* renamed from: kd7$c */
    /* compiled from: ViewOscillator */
    public static class C2663c extends kd7 {
        /* renamed from: j */
        public void mo22259j(View view, float f) {
            view.setElevation(mo20440a(f));
        }
    }

    /* renamed from: kd7$d */
    /* compiled from: ViewOscillator */
    public static class C2664d extends kd7 {
        /* renamed from: j */
        public void mo22259j(View view, float f) {
        }

        /* renamed from: k */
        public void mo22260k(View view, float f, double d, double d2) {
            view.setRotation(mo20440a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* renamed from: kd7$e */
    /* compiled from: ViewOscillator */
    public static class C2665e extends kd7 {

        /* renamed from: h */
        public boolean f14042h = false;

        /* renamed from: j */
        public void mo22259j(View view, float f) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo20440a(f));
            } else if (!this.f14042h) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f14042h = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(mo20440a(f))});
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
        }
    }

    /* renamed from: kd7$f */
    /* compiled from: ViewOscillator */
    public static class C2666f extends kd7 {
        /* renamed from: j */
        public void mo22259j(View view, float f) {
            view.setRotation(mo20440a(f));
        }
    }

    /* renamed from: kd7$g */
    /* compiled from: ViewOscillator */
    public static class C2667g extends kd7 {
        /* renamed from: j */
        public void mo22259j(View view, float f) {
            view.setRotationX(mo20440a(f));
        }
    }

    /* renamed from: kd7$h */
    /* compiled from: ViewOscillator */
    public static class C2668h extends kd7 {
        /* renamed from: j */
        public void mo22259j(View view, float f) {
            view.setRotationY(mo20440a(f));
        }
    }

    /* renamed from: kd7$i */
    /* compiled from: ViewOscillator */
    public static class C2669i extends kd7 {
        /* renamed from: j */
        public void mo22259j(View view, float f) {
            view.setScaleX(mo20440a(f));
        }
    }

    /* renamed from: kd7$j */
    /* compiled from: ViewOscillator */
    public static class C2670j extends kd7 {
        /* renamed from: j */
        public void mo22259j(View view, float f) {
            view.setScaleY(mo20440a(f));
        }
    }

    /* renamed from: kd7$k */
    /* compiled from: ViewOscillator */
    public static class C2671k extends kd7 {
        /* renamed from: j */
        public void mo22259j(View view, float f) {
            view.setTranslationX(mo20440a(f));
        }
    }

    /* renamed from: kd7$l */
    /* compiled from: ViewOscillator */
    public static class C2672l extends kd7 {
        /* renamed from: j */
        public void mo22259j(View view, float f) {
            view.setTranslationY(mo20440a(f));
        }
    }

    /* renamed from: kd7$m */
    /* compiled from: ViewOscillator */
    public static class C2673m extends kd7 {
        /* renamed from: j */
        public void mo22259j(View view, float f) {
            view.setTranslationZ(mo20440a(f));
        }
    }

    /* renamed from: i */
    public static kd7 m20655i(String str) {
        if (str.startsWith("CUSTOM")) {
            return new C2662b();
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 7;
                    break;
                }
                break;
            case -797520672:
                if (str.equals("waveVariesBy")) {
                    c = 8;
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c = 9;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = 10;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 12;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = 13;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C2667g();
            case 1:
                return new C2668h();
            case 2:
                return new C2671k();
            case 3:
                return new C2672l();
            case 4:
                return new C2673m();
            case 5:
                return new C2665e();
            case 6:
                return new C2669i();
            case 7:
                return new C2670j();
            case 8:
                return new C2661a();
            case 9:
                return new C2666f();
            case 10:
                return new C2663c();
            case 11:
                return new C2664d();
            case 12:
                return new C2661a();
            case 13:
                return new C2661a();
            default:
                return null;
        }
    }

    /* renamed from: j */
    public abstract void mo22259j(View view, float f);
}
