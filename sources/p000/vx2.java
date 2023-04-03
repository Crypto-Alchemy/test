package p000;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* renamed from: vx2 */
/* compiled from: Intrinsics */
public class vx2 {
    /* renamed from: a */
    public static boolean m53585a(Double d, double d2) {
        if (d == null || d.doubleValue() != d2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m53586b(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static void m53587c(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) m53596l(new IllegalStateException(str + " must not be null")));
        }
    }

    /* renamed from: d */
    public static void m53588d(Object obj) {
        if (obj == null) {
            m53599o();
        }
    }

    /* renamed from: e */
    public static void m53589e(Object obj, String str) {
        if (obj == null) {
            m53600p(str);
        }
    }

    /* renamed from: f */
    public static void m53590f(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) m53596l(new NullPointerException(str + " must not be null")));
        }
    }

    /* renamed from: g */
    public static void m53591g(Object obj, String str) {
        if (obj == null) {
            m53603s(str);
        }
    }

    /* renamed from: h */
    public static void m53592h(Object obj, String str) {
        if (obj == null) {
            m53602r(str);
        }
    }

    /* renamed from: i */
    public static int m53593i(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: j */
    public static int m53594j(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    /* renamed from: k */
    public static String m53595k(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    /* renamed from: l */
    public static <T extends Throwable> T m53596l(T t) {
        return m53597m(t, vx2.class.getName());
    }

    /* renamed from: m */
    public static <T extends Throwable> T m53597m(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: n */
    public static String m53598n(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: o */
    public static void m53599o() {
        throw ((NullPointerException) m53596l(new NullPointerException()));
    }

    /* renamed from: p */
    public static void m53600p(String str) {
        throw ((NullPointerException) m53596l(new NullPointerException(str)));
    }

    /* renamed from: q */
    public static void m53601q() {
        throw ((KotlinNullPointerException) m53596l(new KotlinNullPointerException()));
    }

    /* renamed from: r */
    public static void m53602r(String str) {
        throw ((IllegalArgumentException) m53596l(new IllegalArgumentException(m53595k(str))));
    }

    /* renamed from: s */
    public static void m53603s(String str) {
        throw ((NullPointerException) m53596l(new NullPointerException(m53595k(str))));
    }

    /* renamed from: t */
    public static void m53604t(String str) {
        throw ((UninitializedPropertyAccessException) m53596l(new UninitializedPropertyAccessException(str)));
    }

    /* renamed from: u */
    public static void m53605u(String str) {
        m53604t("lateinit property " + str + " has not been initialized");
    }
}
