package p000;

import com.google.common.base.Optional;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* renamed from: dy3 */
/* compiled from: MoreObjects */
public final class dy3 {

    /* renamed from: dy3$b */
    /* compiled from: MoreObjects */
    public static final class C5748b {

        /* renamed from: a */
        public final String f28331a;

        /* renamed from: b */
        public final C5750b f28332b;

        /* renamed from: c */
        public C5750b f28333c;

        /* renamed from: d */
        public boolean f28334d;

        /* renamed from: e */
        public boolean f28335e;

        /* renamed from: dy3$b$a */
        /* compiled from: MoreObjects */
        public static final class C5749a extends C5750b {
            public C5749a() {
                super();
            }
        }

        /* renamed from: dy3$b$b */
        /* compiled from: MoreObjects */
        public static class C5750b {

            /* renamed from: a */
            public String f28336a;

            /* renamed from: b */
            public Object f28337b;

            /* renamed from: c */
            public C5750b f28338c;

            public C5750b() {
            }
        }

        /* renamed from: i */
        public static boolean m43722i(Object obj) {
            if (obj instanceof CharSequence) {
                if (((CharSequence) obj).length() == 0) {
                    return true;
                }
                return false;
            } else if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            } else {
                if (obj instanceof Map) {
                    return ((Map) obj).isEmpty();
                }
                if (obj instanceof Optional) {
                    return !((Optional) obj).isPresent();
                }
                if (!obj.getClass().isArray()) {
                    return false;
                }
                if (Array.getLength(obj) == 0) {
                    return true;
                }
                return false;
            }
        }

        @CanIgnoreReturnValue
        /* renamed from: a */
        public C5748b mo42078a(String str, int i) {
            return mo42084g(str, String.valueOf(i));
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public C5748b mo42079b(String str, Object obj) {
            return mo42082e(str, obj);
        }

        /* renamed from: c */
        public final C5750b mo42080c() {
            C5750b bVar = new C5750b();
            this.f28333c.f28338c = bVar;
            this.f28333c = bVar;
            return bVar;
        }

        /* renamed from: d */
        public final C5748b mo42081d(Object obj) {
            mo42080c().f28337b = obj;
            return this;
        }

        /* renamed from: e */
        public final C5748b mo42082e(String str, Object obj) {
            C5750b c = mo42080c();
            c.f28337b = obj;
            c.f28336a = (String) du4.m43691k(str);
            return this;
        }

        /* renamed from: f */
        public final C5749a mo42083f() {
            C5749a aVar = new C5749a();
            this.f28333c.f28338c = aVar;
            this.f28333c = aVar;
            return aVar;
        }

        /* renamed from: g */
        public final C5748b mo42084g(String str, Object obj) {
            C5749a f = mo42083f();
            f.f28337b = obj;
            f.f28336a = (String) du4.m43691k(str);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: h */
        public C5748b mo42085h(Object obj) {
            return mo42081d(obj);
        }

        public String toString() {
            boolean z = this.f28334d;
            boolean z2 = this.f28335e;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f28331a);
            sb.append('{');
            String str = "";
            for (C5750b bVar = this.f28332b.f28338c; bVar != null; bVar = bVar.f28338c) {
                Object obj = bVar.f28337b;
                if (!(bVar instanceof C5749a)) {
                    if (obj == null) {
                        if (z) {
                        }
                    } else if (z2 && m43722i(obj)) {
                    }
                }
                sb.append(str);
                String str2 = bVar.f28336a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append(deepToString, 1, deepToString.length() - 1);
                }
                str = ", ";
            }
            sb.append('}');
            return sb.toString();
        }

        public C5748b(String str) {
            C5750b bVar = new C5750b();
            this.f28332b = bVar;
            this.f28333c = bVar;
            this.f28334d = false;
            this.f28335e = false;
            this.f28331a = (String) du4.m43691k(str);
        }
    }

    /* renamed from: a */
    public static <T> T m43720a(T t, T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    /* renamed from: b */
    public static C5748b m43721b(Object obj) {
        return new C5748b(obj.getClass().getSimpleName());
    }
}
