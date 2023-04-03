package com.google.protobuf;

import com.google.protobuf.C5005p;
import com.google.protobuf.C5011t;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.k0 */
/* compiled from: SchemaUtil */
public final class C4986k0 {

    /* renamed from: a */
    public static final Class<?> f25696a = m39715B();

    /* renamed from: b */
    public static final C5000m0<?, ?> f25697b = m39716C(false);

    /* renamed from: c */
    public static final C5000m0<?, ?> f25698c = m39716C(true);

    /* renamed from: d */
    public static final C5000m0<?, ?> f25699d = new z37();

    /* renamed from: A */
    public static <UT, UB> UB m39714A(int i, List<Integer> list, C5011t.C5016e eVar, UB ub, C5000m0<UT, UB> m0Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (eVar.isInRange(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m39725L(i, intValue, ub, m0Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.isInRange(intValue2)) {
                    ub = m39725L(i, intValue2, ub, m0Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: B */
    public static Class<?> m39715B() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    public static C5000m0<?, ?> m39716C(boolean z) {
        try {
            Class<?> D = m39717D();
            if (D == null) {
                return null;
            }
            return (C5000m0) D.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    public static Class<?> m39717D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: E */
    public static <T, FT extends C5005p.C5007b<FT>> void m39718E(C4999m<FT> mVar, T t, T t2) {
        C5005p<FT> c = mVar.mo37424c(t2);
        if (!c.mo37477n()) {
            mVar.mo37425d(t).mo37482v(c);
        }
    }

    /* renamed from: F */
    public static <T> void m39719F(C4952a0 a0Var, T t, T t2, long j) {
        p47.m49703W(t, j, a0Var.mo37061a(p47.m49687G(t, j), p47.m49687G(t2, j)));
    }

    /* renamed from: G */
    public static <T, UT, UB> void m39720G(C5000m0<UT, UB> m0Var, T t, T t2) {
        m0Var.mo37447p(t, m0Var.mo37442k(m0Var.mo37438g(t), m0Var.mo37438g(t2)));
    }

    /* renamed from: H */
    public static C5000m0<?, ?> m39721H() {
        return f25697b;
    }

    /* renamed from: I */
    public static C5000m0<?, ?> m39722I() {
        return f25698c;
    }

    /* renamed from: J */
    public static void m39723J(Class<?> cls) {
        Class<?> cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = f25696a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    /* renamed from: K */
    public static boolean m39724K(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public static <UT, UB> UB m39725L(int i, int i2, UB ub, C5000m0<UT, UB> m0Var) {
        if (ub == null) {
            ub = m0Var.mo37445n();
        }
        m0Var.mo37436e(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: M */
    public static C5000m0<?, ?> m39726M() {
        return f25699d;
    }

    /* renamed from: N */
    public static void m39727N(int i, List<Boolean> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo37000A(i, list, z);
        }
    }

    /* renamed from: O */
    public static void m39728O(int i, List<ByteString> list, Writer writer) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo37008I(i, list);
        }
    }

    /* renamed from: P */
    public static void m39729P(int i, List<Double> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo37006G(i, list, z);
        }
    }

    /* renamed from: Q */
    public static void m39730Q(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo37028n(i, list, z);
        }
    }

    /* renamed from: R */
    public static void m39731R(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo37024j(i, list, z);
        }
    }

    /* renamed from: S */
    public static void m39732S(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo37039y(i, list, z);
        }
    }

    /* renamed from: T */
    public static void m39733T(int i, List<Float> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo37015a(i, list, z);
        }
    }

    /* renamed from: U */
    public static void m39734U(int i, List<?> list, Writer writer, C4984j0 j0Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo37012M(i, list, j0Var);
        }
    }

    /* renamed from: V */
    public static void m39735V(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo37021g(i, list, z);
        }
    }

    /* renamed from: W */
    public static void m39736W(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo37005F(i, list, z);
        }
    }

    /* renamed from: X */
    public static void m39737X(int i, List<?> list, Writer writer, C4984j0 j0Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo37009J(i, list, j0Var);
        }
    }

    /* renamed from: Y */
    public static void m39738Y(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo37040z(i, list, z);
        }
    }

    /* renamed from: Z */
    public static void m39739Z(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo37031q(i, list, z);
        }
    }

    /* renamed from: a */
    public static int m39740a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m38786V(i) + CodedOutputStream.m38768D(size);
        }
        return size * CodedOutputStream.m38794e(i, true);
    }

    /* renamed from: a0 */
    public static void m39741a0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo37003D(i, list, z);
        }
    }

    /* renamed from: b */
    public static int m39742b(List<?> list) {
        return list.size();
    }

    /* renamed from: b0 */
    public static void m39743b0(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo37026l(i, list, z);
        }
    }

    /* renamed from: c */
    public static int m39744c(int i, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int V = size * CodedOutputStream.m38786V(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            V += CodedOutputStream.m38801i(list.get(i2));
        }
        return V;
    }

    /* renamed from: c0 */
    public static void m39745c0(int i, List<String> list, Writer writer) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo37018d(i, list);
        }
    }

    /* renamed from: d */
    public static int m39746d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = m39748e(list);
        if (z) {
            return CodedOutputStream.m38786V(i) + CodedOutputStream.m38768D(e);
        }
        return e + (size * CodedOutputStream.m38786V(i));
    }

    /* renamed from: d0 */
    public static void m39747d0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo37025k(i, list, z);
        }
    }

    /* renamed from: e */
    public static int m39748e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5010s) {
            C5010s sVar = (C5010s) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m38805m(sVar.mo37521t(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m38805m(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e0 */
    public static void m39749e0(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo37032r(i, list, z);
        }
    }

    /* renamed from: f */
    public static int m39750f(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m38786V(i) + CodedOutputStream.m38768D(size * 4);
        }
        return size * CodedOutputStream.m38806n(i, 0);
    }

    /* renamed from: g */
    public static int m39751g(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    public static int m39752h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m38786V(i) + CodedOutputStream.m38768D(size * 8);
        }
        return size * CodedOutputStream.m38808p(i, 0);
    }

    /* renamed from: i */
    public static int m39753i(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    public static int m39754j(int i, List<C4956c0> list, C4984j0 j0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += CodedOutputStream.m38812t(i, list.get(i3), j0Var);
        }
        return i2;
    }

    /* renamed from: k */
    public static int m39755k(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = m39756l(list);
        if (z) {
            return CodedOutputStream.m38786V(i) + CodedOutputStream.m38768D(l);
        }
        return l + (size * CodedOutputStream.m38786V(i));
    }

    /* renamed from: l */
    public static int m39756l(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5010s) {
            C5010s sVar = (C5010s) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m38816x(sVar.mo37521t(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m38816x(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: m */
    public static int m39757m(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int n = m39758n(list);
        if (z) {
            return CodedOutputStream.m38786V(i) + CodedOutputStream.m38768D(n);
        }
        return n + (list.size() * CodedOutputStream.m38786V(i));
    }

    /* renamed from: n */
    public static int m39758n(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5031y) {
            C5031y yVar = (C5031y) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m38818z(yVar.mo37575t(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m38818z(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: o */
    public static int m39759o(int i, Object obj, C4984j0 j0Var) {
        if (obj instanceof C5025v) {
            return CodedOutputStream.m38766B(i, (C5025v) obj);
        }
        return CodedOutputStream.m38771G(i, (C4956c0) obj, j0Var);
    }

    /* renamed from: p */
    public static int m39760p(int i, List<?> list, C4984j0 j0Var) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int V = CodedOutputStream.m38786V(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C5025v) {
                i2 = CodedOutputStream.m38767C((C5025v) obj);
            } else {
                i2 = CodedOutputStream.m38773I((C4956c0) obj, j0Var);
            }
            V += i2;
        }
        return V;
    }

    /* renamed from: q */
    public static int m39761q(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r = m39762r(list);
        if (z) {
            return CodedOutputStream.m38786V(i) + CodedOutputStream.m38768D(r);
        }
        return r + (size * CodedOutputStream.m38786V(i));
    }

    /* renamed from: r */
    public static int m39762r(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5010s) {
            C5010s sVar = (C5010s) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m38781Q(sVar.mo37521t(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m38781Q(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: s */
    public static int m39763s(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = m39764t(list);
        if (z) {
            return CodedOutputStream.m38786V(i) + CodedOutputStream.m38768D(t);
        }
        return t + (size * CodedOutputStream.m38786V(i));
    }

    /* renamed from: t */
    public static int m39764t(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5031y) {
            C5031y yVar = (C5031y) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m38783S(yVar.mo37575t(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m38783S(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: u */
    public static int m39765u(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int V = CodedOutputStream.m38786V(i) * size;
        if (list instanceof wf3) {
            wf3 wf3 = (wf3) list;
            while (i4 < size) {
                Object m = wf3.mo37550m(i4);
                if (m instanceof ByteString) {
                    i3 = CodedOutputStream.m38801i((ByteString) m);
                } else {
                    i3 = CodedOutputStream.m38785U((String) m);
                }
                V += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof ByteString) {
                    i2 = CodedOutputStream.m38801i((ByteString) obj);
                } else {
                    i2 = CodedOutputStream.m38785U((String) obj);
                }
                V += i2;
                i4++;
            }
        }
        return V;
    }

    /* renamed from: v */
    public static int m39766v(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w = m39767w(list);
        if (z) {
            return CodedOutputStream.m38786V(i) + CodedOutputStream.m38768D(w);
        }
        return w + (size * CodedOutputStream.m38786V(i));
    }

    /* renamed from: w */
    public static int m39767w(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5010s) {
            C5010s sVar = (C5010s) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m38788X(sVar.mo37521t(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m38788X(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: x */
    public static int m39768x(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = m39769y(list);
        if (z) {
            return CodedOutputStream.m38786V(i) + CodedOutputStream.m38768D(y);
        }
        return y + (size * CodedOutputStream.m38786V(i));
    }

    /* renamed from: y */
    public static int m39769y(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5031y) {
            C5031y yVar = (C5031y) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m38790Z(yVar.mo37575t(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m38790Z(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: z */
    public static <UT, UB> UB m39770z(int i, List<Integer> list, C5011t.C5015d<?> dVar, UB ub, C5000m0<UT, UB> m0Var) {
        if (dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (dVar.findValueByNumber(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m39725L(i, intValue, ub, m0Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.findValueByNumber(intValue2) == null) {
                    ub = m39725L(i, intValue2, ub, m0Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
