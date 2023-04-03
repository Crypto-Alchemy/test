package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: l88 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class l88 extends j78 {

    /* renamed from: e */
    public final List<String> f31209e;

    /* renamed from: g */
    public final List<r88> f31210g;

    /* renamed from: k */
    public ps8 f31211k;

    public l88(l88 l88) {
        super(l88.f30236a);
        ArrayList arrayList = new ArrayList(l88.f31209e.size());
        this.f31209e = arrayList;
        arrayList.addAll(l88.f31209e);
        ArrayList arrayList2 = new ArrayList(l88.f31210g.size());
        this.f31210g = arrayList2;
        arrayList2.addAll(l88.f31210g);
        this.f31211k = l88.f31211k;
    }

    /* renamed from: a */
    public final r88 mo29623a(ps8 ps8, List<r88> list) {
        ps8 c = this.f31211k.mo46867c();
        for (int i = 0; i < this.f31209e.size(); i++) {
            if (i < list.size()) {
                c.mo46870f(this.f31209e.get(i), ps8.mo46865a(list.get(i)));
            } else {
                c.mo46870f(this.f31209e.get(i), r88.f33330g1);
            }
        }
        for (r88 next : this.f31210g) {
            r88 a = c.mo46865a(next);
            if (a instanceof u88) {
                a = c.mo46865a(next);
            }
            if (a instanceof y68) {
                return ((y68) a).mo49602a();
            }
        }
        return r88.f33330g1;
    }

    /* renamed from: n */
    public final r88 mo29505n() {
        return new l88(this);
    }

    public l88(String str, List<r88> list, List<r88> list2, ps8 ps8) {
        super(str);
        this.f31209e = new ArrayList();
        this.f31211k = ps8;
        if (!list.isEmpty()) {
            for (r88 zzc : list) {
                this.f31209e.add(zzc.zzc());
            }
        }
        this.f31210g = new ArrayList(list2);
    }
}
