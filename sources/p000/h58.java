package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: h58 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class h58 {

    /* renamed from: a */
    public String f29454a;

    /* renamed from: b */
    public final long f29455b;

    /* renamed from: c */
    public final Map<String, Object> f29456c;

    public h58(String str, long j, Map<String, Object> map) {
        this.f29454a = str;
        this.f29455b = j;
        HashMap hashMap = new HashMap();
        this.f29456c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    /* renamed from: a */
    public final long mo43084a() {
        return this.f29455b;
    }

    /* renamed from: b */
    public final String mo43085b() {
        return this.f29454a;
    }

    /* renamed from: c */
    public final void mo43086c(String str) {
        this.f29454a = str;
    }

    /* renamed from: d */
    public final void mo43088d(String str, Object obj) {
        if (obj == null) {
            this.f29456c.remove(str);
        } else {
            this.f29456c.put(str, obj);
        }
    }

    /* renamed from: e */
    public final Object mo43089e(String str) {
        if (this.f29456c.containsKey(str)) {
            return this.f29456c.get(str);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h58)) {
            return false;
        }
        h58 h58 = (h58) obj;
        if (this.f29455b == h58.f29455b && this.f29454a.equals(h58.f29454a)) {
            return this.f29456c.equals(h58.f29456c);
        }
        return false;
    }

    /* renamed from: f */
    public final Map<String, Object> mo43091f() {
        return this.f29456c;
    }

    /* renamed from: g */
    public final h58 clone() {
        return new h58(this.f29454a, this.f29455b, new HashMap(this.f29456c));
    }

    public final int hashCode() {
        int hashCode = this.f29454a.hashCode();
        long j = this.f29455b;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f29456c.hashCode();
    }

    public final String toString() {
        String str = this.f29454a;
        long j = this.f29455b;
        String valueOf = String.valueOf(this.f29456c);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55 + valueOf.length());
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j);
        sb.append(", params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
