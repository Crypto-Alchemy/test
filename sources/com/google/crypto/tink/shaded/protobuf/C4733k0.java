package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C4752p;
import com.google.crypto.tink.shaded.protobuf.C4758t;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.k0 */
/* compiled from: SchemaUtil */
public final class C4733k0 {

    /* renamed from: a */
    public static final Class<?> f25240a = m38118B();

    /* renamed from: b */
    public static final C4747m0<?, ?> f25241b = m38119C(false);

    /* renamed from: c */
    public static final C4747m0<?, ?> f25242c = m38119C(true);

    /* renamed from: d */
    public static final C4747m0<?, ?> f25243d = new a47();

    /* renamed from: A */
    public static <UT, UB> UB m38117A(int i, List<Integer> list, C4758t.C4763e eVar, UB ub, C4747m0<UT, UB> m0Var) {
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
                    ub = m38128L(i, intValue, ub, m0Var);
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
                    ub = m38128L(i, intValue2, ub, m0Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: B */
    public static Class<?> m38118B() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    public static C4747m0<?, ?> m38119C(boolean z) {
        try {
            Class<?> D = m38120D();
            if (D == null) {
                return null;
            }
            return (C4747m0) D.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    public static Class<?> m38120D() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: E */
    public static <T, FT extends C4752p.C4754b<FT>> void m38121E(C4746m<FT> mVar, T t, T t2) {
        C4752p<FT> c = mVar.mo35961c(t2);
        if (!c.mo35992m()) {
            mVar.mo35962d(t).mo35997t(c);
        }
    }

    /* renamed from: F */
    public static <T> void m38122F(C4701a0 a0Var, T t, T t2, long j) {
        q47.m50250W(t, j, a0Var.mo35608a(q47.m50234G(t, j), q47.m50234G(t2, j)));
    }

    /* renamed from: G */
    public static <T, UT, UB> void m38123G(C4747m0<UT, UB> m0Var, T t, T t2) {
        m0Var.mo28864p(t, m0Var.mo28861k(m0Var.mo28857g(t), m0Var.mo28857g(t2)));
    }

    /* renamed from: H */
    public static C4747m0<?, ?> m38124H() {
        return f25241b;
    }

    /* renamed from: I */
    public static C4747m0<?, ?> m38125I() {
        return f25242c;
    }

    /* renamed from: J */
    public static void m38126J(Class<?> cls) {
        Class<?> cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = f25240a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    /* renamed from: K */
    public static boolean m38127K(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public static <UT, UB> UB m38128L(int i, int i2, UB ub, C4747m0<UT, UB> m0Var) {
        if (ub == null) {
            ub = m0Var.mo28862n();
        }
        m0Var.mo28855e(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: M */
    public static C4747m0<?, ?> m38129M() {
        return f25243d;
    }

    /* renamed from: N */
    public static void m38130N(int i, List<Boolean> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo35560A(i, list, z);
        }
    }

    /* renamed from: O */
    public static void m38131O(int i, List<ByteString> list, Writer writer) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo35568I(i, list);
        }
    }

    /* renamed from: P */
    public static void m38132P(int i, List<Double> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo35566G(i, list, z);
        }
    }

    /* renamed from: Q */
    public static void m38133Q(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo35588n(i, list, z);
        }
    }

    /* renamed from: R */
    public static void m38134R(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo35584j(i, list, z);
        }
    }

    /* renamed from: S */
    public static void m38135S(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo35599y(i, list, z);
        }
    }

    /* renamed from: T */
    public static void m38136T(int i, List<Float> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo35575a(i, list, z);
        }
    }

    /* renamed from: U */
    public static void m38137U(int i, List<?> list, Writer writer, C4731j0 j0Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo35574O(i, list, j0Var);
        }
    }

    /* renamed from: V */
    public static void m38138V(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo35581g(i, list, z);
        }
    }

    /* renamed from: W */
    public static void m38139W(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo35565F(i, list, z);
        }
    }

    /* renamed from: X */
    public static void m38140X(int i, List<?> list, Writer writer, C4731j0 j0Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo35571L(i, list, j0Var);
        }
    }

    /* renamed from: Y */
    public static void m38141Y(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo35600z(i, list, z);
        }
    }

    /* renamed from: Z */
    public static void m38142Z(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo35591q(i, list, z);
        }
    }

    /* renamed from: a */
    public static int m38143a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m37212V(i) + CodedOutputStream.m37194D(size);
        }
        return size * CodedOutputStream.m37220e(i, true);
    }

    /* renamed from: a0 */
    public static void m38144a0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo35563D(i, list, z);
        }
    }

    /* renamed from: b */
    public static int m38145b(List<?> list) {
        return list.size();
    }

    /* renamed from: b0 */
    public static void m38146b0(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo35586l(i, list, z);
        }
    }

    /* renamed from: c */
    public static int m38147c(int i, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int V = size * CodedOutputStream.m37212V(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            V += CodedOutputStream.m37226i(list.get(i2));
        }
        return V;
    }

    /* renamed from: c0 */
    public static void m38148c0(int i, List<String> list, Writer writer) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo35578d(i, list);
        }
    }

    /* renamed from: d */
    public static int m38149d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = m38151e(list);
        if (z) {
            return CodedOutputStream.m37212V(i) + CodedOutputStream.m37194D(e);
        }
        return e + (size * CodedOutputStream.m37212V(i));
    }

    /* renamed from: d0 */
    public static void m38150d0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo35585k(i, list, z);
        }
    }

    /* renamed from: e */
    public static int m38151e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4757s) {
            C4757s sVar = (C4757s) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m37230m(sVar.mo36035s(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m37230m(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e0 */
    public static void m38152e0(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo35592r(i, list, z);
        }
    }

    /* renamed from: f */
    public static int m38153f(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m37212V(i) + CodedOutputStream.m37194D(size * 4);
        }
        return size * CodedOutputStream.m37231n(i, 0);
    }

    /* renamed from: g */
    public static int m38154g(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    public static int m38155h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m37212V(i) + CodedOutputStream.m37194D(size * 8);
        }
        return size * CodedOutputStream.m37233p(i, 0);
    }

    /* renamed from: i */
    public static int m38156i(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    public static int m38157j(int i, List<C4705c0> list, C4731j0 j0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += CodedOutputStream.m37237t(i, list.get(i3), j0Var);
        }
        return i2;
    }

    /* renamed from: k */
    public static int m38158k(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = m38159l(list);
        if (z) {
            return CodedOutputStream.m37212V(i) + CodedOutputStream.m37194D(l);
        }
        return l + (size * CodedOutputStream.m37212V(i));
    }

    /* renamed from: l */
    public static int m38159l(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4757s) {
            C4757s sVar = (C4757s) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m37241x(sVar.mo36035s(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m37241x(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: m */
    public static int m38160m(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int n = m38161n(list);
        if (z) {
            return CodedOutputStream.m37212V(i) + CodedOutputStream.m37194D(n);
        }
        return n + (list.size() * CodedOutputStream.m37212V(i));
    }

    /* renamed from: n */
    public static int m38161n(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4778y) {
            C4778y yVar = (C4778y) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m37243z(yVar.mo36087s(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m37243z(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: o */
    public static int m38162o(int i, Object obj, C4731j0 j0Var) {
        if (obj instanceof C4772v) {
            return CodedOutputStream.m37192B(i, (C4772v) obj);
        }
        return CodedOutputStream.m37197G(i, (C4705c0) obj, j0Var);
    }

    /* renamed from: p */
    public static int m38163p(int i, List<?> list, C4731j0 j0Var) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int V = CodedOutputStream.m37212V(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C4772v) {
                i2 = CodedOutputStream.m37193C((C4772v) obj);
            } else {
                i2 = CodedOutputStream.m37199I((C4705c0) obj, j0Var);
            }
            V += i2;
        }
        return V;
    }

    /* renamed from: q */
    public static int m38164q(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r = m38165r(list);
        if (z) {
            return CodedOutputStream.m37212V(i) + CodedOutputStream.m37194D(r);
        }
        return r + (size * CodedOutputStream.m37212V(i));
    }

    /* renamed from: r */
    public static int m38165r(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4757s) {
            C4757s sVar = (C4757s) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m37207Q(sVar.mo36035s(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m37207Q(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: s */
    public static int m38166s(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = m38167t(list);
        if (z) {
            return CodedOutputStream.m37212V(i) + CodedOutputStream.m37194D(t);
        }
        return t + (size * CodedOutputStream.m37212V(i));
    }

    /* renamed from: t */
    public static int m38167t(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4778y) {
            C4778y yVar = (C4778y) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m37209S(yVar.mo36087s(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m37209S(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: u */
    public static int m38168u(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int V = CodedOutputStream.m37212V(i) * size;
        if (list instanceof yf3) {
            yf3 yf3 = (yf3) list;
            while (i4 < size) {
                Object m = yf3.mo36064m(i4);
                if (m instanceof ByteString) {
                    i3 = CodedOutputStream.m37226i((ByteString) m);
                } else {
                    i3 = CodedOutputStream.m37211U((String) m);
                }
                V += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof ByteString) {
                    i2 = CodedOutputStream.m37226i((ByteString) obj);
                } else {
                    i2 = CodedOutputStream.m37211U((String) obj);
                }
                V += i2;
                i4++;
            }
        }
        return V;
    }

    /* renamed from: v */
    public static int m38169v(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w = m38170w(list);
        if (z) {
            return CodedOutputStream.m37212V(i) + CodedOutputStream.m37194D(w);
        }
        return w + (size * CodedOutputStream.m37212V(i));
    }

    /* renamed from: w */
    public static int m38170w(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4757s) {
            C4757s sVar = (C4757s) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m37214X(sVar.mo36035s(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m37214X(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: x */
    public static int m38171x(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = m38172y(list);
        if (z) {
            return CodedOutputStream.m37212V(i) + CodedOutputStream.m37194D(y);
        }
        return y + (size * CodedOutputStream.m37212V(i));
    }

    /* renamed from: y */
    public static int m38172y(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4778y) {
            C4778y yVar = (C4778y) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m37216Z(yVar.mo36087s(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m37216Z(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: z */
    public static <UT, UB> UB m38173z(int i, List<Integer> list, C4758t.C4762d<?> dVar, UB ub, C4747m0<UT, UB> m0Var) {
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
                    ub = m38128L(i, intValue, ub, m0Var);
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
                    ub = m38128L(i, intValue2, ub, m0Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
