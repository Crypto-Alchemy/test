package p000;

import java.util.Arrays;

/* renamed from: hf4 */
/* compiled from: Objects */
public final class hf4 {

    /* renamed from: hf4$b */
    /* compiled from: Objects */
    public static final class C2469b {

        /* renamed from: a */
        public final String f12869a;

        /* renamed from: b */
        public final C2470a f12870b;

        /* renamed from: c */
        public C2470a f12871c;

        /* renamed from: d */
        public boolean f12872d;

        /* renamed from: hf4$b$a */
        /* compiled from: Objects */
        public static final class C2470a {

            /* renamed from: a */
            public String f12873a;

            /* renamed from: b */
            public Object f12874b;

            /* renamed from: c */
            public C2470a f12875c;

            public C2470a() {
            }
        }

        /* renamed from: a */
        public C2469b mo21157a(String str, int i) {
            return mo21161e(str, String.valueOf(i));
        }

        /* renamed from: b */
        public C2469b mo21158b(String str, Object obj) {
            return mo21161e(str, obj);
        }

        /* renamed from: c */
        public C2469b mo21159c(String str, boolean z) {
            return mo21161e(str, String.valueOf(z));
        }

        /* renamed from: d */
        public final C2470a mo21160d() {
            C2470a aVar = new C2470a();
            this.f12871c.f12875c = aVar;
            this.f12871c = aVar;
            return aVar;
        }

        /* renamed from: e */
        public final C2469b mo21161e(String str, Object obj) {
            C2470a d = mo21160d();
            d.f12874b = obj;
            d.f12873a = (String) au4.m10792g(str);
            return this;
        }

        public String toString() {
            boolean z = this.f12872d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f12869a);
            sb.append('{');
            String str = "";
            for (C2470a aVar = this.f12870b.f12875c; aVar != null; aVar = aVar.f12875c) {
                Object obj = aVar.f12874b;
                if (!z || obj != null) {
                    sb.append(str);
                    String str2 = aVar.f12873a;
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
            }
            sb.append('}');
            return sb.toString();
        }

        public C2469b(String str) {
            C2470a aVar = new C2470a();
            this.f12870b = aVar;
            this.f12871c = aVar;
            this.f12872d = false;
            this.f12869a = (String) au4.m10792g(str);
        }
    }

    /* renamed from: a */
    public static boolean m18860a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m18861b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: c */
    public static C2469b m18862c(Object obj) {
        return new C2469b(obj.getClass().getSimpleName());
    }
}
