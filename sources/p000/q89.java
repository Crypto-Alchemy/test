package p000;

import com.google.android.gms.internal.measurement.C4087d;
import com.google.android.gms.internal.measurement.C4088e;
import com.google.android.gms.internal.measurement.zzjd;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: q89 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class q89 {

    /* renamed from: a */
    public static final Class<?> f32979a;

    /* renamed from: b */
    public static final z99<?, ?> f32980b = m50404C(false);

    /* renamed from: c */
    public static final z99<?, ?> f32981c = m50404C(true);

    /* renamed from: d */
    public static final z99<?, ?> f32982d = new ea9();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f32979a = cls;
    }

    /* renamed from: A */
    public static void m50402A(Class<?> cls) {
        Class<?> cls2;
        if (!s49.class.isAssignableFrom(cls) && (cls2 = f32979a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: B */
    public static void m50403B(int i, List<?> list, j29 j29, n89 n89) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                j29.mo44013D(i, list.get(i2), n89);
            }
        }
    }

    /* renamed from: C */
    public static z99<?, ?> m50404C(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (z99) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    public static int m50405D(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof m69) {
            m69 m69 = (m69) list;
            i = 0;
            while (i2 < size) {
                i += C4087d.m34150B(m69.mo44057Y(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4087d.m34150B(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: E */
    public static int m50406E(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m50405D(list) + (list.size() * C4087d.m34158y(i));
    }

    /* renamed from: F */
    public static int m50407F(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof m69) {
            m69 m69 = (m69) list;
            i = 0;
            while (i2 < size) {
                i += C4087d.m34150B(m69.mo44057Y(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4087d.m34150B(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: G */
    public static int m50408G(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m50407F(list) + (size * C4087d.m34158y(i));
    }

    /* renamed from: H */
    public static int m50409H(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof m69) {
            m69 m69 = (m69) list;
            i = 0;
            while (i2 < size) {
                long Y = m69.mo44057Y(i2);
                i += C4087d.m34150B((Y >> 63) ^ (Y + Y));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i3 = i + C4087d.m34150B((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: I */
    public static int m50410I(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m50409H(list) + (size * C4087d.m34158y(i));
    }

    /* renamed from: J */
    public static int m50411J(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof u49) {
            u49 u49 = (u49) list;
            i = 0;
            while (i2 < size) {
                i += C4087d.m34159z(u49.mo48312k(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4087d.m34159z(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: K */
    public static int m50412K(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m50411J(list) + (size * C4087d.m34158y(i));
    }

    /* renamed from: L */
    public static int m50413L(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof u49) {
            u49 u49 = (u49) list;
            i = 0;
            while (i2 < size) {
                i += C4087d.m34159z(u49.mo48312k(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4087d.m34159z(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: M */
    public static int m50414M(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m50413L(list) + (size * C4087d.m34158y(i));
    }

    /* renamed from: N */
    public static int m50415N(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof u49) {
            u49 u49 = (u49) list;
            i = 0;
            while (i2 < size) {
                i += C4087d.m34149A(u49.mo48312k(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4087d.m34149A(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    public static int m50416O(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m50415N(list) + (size * C4087d.m34158y(i));
    }

    /* renamed from: P */
    public static int m50417P(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof u49) {
            u49 u49 = (u49) list;
            i = 0;
            while (i2 < size) {
                int k = u49.mo48312k(i2);
                i += C4087d.m34149A((k >> 31) ^ (k + k));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i3 = i + C4087d.m34149A((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    public static int m50418Q(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m50417P(list) + (size * C4087d.m34158y(i));
    }

    /* renamed from: R */
    public static int m50419R(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: S */
    public static int m50420S(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C4087d.m34149A(i << 3) + 4);
    }

    /* renamed from: T */
    public static int m50421T(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: U */
    public static int m50422U(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C4087d.m34149A(i << 3) + 8);
    }

    /* renamed from: V */
    public static int m50423V(List<?> list) {
        return list.size();
    }

    /* renamed from: W */
    public static int m50424W(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C4087d.m34149A(i << 3) + 1);
    }

    /* renamed from: X */
    public static int m50425X(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int y = C4087d.m34158y(i) * size;
        if (list instanceof b69) {
            b69 b69 = (b69) list;
            while (i4 < size) {
                Object s0 = b69.mo29469s0(i4);
                if (s0 instanceof zzjd) {
                    i3 = C4087d.m34153a((zzjd) s0);
                } else {
                    i3 = C4087d.m34151C((String) s0);
                }
                y += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzjd) {
                    i2 = C4087d.m34153a((zzjd) obj);
                } else {
                    i2 = C4087d.m34151C((String) obj);
                }
                y += i2;
                i4++;
            }
        }
        return y;
    }

    /* renamed from: Y */
    public static int m50426Y(int i, Object obj, n89 n89) {
        if (!(obj instanceof C4088e)) {
            return C4087d.m34149A(i << 3) + C4087d.m34154b((r79) obj, n89);
        }
        int A = C4087d.m34149A(i << 3);
        int a = ((C4088e) obj).mo30904a();
        return A + C4087d.m34149A(a) + a;
    }

    /* renamed from: Z */
    public static int m50427Z(int i, List<?> list, n89 n89) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = C4087d.m34158y(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C4088e) {
                i2 = C4087d.m34152D((C4088e) obj);
            } else {
                i2 = C4087d.m34154b((r79) obj, n89);
            }
            y += i2;
        }
        return y;
    }

    /* renamed from: a */
    public static z99<?, ?> m50428a() {
        return f32980b;
    }

    /* renamed from: a0 */
    public static int m50429a0(int i, List<zzjd> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = size * C4087d.m34158y(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            y += C4087d.m34153a(list.get(i2));
        }
        return y;
    }

    /* renamed from: b */
    public static z99<?, ?> m50430b() {
        return f32981c;
    }

    /* renamed from: b0 */
    public static int m50431b0(int i, List<r79> list, n89 n89) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C4087d.m34155e(i, list.get(i3), n89);
        }
        return i2;
    }

    /* renamed from: c */
    public static z99<?, ?> m50432c() {
        return f32982d;
    }

    /* renamed from: d */
    public static boolean m50433d(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static <T, FT extends f39<FT>> void m50434e(w29<FT> w29, T t, T t2) {
        w29.mo48882b(t2);
        throw null;
    }

    /* renamed from: f */
    public static <T, UT, UB> void m50435f(z99<UT, UB> z99, T t, T t2) {
        z99.mo42193c(t, z99.mo42196f(z99.mo42194d(t), z99.mo42194d(t2)));
    }

    /* renamed from: g */
    public static <UT, UB> UB m50436g(int i, List<Integer> list, d59 d59, UB ub, z99<UT, UB> z99) {
        if (d59 == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (d59.mo29030d(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m50437h(i, intValue, ub, z99);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!d59.mo29030d(intValue2)) {
                    ub = m50437h(i, intValue2, ub, z99);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: h */
    public static <UT, UB> UB m50437h(int i, int i2, UB ub, z99<UT, UB> z99) {
        if (ub == null) {
            ub = z99.mo42192b();
        }
        z99.mo42191a(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: i */
    public static <T> void m50438i(h79 h79, T t, T t2, long j) {
        ta9.m52180t(t, j, h79.m45065b(ta9.m52179s(t, j), ta9.m52179s(t2, j)));
    }

    /* renamed from: j */
    public static void m50439j(int i, List<Double> list, j29 j29, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j29.mo44022b(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m50440k(int i, List<Float> list, j29 j29, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j29.mo44021a(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m50441l(int i, List<Long> list, j29 j29, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j29.mo44018I(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m50442m(int i, List<Long> list, j29 j29, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j29.mo44019J(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m50443n(int i, List<Long> list, j29 j29, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j29.mo44031k(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m50444o(int i, List<Long> list, j29 j29, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j29.mo44020K(i, list, z);
        }
    }

    /* renamed from: p */
    public static void m50445p(int i, List<Long> list, j29 j29, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j29.mo44029i(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m50446q(int i, List<Integer> list, j29 j29, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j29.mo44016G(i, list, z);
        }
    }

    /* renamed from: r */
    public static void m50447r(int i, List<Integer> list, j29 j29, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j29.mo44027g(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m50448s(int i, List<Integer> list, j29 j29, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j29.mo44030j(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m50449t(int i, List<Integer> list, j29 j29, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j29.mo44017H(i, list, z);
        }
    }

    /* renamed from: u */
    public static void m50450u(int i, List<Integer> list, j29 j29, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j29.mo44028h(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m50451v(int i, List<Integer> list, j29 j29, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j29.mo44023c(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m50452w(int i, List<Boolean> list, j29 j29, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j29.mo44024d(i, list, z);
        }
    }

    /* renamed from: x */
    public static void m50453x(int i, List<String> list, j29 j29) throws IOException {
        if (list != null && !list.isEmpty()) {
            j29.mo44025e(i, list);
        }
    }

    /* renamed from: y */
    public static void m50454y(int i, List<zzjd> list, j29 j29) throws IOException {
        if (list != null && !list.isEmpty()) {
            j29.mo44026f(i, list);
        }
    }

    /* renamed from: z */
    public static void m50455z(int i, List<?> list, j29 j29, n89 n89) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                j29.mo44012C(i, list.get(i2), n89);
            }
        }
    }
}
