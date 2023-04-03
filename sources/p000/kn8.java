package p000;

import java.util.Map;

/* renamed from: kn8 */
public final class kn8 implements Comparable, Map.Entry {

    /* renamed from: a */
    public final Comparable f30954a;

    /* renamed from: d */
    public Object f30955d;

    /* renamed from: e */
    public final /* synthetic */ qm8 f30956e;

    public kn8(qm8 qm8, Comparable comparable, Object obj) {
        this.f30956e = qm8;
        this.f30954a = comparable;
        this.f30955d = obj;
    }

    public kn8(qm8 qm8, Map.Entry entry) {
        this(qm8, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: a */
    public static boolean m47204a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((kn8) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m47204a(this.f30954a, entry.getKey()) && m47204a(this.f30955d, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f30954a;
    }

    public final Object getValue() {
        return this.f30955d;
    }

    public final int hashCode() {
        Comparable comparable = this.f30954a;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f30955d;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f30956e.mo47146p();
        Object obj2 = this.f30955d;
        this.f30955d = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f30954a);
        String valueOf2 = String.valueOf(this.f30955d);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
