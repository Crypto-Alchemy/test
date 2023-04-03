package kotlin.reflect.jvm.internal.impl.utils;

public class WrappedValues {

    /* renamed from: a */
    public static final Object f40328a = new C7741a();

    /* renamed from: b */
    public static volatile boolean f40329b = false;

    public static class WrappedProcessCanceledException extends RuntimeException {
        public WrappedProcessCanceledException(Throwable th) {
            super("Rethrow stored exception", th);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.WrappedValues$a */
    public static class C7741a {
        public String toString() {
            return "NULL_VALUE";
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.WrappedValues$b */
    public static final class C7742b {

        /* renamed from: a */
        public final Throwable f40330a;

        public /* synthetic */ C7742b(Throwable th, C7741a aVar) {
            this(th);
        }

        /* renamed from: a */
        public static /* synthetic */ void m63000a(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 1 ? 3 : 2)];
            if (i != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i != 1) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 1 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        /* renamed from: b */
        public Throwable mo55404b() {
            Throwable th = this.f40330a;
            if (th == null) {
                m63000a(1);
            }
            return th;
        }

        public String toString() {
            return this.f40330a.toString();
        }

        public C7742b(Throwable th) {
            if (th == null) {
                m63000a(0);
            }
            this.f40330a = th;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m62994a(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2) ? 2 : 3)];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i == 1 || i == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public static <V> Object m62995b(V v) {
        if (v == null && (v = f40328a) == null) {
            m62994a(1);
        }
        return v;
    }

    /* renamed from: c */
    public static Object m62996c(Throwable th) {
        if (th == null) {
            m62994a(3);
        }
        return new C7742b(th, (C7741a) null);
    }

    /* renamed from: d */
    public static <V> V m62997d(Object obj) {
        if (obj == null) {
            m62994a(4);
        }
        return m62998e(m62999f(obj));
    }

    /* renamed from: e */
    public static <V> V m62998e(Object obj) {
        if (obj == null) {
            m62994a(0);
        }
        if (obj == f40328a) {
            return null;
        }
        return obj;
    }

    /* renamed from: f */
    public static <V> V m62999f(Object obj) {
        if (!(obj instanceof C7742b)) {
            return obj;
        }
        Throwable b = ((C7742b) obj).mo55404b();
        if (!f40329b || !nu1.m70087a(b)) {
            throw nu1.m70088b(b);
        }
        throw new WrappedProcessCanceledException(b);
    }
}
