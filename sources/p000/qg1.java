package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: qg1 */
/* compiled from: DirectedAcyclicGraph */
public final class qg1<T> {

    /* renamed from: a */
    public final ys4<ArrayList<T>> f16937a = new at4(10);

    /* renamed from: b */
    public final y16<T, ArrayList<T>> f16938b = new y16<>();

    /* renamed from: c */
    public final ArrayList<T> f16939c = new ArrayList<>();

    /* renamed from: d */
    public final HashSet<T> f16940d = new HashSet<>();

    /* renamed from: a */
    public void mo25094a(T t, T t2) {
        if (!this.f16938b.containsKey(t) || !this.f16938b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = this.f16938b.get(t);
        if (arrayList == null) {
            arrayList = mo25099f();
            this.f16938b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: b */
    public void mo25095b(T t) {
        if (!this.f16938b.containsKey(t)) {
            this.f16938b.put(t, null);
        }
    }

    /* renamed from: c */
    public void mo25096c() {
        int size = this.f16938b.size();
        for (int i = 0; i < size; i++) {
            ArrayList m = this.f16938b.mo27921m(i);
            if (m != null) {
                mo25104k(m);
            }
        }
        this.f16938b.clear();
    }

    /* renamed from: d */
    public boolean mo25097d(T t) {
        return this.f16938b.containsKey(t);
    }

    /* renamed from: e */
    public final void mo25098e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = this.f16938b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        mo25098e(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    /* renamed from: f */
    public final ArrayList<T> mo25099f() {
        ArrayList<T> b = this.f16937a.mo11139b();
        if (b == null) {
            return new ArrayList<>();
        }
        return b;
    }

    /* renamed from: g */
    public List mo25100g(T t) {
        return this.f16938b.get(t);
    }

    /* renamed from: h */
    public List<T> mo25101h(T t) {
        int size = this.f16938b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList m = this.f16938b.mo27921m(i);
            if (m != null && m.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f16938b.mo27919i(i));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public ArrayList<T> mo25102i() {
        this.f16939c.clear();
        this.f16940d.clear();
        int size = this.f16938b.size();
        for (int i = 0; i < size; i++) {
            mo25098e(this.f16938b.mo27919i(i), this.f16939c, this.f16940d);
        }
        return this.f16939c;
    }

    /* renamed from: j */
    public boolean mo25103j(T t) {
        int size = this.f16938b.size();
        for (int i = 0; i < size; i++) {
            ArrayList m = this.f16938b.mo27921m(i);
            if (m != null && m.contains(t)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final void mo25104k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f16937a.mo11138a(arrayList);
    }
}
