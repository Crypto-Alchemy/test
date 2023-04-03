package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.github.mikephil.charting.utils.Utils;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: fa3 */
/* compiled from: KeyCycle */
public class fa3 extends y93 {

    /* renamed from: g */
    public String f11667g = null;

    /* renamed from: h */
    public int f11668h = 0;

    /* renamed from: i */
    public int f11669i = -1;

    /* renamed from: j */
    public String f11670j = null;

    /* renamed from: k */
    public float f11671k = Float.NaN;

    /* renamed from: l */
    public float f11672l = Utils.FLOAT_EPSILON;

    /* renamed from: m */
    public float f11673m = Utils.FLOAT_EPSILON;

    /* renamed from: n */
    public float f11674n = Float.NaN;

    /* renamed from: o */
    public int f11675o = -1;

    /* renamed from: p */
    public float f11676p = Float.NaN;

    /* renamed from: q */
    public float f11677q = Float.NaN;

    /* renamed from: r */
    public float f11678r = Float.NaN;

    /* renamed from: s */
    public float f11679s = Float.NaN;

    /* renamed from: t */
    public float f11680t = Float.NaN;

    /* renamed from: u */
    public float f11681u = Float.NaN;

    /* renamed from: v */
    public float f11682v = Float.NaN;

    /* renamed from: w */
    public float f11683w = Float.NaN;

    /* renamed from: x */
    public float f11684x = Float.NaN;

    /* renamed from: y */
    public float f11685y = Float.NaN;

    /* renamed from: z */
    public float f11686z = Float.NaN;

    /* renamed from: fa3$a */
    /* compiled from: KeyCycle */
    public static class C2282a {

        /* renamed from: a */
        public static SparseIntArray f11687a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f11687a = sparseIntArray;
            sparseIntArray.append(c65.KeyCycle_motionTarget, 1);
            f11687a.append(c65.KeyCycle_framePosition, 2);
            f11687a.append(c65.KeyCycle_transitionEasing, 3);
            f11687a.append(c65.KeyCycle_curveFit, 4);
            f11687a.append(c65.KeyCycle_waveShape, 5);
            f11687a.append(c65.KeyCycle_wavePeriod, 6);
            f11687a.append(c65.KeyCycle_waveOffset, 7);
            f11687a.append(c65.KeyCycle_waveVariesBy, 8);
            f11687a.append(c65.KeyCycle_android_alpha, 9);
            f11687a.append(c65.KeyCycle_android_elevation, 10);
            f11687a.append(c65.KeyCycle_android_rotation, 11);
            f11687a.append(c65.KeyCycle_android_rotationX, 12);
            f11687a.append(c65.KeyCycle_android_rotationY, 13);
            f11687a.append(c65.KeyCycle_transitionPathRotate, 14);
            f11687a.append(c65.KeyCycle_android_scaleX, 15);
            f11687a.append(c65.KeyCycle_android_scaleY, 16);
            f11687a.append(c65.KeyCycle_android_translationX, 17);
            f11687a.append(c65.KeyCycle_android_translationY, 18);
            f11687a.append(c65.KeyCycle_android_translationZ, 19);
            f11687a.append(c65.KeyCycle_motionProgress, 20);
            f11687a.append(c65.KeyCycle_wavePhase, 21);
        }

        /* renamed from: b */
        public static void m16813b(fa3 fa3, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f11687a.get(index)) {
                    case 1:
                        if (!MotionLayout.f2682P2) {
                            if (typedArray.peekValue(index).type != 3) {
                                fa3.f20101b = typedArray.getResourceId(index, fa3.f20101b);
                                break;
                            } else {
                                fa3.f20102c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, fa3.f20101b);
                            fa3.f20101b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                fa3.f20102c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 2:
                        fa3.f20100a = typedArray.getInt(index, fa3.f20100a);
                        break;
                    case 3:
                        String unused = fa3.f11667g = typedArray.getString(index);
                        break;
                    case 4:
                        int unused2 = fa3.f11668h = typedArray.getInteger(index, fa3.f11668h);
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type != 3) {
                            int unused3 = fa3.f11669i = typedArray.getInt(index, fa3.f11669i);
                            break;
                        } else {
                            String unused4 = fa3.f11670j = typedArray.getString(index);
                            int unused5 = fa3.f11669i = 7;
                            break;
                        }
                    case 6:
                        float unused6 = fa3.f11671k = typedArray.getFloat(index, fa3.f11671k);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type != 5) {
                            float unused7 = fa3.f11672l = typedArray.getFloat(index, fa3.f11672l);
                            break;
                        } else {
                            float unused8 = fa3.f11672l = typedArray.getDimension(index, fa3.f11672l);
                            break;
                        }
                    case 8:
                        int unused9 = fa3.f11675o = typedArray.getInt(index, fa3.f11675o);
                        break;
                    case 9:
                        float unused10 = fa3.f11676p = typedArray.getFloat(index, fa3.f11676p);
                        break;
                    case 10:
                        float unused11 = fa3.f11677q = typedArray.getDimension(index, fa3.f11677q);
                        break;
                    case 11:
                        float unused12 = fa3.f11678r = typedArray.getFloat(index, fa3.f11678r);
                        break;
                    case 12:
                        float unused13 = fa3.f11680t = typedArray.getFloat(index, fa3.f11680t);
                        break;
                    case 13:
                        float unused14 = fa3.f11681u = typedArray.getFloat(index, fa3.f11681u);
                        break;
                    case 14:
                        float unused15 = fa3.f11679s = typedArray.getFloat(index, fa3.f11679s);
                        break;
                    case 15:
                        float unused16 = fa3.f11682v = typedArray.getFloat(index, fa3.f11682v);
                        break;
                    case 16:
                        float unused17 = fa3.f11683w = typedArray.getFloat(index, fa3.f11683w);
                        break;
                    case 17:
                        float unused18 = fa3.f11684x = typedArray.getDimension(index, fa3.f11684x);
                        break;
                    case 18:
                        float unused19 = fa3.f11685y = typedArray.getDimension(index, fa3.f11685y);
                        break;
                    case 19:
                        float unused20 = fa3.f11686z = typedArray.getDimension(index, fa3.f11686z);
                        break;
                    case 20:
                        float unused21 = fa3.f11674n = typedArray.getFloat(index, fa3.f11674n);
                        break;
                    case 21:
                        float unused22 = fa3.f11673m = typedArray.getFloat(index, fa3.f11673m) / 360.0f;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f11687a.get(index));
                        break;
                }
            }
        }
    }

    public fa3() {
        this.f20103d = 4;
        this.f20104e = new HashMap<>();
    }

    /* renamed from: Y */
    public void mo19841Y(HashMap<String, kd7> hashMap) {
        kd7 kd7;
        kd7 kd72;
        HashMap<String, kd7> hashMap2 = hashMap;
        for (String next : hashMap.keySet()) {
            if (next.startsWith("CUSTOM")) {
                ConstraintAttribute constraintAttribute = this.f20104e.get(next.substring(7));
                if (!(constraintAttribute == null || constraintAttribute.mo5038d() != ConstraintAttribute.AttributeType.FLOAT_TYPE || (kd72 = hashMap2.get(next)) == null)) {
                    kd72.mo20444e(this.f20100a, this.f11669i, this.f11670j, this.f11675o, this.f11671k, this.f11672l, this.f11673m, constraintAttribute.mo5039e(), constraintAttribute);
                }
            } else {
                float Z = mo19842Z(next);
                if (!Float.isNaN(Z) && (kd7 = hashMap2.get(next)) != null) {
                    kd7.mo20443d(this.f20100a, this.f11669i, this.f11670j, this.f11675o, this.f11671k, this.f11672l, this.f11673m, Z);
                }
            }
        }
    }

    /* renamed from: Z */
    public float mo19842Z(String str) {
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
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = 12;
                    break;
                }
                break;
            case 1530034690:
                if (str.equals("wavePhase")) {
                    c = 13;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return this.f11680t;
            case 1:
                return this.f11681u;
            case 2:
                return this.f11684x;
            case 3:
                return this.f11685y;
            case 4:
                return this.f11686z;
            case 5:
                return this.f11674n;
            case 6:
                return this.f11682v;
            case 7:
                return this.f11683w;
            case 8:
                return this.f11678r;
            case 9:
                return this.f11677q;
            case 10:
                return this.f11679s;
            case 11:
                return this.f11676p;
            case 12:
                return this.f11672l;
            case 13:
                return this.f11673m;
            default:
                if (str.startsWith("CUSTOM")) {
                    return Float.NaN;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("  UNKNOWN  ");
                sb.append(str);
                return Float.NaN;
        }
    }

    /* renamed from: a */
    public void mo12028a(HashMap<String, de7> hashMap) {
        t21.m27249g("KeyCycle", "add " + hashMap.size() + " values", 2);
        for (String next : hashMap.keySet()) {
            v66 v66 = hashMap.get(next);
            if (v66 != null) {
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
                    case -40300674:
                        if (next.equals("rotation")) {
                            c = 8;
                            break;
                        }
                        break;
                    case -4379043:
                        if (next.equals("elevation")) {
                            c = 9;
                            break;
                        }
                        break;
                    case 37232917:
                        if (next.equals("transitionPathRotate")) {
                            c = 10;
                            break;
                        }
                        break;
                    case 92909918:
                        if (next.equals("alpha")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 156108012:
                        if (next.equals("waveOffset")) {
                            c = 12;
                            break;
                        }
                        break;
                    case 1530034690:
                        if (next.equals("wavePhase")) {
                            c = 13;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        v66.mo18740c(this.f20100a, this.f11680t);
                        break;
                    case 1:
                        v66.mo18740c(this.f20100a, this.f11681u);
                        break;
                    case 2:
                        v66.mo18740c(this.f20100a, this.f11684x);
                        break;
                    case 3:
                        v66.mo18740c(this.f20100a, this.f11685y);
                        break;
                    case 4:
                        v66.mo18740c(this.f20100a, this.f11686z);
                        break;
                    case 5:
                        v66.mo18740c(this.f20100a, this.f11674n);
                        break;
                    case 6:
                        v66.mo18740c(this.f20100a, this.f11682v);
                        break;
                    case 7:
                        v66.mo18740c(this.f20100a, this.f11683w);
                        break;
                    case 8:
                        v66.mo18740c(this.f20100a, this.f11678r);
                        break;
                    case 9:
                        v66.mo18740c(this.f20100a, this.f11677q);
                        break;
                    case 10:
                        v66.mo18740c(this.f20100a, this.f11679s);
                        break;
                    case 11:
                        v66.mo18740c(this.f20100a, this.f11676p);
                        break;
                    case 12:
                        v66.mo18740c(this.f20100a, this.f11672l);
                        break;
                    case 13:
                        v66.mo18740c(this.f20100a, this.f11673m);
                        break;
                    default:
                        if (next.startsWith("CUSTOM")) {
                            break;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("  UNKNOWN  ");
                            sb.append(next);
                            break;
                        }
                }
            }
        }
    }

    /* renamed from: b */
    public y93 clone() {
        return new fa3().mo12030c(this);
    }

    /* renamed from: c */
    public y93 mo12030c(y93 y93) {
        super.mo12030c(y93);
        fa3 fa3 = (fa3) y93;
        this.f11667g = fa3.f11667g;
        this.f11668h = fa3.f11668h;
        this.f11669i = fa3.f11669i;
        this.f11670j = fa3.f11670j;
        this.f11671k = fa3.f11671k;
        this.f11672l = fa3.f11672l;
        this.f11673m = fa3.f11673m;
        this.f11674n = fa3.f11674n;
        this.f11675o = fa3.f11675o;
        this.f11676p = fa3.f11676p;
        this.f11677q = fa3.f11677q;
        this.f11678r = fa3.f11678r;
        this.f11679s = fa3.f11679s;
        this.f11680t = fa3.f11680t;
        this.f11681u = fa3.f11681u;
        this.f11682v = fa3.f11682v;
        this.f11683w = fa3.f11683w;
        this.f11684x = fa3.f11684x;
        this.f11685y = fa3.f11685y;
        this.f11686z = fa3.f11686z;
        return this;
    }

    /* renamed from: d */
    public void mo12032d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f11676p)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f11677q)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f11678r)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f11680t)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f11681u)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f11682v)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f11683w)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f11679s)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f11684x)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f11685y)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f11686z)) {
            hashSet.add("translationZ");
        }
        if (this.f20104e.size() > 0) {
            for (String str : this.f20104e.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    /* renamed from: e */
    public void mo12033e(Context context, AttributeSet attributeSet) {
        C2282a.m16813b(this, context.obtainStyledAttributes(attributeSet, c65.KeyCycle));
    }
}
