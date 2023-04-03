package p000;

import java.util.Map;

/* renamed from: m99 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class m99 implements Map.Entry, Comparable<m99> {

    /* renamed from: a */
    public final Comparable f31603a;

    /* renamed from: d */
    public Object f31604d;

    /* renamed from: e */
    public final /* synthetic */ u99 f31605e;

    public m99(u99 u99, Comparable comparable, Object obj) {
        this.f31605e = u99;
        this.f31603a = comparable;
        this.f31604d = obj;
    }

    /* renamed from: d */
    public static final boolean m48195d(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 != null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final Comparable mo45721a() {
        return this.f31603a;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f31603a.compareTo(((m99) obj).f31603a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!m48195d(this.f31603a, entry.getKey()) || !m48195d(this.f31604d, entry.getValue())) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f31603a;
    }

    public final Object getValue() {
        return this.f31604d;
    }

    public final int hashCode() {
        int i;
        Comparable comparable = this.f31603a;
        int i2 = 0;
        if (comparable == null) {
            i = 0;
        } else {
            i = comparable.hashCode();
        }
        Object obj = this.f31604d;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return i ^ i2;
    }

    public final Object setValue(Object obj) {
        this.f31605e.mo48363m();
        Object obj2 = this.f31604d;
        this.f31604d = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f31603a);
        String valueOf2 = String.valueOf(this.f31604d);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
