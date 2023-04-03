package p000;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: mf3 */
/* compiled from: LazyHeaders */
public final class mf3 implements ql2 {

    /* renamed from: c */
    public final Map<String, List<lf3>> f14962c;

    /* renamed from: d */
    public volatile Map<String, String> f14963d;

    /* renamed from: mf3$a */
    /* compiled from: LazyHeaders */
    public static final class C2826a {

        /* renamed from: d */
        public static final String f14964d;

        /* renamed from: e */
        public static final Map<String, List<lf3>> f14965e;

        /* renamed from: a */
        public boolean f14966a = true;

        /* renamed from: b */
        public Map<String, List<lf3>> f14967b = f14965e;

        /* renamed from: c */
        public boolean f14968c = true;

        static {
            String b = m22280b();
            f14964d = b;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(b)) {
                hashMap.put(Constants.USER_AGENT_HEADER_KEY, Collections.singletonList(new C2827b(b)));
            }
            f14965e = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: b */
        public static String m22280b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public mf3 mo23174a() {
            this.f14966a = true;
            return new mf3(this.f14967b);
        }
    }

    /* renamed from: mf3$b */
    /* compiled from: LazyHeaders */
    public static final class C2827b implements lf3 {

        /* renamed from: a */
        public final String f14969a;

        public C2827b(String str) {
            this.f14969a = str;
        }

        /* renamed from: a */
        public String mo22748a() {
            return this.f14969a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C2827b) {
                return this.f14969a.equals(((C2827b) obj).f14969a);
            }
            return false;
        }

        public int hashCode() {
            return this.f14969a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f14969a + '\'' + '}';
        }
    }

    public mf3(Map<String, List<lf3>> map) {
        this.f14962c = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public Map<String, String> mo23168a() {
        if (this.f14963d == null) {
            synchronized (this) {
                if (this.f14963d == null) {
                    this.f14963d = Collections.unmodifiableMap(mo23170c());
                }
            }
        }
        return this.f14963d;
    }

    /* renamed from: b */
    public final String mo23169b(List<lf3> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a = list.get(i).mo22748a();
            if (!TextUtils.isEmpty(a)) {
                sb.append(a);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public final Map<String, String> mo23170c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f14962c.entrySet()) {
            String b = mo23169b((List) next.getValue());
            if (!TextUtils.isEmpty(b)) {
                hashMap.put(next.getKey(), b);
            }
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof mf3) {
            return this.f14962c.equals(((mf3) obj).f14962c);
        }
        return false;
    }

    public int hashCode() {
        return this.f14962c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f14962c + '}';
    }
}
