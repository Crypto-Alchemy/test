package p000;

import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.widget.C0532a;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.github.mikephil.charting.utils.Utils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import p000.de7;

/* renamed from: iy3 */
/* compiled from: MotionConstrainedPoint */
public class iy3 implements Comparable<iy3> {

    /* renamed from: q1 */
    public static String[] f13414q1 = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: A */
    public float f13415A = 1.0f;

    /* renamed from: B */
    public float f13416B = Float.NaN;

    /* renamed from: C */
    public float f13417C = Float.NaN;

    /* renamed from: H */
    public float f13418H = Utils.FLOAT_EPSILON;

    /* renamed from: I */
    public float f13419I = Utils.FLOAT_EPSILON;

    /* renamed from: L */
    public float f13420L = Utils.FLOAT_EPSILON;

    /* renamed from: M */
    public ym1 f13421M;

    /* renamed from: P */
    public int f13422P = 0;

    /* renamed from: Q */
    public float f13423Q;

    /* renamed from: U */
    public float f13424U;

    /* renamed from: X */
    public float f13425X;

    /* renamed from: Y */
    public float f13426Y;

    /* renamed from: Z */
    public float f13427Z;

    /* renamed from: a */
    public float f13428a = 1.0f;

    /* renamed from: b1 */
    public LinkedHashMap<String, ConstraintAttribute> f13429b1 = new LinkedHashMap<>();

    /* renamed from: d */
    public int f13430d = 0;

    /* renamed from: e */
    public int f13431e;

    /* renamed from: e0 */
    public float f13432e0 = Float.NaN;

    /* renamed from: e1 */
    public int f13433e1 = 0;

    /* renamed from: g */
    public boolean f13434g = false;

    /* renamed from: k */
    public float f13435k = Utils.FLOAT_EPSILON;

    /* renamed from: k0 */
    public float f13436k0 = Float.NaN;

    /* renamed from: o1 */
    public double[] f13437o1 = new double[18];

    /* renamed from: p1 */
    public double[] f13438p1 = new double[18];

    /* renamed from: r */
    public float f13439r = Utils.FLOAT_EPSILON;

    /* renamed from: s */
    public float f13440s = Utils.FLOAT_EPSILON;

    /* renamed from: v0 */
    public int f13441v0 = -1;

    /* renamed from: x */
    public float f13442x = Utils.FLOAT_EPSILON;

    /* renamed from: y */
    public float f13443y = 1.0f;

    /* renamed from: a */
    public void mo21654a(HashMap<String, de7> hashMap, int i) {
        for (String next : hashMap.keySet()) {
            de7 de7 = hashMap.get(next);
            next.hashCode();
            char c = 65535;
            switch (next.hashCode()) {
                case -1249320806:
                    if (next.equals("rotationX")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (next.equals("rotationY")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (next.equals("translationX")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (next.equals("translationY")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (next.equals("translationZ")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (next.equals("progress")) {
                        c = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (next.equals("scaleX")) {
                        c = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (next.equals("scaleY")) {
                        c = 7;
                        break;
                    }
                    break;
                case -760884510:
                    if (next.equals("transformPivotX")) {
                        c = 8;
                        break;
                    }
                    break;
                case -760884509:
                    if (next.equals("transformPivotY")) {
                        c = 9;
                        break;
                    }
                    break;
                case -40300674:
                    if (next.equals("rotation")) {
                        c = 10;
                        break;
                    }
                    break;
                case -4379043:
                    if (next.equals("elevation")) {
                        c = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (next.equals("transitionPathRotate")) {
                        c = 12;
                        break;
                    }
                    break;
                case 92909918:
                    if (next.equals("alpha")) {
                        c = 13;
                        break;
                    }
                    break;
            }
            float f = 1.0f;
            float f2 = Utils.FLOAT_EPSILON;
            switch (c) {
                case 0:
                    if (!Float.isNaN(this.f13440s)) {
                        f2 = this.f13440s;
                    }
                    de7.mo18740c(i, f2);
                    break;
                case 1:
                    if (!Float.isNaN(this.f13442x)) {
                        f2 = this.f13442x;
                    }
                    de7.mo18740c(i, f2);
                    break;
                case 2:
                    if (!Float.isNaN(this.f13418H)) {
                        f2 = this.f13418H;
                    }
                    de7.mo18740c(i, f2);
                    break;
                case 3:
                    if (!Float.isNaN(this.f13419I)) {
                        f2 = this.f13419I;
                    }
                    de7.mo18740c(i, f2);
                    break;
                case 4:
                    if (!Float.isNaN(this.f13420L)) {
                        f2 = this.f13420L;
                    }
                    de7.mo18740c(i, f2);
                    break;
                case 5:
                    if (!Float.isNaN(this.f13436k0)) {
                        f2 = this.f13436k0;
                    }
                    de7.mo18740c(i, f2);
                    break;
                case 6:
                    if (!Float.isNaN(this.f13443y)) {
                        f = this.f13443y;
                    }
                    de7.mo18740c(i, f);
                    break;
                case 7:
                    if (!Float.isNaN(this.f13415A)) {
                        f = this.f13415A;
                    }
                    de7.mo18740c(i, f);
                    break;
                case 8:
                    if (!Float.isNaN(this.f13416B)) {
                        f2 = this.f13416B;
                    }
                    de7.mo18740c(i, f2);
                    break;
                case 9:
                    if (!Float.isNaN(this.f13417C)) {
                        f2 = this.f13417C;
                    }
                    de7.mo18740c(i, f2);
                    break;
                case 10:
                    if (!Float.isNaN(this.f13439r)) {
                        f2 = this.f13439r;
                    }
                    de7.mo18740c(i, f2);
                    break;
                case 11:
                    if (!Float.isNaN(this.f13435k)) {
                        f2 = this.f13435k;
                    }
                    de7.mo18740c(i, f2);
                    break;
                case 12:
                    if (!Float.isNaN(this.f13432e0)) {
                        f2 = this.f13432e0;
                    }
                    de7.mo18740c(i, f2);
                    break;
                case 13:
                    if (!Float.isNaN(this.f13428a)) {
                        f = this.f13428a;
                    }
                    de7.mo18740c(i, f);
                    break;
                default:
                    if (!next.startsWith("CUSTOM")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("UNKNOWN spline ");
                        sb.append(next);
                        break;
                    } else {
                        String str = next.split(",")[1];
                        if (!this.f13429b1.containsKey(str)) {
                            break;
                        } else {
                            ConstraintAttribute constraintAttribute = this.f13429b1.get(str);
                            if (!(de7 instanceof de7.C2150b)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(next);
                                sb2.append(" ViewSpline not a CustomSet frame = ");
                                sb2.append(i);
                                sb2.append(", value");
                                sb2.append(constraintAttribute.mo5039e());
                                sb2.append(de7);
                                break;
                            } else {
                                ((de7.C2150b) de7).mo18742i(i, constraintAttribute);
                                break;
                            }
                        }
                    }
            }
        }
    }

    /* renamed from: d */
    public void mo21656d(View view) {
        float f;
        this.f13431e = view.getVisibility();
        if (view.getVisibility() != 0) {
            f = Utils.FLOAT_EPSILON;
        } else {
            f = view.getAlpha();
        }
        this.f13428a = f;
        this.f13434g = false;
        this.f13435k = view.getElevation();
        this.f13439r = view.getRotation();
        this.f13440s = view.getRotationX();
        this.f13442x = view.getRotationY();
        this.f13443y = view.getScaleX();
        this.f13415A = view.getScaleY();
        this.f13416B = view.getPivotX();
        this.f13417C = view.getPivotY();
        this.f13418H = view.getTranslationX();
        this.f13419I = view.getTranslationY();
        this.f13420L = view.getTranslationZ();
    }

    /* renamed from: e */
    public void mo21657e(C0532a.C0533a aVar) {
        float f;
        C0532a.C0537d dVar = aVar.f3222c;
        int i = dVar.f3326c;
        this.f13430d = i;
        int i2 = dVar.f3325b;
        this.f13431e = i2;
        if (i2 == 0 || i != 0) {
            f = dVar.f3327d;
        } else {
            f = Utils.FLOAT_EPSILON;
        }
        this.f13428a = f;
        C0532a.C0538e eVar = aVar.f3225f;
        this.f13434g = eVar.f3342m;
        this.f13435k = eVar.f3343n;
        this.f13439r = eVar.f3331b;
        this.f13440s = eVar.f3332c;
        this.f13442x = eVar.f3333d;
        this.f13443y = eVar.f3334e;
        this.f13415A = eVar.f3335f;
        this.f13416B = eVar.f3336g;
        this.f13417C = eVar.f3337h;
        this.f13418H = eVar.f3339j;
        this.f13419I = eVar.f3340k;
        this.f13420L = eVar.f3341l;
        this.f13421M = ym1.m30704c(aVar.f3223d.f3313d);
        C0532a.C0536c cVar = aVar.f3223d;
        this.f13432e0 = cVar.f3318i;
        this.f13422P = cVar.f3315f;
        this.f13441v0 = cVar.f3311b;
        this.f13436k0 = aVar.f3222c.f3328e;
        for (String next : aVar.f3226g.keySet()) {
            ConstraintAttribute constraintAttribute = aVar.f3226g.get(next);
            if (constraintAttribute.mo5041g()) {
                this.f13429b1.put(next, constraintAttribute);
            }
        }
    }

    /* renamed from: f */
    public int compareTo(iy3 iy3) {
        return Float.compare(this.f13423Q, iy3.f13423Q);
    }

    /* renamed from: g */
    public final boolean mo21659g(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            if (Float.isNaN(f) != Float.isNaN(f2)) {
                return true;
            }
            return false;
        } else if (Math.abs(f - f2) > 1.0E-6f) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: h */
    public void mo21660h(iy3 iy3, HashSet<String> hashSet) {
        if (mo21659g(this.f13428a, iy3.f13428a)) {
            hashSet.add("alpha");
        }
        if (mo21659g(this.f13435k, iy3.f13435k)) {
            hashSet.add("elevation");
        }
        int i = this.f13431e;
        int i2 = iy3.f13431e;
        if (i != i2 && this.f13430d == 0 && (i == 0 || i2 == 0)) {
            hashSet.add("alpha");
        }
        if (mo21659g(this.f13439r, iy3.f13439r)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f13432e0) || !Float.isNaN(iy3.f13432e0)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f13436k0) || !Float.isNaN(iy3.f13436k0)) {
            hashSet.add("progress");
        }
        if (mo21659g(this.f13440s, iy3.f13440s)) {
            hashSet.add("rotationX");
        }
        if (mo21659g(this.f13442x, iy3.f13442x)) {
            hashSet.add("rotationY");
        }
        if (mo21659g(this.f13416B, iy3.f13416B)) {
            hashSet.add("transformPivotX");
        }
        if (mo21659g(this.f13417C, iy3.f13417C)) {
            hashSet.add("transformPivotY");
        }
        if (mo21659g(this.f13443y, iy3.f13443y)) {
            hashSet.add("scaleX");
        }
        if (mo21659g(this.f13415A, iy3.f13415A)) {
            hashSet.add("scaleY");
        }
        if (mo21659g(this.f13418H, iy3.f13418H)) {
            hashSet.add("translationX");
        }
        if (mo21659g(this.f13419I, iy3.f13419I)) {
            hashSet.add("translationY");
        }
        if (mo21659g(this.f13420L, iy3.f13420L)) {
            hashSet.add("translationZ");
        }
    }

    /* renamed from: i */
    public void mo21661i(float f, float f2, float f3, float f4) {
        this.f13424U = f;
        this.f13425X = f2;
        this.f13426Y = f3;
        this.f13427Z = f4;
    }

    /* renamed from: l */
    public void mo21662l(Rect rect, View view, int i, float f) {
        mo21661i((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        mo21656d(view);
        this.f13416B = Float.NaN;
        this.f13417C = Float.NaN;
        if (i == 1) {
            this.f13439r = f - 90.0f;
        } else if (i == 2) {
            this.f13439r = f + 90.0f;
        }
    }

    /* renamed from: m */
    public void mo21663m(Rect rect, C0532a aVar, int i, int i2) {
        mo21661i((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        mo21657e(aVar.mo5171z(i2));
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.f13439r + 90.0f;
            this.f13439r = f;
            if (f > 180.0f) {
                this.f13439r = f - 360.0f;
                return;
            }
            return;
        }
        this.f13439r -= 90.0f;
    }

    /* renamed from: o */
    public void mo21664o(View view) {
        mo21661i(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        mo21656d(view);
    }
}
