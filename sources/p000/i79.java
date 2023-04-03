package p000;

import com.google.android.gms.internal.vision.C4105e0;
import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzii;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: i79 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class i79 {

    /* renamed from: a */
    public static final Class<?> f29846a = m45528F();

    /* renamed from: b */
    public static final o89<?, ?> f29847b = m45561i(false);

    /* renamed from: c */
    public static final o89<?, ?> f29848c = m45561i(true);

    /* renamed from: d */
    public static final o89<?, ?> f29849d = new r89();

    /* renamed from: A */
    public static int m45523A(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r39) {
            r39 r39 = (r39) list;
            i = 0;
            while (i2 < size) {
                i += zzii.m34410n0(r39.mo47334k(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzii.m34410n0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: B */
    public static o89<?, ?> m45524B() {
        return f29849d;
    }

    /* renamed from: C */
    public static void m45525C(int i, List<Long> list, sa9 sa9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            sa9.mo45573g(i, list, z);
        }
    }

    /* renamed from: D */
    public static int m45526D(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m45527E(list) + (size * zzii.m34404g0(i));
    }

    /* renamed from: E */
    public static int m45527E(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p19) {
            p19 p19 = (p19) list;
            i = 0;
            while (i2 < size) {
                i += zzii.m34378B0(p19.mo46613j(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzii.m34378B0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: F */
    public static Class<?> m45528F() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: G */
    public static void m45529G(int i, List<Long> list, sa9 sa9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            sa9.mo45554B(i, list, z);
        }
    }

    /* renamed from: H */
    public static int m45530H(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m45531I(list) + (size * zzii.m34404g0(i));
    }

    /* renamed from: I */
    public static int m45531I(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p19) {
            p19 p19 = (p19) list;
            i = 0;
            while (i2 < size) {
                i += zzii.m34407k0(p19.mo46613j(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzii.m34407k0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: J */
    public static Class<?> m45532J() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: K */
    public static void m45533K(int i, List<Long> list, sa9 sa9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            sa9.mo45581o(i, list, z);
        }
    }

    /* renamed from: L */
    public static int m45534L(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m45535M(list) + (size * zzii.m34404g0(i));
    }

    /* renamed from: M */
    public static int m45535M(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p19) {
            p19 p19 = (p19) list;
            i = 0;
            while (i2 < size) {
                i += zzii.m34411o0(p19.mo46613j(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzii.m34411o0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: N */
    public static void m45536N(int i, List<Long> list, sa9 sa9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            sa9.mo45553A(i, list, z);
        }
    }

    /* renamed from: O */
    public static int m45537O(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m45538P(list) + (size * zzii.m34404g0(i));
    }

    /* renamed from: P */
    public static int m45538P(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p19) {
            p19 p19 = (p19) list;
            i = 0;
            while (i2 < size) {
                i += zzii.m34415s0(p19.mo46613j(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzii.m34415s0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    public static void m45539Q(int i, List<Long> list, sa9 sa9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            sa9.mo45589w(i, list, z);
        }
    }

    /* renamed from: R */
    public static int m45540R(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzii.m34420x0(i, 0);
    }

    /* renamed from: S */
    public static int m45541S(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: T */
    public static void m45542T(int i, List<Integer> list, sa9 sa9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            sa9.mo45568b(i, list, z);
        }
    }

    /* renamed from: U */
    public static int m45543U(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzii.m34413q0(i, 0);
    }

    /* renamed from: V */
    public static int m45544V(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: W */
    public static void m45545W(int i, List<Integer> list, sa9 sa9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            sa9.mo45591y(i, list, z);
        }
    }

    /* renamed from: X */
    public static int m45546X(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzii.m34387H(i, true);
    }

    /* renamed from: Y */
    public static int m45547Y(List<?> list) {
        return list.size();
    }

    /* renamed from: Z */
    public static void m45548Z(int i, List<Integer> list, sa9 sa9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            sa9.mo45582p(i, list, z);
        }
    }

    /* renamed from: a */
    public static int m45549a(int i, Object obj, g79 g79) {
        if (obj instanceof d39) {
            return zzii.m34398c(i, (d39) obj);
        }
        return zzii.m34386G(i, (k59) obj, g79);
    }

    /* renamed from: a0 */
    public static void m45550a0(int i, List<Integer> list, sa9 sa9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            sa9.mo45575i(i, list, z);
        }
    }

    /* renamed from: b */
    public static int m45551b(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int g0 = zzii.m34404g0(i) * size;
        if (list instanceof k39) {
            k39 k39 = (k39) list;
            while (i4 < size) {
                Object h = k39.mo28816h(i4);
                if (h instanceof zzht) {
                    i3 = zzii.m34388I((zzht) h);
                } else {
                    i3 = zzii.m34389J((String) h);
                }
                g0 += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzht) {
                    i2 = zzii.m34388I((zzht) obj);
                } else {
                    i2 = zzii.m34389J((String) obj);
                }
                g0 += i2;
                i4++;
            }
        }
        return g0;
    }

    /* renamed from: b0 */
    public static void m45552b0(int i, List<Integer> list, sa9 sa9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            sa9.mo45592z(i, list, z);
        }
    }

    /* renamed from: c */
    public static int m45553c(int i, List<?> list, g79 g79) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int g0 = zzii.m34404g0(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof d39) {
                i2 = zzii.m34400d((d39) obj);
            } else {
                i2 = zzii.m34402e((k59) obj, g79);
            }
            g0 += i2;
        }
        return g0;
    }

    /* renamed from: c0 */
    public static void m45554c0(int i, List<Integer> list, sa9 sa9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            sa9.mo45588v(i, list, z);
        }
    }

    /* renamed from: d */
    public static int m45555d(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m45557e(list) + (list.size() * zzii.m34404g0(i));
    }

    /* renamed from: d0 */
    public static void m45556d0(int i, List<Boolean> list, sa9 sa9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            sa9.mo45587u(i, list, z);
        }
    }

    /* renamed from: e */
    public static int m45557e(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r39) {
            r39 r39 = (r39) list;
            i = 0;
            while (i2 < size) {
                i += zzii.m34401d0(r39.mo47334k(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzii.m34401d0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    public static <UT, UB> UB m45558f(int i, int i2, UB ub, o89<UT, UB> o89) {
        if (ub == null) {
            ub = o89.mo46344a();
        }
        o89.mo46345b(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: g */
    public static <UT, UB> UB m45559g(int i, List<Integer> list, w19 w19, UB ub, o89<UT, UB> o89) {
        if (w19 == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (w19.mo31220d(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m45558f(i, intValue, ub, o89);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!w19.mo31220d(intValue2)) {
                    ub = m45558f(i, intValue2, ub, o89);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: h */
    public static o89<?, ?> m45560h() {
        return f29847b;
    }

    /* renamed from: i */
    public static o89<?, ?> m45561i(boolean z) {
        try {
            Class<?> J = m45532J();
            if (J == null) {
                return null;
            }
            return (o89) J.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static void m45562j(int i, List<String> list, sa9 sa9) throws IOException {
        if (list != null && !list.isEmpty()) {
            sa9.mo45586t(i, list);
        }
    }

    /* renamed from: k */
    public static void m45563k(int i, List<?> list, sa9 sa9, g79 g79) throws IOException {
        if (list != null && !list.isEmpty()) {
            sa9.mo45559G(i, list, g79);
        }
    }

    /* renamed from: l */
    public static void m45564l(int i, List<Double> list, sa9 sa9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            sa9.mo45555C(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m45565m(Class<?> cls) {
        Class<?> cls2;
        if (!C4105e0.class.isAssignableFrom(cls) && (cls2 = f29846a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: n */
    public static <T, FT extends n09<FT>> void m45566n(wz8<FT> wz8, T t, T t2) {
        i09<FT> c = wz8.mo31164c(t2);
        if (!c.f29780a.isEmpty()) {
            wz8.mo31167f(t).mo43438f(c);
        }
    }

    /* renamed from: o */
    public static <T> void m45567o(b59 b59, T t, T t2, long j) {
        l99.m47692j(t, j, b59.mo29462g(l99.m47673F(t, j), l99.m47673F(t2, j)));
    }

    /* renamed from: p */
    public static <T, UT, UB> void m45568p(o89<UT, UB> o89, T t, T t2) {
        o89.mo46347d(t, o89.mo46352i(o89.mo46349f(t), o89.mo46349f(t2)));
    }

    /* renamed from: q */
    public static boolean m45569q(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static int m45570r(int i, List<zzht> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int g0 = size * zzii.m34404g0(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            g0 += zzii.m34388I(list.get(i2));
        }
        return g0;
    }

    /* renamed from: s */
    public static int m45571s(int i, List<k59> list, g79 g79) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzii.m34394U(i, list.get(i3), g79);
        }
        return i2;
    }

    /* renamed from: t */
    public static int m45572t(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m45573u(list) + (size * zzii.m34404g0(i));
    }

    /* renamed from: u */
    public static int m45573u(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r39) {
            r39 r39 = (r39) list;
            i = 0;
            while (i2 < size) {
                i += zzii.m34406i0(r39.mo47334k(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzii.m34406i0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: v */
    public static o89<?, ?> m45574v() {
        return f29848c;
    }

    /* renamed from: w */
    public static void m45575w(int i, List<zzht> list, sa9 sa9) throws IOException {
        if (list != null && !list.isEmpty()) {
            sa9.mo45583q(i, list);
        }
    }

    /* renamed from: x */
    public static void m45576x(int i, List<?> list, sa9 sa9, g79 g79) throws IOException {
        if (list != null && !list.isEmpty()) {
            sa9.mo45562J(i, list, g79);
        }
    }

    /* renamed from: y */
    public static void m45577y(int i, List<Float> list, sa9 sa9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            sa9.mo45556D(i, list, z);
        }
    }

    /* renamed from: z */
    public static int m45578z(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m45523A(list) + (size * zzii.m34404g0(i));
    }
}
