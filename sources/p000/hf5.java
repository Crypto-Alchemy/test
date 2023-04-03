package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: hf5 */
/* compiled from: ResourceDecoderRegistry */
public class hf5 {

    /* renamed from: a */
    public final List<String> f12876a = new ArrayList();

    /* renamed from: b */
    public final Map<String, List<C2471a<?, ?>>> f12877b = new HashMap();

    /* renamed from: hf5$a */
    /* compiled from: ResourceDecoderRegistry */
    public static class C2471a<T, R> {

        /* renamed from: a */
        public final Class<T> f12878a;

        /* renamed from: b */
        public final Class<R> f12879b;

        /* renamed from: c */
        public final gf5<T, R> f12880c;

        public C2471a(Class<T> cls, Class<R> cls2, gf5<T, R> gf5) {
            this.f12878a = cls;
            this.f12879b = cls2;
            this.f12880c = gf5;
        }

        /* renamed from: a */
        public boolean mo21168a(Class<?> cls, Class<?> cls2) {
            if (!this.f12878a.isAssignableFrom(cls) || !cls2.isAssignableFrom(this.f12879b)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public synchronized <T, R> void mo21163a(String str, gf5<T, R> gf5, Class<T> cls, Class<R> cls2) {
        mo21165c(str).add(new C2471a(cls, cls2, gf5));
    }

    /* renamed from: b */
    public synchronized <T, R> List<gf5<T, R>> mo21164b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f12876a) {
            List<C2471a> list = this.f12877b.get(str);
            if (list != null) {
                for (C2471a aVar : list) {
                    if (aVar.mo21168a(cls, cls2)) {
                        arrayList.add(aVar.f12880c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final synchronized List<C2471a<?, ?>> mo21165c(String str) {
        List<C2471a<?, ?>> list;
        if (!this.f12876a.contains(str)) {
            this.f12876a.add(str);
        }
        list = this.f12877b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f12877b.put(str, list);
        }
        return list;
    }

    /* renamed from: d */
    public synchronized <T, R> List<Class<R>> mo21166d(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f12876a) {
            List<C2471a> list = this.f12877b.get(str);
            if (list != null) {
                for (C2471a aVar : list) {
                    if (aVar.mo21168a(cls, cls2) && !arrayList.contains(aVar.f12879b)) {
                        arrayList.add(aVar.f12879b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized void mo21167e(List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>(this.f12876a);
        this.f12876a.clear();
        for (String add : list) {
            this.f12876a.add(add);
        }
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f12876a.add(str);
            }
        }
    }
}
