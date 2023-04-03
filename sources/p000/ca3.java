package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: ca3 */
/* compiled from: KeyAttributes */
public class ca3 extends y93 {

    /* renamed from: g */
    public String f8382g;

    /* renamed from: h */
    public int f8383h = -1;

    /* renamed from: i */
    public boolean f8384i = false;

    /* renamed from: j */
    public float f8385j = Float.NaN;

    /* renamed from: k */
    public float f8386k = Float.NaN;

    /* renamed from: l */
    public float f8387l = Float.NaN;

    /* renamed from: m */
    public float f8388m = Float.NaN;

    /* renamed from: n */
    public float f8389n = Float.NaN;

    /* renamed from: o */
    public float f8390o = Float.NaN;

    /* renamed from: p */
    public float f8391p = Float.NaN;

    /* renamed from: q */
    public float f8392q = Float.NaN;

    /* renamed from: r */
    public float f8393r = Float.NaN;

    /* renamed from: s */
    public float f8394s = Float.NaN;

    /* renamed from: t */
    public float f8395t = Float.NaN;

    /* renamed from: u */
    public float f8396u = Float.NaN;

    /* renamed from: v */
    public float f8397v = Float.NaN;

    /* renamed from: w */
    public float f8398w = Float.NaN;

    /* renamed from: ca3$a */
    /* compiled from: KeyAttributes */
    public static class C1673a {

        /* renamed from: a */
        public static SparseIntArray f8399a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8399a = sparseIntArray;
            sparseIntArray.append(c65.KeyAttribute_android_alpha, 1);
            f8399a.append(c65.KeyAttribute_android_elevation, 2);
            f8399a.append(c65.KeyAttribute_android_rotation, 4);
            f8399a.append(c65.KeyAttribute_android_rotationX, 5);
            f8399a.append(c65.KeyAttribute_android_rotationY, 6);
            f8399a.append(c65.KeyAttribute_android_transformPivotX, 19);
            f8399a.append(c65.KeyAttribute_android_transformPivotY, 20);
            f8399a.append(c65.KeyAttribute_android_scaleX, 7);
            f8399a.append(c65.KeyAttribute_transitionPathRotate, 8);
            f8399a.append(c65.KeyAttribute_transitionEasing, 9);
            f8399a.append(c65.KeyAttribute_motionTarget, 10);
            f8399a.append(c65.KeyAttribute_framePosition, 12);
            f8399a.append(c65.KeyAttribute_curveFit, 13);
            f8399a.append(c65.KeyAttribute_android_scaleY, 14);
            f8399a.append(c65.KeyAttribute_android_translationX, 15);
            f8399a.append(c65.KeyAttribute_android_translationY, 16);
            f8399a.append(c65.KeyAttribute_android_translationZ, 17);
            f8399a.append(c65.KeyAttribute_motionProgress, 18);
        }

        /* renamed from: a */
        public static void m11815a(ca3 ca3, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f8399a.get(index)) {
                    case 1:
                        float unused = ca3.f8385j = typedArray.getFloat(index, ca3.f8385j);
                        break;
                    case 2:
                        float unused2 = ca3.f8386k = typedArray.getDimension(index, ca3.f8386k);
                        break;
                    case 4:
                        float unused3 = ca3.f8387l = typedArray.getFloat(index, ca3.f8387l);
                        break;
                    case 5:
                        float unused4 = ca3.f8388m = typedArray.getFloat(index, ca3.f8388m);
                        break;
                    case 6:
                        float unused5 = ca3.f8389n = typedArray.getFloat(index, ca3.f8389n);
                        break;
                    case 7:
                        float unused6 = ca3.f8393r = typedArray.getFloat(index, ca3.f8393r);
                        break;
                    case 8:
                        float unused7 = ca3.f8392q = typedArray.getFloat(index, ca3.f8392q);
                        break;
                    case 9:
                        String unused8 = ca3.f8382g = typedArray.getString(index);
                        break;
                    case 10:
                        if (!MotionLayout.f2682P2) {
                            if (typedArray.peekValue(index).type != 3) {
                                ca3.f20101b = typedArray.getResourceId(index, ca3.f20101b);
                                break;
                            } else {
                                ca3.f20102c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, ca3.f20101b);
                            ca3.f20101b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                ca3.f20102c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 12:
                        ca3.f20100a = typedArray.getInt(index, ca3.f20100a);
                        break;
                    case 13:
                        int unused9 = ca3.f8383h = typedArray.getInteger(index, ca3.f8383h);
                        break;
                    case 14:
                        float unused10 = ca3.f8394s = typedArray.getFloat(index, ca3.f8394s);
                        break;
                    case 15:
                        float unused11 = ca3.f8395t = typedArray.getDimension(index, ca3.f8395t);
                        break;
                    case 16:
                        float unused12 = ca3.f8396u = typedArray.getDimension(index, ca3.f8396u);
                        break;
                    case 17:
                        float unused13 = ca3.f8397v = typedArray.getDimension(index, ca3.f8397v);
                        break;
                    case 18:
                        float unused14 = ca3.f8398w = typedArray.getFloat(index, ca3.f8398w);
                        break;
                    case 19:
                        float unused15 = ca3.f8390o = typedArray.getDimension(index, ca3.f8390o);
                        break;
                    case 20:
                        float unused16 = ca3.f8391p = typedArray.getDimension(index, ca3.f8391p);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f8399a.get(index));
                        break;
                }
            }
        }
    }

    public ca3() {
        this.f20103d = 1;
        this.f20104e = new HashMap<>();
    }

    /* renamed from: R */
    public void mo12027R(String str, Object obj) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals("motionProgress")) {
                    c = 0;
                    break;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c = 1;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 4;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 5;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 6;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 7;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
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
            case 579057826:
                if (str.equals("curveFit")) {
                    c = 15;
                    break;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f8398w = mo28005k(obj);
                return;
            case 1:
                this.f8382g = obj.toString();
                return;
            case 2:
                this.f8388m = mo28005k(obj);
                return;
            case 3:
                this.f8389n = mo28005k(obj);
                return;
            case 4:
                this.f8395t = mo28005k(obj);
                return;
            case 5:
                this.f8396u = mo28005k(obj);
                return;
            case 6:
                this.f8397v = mo28005k(obj);
                return;
            case 7:
                this.f8393r = mo28005k(obj);
                return;
            case 8:
                this.f8394s = mo28005k(obj);
                return;
            case 9:
                this.f8390o = mo28005k(obj);
                return;
            case 10:
                this.f8391p = mo28005k(obj);
                return;
            case 11:
                this.f8387l = mo28005k(obj);
                return;
            case 12:
                this.f8386k = mo28005k(obj);
                return;
            case 13:
                this.f8392q = mo28005k(obj);
                return;
            case 14:
                this.f8385j = mo28005k(obj);
                return;
            case 15:
                this.f8383h = mo28006l(obj);
                return;
            case 16:
                this.f8384i = mo28004j(obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009a, code lost:
        if (r1.equals("scaleY") == false) goto L_0x0044;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12028a(java.util.HashMap<java.lang.String, p000.de7> r7) {
        /*
            r6 = this;
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01e0
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.get(r1)
            v66 r2 = (p000.v66) r2
            if (r2 != 0) goto L_0x001d
            goto L_0x0008
        L_0x001d:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            r4 = 7
            if (r3 == 0) goto L_0x003c
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r3 = r6.f20104e
            java.lang.Object r1 = r3.get(r1)
            androidx.constraintlayout.widget.ConstraintAttribute r1 = (androidx.constraintlayout.widget.ConstraintAttribute) r1
            if (r1 == 0) goto L_0x0008
            de7$b r2 = (p000.de7.C2150b) r2
            int r3 = r6.f20100a
            r2.mo18742i(r3, r1)
            goto L_0x0008
        L_0x003c:
            r3 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00e2;
                case -1249320805: goto L_0x00d6;
                case -1225497657: goto L_0x00ca;
                case -1225497656: goto L_0x00be;
                case -1225497655: goto L_0x00b3;
                case -1001078227: goto L_0x00a8;
                case -908189618: goto L_0x009d;
                case -908189617: goto L_0x0094;
                case -760884510: goto L_0x0088;
                case -760884509: goto L_0x007b;
                case -40300674: goto L_0x006e;
                case -4379043: goto L_0x0061;
                case 37232917: goto L_0x0054;
                case 92909918: goto L_0x0047;
                default: goto L_0x0044;
            }
        L_0x0044:
            r4 = r3
            goto L_0x00ed
        L_0x0047:
            java.lang.String r4 = "alpha"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0050
            goto L_0x0044
        L_0x0050:
            r4 = 13
            goto L_0x00ed
        L_0x0054:
            java.lang.String r4 = "transitionPathRotate"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x005d
            goto L_0x0044
        L_0x005d:
            r4 = 12
            goto L_0x00ed
        L_0x0061:
            java.lang.String r4 = "elevation"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x006a
            goto L_0x0044
        L_0x006a:
            r4 = 11
            goto L_0x00ed
        L_0x006e:
            java.lang.String r4 = "rotation"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0077
            goto L_0x0044
        L_0x0077:
            r4 = 10
            goto L_0x00ed
        L_0x007b:
            java.lang.String r4 = "transformPivotY"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0084
            goto L_0x0044
        L_0x0084:
            r4 = 9
            goto L_0x00ed
        L_0x0088:
            java.lang.String r4 = "transformPivotX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0091
            goto L_0x0044
        L_0x0091:
            r4 = 8
            goto L_0x00ed
        L_0x0094:
            java.lang.String r5 = "scaleY"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x00ed
            goto L_0x0044
        L_0x009d:
            java.lang.String r4 = "scaleX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00a6
            goto L_0x0044
        L_0x00a6:
            r4 = 6
            goto L_0x00ed
        L_0x00a8:
            java.lang.String r4 = "progress"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00b1
            goto L_0x0044
        L_0x00b1:
            r4 = 5
            goto L_0x00ed
        L_0x00b3:
            java.lang.String r4 = "translationZ"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00bc
            goto L_0x0044
        L_0x00bc:
            r4 = 4
            goto L_0x00ed
        L_0x00be:
            java.lang.String r4 = "translationY"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00c8
            goto L_0x0044
        L_0x00c8:
            r4 = 3
            goto L_0x00ed
        L_0x00ca:
            java.lang.String r4 = "translationX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00d4
            goto L_0x0044
        L_0x00d4:
            r4 = 2
            goto L_0x00ed
        L_0x00d6:
            java.lang.String r4 = "rotationY"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00e0
            goto L_0x0044
        L_0x00e0:
            r4 = 1
            goto L_0x00ed
        L_0x00e2:
            java.lang.String r4 = "rotationX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00ec
            goto L_0x0044
        L_0x00ec:
            r4 = 0
        L_0x00ed:
            switch(r4) {
                case 0: goto L_0x01cf;
                case 1: goto L_0x01be;
                case 2: goto L_0x01ad;
                case 3: goto L_0x019c;
                case 4: goto L_0x018b;
                case 5: goto L_0x017a;
                case 6: goto L_0x0169;
                case 7: goto L_0x0158;
                case 8: goto L_0x0147;
                case 9: goto L_0x0136;
                case 10: goto L_0x0125;
                case 11: goto L_0x0114;
                case 12: goto L_0x0103;
                case 13: goto L_0x00f2;
                default: goto L_0x00f0;
            }
        L_0x00f0:
            goto L_0x0008
        L_0x00f2:
            float r1 = r6.f8385j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f20100a
            float r3 = r6.f8385j
            r2.mo18740c(r1, r3)
            goto L_0x0008
        L_0x0103:
            float r1 = r6.f8392q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f20100a
            float r3 = r6.f8392q
            r2.mo18740c(r1, r3)
            goto L_0x0008
        L_0x0114:
            float r1 = r6.f8386k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f20100a
            float r3 = r6.f8386k
            r2.mo18740c(r1, r3)
            goto L_0x0008
        L_0x0125:
            float r1 = r6.f8387l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f20100a
            float r3 = r6.f8387l
            r2.mo18740c(r1, r3)
            goto L_0x0008
        L_0x0136:
            float r1 = r6.f8389n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f20100a
            float r3 = r6.f8391p
            r2.mo18740c(r1, r3)
            goto L_0x0008
        L_0x0147:
            float r1 = r6.f8388m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f20100a
            float r3 = r6.f8390o
            r2.mo18740c(r1, r3)
            goto L_0x0008
        L_0x0158:
            float r1 = r6.f8394s
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f20100a
            float r3 = r6.f8394s
            r2.mo18740c(r1, r3)
            goto L_0x0008
        L_0x0169:
            float r1 = r6.f8393r
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f20100a
            float r3 = r6.f8393r
            r2.mo18740c(r1, r3)
            goto L_0x0008
        L_0x017a:
            float r1 = r6.f8398w
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f20100a
            float r3 = r6.f8398w
            r2.mo18740c(r1, r3)
            goto L_0x0008
        L_0x018b:
            float r1 = r6.f8397v
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f20100a
            float r3 = r6.f8397v
            r2.mo18740c(r1, r3)
            goto L_0x0008
        L_0x019c:
            float r1 = r6.f8396u
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f20100a
            float r3 = r6.f8396u
            r2.mo18740c(r1, r3)
            goto L_0x0008
        L_0x01ad:
            float r1 = r6.f8395t
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f20100a
            float r3 = r6.f8395t
            r2.mo18740c(r1, r3)
            goto L_0x0008
        L_0x01be:
            float r1 = r6.f8389n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f20100a
            float r3 = r6.f8389n
            r2.mo18740c(r1, r3)
            goto L_0x0008
        L_0x01cf:
            float r1 = r6.f8388m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f20100a
            float r3 = r6.f8388m
            r2.mo18740c(r1, r3)
            goto L_0x0008
        L_0x01e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ca3.mo12028a(java.util.HashMap):void");
    }

    /* renamed from: b */
    public y93 clone() {
        return new ca3().mo12030c(this);
    }

    /* renamed from: c */
    public y93 mo12030c(y93 y93) {
        super.mo12030c(y93);
        ca3 ca3 = (ca3) y93;
        this.f8383h = ca3.f8383h;
        this.f8384i = ca3.f8384i;
        this.f8385j = ca3.f8385j;
        this.f8386k = ca3.f8386k;
        this.f8387l = ca3.f8387l;
        this.f8388m = ca3.f8388m;
        this.f8389n = ca3.f8389n;
        this.f8390o = ca3.f8390o;
        this.f8391p = ca3.f8391p;
        this.f8392q = ca3.f8392q;
        this.f8393r = ca3.f8393r;
        this.f8394s = ca3.f8394s;
        this.f8395t = ca3.f8395t;
        this.f8396u = ca3.f8396u;
        this.f8397v = ca3.f8397v;
        this.f8398w = ca3.f8398w;
        return this;
    }

    /* renamed from: d */
    public void mo12032d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f8385j)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f8386k)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f8387l)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f8388m)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f8389n)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f8390o)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f8391p)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f8395t)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f8396u)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f8397v)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f8392q)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f8393r)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f8394s)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f8398w)) {
            hashSet.add("progress");
        }
        if (this.f20104e.size() > 0) {
            for (String str : this.f20104e.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    /* renamed from: e */
    public void mo12033e(Context context, AttributeSet attributeSet) {
        C1673a.m11815a(this, context.obtainStyledAttributes(attributeSet, c65.KeyAttribute));
    }

    /* renamed from: h */
    public void mo12034h(HashMap<String, Integer> hashMap) {
        if (this.f8383h != -1) {
            if (!Float.isNaN(this.f8385j)) {
                hashMap.put("alpha", Integer.valueOf(this.f8383h));
            }
            if (!Float.isNaN(this.f8386k)) {
                hashMap.put("elevation", Integer.valueOf(this.f8383h));
            }
            if (!Float.isNaN(this.f8387l)) {
                hashMap.put("rotation", Integer.valueOf(this.f8383h));
            }
            if (!Float.isNaN(this.f8388m)) {
                hashMap.put("rotationX", Integer.valueOf(this.f8383h));
            }
            if (!Float.isNaN(this.f8389n)) {
                hashMap.put("rotationY", Integer.valueOf(this.f8383h));
            }
            if (!Float.isNaN(this.f8390o)) {
                hashMap.put("transformPivotX", Integer.valueOf(this.f8383h));
            }
            if (!Float.isNaN(this.f8391p)) {
                hashMap.put("transformPivotY", Integer.valueOf(this.f8383h));
            }
            if (!Float.isNaN(this.f8395t)) {
                hashMap.put("translationX", Integer.valueOf(this.f8383h));
            }
            if (!Float.isNaN(this.f8396u)) {
                hashMap.put("translationY", Integer.valueOf(this.f8383h));
            }
            if (!Float.isNaN(this.f8397v)) {
                hashMap.put("translationZ", Integer.valueOf(this.f8383h));
            }
            if (!Float.isNaN(this.f8392q)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f8383h));
            }
            if (!Float.isNaN(this.f8393r)) {
                hashMap.put("scaleX", Integer.valueOf(this.f8383h));
            }
            if (!Float.isNaN(this.f8394s)) {
                hashMap.put("scaleY", Integer.valueOf(this.f8383h));
            }
            if (!Float.isNaN(this.f8398w)) {
                hashMap.put("progress", Integer.valueOf(this.f8383h));
            }
            if (this.f20104e.size() > 0) {
                for (String str : this.f20104e.keySet()) {
                    hashMap.put("CUSTOM," + str, Integer.valueOf(this.f8383h));
                }
            }
        }
    }
}
