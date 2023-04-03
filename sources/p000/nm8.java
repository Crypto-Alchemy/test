package p000;

import com.google.android.gms.internal.clearcut.C4056e;
import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzbn;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: nm8 */
public final class nm8 {

    /* renamed from: a */
    public static final Class<?> f32154a = m48841C();

    /* renamed from: b */
    public static final go8<?, ?> f32155b = m48892w(false);

    /* renamed from: c */
    public static final go8<?, ?> f32156c = m48892w(true);

    /* renamed from: d */
    public static final go8<?, ?> f32157d = new mo8();

    /* renamed from: A */
    public static go8<?, ?> m48839A() {
        return f32156c;
    }

    /* renamed from: B */
    public static go8<?, ?> m48840B() {
        return f32157d;
    }

    /* renamed from: C */
    public static Class<?> m48841C() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    public static Class<?> m48842D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: E */
    public static int m48843E(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof sf8) {
            sf8 sf8 = (sf8) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.m33950C0(sf8.mo47763j(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbn.m33950C0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: F */
    public static void m48844F(int i, List<Long> list, dr8 dr8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            dr8.mo42024o(i, list, z);
        }
    }

    /* renamed from: G */
    public static int m48845G(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof sf8) {
            sf8 sf8 = (sf8) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.m33952D0(sf8.mo47763j(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbn.m33952D0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    public static void m48846H(int i, List<Long> list, dr8 dr8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            dr8.mo41995A(i, list, z);
        }
    }

    /* renamed from: I */
    public static void m48847I(Class<?> cls) {
        Class<?> cls2;
        if (!C4056e.class.isAssignableFrom(cls) && (cls2 = f32154a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: J */
    public static int m48848J(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof sf8) {
            sf8 sf8 = (sf8) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.m33954E0(sf8.mo47763j(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbn.m33954E0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: K */
    public static void m48849K(int i, List<Long> list, dr8 dr8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            dr8.mo42032w(i, list, z);
        }
    }

    /* renamed from: L */
    public static int m48850L(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: M */
    public static void m48851M(int i, List<Integer> list, dr8 dr8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            dr8.mo42014b(i, list, z);
        }
    }

    /* renamed from: N */
    public static int m48852N(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: O */
    public static void m48853O(int i, List<Integer> list, dr8 dr8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            dr8.mo42034y(i, list, z);
        }
    }

    /* renamed from: P */
    public static int m48854P(List<?> list) {
        return list.size();
    }

    /* renamed from: Q */
    public static void m48855Q(int i, List<Integer> list, dr8 dr8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            dr8.mo42025p(i, list, z);
        }
    }

    /* renamed from: R */
    public static void m48856R(int i, List<Integer> list, dr8 dr8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            dr8.mo42019i(i, list, z);
        }
    }

    /* renamed from: S */
    public static void m48857S(int i, List<Integer> list, dr8 dr8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            dr8.mo42035z(i, list, z);
        }
    }

    /* renamed from: T */
    public static void m48858T(int i, List<Integer> list, dr8 dr8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            dr8.mo42031v(i, list, z);
        }
    }

    /* renamed from: U */
    public static void m48859U(int i, List<Boolean> list, dr8 dr8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            dr8.mo42030u(i, list, z);
        }
    }

    /* renamed from: V */
    public static int m48860V(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m48865a(list) + (list.size() * zzbn.m33948B0(i));
    }

    /* renamed from: W */
    public static int m48861W(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m48879j(list) + (size * zzbn.m33948B0(i));
    }

    /* renamed from: X */
    public static int m48862X(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m48886q(list) + (size * zzbn.m33948B0(i));
    }

    /* renamed from: Y */
    public static int m48863Y(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m48891v(list) + (size * zzbn.m33948B0(i));
    }

    /* renamed from: Z */
    public static int m48864Z(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m48843E(list) + (size * zzbn.m33948B0(i));
    }

    /* renamed from: a */
    public static int m48865a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof pi8) {
            pi8 pi8 = (pi8) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.m33975e0(pi8.mo46750j(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbn.m33975e0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a0 */
    public static int m48866a0(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m48845G(list) + (size * zzbn.m33948B0(i));
    }

    /* renamed from: b */
    public static <UT, UB> UB m48867b(int i, int i2, UB ub, go8<UT, UB> go8) {
        if (ub == null) {
            ub = go8.mo42941f();
        }
        go8.mo42936a(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: b0 */
    public static int m48868b0(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m48848J(list) + (size * zzbn.m33948B0(i));
    }

    /* renamed from: c */
    public static <UT, UB> UB m48869c(int i, List<Integer> list, bg8<?> bg8, UB ub, go8<UT, UB> go8) {
        if (bg8 == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (bg8.mo29577h(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m48867b(i, intValue, ub, go8);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (bg8.mo29577h(intValue2) == null) {
                    ub = m48867b(i, intValue2, ub, go8);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: c0 */
    public static int m48870c0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbn.m33988t0(i, 0);
    }

    /* renamed from: d */
    public static void m48871d(int i, List<String> list, dr8 dr8) throws IOException {
        if (list != null && !list.isEmpty()) {
            dr8.mo42029t(i, list);
        }
    }

    /* renamed from: d0 */
    public static int m48872d0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbn.m33980k0(i, 0);
    }

    /* renamed from: e */
    public static void m48873e(int i, List<?> list, dr8 dr8, hm8 hm8) throws IOException {
        if (list != null && !list.isEmpty()) {
            dr8.mo42004J(i, list, hm8);
        }
    }

    /* renamed from: e0 */
    public static int m48874e0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbn.m33964Q(i, true);
    }

    /* renamed from: f */
    public static void m48875f(int i, List<Double> list, dr8 dr8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            dr8.mo41997C(i, list, z);
        }
    }

    /* renamed from: g */
    public static <T, FT extends af8<FT>> void m48876g(id8<FT> id8, T t, T t2) {
        td8<FT> b = id8.mo30760b(t2);
        if (!b.mo48080b()) {
            id8.mo30763e(t).mo48088i(b);
        }
    }

    /* renamed from: h */
    public static <T> void m48877h(ij8 ij8, T t, T t2, long j) {
        qp8.m50757i(t, j, ij8.mo43627c(qp8.m50740M(t, j), qp8.m50740M(t2, j)));
    }

    /* renamed from: i */
    public static <T, UT, UB> void m48878i(go8<UT, UB> go8, T t, T t2) {
        go8.mo42942g(t, go8.mo42944i(go8.mo42946k(t), go8.mo42946k(t2)));
    }

    /* renamed from: j */
    public static int m48879j(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof pi8) {
            pi8 pi8 = (pi8) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.m33978h0(pi8.mo46750j(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbn.m33978h0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: k */
    public static void m48880k(int i, List<zzbb> list, dr8 dr8) throws IOException {
        if (list != null && !list.isEmpty()) {
            dr8.mo42026q(i, list);
        }
    }

    /* renamed from: l */
    public static void m48881l(int i, List<?> list, dr8 dr8, hm8 hm8) throws IOException {
        if (list != null && !list.isEmpty()) {
            dr8.mo42006L(i, list, hm8);
        }
    }

    /* renamed from: m */
    public static void m48882m(int i, List<Float> list, dr8 dr8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            dr8.mo41998D(i, list, z);
        }
    }

    /* renamed from: n */
    public static int m48883n(int i, Object obj, hm8 hm8) {
        return obj instanceof xg8 ? zzbn.m33972d(i, (xg8) obj) : zzbn.m33949C(i, (tj8) obj, hm8);
    }

    /* renamed from: o */
    public static int m48884o(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int B0 = zzbn.m33948B0(i) * size;
        if (list instanceof ch8) {
            ch8 ch8 = (ch8) list;
            while (i2 < size) {
                Object m = ch8.mo30011m(i2);
                B0 += m instanceof zzbb ? zzbn.m33951D((zzbb) m) : zzbn.m33985q0((String) m);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                B0 += obj instanceof zzbb ? zzbn.m33951D((zzbb) obj) : zzbn.m33985q0((String) obj);
                i2++;
            }
        }
        return B0;
    }

    /* renamed from: p */
    public static int m48885p(int i, List<?> list, hm8 hm8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int B0 = zzbn.m33948B0(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            B0 += obj instanceof xg8 ? zzbn.m33974e((xg8) obj) : zzbn.m33953E((tj8) obj, hm8);
        }
        return B0;
    }

    /* renamed from: q */
    public static int m48886q(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof pi8) {
            pi8 pi8 = (pi8) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.m33981l0(pi8.mo46750j(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbn.m33981l0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: r */
    public static void m48887r(int i, List<Long> list, dr8 dr8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            dr8.mo42018g(i, list, z);
        }
    }

    /* renamed from: s */
    public static boolean m48888s(int i, int i2, int i3) {
        if (i2 < 40) {
            return true;
        }
        long j = (long) i3;
        return ((((long) i2) - ((long) i)) + 1) + 9 <= ((2 * j) + 3) + ((j + 3) * 3);
    }

    /* renamed from: t */
    public static int m48889t(int i, List<zzbb> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int B0 = size * zzbn.m33948B0(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            B0 += zzbn.m33951D(list.get(i2));
        }
        return B0;
    }

    /* renamed from: u */
    public static int m48890u(int i, List<tj8> list, hm8 hm8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzbn.m33963P(i, list.get(i3), hm8);
        }
        return i2;
    }

    /* renamed from: v */
    public static int m48891v(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof sf8) {
            sf8 sf8 = (sf8) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.m33958H0(sf8.mo47763j(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbn.m33958H0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: w */
    public static go8<?, ?> m48892w(boolean z) {
        try {
            Class<?> D = m48842D();
            if (D == null) {
                return null;
            }
            return (go8) D.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: x */
    public static void m48893x(int i, List<Long> list, dr8 dr8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            dr8.mo41996B(i, list, z);
        }
    }

    /* renamed from: y */
    public static boolean m48894y(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: z */
    public static go8<?, ?> m48895z() {
        return f32155b;
    }
}
