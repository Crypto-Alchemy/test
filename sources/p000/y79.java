package p000;

import java.util.Map;

/* renamed from: y79 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class y79 implements Comparable, Map.Entry {

    /* renamed from: a */
    public final Comparable f35795a;

    /* renamed from: d */
    public Object f35796d;

    /* renamed from: e */
    public final /* synthetic */ o79 f35797e;

    public y79(o79 o79, Map.Entry entry) {
        this(o79, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: a */
    public static boolean m54653a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((y79) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!m54653a(this.f35795a, entry.getKey()) || !m54653a(this.f35796d, entry.getValue())) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ Object getKey() {
        return this.f35795a;
    }

    public final Object getValue() {
        return this.f35796d;
    }

    public final int hashCode() {
        int i;
        Comparable comparable = this.f35795a;
        int i2 = 0;
        if (comparable == null) {
            i = 0;
        } else {
            i = comparable.hashCode();
        }
        Object obj = this.f35796d;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return i ^ i2;
    }

    public final Object setValue(Object obj) {
        this.f35797e.mo46339q();
        Object obj2 = this.f35796d;
        this.f35796d = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f35795a);
        String valueOf2 = String.valueOf(this.f35796d);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    public y79(o79 o79, Comparable comparable, Object obj) {
        this.f35797e = o79;
        this.f35795a = comparable;
        this.f35796d = obj;
    }
}
