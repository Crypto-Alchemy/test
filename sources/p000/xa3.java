package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;

/* renamed from: xa3 */
/* compiled from: KeyPosition */
public class xa3 extends ya3 {

    /* renamed from: h */
    public String f19789h = null;

    /* renamed from: i */
    public int f19790i = y93.f20099f;

    /* renamed from: j */
    public int f19791j = 0;

    /* renamed from: k */
    public float f19792k = Float.NaN;

    /* renamed from: l */
    public float f19793l = Float.NaN;

    /* renamed from: m */
    public float f19794m = Float.NaN;

    /* renamed from: n */
    public float f19795n = Float.NaN;

    /* renamed from: o */
    public float f19796o = Float.NaN;

    /* renamed from: p */
    public float f19797p = Float.NaN;

    /* renamed from: q */
    public int f19798q = 0;

    /* renamed from: r */
    public float f19799r = Float.NaN;

    /* renamed from: s */
    public float f19800s = Float.NaN;

    /* renamed from: xa3$a */
    /* compiled from: KeyPosition */
    public static class C3591a {

        /* renamed from: a */
        public static SparseIntArray f19801a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f19801a = sparseIntArray;
            sparseIntArray.append(c65.KeyPosition_motionTarget, 1);
            f19801a.append(c65.KeyPosition_framePosition, 2);
            f19801a.append(c65.KeyPosition_transitionEasing, 3);
            f19801a.append(c65.KeyPosition_curveFit, 4);
            f19801a.append(c65.KeyPosition_drawPath, 5);
            f19801a.append(c65.KeyPosition_percentX, 6);
            f19801a.append(c65.KeyPosition_percentY, 7);
            f19801a.append(c65.KeyPosition_keyPositionType, 9);
            f19801a.append(c65.KeyPosition_sizePercent, 8);
            f19801a.append(c65.KeyPosition_percentWidth, 11);
            f19801a.append(c65.KeyPosition_percentHeight, 12);
            f19801a.append(c65.KeyPosition_pathMotionArc, 10);
        }

        /* renamed from: b */
        public static void m30027b(xa3 xa3, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f19801a.get(index)) {
                    case 1:
                        if (!MotionLayout.f2682P2) {
                            if (typedArray.peekValue(index).type != 3) {
                                xa3.f20101b = typedArray.getResourceId(index, xa3.f20101b);
                                break;
                            } else {
                                xa3.f20102c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, xa3.f20101b);
                            xa3.f20101b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                xa3.f20102c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 2:
                        xa3.f20100a = typedArray.getInt(index, xa3.f20100a);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type != 3) {
                            xa3.f19789h = ym1.f20291c[typedArray.getInteger(index, 0)];
                            break;
                        } else {
                            xa3.f19789h = typedArray.getString(index);
                            break;
                        }
                    case 4:
                        xa3.f20122g = typedArray.getInteger(index, xa3.f20122g);
                        break;
                    case 5:
                        xa3.f19791j = typedArray.getInt(index, xa3.f19791j);
                        break;
                    case 6:
                        xa3.f19794m = typedArray.getFloat(index, xa3.f19794m);
                        break;
                    case 7:
                        xa3.f19795n = typedArray.getFloat(index, xa3.f19795n);
                        break;
                    case 8:
                        float f = typedArray.getFloat(index, xa3.f19793l);
                        xa3.f19792k = f;
                        xa3.f19793l = f;
                        break;
                    case 9:
                        xa3.f19798q = typedArray.getInt(index, xa3.f19798q);
                        break;
                    case 10:
                        xa3.f19790i = typedArray.getInt(index, xa3.f19790i);
                        break;
                    case 11:
                        xa3.f19792k = typedArray.getFloat(index, xa3.f19792k);
                        break;
                    case 12:
                        xa3.f19793l = typedArray.getFloat(index, xa3.f19793l);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f19801a.get(index));
                        break;
                }
            }
            int i2 = xa3.f20100a;
        }
    }

    public xa3() {
        this.f20103d = 2;
    }

    /* renamed from: a */
    public void mo12028a(HashMap<String, de7> hashMap) {
    }

    /* renamed from: b */
    public y93 clone() {
        return new xa3().mo12030c(this);
    }

    /* renamed from: c */
    public y93 mo12030c(y93 y93) {
        super.mo12030c(y93);
        xa3 xa3 = (xa3) y93;
        this.f19789h = xa3.f19789h;
        this.f19790i = xa3.f19790i;
        this.f19791j = xa3.f19791j;
        this.f19792k = xa3.f19792k;
        this.f19793l = Float.NaN;
        this.f19794m = xa3.f19794m;
        this.f19795n = xa3.f19795n;
        this.f19796o = xa3.f19796o;
        this.f19797p = xa3.f19797p;
        this.f19799r = xa3.f19799r;
        this.f19800s = xa3.f19800s;
        return this;
    }

    /* renamed from: e */
    public void mo12033e(Context context, AttributeSet attributeSet) {
        C3591a.m30027b(this, context.obtainStyledAttributes(attributeSet, c65.KeyPosition));
    }

    /* renamed from: m */
    public void mo27717m(int i) {
        this.f19798q = i;
    }

    /* renamed from: n */
    public void mo27718n(String str, Object obj) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c = 0;
                    break;
                }
                break;
            case -1127236479:
                if (str.equals("percentWidth")) {
                    c = 1;
                    break;
                }
                break;
            case -1017587252:
                if (str.equals("percentHeight")) {
                    c = 2;
                    break;
                }
                break;
            case -827014263:
                if (str.equals("drawPath")) {
                    c = 3;
                    break;
                }
                break;
            case -200259324:
                if (str.equals("sizePercent")) {
                    c = 4;
                    break;
                }
                break;
            case 428090547:
                if (str.equals("percentX")) {
                    c = 5;
                    break;
                }
                break;
            case 428090548:
                if (str.equals("percentY")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f19789h = obj.toString();
                return;
            case 1:
                this.f19792k = mo28005k(obj);
                return;
            case 2:
                this.f19793l = mo28005k(obj);
                return;
            case 3:
                this.f19791j = mo28006l(obj);
                return;
            case 4:
                float k = mo28005k(obj);
                this.f19792k = k;
                this.f19793l = k;
                return;
            case 5:
                this.f19794m = mo28005k(obj);
                return;
            case 6:
                this.f19795n = mo28005k(obj);
                return;
            default:
                return;
        }
    }
}
