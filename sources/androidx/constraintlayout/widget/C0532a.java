package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import com.github.mikephil.charting.utils.Utils;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.a */
/* compiled from: ConstraintSet */
public class C0532a {

    /* renamed from: h */
    public static final int[] f3210h = {0, 4, 8};

    /* renamed from: i */
    public static SparseIntArray f3211i = new SparseIntArray();

    /* renamed from: j */
    public static SparseIntArray f3212j = new SparseIntArray();

    /* renamed from: a */
    public boolean f3213a;

    /* renamed from: b */
    public String f3214b;

    /* renamed from: c */
    public String f3215c = "";

    /* renamed from: d */
    public int f3216d = 0;

    /* renamed from: e */
    public HashMap<String, ConstraintAttribute> f3217e = new HashMap<>();

    /* renamed from: f */
    public boolean f3218f = true;

    /* renamed from: g */
    public HashMap<Integer, C0533a> f3219g = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.a$a */
    /* compiled from: ConstraintSet */
    public static class C0533a {

        /* renamed from: a */
        public int f3220a;

        /* renamed from: b */
        public String f3221b;

        /* renamed from: c */
        public final C0537d f3222c = new C0537d();

        /* renamed from: d */
        public final C0536c f3223d = new C0536c();

        /* renamed from: e */
        public final C0535b f3224e = new C0535b();

        /* renamed from: f */
        public final C0538e f3225f = new C0538e();

        /* renamed from: g */
        public HashMap<String, ConstraintAttribute> f3226g = new HashMap<>();

        /* renamed from: h */
        public C0534a f3227h;

        /* renamed from: androidx.constraintlayout.widget.a$a$a */
        /* compiled from: ConstraintSet */
        public static class C0534a {

            /* renamed from: a */
            public int[] f3228a = new int[10];

            /* renamed from: b */
            public int[] f3229b = new int[10];

            /* renamed from: c */
            public int f3230c = 0;

            /* renamed from: d */
            public int[] f3231d = new int[10];

            /* renamed from: e */
            public float[] f3232e = new float[10];

            /* renamed from: f */
            public int f3233f = 0;

            /* renamed from: g */
            public int[] f3234g = new int[5];

            /* renamed from: h */
            public String[] f3235h = new String[5];

            /* renamed from: i */
            public int f3236i = 0;

            /* renamed from: j */
            public int[] f3237j = new int[4];

            /* renamed from: k */
            public boolean[] f3238k = new boolean[4];

            /* renamed from: l */
            public int f3239l = 0;

            /* renamed from: a */
            public void mo5179a(int i, float f) {
                int i2 = this.f3233f;
                int[] iArr = this.f3231d;
                if (i2 >= iArr.length) {
                    this.f3231d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f3232e;
                    this.f3232e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f3231d;
                int i3 = this.f3233f;
                iArr2[i3] = i;
                float[] fArr2 = this.f3232e;
                this.f3233f = i3 + 1;
                fArr2[i3] = f;
            }

            /* renamed from: b */
            public void mo5180b(int i, int i2) {
                int i3 = this.f3230c;
                int[] iArr = this.f3228a;
                if (i3 >= iArr.length) {
                    this.f3228a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f3229b;
                    this.f3229b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f3228a;
                int i4 = this.f3230c;
                iArr3[i4] = i;
                int[] iArr4 = this.f3229b;
                this.f3230c = i4 + 1;
                iArr4[i4] = i2;
            }

            /* renamed from: c */
            public void mo5181c(int i, String str) {
                int i2 = this.f3236i;
                int[] iArr = this.f3234g;
                if (i2 >= iArr.length) {
                    this.f3234g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f3235h;
                    this.f3235h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f3234g;
                int i3 = this.f3236i;
                iArr2[i3] = i;
                String[] strArr2 = this.f3235h;
                this.f3236i = i3 + 1;
                strArr2[i3] = str;
            }

            /* renamed from: d */
            public void mo5182d(int i, boolean z) {
                int i2 = this.f3239l;
                int[] iArr = this.f3237j;
                if (i2 >= iArr.length) {
                    this.f3237j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f3238k;
                    this.f3238k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f3237j;
                int i3 = this.f3239l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.f3238k;
                this.f3239l = i3 + 1;
                zArr2[i3] = z;
            }

            /* renamed from: e */
            public void mo5183e(C0533a aVar) {
                for (int i = 0; i < this.f3230c; i++) {
                    C0532a.m4194O(aVar, this.f3228a[i], this.f3229b[i]);
                }
                for (int i2 = 0; i2 < this.f3233f; i2++) {
                    C0532a.m4193N(aVar, this.f3231d[i2], this.f3232e[i2]);
                }
                for (int i3 = 0; i3 < this.f3236i; i3++) {
                    C0532a.m4195P(aVar, this.f3234g[i3], this.f3235h[i3]);
                }
                for (int i4 = 0; i4 < this.f3239l; i4++) {
                    C0532a.m4196Q(aVar, this.f3237j[i4], this.f3238k[i4]);
                }
            }
        }

        /* renamed from: d */
        public void mo5173d(C0533a aVar) {
            C0534a aVar2 = this.f3227h;
            if (aVar2 != null) {
                aVar2.mo5183e(aVar);
            }
        }

        /* renamed from: e */
        public void mo5174e(ConstraintLayout.LayoutParams layoutParams) {
            C0535b bVar = this.f3224e;
            layoutParams.f3135d = bVar.f3283i;
            layoutParams.f3137e = bVar.f3285j;
            layoutParams.f3139f = bVar.f3287k;
            layoutParams.f3141g = bVar.f3289l;
            layoutParams.f3143h = bVar.f3291m;
            layoutParams.f3145i = bVar.f3293n;
            layoutParams.f3147j = bVar.f3295o;
            layoutParams.f3149k = bVar.f3297p;
            layoutParams.f3151l = bVar.f3299q;
            layoutParams.f3153m = bVar.f3300r;
            layoutParams.f3155n = bVar.f3301s;
            layoutParams.f3163r = bVar.f3302t;
            layoutParams.f3165s = bVar.f3303u;
            layoutParams.f3167t = bVar.f3304v;
            layoutParams.f3169u = bVar.f3305w;
            layoutParams.leftMargin = bVar.f3247G;
            layoutParams.rightMargin = bVar.f3248H;
            layoutParams.topMargin = bVar.f3249I;
            layoutParams.bottomMargin = bVar.f3250J;
            layoutParams.f3176z = bVar.f3259S;
            layoutParams.f3103A = bVar.f3258R;
            layoutParams.f3173w = bVar.f3255O;
            layoutParams.f3175y = bVar.f3257Q;
            layoutParams.f3108F = bVar.f3306x;
            layoutParams.f3109G = bVar.f3307y;
            layoutParams.f3157o = bVar.f3241A;
            layoutParams.f3159p = bVar.f3242B;
            layoutParams.f3161q = bVar.f3243C;
            layoutParams.f3110H = bVar.f3308z;
            layoutParams.f3125W = bVar.f3244D;
            layoutParams.f3126X = bVar.f3245E;
            layoutParams.f3114L = bVar.f3261U;
            layoutParams.f3113K = bVar.f3262V;
            layoutParams.f3116N = bVar.f3264X;
            layoutParams.f3115M = bVar.f3263W;
            layoutParams.f3128Z = bVar.f3292m0;
            layoutParams.f3130a0 = bVar.f3294n0;
            layoutParams.f3117O = bVar.f3265Y;
            layoutParams.f3118P = bVar.f3266Z;
            layoutParams.f3121S = bVar.f3268a0;
            layoutParams.f3122T = bVar.f3270b0;
            layoutParams.f3119Q = bVar.f3272c0;
            layoutParams.f3120R = bVar.f3274d0;
            layoutParams.f3123U = bVar.f3276e0;
            layoutParams.f3124V = bVar.f3278f0;
            layoutParams.f3127Y = bVar.f3246F;
            layoutParams.f3133c = bVar.f3281h;
            layoutParams.f3129a = bVar.f3277f;
            layoutParams.f3131b = bVar.f3279g;
            layoutParams.width = bVar.f3273d;
            layoutParams.height = bVar.f3275e;
            String str = bVar.f3290l0;
            if (str != null) {
                layoutParams.f3132b0 = str;
            }
            layoutParams.f3134c0 = bVar.f3298p0;
            layoutParams.setMarginStart(bVar.f3252L);
            layoutParams.setMarginEnd(this.f3224e.f3251K);
            layoutParams.mo5101c();
        }

        /* renamed from: f */
        public C0533a clone() {
            C0533a aVar = new C0533a();
            aVar.f3224e.mo5184a(this.f3224e);
            aVar.f3223d.mo5186a(this.f3223d);
            aVar.f3222c.mo5188a(this.f3222c);
            aVar.f3225f.mo5190a(this.f3225f);
            aVar.f3220a = this.f3220a;
            aVar.f3227h = this.f3227h;
            return aVar;
        }

        /* renamed from: g */
        public final void mo5176g(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.f3220a = i;
            C0535b bVar = this.f3224e;
            bVar.f3283i = layoutParams.f3135d;
            bVar.f3285j = layoutParams.f3137e;
            bVar.f3287k = layoutParams.f3139f;
            bVar.f3289l = layoutParams.f3141g;
            bVar.f3291m = layoutParams.f3143h;
            bVar.f3293n = layoutParams.f3145i;
            bVar.f3295o = layoutParams.f3147j;
            bVar.f3297p = layoutParams.f3149k;
            bVar.f3299q = layoutParams.f3151l;
            bVar.f3300r = layoutParams.f3153m;
            bVar.f3301s = layoutParams.f3155n;
            bVar.f3302t = layoutParams.f3163r;
            bVar.f3303u = layoutParams.f3165s;
            bVar.f3304v = layoutParams.f3167t;
            bVar.f3305w = layoutParams.f3169u;
            bVar.f3306x = layoutParams.f3108F;
            bVar.f3307y = layoutParams.f3109G;
            bVar.f3308z = layoutParams.f3110H;
            bVar.f3241A = layoutParams.f3157o;
            bVar.f3242B = layoutParams.f3159p;
            bVar.f3243C = layoutParams.f3161q;
            bVar.f3244D = layoutParams.f3125W;
            bVar.f3245E = layoutParams.f3126X;
            bVar.f3246F = layoutParams.f3127Y;
            bVar.f3281h = layoutParams.f3133c;
            bVar.f3277f = layoutParams.f3129a;
            bVar.f3279g = layoutParams.f3131b;
            bVar.f3273d = layoutParams.width;
            bVar.f3275e = layoutParams.height;
            bVar.f3247G = layoutParams.leftMargin;
            bVar.f3248H = layoutParams.rightMargin;
            bVar.f3249I = layoutParams.topMargin;
            bVar.f3250J = layoutParams.bottomMargin;
            bVar.f3253M = layoutParams.f3105C;
            bVar.f3261U = layoutParams.f3114L;
            bVar.f3262V = layoutParams.f3113K;
            bVar.f3264X = layoutParams.f3116N;
            bVar.f3263W = layoutParams.f3115M;
            bVar.f3292m0 = layoutParams.f3128Z;
            bVar.f3294n0 = layoutParams.f3130a0;
            bVar.f3265Y = layoutParams.f3117O;
            bVar.f3266Z = layoutParams.f3118P;
            bVar.f3268a0 = layoutParams.f3121S;
            bVar.f3270b0 = layoutParams.f3122T;
            bVar.f3272c0 = layoutParams.f3119Q;
            bVar.f3274d0 = layoutParams.f3120R;
            bVar.f3276e0 = layoutParams.f3123U;
            bVar.f3278f0 = layoutParams.f3124V;
            bVar.f3290l0 = layoutParams.f3132b0;
            bVar.f3255O = layoutParams.f3173w;
            bVar.f3257Q = layoutParams.f3175y;
            bVar.f3254N = layoutParams.f3171v;
            bVar.f3256P = layoutParams.f3174x;
            bVar.f3259S = layoutParams.f3176z;
            bVar.f3258R = layoutParams.f3103A;
            bVar.f3260T = layoutParams.f3104B;
            bVar.f3298p0 = layoutParams.f3134c0;
            bVar.f3251K = layoutParams.getMarginEnd();
            this.f3224e.f3252L = layoutParams.getMarginStart();
        }

        /* renamed from: h */
        public final void mo5177h(int i, Constraints.LayoutParams layoutParams) {
            mo5176g(i, layoutParams);
            this.f3222c.f3327d = layoutParams.f3197w0;
            C0538e eVar = this.f3225f;
            eVar.f3331b = layoutParams.f3200z0;
            eVar.f3332c = layoutParams.f3188A0;
            eVar.f3333d = layoutParams.f3189B0;
            eVar.f3334e = layoutParams.f3190C0;
            eVar.f3335f = layoutParams.f3191D0;
            eVar.f3336g = layoutParams.f3192E0;
            eVar.f3337h = layoutParams.f3193F0;
            eVar.f3339j = layoutParams.f3194G0;
            eVar.f3340k = layoutParams.f3195H0;
            eVar.f3341l = layoutParams.f3196I0;
            eVar.f3343n = layoutParams.f3199y0;
            eVar.f3342m = layoutParams.f3198x0;
        }

        /* renamed from: i */
        public final void mo5178i(ConstraintHelper constraintHelper, int i, Constraints.LayoutParams layoutParams) {
            mo5177h(i, layoutParams);
            if (constraintHelper instanceof Barrier) {
                C0535b bVar = this.f3224e;
                bVar.f3284i0 = 1;
                Barrier barrier = (Barrier) constraintHelper;
                bVar.f3280g0 = barrier.getType();
                this.f3224e.f3286j0 = barrier.getReferencedIds();
                this.f3224e.f3282h0 = barrier.getMargin();
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.a$b */
    /* compiled from: ConstraintSet */
    public static class C0535b {

        /* renamed from: q0 */
        public static SparseIntArray f3240q0;

        /* renamed from: A */
        public int f3241A = -1;

        /* renamed from: B */
        public int f3242B = 0;

        /* renamed from: C */
        public float f3243C = Utils.FLOAT_EPSILON;

        /* renamed from: D */
        public int f3244D = -1;

        /* renamed from: E */
        public int f3245E = -1;

        /* renamed from: F */
        public int f3246F = -1;

        /* renamed from: G */
        public int f3247G = 0;

        /* renamed from: H */
        public int f3248H = 0;

        /* renamed from: I */
        public int f3249I = 0;

        /* renamed from: J */
        public int f3250J = 0;

        /* renamed from: K */
        public int f3251K = 0;

        /* renamed from: L */
        public int f3252L = 0;

        /* renamed from: M */
        public int f3253M = 0;

        /* renamed from: N */
        public int f3254N = Integer.MIN_VALUE;

        /* renamed from: O */
        public int f3255O = Integer.MIN_VALUE;

        /* renamed from: P */
        public int f3256P = Integer.MIN_VALUE;

        /* renamed from: Q */
        public int f3257Q = Integer.MIN_VALUE;

        /* renamed from: R */
        public int f3258R = Integer.MIN_VALUE;

        /* renamed from: S */
        public int f3259S = Integer.MIN_VALUE;

        /* renamed from: T */
        public int f3260T = Integer.MIN_VALUE;

        /* renamed from: U */
        public float f3261U = -1.0f;

        /* renamed from: V */
        public float f3262V = -1.0f;

        /* renamed from: W */
        public int f3263W = 0;

        /* renamed from: X */
        public int f3264X = 0;

        /* renamed from: Y */
        public int f3265Y = 0;

        /* renamed from: Z */
        public int f3266Z = 0;

        /* renamed from: a */
        public boolean f3267a = false;

        /* renamed from: a0 */
        public int f3268a0 = -1;

        /* renamed from: b */
        public boolean f3269b = false;

        /* renamed from: b0 */
        public int f3270b0 = -1;

        /* renamed from: c */
        public boolean f3271c = false;

        /* renamed from: c0 */
        public int f3272c0 = -1;

        /* renamed from: d */
        public int f3273d;

        /* renamed from: d0 */
        public int f3274d0 = -1;

        /* renamed from: e */
        public int f3275e;

        /* renamed from: e0 */
        public float f3276e0 = 1.0f;

        /* renamed from: f */
        public int f3277f = -1;

        /* renamed from: f0 */
        public float f3278f0 = 1.0f;

        /* renamed from: g */
        public int f3279g = -1;

        /* renamed from: g0 */
        public int f3280g0 = -1;

        /* renamed from: h */
        public float f3281h = -1.0f;

        /* renamed from: h0 */
        public int f3282h0 = 0;

        /* renamed from: i */
        public int f3283i = -1;

        /* renamed from: i0 */
        public int f3284i0 = -1;

        /* renamed from: j */
        public int f3285j = -1;

        /* renamed from: j0 */
        public int[] f3286j0;

        /* renamed from: k */
        public int f3287k = -1;

        /* renamed from: k0 */
        public String f3288k0;

        /* renamed from: l */
        public int f3289l = -1;

        /* renamed from: l0 */
        public String f3290l0;

        /* renamed from: m */
        public int f3291m = -1;

        /* renamed from: m0 */
        public boolean f3292m0 = false;

        /* renamed from: n */
        public int f3293n = -1;

        /* renamed from: n0 */
        public boolean f3294n0 = false;

        /* renamed from: o */
        public int f3295o = -1;

        /* renamed from: o0 */
        public boolean f3296o0 = true;

        /* renamed from: p */
        public int f3297p = -1;

        /* renamed from: p0 */
        public int f3298p0 = 0;

        /* renamed from: q */
        public int f3299q = -1;

        /* renamed from: r */
        public int f3300r = -1;

        /* renamed from: s */
        public int f3301s = -1;

        /* renamed from: t */
        public int f3302t = -1;

        /* renamed from: u */
        public int f3303u = -1;

        /* renamed from: v */
        public int f3304v = -1;

        /* renamed from: w */
        public int f3305w = -1;

        /* renamed from: x */
        public float f3306x = 0.5f;

        /* renamed from: y */
        public float f3307y = 0.5f;

        /* renamed from: z */
        public String f3308z = null;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3240q0 = sparseIntArray;
            sparseIntArray.append(c65.Layout_layout_constraintLeft_toLeftOf, 24);
            f3240q0.append(c65.Layout_layout_constraintLeft_toRightOf, 25);
            f3240q0.append(c65.Layout_layout_constraintRight_toLeftOf, 28);
            f3240q0.append(c65.Layout_layout_constraintRight_toRightOf, 29);
            f3240q0.append(c65.Layout_layout_constraintTop_toTopOf, 35);
            f3240q0.append(c65.Layout_layout_constraintTop_toBottomOf, 34);
            f3240q0.append(c65.Layout_layout_constraintBottom_toTopOf, 4);
            f3240q0.append(c65.Layout_layout_constraintBottom_toBottomOf, 3);
            f3240q0.append(c65.Layout_layout_constraintBaseline_toBaselineOf, 1);
            f3240q0.append(c65.Layout_layout_editor_absoluteX, 6);
            f3240q0.append(c65.Layout_layout_editor_absoluteY, 7);
            f3240q0.append(c65.Layout_layout_constraintGuide_begin, 17);
            f3240q0.append(c65.Layout_layout_constraintGuide_end, 18);
            f3240q0.append(c65.Layout_layout_constraintGuide_percent, 19);
            f3240q0.append(c65.Layout_android_orientation, 26);
            f3240q0.append(c65.Layout_layout_constraintStart_toEndOf, 31);
            f3240q0.append(c65.Layout_layout_constraintStart_toStartOf, 32);
            f3240q0.append(c65.Layout_layout_constraintEnd_toStartOf, 10);
            f3240q0.append(c65.Layout_layout_constraintEnd_toEndOf, 9);
            f3240q0.append(c65.Layout_layout_goneMarginLeft, 13);
            f3240q0.append(c65.Layout_layout_goneMarginTop, 16);
            f3240q0.append(c65.Layout_layout_goneMarginRight, 14);
            f3240q0.append(c65.Layout_layout_goneMarginBottom, 11);
            f3240q0.append(c65.Layout_layout_goneMarginStart, 15);
            f3240q0.append(c65.Layout_layout_goneMarginEnd, 12);
            f3240q0.append(c65.Layout_layout_constraintVertical_weight, 38);
            f3240q0.append(c65.Layout_layout_constraintHorizontal_weight, 37);
            f3240q0.append(c65.Layout_layout_constraintHorizontal_chainStyle, 39);
            f3240q0.append(c65.Layout_layout_constraintVertical_chainStyle, 40);
            f3240q0.append(c65.Layout_layout_constraintHorizontal_bias, 20);
            f3240q0.append(c65.Layout_layout_constraintVertical_bias, 36);
            f3240q0.append(c65.Layout_layout_constraintDimensionRatio, 5);
            f3240q0.append(c65.Layout_layout_constraintLeft_creator, 76);
            f3240q0.append(c65.Layout_layout_constraintTop_creator, 76);
            f3240q0.append(c65.Layout_layout_constraintRight_creator, 76);
            f3240q0.append(c65.Layout_layout_constraintBottom_creator, 76);
            f3240q0.append(c65.Layout_layout_constraintBaseline_creator, 76);
            f3240q0.append(c65.Layout_android_layout_marginLeft, 23);
            f3240q0.append(c65.Layout_android_layout_marginRight, 27);
            f3240q0.append(c65.Layout_android_layout_marginStart, 30);
            f3240q0.append(c65.Layout_android_layout_marginEnd, 8);
            f3240q0.append(c65.Layout_android_layout_marginTop, 33);
            f3240q0.append(c65.Layout_android_layout_marginBottom, 2);
            f3240q0.append(c65.Layout_android_layout_width, 22);
            f3240q0.append(c65.Layout_android_layout_height, 21);
            f3240q0.append(c65.Layout_layout_constraintWidth, 41);
            f3240q0.append(c65.Layout_layout_constraintHeight, 42);
            f3240q0.append(c65.Layout_layout_constrainedWidth, 41);
            f3240q0.append(c65.Layout_layout_constrainedHeight, 42);
            f3240q0.append(c65.Layout_layout_wrapBehaviorInParent, 97);
            f3240q0.append(c65.Layout_layout_constraintCircle, 61);
            f3240q0.append(c65.Layout_layout_constraintCircleRadius, 62);
            f3240q0.append(c65.Layout_layout_constraintCircleAngle, 63);
            f3240q0.append(c65.Layout_layout_constraintWidth_percent, 69);
            f3240q0.append(c65.Layout_layout_constraintHeight_percent, 70);
            f3240q0.append(c65.Layout_chainUseRtl, 71);
            f3240q0.append(c65.Layout_barrierDirection, 72);
            f3240q0.append(c65.Layout_barrierMargin, 73);
            f3240q0.append(c65.Layout_constraint_referenced_ids, 74);
            f3240q0.append(c65.Layout_barrierAllowsGoneWidgets, 75);
        }

        /* renamed from: a */
        public void mo5184a(C0535b bVar) {
            this.f3267a = bVar.f3267a;
            this.f3273d = bVar.f3273d;
            this.f3269b = bVar.f3269b;
            this.f3275e = bVar.f3275e;
            this.f3277f = bVar.f3277f;
            this.f3279g = bVar.f3279g;
            this.f3281h = bVar.f3281h;
            this.f3283i = bVar.f3283i;
            this.f3285j = bVar.f3285j;
            this.f3287k = bVar.f3287k;
            this.f3289l = bVar.f3289l;
            this.f3291m = bVar.f3291m;
            this.f3293n = bVar.f3293n;
            this.f3295o = bVar.f3295o;
            this.f3297p = bVar.f3297p;
            this.f3299q = bVar.f3299q;
            this.f3300r = bVar.f3300r;
            this.f3301s = bVar.f3301s;
            this.f3302t = bVar.f3302t;
            this.f3303u = bVar.f3303u;
            this.f3304v = bVar.f3304v;
            this.f3305w = bVar.f3305w;
            this.f3306x = bVar.f3306x;
            this.f3307y = bVar.f3307y;
            this.f3308z = bVar.f3308z;
            this.f3241A = bVar.f3241A;
            this.f3242B = bVar.f3242B;
            this.f3243C = bVar.f3243C;
            this.f3244D = bVar.f3244D;
            this.f3245E = bVar.f3245E;
            this.f3246F = bVar.f3246F;
            this.f3247G = bVar.f3247G;
            this.f3248H = bVar.f3248H;
            this.f3249I = bVar.f3249I;
            this.f3250J = bVar.f3250J;
            this.f3251K = bVar.f3251K;
            this.f3252L = bVar.f3252L;
            this.f3253M = bVar.f3253M;
            this.f3254N = bVar.f3254N;
            this.f3255O = bVar.f3255O;
            this.f3256P = bVar.f3256P;
            this.f3257Q = bVar.f3257Q;
            this.f3258R = bVar.f3258R;
            this.f3259S = bVar.f3259S;
            this.f3260T = bVar.f3260T;
            this.f3261U = bVar.f3261U;
            this.f3262V = bVar.f3262V;
            this.f3263W = bVar.f3263W;
            this.f3264X = bVar.f3264X;
            this.f3265Y = bVar.f3265Y;
            this.f3266Z = bVar.f3266Z;
            this.f3268a0 = bVar.f3268a0;
            this.f3270b0 = bVar.f3270b0;
            this.f3272c0 = bVar.f3272c0;
            this.f3274d0 = bVar.f3274d0;
            this.f3276e0 = bVar.f3276e0;
            this.f3278f0 = bVar.f3278f0;
            this.f3280g0 = bVar.f3280g0;
            this.f3282h0 = bVar.f3282h0;
            this.f3284i0 = bVar.f3284i0;
            this.f3290l0 = bVar.f3290l0;
            int[] iArr = bVar.f3286j0;
            if (iArr == null || bVar.f3288k0 != null) {
                this.f3286j0 = null;
            } else {
                this.f3286j0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f3288k0 = bVar.f3288k0;
            this.f3292m0 = bVar.f3292m0;
            this.f3294n0 = bVar.f3294n0;
            this.f3296o0 = bVar.f3296o0;
            this.f3298p0 = bVar.f3298p0;
        }

        /* renamed from: b */
        public void mo5185b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c65.Layout);
            this.f3269b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = f3240q0.get(index);
                if (i2 == 80) {
                    this.f3292m0 = obtainStyledAttributes.getBoolean(index, this.f3292m0);
                } else if (i2 == 81) {
                    this.f3294n0 = obtainStyledAttributes.getBoolean(index, this.f3294n0);
                } else if (i2 != 97) {
                    switch (i2) {
                        case 1:
                            this.f3299q = C0532a.m4188F(obtainStyledAttributes, index, this.f3299q);
                            break;
                        case 2:
                            this.f3250J = obtainStyledAttributes.getDimensionPixelSize(index, this.f3250J);
                            break;
                        case 3:
                            this.f3297p = C0532a.m4188F(obtainStyledAttributes, index, this.f3297p);
                            break;
                        case 4:
                            this.f3295o = C0532a.m4188F(obtainStyledAttributes, index, this.f3295o);
                            break;
                        case 5:
                            this.f3308z = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f3244D = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3244D);
                            break;
                        case 7:
                            this.f3245E = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3245E);
                            break;
                        case 8:
                            this.f3251K = obtainStyledAttributes.getDimensionPixelSize(index, this.f3251K);
                            break;
                        case 9:
                            this.f3305w = C0532a.m4188F(obtainStyledAttributes, index, this.f3305w);
                            break;
                        case 10:
                            this.f3304v = C0532a.m4188F(obtainStyledAttributes, index, this.f3304v);
                            break;
                        case 11:
                            this.f3257Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f3257Q);
                            break;
                        case 12:
                            this.f3258R = obtainStyledAttributes.getDimensionPixelSize(index, this.f3258R);
                            break;
                        case 13:
                            this.f3254N = obtainStyledAttributes.getDimensionPixelSize(index, this.f3254N);
                            break;
                        case 14:
                            this.f3256P = obtainStyledAttributes.getDimensionPixelSize(index, this.f3256P);
                            break;
                        case 15:
                            this.f3259S = obtainStyledAttributes.getDimensionPixelSize(index, this.f3259S);
                            break;
                        case 16:
                            this.f3255O = obtainStyledAttributes.getDimensionPixelSize(index, this.f3255O);
                            break;
                        case 17:
                            this.f3277f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3277f);
                            break;
                        case 18:
                            this.f3279g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3279g);
                            break;
                        case 19:
                            this.f3281h = obtainStyledAttributes.getFloat(index, this.f3281h);
                            break;
                        case 20:
                            this.f3306x = obtainStyledAttributes.getFloat(index, this.f3306x);
                            break;
                        case 21:
                            this.f3275e = obtainStyledAttributes.getLayoutDimension(index, this.f3275e);
                            break;
                        case 22:
                            this.f3273d = obtainStyledAttributes.getLayoutDimension(index, this.f3273d);
                            break;
                        case 23:
                            this.f3247G = obtainStyledAttributes.getDimensionPixelSize(index, this.f3247G);
                            break;
                        case 24:
                            this.f3283i = C0532a.m4188F(obtainStyledAttributes, index, this.f3283i);
                            break;
                        case 25:
                            this.f3285j = C0532a.m4188F(obtainStyledAttributes, index, this.f3285j);
                            break;
                        case 26:
                            this.f3246F = obtainStyledAttributes.getInt(index, this.f3246F);
                            break;
                        case 27:
                            this.f3248H = obtainStyledAttributes.getDimensionPixelSize(index, this.f3248H);
                            break;
                        case 28:
                            this.f3287k = C0532a.m4188F(obtainStyledAttributes, index, this.f3287k);
                            break;
                        case 29:
                            this.f3289l = C0532a.m4188F(obtainStyledAttributes, index, this.f3289l);
                            break;
                        case 30:
                            this.f3252L = obtainStyledAttributes.getDimensionPixelSize(index, this.f3252L);
                            break;
                        case 31:
                            this.f3302t = C0532a.m4188F(obtainStyledAttributes, index, this.f3302t);
                            break;
                        case 32:
                            this.f3303u = C0532a.m4188F(obtainStyledAttributes, index, this.f3303u);
                            break;
                        case 33:
                            this.f3249I = obtainStyledAttributes.getDimensionPixelSize(index, this.f3249I);
                            break;
                        case 34:
                            this.f3293n = C0532a.m4188F(obtainStyledAttributes, index, this.f3293n);
                            break;
                        case 35:
                            this.f3291m = C0532a.m4188F(obtainStyledAttributes, index, this.f3291m);
                            break;
                        case 36:
                            this.f3307y = obtainStyledAttributes.getFloat(index, this.f3307y);
                            break;
                        case 37:
                            this.f3262V = obtainStyledAttributes.getFloat(index, this.f3262V);
                            break;
                        case 38:
                            this.f3261U = obtainStyledAttributes.getFloat(index, this.f3261U);
                            break;
                        case 39:
                            this.f3263W = obtainStyledAttributes.getInt(index, this.f3263W);
                            break;
                        case 40:
                            this.f3264X = obtainStyledAttributes.getInt(index, this.f3264X);
                            break;
                        case 41:
                            C0532a.m4189G(this, obtainStyledAttributes, index, 0);
                            break;
                        case 42:
                            C0532a.m4189G(this, obtainStyledAttributes, index, 1);
                            break;
                        default:
                            switch (i2) {
                                case 54:
                                    this.f3265Y = obtainStyledAttributes.getInt(index, this.f3265Y);
                                    break;
                                case 55:
                                    this.f3266Z = obtainStyledAttributes.getInt(index, this.f3266Z);
                                    break;
                                case 56:
                                    this.f3268a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3268a0);
                                    break;
                                case 57:
                                    this.f3270b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3270b0);
                                    break;
                                case 58:
                                    this.f3272c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3272c0);
                                    break;
                                case 59:
                                    this.f3274d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3274d0);
                                    break;
                                default:
                                    switch (i2) {
                                        case 61:
                                            this.f3241A = C0532a.m4188F(obtainStyledAttributes, index, this.f3241A);
                                            break;
                                        case 62:
                                            this.f3242B = obtainStyledAttributes.getDimensionPixelSize(index, this.f3242B);
                                            break;
                                        case 63:
                                            this.f3243C = obtainStyledAttributes.getFloat(index, this.f3243C);
                                            break;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.f3276e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f3278f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    break;
                                                case 72:
                                                    this.f3280g0 = obtainStyledAttributes.getInt(index, this.f3280g0);
                                                    break;
                                                case 73:
                                                    this.f3282h0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3282h0);
                                                    break;
                                                case 74:
                                                    this.f3288k0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f3296o0 = obtainStyledAttributes.getBoolean(index, this.f3296o0);
                                                    break;
                                                case 76:
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append("unused attribute 0x");
                                                    sb.append(Integer.toHexString(index));
                                                    sb.append("   ");
                                                    sb.append(f3240q0.get(index));
                                                    break;
                                                case 77:
                                                    this.f3290l0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    switch (i2) {
                                                        case 91:
                                                            this.f3300r = C0532a.m4188F(obtainStyledAttributes, index, this.f3300r);
                                                            break;
                                                        case 92:
                                                            this.f3301s = C0532a.m4188F(obtainStyledAttributes, index, this.f3301s);
                                                            break;
                                                        case 93:
                                                            this.f3253M = obtainStyledAttributes.getDimensionPixelSize(index, this.f3253M);
                                                            break;
                                                        case 94:
                                                            this.f3260T = obtainStyledAttributes.getDimensionPixelSize(index, this.f3260T);
                                                            break;
                                                        default:
                                                            StringBuilder sb2 = new StringBuilder();
                                                            sb2.append("Unknown attribute 0x");
                                                            sb2.append(Integer.toHexString(index));
                                                            sb2.append("   ");
                                                            sb2.append(f3240q0.get(index));
                                                            break;
                                                    }
                                            }
                                    }
                            }
                    }
                } else {
                    this.f3298p0 = obtainStyledAttributes.getInt(index, this.f3298p0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.a$c */
    /* compiled from: ConstraintSet */
    public static class C0536c {

        /* renamed from: o */
        public static SparseIntArray f3309o;

        /* renamed from: a */
        public boolean f3310a = false;

        /* renamed from: b */
        public int f3311b = -1;

        /* renamed from: c */
        public int f3312c = 0;

        /* renamed from: d */
        public String f3313d = null;

        /* renamed from: e */
        public int f3314e = -1;

        /* renamed from: f */
        public int f3315f = 0;

        /* renamed from: g */
        public float f3316g = Float.NaN;

        /* renamed from: h */
        public int f3317h = -1;

        /* renamed from: i */
        public float f3318i = Float.NaN;

        /* renamed from: j */
        public float f3319j = Float.NaN;

        /* renamed from: k */
        public int f3320k = -1;

        /* renamed from: l */
        public String f3321l = null;

        /* renamed from: m */
        public int f3322m = -3;

        /* renamed from: n */
        public int f3323n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3309o = sparseIntArray;
            sparseIntArray.append(c65.Motion_motionPathRotate, 1);
            f3309o.append(c65.Motion_pathMotionArc, 2);
            f3309o.append(c65.Motion_transitionEasing, 3);
            f3309o.append(c65.Motion_drawPath, 4);
            f3309o.append(c65.Motion_animateRelativeTo, 5);
            f3309o.append(c65.Motion_animateCircleAngleTo, 6);
            f3309o.append(c65.Motion_motionStagger, 7);
            f3309o.append(c65.Motion_quantizeMotionSteps, 8);
            f3309o.append(c65.Motion_quantizeMotionPhase, 9);
            f3309o.append(c65.Motion_quantizeMotionInterpolator, 10);
        }

        /* renamed from: a */
        public void mo5186a(C0536c cVar) {
            this.f3310a = cVar.f3310a;
            this.f3311b = cVar.f3311b;
            this.f3313d = cVar.f3313d;
            this.f3314e = cVar.f3314e;
            this.f3315f = cVar.f3315f;
            this.f3318i = cVar.f3318i;
            this.f3316g = cVar.f3316g;
            this.f3317h = cVar.f3317h;
        }

        /* renamed from: b */
        public void mo5187b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c65.Motion);
            this.f3310a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f3309o.get(index)) {
                    case 1:
                        this.f3318i = obtainStyledAttributes.getFloat(index, this.f3318i);
                        break;
                    case 2:
                        this.f3314e = obtainStyledAttributes.getInt(index, this.f3314e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.f3313d = ym1.f20291c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            this.f3313d = obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 4:
                        this.f3315f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f3311b = C0532a.m4188F(obtainStyledAttributes, index, this.f3311b);
                        break;
                    case 6:
                        this.f3312c = obtainStyledAttributes.getInteger(index, this.f3312c);
                        break;
                    case 7:
                        this.f3316g = obtainStyledAttributes.getFloat(index, this.f3316g);
                        break;
                    case 8:
                        this.f3320k = obtainStyledAttributes.getInteger(index, this.f3320k);
                        break;
                    case 9:
                        this.f3319j = obtainStyledAttributes.getFloat(index, this.f3319j);
                        break;
                    case 10:
                        int i2 = obtainStyledAttributes.peekValue(index).type;
                        if (i2 != 1) {
                            if (i2 != 3) {
                                this.f3322m = obtainStyledAttributes.getInteger(index, this.f3323n);
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                this.f3321l = string;
                                if (string.indexOf("/") <= 0) {
                                    this.f3322m = -1;
                                    break;
                                } else {
                                    this.f3323n = obtainStyledAttributes.getResourceId(index, -1);
                                    this.f3322m = -2;
                                    break;
                                }
                            }
                        } else {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f3323n = resourceId;
                            if (resourceId == -1) {
                                break;
                            } else {
                                this.f3322m = -2;
                                break;
                            }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.a$d */
    /* compiled from: ConstraintSet */
    public static class C0537d {

        /* renamed from: a */
        public boolean f3324a = false;

        /* renamed from: b */
        public int f3325b = 0;

        /* renamed from: c */
        public int f3326c = 0;

        /* renamed from: d */
        public float f3327d = 1.0f;

        /* renamed from: e */
        public float f3328e = Float.NaN;

        /* renamed from: a */
        public void mo5188a(C0537d dVar) {
            this.f3324a = dVar.f3324a;
            this.f3325b = dVar.f3325b;
            this.f3327d = dVar.f3327d;
            this.f3328e = dVar.f3328e;
            this.f3326c = dVar.f3326c;
        }

        /* renamed from: b */
        public void mo5189b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c65.PropertySet);
            this.f3324a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == c65.PropertySet_android_alpha) {
                    this.f3327d = obtainStyledAttributes.getFloat(index, this.f3327d);
                } else if (index == c65.PropertySet_android_visibility) {
                    this.f3325b = obtainStyledAttributes.getInt(index, this.f3325b);
                    this.f3325b = C0532a.f3210h[this.f3325b];
                } else if (index == c65.PropertySet_visibilityMode) {
                    this.f3326c = obtainStyledAttributes.getInt(index, this.f3326c);
                } else if (index == c65.PropertySet_motionProgress) {
                    this.f3328e = obtainStyledAttributes.getFloat(index, this.f3328e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.a$e */
    /* compiled from: ConstraintSet */
    public static class C0538e {

        /* renamed from: o */
        public static SparseIntArray f3329o;

        /* renamed from: a */
        public boolean f3330a = false;

        /* renamed from: b */
        public float f3331b = Utils.FLOAT_EPSILON;

        /* renamed from: c */
        public float f3332c = Utils.FLOAT_EPSILON;

        /* renamed from: d */
        public float f3333d = Utils.FLOAT_EPSILON;

        /* renamed from: e */
        public float f3334e = 1.0f;

        /* renamed from: f */
        public float f3335f = 1.0f;

        /* renamed from: g */
        public float f3336g = Float.NaN;

        /* renamed from: h */
        public float f3337h = Float.NaN;

        /* renamed from: i */
        public int f3338i = -1;

        /* renamed from: j */
        public float f3339j = Utils.FLOAT_EPSILON;

        /* renamed from: k */
        public float f3340k = Utils.FLOAT_EPSILON;

        /* renamed from: l */
        public float f3341l = Utils.FLOAT_EPSILON;

        /* renamed from: m */
        public boolean f3342m = false;

        /* renamed from: n */
        public float f3343n = Utils.FLOAT_EPSILON;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3329o = sparseIntArray;
            sparseIntArray.append(c65.Transform_android_rotation, 1);
            f3329o.append(c65.Transform_android_rotationX, 2);
            f3329o.append(c65.Transform_android_rotationY, 3);
            f3329o.append(c65.Transform_android_scaleX, 4);
            f3329o.append(c65.Transform_android_scaleY, 5);
            f3329o.append(c65.Transform_android_transformPivotX, 6);
            f3329o.append(c65.Transform_android_transformPivotY, 7);
            f3329o.append(c65.Transform_android_translationX, 8);
            f3329o.append(c65.Transform_android_translationY, 9);
            f3329o.append(c65.Transform_android_translationZ, 10);
            f3329o.append(c65.Transform_android_elevation, 11);
            f3329o.append(c65.Transform_transformPivotTarget, 12);
        }

        /* renamed from: a */
        public void mo5190a(C0538e eVar) {
            this.f3330a = eVar.f3330a;
            this.f3331b = eVar.f3331b;
            this.f3332c = eVar.f3332c;
            this.f3333d = eVar.f3333d;
            this.f3334e = eVar.f3334e;
            this.f3335f = eVar.f3335f;
            this.f3336g = eVar.f3336g;
            this.f3337h = eVar.f3337h;
            this.f3338i = eVar.f3338i;
            this.f3339j = eVar.f3339j;
            this.f3340k = eVar.f3340k;
            this.f3341l = eVar.f3341l;
            this.f3342m = eVar.f3342m;
            this.f3343n = eVar.f3343n;
        }

        /* renamed from: b */
        public void mo5191b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c65.Transform);
            this.f3330a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f3329o.get(index)) {
                    case 1:
                        this.f3331b = obtainStyledAttributes.getFloat(index, this.f3331b);
                        break;
                    case 2:
                        this.f3332c = obtainStyledAttributes.getFloat(index, this.f3332c);
                        break;
                    case 3:
                        this.f3333d = obtainStyledAttributes.getFloat(index, this.f3333d);
                        break;
                    case 4:
                        this.f3334e = obtainStyledAttributes.getFloat(index, this.f3334e);
                        break;
                    case 5:
                        this.f3335f = obtainStyledAttributes.getFloat(index, this.f3335f);
                        break;
                    case 6:
                        this.f3336g = obtainStyledAttributes.getDimension(index, this.f3336g);
                        break;
                    case 7:
                        this.f3337h = obtainStyledAttributes.getDimension(index, this.f3337h);
                        break;
                    case 8:
                        this.f3339j = obtainStyledAttributes.getDimension(index, this.f3339j);
                        break;
                    case 9:
                        this.f3340k = obtainStyledAttributes.getDimension(index, this.f3340k);
                        break;
                    case 10:
                        this.f3341l = obtainStyledAttributes.getDimension(index, this.f3341l);
                        break;
                    case 11:
                        this.f3342m = true;
                        this.f3343n = obtainStyledAttributes.getDimension(index, this.f3343n);
                        break;
                    case 12:
                        this.f3338i = C0532a.m4188F(obtainStyledAttributes, index, this.f3338i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f3211i.append(c65.Constraint_layout_constraintLeft_toLeftOf, 25);
        f3211i.append(c65.Constraint_layout_constraintLeft_toRightOf, 26);
        f3211i.append(c65.Constraint_layout_constraintRight_toLeftOf, 29);
        f3211i.append(c65.Constraint_layout_constraintRight_toRightOf, 30);
        f3211i.append(c65.Constraint_layout_constraintTop_toTopOf, 36);
        f3211i.append(c65.Constraint_layout_constraintTop_toBottomOf, 35);
        f3211i.append(c65.Constraint_layout_constraintBottom_toTopOf, 4);
        f3211i.append(c65.Constraint_layout_constraintBottom_toBottomOf, 3);
        f3211i.append(c65.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f3211i.append(c65.Constraint_layout_constraintBaseline_toTopOf, 91);
        f3211i.append(c65.Constraint_layout_constraintBaseline_toBottomOf, 92);
        f3211i.append(c65.Constraint_layout_editor_absoluteX, 6);
        f3211i.append(c65.Constraint_layout_editor_absoluteY, 7);
        f3211i.append(c65.Constraint_layout_constraintGuide_begin, 17);
        f3211i.append(c65.Constraint_layout_constraintGuide_end, 18);
        f3211i.append(c65.Constraint_layout_constraintGuide_percent, 19);
        f3211i.append(c65.Constraint_android_orientation, 27);
        f3211i.append(c65.Constraint_layout_constraintStart_toEndOf, 32);
        f3211i.append(c65.Constraint_layout_constraintStart_toStartOf, 33);
        f3211i.append(c65.Constraint_layout_constraintEnd_toStartOf, 10);
        f3211i.append(c65.Constraint_layout_constraintEnd_toEndOf, 9);
        f3211i.append(c65.Constraint_layout_goneMarginLeft, 13);
        f3211i.append(c65.Constraint_layout_goneMarginTop, 16);
        f3211i.append(c65.Constraint_layout_goneMarginRight, 14);
        f3211i.append(c65.Constraint_layout_goneMarginBottom, 11);
        f3211i.append(c65.Constraint_layout_goneMarginStart, 15);
        f3211i.append(c65.Constraint_layout_goneMarginEnd, 12);
        f3211i.append(c65.Constraint_layout_constraintVertical_weight, 40);
        f3211i.append(c65.Constraint_layout_constraintHorizontal_weight, 39);
        f3211i.append(c65.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f3211i.append(c65.Constraint_layout_constraintVertical_chainStyle, 42);
        f3211i.append(c65.Constraint_layout_constraintHorizontal_bias, 20);
        f3211i.append(c65.Constraint_layout_constraintVertical_bias, 37);
        f3211i.append(c65.Constraint_layout_constraintDimensionRatio, 5);
        f3211i.append(c65.Constraint_layout_constraintLeft_creator, 87);
        f3211i.append(c65.Constraint_layout_constraintTop_creator, 87);
        f3211i.append(c65.Constraint_layout_constraintRight_creator, 87);
        f3211i.append(c65.Constraint_layout_constraintBottom_creator, 87);
        f3211i.append(c65.Constraint_layout_constraintBaseline_creator, 87);
        f3211i.append(c65.Constraint_android_layout_marginLeft, 24);
        f3211i.append(c65.Constraint_android_layout_marginRight, 28);
        f3211i.append(c65.Constraint_android_layout_marginStart, 31);
        f3211i.append(c65.Constraint_android_layout_marginEnd, 8);
        f3211i.append(c65.Constraint_android_layout_marginTop, 34);
        f3211i.append(c65.Constraint_android_layout_marginBottom, 2);
        f3211i.append(c65.Constraint_android_layout_width, 23);
        f3211i.append(c65.Constraint_android_layout_height, 21);
        f3211i.append(c65.Constraint_layout_constraintWidth, 95);
        f3211i.append(c65.Constraint_layout_constraintHeight, 96);
        f3211i.append(c65.Constraint_android_visibility, 22);
        f3211i.append(c65.Constraint_android_alpha, 43);
        f3211i.append(c65.Constraint_android_elevation, 44);
        f3211i.append(c65.Constraint_android_rotationX, 45);
        f3211i.append(c65.Constraint_android_rotationY, 46);
        f3211i.append(c65.Constraint_android_rotation, 60);
        f3211i.append(c65.Constraint_android_scaleX, 47);
        f3211i.append(c65.Constraint_android_scaleY, 48);
        f3211i.append(c65.Constraint_android_transformPivotX, 49);
        f3211i.append(c65.Constraint_android_transformPivotY, 50);
        f3211i.append(c65.Constraint_android_translationX, 51);
        f3211i.append(c65.Constraint_android_translationY, 52);
        f3211i.append(c65.Constraint_android_translationZ, 53);
        f3211i.append(c65.Constraint_layout_constraintWidth_default, 54);
        f3211i.append(c65.Constraint_layout_constraintHeight_default, 55);
        f3211i.append(c65.Constraint_layout_constraintWidth_max, 56);
        f3211i.append(c65.Constraint_layout_constraintHeight_max, 57);
        f3211i.append(c65.Constraint_layout_constraintWidth_min, 58);
        f3211i.append(c65.Constraint_layout_constraintHeight_min, 59);
        f3211i.append(c65.Constraint_layout_constraintCircle, 61);
        f3211i.append(c65.Constraint_layout_constraintCircleRadius, 62);
        f3211i.append(c65.Constraint_layout_constraintCircleAngle, 63);
        f3211i.append(c65.Constraint_animateRelativeTo, 64);
        f3211i.append(c65.Constraint_transitionEasing, 65);
        f3211i.append(c65.Constraint_drawPath, 66);
        f3211i.append(c65.Constraint_transitionPathRotate, 67);
        f3211i.append(c65.Constraint_motionStagger, 79);
        f3211i.append(c65.Constraint_android_id, 38);
        f3211i.append(c65.Constraint_motionProgress, 68);
        f3211i.append(c65.Constraint_layout_constraintWidth_percent, 69);
        f3211i.append(c65.Constraint_layout_constraintHeight_percent, 70);
        f3211i.append(c65.Constraint_layout_wrapBehaviorInParent, 97);
        f3211i.append(c65.Constraint_chainUseRtl, 71);
        f3211i.append(c65.Constraint_barrierDirection, 72);
        f3211i.append(c65.Constraint_barrierMargin, 73);
        f3211i.append(c65.Constraint_constraint_referenced_ids, 74);
        f3211i.append(c65.Constraint_barrierAllowsGoneWidgets, 75);
        f3211i.append(c65.Constraint_pathMotionArc, 76);
        f3211i.append(c65.Constraint_layout_constraintTag, 77);
        f3211i.append(c65.Constraint_visibilityMode, 78);
        f3211i.append(c65.Constraint_layout_constrainedWidth, 80);
        f3211i.append(c65.Constraint_layout_constrainedHeight, 81);
        f3211i.append(c65.Constraint_polarRelativeTo, 82);
        f3211i.append(c65.Constraint_transformPivotTarget, 83);
        f3211i.append(c65.Constraint_quantizeMotionSteps, 84);
        f3211i.append(c65.Constraint_quantizeMotionPhase, 85);
        f3211i.append(c65.Constraint_quantizeMotionInterpolator, 86);
        SparseIntArray sparseIntArray = f3212j;
        int i = c65.ConstraintOverride_layout_editor_absoluteY;
        sparseIntArray.append(i, 6);
        f3212j.append(i, 7);
        f3212j.append(c65.ConstraintOverride_android_orientation, 27);
        f3212j.append(c65.ConstraintOverride_layout_goneMarginLeft, 13);
        f3212j.append(c65.ConstraintOverride_layout_goneMarginTop, 16);
        f3212j.append(c65.ConstraintOverride_layout_goneMarginRight, 14);
        f3212j.append(c65.ConstraintOverride_layout_goneMarginBottom, 11);
        f3212j.append(c65.ConstraintOverride_layout_goneMarginStart, 15);
        f3212j.append(c65.ConstraintOverride_layout_goneMarginEnd, 12);
        f3212j.append(c65.ConstraintOverride_layout_constraintVertical_weight, 40);
        f3212j.append(c65.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        f3212j.append(c65.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        f3212j.append(c65.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        f3212j.append(c65.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        f3212j.append(c65.ConstraintOverride_layout_constraintVertical_bias, 37);
        f3212j.append(c65.ConstraintOverride_layout_constraintDimensionRatio, 5);
        f3212j.append(c65.ConstraintOverride_layout_constraintLeft_creator, 87);
        f3212j.append(c65.ConstraintOverride_layout_constraintTop_creator, 87);
        f3212j.append(c65.ConstraintOverride_layout_constraintRight_creator, 87);
        f3212j.append(c65.ConstraintOverride_layout_constraintBottom_creator, 87);
        f3212j.append(c65.ConstraintOverride_layout_constraintBaseline_creator, 87);
        f3212j.append(c65.ConstraintOverride_android_layout_marginLeft, 24);
        f3212j.append(c65.ConstraintOverride_android_layout_marginRight, 28);
        f3212j.append(c65.ConstraintOverride_android_layout_marginStart, 31);
        f3212j.append(c65.ConstraintOverride_android_layout_marginEnd, 8);
        f3212j.append(c65.ConstraintOverride_android_layout_marginTop, 34);
        f3212j.append(c65.ConstraintOverride_android_layout_marginBottom, 2);
        f3212j.append(c65.ConstraintOverride_android_layout_width, 23);
        f3212j.append(c65.ConstraintOverride_android_layout_height, 21);
        f3212j.append(c65.ConstraintOverride_layout_constraintWidth, 95);
        f3212j.append(c65.ConstraintOverride_layout_constraintHeight, 96);
        f3212j.append(c65.ConstraintOverride_android_visibility, 22);
        f3212j.append(c65.ConstraintOverride_android_alpha, 43);
        f3212j.append(c65.ConstraintOverride_android_elevation, 44);
        f3212j.append(c65.ConstraintOverride_android_rotationX, 45);
        f3212j.append(c65.ConstraintOverride_android_rotationY, 46);
        f3212j.append(c65.ConstraintOverride_android_rotation, 60);
        f3212j.append(c65.ConstraintOverride_android_scaleX, 47);
        f3212j.append(c65.ConstraintOverride_android_scaleY, 48);
        f3212j.append(c65.ConstraintOverride_android_transformPivotX, 49);
        f3212j.append(c65.ConstraintOverride_android_transformPivotY, 50);
        f3212j.append(c65.ConstraintOverride_android_translationX, 51);
        f3212j.append(c65.ConstraintOverride_android_translationY, 52);
        f3212j.append(c65.ConstraintOverride_android_translationZ, 53);
        f3212j.append(c65.ConstraintOverride_layout_constraintWidth_default, 54);
        f3212j.append(c65.ConstraintOverride_layout_constraintHeight_default, 55);
        f3212j.append(c65.ConstraintOverride_layout_constraintWidth_max, 56);
        f3212j.append(c65.ConstraintOverride_layout_constraintHeight_max, 57);
        f3212j.append(c65.ConstraintOverride_layout_constraintWidth_min, 58);
        f3212j.append(c65.ConstraintOverride_layout_constraintHeight_min, 59);
        f3212j.append(c65.ConstraintOverride_layout_constraintCircleRadius, 62);
        f3212j.append(c65.ConstraintOverride_layout_constraintCircleAngle, 63);
        f3212j.append(c65.ConstraintOverride_animateRelativeTo, 64);
        f3212j.append(c65.ConstraintOverride_transitionEasing, 65);
        f3212j.append(c65.ConstraintOverride_drawPath, 66);
        f3212j.append(c65.ConstraintOverride_transitionPathRotate, 67);
        f3212j.append(c65.ConstraintOverride_motionStagger, 79);
        f3212j.append(c65.ConstraintOverride_android_id, 38);
        f3212j.append(c65.ConstraintOverride_motionTarget, 98);
        f3212j.append(c65.ConstraintOverride_motionProgress, 68);
        f3212j.append(c65.ConstraintOverride_layout_constraintWidth_percent, 69);
        f3212j.append(c65.ConstraintOverride_layout_constraintHeight_percent, 70);
        f3212j.append(c65.ConstraintOverride_chainUseRtl, 71);
        f3212j.append(c65.ConstraintOverride_barrierDirection, 72);
        f3212j.append(c65.ConstraintOverride_barrierMargin, 73);
        f3212j.append(c65.ConstraintOverride_constraint_referenced_ids, 74);
        f3212j.append(c65.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        f3212j.append(c65.ConstraintOverride_pathMotionArc, 76);
        f3212j.append(c65.ConstraintOverride_layout_constraintTag, 77);
        f3212j.append(c65.ConstraintOverride_visibilityMode, 78);
        f3212j.append(c65.ConstraintOverride_layout_constrainedWidth, 80);
        f3212j.append(c65.ConstraintOverride_layout_constrainedHeight, 81);
        f3212j.append(c65.ConstraintOverride_polarRelativeTo, 82);
        f3212j.append(c65.ConstraintOverride_transformPivotTarget, 83);
        f3212j.append(c65.ConstraintOverride_quantizeMotionSteps, 84);
        f3212j.append(c65.ConstraintOverride_quantizeMotionPhase, 85);
        f3212j.append(c65.ConstraintOverride_quantizeMotionInterpolator, 86);
        f3212j.append(c65.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    /* renamed from: F */
    public static int m4188F(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    /* renamed from: G */
    public static void m4189G(Object obj, TypedArray typedArray, int i, int i2) {
        if (obj != null) {
            int i3 = typedArray.peekValue(i).type;
            if (i3 != 3) {
                int i4 = -2;
                boolean z = false;
                if (i3 != 5) {
                    int i5 = typedArray.getInt(i, 0);
                    if (i5 == -4) {
                        z = true;
                    } else if (i5 == -3 || !(i5 == -2 || i5 == -1)) {
                        i4 = 0;
                    } else {
                        i4 = i5;
                    }
                } else {
                    i4 = typedArray.getDimensionPixelSize(i, 0);
                }
                if (obj instanceof ConstraintLayout.LayoutParams) {
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) obj;
                    if (i2 == 0) {
                        layoutParams.width = i4;
                        layoutParams.f3128Z = z;
                        return;
                    }
                    layoutParams.height = i4;
                    layoutParams.f3130a0 = z;
                } else if (obj instanceof C0535b) {
                    C0535b bVar = (C0535b) obj;
                    if (i2 == 0) {
                        bVar.f3273d = i4;
                        bVar.f3292m0 = z;
                        return;
                    }
                    bVar.f3275e = i4;
                    bVar.f3294n0 = z;
                } else if (obj instanceof C0533a.C0534a) {
                    C0533a.C0534a aVar = (C0533a.C0534a) obj;
                    if (i2 == 0) {
                        aVar.mo5180b(23, i4);
                        aVar.mo5182d(80, z);
                        return;
                    }
                    aVar.mo5180b(21, i4);
                    aVar.mo5182d(81, z);
                }
            } else {
                m4190H(obj, typedArray.getString(i), i2);
            }
        }
    }

    /* renamed from: H */
    public static void m4190H(Object obj, String str, int i) {
        if (str != null) {
            int indexOf = str.indexOf(61);
            int length = str.length();
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                String substring2 = str.substring(indexOf + 1);
                if (substring2.length() > 0) {
                    String trim = substring.trim();
                    String trim2 = substring2.trim();
                    if ("ratio".equalsIgnoreCase(trim)) {
                        if (obj instanceof ConstraintLayout.LayoutParams) {
                            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) obj;
                            if (i == 0) {
                                layoutParams.width = 0;
                            } else {
                                layoutParams.height = 0;
                            }
                            m4191I(layoutParams, trim2);
                        } else if (obj instanceof C0535b) {
                            ((C0535b) obj).f3308z = trim2;
                        } else if (obj instanceof C0533a.C0534a) {
                            ((C0533a.C0534a) obj).mo5181c(5, trim2);
                        }
                    } else if ("weight".equalsIgnoreCase(trim)) {
                        try {
                            float parseFloat = Float.parseFloat(trim2);
                            if (obj instanceof ConstraintLayout.LayoutParams) {
                                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) obj;
                                if (i == 0) {
                                    layoutParams2.width = 0;
                                    layoutParams2.f3113K = parseFloat;
                                    return;
                                }
                                layoutParams2.height = 0;
                                layoutParams2.f3114L = parseFloat;
                            } else if (obj instanceof C0535b) {
                                C0535b bVar = (C0535b) obj;
                                if (i == 0) {
                                    bVar.f3273d = 0;
                                    bVar.f3262V = parseFloat;
                                    return;
                                }
                                bVar.f3275e = 0;
                                bVar.f3261U = parseFloat;
                            } else if (obj instanceof C0533a.C0534a) {
                                C0533a.C0534a aVar = (C0533a.C0534a) obj;
                                if (i == 0) {
                                    aVar.mo5180b(23, 0);
                                    aVar.mo5179a(39, parseFloat);
                                    return;
                                }
                                aVar.mo5180b(21, 0);
                                aVar.mo5179a(40, parseFloat);
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } else if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(Utils.FLOAT_EPSILON, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof ConstraintLayout.LayoutParams) {
                            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) obj;
                            if (i == 0) {
                                layoutParams3.width = 0;
                                layoutParams3.f3123U = max;
                                layoutParams3.f3117O = 2;
                                return;
                            }
                            layoutParams3.height = 0;
                            layoutParams3.f3124V = max;
                            layoutParams3.f3118P = 2;
                        } else if (obj instanceof C0535b) {
                            C0535b bVar2 = (C0535b) obj;
                            if (i == 0) {
                                bVar2.f3273d = 0;
                                bVar2.f3276e0 = max;
                                bVar2.f3265Y = 2;
                                return;
                            }
                            bVar2.f3275e = 0;
                            bVar2.f3278f0 = max;
                            bVar2.f3266Z = 2;
                        } else if (obj instanceof C0533a.C0534a) {
                            C0533a.C0534a aVar2 = (C0533a.C0534a) obj;
                            if (i == 0) {
                                aVar2.mo5180b(23, 0);
                                aVar2.mo5180b(54, 2);
                                return;
                            }
                            aVar2.mo5180b(21, 0);
                            aVar2.mo5180b(55, 2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: I */
    public static void m4191I(ConstraintLayout.LayoutParams layoutParams, String str) {
        float f = Float.NaN;
        int i = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i = 1;
                }
                i2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i2);
                if (substring2.length() > 0) {
                    f = Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i2, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > Utils.FLOAT_EPSILON && parseFloat2 > Utils.FLOAT_EPSILON) {
                            f = i == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        layoutParams.f3110H = str;
        layoutParams.f3111I = f;
        layoutParams.f3112J = i;
    }

    /* renamed from: K */
    public static void m4192K(Context context, C0533a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        C0533a.C0534a aVar2 = new C0533a.C0534a();
        aVar.f3227h = aVar2;
        aVar.f3223d.f3310a = false;
        aVar.f3224e.f3269b = false;
        aVar.f3222c.f3324a = false;
        aVar.f3225f.f3330a = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (f3212j.get(index)) {
                case 2:
                    aVar2.mo5180b(2, typedArray.getDimensionPixelSize(index, aVar.f3224e.f3250J));
                    break;
                case 5:
                    aVar2.mo5181c(5, typedArray.getString(index));
                    break;
                case 6:
                    aVar2.mo5180b(6, typedArray.getDimensionPixelOffset(index, aVar.f3224e.f3244D));
                    break;
                case 7:
                    aVar2.mo5180b(7, typedArray.getDimensionPixelOffset(index, aVar.f3224e.f3245E));
                    break;
                case 8:
                    aVar2.mo5180b(8, typedArray.getDimensionPixelSize(index, aVar.f3224e.f3251K));
                    break;
                case 11:
                    aVar2.mo5180b(11, typedArray.getDimensionPixelSize(index, aVar.f3224e.f3257Q));
                    break;
                case 12:
                    aVar2.mo5180b(12, typedArray.getDimensionPixelSize(index, aVar.f3224e.f3258R));
                    break;
                case 13:
                    aVar2.mo5180b(13, typedArray.getDimensionPixelSize(index, aVar.f3224e.f3254N));
                    break;
                case 14:
                    aVar2.mo5180b(14, typedArray.getDimensionPixelSize(index, aVar.f3224e.f3256P));
                    break;
                case 15:
                    aVar2.mo5180b(15, typedArray.getDimensionPixelSize(index, aVar.f3224e.f3259S));
                    break;
                case 16:
                    aVar2.mo5180b(16, typedArray.getDimensionPixelSize(index, aVar.f3224e.f3255O));
                    break;
                case 17:
                    aVar2.mo5180b(17, typedArray.getDimensionPixelOffset(index, aVar.f3224e.f3277f));
                    break;
                case 18:
                    aVar2.mo5180b(18, typedArray.getDimensionPixelOffset(index, aVar.f3224e.f3279g));
                    break;
                case 19:
                    aVar2.mo5179a(19, typedArray.getFloat(index, aVar.f3224e.f3281h));
                    break;
                case 20:
                    aVar2.mo5179a(20, typedArray.getFloat(index, aVar.f3224e.f3306x));
                    break;
                case 21:
                    aVar2.mo5180b(21, typedArray.getLayoutDimension(index, aVar.f3224e.f3275e));
                    break;
                case 22:
                    aVar2.mo5180b(22, f3210h[typedArray.getInt(index, aVar.f3222c.f3325b)]);
                    break;
                case 23:
                    aVar2.mo5180b(23, typedArray.getLayoutDimension(index, aVar.f3224e.f3273d));
                    break;
                case 24:
                    aVar2.mo5180b(24, typedArray.getDimensionPixelSize(index, aVar.f3224e.f3247G));
                    break;
                case 27:
                    aVar2.mo5180b(27, typedArray.getInt(index, aVar.f3224e.f3246F));
                    break;
                case 28:
                    aVar2.mo5180b(28, typedArray.getDimensionPixelSize(index, aVar.f3224e.f3248H));
                    break;
                case 31:
                    aVar2.mo5180b(31, typedArray.getDimensionPixelSize(index, aVar.f3224e.f3252L));
                    break;
                case 34:
                    aVar2.mo5180b(34, typedArray.getDimensionPixelSize(index, aVar.f3224e.f3249I));
                    break;
                case 37:
                    aVar2.mo5179a(37, typedArray.getFloat(index, aVar.f3224e.f3307y));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f3220a);
                    aVar.f3220a = resourceId;
                    aVar2.mo5180b(38, resourceId);
                    break;
                case 39:
                    aVar2.mo5179a(39, typedArray.getFloat(index, aVar.f3224e.f3262V));
                    break;
                case 40:
                    aVar2.mo5179a(40, typedArray.getFloat(index, aVar.f3224e.f3261U));
                    break;
                case 41:
                    aVar2.mo5180b(41, typedArray.getInt(index, aVar.f3224e.f3263W));
                    break;
                case 42:
                    aVar2.mo5180b(42, typedArray.getInt(index, aVar.f3224e.f3264X));
                    break;
                case 43:
                    aVar2.mo5179a(43, typedArray.getFloat(index, aVar.f3222c.f3327d));
                    break;
                case 44:
                    aVar2.mo5182d(44, true);
                    aVar2.mo5179a(44, typedArray.getDimension(index, aVar.f3225f.f3343n));
                    break;
                case 45:
                    aVar2.mo5179a(45, typedArray.getFloat(index, aVar.f3225f.f3332c));
                    break;
                case 46:
                    aVar2.mo5179a(46, typedArray.getFloat(index, aVar.f3225f.f3333d));
                    break;
                case 47:
                    aVar2.mo5179a(47, typedArray.getFloat(index, aVar.f3225f.f3334e));
                    break;
                case 48:
                    aVar2.mo5179a(48, typedArray.getFloat(index, aVar.f3225f.f3335f));
                    break;
                case 49:
                    aVar2.mo5179a(49, typedArray.getDimension(index, aVar.f3225f.f3336g));
                    break;
                case 50:
                    aVar2.mo5179a(50, typedArray.getDimension(index, aVar.f3225f.f3337h));
                    break;
                case 51:
                    aVar2.mo5179a(51, typedArray.getDimension(index, aVar.f3225f.f3339j));
                    break;
                case 52:
                    aVar2.mo5179a(52, typedArray.getDimension(index, aVar.f3225f.f3340k));
                    break;
                case 53:
                    aVar2.mo5179a(53, typedArray.getDimension(index, aVar.f3225f.f3341l));
                    break;
                case 54:
                    aVar2.mo5180b(54, typedArray.getInt(index, aVar.f3224e.f3265Y));
                    break;
                case 55:
                    aVar2.mo5180b(55, typedArray.getInt(index, aVar.f3224e.f3266Z));
                    break;
                case 56:
                    aVar2.mo5180b(56, typedArray.getDimensionPixelSize(index, aVar.f3224e.f3268a0));
                    break;
                case 57:
                    aVar2.mo5180b(57, typedArray.getDimensionPixelSize(index, aVar.f3224e.f3270b0));
                    break;
                case 58:
                    aVar2.mo5180b(58, typedArray.getDimensionPixelSize(index, aVar.f3224e.f3272c0));
                    break;
                case 59:
                    aVar2.mo5180b(59, typedArray.getDimensionPixelSize(index, aVar.f3224e.f3274d0));
                    break;
                case 60:
                    aVar2.mo5179a(60, typedArray.getFloat(index, aVar.f3225f.f3331b));
                    break;
                case 62:
                    aVar2.mo5180b(62, typedArray.getDimensionPixelSize(index, aVar.f3224e.f3242B));
                    break;
                case 63:
                    aVar2.mo5179a(63, typedArray.getFloat(index, aVar.f3224e.f3243C));
                    break;
                case 64:
                    aVar2.mo5180b(64, m4188F(typedArray, index, aVar.f3223d.f3311b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        aVar2.mo5181c(65, ym1.f20291c[typedArray.getInteger(index, 0)]);
                        break;
                    } else {
                        aVar2.mo5181c(65, typedArray.getString(index));
                        break;
                    }
                case 66:
                    aVar2.mo5180b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    aVar2.mo5179a(67, typedArray.getFloat(index, aVar.f3223d.f3318i));
                    break;
                case 68:
                    aVar2.mo5179a(68, typedArray.getFloat(index, aVar.f3222c.f3328e));
                    break;
                case 69:
                    aVar2.mo5179a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    aVar2.mo5179a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    break;
                case 72:
                    aVar2.mo5180b(72, typedArray.getInt(index, aVar.f3224e.f3280g0));
                    break;
                case 73:
                    aVar2.mo5180b(73, typedArray.getDimensionPixelSize(index, aVar.f3224e.f3282h0));
                    break;
                case 74:
                    aVar2.mo5181c(74, typedArray.getString(index));
                    break;
                case 75:
                    aVar2.mo5182d(75, typedArray.getBoolean(index, aVar.f3224e.f3296o0));
                    break;
                case 76:
                    aVar2.mo5180b(76, typedArray.getInt(index, aVar.f3223d.f3314e));
                    break;
                case 77:
                    aVar2.mo5181c(77, typedArray.getString(index));
                    break;
                case 78:
                    aVar2.mo5180b(78, typedArray.getInt(index, aVar.f3222c.f3326c));
                    break;
                case 79:
                    aVar2.mo5179a(79, typedArray.getFloat(index, aVar.f3223d.f3316g));
                    break;
                case 80:
                    aVar2.mo5182d(80, typedArray.getBoolean(index, aVar.f3224e.f3292m0));
                    break;
                case 81:
                    aVar2.mo5182d(81, typedArray.getBoolean(index, aVar.f3224e.f3294n0));
                    break;
                case 82:
                    aVar2.mo5180b(82, typedArray.getInteger(index, aVar.f3223d.f3312c));
                    break;
                case 83:
                    aVar2.mo5180b(83, m4188F(typedArray, index, aVar.f3225f.f3338i));
                    break;
                case 84:
                    aVar2.mo5180b(84, typedArray.getInteger(index, aVar.f3223d.f3320k));
                    break;
                case 85:
                    aVar2.mo5179a(85, typedArray.getFloat(index, aVar.f3223d.f3319j));
                    break;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 != 1) {
                        if (i2 != 3) {
                            C0536c cVar = aVar.f3223d;
                            cVar.f3322m = typedArray.getInteger(index, cVar.f3323n);
                            aVar2.mo5180b(88, aVar.f3223d.f3322m);
                            break;
                        } else {
                            aVar.f3223d.f3321l = typedArray.getString(index);
                            aVar2.mo5181c(90, aVar.f3223d.f3321l);
                            if (aVar.f3223d.f3321l.indexOf("/") <= 0) {
                                aVar.f3223d.f3322m = -1;
                                aVar2.mo5180b(88, -1);
                                break;
                            } else {
                                aVar.f3223d.f3323n = typedArray.getResourceId(index, -1);
                                aVar2.mo5180b(89, aVar.f3223d.f3323n);
                                aVar.f3223d.f3322m = -2;
                                aVar2.mo5180b(88, -2);
                                break;
                            }
                        }
                    } else {
                        aVar.f3223d.f3323n = typedArray.getResourceId(index, -1);
                        aVar2.mo5180b(89, aVar.f3223d.f3323n);
                        C0536c cVar2 = aVar.f3223d;
                        if (cVar2.f3323n == -1) {
                            break;
                        } else {
                            cVar2.f3322m = -2;
                            aVar2.mo5180b(88, -2);
                            break;
                        }
                    }
                case 87:
                    StringBuilder sb = new StringBuilder();
                    sb.append("unused attribute 0x");
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(f3211i.get(index));
                    break;
                case 93:
                    aVar2.mo5180b(93, typedArray.getDimensionPixelSize(index, aVar.f3224e.f3253M));
                    break;
                case 94:
                    aVar2.mo5180b(94, typedArray.getDimensionPixelSize(index, aVar.f3224e.f3260T));
                    break;
                case 95:
                    m4189G(aVar2, typedArray, index, 0);
                    break;
                case 96:
                    m4189G(aVar2, typedArray, index, 1);
                    break;
                case 97:
                    aVar2.mo5180b(97, typedArray.getInt(index, aVar.f3224e.f3298p0));
                    break;
                case 98:
                    if (!MotionLayout.f2682P2) {
                        if (typedArray.peekValue(index).type != 3) {
                            aVar.f3220a = typedArray.getResourceId(index, aVar.f3220a);
                            break;
                        } else {
                            aVar.f3221b = typedArray.getString(index);
                            break;
                        }
                    } else {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f3220a);
                        aVar.f3220a = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            aVar.f3221b = typedArray.getString(index);
                            break;
                        }
                    }
                default:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown attribute 0x");
                    sb2.append(Integer.toHexString(index));
                    sb2.append("   ");
                    sb2.append(f3211i.get(index));
                    break;
            }
        }
    }

    /* renamed from: N */
    public static void m4193N(C0533a aVar, int i, float f) {
        if (i == 19) {
            aVar.f3224e.f3281h = f;
        } else if (i == 20) {
            aVar.f3224e.f3306x = f;
        } else if (i == 37) {
            aVar.f3224e.f3307y = f;
        } else if (i == 60) {
            aVar.f3225f.f3331b = f;
        } else if (i == 63) {
            aVar.f3224e.f3243C = f;
        } else if (i == 79) {
            aVar.f3223d.f3316g = f;
        } else if (i == 85) {
            aVar.f3223d.f3319j = f;
        } else if (i == 39) {
            aVar.f3224e.f3262V = f;
        } else if (i != 40) {
            switch (i) {
                case 43:
                    aVar.f3222c.f3327d = f;
                    return;
                case 44:
                    C0538e eVar = aVar.f3225f;
                    eVar.f3343n = f;
                    eVar.f3342m = true;
                    return;
                case 45:
                    aVar.f3225f.f3332c = f;
                    return;
                case 46:
                    aVar.f3225f.f3333d = f;
                    return;
                case 47:
                    aVar.f3225f.f3334e = f;
                    return;
                case 48:
                    aVar.f3225f.f3335f = f;
                    return;
                case 49:
                    aVar.f3225f.f3336g = f;
                    return;
                case 50:
                    aVar.f3225f.f3337h = f;
                    return;
                case 51:
                    aVar.f3225f.f3339j = f;
                    return;
                case 52:
                    aVar.f3225f.f3340k = f;
                    return;
                case 53:
                    aVar.f3225f.f3341l = f;
                    return;
                default:
                    switch (i) {
                        case 67:
                            aVar.f3223d.f3318i = f;
                            return;
                        case 68:
                            aVar.f3222c.f3328e = f;
                            return;
                        case 69:
                            aVar.f3224e.f3276e0 = f;
                            return;
                        case 70:
                            aVar.f3224e.f3278f0 = f;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            aVar.f3224e.f3261U = f;
        }
    }

    /* renamed from: O */
    public static void m4194O(C0533a aVar, int i, int i2) {
        if (i == 6) {
            aVar.f3224e.f3244D = i2;
        } else if (i == 7) {
            aVar.f3224e.f3245E = i2;
        } else if (i == 8) {
            aVar.f3224e.f3251K = i2;
        } else if (i == 27) {
            aVar.f3224e.f3246F = i2;
        } else if (i == 28) {
            aVar.f3224e.f3248H = i2;
        } else if (i == 41) {
            aVar.f3224e.f3263W = i2;
        } else if (i == 42) {
            aVar.f3224e.f3264X = i2;
        } else if (i == 61) {
            aVar.f3224e.f3241A = i2;
        } else if (i == 62) {
            aVar.f3224e.f3242B = i2;
        } else if (i == 72) {
            aVar.f3224e.f3280g0 = i2;
        } else if (i == 73) {
            aVar.f3224e.f3282h0 = i2;
        } else if (i == 88) {
            aVar.f3223d.f3322m = i2;
        } else if (i != 89) {
            switch (i) {
                case 2:
                    aVar.f3224e.f3250J = i2;
                    return;
                case 11:
                    aVar.f3224e.f3257Q = i2;
                    return;
                case 12:
                    aVar.f3224e.f3258R = i2;
                    return;
                case 13:
                    aVar.f3224e.f3254N = i2;
                    return;
                case 14:
                    aVar.f3224e.f3256P = i2;
                    return;
                case 15:
                    aVar.f3224e.f3259S = i2;
                    return;
                case 16:
                    aVar.f3224e.f3255O = i2;
                    return;
                case 17:
                    aVar.f3224e.f3277f = i2;
                    return;
                case 18:
                    aVar.f3224e.f3279g = i2;
                    return;
                case 31:
                    aVar.f3224e.f3252L = i2;
                    return;
                case 34:
                    aVar.f3224e.f3249I = i2;
                    return;
                case 38:
                    aVar.f3220a = i2;
                    return;
                case 64:
                    aVar.f3223d.f3311b = i2;
                    return;
                case 66:
                    aVar.f3223d.f3315f = i2;
                    return;
                case 76:
                    aVar.f3223d.f3314e = i2;
                    return;
                case 78:
                    aVar.f3222c.f3326c = i2;
                    return;
                case 93:
                    aVar.f3224e.f3253M = i2;
                    return;
                case 94:
                    aVar.f3224e.f3260T = i2;
                    return;
                case 97:
                    aVar.f3224e.f3298p0 = i2;
                    return;
                default:
                    switch (i) {
                        case 21:
                            aVar.f3224e.f3275e = i2;
                            return;
                        case 22:
                            aVar.f3222c.f3325b = i2;
                            return;
                        case 23:
                            aVar.f3224e.f3273d = i2;
                            return;
                        case 24:
                            aVar.f3224e.f3247G = i2;
                            return;
                        default:
                            switch (i) {
                                case 54:
                                    aVar.f3224e.f3265Y = i2;
                                    return;
                                case 55:
                                    aVar.f3224e.f3266Z = i2;
                                    return;
                                case 56:
                                    aVar.f3224e.f3268a0 = i2;
                                    return;
                                case 57:
                                    aVar.f3224e.f3270b0 = i2;
                                    return;
                                case 58:
                                    aVar.f3224e.f3272c0 = i2;
                                    return;
                                case 59:
                                    aVar.f3224e.f3274d0 = i2;
                                    return;
                                default:
                                    switch (i) {
                                        case 82:
                                            aVar.f3223d.f3312c = i2;
                                            return;
                                        case 83:
                                            aVar.f3225f.f3338i = i2;
                                            return;
                                        case 84:
                                            aVar.f3223d.f3320k = i2;
                                            return;
                                        default:
                                            return;
                                    }
                            }
                    }
            }
        } else {
            aVar.f3223d.f3323n = i2;
        }
    }

    /* renamed from: P */
    public static void m4195P(C0533a aVar, int i, String str) {
        if (i == 5) {
            aVar.f3224e.f3308z = str;
        } else if (i == 65) {
            aVar.f3223d.f3313d = str;
        } else if (i == 74) {
            C0535b bVar = aVar.f3224e;
            bVar.f3288k0 = str;
            bVar.f3286j0 = null;
        } else if (i == 77) {
            aVar.f3224e.f3290l0 = str;
        } else if (i == 90) {
            aVar.f3223d.f3321l = str;
        }
    }

    /* renamed from: Q */
    public static void m4196Q(C0533a aVar, int i, boolean z) {
        if (i == 44) {
            aVar.f3225f.f3342m = z;
        } else if (i == 75) {
            aVar.f3224e.f3296o0 = z;
        } else if (i == 80) {
            aVar.f3224e.f3292m0 = z;
        } else if (i == 81) {
            aVar.f3224e.f3294n0 = z;
        }
    }

    /* renamed from: m */
    public static C0533a m4203m(Context context, XmlPullParser xmlPullParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        C0533a aVar = new C0533a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, c65.ConstraintOverride);
        m4192K(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: A */
    public int mo5143A(int i) {
        return mo5167v(i).f3222c.f3325b;
    }

    /* renamed from: B */
    public int mo5144B(int i) {
        return mo5167v(i).f3222c.f3326c;
    }

    /* renamed from: C */
    public int mo5145C(int i) {
        return mo5167v(i).f3224e.f3273d;
    }

    /* renamed from: D */
    public void mo5146D(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0533a u = mo5166u(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        u.f3224e.f3267a = true;
                    }
                    this.f3219g.put(Integer.valueOf(u.f3220a), u);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01cb, code lost:
        continue;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5147E(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            int r0 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x01da
            if (r0 == 0) goto L_0x01c8
            r4 = -1
            r5 = 3
            r6 = 2
            r7 = 0
            if (r0 == r6) goto L_0x0067
            if (r0 == r5) goto L_0x0015
            goto L_0x01cb
        L_0x0015:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r0 = r0.toLowerCase(r8)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            switch(r8) {
                case -2075718416: goto L_0x0045;
                case -190376483: goto L_0x003b;
                case 426575017: goto L_0x0031;
                case 2146106725: goto L_0x0027;
                default: goto L_0x0026;
            }     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0026:
            goto L_0x004e
        L_0x0027:
            java.lang.String r8 = "constraintset"
            boolean r0 = r0.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = r7
            goto L_0x004e
        L_0x0031:
            java.lang.String r7 = "constraintoverride"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = r6
            goto L_0x004e
        L_0x003b:
            java.lang.String r7 = "constraint"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = r3
            goto L_0x004e
        L_0x0045:
            java.lang.String r7 = "guideline"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = r5
        L_0x004e:
            if (r4 == 0) goto L_0x0066
            if (r4 == r3) goto L_0x0058
            if (r4 == r6) goto L_0x0058
            if (r4 == r5) goto L_0x0058
            goto L_0x01cb
        L_0x0058:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.a$a> r0 = r9.f3219g     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r3 = r2.f3220a     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2 = r1
            goto L_0x01cb
        L_0x0066:
            return
        L_0x0067:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            switch(r8) {
                case -2025855158: goto L_0x00d0;
                case -1984451626: goto L_0x00c6;
                case -1962203927: goto L_0x00bc;
                case -1269513683: goto L_0x00b2;
                case -1238332596: goto L_0x00a8;
                case -71750448: goto L_0x009e;
                case 366511058: goto L_0x0093;
                case 1331510167: goto L_0x0089;
                case 1791837707: goto L_0x007e;
                case 1803088381: goto L_0x0074;
                default: goto L_0x0072;
            }     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0072:
            goto L_0x00d9
        L_0x0074:
            java.lang.String r5 = "Constraint"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = r7
            goto L_0x00d9
        L_0x007e:
            java.lang.String r5 = "CustomAttribute"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 8
            goto L_0x00d9
        L_0x0089:
            java.lang.String r6 = "Barrier"
            boolean r0 = r0.equals(r6)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = r5
            goto L_0x00d9
        L_0x0093:
            java.lang.String r5 = "CustomMethod"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 9
            goto L_0x00d9
        L_0x009e:
            java.lang.String r5 = "Guideline"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = r6
            goto L_0x00d9
        L_0x00a8:
            java.lang.String r5 = "Transform"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 5
            goto L_0x00d9
        L_0x00b2:
            java.lang.String r5 = "PropertySet"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 4
            goto L_0x00d9
        L_0x00bc:
            java.lang.String r5 = "ConstraintOverride"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = r3
            goto L_0x00d9
        L_0x00c6:
            java.lang.String r5 = "Motion"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 7
            goto L_0x00d9
        L_0x00d0:
            java.lang.String r5 = "Layout"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 6
        L_0x00d9:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r4) {
                case 0: goto L_0x01be;
                case 1: goto L_0x01b5;
                case 2: goto L_0x01a6;
                case 3: goto L_0x0199;
                case 4: goto L_0x0174;
                case 5: goto L_0x014e;
                case 6: goto L_0x0128;
                case 7: goto L_0x0102;
                case 8: goto L_0x00e0;
                case 9: goto L_0x00e0;
                default: goto L_0x00de;
            }
        L_0x00de:
            goto L_0x01cb
        L_0x00e0:
            if (r2 == 0) goto L_0x00e9
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r2.f3226g     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.ConstraintAttribute.m4120i(r10, r11, r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x00e9:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0102:
            if (r2 == 0) goto L_0x010f
            androidx.constraintlayout.widget.a$c r0 = r2.f3223d     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.mo5187b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x010f:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0128:
            if (r2 == 0) goto L_0x0135
            androidx.constraintlayout.widget.a$b r0 = r2.f3224e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.mo5185b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x0135:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x014e:
            if (r2 == 0) goto L_0x015b
            androidx.constraintlayout.widget.a$e r0 = r2.f3225f     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.mo5191b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x015b:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0174:
            if (r2 == 0) goto L_0x0180
            androidx.constraintlayout.widget.a$d r0 = r2.f3222c     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.mo5189b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x0180:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0199:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.a$a r0 = r9.mo5166u(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.a$b r2 = r0.f3224e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f3284i0 = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01a6:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.a$a r0 = r9.mo5166u(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.a$b r2 = r0.f3224e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f3267a = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f3269b = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01b5:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.a$a r0 = r9.mo5166u(r10, r0, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01be:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.a$a r0 = r9.mo5166u(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x01c6:
            r2 = r0
            goto L_0x01cb
        L_0x01c8:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x01cb:
            int r0 = r11.next()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x0006
        L_0x01d1:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x01da
        L_0x01d6:
            r10 = move-exception
            r10.printStackTrace()
        L_0x01da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0532a.mo5147E(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* renamed from: J */
    public final void mo5148J(Context context, C0533a aVar, TypedArray typedArray, boolean z) {
        if (z) {
            m4192K(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (!(index == c65.Constraint_android_id || c65.Constraint_android_layout_marginStart == index || c65.Constraint_android_layout_marginEnd == index)) {
                aVar.f3223d.f3310a = true;
                aVar.f3224e.f3269b = true;
                aVar.f3222c.f3324a = true;
                aVar.f3225f.f3330a = true;
            }
            switch (f3211i.get(index)) {
                case 1:
                    C0535b bVar = aVar.f3224e;
                    bVar.f3299q = m4188F(typedArray, index, bVar.f3299q);
                    break;
                case 2:
                    C0535b bVar2 = aVar.f3224e;
                    bVar2.f3250J = typedArray.getDimensionPixelSize(index, bVar2.f3250J);
                    break;
                case 3:
                    C0535b bVar3 = aVar.f3224e;
                    bVar3.f3297p = m4188F(typedArray, index, bVar3.f3297p);
                    break;
                case 4:
                    C0535b bVar4 = aVar.f3224e;
                    bVar4.f3295o = m4188F(typedArray, index, bVar4.f3295o);
                    break;
                case 5:
                    aVar.f3224e.f3308z = typedArray.getString(index);
                    break;
                case 6:
                    C0535b bVar5 = aVar.f3224e;
                    bVar5.f3244D = typedArray.getDimensionPixelOffset(index, bVar5.f3244D);
                    break;
                case 7:
                    C0535b bVar6 = aVar.f3224e;
                    bVar6.f3245E = typedArray.getDimensionPixelOffset(index, bVar6.f3245E);
                    break;
                case 8:
                    C0535b bVar7 = aVar.f3224e;
                    bVar7.f3251K = typedArray.getDimensionPixelSize(index, bVar7.f3251K);
                    break;
                case 9:
                    C0535b bVar8 = aVar.f3224e;
                    bVar8.f3305w = m4188F(typedArray, index, bVar8.f3305w);
                    break;
                case 10:
                    C0535b bVar9 = aVar.f3224e;
                    bVar9.f3304v = m4188F(typedArray, index, bVar9.f3304v);
                    break;
                case 11:
                    C0535b bVar10 = aVar.f3224e;
                    bVar10.f3257Q = typedArray.getDimensionPixelSize(index, bVar10.f3257Q);
                    break;
                case 12:
                    C0535b bVar11 = aVar.f3224e;
                    bVar11.f3258R = typedArray.getDimensionPixelSize(index, bVar11.f3258R);
                    break;
                case 13:
                    C0535b bVar12 = aVar.f3224e;
                    bVar12.f3254N = typedArray.getDimensionPixelSize(index, bVar12.f3254N);
                    break;
                case 14:
                    C0535b bVar13 = aVar.f3224e;
                    bVar13.f3256P = typedArray.getDimensionPixelSize(index, bVar13.f3256P);
                    break;
                case 15:
                    C0535b bVar14 = aVar.f3224e;
                    bVar14.f3259S = typedArray.getDimensionPixelSize(index, bVar14.f3259S);
                    break;
                case 16:
                    C0535b bVar15 = aVar.f3224e;
                    bVar15.f3255O = typedArray.getDimensionPixelSize(index, bVar15.f3255O);
                    break;
                case 17:
                    C0535b bVar16 = aVar.f3224e;
                    bVar16.f3277f = typedArray.getDimensionPixelOffset(index, bVar16.f3277f);
                    break;
                case 18:
                    C0535b bVar17 = aVar.f3224e;
                    bVar17.f3279g = typedArray.getDimensionPixelOffset(index, bVar17.f3279g);
                    break;
                case 19:
                    C0535b bVar18 = aVar.f3224e;
                    bVar18.f3281h = typedArray.getFloat(index, bVar18.f3281h);
                    break;
                case 20:
                    C0535b bVar19 = aVar.f3224e;
                    bVar19.f3306x = typedArray.getFloat(index, bVar19.f3306x);
                    break;
                case 21:
                    C0535b bVar20 = aVar.f3224e;
                    bVar20.f3275e = typedArray.getLayoutDimension(index, bVar20.f3275e);
                    break;
                case 22:
                    C0537d dVar = aVar.f3222c;
                    dVar.f3325b = typedArray.getInt(index, dVar.f3325b);
                    C0537d dVar2 = aVar.f3222c;
                    dVar2.f3325b = f3210h[dVar2.f3325b];
                    break;
                case 23:
                    C0535b bVar21 = aVar.f3224e;
                    bVar21.f3273d = typedArray.getLayoutDimension(index, bVar21.f3273d);
                    break;
                case 24:
                    C0535b bVar22 = aVar.f3224e;
                    bVar22.f3247G = typedArray.getDimensionPixelSize(index, bVar22.f3247G);
                    break;
                case 25:
                    C0535b bVar23 = aVar.f3224e;
                    bVar23.f3283i = m4188F(typedArray, index, bVar23.f3283i);
                    break;
                case 26:
                    C0535b bVar24 = aVar.f3224e;
                    bVar24.f3285j = m4188F(typedArray, index, bVar24.f3285j);
                    break;
                case 27:
                    C0535b bVar25 = aVar.f3224e;
                    bVar25.f3246F = typedArray.getInt(index, bVar25.f3246F);
                    break;
                case 28:
                    C0535b bVar26 = aVar.f3224e;
                    bVar26.f3248H = typedArray.getDimensionPixelSize(index, bVar26.f3248H);
                    break;
                case 29:
                    C0535b bVar27 = aVar.f3224e;
                    bVar27.f3287k = m4188F(typedArray, index, bVar27.f3287k);
                    break;
                case 30:
                    C0535b bVar28 = aVar.f3224e;
                    bVar28.f3289l = m4188F(typedArray, index, bVar28.f3289l);
                    break;
                case 31:
                    C0535b bVar29 = aVar.f3224e;
                    bVar29.f3252L = typedArray.getDimensionPixelSize(index, bVar29.f3252L);
                    break;
                case 32:
                    C0535b bVar30 = aVar.f3224e;
                    bVar30.f3302t = m4188F(typedArray, index, bVar30.f3302t);
                    break;
                case 33:
                    C0535b bVar31 = aVar.f3224e;
                    bVar31.f3303u = m4188F(typedArray, index, bVar31.f3303u);
                    break;
                case 34:
                    C0535b bVar32 = aVar.f3224e;
                    bVar32.f3249I = typedArray.getDimensionPixelSize(index, bVar32.f3249I);
                    break;
                case 35:
                    C0535b bVar33 = aVar.f3224e;
                    bVar33.f3293n = m4188F(typedArray, index, bVar33.f3293n);
                    break;
                case 36:
                    C0535b bVar34 = aVar.f3224e;
                    bVar34.f3291m = m4188F(typedArray, index, bVar34.f3291m);
                    break;
                case 37:
                    C0535b bVar35 = aVar.f3224e;
                    bVar35.f3307y = typedArray.getFloat(index, bVar35.f3307y);
                    break;
                case 38:
                    aVar.f3220a = typedArray.getResourceId(index, aVar.f3220a);
                    break;
                case 39:
                    C0535b bVar36 = aVar.f3224e;
                    bVar36.f3262V = typedArray.getFloat(index, bVar36.f3262V);
                    break;
                case 40:
                    C0535b bVar37 = aVar.f3224e;
                    bVar37.f3261U = typedArray.getFloat(index, bVar37.f3261U);
                    break;
                case 41:
                    C0535b bVar38 = aVar.f3224e;
                    bVar38.f3263W = typedArray.getInt(index, bVar38.f3263W);
                    break;
                case 42:
                    C0535b bVar39 = aVar.f3224e;
                    bVar39.f3264X = typedArray.getInt(index, bVar39.f3264X);
                    break;
                case 43:
                    C0537d dVar3 = aVar.f3222c;
                    dVar3.f3327d = typedArray.getFloat(index, dVar3.f3327d);
                    break;
                case 44:
                    C0538e eVar = aVar.f3225f;
                    eVar.f3342m = true;
                    eVar.f3343n = typedArray.getDimension(index, eVar.f3343n);
                    break;
                case 45:
                    C0538e eVar2 = aVar.f3225f;
                    eVar2.f3332c = typedArray.getFloat(index, eVar2.f3332c);
                    break;
                case 46:
                    C0538e eVar3 = aVar.f3225f;
                    eVar3.f3333d = typedArray.getFloat(index, eVar3.f3333d);
                    break;
                case 47:
                    C0538e eVar4 = aVar.f3225f;
                    eVar4.f3334e = typedArray.getFloat(index, eVar4.f3334e);
                    break;
                case 48:
                    C0538e eVar5 = aVar.f3225f;
                    eVar5.f3335f = typedArray.getFloat(index, eVar5.f3335f);
                    break;
                case 49:
                    C0538e eVar6 = aVar.f3225f;
                    eVar6.f3336g = typedArray.getDimension(index, eVar6.f3336g);
                    break;
                case 50:
                    C0538e eVar7 = aVar.f3225f;
                    eVar7.f3337h = typedArray.getDimension(index, eVar7.f3337h);
                    break;
                case 51:
                    C0538e eVar8 = aVar.f3225f;
                    eVar8.f3339j = typedArray.getDimension(index, eVar8.f3339j);
                    break;
                case 52:
                    C0538e eVar9 = aVar.f3225f;
                    eVar9.f3340k = typedArray.getDimension(index, eVar9.f3340k);
                    break;
                case 53:
                    C0538e eVar10 = aVar.f3225f;
                    eVar10.f3341l = typedArray.getDimension(index, eVar10.f3341l);
                    break;
                case 54:
                    C0535b bVar40 = aVar.f3224e;
                    bVar40.f3265Y = typedArray.getInt(index, bVar40.f3265Y);
                    break;
                case 55:
                    C0535b bVar41 = aVar.f3224e;
                    bVar41.f3266Z = typedArray.getInt(index, bVar41.f3266Z);
                    break;
                case 56:
                    C0535b bVar42 = aVar.f3224e;
                    bVar42.f3268a0 = typedArray.getDimensionPixelSize(index, bVar42.f3268a0);
                    break;
                case 57:
                    C0535b bVar43 = aVar.f3224e;
                    bVar43.f3270b0 = typedArray.getDimensionPixelSize(index, bVar43.f3270b0);
                    break;
                case 58:
                    C0535b bVar44 = aVar.f3224e;
                    bVar44.f3272c0 = typedArray.getDimensionPixelSize(index, bVar44.f3272c0);
                    break;
                case 59:
                    C0535b bVar45 = aVar.f3224e;
                    bVar45.f3274d0 = typedArray.getDimensionPixelSize(index, bVar45.f3274d0);
                    break;
                case 60:
                    C0538e eVar11 = aVar.f3225f;
                    eVar11.f3331b = typedArray.getFloat(index, eVar11.f3331b);
                    break;
                case 61:
                    C0535b bVar46 = aVar.f3224e;
                    bVar46.f3241A = m4188F(typedArray, index, bVar46.f3241A);
                    break;
                case 62:
                    C0535b bVar47 = aVar.f3224e;
                    bVar47.f3242B = typedArray.getDimensionPixelSize(index, bVar47.f3242B);
                    break;
                case 63:
                    C0535b bVar48 = aVar.f3224e;
                    bVar48.f3243C = typedArray.getFloat(index, bVar48.f3243C);
                    break;
                case 64:
                    C0536c cVar = aVar.f3223d;
                    cVar.f3311b = m4188F(typedArray, index, cVar.f3311b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        aVar.f3223d.f3313d = ym1.f20291c[typedArray.getInteger(index, 0)];
                        break;
                    } else {
                        aVar.f3223d.f3313d = typedArray.getString(index);
                        break;
                    }
                case 66:
                    aVar.f3223d.f3315f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C0536c cVar2 = aVar.f3223d;
                    cVar2.f3318i = typedArray.getFloat(index, cVar2.f3318i);
                    break;
                case 68:
                    C0537d dVar4 = aVar.f3222c;
                    dVar4.f3328e = typedArray.getFloat(index, dVar4.f3328e);
                    break;
                case 69:
                    aVar.f3224e.f3276e0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f3224e.f3278f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    break;
                case 72:
                    C0535b bVar49 = aVar.f3224e;
                    bVar49.f3280g0 = typedArray.getInt(index, bVar49.f3280g0);
                    break;
                case 73:
                    C0535b bVar50 = aVar.f3224e;
                    bVar50.f3282h0 = typedArray.getDimensionPixelSize(index, bVar50.f3282h0);
                    break;
                case 74:
                    aVar.f3224e.f3288k0 = typedArray.getString(index);
                    break;
                case 75:
                    C0535b bVar51 = aVar.f3224e;
                    bVar51.f3296o0 = typedArray.getBoolean(index, bVar51.f3296o0);
                    break;
                case 76:
                    C0536c cVar3 = aVar.f3223d;
                    cVar3.f3314e = typedArray.getInt(index, cVar3.f3314e);
                    break;
                case 77:
                    aVar.f3224e.f3290l0 = typedArray.getString(index);
                    break;
                case 78:
                    C0537d dVar5 = aVar.f3222c;
                    dVar5.f3326c = typedArray.getInt(index, dVar5.f3326c);
                    break;
                case 79:
                    C0536c cVar4 = aVar.f3223d;
                    cVar4.f3316g = typedArray.getFloat(index, cVar4.f3316g);
                    break;
                case 80:
                    C0535b bVar52 = aVar.f3224e;
                    bVar52.f3292m0 = typedArray.getBoolean(index, bVar52.f3292m0);
                    break;
                case 81:
                    C0535b bVar53 = aVar.f3224e;
                    bVar53.f3294n0 = typedArray.getBoolean(index, bVar53.f3294n0);
                    break;
                case 82:
                    C0536c cVar5 = aVar.f3223d;
                    cVar5.f3312c = typedArray.getInteger(index, cVar5.f3312c);
                    break;
                case 83:
                    C0538e eVar12 = aVar.f3225f;
                    eVar12.f3338i = m4188F(typedArray, index, eVar12.f3338i);
                    break;
                case 84:
                    C0536c cVar6 = aVar.f3223d;
                    cVar6.f3320k = typedArray.getInteger(index, cVar6.f3320k);
                    break;
                case 85:
                    C0536c cVar7 = aVar.f3223d;
                    cVar7.f3319j = typedArray.getFloat(index, cVar7.f3319j);
                    break;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 != 1) {
                        if (i2 != 3) {
                            C0536c cVar8 = aVar.f3223d;
                            cVar8.f3322m = typedArray.getInteger(index, cVar8.f3323n);
                            break;
                        } else {
                            aVar.f3223d.f3321l = typedArray.getString(index);
                            if (aVar.f3223d.f3321l.indexOf("/") <= 0) {
                                aVar.f3223d.f3322m = -1;
                                break;
                            } else {
                                aVar.f3223d.f3323n = typedArray.getResourceId(index, -1);
                                aVar.f3223d.f3322m = -2;
                                break;
                            }
                        }
                    } else {
                        aVar.f3223d.f3323n = typedArray.getResourceId(index, -1);
                        C0536c cVar9 = aVar.f3223d;
                        if (cVar9.f3323n == -1) {
                            break;
                        } else {
                            cVar9.f3322m = -2;
                            break;
                        }
                    }
                case 87:
                    StringBuilder sb = new StringBuilder();
                    sb.append("unused attribute 0x");
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(f3211i.get(index));
                    break;
                case 91:
                    C0535b bVar54 = aVar.f3224e;
                    bVar54.f3300r = m4188F(typedArray, index, bVar54.f3300r);
                    break;
                case 92:
                    C0535b bVar55 = aVar.f3224e;
                    bVar55.f3301s = m4188F(typedArray, index, bVar55.f3301s);
                    break;
                case 93:
                    C0535b bVar56 = aVar.f3224e;
                    bVar56.f3253M = typedArray.getDimensionPixelSize(index, bVar56.f3253M);
                    break;
                case 94:
                    C0535b bVar57 = aVar.f3224e;
                    bVar57.f3260T = typedArray.getDimensionPixelSize(index, bVar57.f3260T);
                    break;
                case 95:
                    m4189G(aVar.f3224e, typedArray, index, 0);
                    break;
                case 96:
                    m4189G(aVar.f3224e, typedArray, index, 1);
                    break;
                case 97:
                    C0535b bVar58 = aVar.f3224e;
                    bVar58.f3298p0 = typedArray.getInt(index, bVar58.f3298p0);
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown attribute 0x");
                    sb2.append(Integer.toHexString(index));
                    sb2.append("   ");
                    sb2.append(f3211i.get(index));
                    break;
            }
        }
        C0535b bVar59 = aVar.f3224e;
        if (bVar59.f3288k0 != null) {
            bVar59.f3286j0 = null;
        }
    }

    /* renamed from: L */
    public void mo5149L(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f3218f || id != -1) {
                if (!this.f3219g.containsKey(Integer.valueOf(id))) {
                    this.f3219g.put(Integer.valueOf(id), new C0533a());
                }
                C0533a aVar = this.f3219g.get(Integer.valueOf(id));
                if (aVar != null) {
                    if (!aVar.f3224e.f3269b) {
                        aVar.mo5176g(id, layoutParams);
                        if (childAt instanceof ConstraintHelper) {
                            aVar.f3224e.f3286j0 = ((ConstraintHelper) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                aVar.f3224e.f3296o0 = barrier.getAllowsGoneWidget();
                                aVar.f3224e.f3280g0 = barrier.getType();
                                aVar.f3224e.f3282h0 = barrier.getMargin();
                            }
                        }
                        aVar.f3224e.f3269b = true;
                    }
                    C0537d dVar = aVar.f3222c;
                    if (!dVar.f3324a) {
                        dVar.f3325b = childAt.getVisibility();
                        aVar.f3222c.f3327d = childAt.getAlpha();
                        aVar.f3222c.f3324a = true;
                    }
                    C0538e eVar = aVar.f3225f;
                    if (!eVar.f3330a) {
                        eVar.f3330a = true;
                        eVar.f3331b = childAt.getRotation();
                        aVar.f3225f.f3332c = childAt.getRotationX();
                        aVar.f3225f.f3333d = childAt.getRotationY();
                        aVar.f3225f.f3334e = childAt.getScaleX();
                        aVar.f3225f.f3335f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (!(((double) pivotX) == Utils.DOUBLE_EPSILON && ((double) pivotY) == Utils.DOUBLE_EPSILON)) {
                            C0538e eVar2 = aVar.f3225f;
                            eVar2.f3336g = pivotX;
                            eVar2.f3337h = pivotY;
                        }
                        aVar.f3225f.f3339j = childAt.getTranslationX();
                        aVar.f3225f.f3340k = childAt.getTranslationY();
                        aVar.f3225f.f3341l = childAt.getTranslationZ();
                        C0538e eVar3 = aVar.f3225f;
                        if (eVar3.f3342m) {
                            eVar3.f3343n = childAt.getElevation();
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: M */
    public void mo5150M(C0532a aVar) {
        for (Integer next : aVar.f3219g.keySet()) {
            int intValue = next.intValue();
            C0533a aVar2 = aVar.f3219g.get(next);
            if (!this.f3219g.containsKey(Integer.valueOf(intValue))) {
                this.f3219g.put(Integer.valueOf(intValue), new C0533a());
            }
            C0533a aVar3 = this.f3219g.get(Integer.valueOf(intValue));
            if (aVar3 != null) {
                C0535b bVar = aVar3.f3224e;
                if (!bVar.f3269b) {
                    bVar.mo5184a(aVar2.f3224e);
                }
                C0537d dVar = aVar3.f3222c;
                if (!dVar.f3324a) {
                    dVar.mo5188a(aVar2.f3222c);
                }
                C0538e eVar = aVar3.f3225f;
                if (!eVar.f3330a) {
                    eVar.mo5190a(aVar2.f3225f);
                }
                C0536c cVar = aVar3.f3223d;
                if (!cVar.f3310a) {
                    cVar.mo5186a(aVar2.f3223d);
                }
                for (String next2 : aVar2.f3226g.keySet()) {
                    if (!aVar3.f3226g.containsKey(next2)) {
                        aVar3.f3226g.put(next2, aVar2.f3226g.get(next2));
                    }
                }
            }
        }
    }

    /* renamed from: R */
    public void mo5151R(boolean z) {
        this.f3218f = z;
    }

    /* renamed from: S */
    public void mo5152S(boolean z) {
        this.f3213a = z;
    }

    /* renamed from: g */
    public void mo5153g(ConstraintLayout constraintLayout) {
        C0533a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f3219g.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder();
                sb.append("id unknown ");
                sb.append(t21.m27246d(childAt));
            } else if (this.f3218f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (this.f3219g.containsKey(Integer.valueOf(id)) && (aVar = this.f3219g.get(Integer.valueOf(id))) != null) {
                ConstraintAttribute.m4121j(childAt, aVar.f3226g);
            }
        }
    }

    /* renamed from: h */
    public void mo5154h(C0532a aVar) {
        for (C0533a next : aVar.f3219g.values()) {
            if (next.f3227h != null) {
                if (next.f3221b != null) {
                    for (Integer intValue : this.f3219g.keySet()) {
                        C0533a w = mo5168w(intValue.intValue());
                        String str = w.f3224e.f3290l0;
                        if (str != null && next.f3221b.matches(str)) {
                            next.f3227h.mo5183e(w);
                            w.f3226g.putAll((HashMap) next.f3226g.clone());
                        }
                    }
                } else {
                    next.f3227h.mo5183e(mo5168w(next.f3220a));
                }
            }
        }
    }

    /* renamed from: i */
    public void mo5155i(ConstraintLayout constraintLayout) {
        mo5157k(constraintLayout, true);
        constraintLayout.setConstraintSet((C0532a) null);
        constraintLayout.requestLayout();
    }

    /* renamed from: j */
    public void mo5156j(ConstraintHelper constraintHelper, ConstraintWidget constraintWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        C0533a aVar;
        int id = constraintHelper.getId();
        if (this.f3219g.containsKey(Integer.valueOf(id)) && (aVar = this.f3219g.get(Integer.valueOf(id))) != null && (constraintWidget instanceof wl2)) {
            constraintHelper.mo4599p(aVar, (wl2) constraintWidget, layoutParams, sparseArray);
        }
    }

    /* renamed from: k */
    public void mo5157k(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f3219g.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f3219g.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder();
                sb.append("id unknown ");
                sb.append(t21.m27246d(childAt));
            } else if (this.f3218f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.f3219g.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0533a aVar = this.f3219g.get(Integer.valueOf(id));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            aVar.f3224e.f3284i0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.f3224e.f3280g0);
                            barrier.setMargin(aVar.f3224e.f3282h0);
                            barrier.setAllowsGoneWidget(aVar.f3224e.f3296o0);
                            C0535b bVar = aVar.f3224e;
                            int[] iArr = bVar.f3286j0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f3288k0;
                                if (str != null) {
                                    bVar.f3286j0 = mo5165t(barrier, str);
                                    barrier.setReferencedIds(aVar.f3224e.f3286j0);
                                }
                            }
                        }
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                        layoutParams.mo5101c();
                        aVar.mo5174e(layoutParams);
                        if (z) {
                            ConstraintAttribute.m4121j(childAt, aVar.f3226g);
                        }
                        childAt.setLayoutParams(layoutParams);
                        C0537d dVar = aVar.f3222c;
                        if (dVar.f3326c == 0) {
                            childAt.setVisibility(dVar.f3325b);
                        }
                        childAt.setAlpha(aVar.f3222c.f3327d);
                        childAt.setRotation(aVar.f3225f.f3331b);
                        childAt.setRotationX(aVar.f3225f.f3332c);
                        childAt.setRotationY(aVar.f3225f.f3333d);
                        childAt.setScaleX(aVar.f3225f.f3334e);
                        childAt.setScaleY(aVar.f3225f.f3335f);
                        C0538e eVar = aVar.f3225f;
                        if (eVar.f3338i != -1) {
                            View findViewById = ((View) childAt.getParent()).findViewById(aVar.f3225f.f3338i);
                            if (findViewById != null) {
                                float top = ((float) (findViewById.getTop() + findViewById.getBottom())) / 2.0f;
                                float left = ((float) (findViewById.getLeft() + findViewById.getRight())) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(left - ((float) childAt.getLeft()));
                                    childAt.setPivotY(top - ((float) childAt.getTop()));
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.f3336g)) {
                                childAt.setPivotX(aVar.f3225f.f3336g);
                            }
                            if (!Float.isNaN(aVar.f3225f.f3337h)) {
                                childAt.setPivotY(aVar.f3225f.f3337h);
                            }
                        }
                        childAt.setTranslationX(aVar.f3225f.f3339j);
                        childAt.setTranslationY(aVar.f3225f.f3340k);
                        childAt.setTranslationZ(aVar.f3225f.f3341l);
                        C0538e eVar2 = aVar.f3225f;
                        if (eVar2.f3342m) {
                            childAt.setElevation(eVar2.f3343n);
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("WARNING NO CONSTRAINTS for view ");
                    sb2.append(id);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0533a aVar2 = this.f3219g.get(num);
            if (aVar2 != null) {
                if (aVar2.f3224e.f3284i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    C0535b bVar2 = aVar2.f3224e;
                    int[] iArr2 = bVar2.f3286j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.f3288k0;
                        if (str2 != null) {
                            bVar2.f3286j0 = mo5165t(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f3224e.f3286j0);
                        }
                    }
                    barrier2.setType(aVar2.f3224e.f3280g0);
                    barrier2.setMargin(aVar2.f3224e.f3282h0);
                    ConstraintLayout.LayoutParams e = constraintLayout.generateDefaultLayoutParams();
                    barrier2.mo5062w();
                    aVar2.mo5174e(e);
                    constraintLayout.addView(barrier2, e);
                }
                if (aVar2.f3224e.f3267a) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams e2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.mo5174e(e2);
                    constraintLayout.addView(guideline, e2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).mo4626j(constraintLayout);
            }
        }
    }

    /* renamed from: l */
    public void mo5158l(int i, ConstraintLayout.LayoutParams layoutParams) {
        C0533a aVar;
        if (this.f3219g.containsKey(Integer.valueOf(i)) && (aVar = this.f3219g.get(Integer.valueOf(i))) != null) {
            aVar.mo5174e(layoutParams);
        }
    }

    /* renamed from: n */
    public void mo5159n(int i, int i2) {
        C0533a aVar;
        if (this.f3219g.containsKey(Integer.valueOf(i)) && (aVar = this.f3219g.get(Integer.valueOf(i))) != null) {
            switch (i2) {
                case 1:
                    C0535b bVar = aVar.f3224e;
                    bVar.f3285j = -1;
                    bVar.f3283i = -1;
                    bVar.f3247G = -1;
                    bVar.f3254N = Integer.MIN_VALUE;
                    return;
                case 2:
                    C0535b bVar2 = aVar.f3224e;
                    bVar2.f3289l = -1;
                    bVar2.f3287k = -1;
                    bVar2.f3248H = -1;
                    bVar2.f3256P = Integer.MIN_VALUE;
                    return;
                case 3:
                    C0535b bVar3 = aVar.f3224e;
                    bVar3.f3293n = -1;
                    bVar3.f3291m = -1;
                    bVar3.f3249I = 0;
                    bVar3.f3255O = Integer.MIN_VALUE;
                    return;
                case 4:
                    C0535b bVar4 = aVar.f3224e;
                    bVar4.f3295o = -1;
                    bVar4.f3297p = -1;
                    bVar4.f3250J = 0;
                    bVar4.f3257Q = Integer.MIN_VALUE;
                    return;
                case 5:
                    C0535b bVar5 = aVar.f3224e;
                    bVar5.f3299q = -1;
                    bVar5.f3300r = -1;
                    bVar5.f3301s = -1;
                    bVar5.f3253M = 0;
                    bVar5.f3260T = Integer.MIN_VALUE;
                    return;
                case 6:
                    C0535b bVar6 = aVar.f3224e;
                    bVar6.f3302t = -1;
                    bVar6.f3303u = -1;
                    bVar6.f3252L = 0;
                    bVar6.f3259S = Integer.MIN_VALUE;
                    return;
                case 7:
                    C0535b bVar7 = aVar.f3224e;
                    bVar7.f3304v = -1;
                    bVar7.f3305w = -1;
                    bVar7.f3251K = 0;
                    bVar7.f3258R = Integer.MIN_VALUE;
                    return;
                case 8:
                    C0535b bVar8 = aVar.f3224e;
                    bVar8.f3243C = -1.0f;
                    bVar8.f3242B = -1;
                    bVar8.f3241A = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    /* renamed from: o */
    public void mo5160o(Context context, int i) {
        mo5161p((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    /* renamed from: p */
    public void mo5161p(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f3219g.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f3218f || id != -1) {
                if (!this.f3219g.containsKey(Integer.valueOf(id))) {
                    this.f3219g.put(Integer.valueOf(id), new C0533a());
                }
                C0533a aVar = this.f3219g.get(Integer.valueOf(id));
                if (aVar != null) {
                    aVar.f3226g = ConstraintAttribute.m4119c(this.f3217e, childAt);
                    aVar.mo5176g(id, layoutParams);
                    aVar.f3222c.f3325b = childAt.getVisibility();
                    aVar.f3222c.f3327d = childAt.getAlpha();
                    aVar.f3225f.f3331b = childAt.getRotation();
                    aVar.f3225f.f3332c = childAt.getRotationX();
                    aVar.f3225f.f3333d = childAt.getRotationY();
                    aVar.f3225f.f3334e = childAt.getScaleX();
                    aVar.f3225f.f3335f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == Utils.DOUBLE_EPSILON && ((double) pivotY) == Utils.DOUBLE_EPSILON)) {
                        C0538e eVar = aVar.f3225f;
                        eVar.f3336g = pivotX;
                        eVar.f3337h = pivotY;
                    }
                    aVar.f3225f.f3339j = childAt.getTranslationX();
                    aVar.f3225f.f3340k = childAt.getTranslationY();
                    aVar.f3225f.f3341l = childAt.getTranslationZ();
                    C0538e eVar2 = aVar.f3225f;
                    if (eVar2.f3342m) {
                        eVar2.f3343n = childAt.getElevation();
                    }
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        aVar.f3224e.f3296o0 = barrier.getAllowsGoneWidget();
                        aVar.f3224e.f3286j0 = barrier.getReferencedIds();
                        aVar.f3224e.f3280g0 = barrier.getType();
                        aVar.f3224e.f3282h0 = barrier.getMargin();
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: q */
    public void mo5162q(C0532a aVar) {
        this.f3219g.clear();
        for (Integer next : aVar.f3219g.keySet()) {
            C0533a aVar2 = aVar.f3219g.get(next);
            if (aVar2 != null) {
                this.f3219g.put(next, aVar2.clone());
            }
        }
    }

    /* renamed from: r */
    public void mo5163r(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f3219g.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraints.getChildAt(i);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f3218f || id != -1) {
                if (!this.f3219g.containsKey(Integer.valueOf(id))) {
                    this.f3219g.put(Integer.valueOf(id), new C0533a());
                }
                C0533a aVar = this.f3219g.get(Integer.valueOf(id));
                if (aVar != null) {
                    if (childAt instanceof ConstraintHelper) {
                        aVar.mo5178i((ConstraintHelper) childAt, id, layoutParams);
                    }
                    aVar.mo5177h(id, layoutParams);
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: s */
    public void mo5164s(int i, int i2, int i3, float f) {
        C0535b bVar = mo5167v(i).f3224e;
        bVar.f3241A = i2;
        bVar.f3242B = i3;
        bVar.f3243C = f;
    }

    /* renamed from: t */
    public final int[] mo5165t(View view, String str) {
        int i;
        Object g;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = p35.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (g = ((ConstraintLayout) view.getParent()).mo5068g(0, trim)) != null && (g instanceof Integer)) {
                i = ((Integer) g).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != split.length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    /* renamed from: u */
    public final C0533a mo5166u(Context context, AttributeSet attributeSet, boolean z) {
        int[] iArr;
        C0533a aVar = new C0533a();
        if (z) {
            iArr = c65.ConstraintOverride;
        } else {
            iArr = c65.Constraint;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        mo5148J(context, aVar, obtainStyledAttributes, z);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: v */
    public final C0533a mo5167v(int i) {
        if (!this.f3219g.containsKey(Integer.valueOf(i))) {
            this.f3219g.put(Integer.valueOf(i), new C0533a());
        }
        return this.f3219g.get(Integer.valueOf(i));
    }

    /* renamed from: w */
    public C0533a mo5168w(int i) {
        if (this.f3219g.containsKey(Integer.valueOf(i))) {
            return this.f3219g.get(Integer.valueOf(i));
        }
        return null;
    }

    /* renamed from: x */
    public int mo5169x(int i) {
        return mo5167v(i).f3224e.f3275e;
    }

    /* renamed from: y */
    public int[] mo5170y() {
        Integer[] numArr = (Integer[]) this.f3219g.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    /* renamed from: z */
    public C0533a mo5171z(int i) {
        return mo5167v(i);
    }
}
