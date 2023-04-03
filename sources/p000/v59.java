package p000;

import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.internal.vision.C4092a0;
import com.google.android.gms.internal.vision.C4105e0;
import com.google.android.gms.internal.vision.C4144z;
import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzjk;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: v59 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class v59<T> implements g79<T> {

    /* renamed from: r */
    public static final int[] f34833r = new int[0];

    /* renamed from: s */
    public static final Unsafe f34834s = l99.m47702t();

    /* renamed from: a */
    public final int[] f34835a;

    /* renamed from: b */
    public final Object[] f34836b;

    /* renamed from: c */
    public final int f34837c;

    /* renamed from: d */
    public final int f34838d;

    /* renamed from: e */
    public final k59 f34839e;

    /* renamed from: f */
    public final boolean f34840f;

    /* renamed from: g */
    public final boolean f34841g;

    /* renamed from: h */
    public final boolean f34842h;

    /* renamed from: i */
    public final boolean f34843i;

    /* renamed from: j */
    public final int[] f34844j;

    /* renamed from: k */
    public final int f34845k;

    /* renamed from: l */
    public final int f34846l;

    /* renamed from: m */
    public final z59 f34847m;

    /* renamed from: n */
    public final g39 f34848n;

    /* renamed from: o */
    public final o89<?, ?> f34849o;

    /* renamed from: p */
    public final wz8<?> f34850p;

    /* renamed from: q */
    public final b59 f34851q;

    public v59(int[] iArr, Object[] objArr, int i, int i2, k59 k59, boolean z, boolean z2, int[] iArr2, int i3, int i4, z59 z59, g39 g39, o89<?, ?> o89, wz8<?> wz8, b59 b59) {
        boolean z3;
        this.f34835a = iArr;
        this.f34836b = objArr;
        this.f34837c = i;
        this.f34838d = i2;
        this.f34841g = k59 instanceof C4105e0;
        this.f34842h = z;
        if (wz8 == null || !wz8.mo31166e(k59)) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f34840f = z3;
        this.f34843i = false;
        this.f34844j = iArr2;
        this.f34845k = i3;
        this.f34846l = i4;
        this.f34847m = z59;
        this.f34848n = g39;
        this.f34849o = o89;
        this.f34850p = wz8;
        this.f34839e = k59;
        this.f34851q = b59;
    }

    /* renamed from: B */
    public static boolean m53235B(Object obj, int i, g79 g79) {
        return g79.mo31209e(l99.m47673F(obj, (long) (i & 1048575)));
    }

    /* renamed from: C */
    public static <T> double m53236C(T t, long j) {
        return ((Double) l99.m47673F(t, j)).doubleValue();
    }

    /* renamed from: J */
    public static <T> float m53237J(T t, long j) {
        return ((Float) l99.m47673F(t, j)).floatValue();
    }

    /* renamed from: N */
    public static <T> int m53238N(T t, long j) {
        return ((Integer) l99.m47673F(t, j)).intValue();
    }

    /* renamed from: P */
    public static <T> long m53239P(T t, long j) {
        return ((Long) l99.m47673F(t, j)).longValue();
    }

    /* renamed from: Q */
    public static t89 m53240Q(Object obj) {
        C4105e0 e0Var = (C4105e0) obj;
        t89 t89 = e0Var.zzb;
        if (t89 != t89.m52128a()) {
            return t89;
        }
        t89 g = t89.m52131g();
        e0Var.zzb = g;
        return g;
    }

    /* renamed from: R */
    public static <T> boolean m53241R(T t, long j) {
        return ((Boolean) l99.m47673F(t, j)).booleanValue();
    }

    /* renamed from: n */
    public static <UT, UB> int m53242n(o89<UT, UB> o89, T t) {
        return o89.mo46355l(o89.mo46349f(t));
    }

    /* renamed from: q */
    public static Field m53243q(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: r */
    public static List<?> m53244r(Object obj, long j) {
        return (List) l99.m47673F(obj, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:159:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0388  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> p000.v59<T> m53245s(java.lang.Class<T> r33, p000.e59 r34, p000.z59 r35, p000.g39 r36, p000.o89<?, ?> r37, p000.wz8<?> r38, p000.b59 r39) {
        /*
            r0 = r34
            boolean r1 = r0 instanceof p000.c79
            if (r1 == 0) goto L_0x0408
            c79 r0 = (p000.c79) r0
            int r1 = r0.zza()
            int r2 = p000.p69.f32587b
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0014
            r11 = r4
            goto L_0x0015
        L_0x0014:
            r11 = r3
        L_0x0015:
            java.lang.String r1 = r0.mo29882a()
            int r2 = r1.length()
            char r5 = r1.charAt(r3)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x0031
            r5 = r4
        L_0x0027:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0032
            r5 = r7
            goto L_0x0027
        L_0x0031:
            r7 = r4
        L_0x0032:
            int r5 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0051
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x003e:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x004e
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r7 = r7 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x003e
        L_0x004e:
            int r5 = r5 << r9
            r7 = r7 | r5
            r5 = r10
        L_0x0051:
            if (r7 != 0) goto L_0x005e
            int[] r7 = f34833r
            r9 = r3
            r10 = r9
            r12 = r10
            r13 = r12
            r15 = r13
            r14 = r7
            r7 = r15
            goto L_0x016f
        L_0x005e:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x007d
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x006a:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x007a
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r5 = r5 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x006a
        L_0x007a:
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = r10
        L_0x007d:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x009c
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0089:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x0099
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L_0x0089
        L_0x0099:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r12
        L_0x009c:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x00bb
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00a8:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00b8
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L_0x00a8
        L_0x00b8:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        L_0x00bb:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00da
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00c7:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00d7
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00c7
        L_0x00d7:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        L_0x00da:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00f9
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00e6:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x00f6
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00e6
        L_0x00f6:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00f9:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x011a
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0105:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0116
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0105
        L_0x0116:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x011a:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x013d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0126:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0138
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0126
        L_0x0138:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x013d:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0162
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r3 = r16
            r16 = 13
        L_0x014b:
            int r17 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r6) goto L_0x015d
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r16
            r15 = r15 | r3
            int r16 = r16 + 13
            r3 = r17
            goto L_0x014b
        L_0x015d:
            int r3 = r3 << r16
            r15 = r15 | r3
            r16 = r17
        L_0x0162:
            int r3 = r15 + r13
            int r3 = r3 + r14
            int[] r3 = new int[r3]
            int r14 = r5 << 1
            int r14 = r14 + r7
            r7 = r14
            r14 = r3
            r3 = r5
            r5 = r16
        L_0x016f:
            sun.misc.Unsafe r8 = f34834s
            java.lang.Object[] r16 = r0.mo29883b()
            k59 r17 = r0.zzc()
            java.lang.Class r6 = r17.getClass()
            r17 = r5
            int r5 = r12 * 3
            int[] r5 = new int[r5]
            int r12 = r12 << r4
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r19 = r15 + r13
            r13 = r7
            r21 = r15
            r7 = r17
            r22 = r19
            r17 = 0
            r20 = 0
        L_0x0193:
            if (r7 >= r2) goto L_0x03de
            int r23 = r7 + 1
            char r7 = r1.charAt(r7)
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r4) goto L_0x01c5
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r4 = r23
            r23 = 13
        L_0x01a6:
            int r25 = r4 + 1
            char r4 = r1.charAt(r4)
            r26 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r2) goto L_0x01bf
            r2 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r23
            r7 = r7 | r2
            int r23 = r23 + 13
            r4 = r25
            r2 = r26
            goto L_0x01a6
        L_0x01bf:
            int r2 = r4 << r23
            r7 = r7 | r2
            r2 = r25
            goto L_0x01c9
        L_0x01c5:
            r26 = r2
            r2 = r23
        L_0x01c9:
            int r4 = r2 + 1
            char r2 = r1.charAt(r2)
            r23 = r4
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r4) goto L_0x01fb
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r4 = r23
            r23 = 13
        L_0x01dc:
            int r25 = r4 + 1
            char r4 = r1.charAt(r4)
            r27 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r15) goto L_0x01f5
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r23
            r2 = r2 | r4
            int r23 = r23 + 13
            r4 = r25
            r15 = r27
            goto L_0x01dc
        L_0x01f5:
            int r4 = r4 << r23
            r2 = r2 | r4
            r4 = r25
            goto L_0x01ff
        L_0x01fb:
            r27 = r15
            r4 = r23
        L_0x01ff:
            r15 = r2 & 255(0xff, float:3.57E-43)
            r23 = r10
            r10 = r2 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L_0x020d
            int r10 = r17 + 1
            r14[r17] = r20
            r17 = r10
        L_0x020d:
            r10 = 51
            r29 = r9
            if (r15 < r10) goto L_0x02a8
            int r10 = r4 + 1
            char r4 = r1.charAt(r4)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r9) goto L_0x023c
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r31 = 13
        L_0x0222:
            int r32 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r9) goto L_0x0237
            r9 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r31
            r4 = r4 | r9
            int r31 = r31 + 13
            r10 = r32
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0222
        L_0x0237:
            int r9 = r10 << r31
            r4 = r4 | r9
            r10 = r32
        L_0x023c:
            int r9 = r15 + -51
            r31 = r10
            r10 = 9
            if (r9 == r10) goto L_0x025d
            r10 = 17
            if (r9 != r10) goto L_0x0249
            goto L_0x025d
        L_0x0249:
            r10 = 12
            if (r9 != r10) goto L_0x025b
            if (r11 != 0) goto L_0x025b
            int r9 = r20 / 3
            r10 = 1
            int r9 = r9 << r10
            int r9 = r9 + r10
            int r10 = r13 + 1
            r13 = r16[r13]
            r12[r9] = r13
            r13 = r10
        L_0x025b:
            r10 = 1
            goto L_0x026a
        L_0x025d:
            int r9 = r20 / 3
            r10 = 1
            int r9 = r9 << r10
            int r9 = r9 + r10
            int r24 = r13 + 1
            r13 = r16[r13]
            r12[r9] = r13
            r13 = r24
        L_0x026a:
            int r4 = r4 << r10
            r9 = r16[r4]
            boolean r10 = r9 instanceof java.lang.reflect.Field
            if (r10 == 0) goto L_0x0274
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x027c
        L_0x0274:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m53243q(r6, r9)
            r16[r4] = r9
        L_0x027c:
            long r9 = r8.objectFieldOffset(r9)
            int r9 = (int) r9
            int r4 = r4 + 1
            r10 = r16[r4]
            r25 = r9
            boolean r9 = r10 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x028e
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            goto L_0x0296
        L_0x028e:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = m53243q(r6, r10)
            r16[r4] = r10
        L_0x0296:
            long r9 = r8.objectFieldOffset(r10)
            int r4 = (int) r9
            r30 = r1
            r10 = r4
            r1 = r11
            r9 = r25
            r24 = r31
            r4 = 0
            r18 = 1
            goto L_0x03a3
        L_0x02a8:
            int r9 = r13 + 1
            r10 = r16[r13]
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = m53243q(r6, r10)
            r13 = 9
            if (r15 == r13) goto L_0x031c
            r13 = 17
            if (r15 != r13) goto L_0x02bb
            goto L_0x031c
        L_0x02bb:
            r13 = 27
            if (r15 == r13) goto L_0x030b
            r13 = 49
            if (r15 != r13) goto L_0x02c4
            goto L_0x030b
        L_0x02c4:
            r13 = 12
            if (r15 == r13) goto L_0x02f7
            r13 = 30
            if (r15 == r13) goto L_0x02f7
            r13 = 44
            if (r15 != r13) goto L_0x02d1
            goto L_0x02f7
        L_0x02d1:
            r13 = 50
            if (r15 != r13) goto L_0x032a
            int r13 = r21 + 1
            r14[r21] = r20
            int r21 = r20 / 3
            r24 = 1
            int r21 = r21 << 1
            int r25 = r9 + 1
            r9 = r16[r9]
            r12[r21] = r9
            r9 = r2 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x02f4
            int r21 = r21 + 1
            int r9 = r25 + 1
            r25 = r16[r25]
            r12[r21] = r25
            r21 = r13
            goto L_0x032a
        L_0x02f4:
            r21 = r13
            goto L_0x0319
        L_0x02f7:
            if (r11 != 0) goto L_0x0308
            int r13 = r20 / 3
            r24 = 1
            int r13 = r13 << 1
            int r13 = r13 + 1
            int r25 = r9 + 1
            r9 = r16[r9]
            r12[r13] = r9
            goto L_0x0319
        L_0x0308:
            r24 = 1
            goto L_0x032a
        L_0x030b:
            r24 = 1
            int r13 = r20 / 3
            int r13 = r13 << 1
            int r13 = r13 + 1
            int r25 = r9 + 1
            r9 = r16[r9]
            r12[r13] = r9
        L_0x0319:
            r13 = r25
            goto L_0x032b
        L_0x031c:
            r24 = 1
            int r13 = r20 / 3
            int r13 = r13 << 1
            int r13 = r13 + 1
            java.lang.Class r25 = r10.getType()
            r12[r13] = r25
        L_0x032a:
            r13 = r9
        L_0x032b:
            long r9 = r8.objectFieldOffset(r10)
            int r9 = (int) r9
            r10 = r2 & 4096(0x1000, float:5.74E-42)
            r25 = r13
            r13 = 4096(0x1000, float:5.74E-42)
            if (r10 != r13) goto L_0x0388
            r10 = 17
            if (r15 > r10) goto L_0x0388
            int r10 = r4 + 1
            char r4 = r1.charAt(r4)
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r13) goto L_0x0362
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r18 = 13
        L_0x034b:
            int r28 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r13) goto L_0x035d
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r18
            r4 = r4 | r10
            int r18 = r18 + 13
            r10 = r28
            goto L_0x034b
        L_0x035d:
            int r10 = r10 << r18
            r4 = r4 | r10
            r10 = r28
        L_0x0362:
            r18 = 1
            int r24 = r3 << 1
            int r28 = r4 / 32
            int r24 = r24 + r28
            r13 = r16[r24]
            r30 = r1
            boolean r1 = r13 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L_0x0375
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            goto L_0x037d
        L_0x0375:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = m53243q(r6, r13)
            r16[r24] = r13
        L_0x037d:
            r24 = r10
            r1 = r11
            long r10 = r8.objectFieldOffset(r13)
            int r10 = (int) r10
            int r4 = r4 % 32
            goto L_0x0393
        L_0x0388:
            r30 = r1
            r1 = r11
            r18 = 1
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r24 = r4
            r4 = 0
        L_0x0393:
            r11 = 18
            if (r15 < r11) goto L_0x03a1
            r11 = 49
            if (r15 > r11) goto L_0x03a1
            int r11 = r22 + 1
            r14[r22] = r9
            r22 = r11
        L_0x03a1:
            r13 = r25
        L_0x03a3:
            int r11 = r20 + 1
            r5[r20] = r7
            int r7 = r11 + 1
            r20 = r3
            r3 = r2 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x03b2
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03b3
        L_0x03b2:
            r3 = 0
        L_0x03b3:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03ba
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03bb
        L_0x03ba:
            r2 = 0
        L_0x03bb:
            r2 = r2 | r3
            int r3 = r15 << 20
            r2 = r2 | r3
            r2 = r2 | r9
            r5[r11] = r2
            int r2 = r7 + 1
            int r3 = r4 << 20
            r3 = r3 | r10
            r5[r7] = r3
            r11 = r1
            r4 = r18
            r3 = r20
            r10 = r23
            r7 = r24
            r15 = r27
            r9 = r29
            r1 = r30
            r20 = r2
            r2 = r26
            goto L_0x0193
        L_0x03de:
            r29 = r9
            r23 = r10
            r1 = r11
            r27 = r15
            v59 r2 = new v59
            k59 r10 = r0.zzc()
            r0 = 0
            r3 = r5
            r5 = r2
            r6 = r3
            r7 = r12
            r8 = r29
            r9 = r23
            r12 = r0
            r13 = r14
            r14 = r27
            r15 = r19
            r16 = r35
            r17 = r36
            r18 = r37
            r19 = r38
            r20 = r39
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r2
        L_0x0408:
            i89 r0 = (p000.i89) r0
            r0.zza()
            int r0 = p000.p69.f32586a
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v59.m53245s(java.lang.Class, e59, z59, g39, o89, wz8, b59):v59");
    }

    /* renamed from: u */
    public static void m53246u(int i, Object obj, sa9 sa9) throws IOException {
        if (obj instanceof String) {
            sa9.mo45590x(i, (String) obj);
        } else {
            sa9.mo45565M(i, (zzht) obj);
        }
    }

    /* renamed from: w */
    public static <UT, UB> void m53247w(o89<UT, UB> o89, T t, sa9 sa9) throws IOException {
        o89.mo46348e(o89.mo46349f(t), sa9);
    }

    /* renamed from: A */
    public final boolean mo48662A(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return mo48684y(t, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public final int mo48663D(int i, int i2) {
        int length = (this.f34835a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f34835a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: E */
    public final Object mo48664E(int i) {
        return this.f34836b[(i / 3) << 1];
    }

    /* renamed from: F */
    public final void mo48665F(T t, int i) {
        int O = mo48672O(i);
        long j = (long) (1048575 & O);
        if (j != 1048575) {
            l99.m47690h(t, j, (1 << (O >>> 20)) | l99.m47684b(t, j));
        }
    }

    /* renamed from: G */
    public final void mo48666G(T t, int i, int i2) {
        l99.m47690h(t, (long) (mo48672O(i2) & 1048575), i);
    }

    /* renamed from: H */
    public final void mo48667H(T t, T t2, int i) {
        int M = mo48671M(i);
        int i2 = this.f34835a[i];
        long j = (long) (M & 1048575);
        if (mo48685z(t2, i2, i)) {
            Object obj = null;
            if (mo48685z(t, i2, i)) {
                obj = l99.m47673F(t, j);
            }
            Object F = l99.m47673F(t2, j);
            if (obj != null && F != null) {
                l99.m47692j(t, j, t19.m52048e(obj, F));
                mo48666G(t, i2, i);
            } else if (F != null) {
                l99.m47692j(t, j, F);
                mo48666G(t, i2, i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0398, code lost:
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0485, code lost:
        r10 = r10 + 3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x048b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48668I(T r18, p000.sa9 r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f34840f
            if (r3 == 0) goto L_0x0023
            wz8<?> r3 = r0.f34850p
            i09 r3 = r3.mo31164c(r1)
            o79<T, java.lang.Object> r5 = r3.f29780a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0023
            java.util.Iterator r3 = r3.mo43445o()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0025
        L_0x0023:
            r3 = 0
            r5 = 0
        L_0x0025:
            int[] r6 = r0.f34835a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f34834s
            r10 = 0
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x002f:
            if (r10 >= r6) goto L_0x0489
            int r13 = r0.mo48671M(r10)
            int[] r14 = r0.f34835a
            r15 = r14[r10]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r16 = r13 & r16
            int r4 = r16 >>> 20
            r9 = 17
            if (r4 > r9) goto L_0x005a
            int r9 = r10 + 2
            r9 = r14[r9]
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r9 & r14
            if (r8 == r11) goto L_0x0054
            long r11 = (long) r8
            int r12 = r7.getInt(r1, r11)
            r11 = r8
        L_0x0054:
            int r8 = r9 >>> 20
            r9 = 1
            int r8 = r9 << r8
            goto L_0x005b
        L_0x005a:
            r8 = 0
        L_0x005b:
            if (r5 == 0) goto L_0x0079
            wz8<?> r9 = r0.f34850p
            int r9 = r9.mo31162a(r5)
            if (r9 > r15) goto L_0x0079
            wz8<?> r9 = r0.f34850p
            r9.mo31165d(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0077
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x005b
        L_0x0077:
            r5 = 0
            goto L_0x005b
        L_0x0079:
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r13 & r9
            long r13 = (long) r13
            switch(r4) {
                case 0: goto L_0x047a;
                case 1: goto L_0x046e;
                case 2: goto L_0x0462;
                case 3: goto L_0x0456;
                case 4: goto L_0x044a;
                case 5: goto L_0x043e;
                case 6: goto L_0x0432;
                case 7: goto L_0x0426;
                case 8: goto L_0x041a;
                case 9: goto L_0x0409;
                case 10: goto L_0x03fa;
                case 11: goto L_0x03ed;
                case 12: goto L_0x03e0;
                case 13: goto L_0x03d3;
                case 14: goto L_0x03c6;
                case 15: goto L_0x03b9;
                case 16: goto L_0x03ac;
                case 17: goto L_0x039b;
                case 18: goto L_0x038a;
                case 19: goto L_0x037b;
                case 20: goto L_0x036c;
                case 21: goto L_0x035d;
                case 22: goto L_0x034e;
                case 23: goto L_0x033f;
                case 24: goto L_0x0330;
                case 25: goto L_0x0321;
                case 26: goto L_0x0312;
                case 27: goto L_0x02ff;
                case 28: goto L_0x02f0;
                case 29: goto L_0x02e0;
                case 30: goto L_0x02d0;
                case 31: goto L_0x02c0;
                case 32: goto L_0x02b0;
                case 33: goto L_0x02a0;
                case 34: goto L_0x0290;
                case 35: goto L_0x0280;
                case 36: goto L_0x0270;
                case 37: goto L_0x0260;
                case 38: goto L_0x0250;
                case 39: goto L_0x0240;
                case 40: goto L_0x0230;
                case 41: goto L_0x0220;
                case 42: goto L_0x0210;
                case 43: goto L_0x0200;
                case 44: goto L_0x01f0;
                case 45: goto L_0x01e0;
                case 46: goto L_0x01d0;
                case 47: goto L_0x01c0;
                case 48: goto L_0x01b0;
                case 49: goto L_0x019d;
                case 50: goto L_0x0194;
                case 51: goto L_0x0185;
                case 52: goto L_0x0176;
                case 53: goto L_0x0167;
                case 54: goto L_0x0158;
                case 55: goto L_0x0149;
                case 56: goto L_0x013a;
                case 57: goto L_0x012b;
                case 58: goto L_0x011c;
                case 59: goto L_0x010d;
                case 60: goto L_0x00fa;
                case 61: goto L_0x00ea;
                case 62: goto L_0x00dc;
                case 63: goto L_0x00ce;
                case 64: goto L_0x00c0;
                case 65: goto L_0x00b2;
                case 66: goto L_0x00a4;
                case 67: goto L_0x0096;
                case 68: goto L_0x0084;
                default: goto L_0x0081;
            }
        L_0x0081:
            r4 = 0
            goto L_0x0485
        L_0x0084:
            boolean r4 = r0.mo48685z(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r7.getObject(r1, r13)
            g79 r8 = r0.mo48681t(r10)
            r2.mo45560H(r15, r4, r8)
            goto L_0x0081
        L_0x0096:
            boolean r4 = r0.mo48685z(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            long r13 = m53239P(r1, r13)
            r2.mo45564L(r15, r13)
            goto L_0x0081
        L_0x00a4:
            boolean r4 = r0.mo48685z(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = m53238N(r1, r13)
            r2.mo45580n(r15, r4)
            goto L_0x0081
        L_0x00b2:
            boolean r4 = r0.mo48685z(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            long r13 = m53239P(r1, r13)
            r2.mo45567a(r15, r13)
            goto L_0x0081
        L_0x00c0:
            boolean r4 = r0.mo48685z(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = m53238N(r1, r13)
            r2.mo45576j(r15, r4)
            goto L_0x0081
        L_0x00ce:
            boolean r4 = r0.mo48685z(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = m53238N(r1, r13)
            r2.mo45558F(r15, r4)
            goto L_0x0081
        L_0x00dc:
            boolean r4 = r0.mo48685z(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = m53238N(r1, r13)
            r2.mo45585s(r15, r4)
            goto L_0x0081
        L_0x00ea:
            boolean r4 = r0.mo48685z(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.android.gms.internal.vision.zzht r4 = (com.google.android.gms.internal.vision.zzht) r4
            r2.mo45565M(r15, r4)
            goto L_0x0081
        L_0x00fa:
            boolean r4 = r0.mo48685z(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r7.getObject(r1, r13)
            g79 r8 = r0.mo48681t(r10)
            r2.mo45561I(r15, r4, r8)
            goto L_0x0081
        L_0x010d:
            boolean r4 = r0.mo48685z(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r7.getObject(r1, r13)
            m53246u(r15, r4, r2)
            goto L_0x0081
        L_0x011c:
            boolean r4 = r0.mo48685z(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            boolean r4 = m53241R(r1, r13)
            r2.mo45557E(r15, r4)
            goto L_0x0081
        L_0x012b:
            boolean r4 = r0.mo48685z(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = m53238N(r1, r13)
            r2.mo45584r(r15, r4)
            goto L_0x0081
        L_0x013a:
            boolean r4 = r0.mo48685z(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            long r13 = m53239P(r1, r13)
            r2.mo45563K(r15, r13)
            goto L_0x0081
        L_0x0149:
            boolean r4 = r0.mo48685z(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = m53238N(r1, r13)
            r2.mo45569c(r15, r4)
            goto L_0x0081
        L_0x0158:
            boolean r4 = r0.mo48685z(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            long r13 = m53239P(r1, r13)
            r2.mo45571e(r15, r13)
            goto L_0x0081
        L_0x0167:
            boolean r4 = r0.mo48685z(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            long r13 = m53239P(r1, r13)
            r2.mo45577k(r15, r13)
            goto L_0x0081
        L_0x0176:
            boolean r4 = r0.mo48685z(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            float r4 = m53237J(r1, r13)
            r2.mo45579m(r15, r4)
            goto L_0x0081
        L_0x0185:
            boolean r4 = r0.mo48685z(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            double r13 = m53236C(r1, r13)
            r2.mo45578l(r15, r13)
            goto L_0x0081
        L_0x0194:
            java.lang.Object r4 = r7.getObject(r1, r13)
            r0.mo48683x(r2, r15, r4, r10)
            goto L_0x0081
        L_0x019d:
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            g79 r13 = r0.mo48681t(r10)
            p000.i79.m45576x(r4, r8, r2, r13)
            goto L_0x0081
        L_0x01b0:
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 1
            p000.i79.m45533K(r4, r8, r2, r15)
            goto L_0x0081
        L_0x01c0:
            r15 = 1
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45548Z(r4, r8, r2, r15)
            goto L_0x0081
        L_0x01d0:
            r15 = 1
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45539Q(r4, r8, r2, r15)
            goto L_0x0081
        L_0x01e0:
            r15 = 1
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45552b0(r4, r8, r2, r15)
            goto L_0x0081
        L_0x01f0:
            r15 = 1
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45554c0(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0200:
            r15 = 1
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45545W(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0210:
            r15 = 1
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45556d0(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0220:
            r15 = 1
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45550a0(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0230:
            r15 = 1
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45536N(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0240:
            r15 = 1
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45542T(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0250:
            r15 = 1
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45529G(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0260:
            r15 = 1
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45525C(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0270:
            r15 = 1
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45577y(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0280:
            r15 = 1
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45564l(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0290:
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            p000.i79.m45533K(r4, r8, r2, r15)
            goto L_0x0398
        L_0x02a0:
            r15 = 0
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45548Z(r4, r8, r2, r15)
            goto L_0x0398
        L_0x02b0:
            r15 = 0
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45539Q(r4, r8, r2, r15)
            goto L_0x0398
        L_0x02c0:
            r15 = 0
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45552b0(r4, r8, r2, r15)
            goto L_0x0398
        L_0x02d0:
            r15 = 0
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45554c0(r4, r8, r2, r15)
            goto L_0x0398
        L_0x02e0:
            r15 = 0
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45545W(r4, r8, r2, r15)
            goto L_0x0398
        L_0x02f0:
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45575w(r4, r8, r2)
            goto L_0x0081
        L_0x02ff:
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            g79 r13 = r0.mo48681t(r10)
            p000.i79.m45563k(r4, r8, r2, r13)
            goto L_0x0081
        L_0x0312:
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45562j(r4, r8, r2)
            goto L_0x0081
        L_0x0321:
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            p000.i79.m45556d0(r4, r8, r2, r15)
            goto L_0x0398
        L_0x0330:
            r15 = 0
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45550a0(r4, r8, r2, r15)
            goto L_0x0398
        L_0x033f:
            r15 = 0
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45536N(r4, r8, r2, r15)
            goto L_0x0398
        L_0x034e:
            r15 = 0
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45542T(r4, r8, r2, r15)
            goto L_0x0398
        L_0x035d:
            r15 = 0
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45529G(r4, r8, r2, r15)
            goto L_0x0398
        L_0x036c:
            r15 = 0
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45525C(r4, r8, r2, r15)
            goto L_0x0398
        L_0x037b:
            r15 = 0
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45577y(r4, r8, r2, r15)
            goto L_0x0398
        L_0x038a:
            r15 = 0
            int[] r4 = r0.f34835a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45564l(r4, r8, r2, r15)
        L_0x0398:
            r4 = r15
            goto L_0x0485
        L_0x039b:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0485
            java.lang.Object r8 = r7.getObject(r1, r13)
            g79 r13 = r0.mo48681t(r10)
            r2.mo45560H(r15, r8, r13)
            goto L_0x0485
        L_0x03ac:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0485
            long r13 = r7.getLong(r1, r13)
            r2.mo45564L(r15, r13)
            goto L_0x0485
        L_0x03b9:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0485
            int r8 = r7.getInt(r1, r13)
            r2.mo45580n(r15, r8)
            goto L_0x0485
        L_0x03c6:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0485
            long r13 = r7.getLong(r1, r13)
            r2.mo45567a(r15, r13)
            goto L_0x0485
        L_0x03d3:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0485
            int r8 = r7.getInt(r1, r13)
            r2.mo45576j(r15, r8)
            goto L_0x0485
        L_0x03e0:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0485
            int r8 = r7.getInt(r1, r13)
            r2.mo45558F(r15, r8)
            goto L_0x0485
        L_0x03ed:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0485
            int r8 = r7.getInt(r1, r13)
            r2.mo45585s(r15, r8)
            goto L_0x0485
        L_0x03fa:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0485
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.android.gms.internal.vision.zzht r8 = (com.google.android.gms.internal.vision.zzht) r8
            r2.mo45565M(r15, r8)
            goto L_0x0485
        L_0x0409:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0485
            java.lang.Object r8 = r7.getObject(r1, r13)
            g79 r13 = r0.mo48681t(r10)
            r2.mo45561I(r15, r8, r13)
            goto L_0x0485
        L_0x041a:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0485
            java.lang.Object r8 = r7.getObject(r1, r13)
            m53246u(r15, r8, r2)
            goto L_0x0485
        L_0x0426:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0485
            boolean r8 = p000.l99.m47705w(r1, r13)
            r2.mo45557E(r15, r8)
            goto L_0x0485
        L_0x0432:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0485
            int r8 = r7.getInt(r1, r13)
            r2.mo45584r(r15, r8)
            goto L_0x0485
        L_0x043e:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0485
            long r13 = r7.getLong(r1, r13)
            r2.mo45563K(r15, r13)
            goto L_0x0485
        L_0x044a:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0485
            int r8 = r7.getInt(r1, r13)
            r2.mo45569c(r15, r8)
            goto L_0x0485
        L_0x0456:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0485
            long r13 = r7.getLong(r1, r13)
            r2.mo45571e(r15, r13)
            goto L_0x0485
        L_0x0462:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0485
            long r13 = r7.getLong(r1, r13)
            r2.mo45577k(r15, r13)
            goto L_0x0485
        L_0x046e:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0485
            float r8 = p000.l99.m47706x(r1, r13)
            r2.mo45579m(r15, r8)
            goto L_0x0485
        L_0x047a:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0485
            double r13 = p000.l99.m47670C(r1, r13)
            r2.mo45578l(r15, r13)
        L_0x0485:
            int r10 = r10 + 3
            goto L_0x002f
        L_0x0489:
            if (r5 == 0) goto L_0x04a0
            wz8<?> r4 = r0.f34850p
            r4.mo31165d(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x049e
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x0489
        L_0x049e:
            r5 = 0
            goto L_0x0489
        L_0x04a0:
            o89<?, ?> r3 = r0.f34849o
            m53247w(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v59.mo48668I(java.lang.Object, sa9):void");
    }

    /* renamed from: K */
    public final w19 mo48669K(int i) {
        return (w19) this.f34836b[((i / 3) << 1) + 1];
    }

    /* renamed from: L */
    public final boolean mo48670L(T t, T t2, int i) {
        if (mo48684y(t, i) == mo48684y(t2, i)) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public final int mo48671M(int i) {
        return this.f34835a[i + 1];
    }

    /* renamed from: O */
    public final int mo48672O(int i) {
        return this.f34835a[i + 2];
    }

    /* renamed from: S */
    public final int mo48673S(int i) {
        if (i < this.f34837c || i > this.f34838d) {
            return -1;
        }
        return mo48663D(i, 0);
    }

    /* renamed from: a */
    public final void mo31205a(T t) {
        int i;
        int i2 = this.f34845k;
        while (true) {
            i = this.f34846l;
            if (i2 >= i) {
                break;
            }
            long M = (long) (mo48671M(this.f34844j[i2]) & 1048575);
            Object F = l99.m47673F(t, M);
            if (F != null) {
                l99.m47692j(t, M, this.f34851q.mo29459d(F));
            }
            i2++;
        }
        int length = this.f34844j.length;
        while (i < length) {
            this.f34848n.mo42739d(t, (long) this.f34844j[i]);
            i++;
        }
        this.f34849o.mo46353j(t);
        if (this.f34840f) {
            this.f34850p.mo31168g(t);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c3, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0227, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0228, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo31206b(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f34835a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022c
            int r3 = r8.mo48671M(r1)
            int[] r4 = r8.f34835a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0219;
                case 1: goto L_0x020e;
                case 2: goto L_0x0203;
                case 3: goto L_0x01f8;
                case 4: goto L_0x01f1;
                case 5: goto L_0x01e6;
                case 6: goto L_0x01df;
                case 7: goto L_0x01d4;
                case 8: goto L_0x01c7;
                case 9: goto L_0x01b9;
                case 10: goto L_0x01ad;
                case 11: goto L_0x01a5;
                case 12: goto L_0x019d;
                case 13: goto L_0x0195;
                case 14: goto L_0x0189;
                case 15: goto L_0x0181;
                case 16: goto L_0x0175;
                case 17: goto L_0x016a;
                case 18: goto L_0x015e;
                case 19: goto L_0x015e;
                case 20: goto L_0x015e;
                case 21: goto L_0x015e;
                case 22: goto L_0x015e;
                case 23: goto L_0x015e;
                case 24: goto L_0x015e;
                case 25: goto L_0x015e;
                case 26: goto L_0x015e;
                case 27: goto L_0x015e;
                case 28: goto L_0x015e;
                case 29: goto L_0x015e;
                case 30: goto L_0x015e;
                case 31: goto L_0x015e;
                case 32: goto L_0x015e;
                case 33: goto L_0x015e;
                case 34: goto L_0x015e;
                case 35: goto L_0x015e;
                case 36: goto L_0x015e;
                case 37: goto L_0x015e;
                case 38: goto L_0x015e;
                case 39: goto L_0x015e;
                case 40: goto L_0x015e;
                case 41: goto L_0x015e;
                case 42: goto L_0x015e;
                case 43: goto L_0x015e;
                case 44: goto L_0x015e;
                case 45: goto L_0x015e;
                case 46: goto L_0x015e;
                case 47: goto L_0x015e;
                case 48: goto L_0x015e;
                case 49: goto L_0x015e;
                case 50: goto L_0x0152;
                case 51: goto L_0x013c;
                case 52: goto L_0x012a;
                case 53: goto L_0x0118;
                case 54: goto L_0x0106;
                case 55: goto L_0x00f8;
                case 56: goto L_0x00e6;
                case 57: goto L_0x00d8;
                case 58: goto L_0x00c6;
                case 59: goto L_0x00b2;
                case 60: goto L_0x00a0;
                case 61: goto L_0x008e;
                case 62: goto L_0x0080;
                case 63: goto L_0x0072;
                case 64: goto L_0x0064;
                case 65: goto L_0x0052;
                case 66: goto L_0x0044;
                case 67: goto L_0x0032;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0228
        L_0x0020:
            boolean r3 = r8.mo48685z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = p000.l99.m47673F(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x0032:
            boolean r3 = r8.mo48685z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m53239P(r9, r5)
            int r3 = p000.t19.m52045b(r3)
            goto L_0x0227
        L_0x0044:
            boolean r3 = r8.mo48685z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m53238N(r9, r5)
            goto L_0x0227
        L_0x0052:
            boolean r3 = r8.mo48685z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m53239P(r9, r5)
            int r3 = p000.t19.m52045b(r3)
            goto L_0x0227
        L_0x0064:
            boolean r3 = r8.mo48685z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m53238N(r9, r5)
            goto L_0x0227
        L_0x0072:
            boolean r3 = r8.mo48685z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m53238N(r9, r5)
            goto L_0x0227
        L_0x0080:
            boolean r3 = r8.mo48685z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m53238N(r9, r5)
            goto L_0x0227
        L_0x008e:
            boolean r3 = r8.mo48685z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = p000.l99.m47673F(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00a0:
            boolean r3 = r8.mo48685z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = p000.l99.m47673F(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00b2:
            boolean r3 = r8.mo48685z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = p000.l99.m47673F(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00c6:
            boolean r3 = r8.mo48685z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            boolean r3 = m53241R(r9, r5)
            int r3 = p000.t19.m52046c(r3)
            goto L_0x0227
        L_0x00d8:
            boolean r3 = r8.mo48685z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m53238N(r9, r5)
            goto L_0x0227
        L_0x00e6:
            boolean r3 = r8.mo48685z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m53239P(r9, r5)
            int r3 = p000.t19.m52045b(r3)
            goto L_0x0227
        L_0x00f8:
            boolean r3 = r8.mo48685z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m53238N(r9, r5)
            goto L_0x0227
        L_0x0106:
            boolean r3 = r8.mo48685z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m53239P(r9, r5)
            int r3 = p000.t19.m52045b(r3)
            goto L_0x0227
        L_0x0118:
            boolean r3 = r8.mo48685z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m53239P(r9, r5)
            int r3 = p000.t19.m52045b(r3)
            goto L_0x0227
        L_0x012a:
            boolean r3 = r8.mo48685z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            float r3 = m53237J(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x013c:
            boolean r3 = r8.mo48685z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            double r3 = m53236C(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = p000.t19.m52045b(r3)
            goto L_0x0227
        L_0x0152:
            int r2 = r2 * 53
            java.lang.Object r3 = p000.l99.m47673F(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x015e:
            int r2 = r2 * 53
            java.lang.Object r3 = p000.l99.m47673F(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x016a:
            java.lang.Object r3 = p000.l99.m47673F(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
            goto L_0x01c3
        L_0x0175:
            int r2 = r2 * 53
            long r3 = p000.l99.m47697o(r9, r5)
            int r3 = p000.t19.m52045b(r3)
            goto L_0x0227
        L_0x0181:
            int r2 = r2 * 53
            int r3 = p000.l99.m47684b(r9, r5)
            goto L_0x0227
        L_0x0189:
            int r2 = r2 * 53
            long r3 = p000.l99.m47697o(r9, r5)
            int r3 = p000.t19.m52045b(r3)
            goto L_0x0227
        L_0x0195:
            int r2 = r2 * 53
            int r3 = p000.l99.m47684b(r9, r5)
            goto L_0x0227
        L_0x019d:
            int r2 = r2 * 53
            int r3 = p000.l99.m47684b(r9, r5)
            goto L_0x0227
        L_0x01a5:
            int r2 = r2 * 53
            int r3 = p000.l99.m47684b(r9, r5)
            goto L_0x0227
        L_0x01ad:
            int r2 = r2 * 53
            java.lang.Object r3 = p000.l99.m47673F(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01b9:
            java.lang.Object r3 = p000.l99.m47673F(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
        L_0x01c3:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0228
        L_0x01c7:
            int r2 = r2 * 53
            java.lang.Object r3 = p000.l99.m47673F(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01d4:
            int r2 = r2 * 53
            boolean r3 = p000.l99.m47705w(r9, r5)
            int r3 = p000.t19.m52046c(r3)
            goto L_0x0227
        L_0x01df:
            int r2 = r2 * 53
            int r3 = p000.l99.m47684b(r9, r5)
            goto L_0x0227
        L_0x01e6:
            int r2 = r2 * 53
            long r3 = p000.l99.m47697o(r9, r5)
            int r3 = p000.t19.m52045b(r3)
            goto L_0x0227
        L_0x01f1:
            int r2 = r2 * 53
            int r3 = p000.l99.m47684b(r9, r5)
            goto L_0x0227
        L_0x01f8:
            int r2 = r2 * 53
            long r3 = p000.l99.m47697o(r9, r5)
            int r3 = p000.t19.m52045b(r3)
            goto L_0x0227
        L_0x0203:
            int r2 = r2 * 53
            long r3 = p000.l99.m47697o(r9, r5)
            int r3 = p000.t19.m52045b(r3)
            goto L_0x0227
        L_0x020e:
            int r2 = r2 * 53
            float r3 = p000.l99.m47706x(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x0219:
            int r2 = r2 * 53
            double r3 = p000.l99.m47670C(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = p000.t19.m52045b(r3)
        L_0x0227:
            int r2 = r2 + r3
        L_0x0228:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022c:
            int r2 = r2 * 53
            o89<?, ?> r0 = r8.f34849o
            java.lang.Object r0 = r0.mo46349f(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f34840f
            if (r0 == 0) goto L_0x024a
            int r2 = r2 * 53
            wz8<?> r0 = r8.f34850p
            i09 r9 = r0.mo31164c(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x024a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v59.mo31206b(java.lang.Object):int");
    }

    /* renamed from: c */
    public final void mo31207c(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.f34835a.length; i += 3) {
            int M = mo48671M(i);
            long j = (long) (1048575 & M);
            int i2 = this.f34835a[i];
            switch ((M & 267386880) >>> 20) {
                case 0:
                    if (!mo48684y(t2, i)) {
                        break;
                    } else {
                        l99.m47688f(t, j, l99.m47670C(t2, j));
                        mo48665F(t, i);
                        break;
                    }
                case 1:
                    if (!mo48684y(t2, i)) {
                        break;
                    } else {
                        l99.m47689g(t, j, l99.m47706x(t2, j));
                        mo48665F(t, i);
                        break;
                    }
                case 2:
                    if (!mo48684y(t2, i)) {
                        break;
                    } else {
                        l99.m47691i(t, j, l99.m47697o(t2, j));
                        mo48665F(t, i);
                        break;
                    }
                case 3:
                    if (!mo48684y(t2, i)) {
                        break;
                    } else {
                        l99.m47691i(t, j, l99.m47697o(t2, j));
                        mo48665F(t, i);
                        break;
                    }
                case 4:
                    if (!mo48684y(t2, i)) {
                        break;
                    } else {
                        l99.m47690h(t, j, l99.m47684b(t2, j));
                        mo48665F(t, i);
                        break;
                    }
                case 5:
                    if (!mo48684y(t2, i)) {
                        break;
                    } else {
                        l99.m47691i(t, j, l99.m47697o(t2, j));
                        mo48665F(t, i);
                        break;
                    }
                case 6:
                    if (!mo48684y(t2, i)) {
                        break;
                    } else {
                        l99.m47690h(t, j, l99.m47684b(t2, j));
                        mo48665F(t, i);
                        break;
                    }
                case 7:
                    if (!mo48684y(t2, i)) {
                        break;
                    } else {
                        l99.m47693k(t, j, l99.m47705w(t2, j));
                        mo48665F(t, i);
                        break;
                    }
                case 8:
                    if (!mo48684y(t2, i)) {
                        break;
                    } else {
                        l99.m47692j(t, j, l99.m47673F(t2, j));
                        mo48665F(t, i);
                        break;
                    }
                case 9:
                    mo48682v(t, t2, i);
                    break;
                case 10:
                    if (!mo48684y(t2, i)) {
                        break;
                    } else {
                        l99.m47692j(t, j, l99.m47673F(t2, j));
                        mo48665F(t, i);
                        break;
                    }
                case 11:
                    if (!mo48684y(t2, i)) {
                        break;
                    } else {
                        l99.m47690h(t, j, l99.m47684b(t2, j));
                        mo48665F(t, i);
                        break;
                    }
                case 12:
                    if (!mo48684y(t2, i)) {
                        break;
                    } else {
                        l99.m47690h(t, j, l99.m47684b(t2, j));
                        mo48665F(t, i);
                        break;
                    }
                case 13:
                    if (!mo48684y(t2, i)) {
                        break;
                    } else {
                        l99.m47690h(t, j, l99.m47684b(t2, j));
                        mo48665F(t, i);
                        break;
                    }
                case 14:
                    if (!mo48684y(t2, i)) {
                        break;
                    } else {
                        l99.m47691i(t, j, l99.m47697o(t2, j));
                        mo48665F(t, i);
                        break;
                    }
                case 15:
                    if (!mo48684y(t2, i)) {
                        break;
                    } else {
                        l99.m47690h(t, j, l99.m47684b(t2, j));
                        mo48665F(t, i);
                        break;
                    }
                case 16:
                    if (!mo48684y(t2, i)) {
                        break;
                    } else {
                        l99.m47691i(t, j, l99.m47697o(t2, j));
                        mo48665F(t, i);
                        break;
                    }
                case 17:
                    mo48682v(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f34848n.mo42738b(t, t2, j);
                    break;
                case 50:
                    i79.m45567o(this.f34851q, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!mo48685z(t2, i2, i)) {
                        break;
                    } else {
                        l99.m47692j(t, j, l99.m47673F(t2, j));
                        mo48666G(t, i2, i);
                        break;
                    }
                case 60:
                    mo48667H(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!mo48685z(t2, i2, i)) {
                        break;
                    } else {
                        l99.m47692j(t, j, l99.m47673F(t2, j));
                        mo48666G(t, i2, i);
                        break;
                    }
                case 68:
                    mo48667H(t, t2, i);
                    break;
            }
        }
        i79.m45568p(this.f34849o, t, t2);
        if (this.f34840f) {
            i79.m45566n(this.f34850p, t, t2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x031a, code lost:
        if (r0 == r15) goto L_0x033f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x033d, code lost:
        if (r0 == r15) goto L_0x033f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x033f, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01bf, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0225, code lost:
        r6 = r6 | r23;
        r9 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x022a, code lost:
        r2 = r5;
        r29 = r7;
        r18 = r10;
        r7 = r20;
        r20 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02d1, code lost:
        if (r0 == r15) goto L_0x033f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31208d(T r31, byte[] r32, int r33, int r34, p000.uw8 r35) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            boolean r0 = r15.f34842h
            if (r0 == 0) goto L_0x0383
            sun.misc.Unsafe r9 = f34834s
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r7 = r8
            r1 = r10
            r2 = r16
            r6 = r2
        L_0x001d:
            if (r0 >= r13) goto L_0x0368
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002f
            int r0 = com.google.android.gms.internal.vision.C4144z.m34326d(r0, r12, r3, r11)
            int r3 = r11.f34743a
            r4 = r0
            r17 = r3
            goto L_0x0032
        L_0x002f:
            r17 = r0
            r4 = r3
        L_0x0032:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x003f
            int r2 = r2 / 3
            int r0 = r15.mo48674i(r5, r2)
            goto L_0x0043
        L_0x003f:
            int r0 = r15.mo48673S(r5)
        L_0x0043:
            r2 = r0
            if (r2 != r10) goto L_0x0051
            r2 = r4
            r25 = r5
            r29 = r9
            r20 = r10
            r18 = r16
            goto L_0x0341
        L_0x0051:
            int[] r0 = r15.f34835a
            int r1 = r2 + 1
            r1 = r0[r1]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r1 & r18
            int r10 = r18 >>> 20
            r33 = r5
            r5 = r1 & r8
            r18 = r9
            long r8 = (long) r5
            r5 = 17
            r21 = r1
            if (r10 > r5) goto L_0x0235
            int r5 = r2 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r1 = 1
            int r23 = r1 << r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            r20 = r2
            if (r0 == r7) goto L_0x0091
            if (r7 == r5) goto L_0x0084
            long r1 = (long) r7
            r7 = r18
            r7.putInt(r14, r1, r6)
            goto L_0x0086
        L_0x0084:
            r7 = r18
        L_0x0086:
            if (r0 == r5) goto L_0x008e
            long r1 = (long) r0
            int r1 = r7.getInt(r14, r1)
            r6 = r1
        L_0x008e:
            r2 = r7
            r7 = r0
            goto L_0x0093
        L_0x0091:
            r2 = r18
        L_0x0093:
            r0 = 5
            switch(r10) {
                case 0: goto L_0x020f;
                case 1: goto L_0x01f9;
                case 2: goto L_0x01d8;
                case 3: goto L_0x01d8;
                case 4: goto L_0x01c2;
                case 5: goto L_0x01a1;
                case 6: goto L_0x018b;
                case 7: goto L_0x016b;
                case 8: goto L_0x0149;
                case 9: goto L_0x011d;
                case 10: goto L_0x0106;
                case 11: goto L_0x01c2;
                case 12: goto L_0x00f0;
                case 13: goto L_0x018b;
                case 14: goto L_0x01a1;
                case 15: goto L_0x00d6;
                case 16: goto L_0x00a3;
                default: goto L_0x0097;
            }
        L_0x0097:
            r25 = r33
            r26 = r5
            r10 = r20
            r5 = r4
            r20 = r7
            r7 = r2
            goto L_0x022a
        L_0x00a3:
            if (r3 != 0) goto L_0x00c9
            int r10 = com.google.android.gms.internal.vision.C4144z.m34333k(r12, r4, r11)
            long r0 = r11.f34744b
            long r17 = p000.yy8.m54916a(r0)
            r0 = r2
            r1 = r31
            r4 = r20
            r20 = r7
            r7 = r2
            r2 = r8
            r25 = r33
            r8 = r4
            r26 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r8
            r0 = r10
            goto L_0x027f
        L_0x00c9:
            r25 = r33
            r26 = r5
            r8 = r20
            r20 = r7
            r7 = r2
            r5 = r4
            r10 = r8
            goto L_0x022a
        L_0x00d6:
            r25 = r33
            r26 = r5
            r10 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x01bf
            int r0 = com.google.android.gms.internal.vision.C4144z.m34331i(r12, r4, r11)
            int r1 = r11.f34743a
            int r1 = p000.yy8.m54918d(r1)
            r7.putInt(r14, r8, r1)
            goto L_0x0225
        L_0x00f0:
            r25 = r33
            r26 = r5
            r10 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x01bf
            int r0 = com.google.android.gms.internal.vision.C4144z.m34331i(r12, r4, r11)
            int r1 = r11.f34743a
            r7.putInt(r14, r8, r1)
            goto L_0x0225
        L_0x0106:
            r25 = r33
            r26 = r5
            r10 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01bf
            int r0 = com.google.android.gms.internal.vision.C4144z.m34339q(r12, r4, r11)
            java.lang.Object r1 = r11.f34745c
            r7.putObject(r14, r8, r1)
            goto L_0x0225
        L_0x011d:
            r25 = r33
            r26 = r5
            r10 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01bf
            g79 r0 = r15.mo48681t(r10)
            int r0 = com.google.android.gms.internal.vision.C4144z.m34329g(r0, r12, r4, r13, r11)
            java.lang.Object r1 = r7.getObject(r14, r8)
            if (r1 != 0) goto L_0x013e
            java.lang.Object r1 = r11.f34745c
            r7.putObject(r14, r8, r1)
            goto L_0x0225
        L_0x013e:
            java.lang.Object r2 = r11.f34745c
            java.lang.Object r1 = p000.t19.m52048e(r1, r2)
            r7.putObject(r14, r8, r1)
            goto L_0x0225
        L_0x0149:
            r25 = r33
            r26 = r5
            r10 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01bf
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x0160
            int r0 = com.google.android.gms.internal.vision.C4144z.m34336n(r12, r4, r11)
            goto L_0x0164
        L_0x0160:
            int r0 = com.google.android.gms.internal.vision.C4144z.m34338p(r12, r4, r11)
        L_0x0164:
            java.lang.Object r1 = r11.f34745c
            r7.putObject(r14, r8, r1)
            goto L_0x0225
        L_0x016b:
            r25 = r33
            r26 = r5
            r10 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x01bf
            int r0 = com.google.android.gms.internal.vision.C4144z.m34333k(r12, r4, r11)
            long r1 = r11.f34744b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0184
            r1 = 1
            goto L_0x0186
        L_0x0184:
            r1 = r16
        L_0x0186:
            p000.l99.m47693k(r14, r8, r1)
            goto L_0x0225
        L_0x018b:
            r25 = r33
            r26 = r5
            r10 = r20
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01bf
            int r0 = com.google.android.gms.internal.vision.C4144z.m34330h(r12, r4)
            r7.putInt(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x0225
        L_0x01a1:
            r25 = r33
            r26 = r5
            r10 = r20
            r0 = 1
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01bf
            long r17 = com.google.android.gms.internal.vision.C4144z.m34334l(r12, r4)
            r0 = r7
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x0225
        L_0x01bf:
            r5 = r4
            goto L_0x022a
        L_0x01c2:
            r25 = r33
            r26 = r5
            r10 = r20
            r5 = r4
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x022a
            int r0 = com.google.android.gms.internal.vision.C4144z.m34331i(r12, r5, r11)
            int r1 = r11.f34743a
            r7.putInt(r14, r8, r1)
            goto L_0x0225
        L_0x01d8:
            r25 = r33
            r26 = r5
            r10 = r20
            r5 = r4
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x022a
            int r17 = com.google.android.gms.internal.vision.C4144z.m34333k(r12, r5, r11)
            long r4 = r11.f34744b
            r0 = r7
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            r0 = r17
            goto L_0x027f
        L_0x01f9:
            r25 = r33
            r26 = r5
            r10 = r20
            r5 = r4
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x022a
            float r0 = com.google.android.gms.internal.vision.C4144z.m34337o(r12, r5)
            p000.l99.m47689g(r14, r8, r0)
            int r0 = r5 + 4
            goto L_0x0225
        L_0x020f:
            r25 = r33
            r26 = r5
            r10 = r20
            r0 = 1
            r5 = r4
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x022a
            double r0 = com.google.android.gms.internal.vision.C4144z.m34335m(r12, r5)
            p000.l99.m47688f(r14, r8, r0)
            int r0 = r5 + 8
        L_0x0225:
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            goto L_0x027f
        L_0x022a:
            r2 = r5
            r29 = r7
            r18 = r10
            r7 = r20
            r20 = -1
            goto L_0x0341
        L_0x0235:
            r25 = r33
            r5 = r4
            r20 = r7
            r7 = r18
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            r0 = 27
            if (r10 != r0) goto L_0x0295
            r0 = 2
            if (r3 != r0) goto L_0x0288
            java.lang.Object r0 = r7.getObject(r14, r8)
            h29 r0 = (p000.h29) r0
            boolean r1 = r0.zza()
            if (r1 != 0) goto L_0x0265
            int r1 = r0.size()
            if (r1 != 0) goto L_0x025c
            r1 = 10
            goto L_0x025e
        L_0x025c:
            int r1 = r1 << 1
        L_0x025e:
            h29 r0 = r0.mo28813d(r1)
            r7.putObject(r14, r8, r0)
        L_0x0265:
            r8 = r0
            g79 r0 = r15.mo48681t(r4)
            r1 = r17
            r2 = r32
            r3 = r5
            r18 = r4
            r4 = r34
            r5 = r8
            r8 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.vision.C4144z.m34327e(r0, r1, r2, r3, r4, r5, r6)
            r9 = r7
            r6 = r8
            r2 = r18
        L_0x027f:
            r7 = r20
            r1 = r25
            r8 = r26
            r10 = -1
            goto L_0x001d
        L_0x0288:
            r18 = r4
            r15 = r5
            r27 = r6
            r29 = r7
            r28 = r20
            r20 = -1
            goto L_0x031d
        L_0x0295:
            r18 = r4
            r0 = 49
            if (r10 > r0) goto L_0x02eb
            r1 = r21
            long r1 = (long) r1
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r4 = r3
            r3 = r5
            r33 = r4
            r4 = r34
            r15 = r5
            r5 = r17
            r27 = r6
            r6 = r25
            r28 = r20
            r20 = r7
            r7 = r33
            r23 = r8
            r9 = r26
            r8 = r18
            r19 = r10
            r29 = r20
            r20 = -1
            r9 = r21
            r11 = r19
            r12 = r23
            r14 = r35
            int r0 = r0.mo48676k(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x02d5
            goto L_0x033f
        L_0x02d5:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r18
            r10 = r20
            r1 = r25
            r6 = r27
            r7 = r28
            goto L_0x0361
        L_0x02eb:
            r33 = r3
            r15 = r5
            r27 = r6
            r29 = r7
            r23 = r8
            r19 = r10
            r28 = r20
            r1 = r21
            r20 = -1
            r0 = 50
            r9 = r19
            if (r9 != r0) goto L_0x0323
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x031d
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r18
            r6 = r23
            r8 = r35
            int r0 = r0.mo48677l(r1, r2, r3, r4, r5, r6, r8)
            if (r0 != r15) goto L_0x02d5
            goto L_0x033f
        L_0x031d:
            r2 = r15
        L_0x031e:
            r6 = r27
            r7 = r28
            goto L_0x0341
        L_0x0323:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r25
            r10 = r23
            r12 = r18
            r13 = r35
            int r0 = r0.mo48675j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x02d5
        L_0x033f:
            r2 = r0
            goto L_0x031e
        L_0x0341:
            t89 r4 = m53240Q(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.vision.C4144z.m34325c(r0, r1, r2, r3, r4, r5)
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r18
            r10 = r20
            r1 = r25
        L_0x0361:
            r9 = r29
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x001d
        L_0x0368:
            r27 = r6
            r1 = r8
            r29 = r9
            if (r7 == r1) goto L_0x0379
            long r1 = (long) r7
            r3 = r31
            r6 = r27
            r4 = r29
            r4.putInt(r3, r1, r6)
        L_0x0379:
            r4 = r34
            if (r0 != r4) goto L_0x037e
            return
        L_0x037e:
            com.google.android.gms.internal.vision.zzjk r0 = com.google.android.gms.internal.vision.zzjk.zzg()
            throw r0
        L_0x0383:
            r4 = r13
            r3 = r14
            r5 = 0
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r6 = r35
            r0.mo48678m(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v59.mo31208d(java.lang.Object, byte[], int, int, uw8):void");
    }

    /* renamed from: e */
    public final boolean mo31209e(T t) {
        int i;
        int i2;
        boolean z;
        T t2 = t;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z2 = true;
            if (i5 < this.f34845k) {
                int i6 = this.f34844j[i5];
                int i7 = this.f34835a[i6];
                int M = mo48671M(i6);
                int i8 = this.f34835a[i6 + 2];
                int i9 = i8 & 1048575;
                int i10 = 1 << (i8 >>> 20);
                if (i9 != i3) {
                    if (i9 != 1048575) {
                        i4 = f34834s.getInt(t2, (long) i9);
                    }
                    i = i4;
                    i2 = i9;
                } else {
                    i2 = i3;
                    i = i4;
                }
                if ((268435456 & M) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && !mo48662A(t, i6, i2, i, i10)) {
                    return false;
                }
                int i11 = (267386880 & M) >>> 20;
                if (i11 != 9 && i11 != 17) {
                    if (i11 != 27) {
                        if (i11 == 60 || i11 == 68) {
                            if (mo48685z(t2, i7, i6) && !m53235B(t2, M, mo48681t(i6))) {
                                return false;
                            }
                        } else if (i11 != 49) {
                            if (i11 == 50 && !this.f34851q.mo29457a(l99.m47673F(t2, (long) (M & 1048575))).isEmpty()) {
                                this.f34851q.mo29461f(mo48664E(i6));
                                throw null;
                            }
                        }
                    }
                    List list = (List) l99.m47673F(t2, (long) (M & 1048575));
                    if (!list.isEmpty()) {
                        g79 t3 = mo48681t(i6);
                        int i12 = 0;
                        while (true) {
                            if (i12 >= list.size()) {
                                break;
                            } else if (!t3.mo31209e(list.get(i12))) {
                                z2 = false;
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                    if (!z2) {
                        return false;
                    }
                } else if (mo48662A(t, i6, i2, i, i10) && !m53235B(t2, M, mo48681t(i6))) {
                    return false;
                }
                i5++;
                i3 = i2;
                i4 = i;
            } else if (!this.f34840f || this.f34850p.mo31164c(t2).mo43447r()) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x072c, code lost:
        r8 = (r8 + r9) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x07f8, code lost:
        r5 = r5 + r4;
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x080a, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x080d, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0852, code lost:
        r5 = r5 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0900, code lost:
        r5 = r5 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0923, code lost:
        r3 = r3 + 3;
        r8 = r4;
        r11 = r10;
        r9 = r13;
        r7 = 1048575;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo31210f(T r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r0.f34842h
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 1
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x047d
            sun.misc.Unsafe r2 = f34834s
            r12 = r11
            r13 = r12
        L_0x0016:
            int[] r14 = r0.f34835a
            int r14 = r14.length
            if (r12 >= r14) goto L_0x0475
            int r14 = r0.mo48671M(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f34835a
            r3 = r3[r12]
            r14 = r14 & r7
            long r5 = (long) r14
            com.google.android.gms.internal.vision.zziv r14 = com.google.android.gms.internal.vision.zziv.DOUBLE_LIST_PACKED
            int r14 = r14.zza()
            if (r15 < r14) goto L_0x003f
            com.google.android.gms.internal.vision.zziv r14 = com.google.android.gms.internal.vision.zziv.SINT64_LIST_PACKED
            int r14 = r14.zza()
            if (r15 > r14) goto L_0x003f
            int[] r14 = r0.f34835a
            int r17 = r12 + 2
            r14 = r14[r17]
        L_0x003f:
            switch(r15) {
                case 0: goto L_0x0461;
                case 1: goto L_0x0455;
                case 2: goto L_0x0445;
                case 3: goto L_0x0435;
                case 4: goto L_0x0425;
                case 5: goto L_0x0419;
                case 6: goto L_0x040d;
                case 7: goto L_0x0401;
                case 8: goto L_0x03e3;
                case 9: goto L_0x03cf;
                case 10: goto L_0x03be;
                case 11: goto L_0x03af;
                case 12: goto L_0x03a0;
                case 13: goto L_0x0395;
                case 14: goto L_0x038a;
                case 15: goto L_0x037b;
                case 16: goto L_0x036c;
                case 17: goto L_0x0357;
                case 18: goto L_0x034c;
                case 19: goto L_0x0343;
                case 20: goto L_0x033a;
                case 21: goto L_0x0331;
                case 22: goto L_0x0328;
                case 23: goto L_0x031f;
                case 24: goto L_0x0316;
                case 25: goto L_0x030d;
                case 26: goto L_0x0304;
                case 27: goto L_0x02f7;
                case 28: goto L_0x02ee;
                case 29: goto L_0x02e5;
                case 30: goto L_0x02db;
                case 31: goto L_0x02d1;
                case 32: goto L_0x02c7;
                case 33: goto L_0x02bd;
                case 34: goto L_0x02b3;
                case 35: goto L_0x029b;
                case 36: goto L_0x0286;
                case 37: goto L_0x0271;
                case 38: goto L_0x025c;
                case 39: goto L_0x0247;
                case 40: goto L_0x0232;
                case 41: goto L_0x021c;
                case 42: goto L_0x0206;
                case 43: goto L_0x01f0;
                case 44: goto L_0x01da;
                case 45: goto L_0x01c4;
                case 46: goto L_0x01ae;
                case 47: goto L_0x0198;
                case 48: goto L_0x0182;
                case 49: goto L_0x0174;
                case 50: goto L_0x0164;
                case 51: goto L_0x0156;
                case 52: goto L_0x014a;
                case 53: goto L_0x013a;
                case 54: goto L_0x012a;
                case 55: goto L_0x011a;
                case 56: goto L_0x010e;
                case 57: goto L_0x0102;
                case 58: goto L_0x00f6;
                case 59: goto L_0x00d8;
                case 60: goto L_0x00c4;
                case 61: goto L_0x00b2;
                case 62: goto L_0x00a2;
                case 63: goto L_0x0092;
                case 64: goto L_0x0086;
                case 65: goto L_0x007a;
                case 66: goto L_0x006a;
                case 67: goto L_0x005a;
                case 68: goto L_0x0044;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x046f
        L_0x0044:
            boolean r14 = r0.mo48685z(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            java.lang.Object r5 = p000.l99.m47673F(r1, r5)
            k59 r5 = (p000.k59) r5
            g79 r6 = r0.mo48681t(r12)
            int r3 = com.google.android.gms.internal.vision.zzii.m34394U(r3, r5, r6)
            goto L_0x0354
        L_0x005a:
            boolean r14 = r0.mo48685z(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            long r5 = m53239P(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzii.m34409m0(r3, r5)
            goto L_0x0354
        L_0x006a:
            boolean r14 = r0.mo48685z(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            int r5 = m53238N(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzii.m34416t0(r3, r5)
            goto L_0x0354
        L_0x007a:
            boolean r5 = r0.mo48685z(r1, r3, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.zzii.m34417u0(r3, r9)
            goto L_0x0354
        L_0x0086:
            boolean r5 = r0.mo48685z(r1, r3, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.zzii.m34376A0(r3, r11)
            goto L_0x0354
        L_0x0092:
            boolean r14 = r0.mo48685z(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            int r5 = m53238N(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzii.m34380C0(r3, r5)
            goto L_0x0354
        L_0x00a2:
            boolean r14 = r0.mo48685z(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            int r5 = m53238N(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzii.m34412p0(r3, r5)
            goto L_0x0354
        L_0x00b2:
            boolean r14 = r0.mo48685z(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            java.lang.Object r5 = p000.l99.m47673F(r1, r5)
            com.google.android.gms.internal.vision.zzht r5 = (com.google.android.gms.internal.vision.zzht) r5
            int r3 = com.google.android.gms.internal.vision.zzii.m34393T(r3, r5)
            goto L_0x0354
        L_0x00c4:
            boolean r14 = r0.mo48685z(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            java.lang.Object r5 = p000.l99.m47673F(r1, r5)
            g79 r6 = r0.mo48681t(r12)
            int r3 = p000.i79.m45549a(r3, r5, r6)
            goto L_0x0354
        L_0x00d8:
            boolean r14 = r0.mo48685z(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            java.lang.Object r5 = p000.l99.m47673F(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.vision.zzht
            if (r6 == 0) goto L_0x00ee
            com.google.android.gms.internal.vision.zzht r5 = (com.google.android.gms.internal.vision.zzht) r5
            int r3 = com.google.android.gms.internal.vision.zzii.m34393T(r3, r5)
            goto L_0x0354
        L_0x00ee:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.vision.zzii.m34381D(r3, r5)
            goto L_0x0354
        L_0x00f6:
            boolean r5 = r0.mo48685z(r1, r3, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.zzii.m34387H(r3, r8)
            goto L_0x0354
        L_0x0102:
            boolean r5 = r0.mo48685z(r1, r3, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.zzii.m34420x0(r3, r11)
            goto L_0x0354
        L_0x010e:
            boolean r5 = r0.mo48685z(r1, r3, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.zzii.m34413q0(r3, r9)
            goto L_0x0354
        L_0x011a:
            boolean r14 = r0.mo48685z(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            int r5 = m53238N(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzii.m34408l0(r3, r5)
            goto L_0x0354
        L_0x012a:
            boolean r14 = r0.mo48685z(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            long r5 = m53239P(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzii.m34405h0(r3, r5)
            goto L_0x0354
        L_0x013a:
            boolean r14 = r0.mo48685z(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            long r5 = m53239P(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzii.m34397b0(r3, r5)
            goto L_0x0354
        L_0x014a:
            boolean r5 = r0.mo48685z(r1, r3, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.zzii.m34379C(r3, r4)
            goto L_0x0354
        L_0x0156:
            boolean r5 = r0.mo48685z(r1, r3, r12)
            if (r5 == 0) goto L_0x046f
            r5 = 0
            int r3 = com.google.android.gms.internal.vision.zzii.m34377B(r3, r5)
            goto L_0x0354
        L_0x0164:
            b59 r14 = r0.f34851q
            java.lang.Object r5 = p000.l99.m47673F(r1, r5)
            java.lang.Object r6 = r0.mo48664E(r12)
            int r3 = r14.mo29464i(r3, r5, r6)
            goto L_0x0354
        L_0x0174:
            java.util.List r5 = m53244r(r1, r5)
            g79 r6 = r0.mo48681t(r12)
            int r3 = p000.i79.m45571s(r3, r5, r6)
            goto L_0x0354
        L_0x0182:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.i79.m45523A(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.zzii.m34404g0(r3)
            int r6 = com.google.android.gms.internal.vision.zzii.m34411o0(r5)
            goto L_0x02af
        L_0x0198:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.i79.m45538P(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.zzii.m34404g0(r3)
            int r6 = com.google.android.gms.internal.vision.zzii.m34411o0(r5)
            goto L_0x02af
        L_0x01ae:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.i79.m45544V(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.zzii.m34404g0(r3)
            int r6 = com.google.android.gms.internal.vision.zzii.m34411o0(r5)
            goto L_0x02af
        L_0x01c4:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.i79.m45541S(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.zzii.m34404g0(r3)
            int r6 = com.google.android.gms.internal.vision.zzii.m34411o0(r5)
            goto L_0x02af
        L_0x01da:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.i79.m45527E(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.zzii.m34404g0(r3)
            int r6 = com.google.android.gms.internal.vision.zzii.m34411o0(r5)
            goto L_0x02af
        L_0x01f0:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.i79.m45535M(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.zzii.m34404g0(r3)
            int r6 = com.google.android.gms.internal.vision.zzii.m34411o0(r5)
            goto L_0x02af
        L_0x0206:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.i79.m45547Y(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.zzii.m34404g0(r3)
            int r6 = com.google.android.gms.internal.vision.zzii.m34411o0(r5)
            goto L_0x02af
        L_0x021c:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.i79.m45541S(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.zzii.m34404g0(r3)
            int r6 = com.google.android.gms.internal.vision.zzii.m34411o0(r5)
            goto L_0x02af
        L_0x0232:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.i79.m45544V(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.zzii.m34404g0(r3)
            int r6 = com.google.android.gms.internal.vision.zzii.m34411o0(r5)
            goto L_0x02af
        L_0x0247:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.i79.m45531I(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.zzii.m34404g0(r3)
            int r6 = com.google.android.gms.internal.vision.zzii.m34411o0(r5)
            goto L_0x02af
        L_0x025c:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.i79.m45573u(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.zzii.m34404g0(r3)
            int r6 = com.google.android.gms.internal.vision.zzii.m34411o0(r5)
            goto L_0x02af
        L_0x0271:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.i79.m45557e(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.zzii.m34404g0(r3)
            int r6 = com.google.android.gms.internal.vision.zzii.m34411o0(r5)
            goto L_0x02af
        L_0x0286:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.i79.m45541S(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.zzii.m34404g0(r3)
            int r6 = com.google.android.gms.internal.vision.zzii.m34411o0(r5)
            goto L_0x02af
        L_0x029b:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.i79.m45544V(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.zzii.m34404g0(r3)
            int r6 = com.google.android.gms.internal.vision.zzii.m34411o0(r5)
        L_0x02af:
            int r3 = r3 + r6
            int r3 = r3 + r5
            goto L_0x0354
        L_0x02b3:
            java.util.List r5 = m53244r(r1, r5)
            int r3 = p000.i79.m45578z(r3, r5, r11)
            goto L_0x0354
        L_0x02bd:
            java.util.List r5 = m53244r(r1, r5)
            int r3 = p000.i79.m45537O(r3, r5, r11)
            goto L_0x0354
        L_0x02c7:
            java.util.List r5 = m53244r(r1, r5)
            int r3 = p000.i79.m45543U(r3, r5, r11)
            goto L_0x0354
        L_0x02d1:
            java.util.List r5 = m53244r(r1, r5)
            int r3 = p000.i79.m45540R(r3, r5, r11)
            goto L_0x0354
        L_0x02db:
            java.util.List r5 = m53244r(r1, r5)
            int r3 = p000.i79.m45526D(r3, r5, r11)
            goto L_0x0354
        L_0x02e5:
            java.util.List r5 = m53244r(r1, r5)
            int r3 = p000.i79.m45534L(r3, r5, r11)
            goto L_0x0354
        L_0x02ee:
            java.util.List r5 = m53244r(r1, r5)
            int r3 = p000.i79.m45570r(r3, r5)
            goto L_0x0354
        L_0x02f7:
            java.util.List r5 = m53244r(r1, r5)
            g79 r6 = r0.mo48681t(r12)
            int r3 = p000.i79.m45553c(r3, r5, r6)
            goto L_0x0354
        L_0x0304:
            java.util.List r5 = m53244r(r1, r5)
            int r3 = p000.i79.m45551b(r3, r5)
            goto L_0x0354
        L_0x030d:
            java.util.List r5 = m53244r(r1, r5)
            int r3 = p000.i79.m45546X(r3, r5, r11)
            goto L_0x0354
        L_0x0316:
            java.util.List r5 = m53244r(r1, r5)
            int r3 = p000.i79.m45540R(r3, r5, r11)
            goto L_0x0354
        L_0x031f:
            java.util.List r5 = m53244r(r1, r5)
            int r3 = p000.i79.m45543U(r3, r5, r11)
            goto L_0x0354
        L_0x0328:
            java.util.List r5 = m53244r(r1, r5)
            int r3 = p000.i79.m45530H(r3, r5, r11)
            goto L_0x0354
        L_0x0331:
            java.util.List r5 = m53244r(r1, r5)
            int r3 = p000.i79.m45572t(r3, r5, r11)
            goto L_0x0354
        L_0x033a:
            java.util.List r5 = m53244r(r1, r5)
            int r3 = p000.i79.m45555d(r3, r5, r11)
            goto L_0x0354
        L_0x0343:
            java.util.List r5 = m53244r(r1, r5)
            int r3 = p000.i79.m45540R(r3, r5, r11)
            goto L_0x0354
        L_0x034c:
            java.util.List r5 = m53244r(r1, r5)
            int r3 = p000.i79.m45543U(r3, r5, r11)
        L_0x0354:
            int r13 = r13 + r3
            goto L_0x046f
        L_0x0357:
            boolean r14 = r0.mo48684y(r1, r12)
            if (r14 == 0) goto L_0x046f
            java.lang.Object r5 = p000.l99.m47673F(r1, r5)
            k59 r5 = (p000.k59) r5
            g79 r6 = r0.mo48681t(r12)
            int r3 = com.google.android.gms.internal.vision.zzii.m34394U(r3, r5, r6)
            goto L_0x0354
        L_0x036c:
            boolean r14 = r0.mo48684y(r1, r12)
            if (r14 == 0) goto L_0x046f
            long r5 = p000.l99.m47697o(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzii.m34409m0(r3, r5)
            goto L_0x0354
        L_0x037b:
            boolean r14 = r0.mo48684y(r1, r12)
            if (r14 == 0) goto L_0x046f
            int r5 = p000.l99.m47684b(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzii.m34416t0(r3, r5)
            goto L_0x0354
        L_0x038a:
            boolean r5 = r0.mo48684y(r1, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.zzii.m34417u0(r3, r9)
            goto L_0x0354
        L_0x0395:
            boolean r5 = r0.mo48684y(r1, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.zzii.m34376A0(r3, r11)
            goto L_0x0354
        L_0x03a0:
            boolean r14 = r0.mo48684y(r1, r12)
            if (r14 == 0) goto L_0x046f
            int r5 = p000.l99.m47684b(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzii.m34380C0(r3, r5)
            goto L_0x0354
        L_0x03af:
            boolean r14 = r0.mo48684y(r1, r12)
            if (r14 == 0) goto L_0x046f
            int r5 = p000.l99.m47684b(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzii.m34412p0(r3, r5)
            goto L_0x0354
        L_0x03be:
            boolean r14 = r0.mo48684y(r1, r12)
            if (r14 == 0) goto L_0x046f
            java.lang.Object r5 = p000.l99.m47673F(r1, r5)
            com.google.android.gms.internal.vision.zzht r5 = (com.google.android.gms.internal.vision.zzht) r5
            int r3 = com.google.android.gms.internal.vision.zzii.m34393T(r3, r5)
            goto L_0x0354
        L_0x03cf:
            boolean r14 = r0.mo48684y(r1, r12)
            if (r14 == 0) goto L_0x046f
            java.lang.Object r5 = p000.l99.m47673F(r1, r5)
            g79 r6 = r0.mo48681t(r12)
            int r3 = p000.i79.m45549a(r3, r5, r6)
            goto L_0x0354
        L_0x03e3:
            boolean r14 = r0.mo48684y(r1, r12)
            if (r14 == 0) goto L_0x046f
            java.lang.Object r5 = p000.l99.m47673F(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.vision.zzht
            if (r6 == 0) goto L_0x03f9
            com.google.android.gms.internal.vision.zzht r5 = (com.google.android.gms.internal.vision.zzht) r5
            int r3 = com.google.android.gms.internal.vision.zzii.m34393T(r3, r5)
            goto L_0x0354
        L_0x03f9:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.vision.zzii.m34381D(r3, r5)
            goto L_0x0354
        L_0x0401:
            boolean r5 = r0.mo48684y(r1, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.zzii.m34387H(r3, r8)
            goto L_0x0354
        L_0x040d:
            boolean r5 = r0.mo48684y(r1, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.zzii.m34420x0(r3, r11)
            goto L_0x0354
        L_0x0419:
            boolean r5 = r0.mo48684y(r1, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.zzii.m34413q0(r3, r9)
            goto L_0x0354
        L_0x0425:
            boolean r14 = r0.mo48684y(r1, r12)
            if (r14 == 0) goto L_0x046f
            int r5 = p000.l99.m47684b(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzii.m34408l0(r3, r5)
            goto L_0x0354
        L_0x0435:
            boolean r14 = r0.mo48684y(r1, r12)
            if (r14 == 0) goto L_0x046f
            long r5 = p000.l99.m47697o(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzii.m34405h0(r3, r5)
            goto L_0x0354
        L_0x0445:
            boolean r14 = r0.mo48684y(r1, r12)
            if (r14 == 0) goto L_0x046f
            long r5 = p000.l99.m47697o(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzii.m34397b0(r3, r5)
            goto L_0x0354
        L_0x0455:
            boolean r5 = r0.mo48684y(r1, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.zzii.m34379C(r3, r4)
            goto L_0x0354
        L_0x0461:
            boolean r5 = r0.mo48684y(r1, r12)
            if (r5 == 0) goto L_0x046f
            r5 = 0
            int r3 = com.google.android.gms.internal.vision.zzii.m34377B(r3, r5)
            goto L_0x0354
        L_0x046f:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x0475:
            o89<?, ?> r2 = r0.f34849o
            int r1 = m53242n(r2, r1)
            int r13 = r13 + r1
            return r13
        L_0x047d:
            sun.misc.Unsafe r2 = f34834s
            r6 = r7
            r3 = r11
            r5 = r3
            r12 = r5
        L_0x0483:
            int[] r13 = r0.f34835a
            int r13 = r13.length
            if (r3 >= r13) goto L_0x092e
            int r13 = r0.mo48671M(r3)
            int[] r14 = r0.f34835a
            r15 = r14[r3]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r13 & r16
            int r4 = r17 >>> 20
            r11 = 17
            if (r4 > r11) goto L_0x04ae
            int r11 = r3 + 2
            r11 = r14[r11]
            r14 = r11 & r7
            int r11 = r11 >>> 20
            int r11 = r8 << r11
            if (r14 == r6) goto L_0x04af
            long r8 = (long) r14
            int r6 = r2.getInt(r1, r8)
            r12 = r6
            r6 = r14
            goto L_0x04af
        L_0x04ae:
            r11 = 0
        L_0x04af:
            r8 = r13 & r7
            long r8 = (long) r8
            switch(r4) {
                case 0: goto L_0x0913;
                case 1: goto L_0x0902;
                case 2: goto L_0x08f1;
                case 3: goto L_0x08e1;
                case 4: goto L_0x08d1;
                case 5: goto L_0x08c4;
                case 6: goto L_0x08b7;
                case 7: goto L_0x08ab;
                case 8: goto L_0x088f;
                case 9: goto L_0x087d;
                case 10: goto L_0x086e;
                case 11: goto L_0x0861;
                case 12: goto L_0x0854;
                case 13: goto L_0x0849;
                case 14: goto L_0x083e;
                case 15: goto L_0x0831;
                case 16: goto L_0x0824;
                case 17: goto L_0x0811;
                case 18: goto L_0x07fd;
                case 19: goto L_0x07ed;
                case 20: goto L_0x07e1;
                case 21: goto L_0x07d5;
                case 22: goto L_0x07c9;
                case 23: goto L_0x07bd;
                case 24: goto L_0x07b1;
                case 25: goto L_0x07a5;
                case 26: goto L_0x079a;
                case 27: goto L_0x078a;
                case 28: goto L_0x077e;
                case 29: goto L_0x0771;
                case 30: goto L_0x0764;
                case 31: goto L_0x0757;
                case 32: goto L_0x074a;
                case 33: goto L_0x073d;
                case 34: goto L_0x0730;
                case 35: goto L_0x0718;
                case 36: goto L_0x0703;
                case 37: goto L_0x06ee;
                case 38: goto L_0x06d9;
                case 39: goto L_0x06c4;
                case 40: goto L_0x06af;
                case 41: goto L_0x0699;
                case 42: goto L_0x0683;
                case 43: goto L_0x066d;
                case 44: goto L_0x0657;
                case 45: goto L_0x0641;
                case 46: goto L_0x062b;
                case 47: goto L_0x0615;
                case 48: goto L_0x05ff;
                case 49: goto L_0x05ef;
                case 50: goto L_0x05df;
                case 51: goto L_0x05d1;
                case 52: goto L_0x05c4;
                case 53: goto L_0x05b4;
                case 54: goto L_0x05a4;
                case 55: goto L_0x0594;
                case 56: goto L_0x0586;
                case 57: goto L_0x0579;
                case 58: goto L_0x056c;
                case 59: goto L_0x054e;
                case 60: goto L_0x053a;
                case 61: goto L_0x0528;
                case 62: goto L_0x0518;
                case 63: goto L_0x0508;
                case 64: goto L_0x04fb;
                case 65: goto L_0x04ed;
                case 66: goto L_0x04dd;
                case 67: goto L_0x04cd;
                case 68: goto L_0x04b7;
                default: goto L_0x04b5;
            }
        L_0x04b5:
            goto L_0x0809
        L_0x04b7:
            boolean r4 = r0.mo48685z(r1, r15, r3)
            if (r4 == 0) goto L_0x0809
            java.lang.Object r4 = r2.getObject(r1, r8)
            k59 r4 = (p000.k59) r4
            g79 r8 = r0.mo48681t(r3)
            int r4 = com.google.android.gms.internal.vision.zzii.m34394U(r15, r4, r8)
            goto L_0x0808
        L_0x04cd:
            boolean r4 = r0.mo48685z(r1, r15, r3)
            if (r4 == 0) goto L_0x0809
            long r8 = m53239P(r1, r8)
            int r4 = com.google.android.gms.internal.vision.zzii.m34409m0(r15, r8)
            goto L_0x0808
        L_0x04dd:
            boolean r4 = r0.mo48685z(r1, r15, r3)
            if (r4 == 0) goto L_0x0809
            int r4 = m53238N(r1, r8)
            int r4 = com.google.android.gms.internal.vision.zzii.m34416t0(r15, r4)
            goto L_0x0808
        L_0x04ed:
            boolean r4 = r0.mo48685z(r1, r15, r3)
            if (r4 == 0) goto L_0x0809
            r8 = 0
            int r4 = com.google.android.gms.internal.vision.zzii.m34417u0(r15, r8)
            goto L_0x0808
        L_0x04fb:
            boolean r4 = r0.mo48685z(r1, r15, r3)
            if (r4 == 0) goto L_0x0809
            r4 = 0
            int r8 = com.google.android.gms.internal.vision.zzii.m34376A0(r15, r4)
            goto L_0x0852
        L_0x0508:
            boolean r4 = r0.mo48685z(r1, r15, r3)
            if (r4 == 0) goto L_0x0809
            int r4 = m53238N(r1, r8)
            int r4 = com.google.android.gms.internal.vision.zzii.m34380C0(r15, r4)
            goto L_0x0808
        L_0x0518:
            boolean r4 = r0.mo48685z(r1, r15, r3)
            if (r4 == 0) goto L_0x0809
            int r4 = m53238N(r1, r8)
            int r4 = com.google.android.gms.internal.vision.zzii.m34412p0(r15, r4)
            goto L_0x0808
        L_0x0528:
            boolean r4 = r0.mo48685z(r1, r15, r3)
            if (r4 == 0) goto L_0x0809
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.vision.zzht r4 = (com.google.android.gms.internal.vision.zzht) r4
            int r4 = com.google.android.gms.internal.vision.zzii.m34393T(r15, r4)
            goto L_0x0808
        L_0x053a:
            boolean r4 = r0.mo48685z(r1, r15, r3)
            if (r4 == 0) goto L_0x0809
            java.lang.Object r4 = r2.getObject(r1, r8)
            g79 r8 = r0.mo48681t(r3)
            int r4 = p000.i79.m45549a(r15, r4, r8)
            goto L_0x0808
        L_0x054e:
            boolean r4 = r0.mo48685z(r1, r15, r3)
            if (r4 == 0) goto L_0x0809
            java.lang.Object r4 = r2.getObject(r1, r8)
            boolean r8 = r4 instanceof com.google.android.gms.internal.vision.zzht
            if (r8 == 0) goto L_0x0564
            com.google.android.gms.internal.vision.zzht r4 = (com.google.android.gms.internal.vision.zzht) r4
            int r4 = com.google.android.gms.internal.vision.zzii.m34393T(r15, r4)
            goto L_0x0808
        L_0x0564:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.vision.zzii.m34381D(r15, r4)
            goto L_0x0808
        L_0x056c:
            boolean r4 = r0.mo48685z(r1, r15, r3)
            if (r4 == 0) goto L_0x0809
            r4 = 1
            int r8 = com.google.android.gms.internal.vision.zzii.m34387H(r15, r4)
            goto L_0x0852
        L_0x0579:
            boolean r4 = r0.mo48685z(r1, r15, r3)
            if (r4 == 0) goto L_0x0809
            r4 = 0
            int r8 = com.google.android.gms.internal.vision.zzii.m34420x0(r15, r4)
            goto L_0x0852
        L_0x0586:
            boolean r4 = r0.mo48685z(r1, r15, r3)
            if (r4 == 0) goto L_0x0809
            r8 = 0
            int r4 = com.google.android.gms.internal.vision.zzii.m34413q0(r15, r8)
            goto L_0x0808
        L_0x0594:
            boolean r4 = r0.mo48685z(r1, r15, r3)
            if (r4 == 0) goto L_0x0809
            int r4 = m53238N(r1, r8)
            int r4 = com.google.android.gms.internal.vision.zzii.m34408l0(r15, r4)
            goto L_0x0808
        L_0x05a4:
            boolean r4 = r0.mo48685z(r1, r15, r3)
            if (r4 == 0) goto L_0x0809
            long r8 = m53239P(r1, r8)
            int r4 = com.google.android.gms.internal.vision.zzii.m34405h0(r15, r8)
            goto L_0x0808
        L_0x05b4:
            boolean r4 = r0.mo48685z(r1, r15, r3)
            if (r4 == 0) goto L_0x0809
            long r8 = m53239P(r1, r8)
            int r4 = com.google.android.gms.internal.vision.zzii.m34397b0(r15, r8)
            goto L_0x0808
        L_0x05c4:
            boolean r4 = r0.mo48685z(r1, r15, r3)
            if (r4 == 0) goto L_0x0809
            r4 = 0
            int r8 = com.google.android.gms.internal.vision.zzii.m34379C(r15, r4)
            goto L_0x0852
        L_0x05d1:
            boolean r4 = r0.mo48685z(r1, r15, r3)
            if (r4 == 0) goto L_0x0809
            r8 = 0
            int r4 = com.google.android.gms.internal.vision.zzii.m34377B(r15, r8)
            goto L_0x0808
        L_0x05df:
            b59 r4 = r0.f34851q
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.lang.Object r9 = r0.mo48664E(r3)
            int r4 = r4.mo29464i(r15, r8, r9)
            goto L_0x0808
        L_0x05ef:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            g79 r8 = r0.mo48681t(r3)
            int r4 = p000.i79.m45571s(r15, r4, r8)
            goto L_0x0808
        L_0x05ff:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45523A(r4)
            if (r4 <= 0) goto L_0x0809
            int r8 = com.google.android.gms.internal.vision.zzii.m34404g0(r15)
            int r9 = com.google.android.gms.internal.vision.zzii.m34411o0(r4)
            goto L_0x072c
        L_0x0615:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45538P(r4)
            if (r4 <= 0) goto L_0x0809
            int r8 = com.google.android.gms.internal.vision.zzii.m34404g0(r15)
            int r9 = com.google.android.gms.internal.vision.zzii.m34411o0(r4)
            goto L_0x072c
        L_0x062b:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45544V(r4)
            if (r4 <= 0) goto L_0x0809
            int r8 = com.google.android.gms.internal.vision.zzii.m34404g0(r15)
            int r9 = com.google.android.gms.internal.vision.zzii.m34411o0(r4)
            goto L_0x072c
        L_0x0641:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45541S(r4)
            if (r4 <= 0) goto L_0x0809
            int r8 = com.google.android.gms.internal.vision.zzii.m34404g0(r15)
            int r9 = com.google.android.gms.internal.vision.zzii.m34411o0(r4)
            goto L_0x072c
        L_0x0657:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45527E(r4)
            if (r4 <= 0) goto L_0x0809
            int r8 = com.google.android.gms.internal.vision.zzii.m34404g0(r15)
            int r9 = com.google.android.gms.internal.vision.zzii.m34411o0(r4)
            goto L_0x072c
        L_0x066d:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45535M(r4)
            if (r4 <= 0) goto L_0x0809
            int r8 = com.google.android.gms.internal.vision.zzii.m34404g0(r15)
            int r9 = com.google.android.gms.internal.vision.zzii.m34411o0(r4)
            goto L_0x072c
        L_0x0683:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45547Y(r4)
            if (r4 <= 0) goto L_0x0809
            int r8 = com.google.android.gms.internal.vision.zzii.m34404g0(r15)
            int r9 = com.google.android.gms.internal.vision.zzii.m34411o0(r4)
            goto L_0x072c
        L_0x0699:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45541S(r4)
            if (r4 <= 0) goto L_0x0809
            int r8 = com.google.android.gms.internal.vision.zzii.m34404g0(r15)
            int r9 = com.google.android.gms.internal.vision.zzii.m34411o0(r4)
            goto L_0x072c
        L_0x06af:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45544V(r4)
            if (r4 <= 0) goto L_0x0809
            int r8 = com.google.android.gms.internal.vision.zzii.m34404g0(r15)
            int r9 = com.google.android.gms.internal.vision.zzii.m34411o0(r4)
            goto L_0x072c
        L_0x06c4:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45531I(r4)
            if (r4 <= 0) goto L_0x0809
            int r8 = com.google.android.gms.internal.vision.zzii.m34404g0(r15)
            int r9 = com.google.android.gms.internal.vision.zzii.m34411o0(r4)
            goto L_0x072c
        L_0x06d9:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45573u(r4)
            if (r4 <= 0) goto L_0x0809
            int r8 = com.google.android.gms.internal.vision.zzii.m34404g0(r15)
            int r9 = com.google.android.gms.internal.vision.zzii.m34411o0(r4)
            goto L_0x072c
        L_0x06ee:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45557e(r4)
            if (r4 <= 0) goto L_0x0809
            int r8 = com.google.android.gms.internal.vision.zzii.m34404g0(r15)
            int r9 = com.google.android.gms.internal.vision.zzii.m34411o0(r4)
            goto L_0x072c
        L_0x0703:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45541S(r4)
            if (r4 <= 0) goto L_0x0809
            int r8 = com.google.android.gms.internal.vision.zzii.m34404g0(r15)
            int r9 = com.google.android.gms.internal.vision.zzii.m34411o0(r4)
            goto L_0x072c
        L_0x0718:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45544V(r4)
            if (r4 <= 0) goto L_0x0809
            int r8 = com.google.android.gms.internal.vision.zzii.m34404g0(r15)
            int r9 = com.google.android.gms.internal.vision.zzii.m34411o0(r4)
        L_0x072c:
            int r8 = r8 + r9
            int r8 = r8 + r4
            goto L_0x0852
        L_0x0730:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            int r4 = p000.i79.m45578z(r15, r4, r10)
            goto L_0x07f8
        L_0x073d:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45537O(r15, r4, r10)
            goto L_0x07f8
        L_0x074a:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45543U(r15, r4, r10)
            goto L_0x07f8
        L_0x0757:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45540R(r15, r4, r10)
            goto L_0x07f8
        L_0x0764:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45526D(r15, r4, r10)
            goto L_0x07f8
        L_0x0771:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45534L(r15, r4, r10)
            goto L_0x0808
        L_0x077e:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45570r(r15, r4)
            goto L_0x0808
        L_0x078a:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            g79 r8 = r0.mo48681t(r3)
            int r4 = p000.i79.m45553c(r15, r4, r8)
            goto L_0x0808
        L_0x079a:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45551b(r15, r4)
            goto L_0x0808
        L_0x07a5:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            int r4 = p000.i79.m45546X(r15, r4, r10)
            goto L_0x07f8
        L_0x07b1:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45540R(r15, r4, r10)
            goto L_0x07f8
        L_0x07bd:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45543U(r15, r4, r10)
            goto L_0x07f8
        L_0x07c9:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45530H(r15, r4, r10)
            goto L_0x07f8
        L_0x07d5:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45572t(r15, r4, r10)
            goto L_0x07f8
        L_0x07e1:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45555d(r15, r4, r10)
            goto L_0x07f8
        L_0x07ed:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45540R(r15, r4, r10)
        L_0x07f8:
            int r5 = r5 + r4
            r4 = 1
        L_0x07fa:
            r7 = 0
            goto L_0x080d
        L_0x07fd:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.i79.m45543U(r15, r4, r10)
        L_0x0808:
            int r5 = r5 + r4
        L_0x0809:
            r4 = 1
        L_0x080a:
            r7 = 0
            r10 = 0
        L_0x080d:
            r13 = 0
            goto L_0x0923
        L_0x0811:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0809
            java.lang.Object r4 = r2.getObject(r1, r8)
            k59 r4 = (p000.k59) r4
            g79 r8 = r0.mo48681t(r3)
            int r4 = com.google.android.gms.internal.vision.zzii.m34394U(r15, r4, r8)
            goto L_0x0808
        L_0x0824:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0809
            long r8 = r2.getLong(r1, r8)
            int r4 = com.google.android.gms.internal.vision.zzii.m34409m0(r15, r8)
            goto L_0x0808
        L_0x0831:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0809
            int r4 = r2.getInt(r1, r8)
            int r4 = com.google.android.gms.internal.vision.zzii.m34416t0(r15, r4)
            goto L_0x0808
        L_0x083e:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0809
            r8 = 0
            int r4 = com.google.android.gms.internal.vision.zzii.m34417u0(r15, r8)
            goto L_0x0808
        L_0x0849:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0809
            r4 = 0
            int r8 = com.google.android.gms.internal.vision.zzii.m34376A0(r15, r4)
        L_0x0852:
            int r5 = r5 + r8
            goto L_0x0809
        L_0x0854:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0809
            int r4 = r2.getInt(r1, r8)
            int r4 = com.google.android.gms.internal.vision.zzii.m34380C0(r15, r4)
            goto L_0x0808
        L_0x0861:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0809
            int r4 = r2.getInt(r1, r8)
            int r4 = com.google.android.gms.internal.vision.zzii.m34412p0(r15, r4)
            goto L_0x0808
        L_0x086e:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0809
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.vision.zzht r4 = (com.google.android.gms.internal.vision.zzht) r4
            int r4 = com.google.android.gms.internal.vision.zzii.m34393T(r15, r4)
            goto L_0x0808
        L_0x087d:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0809
            java.lang.Object r4 = r2.getObject(r1, r8)
            g79 r8 = r0.mo48681t(r3)
            int r4 = p000.i79.m45549a(r15, r4, r8)
            goto L_0x0808
        L_0x088f:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0809
            java.lang.Object r4 = r2.getObject(r1, r8)
            boolean r8 = r4 instanceof com.google.android.gms.internal.vision.zzht
            if (r8 == 0) goto L_0x08a3
            com.google.android.gms.internal.vision.zzht r4 = (com.google.android.gms.internal.vision.zzht) r4
            int r4 = com.google.android.gms.internal.vision.zzii.m34393T(r15, r4)
            goto L_0x0808
        L_0x08a3:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.vision.zzii.m34381D(r15, r4)
            goto L_0x0808
        L_0x08ab:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0809
            r4 = 1
            int r8 = com.google.android.gms.internal.vision.zzii.m34387H(r15, r4)
            int r5 = r5 + r8
            goto L_0x080a
        L_0x08b7:
            r4 = 1
            r8 = r12 & r11
            r10 = 0
            if (r8 == 0) goto L_0x07fa
            int r8 = com.google.android.gms.internal.vision.zzii.m34420x0(r15, r10)
            int r5 = r5 + r8
            goto L_0x07fa
        L_0x08c4:
            r4 = 1
            r10 = 0
            r8 = r12 & r11
            r13 = 0
            if (r8 == 0) goto L_0x0910
            int r8 = com.google.android.gms.internal.vision.zzii.m34413q0(r15, r13)
            goto L_0x0900
        L_0x08d1:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r11 & r12
            if (r11 == 0) goto L_0x0910
            int r8 = r2.getInt(r1, r8)
            int r8 = com.google.android.gms.internal.vision.zzii.m34408l0(r15, r8)
            goto L_0x0900
        L_0x08e1:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r11 & r12
            if (r11 == 0) goto L_0x0910
            long r8 = r2.getLong(r1, r8)
            int r8 = com.google.android.gms.internal.vision.zzii.m34405h0(r15, r8)
            goto L_0x0900
        L_0x08f1:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r11 & r12
            if (r11 == 0) goto L_0x0910
            long r8 = r2.getLong(r1, r8)
            int r8 = com.google.android.gms.internal.vision.zzii.m34397b0(r15, r8)
        L_0x0900:
            int r5 = r5 + r8
            goto L_0x0910
        L_0x0902:
            r4 = 1
            r10 = 0
            r13 = 0
            r8 = r12 & r11
            if (r8 == 0) goto L_0x0910
            r8 = 0
            int r9 = com.google.android.gms.internal.vision.zzii.m34379C(r15, r8)
            int r5 = r5 + r9
        L_0x0910:
            r7 = 0
            goto L_0x0923
        L_0x0913:
            r4 = 1
            r8 = 0
            r10 = 0
            r13 = 0
            r9 = r12 & r11
            if (r9 == 0) goto L_0x0910
            r7 = 0
            int r11 = com.google.android.gms.internal.vision.zzii.m34377B(r15, r7)
            int r5 = r5 + r11
        L_0x0923:
            int r3 = r3 + 3
            r8 = r4
            r11 = r10
            r9 = r13
            r4 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0483
        L_0x092e:
            r10 = r11
            o89<?, ?> r2 = r0.f34849o
            int r2 = m53242n(r2, r1)
            int r5 = r5 + r2
            boolean r2 = r0.f34840f
            if (r2 == 0) goto L_0x0988
            wz8<?> r2 = r0.f34850p
            i09 r1 = r2.mo31164c(r1)
            r11 = r10
        L_0x0941:
            o79<T, java.lang.Object> r2 = r1.f29780a
            int r2 = r2.mo46334j()
            if (r11 >= r2) goto L_0x0961
            o79<T, java.lang.Object> r2 = r1.f29780a
            java.util.Map$Entry r2 = r2.mo46331h(r11)
            java.lang.Object r3 = r2.getKey()
            n09 r3 = (p000.n09) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = p000.i09.m45432m(r3, r2)
            int r10 = r10 + r2
            int r11 = r11 + 1
            goto L_0x0941
        L_0x0961:
            o79<T, java.lang.Object> r1 = r1.f29780a
            java.lang.Iterable r1 = r1.mo46336m()
            java.util.Iterator r1 = r1.iterator()
        L_0x096b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0987
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            n09 r3 = (p000.n09) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = p000.i09.m45432m(r3, r2)
            int r10 = r10 + r2
            goto L_0x096b
        L_0x0987:
            int r5 = r5 + r10
        L_0x0988:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v59.mo31210f(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (p000.i79.m45569q(p000.l99.m47673F(r10, r6), p000.l99.m47673F(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (p000.l99.m47697o(r10, r6) == p000.l99.m47697o(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (p000.l99.m47684b(r10, r6) == p000.l99.m47684b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (p000.l99.m47697o(r10, r6) == p000.l99.m47697o(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (p000.l99.m47684b(r10, r6) == p000.l99.m47684b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (p000.l99.m47684b(r10, r6) == p000.l99.m47684b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (p000.l99.m47684b(r10, r6) == p000.l99.m47684b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (p000.i79.m45569q(p000.l99.m47673F(r10, r6), p000.l99.m47673F(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (p000.i79.m45569q(p000.l99.m47673F(r10, r6), p000.l99.m47673F(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (p000.i79.m45569q(p000.l99.m47673F(r10, r6), p000.l99.m47673F(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (p000.l99.m47705w(r10, r6) == p000.l99.m47705w(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (p000.l99.m47684b(r10, r6) == p000.l99.m47684b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (p000.l99.m47697o(r10, r6) == p000.l99.m47697o(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (p000.l99.m47684b(r10, r6) == p000.l99.m47684b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (p000.l99.m47697o(r10, r6) == p000.l99.m47697o(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (p000.l99.m47697o(r10, r6) == p000.l99.m47697o(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(p000.l99.m47706x(r10, r6)) == java.lang.Float.floatToIntBits(p000.l99.m47706x(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(p000.l99.m47670C(r10, r6)) == java.lang.Double.doubleToLongBits(p000.l99.m47670C(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (p000.i79.m45569q(p000.l99.m47673F(r10, r6), p000.l99.m47673F(r11, r6)) != false) goto L_0x01c2;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo31211g(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f34835a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01c9
            int r4 = r9.mo48671M(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01a7;
                case 1: goto L_0x018e;
                case 2: goto L_0x017b;
                case 3: goto L_0x0168;
                case 4: goto L_0x0157;
                case 5: goto L_0x0144;
                case 6: goto L_0x0132;
                case 7: goto L_0x0120;
                case 8: goto L_0x010a;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00de;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00ba;
                case 13: goto L_0x00a8;
                case 14: goto L_0x0094;
                case 15: goto L_0x0082;
                case 16: goto L_0x006e;
                case 17: goto L_0x0058;
                case 18: goto L_0x004a;
                case 19: goto L_0x004a;
                case 20: goto L_0x004a;
                case 21: goto L_0x004a;
                case 22: goto L_0x004a;
                case 23: goto L_0x004a;
                case 24: goto L_0x004a;
                case 25: goto L_0x004a;
                case 26: goto L_0x004a;
                case 27: goto L_0x004a;
                case 28: goto L_0x004a;
                case 29: goto L_0x004a;
                case 30: goto L_0x004a;
                case 31: goto L_0x004a;
                case 32: goto L_0x004a;
                case 33: goto L_0x004a;
                case 34: goto L_0x004a;
                case 35: goto L_0x004a;
                case 36: goto L_0x004a;
                case 37: goto L_0x004a;
                case 38: goto L_0x004a;
                case 39: goto L_0x004a;
                case 40: goto L_0x004a;
                case 41: goto L_0x004a;
                case 42: goto L_0x004a;
                case 43: goto L_0x004a;
                case 44: goto L_0x004a;
                case 45: goto L_0x004a;
                case 46: goto L_0x004a;
                case 47: goto L_0x004a;
                case 48: goto L_0x004a;
                case 49: goto L_0x004a;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01c2
        L_0x001c:
            int r4 = r9.mo48672O(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = p000.l99.m47684b(r10, r4)
            int r4 = p000.l99.m47684b(r11, r4)
            if (r8 != r4) goto L_0x01c1
            java.lang.Object r4 = p000.l99.m47673F(r10, r6)
            java.lang.Object r5 = p000.l99.m47673F(r11, r6)
            boolean r4 = p000.i79.m45569q(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x003c:
            java.lang.Object r3 = p000.l99.m47673F(r10, r6)
            java.lang.Object r4 = p000.l99.m47673F(r11, r6)
            boolean r3 = p000.i79.m45569q(r3, r4)
            goto L_0x01c2
        L_0x004a:
            java.lang.Object r3 = p000.l99.m47673F(r10, r6)
            java.lang.Object r4 = p000.l99.m47673F(r11, r6)
            boolean r3 = p000.i79.m45569q(r3, r4)
            goto L_0x01c2
        L_0x0058:
            boolean r4 = r9.mo48670L(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = p000.l99.m47673F(r10, r6)
            java.lang.Object r5 = p000.l99.m47673F(r11, r6)
            boolean r4 = p000.i79.m45569q(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x006e:
            boolean r4 = r9.mo48670L(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = p000.l99.m47697o(r10, r6)
            long r6 = p000.l99.m47697o(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0082:
            boolean r4 = r9.mo48670L(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = p000.l99.m47684b(r10, r6)
            int r5 = p000.l99.m47684b(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0094:
            boolean r4 = r9.mo48670L(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = p000.l99.m47697o(r10, r6)
            long r6 = p000.l99.m47697o(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00a8:
            boolean r4 = r9.mo48670L(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = p000.l99.m47684b(r10, r6)
            int r5 = p000.l99.m47684b(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00ba:
            boolean r4 = r9.mo48670L(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = p000.l99.m47684b(r10, r6)
            int r5 = p000.l99.m47684b(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00cc:
            boolean r4 = r9.mo48670L(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = p000.l99.m47684b(r10, r6)
            int r5 = p000.l99.m47684b(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00de:
            boolean r4 = r9.mo48670L(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = p000.l99.m47673F(r10, r6)
            java.lang.Object r5 = p000.l99.m47673F(r11, r6)
            boolean r4 = p000.i79.m45569q(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00f4:
            boolean r4 = r9.mo48670L(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = p000.l99.m47673F(r10, r6)
            java.lang.Object r5 = p000.l99.m47673F(r11, r6)
            boolean r4 = p000.i79.m45569q(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x010a:
            boolean r4 = r9.mo48670L(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = p000.l99.m47673F(r10, r6)
            java.lang.Object r5 = p000.l99.m47673F(r11, r6)
            boolean r4 = p000.i79.m45569q(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0120:
            boolean r4 = r9.mo48670L(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            boolean r4 = p000.l99.m47705w(r10, r6)
            boolean r5 = p000.l99.m47705w(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0132:
            boolean r4 = r9.mo48670L(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = p000.l99.m47684b(r10, r6)
            int r5 = p000.l99.m47684b(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0144:
            boolean r4 = r9.mo48670L(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = p000.l99.m47697o(r10, r6)
            long r6 = p000.l99.m47697o(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0157:
            boolean r4 = r9.mo48670L(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = p000.l99.m47684b(r10, r6)
            int r5 = p000.l99.m47684b(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0168:
            boolean r4 = r9.mo48670L(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = p000.l99.m47697o(r10, r6)
            long r6 = p000.l99.m47697o(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x017b:
            boolean r4 = r9.mo48670L(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = p000.l99.m47697o(r10, r6)
            long r6 = p000.l99.m47697o(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x018e:
            boolean r4 = r9.mo48670L(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            float r4 = p000.l99.m47706x(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = p000.l99.m47706x(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x01a7:
            boolean r4 = r9.mo48670L(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            double r4 = p000.l99.m47670C(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = p000.l99.m47670C(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c2
        L_0x01c1:
            r3 = r1
        L_0x01c2:
            if (r3 != 0) goto L_0x01c5
            return r1
        L_0x01c5:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01c9:
            o89<?, ?> r0 = r9.f34849o
            java.lang.Object r0 = r0.mo46349f(r10)
            o89<?, ?> r2 = r9.f34849o
            java.lang.Object r2 = r2.mo46349f(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01dc
            return r1
        L_0x01dc:
            boolean r0 = r9.f34840f
            if (r0 == 0) goto L_0x01f1
            wz8<?> r0 = r9.f34850p
            i09 r10 = r0.mo31164c(r10)
            wz8<?> r0 = r9.f34850p
            i09 r11 = r0.mo31164c(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v59.mo31211g(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0a2a  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31212h(T r14, p000.sa9 r15) throws java.io.IOException {
        /*
            r13 = this;
            int r0 = r15.zza()
            int r1 = p000.qa9.f33040b
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x0529
            o89<?, ?> r0 = r13.f34849o
            m53247w(r0, r14, r15)
            boolean r0 = r13.f34840f
            if (r0 == 0) goto L_0x0032
            wz8<?> r0 = r13.f34850p
            i09 r0 = r0.mo31164c(r14)
            o79<T, java.lang.Object> r1 = r0.f29780a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0032
            java.util.Iterator r0 = r0.mo43446q()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0034
        L_0x0032:
            r0 = r3
            r1 = r0
        L_0x0034:
            int[] r7 = r13.f34835a
            int r7 = r7.length
            int r7 = r7 + -3
        L_0x0039:
            if (r7 < 0) goto L_0x0511
            int r8 = r13.mo48671M(r7)
            int[] r9 = r13.f34835a
            r9 = r9[r7]
        L_0x0043:
            if (r1 == 0) goto L_0x0061
            wz8<?> r10 = r13.f34850p
            int r10 = r10.mo31162a(r1)
            if (r10 <= r9) goto L_0x0061
            wz8<?> r10 = r13.f34850p
            r10.mo31165d(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005f
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0043
        L_0x005f:
            r1 = r3
            goto L_0x0043
        L_0x0061:
            r10 = r8 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x04fe;
                case 1: goto L_0x04ee;
                case 2: goto L_0x04de;
                case 3: goto L_0x04ce;
                case 4: goto L_0x04be;
                case 5: goto L_0x04ae;
                case 6: goto L_0x049e;
                case 7: goto L_0x048d;
                case 8: goto L_0x047c;
                case 9: goto L_0x0467;
                case 10: goto L_0x0454;
                case 11: goto L_0x0443;
                case 12: goto L_0x0432;
                case 13: goto L_0x0421;
                case 14: goto L_0x0410;
                case 15: goto L_0x03ff;
                case 16: goto L_0x03ee;
                case 17: goto L_0x03d9;
                case 18: goto L_0x03c8;
                case 19: goto L_0x03b7;
                case 20: goto L_0x03a6;
                case 21: goto L_0x0395;
                case 22: goto L_0x0384;
                case 23: goto L_0x0373;
                case 24: goto L_0x0362;
                case 25: goto L_0x0351;
                case 26: goto L_0x0340;
                case 27: goto L_0x032b;
                case 28: goto L_0x031a;
                case 29: goto L_0x0309;
                case 30: goto L_0x02f8;
                case 31: goto L_0x02e7;
                case 32: goto L_0x02d6;
                case 33: goto L_0x02c5;
                case 34: goto L_0x02b4;
                case 35: goto L_0x02a3;
                case 36: goto L_0x0292;
                case 37: goto L_0x0281;
                case 38: goto L_0x0270;
                case 39: goto L_0x025f;
                case 40: goto L_0x024e;
                case 41: goto L_0x023d;
                case 42: goto L_0x022c;
                case 43: goto L_0x021b;
                case 44: goto L_0x020a;
                case 45: goto L_0x01f9;
                case 46: goto L_0x01e8;
                case 47: goto L_0x01d7;
                case 48: goto L_0x01c6;
                case 49: goto L_0x01b1;
                case 50: goto L_0x01a6;
                case 51: goto L_0x0195;
                case 52: goto L_0x0184;
                case 53: goto L_0x0173;
                case 54: goto L_0x0162;
                case 55: goto L_0x0151;
                case 56: goto L_0x0140;
                case 57: goto L_0x012f;
                case 58: goto L_0x011e;
                case 59: goto L_0x010d;
                case 60: goto L_0x00f8;
                case 61: goto L_0x00e5;
                case 62: goto L_0x00d4;
                case 63: goto L_0x00c3;
                case 64: goto L_0x00b2;
                case 65: goto L_0x00a1;
                case 66: goto L_0x0090;
                case 67: goto L_0x007f;
                case 68: goto L_0x006a;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x050d
        L_0x006a:
            boolean r10 = r13.mo48685z(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            g79 r10 = r13.mo48681t(r7)
            r15.mo45560H(r9, r8, r10)
            goto L_0x050d
        L_0x007f:
            boolean r10 = r13.mo48685z(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m53239P(r14, r10)
            r15.mo45564L(r9, r10)
            goto L_0x050d
        L_0x0090:
            boolean r10 = r13.mo48685z(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m53238N(r14, r10)
            r15.mo45580n(r9, r8)
            goto L_0x050d
        L_0x00a1:
            boolean r10 = r13.mo48685z(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m53239P(r14, r10)
            r15.mo45567a(r9, r10)
            goto L_0x050d
        L_0x00b2:
            boolean r10 = r13.mo48685z(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m53238N(r14, r10)
            r15.mo45576j(r9, r8)
            goto L_0x050d
        L_0x00c3:
            boolean r10 = r13.mo48685z(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m53238N(r14, r10)
            r15.mo45558F(r9, r8)
            goto L_0x050d
        L_0x00d4:
            boolean r10 = r13.mo48685z(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m53238N(r14, r10)
            r15.mo45585s(r9, r8)
            goto L_0x050d
        L_0x00e5:
            boolean r10 = r13.mo48685z(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            com.google.android.gms.internal.vision.zzht r8 = (com.google.android.gms.internal.vision.zzht) r8
            r15.mo45565M(r9, r8)
            goto L_0x050d
        L_0x00f8:
            boolean r10 = r13.mo48685z(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            g79 r10 = r13.mo48681t(r7)
            r15.mo45561I(r9, r8, r10)
            goto L_0x050d
        L_0x010d:
            boolean r10 = r13.mo48685z(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            m53246u(r9, r8, r15)
            goto L_0x050d
        L_0x011e:
            boolean r10 = r13.mo48685z(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = m53241R(r14, r10)
            r15.mo45557E(r9, r8)
            goto L_0x050d
        L_0x012f:
            boolean r10 = r13.mo48685z(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m53238N(r14, r10)
            r15.mo45584r(r9, r8)
            goto L_0x050d
        L_0x0140:
            boolean r10 = r13.mo48685z(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m53239P(r14, r10)
            r15.mo45563K(r9, r10)
            goto L_0x050d
        L_0x0151:
            boolean r10 = r13.mo48685z(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m53238N(r14, r10)
            r15.mo45569c(r9, r8)
            goto L_0x050d
        L_0x0162:
            boolean r10 = r13.mo48685z(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m53239P(r14, r10)
            r15.mo45571e(r9, r10)
            goto L_0x050d
        L_0x0173:
            boolean r10 = r13.mo48685z(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m53239P(r14, r10)
            r15.mo45577k(r9, r10)
            goto L_0x050d
        L_0x0184:
            boolean r10 = r13.mo48685z(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = m53237J(r14, r10)
            r15.mo45579m(r9, r8)
            goto L_0x050d
        L_0x0195:
            boolean r10 = r13.mo48685z(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = m53236C(r14, r10)
            r15.mo45578l(r9, r10)
            goto L_0x050d
        L_0x01a6:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            r13.mo48683x(r15, r9, r8, r7)
            goto L_0x050d
        L_0x01b1:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            g79 r10 = r13.mo48681t(r7)
            p000.i79.m45576x(r9, r8, r15, r10)
            goto L_0x050d
        L_0x01c6:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45533K(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01d7:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45548Z(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01e8:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45539Q(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01f9:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45552b0(r9, r8, r15, r4)
            goto L_0x050d
        L_0x020a:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45554c0(r9, r8, r15, r4)
            goto L_0x050d
        L_0x021b:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45545W(r9, r8, r15, r4)
            goto L_0x050d
        L_0x022c:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45556d0(r9, r8, r15, r4)
            goto L_0x050d
        L_0x023d:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45550a0(r9, r8, r15, r4)
            goto L_0x050d
        L_0x024e:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45536N(r9, r8, r15, r4)
            goto L_0x050d
        L_0x025f:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45542T(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0270:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45529G(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0281:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45525C(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0292:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45577y(r9, r8, r15, r4)
            goto L_0x050d
        L_0x02a3:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45564l(r9, r8, r15, r4)
            goto L_0x050d
        L_0x02b4:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45533K(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02c5:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45548Z(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02d6:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45539Q(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02e7:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45552b0(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02f8:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45554c0(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0309:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45545W(r9, r8, r15, r5)
            goto L_0x050d
        L_0x031a:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45575w(r9, r8, r15)
            goto L_0x050d
        L_0x032b:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            g79 r10 = r13.mo48681t(r7)
            p000.i79.m45563k(r9, r8, r15, r10)
            goto L_0x050d
        L_0x0340:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45562j(r9, r8, r15)
            goto L_0x050d
        L_0x0351:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45556d0(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0362:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45550a0(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0373:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45536N(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0384:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45542T(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0395:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45529G(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03a6:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45525C(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03b7:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45577y(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03c8:
            int[] r9 = r13.f34835a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.i79.m45564l(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03d9:
            boolean r10 = r13.mo48684y(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            g79 r10 = r13.mo48681t(r7)
            r15.mo45560H(r9, r8, r10)
            goto L_0x050d
        L_0x03ee:
            boolean r10 = r13.mo48684y(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = p000.l99.m47697o(r14, r10)
            r15.mo45564L(r9, r10)
            goto L_0x050d
        L_0x03ff:
            boolean r10 = r13.mo48684y(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = p000.l99.m47684b(r14, r10)
            r15.mo45580n(r9, r8)
            goto L_0x050d
        L_0x0410:
            boolean r10 = r13.mo48684y(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = p000.l99.m47697o(r14, r10)
            r15.mo45567a(r9, r10)
            goto L_0x050d
        L_0x0421:
            boolean r10 = r13.mo48684y(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = p000.l99.m47684b(r14, r10)
            r15.mo45576j(r9, r8)
            goto L_0x050d
        L_0x0432:
            boolean r10 = r13.mo48684y(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = p000.l99.m47684b(r14, r10)
            r15.mo45558F(r9, r8)
            goto L_0x050d
        L_0x0443:
            boolean r10 = r13.mo48684y(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = p000.l99.m47684b(r14, r10)
            r15.mo45585s(r9, r8)
            goto L_0x050d
        L_0x0454:
            boolean r10 = r13.mo48684y(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            com.google.android.gms.internal.vision.zzht r8 = (com.google.android.gms.internal.vision.zzht) r8
            r15.mo45565M(r9, r8)
            goto L_0x050d
        L_0x0467:
            boolean r10 = r13.mo48684y(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            g79 r10 = r13.mo48681t(r7)
            r15.mo45561I(r9, r8, r10)
            goto L_0x050d
        L_0x047c:
            boolean r10 = r13.mo48684y(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.l99.m47673F(r14, r10)
            m53246u(r9, r8, r15)
            goto L_0x050d
        L_0x048d:
            boolean r10 = r13.mo48684y(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = p000.l99.m47705w(r14, r10)
            r15.mo45557E(r9, r8)
            goto L_0x050d
        L_0x049e:
            boolean r10 = r13.mo48684y(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = p000.l99.m47684b(r14, r10)
            r15.mo45584r(r9, r8)
            goto L_0x050d
        L_0x04ae:
            boolean r10 = r13.mo48684y(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = p000.l99.m47697o(r14, r10)
            r15.mo45563K(r9, r10)
            goto L_0x050d
        L_0x04be:
            boolean r10 = r13.mo48684y(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = p000.l99.m47684b(r14, r10)
            r15.mo45569c(r9, r8)
            goto L_0x050d
        L_0x04ce:
            boolean r10 = r13.mo48684y(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = p000.l99.m47697o(r14, r10)
            r15.mo45571e(r9, r10)
            goto L_0x050d
        L_0x04de:
            boolean r10 = r13.mo48684y(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = p000.l99.m47697o(r14, r10)
            r15.mo45577k(r9, r10)
            goto L_0x050d
        L_0x04ee:
            boolean r10 = r13.mo48684y(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = p000.l99.m47706x(r14, r10)
            r15.mo45579m(r9, r8)
            goto L_0x050d
        L_0x04fe:
            boolean r10 = r13.mo48684y(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = p000.l99.m47670C(r14, r10)
            r15.mo45578l(r9, r10)
        L_0x050d:
            int r7 = r7 + -3
            goto L_0x0039
        L_0x0511:
            if (r1 == 0) goto L_0x0528
            wz8<?> r14 = r13.f34850p
            r14.mo31165d(r15, r1)
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x0526
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            r1 = r14
            goto L_0x0511
        L_0x0526:
            r1 = r3
            goto L_0x0511
        L_0x0528:
            return
        L_0x0529:
            boolean r0 = r13.f34842h
            if (r0 == 0) goto L_0x0a44
            boolean r0 = r13.f34840f
            if (r0 == 0) goto L_0x054a
            wz8<?> r0 = r13.f34850p
            i09 r0 = r0.mo31164c(r14)
            o79<T, java.lang.Object> r1 = r0.f29780a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x054a
            java.util.Iterator r0 = r0.mo43445o()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x054c
        L_0x054a:
            r0 = r3
            r1 = r0
        L_0x054c:
            int[] r7 = r13.f34835a
            int r7 = r7.length
            r8 = r5
        L_0x0550:
            if (r8 >= r7) goto L_0x0a28
            int r9 = r13.mo48671M(r8)
            int[] r10 = r13.f34835a
            r10 = r10[r8]
        L_0x055a:
            if (r1 == 0) goto L_0x0578
            wz8<?> r11 = r13.f34850p
            int r11 = r11.mo31162a(r1)
            if (r11 > r10) goto L_0x0578
            wz8<?> r11 = r13.f34850p
            r11.mo31165d(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0576
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x055a
        L_0x0576:
            r1 = r3
            goto L_0x055a
        L_0x0578:
            r11 = r9 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0a15;
                case 1: goto L_0x0a05;
                case 2: goto L_0x09f5;
                case 3: goto L_0x09e5;
                case 4: goto L_0x09d5;
                case 5: goto L_0x09c5;
                case 6: goto L_0x09b5;
                case 7: goto L_0x09a4;
                case 8: goto L_0x0993;
                case 9: goto L_0x097e;
                case 10: goto L_0x096b;
                case 11: goto L_0x095a;
                case 12: goto L_0x0949;
                case 13: goto L_0x0938;
                case 14: goto L_0x0927;
                case 15: goto L_0x0916;
                case 16: goto L_0x0905;
                case 17: goto L_0x08f0;
                case 18: goto L_0x08df;
                case 19: goto L_0x08ce;
                case 20: goto L_0x08bd;
                case 21: goto L_0x08ac;
                case 22: goto L_0x089b;
                case 23: goto L_0x088a;
                case 24: goto L_0x0879;
                case 25: goto L_0x0868;
                case 26: goto L_0x0857;
                case 27: goto L_0x0842;
                case 28: goto L_0x0831;
                case 29: goto L_0x0820;
                case 30: goto L_0x080f;
                case 31: goto L_0x07fe;
                case 32: goto L_0x07ed;
                case 33: goto L_0x07dc;
                case 34: goto L_0x07cb;
                case 35: goto L_0x07ba;
                case 36: goto L_0x07a9;
                case 37: goto L_0x0798;
                case 38: goto L_0x0787;
                case 39: goto L_0x0776;
                case 40: goto L_0x0765;
                case 41: goto L_0x0754;
                case 42: goto L_0x0743;
                case 43: goto L_0x0732;
                case 44: goto L_0x0721;
                case 45: goto L_0x0710;
                case 46: goto L_0x06ff;
                case 47: goto L_0x06ee;
                case 48: goto L_0x06dd;
                case 49: goto L_0x06c8;
                case 50: goto L_0x06bd;
                case 51: goto L_0x06ac;
                case 52: goto L_0x069b;
                case 53: goto L_0x068a;
                case 54: goto L_0x0679;
                case 55: goto L_0x0668;
                case 56: goto L_0x0657;
                case 57: goto L_0x0646;
                case 58: goto L_0x0635;
                case 59: goto L_0x0624;
                case 60: goto L_0x060f;
                case 61: goto L_0x05fc;
                case 62: goto L_0x05eb;
                case 63: goto L_0x05da;
                case 64: goto L_0x05c9;
                case 65: goto L_0x05b8;
                case 66: goto L_0x05a7;
                case 67: goto L_0x0596;
                case 68: goto L_0x0581;
                default: goto L_0x057f;
            }
        L_0x057f:
            goto L_0x0a24
        L_0x0581:
            boolean r11 = r13.mo48685z(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            g79 r11 = r13.mo48681t(r8)
            r15.mo45560H(r10, r9, r11)
            goto L_0x0a24
        L_0x0596:
            boolean r11 = r13.mo48685z(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m53239P(r14, r11)
            r15.mo45564L(r10, r11)
            goto L_0x0a24
        L_0x05a7:
            boolean r11 = r13.mo48685z(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m53238N(r14, r11)
            r15.mo45580n(r10, r9)
            goto L_0x0a24
        L_0x05b8:
            boolean r11 = r13.mo48685z(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m53239P(r14, r11)
            r15.mo45567a(r10, r11)
            goto L_0x0a24
        L_0x05c9:
            boolean r11 = r13.mo48685z(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m53238N(r14, r11)
            r15.mo45576j(r10, r9)
            goto L_0x0a24
        L_0x05da:
            boolean r11 = r13.mo48685z(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m53238N(r14, r11)
            r15.mo45558F(r10, r9)
            goto L_0x0a24
        L_0x05eb:
            boolean r11 = r13.mo48685z(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m53238N(r14, r11)
            r15.mo45585s(r10, r9)
            goto L_0x0a24
        L_0x05fc:
            boolean r11 = r13.mo48685z(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            com.google.android.gms.internal.vision.zzht r9 = (com.google.android.gms.internal.vision.zzht) r9
            r15.mo45565M(r10, r9)
            goto L_0x0a24
        L_0x060f:
            boolean r11 = r13.mo48685z(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            g79 r11 = r13.mo48681t(r8)
            r15.mo45561I(r10, r9, r11)
            goto L_0x0a24
        L_0x0624:
            boolean r11 = r13.mo48685z(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            m53246u(r10, r9, r15)
            goto L_0x0a24
        L_0x0635:
            boolean r11 = r13.mo48685z(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = m53241R(r14, r11)
            r15.mo45557E(r10, r9)
            goto L_0x0a24
        L_0x0646:
            boolean r11 = r13.mo48685z(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m53238N(r14, r11)
            r15.mo45584r(r10, r9)
            goto L_0x0a24
        L_0x0657:
            boolean r11 = r13.mo48685z(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m53239P(r14, r11)
            r15.mo45563K(r10, r11)
            goto L_0x0a24
        L_0x0668:
            boolean r11 = r13.mo48685z(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m53238N(r14, r11)
            r15.mo45569c(r10, r9)
            goto L_0x0a24
        L_0x0679:
            boolean r11 = r13.mo48685z(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m53239P(r14, r11)
            r15.mo45571e(r10, r11)
            goto L_0x0a24
        L_0x068a:
            boolean r11 = r13.mo48685z(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m53239P(r14, r11)
            r15.mo45577k(r10, r11)
            goto L_0x0a24
        L_0x069b:
            boolean r11 = r13.mo48685z(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = m53237J(r14, r11)
            r15.mo45579m(r10, r9)
            goto L_0x0a24
        L_0x06ac:
            boolean r11 = r13.mo48685z(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = m53236C(r14, r11)
            r15.mo45578l(r10, r11)
            goto L_0x0a24
        L_0x06bd:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            r13.mo48683x(r15, r10, r9, r8)
            goto L_0x0a24
        L_0x06c8:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            g79 r11 = r13.mo48681t(r8)
            p000.i79.m45576x(r10, r9, r15, r11)
            goto L_0x0a24
        L_0x06dd:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45533K(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x06ee:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45548Z(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x06ff:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45539Q(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0710:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45552b0(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0721:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45554c0(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0732:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45545W(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0743:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45556d0(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0754:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45550a0(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0765:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45536N(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0776:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45542T(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0787:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45529G(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0798:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45525C(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x07a9:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45577y(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x07ba:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45564l(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x07cb:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45533K(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x07dc:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45548Z(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x07ed:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45539Q(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x07fe:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45552b0(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x080f:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45554c0(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x0820:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45545W(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x0831:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45575w(r10, r9, r15)
            goto L_0x0a24
        L_0x0842:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            g79 r11 = r13.mo48681t(r8)
            p000.i79.m45563k(r10, r9, r15, r11)
            goto L_0x0a24
        L_0x0857:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45562j(r10, r9, r15)
            goto L_0x0a24
        L_0x0868:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45556d0(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x0879:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45550a0(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x088a:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45536N(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x089b:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45542T(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08ac:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45529G(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08bd:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45525C(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08ce:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45577y(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08df:
            int[] r10 = r13.f34835a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.i79.m45564l(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08f0:
            boolean r11 = r13.mo48684y(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            g79 r11 = r13.mo48681t(r8)
            r15.mo45560H(r10, r9, r11)
            goto L_0x0a24
        L_0x0905:
            boolean r11 = r13.mo48684y(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = p000.l99.m47697o(r14, r11)
            r15.mo45564L(r10, r11)
            goto L_0x0a24
        L_0x0916:
            boolean r11 = r13.mo48684y(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = p000.l99.m47684b(r14, r11)
            r15.mo45580n(r10, r9)
            goto L_0x0a24
        L_0x0927:
            boolean r11 = r13.mo48684y(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = p000.l99.m47697o(r14, r11)
            r15.mo45567a(r10, r11)
            goto L_0x0a24
        L_0x0938:
            boolean r11 = r13.mo48684y(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = p000.l99.m47684b(r14, r11)
            r15.mo45576j(r10, r9)
            goto L_0x0a24
        L_0x0949:
            boolean r11 = r13.mo48684y(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = p000.l99.m47684b(r14, r11)
            r15.mo45558F(r10, r9)
            goto L_0x0a24
        L_0x095a:
            boolean r11 = r13.mo48684y(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = p000.l99.m47684b(r14, r11)
            r15.mo45585s(r10, r9)
            goto L_0x0a24
        L_0x096b:
            boolean r11 = r13.mo48684y(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            com.google.android.gms.internal.vision.zzht r9 = (com.google.android.gms.internal.vision.zzht) r9
            r15.mo45565M(r10, r9)
            goto L_0x0a24
        L_0x097e:
            boolean r11 = r13.mo48684y(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            g79 r11 = r13.mo48681t(r8)
            r15.mo45561I(r10, r9, r11)
            goto L_0x0a24
        L_0x0993:
            boolean r11 = r13.mo48684y(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.l99.m47673F(r14, r11)
            m53246u(r10, r9, r15)
            goto L_0x0a24
        L_0x09a4:
            boolean r11 = r13.mo48684y(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = p000.l99.m47705w(r14, r11)
            r15.mo45557E(r10, r9)
            goto L_0x0a24
        L_0x09b5:
            boolean r11 = r13.mo48684y(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = p000.l99.m47684b(r14, r11)
            r15.mo45584r(r10, r9)
            goto L_0x0a24
        L_0x09c5:
            boolean r11 = r13.mo48684y(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = p000.l99.m47697o(r14, r11)
            r15.mo45563K(r10, r11)
            goto L_0x0a24
        L_0x09d5:
            boolean r11 = r13.mo48684y(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = p000.l99.m47684b(r14, r11)
            r15.mo45569c(r10, r9)
            goto L_0x0a24
        L_0x09e5:
            boolean r11 = r13.mo48684y(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = p000.l99.m47697o(r14, r11)
            r15.mo45571e(r10, r11)
            goto L_0x0a24
        L_0x09f5:
            boolean r11 = r13.mo48684y(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = p000.l99.m47697o(r14, r11)
            r15.mo45577k(r10, r11)
            goto L_0x0a24
        L_0x0a05:
            boolean r11 = r13.mo48684y(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = p000.l99.m47706x(r14, r11)
            r15.mo45579m(r10, r9)
            goto L_0x0a24
        L_0x0a15:
            boolean r11 = r13.mo48684y(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = p000.l99.m47670C(r14, r11)
            r15.mo45578l(r10, r11)
        L_0x0a24:
            int r8 = r8 + 3
            goto L_0x0550
        L_0x0a28:
            if (r1 == 0) goto L_0x0a3e
            wz8<?> r2 = r13.f34850p
            r2.mo31165d(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0a3c
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0a28
        L_0x0a3c:
            r1 = r3
            goto L_0x0a28
        L_0x0a3e:
            o89<?, ?> r0 = r13.f34849o
            m53247w(r0, r14, r15)
            return
        L_0x0a44:
            r13.mo48668I(r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v59.mo31212h(java.lang.Object, sa9):void");
    }

    /* renamed from: i */
    public final int mo48674i(int i, int i2) {
        if (i < this.f34837c || i > this.f34838d) {
            return -1;
        }
        return mo48663D(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018a, code lost:
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019b, code lost:
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019d, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return r2;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo48675j(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, p000.uw8 r29) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f34834s
            int[] r7 = r0.f34835a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x018d;
                case 52: goto L_0x017d;
                case 53: goto L_0x016d;
                case 54: goto L_0x016d;
                case 55: goto L_0x015d;
                case 56: goto L_0x014e;
                case 57: goto L_0x0140;
                case 58: goto L_0x0127;
                case 59: goto L_0x00f3;
                case 60: goto L_0x00c5;
                case 61: goto L_0x00b8;
                case 62: goto L_0x015d;
                case 63: goto L_0x008a;
                case 64: goto L_0x0140;
                case 65: goto L_0x014e;
                case 66: goto L_0x0075;
                case 67: goto L_0x0060;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x01a1
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x01a1
            r2 = r2 & -8
            r7 = r2 | 4
            g79 r2 = r0.mo48681t(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = com.google.android.gms.internal.vision.C4144z.m34328f(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            if (r15 != 0) goto L_0x0055
            java.lang.Object r3 = r11.f34745c
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0055:
            java.lang.Object r3 = r11.f34745c
            java.lang.Object r3 = p000.t19.m52048e(r15, r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0060:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.vision.C4144z.m34333k(r3, r4, r11)
            long r3 = r11.f34744b
            long r3 = p000.yy8.m54916a(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0075:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r4, r11)
            int r3 = r11.f34743a
            int r3 = p000.yy8.m54918d(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x008a:
            if (r5 != 0) goto L_0x01a1
            int r3 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r4, r11)
            int r4 = r11.f34743a
            w19 r5 = r0.mo48669K(r6)
            if (r5 == 0) goto L_0x00ae
            boolean r5 = r5.mo31220d(r4)
            if (r5 == 0) goto L_0x009f
            goto L_0x00ae
        L_0x009f:
            t89 r1 = m53240Q(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.mo48024c(r2, r4)
            r2 = r3
            goto L_0x01a2
        L_0x00ae:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x019d
        L_0x00b8:
            if (r5 != r15) goto L_0x01a1
            int r2 = com.google.android.gms.internal.vision.C4144z.m34339q(r3, r4, r11)
            java.lang.Object r3 = r11.f34745c
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x00c5:
            if (r5 != r15) goto L_0x01a1
            g79 r2 = r0.mo48681t(r6)
            r5 = r20
            int r2 = com.google.android.gms.internal.vision.C4144z.m34329g(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00dc
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00dd
        L_0x00dc:
            r15 = 0
        L_0x00dd:
            if (r15 != 0) goto L_0x00e5
            java.lang.Object r3 = r11.f34745c
            r12.putObject(r1, r9, r3)
            goto L_0x00ee
        L_0x00e5:
            java.lang.Object r3 = r11.f34745c
            java.lang.Object r3 = p000.t19.m52048e(r15, r3)
            r12.putObject(r1, r9, r3)
        L_0x00ee:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x00f3:
            if (r5 != r15) goto L_0x01a1
            int r2 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r4, r11)
            int r4 = r11.f34743a
            if (r4 != 0) goto L_0x0103
            java.lang.String r3 = ""
            r12.putObject(r1, r9, r3)
            goto L_0x0122
        L_0x0103:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0117
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.vision.C4123i0.m34290g(r3, r2, r5)
            if (r5 == 0) goto L_0x0112
            goto L_0x0117
        L_0x0112:
            com.google.android.gms.internal.vision.zzjk r1 = com.google.android.gms.internal.vision.zzjk.zzh()
            throw r1
        L_0x0117:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = p000.t19.f34083a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x0122:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x0127:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.vision.C4144z.m34333k(r3, r4, r11)
            long r3 = r11.f34744b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0137
            r15 = 1
            goto L_0x0138
        L_0x0137:
            r15 = 0
        L_0x0138:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0140:
            if (r5 != r7) goto L_0x01a1
            int r2 = com.google.android.gms.internal.vision.C4144z.m34330h(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x018a
        L_0x014e:
            r2 = 1
            if (r5 != r2) goto L_0x01a1
            long r2 = com.google.android.gms.internal.vision.C4144z.m34334l(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x019b
        L_0x015d:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r4, r11)
            int r3 = r11.f34743a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x016d:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.vision.C4144z.m34333k(r3, r4, r11)
            long r3 = r11.f34744b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x017d:
            if (r5 != r7) goto L_0x01a1
            float r2 = com.google.android.gms.internal.vision.C4144z.m34337o(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x018a:
            int r2 = r4 + 4
            goto L_0x019d
        L_0x018d:
            r2 = 1
            if (r5 != r2) goto L_0x01a1
            double r2 = com.google.android.gms.internal.vision.C4144z.m34335m(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x019b:
            int r2 = r4 + 8
        L_0x019d:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x01a1:
            r2 = r4
        L_0x01a2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v59.mo48675j(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, uw8):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0420 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e8  */
    /* renamed from: k */
    public final int mo48676k(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, p000.uw8 r29) throws java.io.IOException {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = f34834s
            java.lang.Object r12 = r11.getObject(r1, r9)
            h29 r12 = (p000.h29) r12
            boolean r13 = r12.zza()
            r14 = 1
            if (r13 != 0) goto L_0x0033
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002b
            r13 = 10
            goto L_0x002c
        L_0x002b:
            int r13 = r13 << r14
        L_0x002c:
            h29 r12 = r12.mo28813d(r13)
            r11.putObject(r1, r9, r12)
        L_0x0033:
            r9 = 5
            r10 = 0
            r13 = 2
            switch(r26) {
                case 18: goto L_0x03e1;
                case 19: goto L_0x03a3;
                case 20: goto L_0x0362;
                case 21: goto L_0x0362;
                case 22: goto L_0x0348;
                case 23: goto L_0x0309;
                case 24: goto L_0x02ca;
                case 25: goto L_0x0273;
                case 26: goto L_0x01c0;
                case 27: goto L_0x01a6;
                case 28: goto L_0x014e;
                case 29: goto L_0x0348;
                case 30: goto L_0x0116;
                case 31: goto L_0x02ca;
                case 32: goto L_0x0309;
                case 33: goto L_0x00c9;
                case 34: goto L_0x007c;
                case 35: goto L_0x03e1;
                case 36: goto L_0x03a3;
                case 37: goto L_0x0362;
                case 38: goto L_0x0362;
                case 39: goto L_0x0348;
                case 40: goto L_0x0309;
                case 41: goto L_0x02ca;
                case 42: goto L_0x0273;
                case 43: goto L_0x0348;
                case 44: goto L_0x0116;
                case 45: goto L_0x02ca;
                case 46: goto L_0x0309;
                case 47: goto L_0x00c9;
                case 48: goto L_0x007c;
                case 49: goto L_0x003c;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x041f
        L_0x003c:
            r1 = 3
            if (r6 != r1) goto L_0x041f
            g79 r1 = r15.mo48681t(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.vision.C4144z.m34328f(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f34745c
            r12.add(r8)
        L_0x005c:
            if (r4 >= r5) goto L_0x041f
            int r8 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r4, r7)
            int r9 = r7.f34743a
            if (r2 != r9) goto L_0x041f
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.vision.C4144z.m34328f(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f34745c
            r12.add(r8)
            goto L_0x005c
        L_0x007c:
            if (r6 != r13) goto L_0x00a0
            r39 r12 = (p000.r39) r12
            int r1 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r4, r7)
            int r2 = r7.f34743a
            int r2 = r2 + r1
        L_0x0087:
            if (r1 >= r2) goto L_0x0097
            int r1 = com.google.android.gms.internal.vision.C4144z.m34333k(r3, r1, r7)
            long r4 = r7.f34744b
            long r4 = p000.yy8.m54916a(r4)
            r12.mo47333j(r4)
            goto L_0x0087
        L_0x0097:
            if (r1 != r2) goto L_0x009b
            goto L_0x0420
        L_0x009b:
            com.google.android.gms.internal.vision.zzjk r1 = com.google.android.gms.internal.vision.zzjk.zza()
            throw r1
        L_0x00a0:
            if (r6 != 0) goto L_0x041f
            r39 r12 = (p000.r39) r12
            int r1 = com.google.android.gms.internal.vision.C4144z.m34333k(r3, r4, r7)
            long r8 = r7.f34744b
            long r8 = p000.yy8.m54916a(r8)
            r12.mo47333j(r8)
        L_0x00b1:
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r1, r7)
            int r6 = r7.f34743a
            if (r2 != r6) goto L_0x0420
            int r1 = com.google.android.gms.internal.vision.C4144z.m34333k(r3, r4, r7)
            long r8 = r7.f34744b
            long r8 = p000.yy8.m54916a(r8)
            r12.mo47333j(r8)
            goto L_0x00b1
        L_0x00c9:
            if (r6 != r13) goto L_0x00ed
            p19 r12 = (p000.p19) r12
            int r1 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r4, r7)
            int r2 = r7.f34743a
            int r2 = r2 + r1
        L_0x00d4:
            if (r1 >= r2) goto L_0x00e4
            int r1 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r1, r7)
            int r4 = r7.f34743a
            int r4 = p000.yy8.m54918d(r4)
            r12.mo46614k(r4)
            goto L_0x00d4
        L_0x00e4:
            if (r1 != r2) goto L_0x00e8
            goto L_0x0420
        L_0x00e8:
            com.google.android.gms.internal.vision.zzjk r1 = com.google.android.gms.internal.vision.zzjk.zza()
            throw r1
        L_0x00ed:
            if (r6 != 0) goto L_0x041f
            p19 r12 = (p000.p19) r12
            int r1 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r4, r7)
            int r4 = r7.f34743a
            int r4 = p000.yy8.m54918d(r4)
            r12.mo46614k(r4)
        L_0x00fe:
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r1, r7)
            int r6 = r7.f34743a
            if (r2 != r6) goto L_0x0420
            int r1 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r4, r7)
            int r4 = r7.f34743a
            int r4 = p000.yy8.m54918d(r4)
            r12.mo46614k(r4)
            goto L_0x00fe
        L_0x0116:
            if (r6 != r13) goto L_0x011d
            int r2 = com.google.android.gms.internal.vision.C4144z.m34332j(r3, r4, r12, r7)
            goto L_0x012e
        L_0x011d:
            if (r6 != 0) goto L_0x041f
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.vision.C4144z.m34324b(r2, r3, r4, r5, r6, r7)
        L_0x012e:
            com.google.android.gms.internal.vision.e0 r1 = (com.google.android.gms.internal.vision.C4105e0) r1
            t89 r3 = r1.zzb
            t89 r4 = p000.t89.m52128a()
            if (r3 != r4) goto L_0x0139
            r3 = 0
        L_0x0139:
            w19 r4 = r15.mo48669K(r8)
            o89<?, ?> r5 = r0.f34849o
            r6 = r21
            java.lang.Object r3 = p000.i79.m45559g(r6, r12, r4, r3, r5)
            t89 r3 = (p000.t89) r3
            if (r3 == 0) goto L_0x014b
            r1.zzb = r3
        L_0x014b:
            r1 = r2
            goto L_0x0420
        L_0x014e:
            if (r6 != r13) goto L_0x041f
            int r1 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r4, r7)
            int r4 = r7.f34743a
            if (r4 < 0) goto L_0x01a1
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x019c
            if (r4 != 0) goto L_0x0164
            com.google.android.gms.internal.vision.zzht r4 = com.google.android.gms.internal.vision.zzht.zza
            r12.add(r4)
            goto L_0x016c
        L_0x0164:
            com.google.android.gms.internal.vision.zzht r6 = com.google.android.gms.internal.vision.zzht.zza((byte[]) r3, (int) r1, (int) r4)
            r12.add(r6)
        L_0x016b:
            int r1 = r1 + r4
        L_0x016c:
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r1, r7)
            int r6 = r7.f34743a
            if (r2 != r6) goto L_0x0420
            int r1 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r4, r7)
            int r4 = r7.f34743a
            if (r4 < 0) goto L_0x0197
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0192
            if (r4 != 0) goto L_0x018a
            com.google.android.gms.internal.vision.zzht r4 = com.google.android.gms.internal.vision.zzht.zza
            r12.add(r4)
            goto L_0x016c
        L_0x018a:
            com.google.android.gms.internal.vision.zzht r6 = com.google.android.gms.internal.vision.zzht.zza((byte[]) r3, (int) r1, (int) r4)
            r12.add(r6)
            goto L_0x016b
        L_0x0192:
            com.google.android.gms.internal.vision.zzjk r1 = com.google.android.gms.internal.vision.zzjk.zza()
            throw r1
        L_0x0197:
            com.google.android.gms.internal.vision.zzjk r1 = com.google.android.gms.internal.vision.zzjk.zzb()
            throw r1
        L_0x019c:
            com.google.android.gms.internal.vision.zzjk r1 = com.google.android.gms.internal.vision.zzjk.zza()
            throw r1
        L_0x01a1:
            com.google.android.gms.internal.vision.zzjk r1 = com.google.android.gms.internal.vision.zzjk.zzb()
            throw r1
        L_0x01a6:
            if (r6 != r13) goto L_0x041f
            g79 r1 = r15.mo48681t(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.vision.C4144z.m34327e(r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0420
        L_0x01c0:
            if (r6 != r13) goto L_0x041f
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x0213
            int r1 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r4, r7)
            int r4 = r7.f34743a
            if (r4 < 0) goto L_0x020e
            if (r4 != 0) goto L_0x01db
            r12.add(r6)
            goto L_0x01e6
        L_0x01db:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p000.t19.f34083a
            r8.<init>(r3, r1, r4, r9)
            r12.add(r8)
        L_0x01e5:
            int r1 = r1 + r4
        L_0x01e6:
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r1, r7)
            int r8 = r7.f34743a
            if (r2 != r8) goto L_0x0420
            int r1 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r4, r7)
            int r4 = r7.f34743a
            if (r4 < 0) goto L_0x0209
            if (r4 != 0) goto L_0x01fe
            r12.add(r6)
            goto L_0x01e6
        L_0x01fe:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p000.t19.f34083a
            r8.<init>(r3, r1, r4, r9)
            r12.add(r8)
            goto L_0x01e5
        L_0x0209:
            com.google.android.gms.internal.vision.zzjk r1 = com.google.android.gms.internal.vision.zzjk.zzb()
            throw r1
        L_0x020e:
            com.google.android.gms.internal.vision.zzjk r1 = com.google.android.gms.internal.vision.zzjk.zzb()
            throw r1
        L_0x0213:
            int r1 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r4, r7)
            int r4 = r7.f34743a
            if (r4 < 0) goto L_0x026e
            if (r4 != 0) goto L_0x0221
            r12.add(r6)
            goto L_0x0234
        L_0x0221:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.vision.C4123i0.m34290g(r3, r1, r8)
            if (r9 == 0) goto L_0x0269
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p000.t19.f34083a
            r9.<init>(r3, r1, r4, r10)
            r12.add(r9)
        L_0x0233:
            r1 = r8
        L_0x0234:
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r1, r7)
            int r8 = r7.f34743a
            if (r2 != r8) goto L_0x0420
            int r1 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r4, r7)
            int r4 = r7.f34743a
            if (r4 < 0) goto L_0x0264
            if (r4 != 0) goto L_0x024c
            r12.add(r6)
            goto L_0x0234
        L_0x024c:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.vision.C4123i0.m34290g(r3, r1, r8)
            if (r9 == 0) goto L_0x025f
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p000.t19.f34083a
            r9.<init>(r3, r1, r4, r10)
            r12.add(r9)
            goto L_0x0233
        L_0x025f:
            com.google.android.gms.internal.vision.zzjk r1 = com.google.android.gms.internal.vision.zzjk.zzh()
            throw r1
        L_0x0264:
            com.google.android.gms.internal.vision.zzjk r1 = com.google.android.gms.internal.vision.zzjk.zzb()
            throw r1
        L_0x0269:
            com.google.android.gms.internal.vision.zzjk r1 = com.google.android.gms.internal.vision.zzjk.zzh()
            throw r1
        L_0x026e:
            com.google.android.gms.internal.vision.zzjk r1 = com.google.android.gms.internal.vision.zzjk.zzb()
            throw r1
        L_0x0273:
            r1 = 0
            if (r6 != r13) goto L_0x029b
            ex8 r12 = (p000.ex8) r12
            int r2 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r4, r7)
            int r4 = r7.f34743a
            int r4 = r4 + r2
        L_0x027f:
            if (r2 >= r4) goto L_0x0292
            int r2 = com.google.android.gms.internal.vision.C4144z.m34333k(r3, r2, r7)
            long r5 = r7.f34744b
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x028d
            r5 = r14
            goto L_0x028e
        L_0x028d:
            r5 = r1
        L_0x028e:
            r12.mo42444j(r5)
            goto L_0x027f
        L_0x0292:
            if (r2 != r4) goto L_0x0296
            goto L_0x014b
        L_0x0296:
            com.google.android.gms.internal.vision.zzjk r1 = com.google.android.gms.internal.vision.zzjk.zza()
            throw r1
        L_0x029b:
            if (r6 != 0) goto L_0x041f
            ex8 r12 = (p000.ex8) r12
            int r4 = com.google.android.gms.internal.vision.C4144z.m34333k(r3, r4, r7)
            long r8 = r7.f34744b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02ab
            r6 = r14
            goto L_0x02ac
        L_0x02ab:
            r6 = r1
        L_0x02ac:
            r12.mo42444j(r6)
        L_0x02af:
            if (r4 >= r5) goto L_0x041f
            int r6 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r4, r7)
            int r8 = r7.f34743a
            if (r2 != r8) goto L_0x041f
            int r4 = com.google.android.gms.internal.vision.C4144z.m34333k(r3, r6, r7)
            long r8 = r7.f34744b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02c5
            r6 = r14
            goto L_0x02c6
        L_0x02c5:
            r6 = r1
        L_0x02c6:
            r12.mo42444j(r6)
            goto L_0x02af
        L_0x02ca:
            if (r6 != r13) goto L_0x02ea
            p19 r12 = (p000.p19) r12
            int r1 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r4, r7)
            int r2 = r7.f34743a
            int r2 = r2 + r1
        L_0x02d5:
            if (r1 >= r2) goto L_0x02e1
            int r4 = com.google.android.gms.internal.vision.C4144z.m34330h(r3, r1)
            r12.mo46614k(r4)
            int r1 = r1 + 4
            goto L_0x02d5
        L_0x02e1:
            if (r1 != r2) goto L_0x02e5
            goto L_0x0420
        L_0x02e5:
            com.google.android.gms.internal.vision.zzjk r1 = com.google.android.gms.internal.vision.zzjk.zza()
            throw r1
        L_0x02ea:
            if (r6 != r9) goto L_0x041f
            p19 r12 = (p000.p19) r12
            int r1 = com.google.android.gms.internal.vision.C4144z.m34330h(r17, r18)
            r12.mo46614k(r1)
        L_0x02f5:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r1, r7)
            int r6 = r7.f34743a
            if (r2 != r6) goto L_0x0420
            int r1 = com.google.android.gms.internal.vision.C4144z.m34330h(r3, r4)
            r12.mo46614k(r1)
            goto L_0x02f5
        L_0x0309:
            if (r6 != r13) goto L_0x0329
            r39 r12 = (p000.r39) r12
            int r1 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r4, r7)
            int r2 = r7.f34743a
            int r2 = r2 + r1
        L_0x0314:
            if (r1 >= r2) goto L_0x0320
            long r4 = com.google.android.gms.internal.vision.C4144z.m34334l(r3, r1)
            r12.mo47333j(r4)
            int r1 = r1 + 8
            goto L_0x0314
        L_0x0320:
            if (r1 != r2) goto L_0x0324
            goto L_0x0420
        L_0x0324:
            com.google.android.gms.internal.vision.zzjk r1 = com.google.android.gms.internal.vision.zzjk.zza()
            throw r1
        L_0x0329:
            if (r6 != r14) goto L_0x041f
            r39 r12 = (p000.r39) r12
            long r8 = com.google.android.gms.internal.vision.C4144z.m34334l(r17, r18)
            r12.mo47333j(r8)
        L_0x0334:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r1, r7)
            int r6 = r7.f34743a
            if (r2 != r6) goto L_0x0420
            long r8 = com.google.android.gms.internal.vision.C4144z.m34334l(r3, r4)
            r12.mo47333j(r8)
            goto L_0x0334
        L_0x0348:
            if (r6 != r13) goto L_0x0350
            int r1 = com.google.android.gms.internal.vision.C4144z.m34332j(r3, r4, r12, r7)
            goto L_0x0420
        L_0x0350:
            if (r6 != 0) goto L_0x041f
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.google.android.gms.internal.vision.C4144z.m34324b(r20, r21, r22, r23, r24, r25)
            goto L_0x0420
        L_0x0362:
            if (r6 != r13) goto L_0x0382
            r39 r12 = (p000.r39) r12
            int r1 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r4, r7)
            int r2 = r7.f34743a
            int r2 = r2 + r1
        L_0x036d:
            if (r1 >= r2) goto L_0x0379
            int r1 = com.google.android.gms.internal.vision.C4144z.m34333k(r3, r1, r7)
            long r4 = r7.f34744b
            r12.mo47333j(r4)
            goto L_0x036d
        L_0x0379:
            if (r1 != r2) goto L_0x037d
            goto L_0x0420
        L_0x037d:
            com.google.android.gms.internal.vision.zzjk r1 = com.google.android.gms.internal.vision.zzjk.zza()
            throw r1
        L_0x0382:
            if (r6 != 0) goto L_0x041f
            r39 r12 = (p000.r39) r12
            int r1 = com.google.android.gms.internal.vision.C4144z.m34333k(r3, r4, r7)
            long r8 = r7.f34744b
            r12.mo47333j(r8)
        L_0x038f:
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r1, r7)
            int r6 = r7.f34743a
            if (r2 != r6) goto L_0x0420
            int r1 = com.google.android.gms.internal.vision.C4144z.m34333k(r3, r4, r7)
            long r8 = r7.f34744b
            r12.mo47333j(r8)
            goto L_0x038f
        L_0x03a3:
            if (r6 != r13) goto L_0x03c2
            j19 r12 = (p000.j19) r12
            int r1 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r4, r7)
            int r2 = r7.f34743a
            int r2 = r2 + r1
        L_0x03ae:
            if (r1 >= r2) goto L_0x03ba
            float r4 = com.google.android.gms.internal.vision.C4144z.m34337o(r3, r1)
            r12.mo44003j(r4)
            int r1 = r1 + 4
            goto L_0x03ae
        L_0x03ba:
            if (r1 != r2) goto L_0x03bd
            goto L_0x0420
        L_0x03bd:
            com.google.android.gms.internal.vision.zzjk r1 = com.google.android.gms.internal.vision.zzjk.zza()
            throw r1
        L_0x03c2:
            if (r6 != r9) goto L_0x041f
            j19 r12 = (p000.j19) r12
            float r1 = com.google.android.gms.internal.vision.C4144z.m34337o(r17, r18)
            r12.mo44003j(r1)
        L_0x03cd:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r1, r7)
            int r6 = r7.f34743a
            if (r2 != r6) goto L_0x0420
            float r1 = com.google.android.gms.internal.vision.C4144z.m34337o(r3, r4)
            r12.mo44003j(r1)
            goto L_0x03cd
        L_0x03e1:
            if (r6 != r13) goto L_0x0400
            rz8 r12 = (p000.rz8) r12
            int r1 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r4, r7)
            int r2 = r7.f34743a
            int r2 = r2 + r1
        L_0x03ec:
            if (r1 >= r2) goto L_0x03f8
            double r4 = com.google.android.gms.internal.vision.C4144z.m34335m(r3, r1)
            r12.mo47618j(r4)
            int r1 = r1 + 8
            goto L_0x03ec
        L_0x03f8:
            if (r1 != r2) goto L_0x03fb
            goto L_0x0420
        L_0x03fb:
            com.google.android.gms.internal.vision.zzjk r1 = com.google.android.gms.internal.vision.zzjk.zza()
            throw r1
        L_0x0400:
            if (r6 != r14) goto L_0x041f
            rz8 r12 = (p000.rz8) r12
            double r8 = com.google.android.gms.internal.vision.C4144z.m34335m(r17, r18)
            r12.mo47618j(r8)
        L_0x040b:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.vision.C4144z.m34331i(r3, r1, r7)
            int r6 = r7.f34743a
            if (r2 != r6) goto L_0x0420
            double r8 = com.google.android.gms.internal.vision.C4144z.m34335m(r3, r4)
            r12.mo47618j(r8)
            goto L_0x040b
        L_0x041f:
            r1 = r4
        L_0x0420:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v59.mo48676k(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, uw8):int");
    }

    /* renamed from: l */
    public final <K, V> int mo48677l(T t, byte[] bArr, int i, int i2, int i3, long j, uw8 uw8) throws IOException {
        Unsafe unsafe = f34834s;
        Object E = mo48664E(i3);
        Object object = unsafe.getObject(t, j);
        if (this.f34851q.mo29460e(object)) {
            Object h = this.f34851q.mo29463h(E);
            this.f34851q.mo29462g(h, object);
            unsafe.putObject(t, j, h);
            object = h;
        }
        this.f34851q.mo29461f(E);
        this.f34851q.mo29458b(object);
        int i4 = C4144z.m34331i(bArr, i, uw8);
        int i5 = uw8.f34743a;
        if (i5 < 0 || i5 > i2 - i4) {
            throw zzjk.zza();
        }
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v47, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02c1, code lost:
        r2 = r11;
        r1 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02c3, code lost:
        r13 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02c5, code lost:
        r11 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02c9, code lost:
        r6 = r35;
        r15 = r37;
        r18 = r2;
        r2 = r3;
        r7 = r8;
        r31 = r10;
        r25 = r11;
        r26 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0373, code lost:
        if (r0 == r3) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03b9, code lost:
        if (r0 == r14) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0454, code lost:
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0571, code lost:
        r2 = r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0585, code lost:
        r2 = r2 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0589, code lost:
        r1 = r12.f22866b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x058d, code lost:
        if (r1.f22869e == false) goto L_0x0593;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x058f, code lost:
        r14.mo43443k(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0593, code lost:
        r1 = r15[r1.f22868d.ordinal()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x059d, code lost:
        if (r1 == 17) goto L_0x05a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x05a1, code lost:
        if (r1 == 18) goto L_0x05a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x05a4, code lost:
        r1 = r14.mo43436d(r12.f22866b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x05aa, code lost:
        if (r1 == null) goto L_0x05b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x05ac, code lost:
        r0 = p000.t19.m52048e(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x05b0, code lost:
        r14.mo43439g(r12.f22866b, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x05b5, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a0, code lost:
        r13 = r0;
        r11 = r2;
        r23 = r6;
        r35 = r8;
        r8 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a8, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0173, code lost:
        r5 = r6 | r24;
        r6 = r35;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x017a, code lost:
        r23 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0283, code lost:
        r6 = r35;
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x029e, code lost:
        r0 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02a1, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02bc, code lost:
        r5 = r23 | r24;
        r6 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02c0, code lost:
        r3 = r8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo48678m(T r33, byte[] r34, int r35, int r36, int r37, p000.uw8 r38) throws java.io.IOException {
        /*
            r32 = this;
            r15 = r32
            r14 = r33
            r12 = r34
            r13 = r36
            r11 = r37
            r9 = r38
            sun.misc.Unsafe r10 = f34834s
            r16 = 0
            r0 = r35
            r2 = r16
            r3 = r2
            r5 = r3
            r1 = -1
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            r17 = 0
            if (r0 >= r13) goto L_0x05fc
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002d
            int r0 = com.google.android.gms.internal.vision.C4144z.m34326d(r0, r12, r3, r9)
            int r3 = r9.f34743a
            r4 = r3
            r3 = r0
            goto L_0x002e
        L_0x002d:
            r4 = r0
        L_0x002e:
            int r0 = r4 >>> 3
            r7 = r4 & 7
            r8 = 3
            if (r0 <= r1) goto L_0x003b
            int r2 = r2 / r8
            int r1 = r15.mo48674i(r0, r2)
            goto L_0x003f
        L_0x003b:
            int r1 = r15.mo48673S(r0)
        L_0x003f:
            r2 = r1
            r20 = 0
            r8 = -1
            if (r2 != r8) goto L_0x0056
            r26 = r0
            r2 = r3
            r7 = r4
            r23 = r5
            r24 = r8
            r31 = r10
            r15 = r11
            r25 = r16
            r18 = 1
            goto L_0x03df
        L_0x0056:
            int[] r8 = r15.f34835a
            int r23 = r2 + 1
            r1 = r8[r23]
            r23 = 267386880(0xff00000, float:2.3665827E-29)
            r23 = r1 & r23
            int r11 = r23 >>> 20
            r18 = r4
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r1 & r13
            long r13 = (long) r4
            r4 = 17
            if (r11 > r4) goto L_0x02db
            int r24 = r2 + 2
            r8 = r8[r24]
            int r24 = r8 >>> 20
            r22 = 1
            int r24 = r22 << r24
            r25 = r13
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r8 & r13
            if (r8 == r6) goto L_0x0096
            if (r6 == r13) goto L_0x008b
            long r13 = (long) r6
            r6 = r33
            r27 = r25
            r10.putInt(r6, r13, r5)
            goto L_0x008f
        L_0x008b:
            r6 = r33
            r27 = r25
        L_0x008f:
            long r13 = (long) r8
            int r5 = r10.getInt(r6, r13)
            r14 = r6
            goto L_0x009b
        L_0x0096:
            r14 = r33
            r27 = r25
            r8 = r6
        L_0x009b:
            r6 = r5
            r5 = 5
            switch(r11) {
                case 0: goto L_0x02a3;
                case 1: goto L_0x0287;
                case 2: goto L_0x0261;
                case 3: goto L_0x0261;
                case 4: goto L_0x0247;
                case 5: goto L_0x0222;
                case 6: goto L_0x0209;
                case 7: goto L_0x01e7;
                case 8: goto L_0x01c2;
                case 9: goto L_0x017e;
                case 10: goto L_0x015f;
                case 11: goto L_0x0247;
                case 12: goto L_0x0129;
                case 13: goto L_0x0209;
                case 14: goto L_0x0222;
                case 15: goto L_0x0111;
                case 16: goto L_0x00ea;
                case 17: goto L_0x00ae;
                default: goto L_0x00a0;
            }
        L_0x00a0:
            r13 = r0
            r11 = r2
            r23 = r6
            r35 = r8
            r8 = r18
        L_0x00a8:
            r2 = 1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x02c9
        L_0x00ae:
            r11 = 3
            if (r7 != r11) goto L_0x00a0
            int r1 = r0 << 3
            r4 = r1 | 4
            g79 r1 = r15.mo48681t(r2)
            r13 = r0
            r0 = r1
            r1 = r34
            r11 = r2
            r2 = r3
            r3 = r36
            r7 = r18
            r5 = r38
            int r0 = com.google.android.gms.internal.vision.C4144z.m34328f(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r24
            if (r1 != 0) goto L_0x00d5
            java.lang.Object r1 = r9.f34745c
            r2 = r27
            r10.putObject(r14, r2, r1)
            goto L_0x00e4
        L_0x00d5:
            r2 = r27
            java.lang.Object r1 = r10.getObject(r14, r2)
            java.lang.Object r4 = r9.f34745c
            java.lang.Object r1 = p000.t19.m52048e(r1, r4)
            r10.putObject(r14, r2, r1)
        L_0x00e4:
            r5 = r6 | r24
            r3 = r7
            r6 = r8
            goto L_0x02c1
        L_0x00ea:
            r13 = r0
            r11 = r2
            r5 = r18
            r1 = r27
            if (r7 != 0) goto L_0x010c
            int r7 = com.google.android.gms.internal.vision.C4144z.m34333k(r12, r3, r9)
            long r3 = r9.f34744b
            long r17 = p000.yy8.m54916a(r3)
            r0 = r10
            r2 = r1
            r1 = r33
            r35 = r8
            r8 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            r5 = r6 | r24
            goto L_0x0283
        L_0x010c:
            r35 = r8
            r8 = r5
            goto L_0x017a
        L_0x0111:
            r13 = r0
            r11 = r2
            r35 = r8
            r8 = r18
            r0 = r27
            if (r7 != 0) goto L_0x017a
            int r2 = com.google.android.gms.internal.vision.C4144z.m34331i(r12, r3, r9)
            int r3 = r9.f34743a
            int r3 = p000.yy8.m54918d(r3)
            r10.putInt(r14, r0, r3)
            goto L_0x0173
        L_0x0129:
            r13 = r0
            r11 = r2
            r35 = r8
            r8 = r18
            r0 = r27
            if (r7 != 0) goto L_0x017a
            int r2 = com.google.android.gms.internal.vision.C4144z.m34331i(r12, r3, r9)
            int r3 = r9.f34743a
            w19 r4 = r15.mo48669K(r11)
            if (r4 == 0) goto L_0x015b
            boolean r4 = r4.mo31220d(r3)
            if (r4 == 0) goto L_0x0146
            goto L_0x015b
        L_0x0146:
            t89 r0 = m53240Q(r33)
            long r3 = (long) r3
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r0.mo48024c(r8, r1)
            r0 = r2
            r5 = r6
            r3 = r8
            r2 = r11
            r1 = r13
            r6 = r35
            goto L_0x02c3
        L_0x015b:
            r10.putInt(r14, r0, r3)
            goto L_0x0173
        L_0x015f:
            r13 = r0
            r11 = r2
            r35 = r8
            r8 = r18
            r0 = r27
            r2 = 2
            if (r7 != r2) goto L_0x017a
            int r2 = com.google.android.gms.internal.vision.C4144z.m34339q(r12, r3, r9)
            java.lang.Object r3 = r9.f34745c
            r10.putObject(r14, r0, r3)
        L_0x0173:
            r5 = r6 | r24
            r6 = r35
            r0 = r2
            goto L_0x02c0
        L_0x017a:
            r23 = r6
            goto L_0x00a8
        L_0x017e:
            r13 = r0
            r11 = r2
            r35 = r8
            r8 = r18
            r0 = r27
            r2 = 2
            if (r7 != r2) goto L_0x01b9
            g79 r2 = r15.mo48681t(r11)
            r5 = r36
            r18 = 1048575(0xfffff, float:1.469367E-39)
            int r2 = com.google.android.gms.internal.vision.C4144z.m34329g(r2, r12, r3, r5, r9)
            r3 = r6 & r24
            if (r3 != 0) goto L_0x01a0
            java.lang.Object r3 = r9.f34745c
            r10.putObject(r14, r0, r3)
            goto L_0x01ad
        L_0x01a0:
            java.lang.Object r3 = r10.getObject(r14, r0)
            java.lang.Object r4 = r9.f34745c
            java.lang.Object r3 = p000.t19.m52048e(r3, r4)
            r10.putObject(r14, r0, r3)
        L_0x01ad:
            r0 = r6 | r24
            r6 = r35
            r3 = r8
            r1 = r13
            r13 = r5
            r5 = r0
            r0 = r2
            r2 = r11
            goto L_0x02c5
        L_0x01b9:
            r5 = r36
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r23 = r6
            goto L_0x02a1
        L_0x01c2:
            r13 = r0
            r11 = r2
            r23 = r6
            r35 = r8
            r8 = r18
            r5 = r27
            r0 = 2
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x02a1
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x01dc
            int r0 = com.google.android.gms.internal.vision.C4144z.m34336n(r12, r3, r9)
            goto L_0x01e0
        L_0x01dc:
            int r0 = com.google.android.gms.internal.vision.C4144z.m34338p(r12, r3, r9)
        L_0x01e0:
            java.lang.Object r1 = r9.f34745c
            r10.putObject(r14, r5, r1)
            goto L_0x02bc
        L_0x01e7:
            r13 = r0
            r11 = r2
            r23 = r6
            r35 = r8
            r8 = r18
            r5 = r27
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x02a1
            int r0 = com.google.android.gms.internal.vision.C4144z.m34333k(r12, r3, r9)
            long r1 = r9.f34744b
            int r1 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r1 == 0) goto L_0x0202
            r1 = 1
            goto L_0x0204
        L_0x0202:
            r1 = r16
        L_0x0204:
            p000.l99.m47693k(r14, r5, r1)
            goto L_0x02bc
        L_0x0209:
            r13 = r0
            r11 = r2
            r0 = r5
            r23 = r6
            r35 = r8
            r8 = r18
            r5 = r27
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x02a1
            int r0 = com.google.android.gms.internal.vision.C4144z.m34330h(r12, r3)
            r10.putInt(r14, r5, r0)
            goto L_0x029e
        L_0x0222:
            r13 = r0
            r11 = r2
            r23 = r6
            r35 = r8
            r8 = r18
            r5 = r27
            r0 = 1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x0244
            long r20 = com.google.android.gms.internal.vision.C4144z.m34334l(r12, r3)
            r0 = r10
            r1 = r33
            r7 = r3
            r2 = r5
            r4 = r20
            r0.putLong(r1, r2, r4)
            int r0 = r7 + 8
            goto L_0x02bc
        L_0x0244:
            r2 = r0
            goto L_0x02c9
        L_0x0247:
            r13 = r0
            r11 = r2
            r23 = r6
            r35 = r8
            r8 = r18
            r5 = r27
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x02a1
            int r0 = com.google.android.gms.internal.vision.C4144z.m34331i(r12, r3, r9)
            int r1 = r9.f34743a
            r10.putInt(r14, r5, r1)
            goto L_0x02bc
        L_0x0261:
            r13 = r0
            r11 = r2
            r23 = r6
            r35 = r8
            r8 = r18
            r5 = r27
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x02a1
            int r7 = com.google.android.gms.internal.vision.C4144z.m34333k(r12, r3, r9)
            long r2 = r9.f34744b
            r0 = r10
            r1 = r33
            r20 = r2
            r2 = r5
            r4 = r20
            r0.putLong(r1, r2, r4)
            r5 = r23 | r24
        L_0x0283:
            r6 = r35
            r0 = r7
            goto L_0x02c0
        L_0x0287:
            r13 = r0
            r11 = r2
            r0 = r5
            r23 = r6
            r35 = r8
            r8 = r18
            r5 = r27
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x02a1
            float r0 = com.google.android.gms.internal.vision.C4144z.m34337o(r12, r3)
            p000.l99.m47689g(r14, r5, r0)
        L_0x029e:
            int r0 = r3 + 4
            goto L_0x02bc
        L_0x02a1:
            r2 = 1
            goto L_0x02c9
        L_0x02a3:
            r13 = r0
            r11 = r2
            r23 = r6
            r35 = r8
            r8 = r18
            r5 = r27
            r2 = 1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r2) goto L_0x02c9
            double r0 = com.google.android.gms.internal.vision.C4144z.m34335m(r12, r3)
            p000.l99.m47688f(r14, r5, r0)
            int r0 = r3 + 8
        L_0x02bc:
            r5 = r23 | r24
            r6 = r35
        L_0x02c0:
            r3 = r8
        L_0x02c1:
            r2 = r11
            r1 = r13
        L_0x02c3:
            r13 = r36
        L_0x02c5:
            r11 = r37
            goto L_0x001a
        L_0x02c9:
            r6 = r35
            r15 = r37
            r18 = r2
            r2 = r3
            r7 = r8
            r31 = r10
            r25 = r11
            r26 = r13
            r24 = -1
            goto L_0x03df
        L_0x02db:
            r23 = r5
            r22 = r6
            r5 = r13
            r8 = r18
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r14 = r33
            r13 = r0
            r0 = r2
            r2 = 27
            if (r11 != r2) goto L_0x0340
            r2 = 2
            if (r7 != r2) goto L_0x032f
            java.lang.Object r1 = r10.getObject(r14, r5)
            h29 r1 = (p000.h29) r1
            boolean r2 = r1.zza()
            if (r2 != 0) goto L_0x030e
            int r2 = r1.size()
            if (r2 != 0) goto L_0x0305
            r2 = 10
            goto L_0x0307
        L_0x0305:
            int r2 = r2 << 1
        L_0x0307:
            h29 r1 = r1.mo28813d(r2)
            r10.putObject(r14, r5, r1)
        L_0x030e:
            r5 = r1
            g79 r1 = r15.mo48681t(r0)
            r25 = r0
            r0 = r1
            r1 = r8
            r2 = r34
            r4 = r36
            r6 = r38
            int r0 = com.google.android.gms.internal.vision.C4144z.m34327e(r0, r1, r2, r3, r4, r5, r6)
            r11 = r37
            r3 = r8
            r1 = r13
            r6 = r22
            r5 = r23
            r2 = r25
            r13 = r36
            goto L_0x001a
        L_0x032f:
            r25 = r0
            r15 = r37
            r14 = r3
            r19 = r8
            r31 = r10
            r26 = r13
            r18 = 1
            r24 = -1
            goto L_0x03bc
        L_0x0340:
            r25 = r0
            r0 = 49
            if (r11 > r0) goto L_0x0390
            long r1 = (long) r1
            r0 = r32
            r26 = r1
            r1 = r33
            r24 = 1
            r2 = r34
            r35 = r3
            r4 = r36
            r29 = r5
            r5 = r8
            r6 = r13
            r19 = r8
            r18 = r24
            r24 = -1
            r8 = r25
            r31 = r10
            r9 = r26
            r15 = r37
            r26 = r13
            r12 = r29
            r14 = r38
            int r0 = r0.mo48676k(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r14 = r35
            if (r0 != r14) goto L_0x0377
            goto L_0x03dd
        L_0x0377:
            r14 = r33
            r12 = r34
            r13 = r36
            r9 = r38
            r11 = r15
            r3 = r19
        L_0x0382:
            r6 = r22
            r5 = r23
            r2 = r25
            r1 = r26
            r10 = r31
            r15 = r32
            goto L_0x001a
        L_0x0390:
            r15 = r37
            r14 = r3
            r29 = r5
            r19 = r8
            r31 = r10
            r26 = r13
            r18 = 1
            r24 = -1
            r0 = 50
            if (r11 != r0) goto L_0x03c2
            r0 = 2
            if (r7 != r0) goto L_0x03bc
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r14
            r4 = r36
            r5 = r25
            r6 = r29
            r8 = r38
            int r0 = r0.mo48677l(r1, r2, r3, r4, r5, r6, r8)
            if (r0 != r14) goto L_0x0377
            goto L_0x03dd
        L_0x03bc:
            r2 = r14
        L_0x03bd:
            r7 = r19
            r6 = r22
            goto L_0x03df
        L_0x03c2:
            r0 = r32
            r8 = r1
            r1 = r33
            r2 = r34
            r3 = r14
            r4 = r36
            r5 = r19
            r6 = r26
            r9 = r11
            r10 = r29
            r12 = r25
            r13 = r38
            int r0 = r0.mo48675j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r14) goto L_0x05ee
        L_0x03dd:
            r2 = r0
            goto L_0x03bd
        L_0x03df:
            if (r7 != r15) goto L_0x03f5
            if (r15 != 0) goto L_0x03e4
            goto L_0x03f5
        L_0x03e4:
            r8 = r32
            r13 = r33
            r0 = r2
            r1 = r6
            r3 = r7
            r9 = r15
            r5 = r23
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r36
            goto L_0x060b
        L_0x03f5:
            r8 = r32
            r9 = r15
            boolean r0 = r8.f34840f
            if (r0 == 0) goto L_0x05c2
            r10 = r38
            com.google.android.gms.internal.vision.b0 r0 = r10.f34746d
            com.google.android.gms.internal.vision.b0 r1 = com.google.android.gms.internal.vision.C4095b0.m34203b()
            if (r0 == r1) goto L_0x05bd
            k59 r0 = r8.f34839e
            com.google.android.gms.internal.vision.b0 r1 = r10.f34746d
            r11 = r26
            com.google.android.gms.internal.vision.e0$d r12 = r1.mo31159a(r0, r11)
            if (r12 != 0) goto L_0x042d
            t89 r4 = m53240Q(r33)
            r0 = r7
            r1 = r34
            r3 = r36
            r5 = r38
            int r0 = com.google.android.gms.internal.vision.C4144z.m34325c(r0, r1, r2, r3, r4, r5)
            r13 = r33
            r35 = r6
            r26 = r11
            r11 = r34
            r6 = r36
            goto L_0x05db
        L_0x042d:
            r13 = r33
            r0 = r13
            com.google.android.gms.internal.vision.e0$c r0 = (com.google.android.gms.internal.vision.C4105e0.C4108c) r0
            r0.mo31191x()
            i09<com.google.android.gms.internal.vision.e0$e> r14 = r0.zzc
            com.google.android.gms.internal.vision.e0$e r0 = r12.f22866b
            boolean r1 = r0.f22869e
            com.google.android.gms.internal.vision.zzml r0 = r0.f22868d
            com.google.android.gms.internal.vision.zzml r1 = com.google.android.gms.internal.vision.zzml.ENUM
            if (r0 == r1) goto L_0x05b7
            int[] r15 = p000.nw8.f32206a
            int r0 = r0.ordinal()
            r0 = r15[r0]
            switch(r0) {
                case 1: goto L_0x0575;
                case 2: goto L_0x0561;
                case 3: goto L_0x054d;
                case 4: goto L_0x054d;
                case 5: goto L_0x0539;
                case 6: goto L_0x0539;
                case 7: goto L_0x0528;
                case 8: goto L_0x0528;
                case 9: goto L_0x0517;
                case 10: goto L_0x0517;
                case 11: goto L_0x04fc;
                case 12: goto L_0x04e4;
                case 13: goto L_0x04cc;
                case 14: goto L_0x04c4;
                case 15: goto L_0x04b4;
                case 16: goto L_0x04a4;
                case 17: goto L_0x0478;
                case 18: goto L_0x0458;
                default: goto L_0x044c;
            }
        L_0x044c:
            r35 = r6
            r26 = r11
            r11 = r34
            r6 = r36
        L_0x0454:
            r0 = r17
            goto L_0x0589
        L_0x0458:
            n69 r0 = p000.n69.m48643a()
            k59 r1 = r12.f22865a
            java.lang.Class r1 = r1.getClass()
            g79 r0 = r0.mo46002b(r1)
            r5 = r34
            r4 = r36
            int r2 = com.google.android.gms.internal.vision.C4144z.m34329g(r0, r5, r2, r4, r10)
            java.lang.Object r0 = r10.f34745c
            r35 = r6
            r26 = r11
            r6 = r4
            r11 = r5
            goto L_0x0589
        L_0x0478:
            r5 = r34
            r4 = r36
            int r0 = r11 << 3
            r17 = r0 | 4
            n69 r0 = p000.n69.m48643a()
            k59 r1 = r12.f22865a
            java.lang.Class r1 = r1.getClass()
            g79 r0 = r0.mo46002b(r1)
            r1 = r34
            r3 = r36
            r35 = r6
            r6 = r4
            r4 = r17
            r26 = r11
            r11 = r5
            r5 = r38
            int r2 = com.google.android.gms.internal.vision.C4144z.m34328f(r0, r1, r2, r3, r4, r5)
            java.lang.Object r0 = r10.f34745c
            goto L_0x0589
        L_0x04a4:
            r35 = r6
            r26 = r11
            r11 = r34
            r6 = r36
            int r2 = com.google.android.gms.internal.vision.C4144z.m34336n(r11, r2, r10)
            java.lang.Object r0 = r10.f34745c
            goto L_0x0589
        L_0x04b4:
            r35 = r6
            r26 = r11
            r11 = r34
            r6 = r36
            int r2 = com.google.android.gms.internal.vision.C4144z.m34339q(r11, r2, r10)
            java.lang.Object r0 = r10.f34745c
            goto L_0x0589
        L_0x04c4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Shouldn't reach here."
            r0.<init>(r1)
            throw r0
        L_0x04cc:
            r35 = r6
            r26 = r11
            r11 = r34
            r6 = r36
            int r2 = com.google.android.gms.internal.vision.C4144z.m34333k(r11, r2, r10)
            long r0 = r10.f34744b
            long r0 = p000.yy8.m54916a(r0)
            java.lang.Long r17 = java.lang.Long.valueOf(r0)
            goto L_0x0454
        L_0x04e4:
            r35 = r6
            r26 = r11
            r11 = r34
            r6 = r36
            int r2 = com.google.android.gms.internal.vision.C4144z.m34331i(r11, r2, r10)
            int r0 = r10.f34743a
            int r0 = p000.yy8.m54918d(r0)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            goto L_0x0454
        L_0x04fc:
            r35 = r6
            r26 = r11
            r11 = r34
            r6 = r36
            int r2 = com.google.android.gms.internal.vision.C4144z.m34333k(r11, r2, r10)
            long r0 = r10.f34744b
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x050f
            goto L_0x0511
        L_0x050f:
            r18 = r16
        L_0x0511:
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r18)
            goto L_0x0454
        L_0x0517:
            r35 = r6
            r26 = r11
            r11 = r34
            r6 = r36
            int r0 = com.google.android.gms.internal.vision.C4144z.m34330h(r11, r2)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            goto L_0x0571
        L_0x0528:
            r35 = r6
            r26 = r11
            r11 = r34
            r6 = r36
            long r0 = com.google.android.gms.internal.vision.C4144z.m34334l(r11, r2)
            java.lang.Long r17 = java.lang.Long.valueOf(r0)
            goto L_0x0585
        L_0x0539:
            r35 = r6
            r26 = r11
            r11 = r34
            r6 = r36
            int r2 = com.google.android.gms.internal.vision.C4144z.m34331i(r11, r2, r10)
            int r0 = r10.f34743a
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            goto L_0x0454
        L_0x054d:
            r35 = r6
            r26 = r11
            r11 = r34
            r6 = r36
            int r2 = com.google.android.gms.internal.vision.C4144z.m34333k(r11, r2, r10)
            long r0 = r10.f34744b
            java.lang.Long r17 = java.lang.Long.valueOf(r0)
            goto L_0x0454
        L_0x0561:
            r35 = r6
            r26 = r11
            r11 = r34
            r6 = r36
            float r0 = com.google.android.gms.internal.vision.C4144z.m34337o(r11, r2)
            java.lang.Float r17 = java.lang.Float.valueOf(r0)
        L_0x0571:
            int r2 = r2 + 4
            goto L_0x0454
        L_0x0575:
            r35 = r6
            r26 = r11
            r11 = r34
            r6 = r36
            double r0 = com.google.android.gms.internal.vision.C4144z.m34335m(r11, r2)
            java.lang.Double r17 = java.lang.Double.valueOf(r0)
        L_0x0585:
            int r2 = r2 + 8
            goto L_0x0454
        L_0x0589:
            com.google.android.gms.internal.vision.e0$e r1 = r12.f22866b
            boolean r3 = r1.f22869e
            if (r3 == 0) goto L_0x0593
            r14.mo43443k(r1, r0)
            goto L_0x05b5
        L_0x0593:
            com.google.android.gms.internal.vision.zzml r1 = r1.f22868d
            int r1 = r1.ordinal()
            r1 = r15[r1]
            r3 = 17
            if (r1 == r3) goto L_0x05a4
            r3 = 18
            if (r1 == r3) goto L_0x05a4
            goto L_0x05b0
        L_0x05a4:
            com.google.android.gms.internal.vision.e0$e r1 = r12.f22866b
            java.lang.Object r1 = r14.mo43436d(r1)
            if (r1 == 0) goto L_0x05b0
            java.lang.Object r0 = p000.t19.m52048e(r1, r0)
        L_0x05b0:
            com.google.android.gms.internal.vision.e0$e r1 = r12.f22866b
            r14.mo43439g(r1, r0)
        L_0x05b5:
            r0 = r2
            goto L_0x05db
        L_0x05b7:
            r11 = r34
            com.google.android.gms.internal.vision.C4144z.m34331i(r11, r2, r10)
            throw r17
        L_0x05bd:
            r13 = r33
            r11 = r34
            goto L_0x05c8
        L_0x05c2:
            r13 = r33
            r11 = r34
            r10 = r38
        L_0x05c8:
            r35 = r6
            r6 = r36
            t89 r4 = m53240Q(r33)
            r0 = r7
            r1 = r34
            r3 = r36
            r5 = r38
            int r0 = com.google.android.gms.internal.vision.C4144z.m34325c(r0, r1, r2, r3, r4, r5)
        L_0x05db:
            r3 = r7
            r15 = r8
            r12 = r11
            r14 = r13
            r5 = r23
            r2 = r25
            r1 = r26
            r13 = r6
            r11 = r9
            r9 = r10
            r10 = r31
            r6 = r35
            goto L_0x001a
        L_0x05ee:
            r7 = r19
            r14 = r33
            r12 = r34
            r13 = r36
            r9 = r38
            r3 = r7
            r11 = r15
            goto L_0x0382
        L_0x05fc:
            r23 = r5
            r22 = r6
            r31 = r10
            r9 = r11
            r6 = r13
            r13 = r14
            r8 = r15
            r1 = r22
            r2 = 1048575(0xfffff, float:1.469367E-39)
        L_0x060b:
            if (r1 == r2) goto L_0x0613
            long r1 = (long) r1
            r4 = r31
            r4.putInt(r13, r1, r5)
        L_0x0613:
            int r1 = r8.f34845k
            r2 = r17
        L_0x0617:
            int r4 = r8.f34846l
            if (r1 >= r4) goto L_0x062a
            int[] r4 = r8.f34844j
            r4 = r4[r1]
            o89<?, ?> r5 = r8.f34849o
            java.lang.Object r2 = r8.mo48680p(r13, r4, r2, r5)
            t89 r2 = (p000.t89) r2
            int r1 = r1 + 1
            goto L_0x0617
        L_0x062a:
            if (r2 == 0) goto L_0x0631
            o89<?, ?> r1 = r8.f34849o
            r1.mo46350g(r13, r2)
        L_0x0631:
            if (r9 != 0) goto L_0x063b
            if (r0 != r6) goto L_0x0636
            goto L_0x063f
        L_0x0636:
            com.google.android.gms.internal.vision.zzjk r0 = com.google.android.gms.internal.vision.zzjk.zzg()
            throw r0
        L_0x063b:
            if (r0 > r6) goto L_0x0640
            if (r3 != r9) goto L_0x0640
        L_0x063f:
            return r0
        L_0x0640:
            com.google.android.gms.internal.vision.zzjk r0 = com.google.android.gms.internal.vision.zzjk.zzg()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v59.mo48678m(java.lang.Object, byte[], int, int, int, uw8):int");
    }

    /* renamed from: o */
    public final <K, V, UT, UB> UB mo48679o(int i, int i2, Map<K, V> map, w19 w19, UB ub, o89<UT, UB> o89) {
        this.f34851q.mo29461f(mo48664E(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!w19.mo31220d(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = o89.mo46344a();
                }
                C4092a0 zzc = zzht.zzc(p49.m49792a((v49) null, next.getKey(), next.getValue()));
                try {
                    p49.m49793b(zzc.mo31158b(), (v49) null, next.getKey(), next.getValue());
                    o89.mo46346c(ub, i2, zzc.mo31157a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: p */
    public final <UT, UB> UB mo48680p(Object obj, int i, UB ub, o89<UT, UB> o89) {
        w19 K;
        int i2 = this.f34835a[i];
        Object F = l99.m47673F(obj, (long) (mo48671M(i) & 1048575));
        if (F == null || (K = mo48669K(i)) == null) {
            return ub;
        }
        return mo48679o(i, i2, this.f34851q.mo29458b(F), K, ub, o89);
    }

    /* renamed from: t */
    public final g79 mo48681t(int i) {
        int i2 = (i / 3) << 1;
        g79 g79 = (g79) this.f34836b[i2];
        if (g79 != null) {
            return g79;
        }
        g79 b = n69.m48643a().mo46002b((Class) this.f34836b[i2 + 1]);
        this.f34836b[i2] = b;
        return b;
    }

    /* renamed from: v */
    public final void mo48682v(T t, T t2, int i) {
        long M = (long) (mo48671M(i) & 1048575);
        if (mo48684y(t2, i)) {
            Object F = l99.m47673F(t, M);
            Object F2 = l99.m47673F(t2, M);
            if (F != null && F2 != null) {
                l99.m47692j(t, M, t19.m52048e(F, F2));
                mo48665F(t, i);
            } else if (F2 != null) {
                l99.m47692j(t, M, F2);
                mo48665F(t, i);
            }
        }
    }

    /* renamed from: x */
    public final <K, V> void mo48683x(sa9 sa9, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            this.f34851q.mo29461f(mo48664E(i2));
            sa9.mo45566N(i, (v49) null, this.f34851q.mo29457a(obj));
        }
    }

    /* renamed from: y */
    public final boolean mo48684y(T t, int i) {
        int O = mo48672O(i);
        long j = (long) (O & 1048575);
        if (j == 1048575) {
            int M = mo48671M(i);
            long j2 = (long) (M & 1048575);
            switch ((M & 267386880) >>> 20) {
                case 0:
                    if (l99.m47670C(t, j2) != Utils.DOUBLE_EPSILON) {
                        return true;
                    }
                    return false;
                case 1:
                    if (l99.m47706x(t, j2) != Utils.FLOAT_EPSILON) {
                        return true;
                    }
                    return false;
                case 2:
                    if (l99.m47697o(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (l99.m47697o(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (l99.m47684b(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (l99.m47697o(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (l99.m47684b(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return l99.m47705w(t, j2);
                case 8:
                    Object F = l99.m47673F(t, j2);
                    if (F instanceof String) {
                        if (!((String) F).isEmpty()) {
                            return true;
                        }
                        return false;
                    } else if (!(F instanceof zzht)) {
                        throw new IllegalArgumentException();
                    } else if (!zzht.zza.equals(F)) {
                        return true;
                    } else {
                        return false;
                    }
                case 9:
                    if (l99.m47673F(t, j2) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    if (!zzht.zza.equals(l99.m47673F(t, j2))) {
                        return true;
                    }
                    return false;
                case 11:
                    if (l99.m47684b(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (l99.m47684b(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (l99.m47684b(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (l99.m47697o(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (l99.m47684b(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (l99.m47697o(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (l99.m47673F(t, j2) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((l99.m47684b(t, j) & (1 << (O >>> 20))) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: z */
    public final boolean mo48685z(T t, int i, int i2) {
        if (l99.m47684b(t, (long) (mo48672O(i2) & 1048575)) == i) {
            return true;
        }
        return false;
    }

    public final T zza() {
        return this.f34847m.mo31214b(this.f34839e);
    }
}
