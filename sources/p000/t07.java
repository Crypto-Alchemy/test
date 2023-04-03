package p000;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: t07 */
/* compiled from: TypeIntrinsics */
public class t07 {
    /* renamed from: a */
    public static Collection m52022a(Object obj) {
        if ((obj instanceof a93) && !(obj instanceof b93)) {
            m52038q(obj, "kotlin.collections.MutableCollection");
        }
        return m52028g(obj);
    }

    /* renamed from: b */
    public static Iterable m52023b(Object obj) {
        if ((obj instanceof a93) && !(obj instanceof c93)) {
            m52038q(obj, "kotlin.collections.MutableIterable");
        }
        return m52029h(obj);
    }

    /* renamed from: c */
    public static List m52024c(Object obj) {
        if ((obj instanceof a93) && !(obj instanceof d93)) {
            m52038q(obj, "kotlin.collections.MutableList");
        }
        return m52030i(obj);
    }

    /* renamed from: d */
    public static Map m52025d(Object obj) {
        if ((obj instanceof a93) && !(obj instanceof e93)) {
            m52038q(obj, "kotlin.collections.MutableMap");
        }
        return m52031j(obj);
    }

    /* renamed from: e */
    public static Set m52026e(Object obj) {
        if ((obj instanceof a93) && !(obj instanceof h93)) {
            m52038q(obj, "kotlin.collections.MutableSet");
        }
        return m52032k(obj);
    }

    /* renamed from: f */
    public static Object m52027f(Object obj, int i) {
        if (obj != null && !m52034m(obj, i)) {
            m52038q(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    /* renamed from: g */
    public static Collection m52028g(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw m52037p(e);
        }
    }

    /* renamed from: h */
    public static Iterable m52029h(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw m52037p(e);
        }
    }

    /* renamed from: i */
    public static List m52030i(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw m52037p(e);
        }
    }

    /* renamed from: j */
    public static Map m52031j(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw m52037p(e);
        }
    }

    /* renamed from: k */
    public static Set m52032k(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw m52037p(e);
        }
    }

    /* renamed from: l */
    public static int m52033l(Object obj) {
        if (obj instanceof td2) {
            return ((td2) obj).getArity();
        }
        if (obj instanceof pc2) {
            return 0;
        }
        if (obj instanceof rc2) {
            return 1;
        }
        if (obj instanceof fd2) {
            return 2;
        }
        if (obj instanceof id2) {
            return 3;
        }
        if (obj instanceof kd2) {
            return 4;
        }
        if (obj instanceof md2) {
            return 5;
        }
        if (obj instanceof od2) {
            return 6;
        }
        if (obj instanceof pd2) {
            return 7;
        }
        if (obj instanceof qd2) {
            return 8;
        }
        if (obj instanceof rd2) {
            return 9;
        }
        if (obj instanceof qc2) {
            return 10;
        }
        if (obj instanceof sc2) {
            return 11;
        }
        if (obj instanceof tc2) {
            return 12;
        }
        if (obj instanceof uc2) {
            return 13;
        }
        if (obj instanceof vc2) {
            return 14;
        }
        if (obj instanceof wc2) {
            return 15;
        }
        if (obj instanceof xc2) {
            return 16;
        }
        if (obj instanceof yc2) {
            return 17;
        }
        if (obj instanceof zc2) {
            return 18;
        }
        if (obj instanceof ad2) {
            return 19;
        }
        if (obj instanceof cd2) {
            return 20;
        }
        if (obj instanceof dd2) {
            return 21;
        }
        if (obj instanceof ed2) {
            return 22;
        }
        return -1;
    }

    /* renamed from: m */
    public static boolean m52034m(Object obj, int i) {
        if (!(obj instanceof nd2) || m52033l(obj) != i) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public static boolean m52035n(Object obj) {
        if (!(obj instanceof Set) || ((obj instanceof a93) && !(obj instanceof h93))) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public static <T extends Throwable> T m52036o(T t) {
        return vx2.m53597m(t, t07.class.getName());
    }

    /* renamed from: p */
    public static ClassCastException m52037p(ClassCastException classCastException) {
        throw ((ClassCastException) m52036o(classCastException));
    }

    /* renamed from: q */
    public static void m52038q(Object obj, String str) {
        String str2;
        if (obj == null) {
            str2 = "null";
        } else {
            str2 = obj.getClass().getName();
        }
        m52039r(str2 + " cannot be cast to " + str);
    }

    /* renamed from: r */
    public static void m52039r(String str) {
        throw m52037p(new ClassCastException(str));
    }
}
