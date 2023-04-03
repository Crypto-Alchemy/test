package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.github.mikephil.charting.utils.Utils;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: eb3 */
/* compiled from: KeyTimeCycle */
public class eb3 extends y93 {

    /* renamed from: g */
    public String f11106g;

    /* renamed from: h */
    public int f11107h = -1;

    /* renamed from: i */
    public float f11108i = Float.NaN;

    /* renamed from: j */
    public float f11109j = Float.NaN;

    /* renamed from: k */
    public float f11110k = Float.NaN;

    /* renamed from: l */
    public float f11111l = Float.NaN;

    /* renamed from: m */
    public float f11112m = Float.NaN;

    /* renamed from: n */
    public float f11113n = Float.NaN;

    /* renamed from: o */
    public float f11114o = Float.NaN;

    /* renamed from: p */
    public float f11115p = Float.NaN;

    /* renamed from: q */
    public float f11116q = Float.NaN;

    /* renamed from: r */
    public float f11117r = Float.NaN;

    /* renamed from: s */
    public float f11118s = Float.NaN;

    /* renamed from: t */
    public float f11119t = Float.NaN;

    /* renamed from: u */
    public int f11120u = 0;

    /* renamed from: v */
    public String f11121v = null;

    /* renamed from: w */
    public float f11122w = Float.NaN;

    /* renamed from: x */
    public float f11123x = Utils.FLOAT_EPSILON;

    /* renamed from: eb3$a */
    /* compiled from: KeyTimeCycle */
    public static class C2217a {

        /* renamed from: a */
        public static SparseIntArray f11124a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f11124a = sparseIntArray;
            sparseIntArray.append(c65.KeyTimeCycle_android_alpha, 1);
            f11124a.append(c65.KeyTimeCycle_android_elevation, 2);
            f11124a.append(c65.KeyTimeCycle_android_rotation, 4);
            f11124a.append(c65.KeyTimeCycle_android_rotationX, 5);
            f11124a.append(c65.KeyTimeCycle_android_rotationY, 6);
            f11124a.append(c65.KeyTimeCycle_android_scaleX, 7);
            f11124a.append(c65.KeyTimeCycle_transitionPathRotate, 8);
            f11124a.append(c65.KeyTimeCycle_transitionEasing, 9);
            f11124a.append(c65.KeyTimeCycle_motionTarget, 10);
            f11124a.append(c65.KeyTimeCycle_framePosition, 12);
            f11124a.append(c65.KeyTimeCycle_curveFit, 13);
            f11124a.append(c65.KeyTimeCycle_android_scaleY, 14);
            f11124a.append(c65.KeyTimeCycle_android_translationX, 15);
            f11124a.append(c65.KeyTimeCycle_android_translationY, 16);
            f11124a.append(c65.KeyTimeCycle_android_translationZ, 17);
            f11124a.append(c65.KeyTimeCycle_motionProgress, 18);
            f11124a.append(c65.KeyTimeCycle_wavePeriod, 20);
            f11124a.append(c65.KeyTimeCycle_waveOffset, 21);
            f11124a.append(c65.KeyTimeCycle_waveShape, 19);
        }

        /* renamed from: a */
        public static void m16053a(eb3 eb3, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f11124a.get(index)) {
                    case 1:
                        float unused = eb3.f11108i = typedArray.getFloat(index, eb3.f11108i);
                        break;
                    case 2:
                        float unused2 = eb3.f11109j = typedArray.getDimension(index, eb3.f11109j);
                        break;
                    case 4:
                        float unused3 = eb3.f11110k = typedArray.getFloat(index, eb3.f11110k);
                        break;
                    case 5:
                        float unused4 = eb3.f11111l = typedArray.getFloat(index, eb3.f11111l);
                        break;
                    case 6:
                        float unused5 = eb3.f11112m = typedArray.getFloat(index, eb3.f11112m);
                        break;
                    case 7:
                        float unused6 = eb3.f11114o = typedArray.getFloat(index, eb3.f11114o);
                        break;
                    case 8:
                        float unused7 = eb3.f11113n = typedArray.getFloat(index, eb3.f11113n);
                        break;
                    case 9:
                        String unused8 = eb3.f11106g = typedArray.getString(index);
                        break;
                    case 10:
                        if (!MotionLayout.f2682P2) {
                            if (typedArray.peekValue(index).type != 3) {
                                eb3.f20101b = typedArray.getResourceId(index, eb3.f20101b);
                                break;
                            } else {
                                eb3.f20102c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, eb3.f20101b);
                            eb3.f20101b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                eb3.f20102c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 12:
                        eb3.f20100a = typedArray.getInt(index, eb3.f20100a);
                        break;
                    case 13:
                        int unused9 = eb3.f11107h = typedArray.getInteger(index, eb3.f11107h);
                        break;
                    case 14:
                        float unused10 = eb3.f11115p = typedArray.getFloat(index, eb3.f11115p);
                        break;
                    case 15:
                        float unused11 = eb3.f11116q = typedArray.getDimension(index, eb3.f11116q);
                        break;
                    case 16:
                        float unused12 = eb3.f11117r = typedArray.getDimension(index, eb3.f11117r);
                        break;
                    case 17:
                        float unused13 = eb3.f11118s = typedArray.getDimension(index, eb3.f11118s);
                        break;
                    case 18:
                        float unused14 = eb3.f11119t = typedArray.getFloat(index, eb3.f11119t);
                        break;
                    case 19:
                        if (typedArray.peekValue(index).type != 3) {
                            int unused15 = eb3.f11120u = typedArray.getInt(index, eb3.f11120u);
                            break;
                        } else {
                            String unused16 = eb3.f11121v = typedArray.getString(index);
                            int unused17 = eb3.f11120u = 7;
                            break;
                        }
                    case 20:
                        float unused18 = eb3.f11122w = typedArray.getFloat(index, eb3.f11122w);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type != 5) {
                            float unused19 = eb3.f11123x = typedArray.getFloat(index, eb3.f11123x);
                            break;
                        } else {
                            float unused20 = eb3.f11123x = typedArray.getDimension(index, eb3.f11123x);
                            break;
                        }
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f11124a.get(index));
                        break;
                }
            }
        }
    }

    public eb3() {
        this.f20103d = 3;
        this.f20104e = new HashMap<>();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0089, code lost:
        if (r1.equals("scaleY") == false) goto L_0x004d;
     */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19222U(java.util.HashMap<java.lang.String, p000.je7> r11) {
        /*
            r10 = this;
            java.util.Set r0 = r11.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0204
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r11.get(r1)
            r3 = r2
            je7 r3 = (p000.je7) r3
            if (r3 != 0) goto L_0x001e
            goto L_0x0008
        L_0x001e:
            java.lang.String r2 = "CUSTOM"
            boolean r2 = r1.startsWith(r2)
            r4 = 7
            if (r2 == 0) goto L_0x0045
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r10.f20104e
            java.lang.Object r1 = r2.get(r1)
            r6 = r1
            androidx.constraintlayout.widget.ConstraintAttribute r6 = (androidx.constraintlayout.widget.ConstraintAttribute) r6
            if (r6 == 0) goto L_0x0008
            r4 = r3
            je7$b r4 = (p000.je7.C2588b) r4
            int r5 = r10.f20100a
            float r7 = r10.f11122w
            int r8 = r10.f11120u
            float r9 = r10.f11123x
            r4.mo21819j(r5, r6, r7, r8, r9)
            goto L_0x0008
        L_0x0045:
            r2 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00ce;
                case -1249320805: goto L_0x00c3;
                case -1225497657: goto L_0x00b8;
                case -1225497656: goto L_0x00ad;
                case -1225497655: goto L_0x00a2;
                case -1001078227: goto L_0x0097;
                case -908189618: goto L_0x008c;
                case -908189617: goto L_0x0083;
                case -40300674: goto L_0x0077;
                case -4379043: goto L_0x006a;
                case 37232917: goto L_0x005d;
                case 92909918: goto L_0x0050;
                default: goto L_0x004d;
            }
        L_0x004d:
            r4 = r2
            goto L_0x00d9
        L_0x0050:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0059
            goto L_0x004d
        L_0x0059:
            r4 = 11
            goto L_0x00d9
        L_0x005d:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0066
            goto L_0x004d
        L_0x0066:
            r4 = 10
            goto L_0x00d9
        L_0x006a:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0073
            goto L_0x004d
        L_0x0073:
            r4 = 9
            goto L_0x00d9
        L_0x0077:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0080
            goto L_0x004d
        L_0x0080:
            r4 = 8
            goto L_0x00d9
        L_0x0083:
            java.lang.String r5 = "scaleY"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x00d9
            goto L_0x004d
        L_0x008c:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0095
            goto L_0x004d
        L_0x0095:
            r4 = 6
            goto L_0x00d9
        L_0x0097:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00a0
            goto L_0x004d
        L_0x00a0:
            r4 = 5
            goto L_0x00d9
        L_0x00a2:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00ab
            goto L_0x004d
        L_0x00ab:
            r4 = 4
            goto L_0x00d9
        L_0x00ad:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00b6
            goto L_0x004d
        L_0x00b6:
            r4 = 3
            goto L_0x00d9
        L_0x00b8:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00c1
            goto L_0x004d
        L_0x00c1:
            r4 = 2
            goto L_0x00d9
        L_0x00c3:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00cc
            goto L_0x004d
        L_0x00cc:
            r4 = 1
            goto L_0x00d9
        L_0x00ce:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00d8
            goto L_0x004d
        L_0x00d8:
            r4 = 0
        L_0x00d9:
            switch(r4) {
                case 0: goto L_0x01ed;
                case 1: goto L_0x01d6;
                case 2: goto L_0x01bf;
                case 3: goto L_0x01a8;
                case 4: goto L_0x0191;
                case 5: goto L_0x017a;
                case 6: goto L_0x0163;
                case 7: goto L_0x014c;
                case 8: goto L_0x0135;
                case 9: goto L_0x011e;
                case 10: goto L_0x0107;
                case 11: goto L_0x00f0;
                default: goto L_0x00dc;
            }
        L_0x00dc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN addValues \""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            goto L_0x0008
        L_0x00f0:
            float r1 = r10.f11108i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f20100a
            float r5 = r10.f11108i
            float r6 = r10.f11122w
            int r7 = r10.f11120u
            float r8 = r10.f11123x
            r3.mo20812b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0107:
            float r1 = r10.f11113n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f20100a
            float r5 = r10.f11113n
            float r6 = r10.f11122w
            int r7 = r10.f11120u
            float r8 = r10.f11123x
            r3.mo20812b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x011e:
            float r1 = r10.f11109j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f20100a
            float r5 = r10.f11109j
            float r6 = r10.f11122w
            int r7 = r10.f11120u
            float r8 = r10.f11123x
            r3.mo20812b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0135:
            float r1 = r10.f11110k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f20100a
            float r5 = r10.f11110k
            float r6 = r10.f11122w
            int r7 = r10.f11120u
            float r8 = r10.f11123x
            r3.mo20812b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x014c:
            float r1 = r10.f11115p
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f20100a
            float r5 = r10.f11115p
            float r6 = r10.f11122w
            int r7 = r10.f11120u
            float r8 = r10.f11123x
            r3.mo20812b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0163:
            float r1 = r10.f11114o
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f20100a
            float r5 = r10.f11114o
            float r6 = r10.f11122w
            int r7 = r10.f11120u
            float r8 = r10.f11123x
            r3.mo20812b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x017a:
            float r1 = r10.f11119t
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f20100a
            float r5 = r10.f11119t
            float r6 = r10.f11122w
            int r7 = r10.f11120u
            float r8 = r10.f11123x
            r3.mo20812b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0191:
            float r1 = r10.f11118s
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f20100a
            float r5 = r10.f11118s
            float r6 = r10.f11122w
            int r7 = r10.f11120u
            float r8 = r10.f11123x
            r3.mo20812b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01a8:
            float r1 = r10.f11117r
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f20100a
            float r5 = r10.f11117r
            float r6 = r10.f11122w
            int r7 = r10.f11120u
            float r8 = r10.f11123x
            r3.mo20812b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01bf:
            float r1 = r10.f11116q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f20100a
            float r5 = r10.f11116q
            float r6 = r10.f11122w
            int r7 = r10.f11120u
            float r8 = r10.f11123x
            r3.mo20812b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01d6:
            float r1 = r10.f11112m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f20100a
            float r5 = r10.f11112m
            float r6 = r10.f11122w
            int r7 = r10.f11120u
            float r8 = r10.f11123x
            r3.mo20812b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01ed:
            float r1 = r10.f11111l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f20100a
            float r5 = r10.f11111l
            float r6 = r10.f11122w
            int r7 = r10.f11120u
            float r8 = r10.f11123x
            r3.mo20812b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0204:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.eb3.mo19222U(java.util.HashMap):void");
    }

    /* renamed from: a */
    public void mo12028a(HashMap<String, de7> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    /* renamed from: b */
    public y93 clone() {
        return new eb3().mo12030c(this);
    }

    /* renamed from: c */
    public y93 mo12030c(y93 y93) {
        super.mo12030c(y93);
        eb3 eb3 = (eb3) y93;
        this.f11106g = eb3.f11106g;
        this.f11107h = eb3.f11107h;
        this.f11120u = eb3.f11120u;
        this.f11122w = eb3.f11122w;
        this.f11123x = eb3.f11123x;
        this.f11119t = eb3.f11119t;
        this.f11108i = eb3.f11108i;
        this.f11109j = eb3.f11109j;
        this.f11110k = eb3.f11110k;
        this.f11113n = eb3.f11113n;
        this.f11111l = eb3.f11111l;
        this.f11112m = eb3.f11112m;
        this.f11114o = eb3.f11114o;
        this.f11115p = eb3.f11115p;
        this.f11116q = eb3.f11116q;
        this.f11117r = eb3.f11117r;
        this.f11118s = eb3.f11118s;
        return this;
    }

    /* renamed from: d */
    public void mo12032d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f11108i)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f11109j)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f11110k)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f11111l)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f11112m)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f11116q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f11117r)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f11118s)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f11113n)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f11114o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f11115p)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f11119t)) {
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
        C2217a.m16053a(this, context.obtainStyledAttributes(attributeSet, c65.KeyTimeCycle));
    }

    /* renamed from: h */
    public void mo12034h(HashMap<String, Integer> hashMap) {
        if (this.f11107h != -1) {
            if (!Float.isNaN(this.f11108i)) {
                hashMap.put("alpha", Integer.valueOf(this.f11107h));
            }
            if (!Float.isNaN(this.f11109j)) {
                hashMap.put("elevation", Integer.valueOf(this.f11107h));
            }
            if (!Float.isNaN(this.f11110k)) {
                hashMap.put("rotation", Integer.valueOf(this.f11107h));
            }
            if (!Float.isNaN(this.f11111l)) {
                hashMap.put("rotationX", Integer.valueOf(this.f11107h));
            }
            if (!Float.isNaN(this.f11112m)) {
                hashMap.put("rotationY", Integer.valueOf(this.f11107h));
            }
            if (!Float.isNaN(this.f11116q)) {
                hashMap.put("translationX", Integer.valueOf(this.f11107h));
            }
            if (!Float.isNaN(this.f11117r)) {
                hashMap.put("translationY", Integer.valueOf(this.f11107h));
            }
            if (!Float.isNaN(this.f11118s)) {
                hashMap.put("translationZ", Integer.valueOf(this.f11107h));
            }
            if (!Float.isNaN(this.f11113n)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f11107h));
            }
            if (!Float.isNaN(this.f11114o)) {
                hashMap.put("scaleX", Integer.valueOf(this.f11107h));
            }
            if (!Float.isNaN(this.f11114o)) {
                hashMap.put("scaleY", Integer.valueOf(this.f11107h));
            }
            if (!Float.isNaN(this.f11119t)) {
                hashMap.put("progress", Integer.valueOf(this.f11107h));
            }
            if (this.f20104e.size() > 0) {
                for (String str : this.f20104e.keySet()) {
                    hashMap.put("CUSTOM," + str, Integer.valueOf(this.f11107h));
                }
            }
        }
    }
}
