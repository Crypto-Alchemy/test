package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.web3j.ens.contracts.generated.PublicResolver;

/* compiled from: DeclaredMemberIndex.kt */
public class ClassDeclaredMemberIndex implements l31 {

    /* renamed from: a */
    public final p03 f39461a;

    /* renamed from: b */
    public final rc2<l13, Boolean> f39462b;

    /* renamed from: c */
    public final rc2<m13, Boolean> f39463c;

    /* renamed from: d */
    public final Map<r24, List<m13>> f39464d;

    /* renamed from: e */
    public final Map<r24, f13> f39465e;

    /* renamed from: f */
    public final Map<r24, w13> f39466f;

    public ClassDeclaredMemberIndex(p03 p03, rc2<? super l13, Boolean> rc2) {
        vx2.m53591g(p03, "jClass");
        vx2.m53591g(rc2, "memberFilter");
        this.f39461a = p03;
        this.f39462b = rc2;
        ClassDeclaredMemberIndex$methodFilter$1 classDeclaredMemberIndex$methodFilter$1 = new ClassDeclaredMemberIndex$methodFilter$1(this);
        this.f39463c = classDeclaredMemberIndex$methodFilter$1;
        hw5<T> o = SequencesKt___SequencesKt.m63025o(CollectionsKt___CollectionsKt.m47318Q(p03.mo53369B()), classDeclaredMemberIndex$methodFilter$1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T next : o) {
            r24 name = ((m13) next).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next);
        }
        this.f39464d = linkedHashMap;
        hw5<T> o2 = SequencesKt___SequencesKt.m63025o(CollectionsKt___CollectionsKt.m47318Q(this.f39461a.mo53395y()), this.f39462b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (T next2 : o2) {
            linkedHashMap2.put(((f13) next2).getName(), next2);
        }
        this.f39465e = linkedHashMap2;
        Collection<w13> l = this.f39461a.mo53389l();
        rc2<l13, Boolean> rc22 = this.f39462b;
        ArrayList arrayList = new ArrayList();
        for (T next3 : l) {
            if (rc22.invoke(next3).booleanValue()) {
                arrayList.add(next3);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(d75.m43382d(ao3.m31893e(dk0.m43495u(arrayList, 10)), 16));
        for (Object next4 : arrayList) {
            linkedHashMap3.put(((w13) next4).getName(), next4);
        }
        this.f39466f = linkedHashMap3;
    }

    /* renamed from: a */
    public Set<r24> mo53494a() {
        hw5<T> o = SequencesKt___SequencesKt.m63025o(CollectionsKt___CollectionsKt.m47318Q(this.f39461a.mo53369B()), this.f39463c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T name : o) {
            linkedHashSet.add(name.getName());
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    public f13 mo53495b(r24 r24) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        return this.f39465e.get(r24);
    }

    /* renamed from: c */
    public Set<r24> mo53496c() {
        return this.f39466f.keySet();
    }

    /* renamed from: d */
    public Set<r24> mo53497d() {
        hw5<T> o = SequencesKt___SequencesKt.m63025o(CollectionsKt___CollectionsKt.m47318Q(this.f39461a.mo53395y()), this.f39462b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T name : o) {
            linkedHashSet.add(name.getName());
        }
        return linkedHashSet;
    }

    /* renamed from: e */
    public w13 mo53498e(r24 r24) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        return this.f39466f.get(r24);
    }

    /* renamed from: f */
    public Collection<m13> mo53499f(r24 r24) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        List list = this.f39464d.get(r24);
        if (list != null) {
            return list;
        }
        return ck0.m33062j();
    }
}
