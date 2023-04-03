package p000;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: de7 */
/* compiled from: ViewSpline */
public abstract class de7 extends v66 {

    /* renamed from: de7$a */
    /* compiled from: ViewSpline */
    public static class C2149a extends de7 {
        /* renamed from: h */
        public void mo18739h(View view, float f) {
            view.setAlpha(mo27074a(f));
        }
    }

    /* renamed from: de7$b */
    /* compiled from: ViewSpline */
    public static class C2150b extends de7 {

        /* renamed from: f */
        public String f10681f;

        /* renamed from: g */
        public SparseArray<ConstraintAttribute> f10682g;

        /* renamed from: h */
        public float[] f10683h;

        public C2150b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.f10681f = str.split(",")[1];
            this.f10682g = sparseArray;
        }

        /* renamed from: c */
        public void mo18740c(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        /* renamed from: e */
        public void mo18741e(int i) {
            int size = this.f10682g.size();
            int h = this.f10682g.valueAt(0).mo5042h();
            double[] dArr = new double[size];
            this.f10683h = new float[h];
            int[] iArr = new int[2];
            iArr[1] = h;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            for (int i2 = 0; i2 < size; i2++) {
                dArr[i2] = ((double) this.f10682g.keyAt(i2)) * 0.01d;
                this.f10682g.valueAt(i2).mo5040f(this.f10683h);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.f10683h;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    dArr2[i2][i3] = (double) fArr[i3];
                    i3++;
                }
            }
            this.f18690a = ux0.m28444a(i, dArr, dArr2);
        }

        /* renamed from: h */
        public void mo18739h(View view, float f) {
            this.f18690a.mo22302e((double) f, this.f10683h);
            this.f10682g.valueAt(0).mo5043k(view, this.f10683h);
        }

        /* renamed from: i */
        public void mo18742i(int i, ConstraintAttribute constraintAttribute) {
            this.f10682g.append(i, constraintAttribute);
        }
    }

    /* renamed from: de7$c */
    /* compiled from: ViewSpline */
    public static class C2151c extends de7 {
        /* renamed from: h */
        public void mo18739h(View view, float f) {
            view.setElevation(mo27074a(f));
        }
    }

    /* renamed from: de7$d */
    /* compiled from: ViewSpline */
    public static class C2152d extends de7 {
        /* renamed from: h */
        public void mo18739h(View view, float f) {
        }

        /* renamed from: i */
        public void mo18743i(View view, float f, double d, double d2) {
            view.setRotation(mo27074a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* renamed from: de7$e */
    /* compiled from: ViewSpline */
    public static class C2153e extends de7 {
        /* renamed from: h */
        public void mo18739h(View view, float f) {
            view.setPivotX(mo27074a(f));
        }
    }

    /* renamed from: de7$f */
    /* compiled from: ViewSpline */
    public static class C2154f extends de7 {
        /* renamed from: h */
        public void mo18739h(View view, float f) {
            view.setPivotY(mo27074a(f));
        }
    }

    /* renamed from: de7$g */
    /* compiled from: ViewSpline */
    public static class C2155g extends de7 {

        /* renamed from: f */
        public boolean f10684f = false;

        /* renamed from: h */
        public void mo18739h(View view, float f) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo27074a(f));
            } else if (!this.f10684f) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f10684f = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(mo27074a(f))});
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
        }
    }

    /* renamed from: de7$h */
    /* compiled from: ViewSpline */
    public static class C2156h extends de7 {
        /* renamed from: h */
        public void mo18739h(View view, float f) {
            view.setRotation(mo27074a(f));
        }
    }

    /* renamed from: de7$i */
    /* compiled from: ViewSpline */
    public static class C2157i extends de7 {
        /* renamed from: h */
        public void mo18739h(View view, float f) {
            view.setRotationX(mo27074a(f));
        }
    }

    /* renamed from: de7$j */
    /* compiled from: ViewSpline */
    public static class C2158j extends de7 {
        /* renamed from: h */
        public void mo18739h(View view, float f) {
            view.setRotationY(mo27074a(f));
        }
    }

    /* renamed from: de7$k */
    /* compiled from: ViewSpline */
    public static class C2159k extends de7 {
        /* renamed from: h */
        public void mo18739h(View view, float f) {
            view.setScaleX(mo27074a(f));
        }
    }

    /* renamed from: de7$l */
    /* compiled from: ViewSpline */
    public static class C2160l extends de7 {
        /* renamed from: h */
        public void mo18739h(View view, float f) {
            view.setScaleY(mo27074a(f));
        }
    }

    /* renamed from: de7$m */
    /* compiled from: ViewSpline */
    public static class C2161m extends de7 {
        /* renamed from: h */
        public void mo18739h(View view, float f) {
            view.setTranslationX(mo27074a(f));
        }
    }

    /* renamed from: de7$n */
    /* compiled from: ViewSpline */
    public static class C2162n extends de7 {
        /* renamed from: h */
        public void mo18739h(View view, float f) {
            view.setTranslationY(mo27074a(f));
        }
    }

    /* renamed from: de7$o */
    /* compiled from: ViewSpline */
    public static class C2163o extends de7 {
        /* renamed from: h */
        public void mo18739h(View view, float f) {
            view.setTranslationZ(mo27074a(f));
        }
    }

    /* renamed from: f */
    public static de7 m15040f(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new C2150b(str, sparseArray);
    }

    /* renamed from: g */
    public static de7 m15041g(String str) {
        str.hashCode();
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
            case -760884510:
                if (str.equals("transformPivotX")) {
                    c = 9;
                    break;
                }
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    c = 10;
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = 12;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 13;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 14;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = 15;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C2157i();
            case 1:
                return new C2158j();
            case 2:
                return new C2161m();
            case 3:
                return new C2162n();
            case 4:
                return new C2163o();
            case 5:
                return new C2155g();
            case 6:
                return new C2159k();
            case 7:
                return new C2160l();
            case 8:
                return new C2149a();
            case 9:
                return new C2153e();
            case 10:
                return new C2154f();
            case 11:
                return new C2156h();
            case 12:
                return new C2151c();
            case 13:
                return new C2152d();
            case 14:
                return new C2149a();
            case 15:
                return new C2149a();
            default:
                return null;
        }
    }

    /* renamed from: h */
    public abstract void mo18739h(View view, float f);
}
