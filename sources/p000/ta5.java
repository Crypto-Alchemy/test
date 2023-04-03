package p000;

import java.lang.ref.SoftReference;

/* renamed from: ta5 */
/* compiled from: ReflectProperties */
public class ta5 {

    /* renamed from: ta5$a */
    /* compiled from: ReflectProperties */
    public static class C9335a<T> extends C9337c<T> implements pc2<T> {

        /* renamed from: d */
        public final pc2<T> f44698d;

        /* renamed from: e */
        public volatile SoftReference<Object> f44699e;

        public C9335a(T t, pc2<T> pc2) {
            if (pc2 == null) {
                m72215d(0);
            }
            this.f44699e = null;
            this.f44698d = pc2;
            if (t != null) {
                this.f44699e = new SoftReference<>(mo66007a(t));
            }
        }

        /* renamed from: d */
        public static /* synthetic */ void m72215d(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"}));
        }

        public T invoke() {
            Object obj;
            SoftReference<Object> softReference = this.f44699e;
            if (softReference != null && (obj = softReference.get()) != null) {
                return mo66009c(obj);
            }
            T invoke = this.f44698d.invoke();
            this.f44699e = new SoftReference<>(mo66007a(invoke));
            return invoke;
        }
    }

    /* renamed from: ta5$b */
    /* compiled from: ReflectProperties */
    public static class C9336b<T> extends C9337c<T> {

        /* renamed from: d */
        public final pc2<T> f44700d;

        /* renamed from: e */
        public volatile Object f44701e;

        public C9336b(pc2<T> pc2) {
            if (pc2 == null) {
                m72216d(0);
            }
            this.f44701e = null;
            this.f44700d = pc2;
        }

        /* renamed from: d */
        public static /* synthetic */ void m72216d(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazyVal", "<init>"}));
        }

        public T invoke() {
            Object obj = this.f44701e;
            if (obj != null) {
                return mo66009c(obj);
            }
            T invoke = this.f44700d.invoke();
            this.f44701e = mo66007a(invoke);
            return invoke;
        }
    }

    /* renamed from: ta5$c */
    /* compiled from: ReflectProperties */
    public static abstract class C9337c<T> {

        /* renamed from: a */
        public static final Object f44702a = new C9338a();

        /* renamed from: ta5$c$a */
        /* compiled from: ReflectProperties */
        public static class C9338a {
        }

        /* renamed from: a */
        public Object mo66007a(T t) {
            if (t == null) {
                return f44702a;
            }
            return t;
        }

        /* renamed from: b */
        public final T mo66008b(Object obj, Object obj2) {
            return invoke();
        }

        /* renamed from: c */
        public T mo66009c(Object obj) {
            if (obj == f44702a) {
                return null;
            }
            return obj;
        }

        public abstract T invoke();
    }

    /* renamed from: a */
    public static /* synthetic */ void m72211a(int i) {
        Object[] objArr = new Object[3];
        objArr[0] = "initializer";
        objArr[1] = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i == 1 || i == 2) {
            objArr[2] = "lazySoft";
        } else {
            objArr[2] = "lazy";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: b */
    public static <T> C9336b<T> m72212b(pc2<T> pc2) {
        if (pc2 == null) {
            m72211a(0);
        }
        return new C9336b<>(pc2);
    }

    /* renamed from: c */
    public static <T> C9335a<T> m72213c(pc2<T> pc2) {
        if (pc2 == null) {
            m72211a(2);
        }
        return m72214d((Object) null, pc2);
    }

    /* renamed from: d */
    public static <T> C9335a<T> m72214d(T t, pc2<T> pc2) {
        if (pc2 == null) {
            m72211a(1);
        }
        return new C9335a<>(t, pc2);
    }
}
