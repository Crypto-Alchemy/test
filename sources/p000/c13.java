package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: c13 */
/* compiled from: JavaDescriptorVisibilities */
public class c13 {

    /* renamed from: a */
    public static final fd1 f37030a;

    /* renamed from: b */
    public static final fd1 f37031b;

    /* renamed from: c */
    public static final fd1 f37032c;

    /* renamed from: d */
    public static final Map<if7, fd1> f37033d = new HashMap();

    /* renamed from: c13$a */
    /* compiled from: JavaDescriptorVisibilities */
    public static class C6916a extends pb1 {
        public C6916a(if7 if7) {
            super(if7);
        }

        /* renamed from: g */
        public static /* synthetic */ void m56265g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: e */
        public boolean mo50771e(j85 j85, k31 k31, d31 d31, boolean z) {
            if (k31 == null) {
                m56265g(0);
            }
            if (d31 == null) {
                m56265g(1);
            }
            return c13.m56261d(k31, d31);
        }
    }

    /* renamed from: c13$b */
    /* compiled from: JavaDescriptorVisibilities */
    public static class C6917b extends pb1 {
        public C6917b(if7 if7) {
            super(if7);
        }

        /* renamed from: g */
        public static /* synthetic */ void m56267g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: e */
        public boolean mo50771e(j85 j85, k31 k31, d31 d31, boolean z) {
            if (k31 == null) {
                m56267g(0);
            }
            if (d31 == null) {
                m56267g(1);
            }
            return c13.m56262e(j85, k31, d31);
        }
    }

    /* renamed from: c13$c */
    /* compiled from: JavaDescriptorVisibilities */
    public static class C6918c extends pb1 {
        public C6918c(if7 if7) {
            super(if7);
        }

        /* renamed from: g */
        public static /* synthetic */ void m56269g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: e */
        public boolean mo50771e(j85 j85, k31 k31, d31 d31, boolean z) {
            if (k31 == null) {
                m56269g(0);
            }
            if (d31 == null) {
                m56269g(1);
            }
            return c13.m56262e(j85, k31, d31);
        }
    }

    static {
        C6916a aVar = new C6916a(q23.f44148c);
        f37030a = aVar;
        C6917b bVar = new C6917b(s23.f44522c);
        f37031b = bVar;
        C6918c cVar = new C6918c(r23.f44280c);
        f37032c = cVar;
        m56263f(aVar);
        m56263f(bVar);
        m56263f(cVar);
    }

    /* renamed from: a */
    public static /* synthetic */ void m56258a(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 5 || i == 6) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (!(i == 5 || i == 6)) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String format = String.format(str, objArr);
        throw ((i == 5 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: d */
    public static boolean m56261d(d31 d31, d31 d312) {
        Class<fk4> cls = fk4.class;
        if (d31 == null) {
            m56258a(2);
        }
        if (d312 == null) {
            m56258a(3);
        }
        fk4 fk4 = (fk4) dd1.m56826r(d31, cls, false);
        fk4 fk42 = (fk4) dd1.m56826r(d312, cls, false);
        if (fk42 == null || fk4 == null || !fk4.mo51711e().equals(fk42.mo51711e())) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m56262e(j85 j85, k31 k31, d31 d31) {
        if (k31 == null) {
            m56258a(0);
        }
        if (d31 == null) {
            m56258a(1);
        }
        if (m56261d(dd1.m56808M(k31), d31)) {
            return true;
        }
        return ed1.f37508c.mo50771e(j85, k31, d31, false);
    }

    /* renamed from: f */
    public static void m56263f(fd1 fd1) {
        f37033d.put(fd1.mo51641b(), fd1);
    }

    /* renamed from: g */
    public static fd1 m56264g(if7 if7) {
        if (if7 == null) {
            m56258a(4);
        }
        fd1 fd1 = f37033d.get(if7);
        if (fd1 != null) {
            return fd1;
        }
        fd1 j = ed1.m57285j(if7);
        if (j == null) {
            m56258a(5);
        }
        return j;
    }
}
