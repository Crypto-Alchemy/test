package p000;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.C0532a;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.mikephil.charting.utils.Utils;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: jy3 */
/* compiled from: MotionController */
public class jy3 {

    /* renamed from: A */
    public HashMap<String, je7> f13902A;

    /* renamed from: B */
    public HashMap<String, de7> f13903B;

    /* renamed from: C */
    public HashMap<String, kd7> f13904C;

    /* renamed from: D */
    public fb3[] f13905D;

    /* renamed from: E */
    public int f13906E;

    /* renamed from: F */
    public int f13907F;

    /* renamed from: G */
    public View f13908G;

    /* renamed from: H */
    public int f13909H;

    /* renamed from: I */
    public float f13910I;

    /* renamed from: J */
    public Interpolator f13911J;

    /* renamed from: K */
    public boolean f13912K;

    /* renamed from: a */
    public Rect f13913a = new Rect();

    /* renamed from: b */
    public View f13914b;

    /* renamed from: c */
    public int f13915c;

    /* renamed from: d */
    public String f13916d;

    /* renamed from: e */
    public int f13917e = -1;

    /* renamed from: f */
    public ty3 f13918f = new ty3();

    /* renamed from: g */
    public ty3 f13919g = new ty3();

    /* renamed from: h */
    public iy3 f13920h = new iy3();

    /* renamed from: i */
    public iy3 f13921i = new iy3();

    /* renamed from: j */
    public ux0[] f13922j;

    /* renamed from: k */
    public ux0 f13923k;

    /* renamed from: l */
    public float f13924l = Float.NaN;

    /* renamed from: m */
    public float f13925m = Utils.FLOAT_EPSILON;

    /* renamed from: n */
    public float f13926n = 1.0f;

    /* renamed from: o */
    public float f13927o;

    /* renamed from: p */
    public float f13928p;

    /* renamed from: q */
    public int[] f13929q;

    /* renamed from: r */
    public double[] f13930r;

    /* renamed from: s */
    public double[] f13931s;

    /* renamed from: t */
    public String[] f13932t;

    /* renamed from: u */
    public int[] f13933u;

    /* renamed from: v */
    public int f13934v = 4;

    /* renamed from: w */
    public float[] f13935w = new float[4];

    /* renamed from: x */
    public ArrayList<ty3> f13936x = new ArrayList<>();

    /* renamed from: y */
    public float[] f13937y = new float[1];

    /* renamed from: z */
    public ArrayList<y93> f13938z = new ArrayList<>();

    /* renamed from: jy3$a */
    /* compiled from: MotionController */
    public static class C2639a implements Interpolator {

        /* renamed from: a */
        public final /* synthetic */ ym1 f13939a;

        public C2639a(ym1 ym1) {
            this.f13939a = ym1;
        }

        public float getInterpolation(float f) {
            return (float) this.f13939a.mo21311a((double) f);
        }
    }

    public jy3(View view) {
        int i = y93.f20099f;
        this.f13906E = i;
        this.f13907F = i;
        this.f13908G = null;
        this.f13909H = i;
        this.f13910I = Float.NaN;
        this.f13911J = null;
        this.f13912K = false;
        mo22109G(view);
    }

    /* renamed from: p */
    public static Interpolator m20438p(Context context, int i, String str, int i2) {
        if (i == -2) {
            return AnimationUtils.loadInterpolator(context, i2);
        }
        if (i == -1) {
            return new C2639a(ym1.m30704c(str));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i != 5) {
            return null;
        }
        return new OvershootInterpolator();
    }

    /* renamed from: A */
    public void mo22103A(View view) {
        ty3 ty3 = this.f13918f;
        ty3.f18325e = Utils.FLOAT_EPSILON;
        ty3.f18326g = Utils.FLOAT_EPSILON;
        this.f13912K = true;
        ty3.mo26612w(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.f13919g.mo26612w(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.f13920h.mo21664o(view);
        this.f13921i.mo21664o(view);
    }

    /* renamed from: B */
    public void mo22104B(Rect rect, C0532a aVar, int i, int i2) {
        int i3 = aVar.f3216d;
        if (i3 != 0) {
            mo22137z(rect, this.f13913a, i3, i, i2);
            rect = this.f13913a;
        }
        ty3 ty3 = this.f13919g;
        ty3.f18325e = 1.0f;
        ty3.f18326g = 1.0f;
        mo22136y(ty3);
        this.f13919g.mo26612w((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        this.f13919g.mo26596a(aVar.mo5171z(this.f13915c));
        this.f13921i.mo21663m(rect, aVar, i3, this.f13915c);
    }

    /* renamed from: C */
    public void mo22105C(int i) {
        this.f13906E = i;
    }

    /* renamed from: D */
    public void mo22106D(View view) {
        ty3 ty3 = this.f13918f;
        ty3.f18325e = Utils.FLOAT_EPSILON;
        ty3.f18326g = Utils.FLOAT_EPSILON;
        ty3.mo26612w(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.f13920h.mo21664o(view);
    }

    /* renamed from: E */
    public void mo22107E(ee7 ee7, View view, int i, int i2, int i3) {
        ty3 ty3 = this.f13918f;
        ty3.f18325e = Utils.FLOAT_EPSILON;
        ty3.f18326g = Utils.FLOAT_EPSILON;
        Rect rect = new Rect();
        if (i == 1) {
            int i4 = ee7.f11142b + ee7.f11144d;
            rect.left = ((ee7.f11143c + ee7.f11145e) - ee7.mo19240b()) / 2;
            rect.top = i2 - ((i4 + ee7.mo19239a()) / 2);
            rect.right = rect.left + ee7.mo19240b();
            rect.bottom = rect.top + ee7.mo19239a();
        } else if (i == 2) {
            int i5 = ee7.f11142b + ee7.f11144d;
            rect.left = i3 - (((ee7.f11143c + ee7.f11145e) + ee7.mo19240b()) / 2);
            rect.top = (i5 - ee7.mo19239a()) / 2;
            rect.right = rect.left + ee7.mo19240b();
            rect.bottom = rect.top + ee7.mo19239a();
        }
        this.f13918f.mo26612w((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        this.f13920h.mo21662l(rect, view, i, ee7.f11141a);
    }

    /* renamed from: F */
    public void mo22108F(Rect rect, C0532a aVar, int i, int i2) {
        int i3 = aVar.f3216d;
        if (i3 != 0) {
            mo22137z(rect, this.f13913a, i3, i, i2);
        }
        ty3 ty3 = this.f13918f;
        ty3.f18325e = Utils.FLOAT_EPSILON;
        ty3.f18326g = Utils.FLOAT_EPSILON;
        mo22136y(ty3);
        this.f13918f.mo26612w((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        C0532a.C0533a z = aVar.mo5171z(this.f13915c);
        this.f13918f.mo26596a(z);
        this.f13924l = z.f3223d.f3316g;
        this.f13920h.mo21663m(rect, aVar, i3, this.f13915c);
        this.f13907F = z.f3225f.f3338i;
        C0532a.C0536c cVar = z.f3223d;
        this.f13909H = cVar.f3320k;
        this.f13910I = cVar.f3319j;
        Context context = this.f13914b.getContext();
        C0532a.C0536c cVar2 = z.f3223d;
        this.f13911J = m20438p(context, cVar2.f3322m, cVar2.f3321l, cVar2.f3323n);
    }

    /* renamed from: G */
    public void mo22109G(View view) {
        this.f13914b = view;
        this.f13915c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.f13916d = ((ConstraintLayout.LayoutParams) layoutParams).mo5099a();
        }
    }

    /* renamed from: H */
    public void mo22110H(int i, int i2, float f, long j) {
        ArrayList arrayList;
        String[] strArr;
        boolean z;
        ConstraintAttribute constraintAttribute;
        int i3;
        je7 je7;
        ConstraintAttribute constraintAttribute2;
        int i4;
        Integer num;
        de7 de7;
        ConstraintAttribute constraintAttribute3;
        new HashSet();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashMap hashMap = new HashMap();
        int i5 = this.f13906E;
        if (i5 != y93.f20099f) {
            this.f13918f.f18314B = i5;
        }
        this.f13920h.mo21660h(this.f13921i, hashSet2);
        ArrayList<y93> arrayList2 = this.f13938z;
        if (arrayList2 != null) {
            Iterator<y93> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                y93 next = it.next();
                if (next instanceof xa3) {
                    xa3 xa3 = (xa3) next;
                    mo22134w(new ty3(i, i2, xa3, this.f13918f, this.f13919g));
                    int i6 = xa3.f20122g;
                    if (i6 != y93.f20099f) {
                        this.f13917e = i6;
                    }
                } else if (next instanceof fa3) {
                    next.mo12032d(hashSet3);
                } else if (next instanceof eb3) {
                    next.mo12032d(hashSet);
                } else if (next instanceof fb3) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((fb3) next);
                } else {
                    next.mo12034h(hashMap);
                    next.mo12032d(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        int i7 = 0;
        if (arrayList != null) {
            this.f13905D = (fb3[]) arrayList.toArray(new fb3[0]);
        }
        char c = 1;
        if (!hashSet2.isEmpty()) {
            this.f13903B = new HashMap<>();
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(",")[1];
                    Iterator<y93> it3 = this.f13938z.iterator();
                    while (it3.hasNext()) {
                        y93 next2 = it3.next();
                        HashMap<String, ConstraintAttribute> hashMap2 = next2.f20104e;
                        if (!(hashMap2 == null || (constraintAttribute3 = hashMap2.get(str2)) == null)) {
                            sparseArray.append(next2.f20100a, constraintAttribute3);
                        }
                    }
                    de7 = de7.m15040f(str, sparseArray);
                } else {
                    de7 = de7.m15041g(str);
                }
                if (de7 != null) {
                    de7.mo27076d(str);
                    this.f13903B.put(str, de7);
                }
            }
            ArrayList<y93> arrayList3 = this.f13938z;
            if (arrayList3 != null) {
                Iterator<y93> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    y93 next3 = it4.next();
                    if (next3 instanceof ca3) {
                        next3.mo12028a(this.f13903B);
                    }
                }
            }
            this.f13920h.mo21654a(this.f13903B, 0);
            this.f13921i.mo21654a(this.f13903B, 100);
            for (String next4 : this.f13903B.keySet()) {
                if (!hashMap.containsKey(next4) || (num = (Integer) hashMap.get(next4)) == null) {
                    i4 = 0;
                } else {
                    i4 = num.intValue();
                }
                v66 v66 = this.f13903B.get(next4);
                if (v66 != null) {
                    v66.mo18741e(i4);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.f13902A == null) {
                this.f13902A = new HashMap<>();
            }
            Iterator it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String str3 = (String) it5.next();
                if (!this.f13902A.containsKey(str3)) {
                    if (str3.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str4 = str3.split(",")[1];
                        Iterator<y93> it6 = this.f13938z.iterator();
                        while (it6.hasNext()) {
                            y93 next5 = it6.next();
                            HashMap<String, ConstraintAttribute> hashMap3 = next5.f20104e;
                            if (!(hashMap3 == null || (constraintAttribute2 = hashMap3.get(str4)) == null)) {
                                sparseArray2.append(next5.f20100a, constraintAttribute2);
                            }
                        }
                        je7 = je7.m20093g(str3, sparseArray2);
                        long j2 = j;
                    } else {
                        je7 = je7.m20094h(str3, j);
                    }
                    if (je7 != null) {
                        je7.mo20814d(str3);
                        this.f13902A.put(str3, je7);
                    }
                }
            }
            ArrayList<y93> arrayList4 = this.f13938z;
            if (arrayList4 != null) {
                Iterator<y93> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    y93 next6 = it7.next();
                    if (next6 instanceof eb3) {
                        ((eb3) next6).mo19222U(this.f13902A);
                    }
                }
            }
            for (String next7 : this.f13902A.keySet()) {
                if (hashMap.containsKey(next7)) {
                    i3 = ((Integer) hashMap.get(next7)).intValue();
                } else {
                    i3 = 0;
                }
                this.f13902A.get(next7).mo20815e(i3);
            }
        }
        int i8 = 2;
        int size = this.f13936x.size() + 2;
        ty3[] ty3Arr = new ty3[size];
        ty3Arr[0] = this.f13918f;
        ty3Arr[size - 1] = this.f13919g;
        if (this.f13936x.size() > 0 && this.f13917e == -1) {
            this.f13917e = 0;
        }
        Iterator<ty3> it8 = this.f13936x.iterator();
        int i9 = 1;
        while (it8.hasNext()) {
            ty3Arr[i9] = it8.next();
            i9++;
        }
        HashSet hashSet4 = new HashSet();
        for (String next8 : this.f13919g.f18318L.keySet()) {
            if (this.f13918f.f18318L.containsKey(next8)) {
                if (!hashSet2.contains("CUSTOM," + next8)) {
                    hashSet4.add(next8);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f13932t = strArr2;
        this.f13933u = new int[strArr2.length];
        int i10 = 0;
        while (true) {
            strArr = this.f13932t;
            if (i10 >= strArr.length) {
                break;
            }
            String str5 = strArr[i10];
            this.f13933u[i10] = 0;
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    if (ty3Arr[i11].f18318L.containsKey(str5) && (constraintAttribute = ty3Arr[i11].f18318L.get(str5)) != null) {
                        int[] iArr = this.f13933u;
                        iArr[i10] = iArr[i10] + constraintAttribute.mo5042h();
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            i10++;
        }
        if (ty3Arr[0].f18314B != y93.f20099f) {
            z = true;
        } else {
            z = false;
        }
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i12 = 1; i12 < size; i12++) {
            ty3Arr[i12].mo26600f(ty3Arr[i12 - 1], zArr, this.f13932t, z);
        }
        int i13 = 0;
        for (int i14 = 1; i14 < length; i14++) {
            if (zArr[i14]) {
                i13++;
            }
        }
        this.f13929q = new int[i13];
        int max = Math.max(2, i13);
        this.f13930r = new double[max];
        this.f13931s = new double[max];
        int i15 = 0;
        for (int i16 = 1; i16 < length; i16++) {
            if (zArr[i16]) {
                this.f13929q[i15] = i16;
                i15++;
            }
        }
        int[] iArr2 = new int[2];
        iArr2[1] = this.f13929q.length;
        iArr2[0] = size;
        double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, iArr2);
        double[] dArr2 = new double[size];
        for (int i17 = 0; i17 < size; i17++) {
            ty3Arr[i17].mo26601g(dArr[i17], this.f13929q);
            dArr2[i17] = (double) ty3Arr[i17].f18325e;
        }
        int i18 = 0;
        while (true) {
            int[] iArr3 = this.f13929q;
            if (i18 >= iArr3.length) {
                break;
            }
            if (iArr3[i18] < ty3.f18312X.length) {
                String str6 = ty3.f18312X[this.f13929q[i18]] + " [";
                for (int i19 = 0; i19 < size; i19++) {
                    str6 = str6 + dArr[i19][i18];
                }
            }
            i18++;
        }
        this.f13922j = new ux0[(this.f13932t.length + 1)];
        int i20 = 0;
        while (true) {
            String[] strArr3 = this.f13932t;
            if (i20 >= strArr3.length) {
                break;
            }
            String str7 = strArr3[i20];
            int i21 = i7;
            int i22 = i21;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i21 < size) {
                if (ty3Arr[i21].mo26607p(str7)) {
                    if (dArr4 == null) {
                        dArr3 = new double[size];
                        int[] iArr4 = new int[i8];
                        iArr4[c] = ty3Arr[i21].mo26605m(str7);
                        iArr4[i7] = size;
                        dArr4 = (double[][]) Array.newInstance(Double.TYPE, iArr4);
                    }
                    ty3 ty3 = ty3Arr[i21];
                    dArr3[i22] = (double) ty3.f18325e;
                    ty3.mo26604l(str7, dArr4[i22], 0);
                    i22++;
                }
                i21++;
                i8 = 2;
                i7 = 0;
                c = 1;
            }
            i20++;
            this.f13922j[i20] = ux0.m28444a(this.f13917e, Arrays.copyOf(dArr3, i22), (double[][]) Arrays.copyOf(dArr4, i22));
            i8 = 2;
            i7 = 0;
            c = 1;
        }
        this.f13922j[0] = ux0.m28444a(this.f13917e, dArr2, dArr);
        if (ty3Arr[0].f18314B != y93.f20099f) {
            int[] iArr5 = new int[size];
            double[] dArr5 = new double[size];
            int[] iArr6 = new int[2];
            iArr6[1] = 2;
            iArr6[0] = size;
            double[][] dArr6 = (double[][]) Array.newInstance(Double.TYPE, iArr6);
            for (int i23 = 0; i23 < size; i23++) {
                ty3 ty32 = ty3Arr[i23];
                iArr5[i23] = ty32.f18314B;
                dArr5[i23] = (double) ty32.f18325e;
                double[] dArr7 = dArr6[i23];
                dArr7[0] = (double) ty32.f18327k;
                dArr7[1] = (double) ty32.f18328r;
            }
            this.f13923k = ux0.m28445b(iArr5, dArr5, dArr6);
        }
        float f2 = Float.NaN;
        this.f13904C = new HashMap<>();
        if (this.f13938z != null) {
            Iterator it9 = hashSet3.iterator();
            while (it9.hasNext()) {
                String str8 = (String) it9.next();
                kd7 i24 = kd7.m20655i(str8);
                if (i24 != null) {
                    if (i24.mo20447h() && Float.isNaN(f2)) {
                        f2 = mo22129s();
                    }
                    i24.mo20445f(str8);
                    this.f13904C.put(str8, i24);
                }
            }
            Iterator<y93> it10 = this.f13938z.iterator();
            while (it10.hasNext()) {
                y93 next9 = it10.next();
                if (next9 instanceof fa3) {
                    ((fa3) next9).mo19841Y(this.f13904C);
                }
            }
            for (kd7 g : this.f13904C.values()) {
                g.mo20446g(f2);
            }
        }
    }

    /* renamed from: I */
    public void mo22111I(jy3 jy3) {
        this.f13918f.mo26615z(jy3, jy3.f13918f);
        this.f13919g.mo26615z(jy3, jy3.f13919g);
    }

    /* renamed from: a */
    public void mo22112a(y93 y93) {
        this.f13938z.add(y93);
    }

    /* renamed from: b */
    public void mo22113b(ArrayList<y93> arrayList) {
        this.f13938z.addAll(arrayList);
    }

    /* renamed from: c */
    public int mo22114c(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] h = this.f13922j[0].mo22305h();
        if (iArr != null) {
            Iterator<ty3> it = this.f13936x.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().f18319M;
                i++;
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < h.length; i3++) {
            this.f13922j[0].mo22301d(h[i3], this.f13930r);
            this.f13918f.mo26602h(h[i3], this.f13929q, this.f13930r, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    /* renamed from: d */
    public void mo22115d(float[] fArr, int i) {
        v66 v66;
        v66 v662;
        kd7 kd7;
        double d;
        int i2 = i;
        float f = 1.0f;
        float f2 = 1.0f / ((float) (i2 - 1));
        HashMap<String, de7> hashMap = this.f13903B;
        kd7 kd72 = null;
        if (hashMap == null) {
            v66 = null;
        } else {
            v66 = hashMap.get("translationX");
        }
        HashMap<String, de7> hashMap2 = this.f13903B;
        if (hashMap2 == null) {
            v662 = null;
        } else {
            v662 = hashMap2.get("translationY");
        }
        HashMap<String, kd7> hashMap3 = this.f13904C;
        if (hashMap3 == null) {
            kd7 = null;
        } else {
            kd7 = hashMap3.get("translationX");
        }
        HashMap<String, kd7> hashMap4 = this.f13904C;
        if (hashMap4 != null) {
            kd72 = hashMap4.get("translationY");
        }
        kd7 kd73 = kd72;
        int i3 = 0;
        while (i3 < i2) {
            float f3 = ((float) i3) * f2;
            float f4 = this.f13926n;
            if (f4 != f) {
                float f5 = this.f13925m;
                if (f3 < f5) {
                    f3 = Utils.FLOAT_EPSILON;
                }
                if (f3 > f5 && ((double) f3) < 1.0d) {
                    f3 = Math.min((f3 - f5) * f4, f);
                }
            }
            float f6 = f3;
            double d2 = (double) f6;
            ym1 ym1 = this.f13918f.f18323a;
            float f7 = Float.NaN;
            Iterator<ty3> it = this.f13936x.iterator();
            float f8 = Utils.FLOAT_EPSILON;
            while (it.hasNext()) {
                ty3 next = it.next();
                ym1 ym12 = next.f18323a;
                double d3 = d2;
                if (ym12 != null) {
                    float f9 = next.f18325e;
                    if (f9 < f6) {
                        f8 = f9;
                        ym1 = ym12;
                    } else if (Float.isNaN(f7)) {
                        f7 = next.f18325e;
                    }
                }
                d2 = d3;
            }
            double d4 = d2;
            if (ym1 != null) {
                if (Float.isNaN(f7)) {
                    f7 = 1.0f;
                }
                float f10 = f7 - f8;
                d = (double) ((((float) ym1.mo21311a((double) ((f6 - f8) / f10))) * f10) + f8);
            } else {
                d = d4;
            }
            this.f13922j[0].mo22301d(d, this.f13930r);
            ux0 ux0 = this.f13923k;
            if (ux0 != null) {
                double[] dArr = this.f13930r;
                if (dArr.length > 0) {
                    ux0.mo22301d(d, dArr);
                }
            }
            int i4 = i3 * 2;
            float f11 = f6;
            int i5 = i3;
            this.f13918f.mo26602h(d, this.f13929q, this.f13930r, fArr, i4);
            if (kd7 != null) {
                fArr[i4] = fArr[i4] + kd7.mo20440a(f11);
            } else if (v66 != null) {
                fArr[i4] = fArr[i4] + v66.mo27074a(f11);
            }
            if (kd73 != null) {
                int i6 = i4 + 1;
                fArr[i6] = fArr[i6] + kd73.mo20440a(f11);
            } else if (v662 != null) {
                int i7 = i4 + 1;
                fArr[i7] = fArr[i7] + v662.mo27074a(f11);
            }
            i3 = i5 + 1;
            f = 1.0f;
        }
    }

    /* renamed from: e */
    public void mo22116e(float f, float[] fArr, int i) {
        this.f13922j[0].mo22301d((double) mo22118g(f, (float[]) null), this.f13930r);
        this.f13918f.mo26606o(this.f13929q, this.f13930r, fArr, i);
    }

    /* renamed from: f */
    public void mo22117f(boolean z) {
        float f;
        if ("button".equals(t21.m27246d(this.f13914b)) && this.f13905D != null) {
            int i = 0;
            while (true) {
                fb3[] fb3Arr = this.f13905D;
                if (i < fb3Arr.length) {
                    fb3 fb3 = fb3Arr[i];
                    if (z) {
                        f = -100.0f;
                    } else {
                        f = 100.0f;
                    }
                    fb3.mo19849y(f, this.f13914b);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    public final float mo22118g(float f, float[] fArr) {
        float f2 = Utils.FLOAT_EPSILON;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.f13926n;
            if (((double) f4) != 1.0d) {
                float f5 = this.f13925m;
                if (f < f5) {
                    f = 0.0f;
                }
                if (f > f5 && ((double) f) < 1.0d) {
                    f = Math.min((f - f5) * f4, 1.0f);
                }
            }
        }
        ym1 ym1 = this.f13918f.f18323a;
        float f6 = Float.NaN;
        Iterator<ty3> it = this.f13936x.iterator();
        while (it.hasNext()) {
            ty3 next = it.next();
            ym1 ym12 = next.f18323a;
            if (ym12 != null) {
                float f7 = next.f18325e;
                if (f7 < f) {
                    ym1 = ym12;
                    f2 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = next.f18325e;
                }
            }
        }
        if (ym1 != null) {
            if (!Float.isNaN(f6)) {
                f3 = f6;
            }
            float f8 = f3 - f2;
            double d = (double) ((f - f2) / f8);
            f = (((float) ym1.mo21311a(d)) * f8) + f2;
            if (fArr != null) {
                fArr[0] = (float) ym1.mo21312b(d);
            }
        }
        return f;
    }

    /* renamed from: h */
    public int mo22119h() {
        return this.f13918f.f18315C;
    }

    /* renamed from: i */
    public void mo22120i(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f13922j[0].mo22301d(d, dArr);
        this.f13922j[0].mo22304g(d, dArr2);
        Arrays.fill(fArr2, Utils.FLOAT_EPSILON);
        this.f13918f.mo26603i(d, this.f13929q, dArr, fArr, dArr2, fArr2);
    }

    /* renamed from: j */
    public float mo22121j() {
        return this.f13927o;
    }

    /* renamed from: k */
    public float mo22122k() {
        return this.f13928p;
    }

    /* renamed from: l */
    public void mo22123l(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float g = mo22118g(f, this.f13937y);
        ux0[] ux0Arr = this.f13922j;
        int i = 0;
        if (ux0Arr != null) {
            double d = (double) g;
            ux0Arr[0].mo22304g(d, this.f13931s);
            this.f13922j[0].mo22301d(d, this.f13930r);
            float f4 = this.f13937y[0];
            while (true) {
                dArr = this.f13931s;
                if (i >= dArr.length) {
                    break;
                }
                dArr[i] = dArr[i] * ((double) f4);
                i++;
            }
            ux0 ux0 = this.f13923k;
            if (ux0 != null) {
                double[] dArr2 = this.f13930r;
                if (dArr2.length > 0) {
                    ux0.mo22301d(d, dArr2);
                    this.f13923k.mo22304g(d, this.f13931s);
                    this.f13918f.mo26613x(f2, f3, fArr, this.f13929q, this.f13931s, this.f13930r);
                    return;
                }
                return;
            }
            this.f13918f.mo26613x(f2, f3, fArr, this.f13929q, dArr, this.f13930r);
            return;
        }
        ty3 ty3 = this.f13919g;
        float f5 = ty3.f18327k;
        ty3 ty32 = this.f13918f;
        float f6 = f5 - ty32.f18327k;
        float f7 = ty3.f18328r - ty32.f18328r;
        float f8 = (ty3.f18329s - ty32.f18329s) + f6;
        float f9 = (ty3.f18330x - ty32.f18330x) + f7;
        fArr[0] = (f6 * (1.0f - f2)) + (f8 * f2);
        fArr[1] = (f7 * (1.0f - f3)) + (f9 * f3);
    }

    /* renamed from: m */
    public int mo22124m() {
        int i = this.f13918f.f18324d;
        Iterator<ty3> it = this.f13936x.iterator();
        while (it.hasNext()) {
            i = Math.max(i, it.next().f18324d);
        }
        return Math.max(i, this.f13919g.f18324d);
    }

    /* renamed from: n */
    public float mo22125n() {
        return this.f13919g.f18327k;
    }

    /* renamed from: o */
    public float mo22126o() {
        return this.f13919g.f18328r;
    }

    /* renamed from: q */
    public ty3 mo22127q(int i) {
        return this.f13936x.get(i);
    }

    /* renamed from: r */
    public void mo22128r(float f, int i, int i2, float f2, float f3, float[] fArr) {
        v66 v66;
        v66 v662;
        v66 v663;
        v66 v664;
        v66 v665;
        kd7 kd7;
        kd7 kd72;
        kd7 kd73;
        kd7 kd74;
        float g = mo22118g(f, this.f13937y);
        HashMap<String, de7> hashMap = this.f13903B;
        kd7 kd75 = null;
        if (hashMap == null) {
            v66 = null;
        } else {
            v66 = hashMap.get("translationX");
        }
        HashMap<String, de7> hashMap2 = this.f13903B;
        if (hashMap2 == null) {
            v662 = null;
        } else {
            v662 = hashMap2.get("translationY");
        }
        HashMap<String, de7> hashMap3 = this.f13903B;
        if (hashMap3 == null) {
            v663 = null;
        } else {
            v663 = hashMap3.get("rotation");
        }
        HashMap<String, de7> hashMap4 = this.f13903B;
        if (hashMap4 == null) {
            v664 = null;
        } else {
            v664 = hashMap4.get("scaleX");
        }
        HashMap<String, de7> hashMap5 = this.f13903B;
        if (hashMap5 == null) {
            v665 = null;
        } else {
            v665 = hashMap5.get("scaleY");
        }
        HashMap<String, kd7> hashMap6 = this.f13904C;
        if (hashMap6 == null) {
            kd7 = null;
        } else {
            kd7 = hashMap6.get("translationX");
        }
        HashMap<String, kd7> hashMap7 = this.f13904C;
        if (hashMap7 == null) {
            kd72 = null;
        } else {
            kd72 = hashMap7.get("translationY");
        }
        HashMap<String, kd7> hashMap8 = this.f13904C;
        if (hashMap8 == null) {
            kd73 = null;
        } else {
            kd73 = hashMap8.get("rotation");
        }
        HashMap<String, kd7> hashMap9 = this.f13904C;
        if (hashMap9 == null) {
            kd74 = null;
        } else {
            kd74 = hashMap9.get("scaleX");
        }
        HashMap<String, kd7> hashMap10 = this.f13904C;
        if (hashMap10 != null) {
            kd75 = hashMap10.get("scaleY");
        }
        y87 y87 = new y87();
        y87.mo27988b();
        y87.mo27990d(v663, g);
        y87.mo27994h(v66, v662, g);
        y87.mo27992f(v664, v665, g);
        y87.mo27989c(kd73, g);
        y87.mo27993g(kd7, kd72, g);
        y87.mo27991e(kd74, kd75, g);
        ux0 ux0 = this.f13923k;
        if (ux0 != null) {
            double[] dArr = this.f13930r;
            if (dArr.length > 0) {
                double d = (double) g;
                ux0.mo22301d(d, dArr);
                this.f13923k.mo22304g(d, this.f13931s);
                this.f13918f.mo26613x(f2, f3, fArr, this.f13929q, this.f13931s, this.f13930r);
            }
            y87.mo27987a(f2, f3, i, i2, fArr);
            return;
        }
        int i3 = 0;
        if (this.f13922j != null) {
            double g2 = (double) mo22118g(g, this.f13937y);
            this.f13922j[0].mo22304g(g2, this.f13931s);
            this.f13922j[0].mo22301d(g2, this.f13930r);
            float f4 = this.f13937y[0];
            while (true) {
                double[] dArr2 = this.f13931s;
                if (i3 < dArr2.length) {
                    dArr2[i3] = dArr2[i3] * ((double) f4);
                    i3++;
                } else {
                    float f5 = f2;
                    float f6 = f3;
                    this.f13918f.mo26613x(f5, f6, fArr, this.f13929q, dArr2, this.f13930r);
                    y87.mo27987a(f5, f6, i, i2, fArr);
                    return;
                }
            }
        } else {
            ty3 ty3 = this.f13919g;
            float f7 = ty3.f18327k;
            ty3 ty32 = this.f13918f;
            float f8 = f7 - ty32.f18327k;
            float f9 = ty3.f18328r - ty32.f18328r;
            kd7 kd76 = kd74;
            float f10 = (ty3.f18330x - ty32.f18330x) + f9;
            fArr[0] = (f8 * (1.0f - f2)) + (((ty3.f18329s - ty32.f18329s) + f8) * f2);
            fArr[1] = (f9 * (1.0f - f3)) + (f10 * f3);
            y87.mo27988b();
            y87.mo27990d(v663, g);
            y87.mo27994h(v66, v662, g);
            y87.mo27992f(v664, v665, g);
            y87.mo27989c(kd73, g);
            y87.mo27993g(kd7, kd72, g);
            y87.mo27991e(kd76, kd75, g);
            y87.mo27987a(f2, f3, i, i2, fArr);
        }
    }

    /* renamed from: s */
    public final float mo22129s() {
        char c;
        float f;
        float[] fArr = new float[2];
        float f2 = 1.0f / ((float) 99);
        double d = 0.0d;
        double d2 = 0.0d;
        float f3 = Utils.FLOAT_EPSILON;
        int i = 0;
        while (i < 100) {
            float f4 = ((float) i) * f2;
            double d3 = (double) f4;
            ym1 ym1 = this.f13918f.f18323a;
            Iterator<ty3> it = this.f13936x.iterator();
            float f5 = Float.NaN;
            float f6 = Utils.FLOAT_EPSILON;
            while (it.hasNext()) {
                ty3 next = it.next();
                ym1 ym12 = next.f18323a;
                if (ym12 != null) {
                    float f7 = next.f18325e;
                    if (f7 < f4) {
                        ym1 = ym12;
                        f6 = f7;
                    } else if (Float.isNaN(f5)) {
                        f5 = next.f18325e;
                    }
                }
            }
            if (ym1 != null) {
                if (Float.isNaN(f5)) {
                    f5 = 1.0f;
                }
                float f8 = f5 - f6;
                d3 = (double) ((((float) ym1.mo21311a((double) ((f4 - f6) / f8))) * f8) + f6);
            }
            this.f13922j[0].mo22301d(d3, this.f13930r);
            float f9 = f3;
            int i2 = i;
            this.f13918f.mo26602h(d3, this.f13929q, this.f13930r, fArr, 0);
            if (i2 > 0) {
                c = 0;
                f = (float) (((double) f9) + Math.hypot(d2 - ((double) fArr[1]), d - ((double) fArr[0])));
            } else {
                c = 0;
                f = f9;
            }
            d = (double) fArr[c];
            i = i2 + 1;
            f3 = f;
            d2 = (double) fArr[1];
        }
        return f3;
    }

    /* renamed from: t */
    public float mo22130t() {
        return this.f13918f.f18327k;
    }

    public String toString() {
        return " start: x: " + this.f13918f.f18327k + " y: " + this.f13918f.f18328r + " end: x: " + this.f13919g.f18327k + " y: " + this.f13919g.f18328r;
    }

    /* renamed from: u */
    public float mo22132u() {
        return this.f13918f.f18328r;
    }

    /* renamed from: v */
    public View mo22133v() {
        return this.f13914b;
    }

    /* renamed from: w */
    public final void mo22134w(ty3 ty3) {
        int binarySearch = Collections.binarySearch(this.f13936x, ty3);
        if (binarySearch == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(" KeyPath position \"");
            sb.append(ty3.f18326g);
            sb.append("\" outside of range");
        }
        this.f13936x.add((-binarySearch) - 1, ty3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: je7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: je7$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo22135x(android.view.View r23, float r24, long r25, p000.da3 r27) {
        /*
            r22 = this;
            r0 = r22
            r11 = r23
            r1 = 0
            r2 = r24
            float r2 = r0.mo22118g(r2, r1)
            int r3 = r0.f13909H
            int r4 = p000.y93.f20099f
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r3 == r4) goto L_0x0042
            float r3 = (float) r3
            float r3 = r13 / r3
            float r4 = r2 / r3
            double r4 = (double) r4
            double r4 = java.lang.Math.floor(r4)
            float r4 = (float) r4
            float r4 = r4 * r3
            float r2 = r2 % r3
            float r2 = r2 / r3
            float r5 = r0.f13910I
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L_0x002d
            float r5 = r0.f13910I
            float r2 = r2 + r5
            float r2 = r2 % r13
        L_0x002d:
            android.view.animation.Interpolator r5 = r0.f13911J
            if (r5 == 0) goto L_0x0036
            float r2 = r5.getInterpolation(r2)
            goto L_0x0040
        L_0x0036:
            double r5 = (double) r2
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x003f
            r2 = r13
            goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            float r2 = r2 * r3
            float r2 = r2 + r4
        L_0x0042:
            r14 = r2
            java.util.HashMap<java.lang.String, de7> r2 = r0.f13903B
            if (r2 == 0) goto L_0x005f
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x004f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x005f
            java.lang.Object r3 = r2.next()
            de7 r3 = (p000.de7) r3
            r3.mo18739h(r11, r14)
            goto L_0x004f
        L_0x005f:
            java.util.HashMap<java.lang.String, je7> r2 = r0.f13902A
            r15 = 0
            if (r2 == 0) goto L_0x0092
            java.util.Collection r2 = r2.values()
            java.util.Iterator r7 = r2.iterator()
            r8 = r1
            r9 = r15
        L_0x006e:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x008f
            java.lang.Object r1 = r7.next()
            je7 r1 = (p000.je7) r1
            boolean r2 = r1 instanceof p000.je7.C2590d
            if (r2 == 0) goto L_0x0082
            r8 = r1
            je7$d r8 = (p000.je7.C2590d) r8
            goto L_0x006e
        L_0x0082:
            r2 = r23
            r3 = r14
            r4 = r25
            r6 = r27
            boolean r1 = r1.mo21818i(r2, r3, r4, r6)
            r9 = r9 | r1
            goto L_0x006e
        L_0x008f:
            r16 = r9
            goto L_0x0095
        L_0x0092:
            r8 = r1
            r16 = r15
        L_0x0095:
            ux0[] r1 = r0.f13922j
            r9 = 1
            if (r1 == 0) goto L_0x01eb
            r1 = r1[r15]
            double r6 = (double) r14
            double[] r2 = r0.f13930r
            r1.mo22301d(r6, r2)
            ux0[] r1 = r0.f13922j
            r1 = r1[r15]
            double[] r2 = r0.f13931s
            r1.mo22304g(r6, r2)
            ux0 r1 = r0.f13923k
            if (r1 == 0) goto L_0x00be
            double[] r2 = r0.f13930r
            int r3 = r2.length
            if (r3 <= 0) goto L_0x00be
            r1.mo22301d(r6, r2)
            ux0 r1 = r0.f13923k
            double[] r2 = r0.f13931s
            r1.mo22304g(r6, r2)
        L_0x00be:
            boolean r1 = r0.f13912K
            if (r1 != 0) goto L_0x00d7
            ty3 r1 = r0.f13918f
            int[] r4 = r0.f13929q
            double[] r5 = r0.f13930r
            double[] r10 = r0.f13931s
            r17 = 0
            r2 = r14
            r3 = r23
            r12 = r6
            r6 = r10
            r7 = r17
            r1.mo26614y(r2, r3, r4, r5, r6, r7)
            goto L_0x00d8
        L_0x00d7:
            r12 = r6
        L_0x00d8:
            int r1 = r0.f13907F
            int r2 = p000.y93.f20099f
            if (r1 == r2) goto L_0x013a
            android.view.View r1 = r0.f13908G
            if (r1 != 0) goto L_0x00f0
            android.view.ViewParent r1 = r23.getParent()
            android.view.View r1 = (android.view.View) r1
            int r2 = r0.f13907F
            android.view.View r1 = r1.findViewById(r2)
            r0.f13908G = r1
        L_0x00f0:
            android.view.View r1 = r0.f13908G
            if (r1 == 0) goto L_0x013a
            int r1 = r1.getTop()
            android.view.View r2 = r0.f13908G
            int r2 = r2.getBottom()
            int r1 = r1 + r2
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            android.view.View r3 = r0.f13908G
            int r3 = r3.getLeft()
            android.view.View r4 = r0.f13908G
            int r4 = r4.getRight()
            int r3 = r3 + r4
            float r3 = (float) r3
            float r3 = r3 / r2
            int r2 = r23.getRight()
            int r4 = r23.getLeft()
            int r2 = r2 - r4
            if (r2 <= 0) goto L_0x013a
            int r2 = r23.getBottom()
            int r4 = r23.getTop()
            int r2 = r2 - r4
            if (r2 <= 0) goto L_0x013a
            int r2 = r23.getLeft()
            float r2 = (float) r2
            float r3 = r3 - r2
            int r2 = r23.getTop()
            float r2 = (float) r2
            float r1 = r1 - r2
            r11.setPivotX(r3)
            r11.setPivotY(r1)
        L_0x013a:
            java.util.HashMap<java.lang.String, de7> r1 = r0.f13903B
            if (r1 == 0) goto L_0x0168
            java.util.Collection r1 = r1.values()
            java.util.Iterator r10 = r1.iterator()
        L_0x0146:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0168
            java.lang.Object r1 = r10.next()
            v66 r1 = (p000.v66) r1
            boolean r2 = r1 instanceof p000.de7.C2152d
            if (r2 == 0) goto L_0x0146
            double[] r2 = r0.f13931s
            int r3 = r2.length
            if (r3 <= r9) goto L_0x0146
            de7$d r1 = (p000.de7.C2152d) r1
            r4 = r2[r15]
            r6 = r2[r9]
            r2 = r23
            r3 = r14
            r1.mo18743i(r2, r3, r4, r6)
            goto L_0x0146
        L_0x0168:
            if (r8 == 0) goto L_0x0187
            double[] r1 = r0.f13931s
            r18 = r1[r15]
            r20 = r1[r9]
            r1 = r8
            r2 = r23
            r3 = r27
            r4 = r14
            r5 = r25
            r7 = r18
            r17 = r9
            r9 = r20
            boolean r1 = r1.mo21820j(r2, r3, r4, r5, r7, r9)
            r1 = r16 | r1
            r16 = r1
            goto L_0x0189
        L_0x0187:
            r17 = r9
        L_0x0189:
            r9 = r17
        L_0x018b:
            ux0[] r1 = r0.f13922j
            int r2 = r1.length
            if (r9 >= r2) goto L_0x01af
            r1 = r1[r9]
            float[] r2 = r0.f13935w
            r1.mo22302e(r12, r2)
            ty3 r1 = r0.f13918f
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r1 = r1.f18318L
            java.lang.String[] r2 = r0.f13932t
            int r3 = r9 + -1
            r2 = r2[r3]
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintAttribute r1 = (androidx.constraintlayout.widget.ConstraintAttribute) r1
            float[] r2 = r0.f13935w
            r1.mo5043k(r11, r2)
            int r9 = r9 + 1
            goto L_0x018b
        L_0x01af:
            iy3 r1 = r0.f13920h
            int r2 = r1.f13430d
            if (r2 != 0) goto L_0x01d9
            r2 = 0
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x01c0
            int r1 = r1.f13431e
            r11.setVisibility(r1)
            goto L_0x01d9
        L_0x01c0:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x01ce
            iy3 r1 = r0.f13921i
            int r1 = r1.f13431e
            r11.setVisibility(r1)
            goto L_0x01d9
        L_0x01ce:
            iy3 r2 = r0.f13921i
            int r2 = r2.f13431e
            int r1 = r1.f13431e
            if (r2 == r1) goto L_0x01d9
            r11.setVisibility(r15)
        L_0x01d9:
            fb3[] r1 = r0.f13905D
            if (r1 == 0) goto L_0x0235
            r1 = r15
        L_0x01de:
            fb3[] r2 = r0.f13905D
            int r3 = r2.length
            if (r1 >= r3) goto L_0x0235
            r2 = r2[r1]
            r2.mo19849y(r14, r11)
            int r1 = r1 + 1
            goto L_0x01de
        L_0x01eb:
            r17 = r9
            ty3 r1 = r0.f13918f
            float r2 = r1.f18327k
            ty3 r3 = r0.f13919g
            float r4 = r3.f18327k
            float r4 = r4 - r2
            float r4 = r4 * r14
            float r2 = r2 + r4
            float r4 = r1.f18328r
            float r5 = r3.f18328r
            float r5 = r5 - r4
            float r5 = r5 * r14
            float r4 = r4 + r5
            float r5 = r1.f18329s
            float r6 = r3.f18329s
            float r7 = r6 - r5
            float r7 = r7 * r14
            float r7 = r7 + r5
            float r1 = r1.f18330x
            float r3 = r3.f18330x
            float r8 = r3 - r1
            float r8 = r8 * r14
            float r8 = r8 + r1
            r9 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r9
            int r10 = (int) r2
            float r4 = r4 + r9
            int r9 = (int) r4
            float r2 = r2 + r7
            int r2 = (int) r2
            float r4 = r4 + r8
            int r4 = (int) r4
            int r7 = r2 - r10
            int r8 = r4 - r9
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0225
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0232
        L_0x0225:
            r1 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r1)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
            r11.measure(r3, r1)
        L_0x0232:
            r11.layout(r10, r9, r2, r4)
        L_0x0235:
            java.util.HashMap<java.lang.String, kd7> r1 = r0.f13904C
            if (r1 == 0) goto L_0x0264
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L_0x0241:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0264
            java.lang.Object r1 = r8.next()
            kd7 r1 = (p000.kd7) r1
            boolean r2 = r1 instanceof p000.kd7.C2664d
            if (r2 == 0) goto L_0x0260
            kd7$d r1 = (p000.kd7.C2664d) r1
            double[] r2 = r0.f13931s
            r4 = r2[r15]
            r6 = r2[r17]
            r2 = r23
            r3 = r14
            r1.mo22260k(r2, r3, r4, r6)
            goto L_0x0241
        L_0x0260:
            r1.mo22259j(r11, r14)
            goto L_0x0241
        L_0x0264:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.jy3.mo22135x(android.view.View, float, long, da3):boolean");
    }

    /* renamed from: y */
    public final void mo22136y(ty3 ty3) {
        ty3.mo26612w((float) ((int) this.f13914b.getX()), (float) ((int) this.f13914b.getY()), (float) this.f13914b.getWidth(), (float) this.f13914b.getHeight());
    }

    /* renamed from: z */
    public void mo22137z(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - ((i4 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (i == 2) {
            int i5 = rect.left + rect.right;
            rect2.left = i2 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i5 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (i == 3) {
            int i6 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
            rect2.top = i3 - ((i6 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (i == 4) {
            int i7 = rect.left + rect.right;
            rect2.left = i2 - (((rect.bottom + rect.top) + rect.width()) / 2);
            rect2.top = (i7 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        }
    }
}
