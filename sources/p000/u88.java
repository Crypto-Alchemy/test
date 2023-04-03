package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: u88 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class u88 implements r88 {

    /* renamed from: a */
    public final String f34476a;

    /* renamed from: d */
    public final ArrayList<r88> f34477d;

    public u88(String str, List<r88> list) {
        this.f34476a = str;
        ArrayList<r88> arrayList = new ArrayList<>();
        this.f34477d = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: a */
    public final String mo48342a() {
        return this.f34476a;
    }

    /* renamed from: b */
    public final Double mo29499b() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    /* renamed from: c */
    public final Boolean mo29500c() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    /* renamed from: d */
    public final ArrayList<r88> mo48343d() {
        return this.f34477d;
    }

    /* renamed from: e */
    public final Iterator<r88> mo29501e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u88)) {
            return false;
        }
        u88 u88 = (u88) obj;
        String str = this.f34476a;
        if (str == null ? u88.f34476a == null : str.equals(u88.f34476a)) {
            return this.f34477d.equals(u88.f34477d);
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.f34476a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (i * 31) + this.f34477d.hashCode();
    }

    /* renamed from: n */
    public final r88 mo29505n() {
        return this;
    }

    /* renamed from: o */
    public final r88 mo29506o(String str, ps8 ps8, List<r88> list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final String zzc() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }
}
