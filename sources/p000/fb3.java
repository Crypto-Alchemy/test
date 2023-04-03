package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: fb3 */
/* compiled from: KeyTrigger */
public class fb3 extends y93 {

    /* renamed from: A */
    public HashMap<String, Method> f11691A;

    /* renamed from: g */
    public int f11692g = -1;

    /* renamed from: h */
    public String f11693h = null;

    /* renamed from: i */
    public int f11694i;

    /* renamed from: j */
    public String f11695j;

    /* renamed from: k */
    public String f11696k;

    /* renamed from: l */
    public int f11697l;

    /* renamed from: m */
    public int f11698m;

    /* renamed from: n */
    public View f11699n;

    /* renamed from: o */
    public float f11700o;

    /* renamed from: p */
    public boolean f11701p;

    /* renamed from: q */
    public boolean f11702q;

    /* renamed from: r */
    public boolean f11703r;

    /* renamed from: s */
    public float f11704s;

    /* renamed from: t */
    public float f11705t;

    /* renamed from: u */
    public boolean f11706u;

    /* renamed from: v */
    public int f11707v;

    /* renamed from: w */
    public int f11708w;

    /* renamed from: x */
    public int f11709x;

    /* renamed from: y */
    public RectF f11710y;

    /* renamed from: z */
    public RectF f11711z;

    /* renamed from: fb3$a */
    /* compiled from: KeyTrigger */
    public static class C2284a {

        /* renamed from: a */
        public static SparseIntArray f11712a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f11712a = sparseIntArray;
            sparseIntArray.append(c65.KeyTrigger_framePosition, 8);
            f11712a.append(c65.KeyTrigger_onCross, 4);
            f11712a.append(c65.KeyTrigger_onNegativeCross, 1);
            f11712a.append(c65.KeyTrigger_onPositiveCross, 2);
            f11712a.append(c65.KeyTrigger_motionTarget, 7);
            f11712a.append(c65.KeyTrigger_triggerId, 6);
            f11712a.append(c65.KeyTrigger_triggerSlack, 5);
            f11712a.append(c65.KeyTrigger_motion_triggerOnCollision, 9);
            f11712a.append(c65.KeyTrigger_motion_postLayoutCollision, 10);
            f11712a.append(c65.KeyTrigger_triggerReceiver, 11);
            f11712a.append(c65.KeyTrigger_viewTransitionOnCross, 12);
            f11712a.append(c65.KeyTrigger_viewTransitionOnNegativeCross, 13);
            f11712a.append(c65.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }

        /* renamed from: a */
        public static void m16849a(fb3 fb3, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f11712a.get(index)) {
                    case 1:
                        String unused = fb3.f11695j = typedArray.getString(index);
                        break;
                    case 2:
                        String unused2 = fb3.f11696k = typedArray.getString(index);
                        break;
                    case 4:
                        String unused3 = fb3.f11693h = typedArray.getString(index);
                        break;
                    case 5:
                        fb3.f11700o = typedArray.getFloat(index, fb3.f11700o);
                        break;
                    case 6:
                        int unused4 = fb3.f11697l = typedArray.getResourceId(index, fb3.f11697l);
                        break;
                    case 7:
                        if (!MotionLayout.f2682P2) {
                            if (typedArray.peekValue(index).type != 3) {
                                fb3.f20101b = typedArray.getResourceId(index, fb3.f20101b);
                                break;
                            } else {
                                fb3.f20102c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, fb3.f20101b);
                            fb3.f20101b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                fb3.f20102c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 8:
                        int integer = typedArray.getInteger(index, fb3.f20100a);
                        fb3.f20100a = integer;
                        float unused5 = fb3.f11704s = (((float) integer) + 0.5f) / 100.0f;
                        break;
                    case 9:
                        int unused6 = fb3.f11698m = typedArray.getResourceId(index, fb3.f11698m);
                        break;
                    case 10:
                        boolean unused7 = fb3.f11706u = typedArray.getBoolean(index, fb3.f11706u);
                        break;
                    case 11:
                        int unused8 = fb3.f11694i = typedArray.getResourceId(index, fb3.f11694i);
                        break;
                    case 12:
                        fb3.f11709x = typedArray.getResourceId(index, fb3.f11709x);
                        break;
                    case 13:
                        fb3.f11707v = typedArray.getResourceId(index, fb3.f11707v);
                        break;
                    case 14:
                        fb3.f11708w = typedArray.getResourceId(index, fb3.f11708w);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f11712a.get(index));
                        break;
                }
            }
        }
    }

    public fb3() {
        int i = y93.f20099f;
        this.f11694i = i;
        this.f11695j = null;
        this.f11696k = null;
        this.f11697l = i;
        this.f11698m = i;
        this.f11699n = null;
        this.f11700o = 0.1f;
        this.f11701p = true;
        this.f11702q = true;
        this.f11703r = true;
        this.f11704s = Float.NaN;
        this.f11706u = false;
        this.f11707v = i;
        this.f11708w = i;
        this.f11709x = i;
        this.f11710y = new RectF();
        this.f11711z = new RectF();
        this.f11691A = new HashMap<>();
        this.f20103d = 5;
        this.f20104e = new HashMap<>();
    }

    /* renamed from: A */
    public final void mo19847A(String str, View view) {
        boolean z;
        ConstraintAttribute constraintAttribute;
        if (str.length() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String next : this.f20104e.keySet()) {
            String lowerCase = next.toLowerCase(Locale.ROOT);
            if ((z || lowerCase.matches(str)) && (constraintAttribute = this.f20104e.get(next)) != null) {
                constraintAttribute.mo5037a(view);
            }
        }
    }

    /* renamed from: B */
    public final void mo19848B(RectF rectF, View view, boolean z) {
        rectF.top = (float) view.getTop();
        rectF.bottom = (float) view.getBottom();
        rectF.left = (float) view.getLeft();
        rectF.right = (float) view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    /* renamed from: a */
    public void mo12028a(HashMap<String, de7> hashMap) {
    }

    /* renamed from: b */
    public y93 clone() {
        return new fb3().mo12030c(this);
    }

    /* renamed from: c */
    public y93 mo12030c(y93 y93) {
        super.mo12030c(y93);
        fb3 fb3 = (fb3) y93;
        this.f11692g = fb3.f11692g;
        this.f11693h = fb3.f11693h;
        this.f11694i = fb3.f11694i;
        this.f11695j = fb3.f11695j;
        this.f11696k = fb3.f11696k;
        this.f11697l = fb3.f11697l;
        this.f11698m = fb3.f11698m;
        this.f11699n = fb3.f11699n;
        this.f11700o = fb3.f11700o;
        this.f11701p = fb3.f11701p;
        this.f11702q = fb3.f11702q;
        this.f11703r = fb3.f11703r;
        this.f11704s = fb3.f11704s;
        this.f11705t = fb3.f11705t;
        this.f11706u = fb3.f11706u;
        this.f11710y = fb3.f11710y;
        this.f11711z = fb3.f11711z;
        this.f11691A = fb3.f11691A;
        return this;
    }

    /* renamed from: d */
    public void mo12032d(HashSet<String> hashSet) {
    }

    /* renamed from: e */
    public void mo12033e(Context context, AttributeSet attributeSet) {
        C2284a.m16849a(this, context.obtainStyledAttributes(attributeSet, c65.KeyTrigger), context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19849y(float r10, android.view.View r11) {
        /*
            r9 = this;
            int r0 = r9.f11698m
            int r1 = p000.y93.f20099f
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x0062
            android.view.View r0 = r9.f11699n
            if (r0 != 0) goto L_0x001a
            android.view.ViewParent r0 = r11.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r9.f11698m
            android.view.View r0 = r0.findViewById(r1)
            r9.f11699n = r0
        L_0x001a:
            android.graphics.RectF r0 = r9.f11710y
            android.view.View r1 = r9.f11699n
            boolean r4 = r9.f11706u
            r9.mo19848B(r0, r1, r4)
            android.graphics.RectF r0 = r9.f11711z
            boolean r1 = r9.f11706u
            r9.mo19848B(r0, r11, r1)
            android.graphics.RectF r0 = r9.f11710y
            android.graphics.RectF r1 = r9.f11711z
            boolean r0 = r0.intersect(r1)
            if (r0 == 0) goto L_0x004c
            boolean r0 = r9.f11701p
            if (r0 == 0) goto L_0x003c
            r9.f11701p = r2
            r0 = r3
            goto L_0x003d
        L_0x003c:
            r0 = r2
        L_0x003d:
            boolean r1 = r9.f11703r
            if (r1 == 0) goto L_0x0045
            r9.f11703r = r2
            r1 = r3
            goto L_0x0046
        L_0x0045:
            r1 = r2
        L_0x0046:
            r9.f11702q = r3
            r4 = r1
            r1 = r2
            goto L_0x00e0
        L_0x004c:
            boolean r0 = r9.f11701p
            if (r0 != 0) goto L_0x0054
            r9.f11701p = r3
            r0 = r3
            goto L_0x0055
        L_0x0054:
            r0 = r2
        L_0x0055:
            boolean r1 = r9.f11702q
            if (r1 == 0) goto L_0x005d
            r9.f11702q = r2
            r1 = r3
            goto L_0x005e
        L_0x005d:
            r1 = r2
        L_0x005e:
            r9.f11703r = r3
            goto L_0x00df
        L_0x0062:
            boolean r0 = r9.f11701p
            r1 = 0
            if (r0 == 0) goto L_0x0077
            float r0 = r9.f11704s
            float r4 = r10 - r0
            float r5 = r9.f11705t
            float r5 = r5 - r0
            float r4 = r4 * r5
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0087
            r9.f11701p = r2
            r0 = r3
            goto L_0x0088
        L_0x0077:
            float r0 = r9.f11704s
            float r0 = r10 - r0
            float r0 = java.lang.Math.abs(r0)
            float r4 = r9.f11700o
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0087
            r9.f11701p = r3
        L_0x0087:
            r0 = r2
        L_0x0088:
            boolean r4 = r9.f11702q
            if (r4 == 0) goto L_0x00a0
            float r4 = r9.f11704s
            float r5 = r10 - r4
            float r6 = r9.f11705t
            float r6 = r6 - r4
            float r6 = r6 * r5
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b0
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b0
            r9.f11702q = r2
            r4 = r3
            goto L_0x00b1
        L_0x00a0:
            float r4 = r9.f11704s
            float r4 = r10 - r4
            float r4 = java.lang.Math.abs(r4)
            float r5 = r9.f11700o
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b0
            r9.f11702q = r3
        L_0x00b0:
            r4 = r2
        L_0x00b1:
            boolean r5 = r9.f11703r
            if (r5 == 0) goto L_0x00ce
            float r5 = r9.f11704s
            float r6 = r10 - r5
            float r7 = r9.f11705t
            float r7 = r7 - r5
            float r7 = r7 * r6
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x00c9
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00c9
            r9.f11703r = r2
            r1 = r3
            goto L_0x00ca
        L_0x00c9:
            r1 = r2
        L_0x00ca:
            r8 = r4
            r4 = r1
            r1 = r8
            goto L_0x00e0
        L_0x00ce:
            float r1 = r9.f11704s
            float r1 = r10 - r1
            float r1 = java.lang.Math.abs(r1)
            float r5 = r9.f11700o
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00de
            r9.f11703r = r3
        L_0x00de:
            r1 = r4
        L_0x00df:
            r4 = r2
        L_0x00e0:
            r9.f11705t = r10
            if (r1 != 0) goto L_0x00e8
            if (r0 != 0) goto L_0x00e8
            if (r4 == 0) goto L_0x00f3
        L_0x00e8:
            android.view.ViewParent r5 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r5 = (androidx.constraintlayout.motion.widget.MotionLayout) r5
            int r6 = r9.f11697l
            r5.mo4670d0(r6, r4, r10)
        L_0x00f3:
            int r10 = r9.f11694i
            int r5 = p000.y93.f20099f
            if (r10 != r5) goto L_0x00fb
            r10 = r11
            goto L_0x0107
        L_0x00fb:
            android.view.ViewParent r10 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r10 = (androidx.constraintlayout.motion.widget.MotionLayout) r10
            int r5 = r9.f11694i
            android.view.View r10 = r10.findViewById(r5)
        L_0x0107:
            if (r1 == 0) goto L_0x0125
            java.lang.String r1 = r9.f11695j
            if (r1 == 0) goto L_0x0110
            r9.mo19850z(r1, r10)
        L_0x0110:
            int r1 = r9.f11707v
            int r5 = p000.y93.f20099f
            if (r1 == r5) goto L_0x0125
            android.view.ViewParent r1 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r1 = (androidx.constraintlayout.motion.widget.MotionLayout) r1
            int r5 = r9.f11707v
            android.view.View[] r6 = new android.view.View[r3]
            r6[r2] = r10
            r1.mo4657C0(r5, r6)
        L_0x0125:
            if (r4 == 0) goto L_0x0143
            java.lang.String r1 = r9.f11696k
            if (r1 == 0) goto L_0x012e
            r9.mo19850z(r1, r10)
        L_0x012e:
            int r1 = r9.f11708w
            int r4 = p000.y93.f20099f
            if (r1 == r4) goto L_0x0143
            android.view.ViewParent r1 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r1 = (androidx.constraintlayout.motion.widget.MotionLayout) r1
            int r4 = r9.f11708w
            android.view.View[] r5 = new android.view.View[r3]
            r5[r2] = r10
            r1.mo4657C0(r4, r5)
        L_0x0143:
            if (r0 == 0) goto L_0x0161
            java.lang.String r0 = r9.f11693h
            if (r0 == 0) goto L_0x014c
            r9.mo19850z(r0, r10)
        L_0x014c:
            int r0 = r9.f11709x
            int r1 = p000.y93.f20099f
            if (r0 == r1) goto L_0x0161
            android.view.ViewParent r11 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r11 = (androidx.constraintlayout.motion.widget.MotionLayout) r11
            int r0 = r9.f11709x
            android.view.View[] r1 = new android.view.View[r3]
            r1[r2] = r10
            r11.mo4657C0(r0, r1)
        L_0x0161:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.fb3.mo19849y(float, android.view.View):void");
    }

    /* renamed from: z */
    public final void mo19850z(String str, View view) {
        Method method;
        if (str != null) {
            if (str.startsWith(".")) {
                mo19847A(str, view);
                return;
            }
            if (this.f11691A.containsKey(str)) {
                method = this.f11691A.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, new Class[0]);
                    this.f11691A.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.f11691A.put(str, (Object) null);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not find method \"");
                    sb.append(str);
                    sb.append("\"on class ");
                    sb.append(view.getClass().getSimpleName());
                    sb.append(" ");
                    sb.append(t21.m27246d(view));
                    return;
                }
            }
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception unused2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Exception in call \"");
                sb2.append(this.f11693h);
                sb2.append("\"on class ");
                sb2.append(view.getClass().getSimpleName());
                sb2.append(" ");
                sb2.append(t21.m27246d(view));
            }
        }
    }
}
