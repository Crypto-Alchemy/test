package p000;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.github.mikephil.charting.utils.Utils;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: je7 */
/* compiled from: ViewTimeCycle */
public abstract class je7 extends gq6 {

    /* renamed from: je7$a */
    /* compiled from: ViewTimeCycle */
    public static class C2587a extends je7 {
        /* renamed from: i */
        public boolean mo21818i(View view, float f, long j, da3 da3) {
            view.setAlpha(mo21817f(f, j, view, da3));
            return this.f12575h;
        }
    }

    /* renamed from: je7$b */
    /* compiled from: ViewTimeCycle */
    public static class C2588b extends je7 {

        /* renamed from: l */
        public String f13591l;

        /* renamed from: m */
        public SparseArray<ConstraintAttribute> f13592m;

        /* renamed from: n */
        public SparseArray<float[]> f13593n = new SparseArray<>();

        /* renamed from: o */
        public float[] f13594o;

        /* renamed from: p */
        public float[] f13595p;

        public C2588b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.f13591l = str.split(",")[1];
            this.f13592m = sparseArray;
        }

        /* renamed from: b */
        public void mo20812b(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        /* renamed from: e */
        public void mo20815e(int i) {
            int size = this.f13592m.size();
            int h = this.f13592m.valueAt(0).mo5042h();
            double[] dArr = new double[size];
            int i2 = h + 2;
            this.f13594o = new float[i2];
            this.f13595p = new float[h];
            int[] iArr = new int[2];
            iArr[1] = i2;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = this.f13592m.keyAt(i3);
                float[] valueAt = this.f13593n.valueAt(i3);
                dArr[i3] = ((double) keyAt) * 0.01d;
                this.f13592m.valueAt(i3).mo5040f(this.f13594o);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.f13594o;
                    if (i4 >= fArr.length) {
                        break;
                    }
                    dArr2[i3][i4] = (double) fArr[i4];
                    i4++;
                }
                double[] dArr3 = dArr2[i3];
                dArr3[h] = (double) valueAt[0];
                dArr3[h + 1] = (double) valueAt[1];
            }
            this.f12568a = ux0.m28444a(i, dArr, dArr2);
        }

        /* renamed from: i */
        public boolean mo21818i(View view, float f, long j, da3 da3) {
            boolean z;
            View view2 = view;
            long j2 = j;
            this.f12568a.mo22302e((double) f, this.f13594o);
            float[] fArr = this.f13594o;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j3 = j2 - this.f12576i;
            if (Float.isNaN(this.f12577j)) {
                float a = da3.mo18644a(view2, this.f13591l, 0);
                this.f12577j = a;
                if (Float.isNaN(a)) {
                    this.f12577j = Utils.FLOAT_EPSILON;
                }
            }
            float f4 = (float) ((((double) this.f12577j) + ((((double) j3) * 1.0E-9d) * ((double) f2))) % 1.0d);
            this.f12577j = f4;
            this.f12576i = j2;
            float a2 = mo20811a(f4);
            this.f12575h = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.f13595p;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z2 = this.f12575h;
                float f5 = this.f13594o[i];
                if (((double) f5) != Utils.DOUBLE_EPSILON) {
                    z = true;
                } else {
                    z = false;
                }
                this.f12575h = z2 | z;
                fArr2[i] = (f5 * a2) + f3;
                i++;
            }
            this.f13592m.valueAt(0).mo5043k(view2, this.f13595p);
            if (f2 != Utils.FLOAT_EPSILON) {
                this.f12575h = true;
            }
            return this.f12575h;
        }

        /* renamed from: j */
        public void mo21819j(int i, ConstraintAttribute constraintAttribute, float f, int i2, float f2) {
            this.f13592m.append(i, constraintAttribute);
            this.f13593n.append(i, new float[]{f, f2});
            this.f12569b = Math.max(this.f12569b, i2);
        }
    }

    /* renamed from: je7$c */
    /* compiled from: ViewTimeCycle */
    public static class C2589c extends je7 {
        /* renamed from: i */
        public boolean mo21818i(View view, float f, long j, da3 da3) {
            view.setElevation(mo21817f(f, j, view, da3));
            return this.f12575h;
        }
    }

    /* renamed from: je7$d */
    /* compiled from: ViewTimeCycle */
    public static class C2590d extends je7 {
        /* renamed from: i */
        public boolean mo21818i(View view, float f, long j, da3 da3) {
            return this.f12575h;
        }

        /* renamed from: j */
        public boolean mo21820j(View view, da3 da3, float f, long j, double d, double d2) {
            view.setRotation(mo21817f(f, j, view, da3) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.f12575h;
        }
    }

    /* renamed from: je7$e */
    /* compiled from: ViewTimeCycle */
    public static class C2591e extends je7 {

        /* renamed from: l */
        public boolean f13596l = false;

        /* renamed from: i */
        public boolean mo21818i(View view, float f, long j, da3 da3) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo21817f(f, j, view, da3));
            } else if (this.f13596l) {
                return false;
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f13596l = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(mo21817f(f, j, view, da3))});
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            return this.f12575h;
        }
    }

    /* renamed from: je7$f */
    /* compiled from: ViewTimeCycle */
    public static class C2592f extends je7 {
        /* renamed from: i */
        public boolean mo21818i(View view, float f, long j, da3 da3) {
            view.setRotation(mo21817f(f, j, view, da3));
            return this.f12575h;
        }
    }

    /* renamed from: je7$g */
    /* compiled from: ViewTimeCycle */
    public static class C2593g extends je7 {
        /* renamed from: i */
        public boolean mo21818i(View view, float f, long j, da3 da3) {
            view.setRotationX(mo21817f(f, j, view, da3));
            return this.f12575h;
        }
    }

    /* renamed from: je7$h */
    /* compiled from: ViewTimeCycle */
    public static class C2594h extends je7 {
        /* renamed from: i */
        public boolean mo21818i(View view, float f, long j, da3 da3) {
            view.setRotationY(mo21817f(f, j, view, da3));
            return this.f12575h;
        }
    }

    /* renamed from: je7$i */
    /* compiled from: ViewTimeCycle */
    public static class C2595i extends je7 {
        /* renamed from: i */
        public boolean mo21818i(View view, float f, long j, da3 da3) {
            view.setScaleX(mo21817f(f, j, view, da3));
            return this.f12575h;
        }
    }

    /* renamed from: je7$j */
    /* compiled from: ViewTimeCycle */
    public static class C2596j extends je7 {
        /* renamed from: i */
        public boolean mo21818i(View view, float f, long j, da3 da3) {
            view.setScaleY(mo21817f(f, j, view, da3));
            return this.f12575h;
        }
    }

    /* renamed from: je7$k */
    /* compiled from: ViewTimeCycle */
    public static class C2597k extends je7 {
        /* renamed from: i */
        public boolean mo21818i(View view, float f, long j, da3 da3) {
            view.setTranslationX(mo21817f(f, j, view, da3));
            return this.f12575h;
        }
    }

    /* renamed from: je7$l */
    /* compiled from: ViewTimeCycle */
    public static class C2598l extends je7 {
        /* renamed from: i */
        public boolean mo21818i(View view, float f, long j, da3 da3) {
            view.setTranslationY(mo21817f(f, j, view, da3));
            return this.f12575h;
        }
    }

    /* renamed from: je7$m */
    /* compiled from: ViewTimeCycle */
    public static class C2599m extends je7 {
        /* renamed from: i */
        public boolean mo21818i(View view, float f, long j, da3 da3) {
            view.setTranslationZ(mo21817f(f, j, view, da3));
            return this.f12575h;
        }
    }

    /* renamed from: g */
    public static je7 m20093g(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new C2588b(str, sparseArray);
    }

    /* renamed from: h */
    public static je7 m20094h(String str, long j) {
        je7 je7;
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
            case -40300674:
                if (str.equals("rotation")) {
                    c = 8;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = 9;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 10;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 11;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                je7 = new C2593g();
                break;
            case 1:
                je7 = new C2594h();
                break;
            case 2:
                je7 = new C2597k();
                break;
            case 3:
                je7 = new C2598l();
                break;
            case 4:
                je7 = new C2599m();
                break;
            case 5:
                je7 = new C2591e();
                break;
            case 6:
                je7 = new C2595i();
                break;
            case 7:
                je7 = new C2596j();
                break;
            case 8:
                je7 = new C2592f();
                break;
            case 9:
                je7 = new C2589c();
                break;
            case 10:
                je7 = new C2590d();
                break;
            case 11:
                je7 = new C2587a();
                break;
            default:
                return null;
        }
        je7.mo20813c(j);
        return je7;
    }

    /* renamed from: f */
    public float mo21817f(float f, long j, View view, da3 da3) {
        boolean z;
        long j2 = j;
        View view2 = view;
        da3 da32 = da3;
        this.f12568a.mo22302e((double) f, this.f12574g);
        float[] fArr = this.f12574g;
        float f2 = fArr[1];
        int i = (f2 > Utils.FLOAT_EPSILON ? 1 : (f2 == Utils.FLOAT_EPSILON ? 0 : -1));
        if (i == 0) {
            this.f12575h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f12577j)) {
            float a = da32.mo18644a(view2, this.f12573f, 0);
            this.f12577j = a;
            if (Float.isNaN(a)) {
                this.f12577j = Utils.FLOAT_EPSILON;
            }
        }
        float f3 = (float) ((((double) this.f12577j) + ((((double) (j2 - this.f12576i)) * 1.0E-9d) * ((double) f2))) % 1.0d);
        this.f12577j = f3;
        da32.mo18645b(view2, this.f12573f, 0, f3);
        this.f12576i = j2;
        float f4 = this.f12574g[0];
        float a2 = (mo20811a(this.f12577j) * f4) + this.f12574g[2];
        if (f4 == Utils.FLOAT_EPSILON && i == 0) {
            z = false;
        } else {
            z = true;
        }
        this.f12575h = z;
        return a2;
    }

    /* renamed from: i */
    public abstract boolean mo21818i(View view, float f, long j, da3 da3);
}
