package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.os4;

/* renamed from: uj2 */
/* compiled from: GroupedLinkedMap */
public class uj2<K extends os4, V> {

    /* renamed from: a */
    public final C3417a<K, V> f18503a = new C3417a<>();

    /* renamed from: b */
    public final Map<K, C3417a<K, V>> f18504b = new HashMap();

    /* renamed from: uj2$a */
    /* compiled from: GroupedLinkedMap */
    public static class C3417a<K, V> {

        /* renamed from: a */
        public final K f18505a;

        /* renamed from: b */
        public List<V> f18506b;

        /* renamed from: c */
        public C3417a<K, V> f18507c;

        /* renamed from: d */
        public C3417a<K, V> f18508d;

        public C3417a() {
            this((Object) null);
        }

        /* renamed from: a */
        public void mo26802a(V v) {
            if (this.f18506b == null) {
                this.f18506b = new ArrayList();
            }
            this.f18506b.add(v);
        }

        /* renamed from: b */
        public V mo26803b() {
            int c = mo26804c();
            if (c > 0) {
                return this.f18506b.remove(c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int mo26804c() {
            List<V> list = this.f18506b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public C3417a(K k) {
            this.f18508d = this;
            this.f18507c = this;
            this.f18505a = k;
        }
    }

    /* renamed from: e */
    public static <K, V> void m28306e(C3417a<K, V> aVar) {
        C3417a<K, V> aVar2 = aVar.f18508d;
        aVar2.f18507c = aVar.f18507c;
        aVar.f18507c.f18508d = aVar2;
    }

    /* renamed from: g */
    public static <K, V> void m28307g(C3417a<K, V> aVar) {
        aVar.f18507c.f18508d = aVar;
        aVar.f18508d.f18507c = aVar;
    }

    /* renamed from: a */
    public V mo26796a(K k) {
        C3417a aVar = this.f18504b.get(k);
        if (aVar == null) {
            aVar = new C3417a(k);
            this.f18504b.put(k, aVar);
        } else {
            k.mo24101a();
        }
        mo26797b(aVar);
        return aVar.mo26803b();
    }

    /* renamed from: b */
    public final void mo26797b(C3417a<K, V> aVar) {
        m28306e(aVar);
        C3417a<K, V> aVar2 = this.f18503a;
        aVar.f18508d = aVar2;
        aVar.f18507c = aVar2.f18507c;
        m28307g(aVar);
    }

    /* renamed from: c */
    public final void mo26798c(C3417a<K, V> aVar) {
        m28306e(aVar);
        C3417a<K, V> aVar2 = this.f18503a;
        aVar.f18508d = aVar2.f18508d;
        aVar.f18507c = aVar2;
        m28307g(aVar);
    }

    /* renamed from: d */
    public void mo26799d(K k, V v) {
        C3417a aVar = this.f18504b.get(k);
        if (aVar == null) {
            aVar = new C3417a(k);
            mo26798c(aVar);
            this.f18504b.put(k, aVar);
        } else {
            k.mo24101a();
        }
        aVar.mo26802a(v);
    }

    /* renamed from: f */
    public V mo26800f() {
        for (C3417a<K, V> aVar = this.f18503a.f18508d; !aVar.equals(this.f18503a); aVar = aVar.f18508d) {
            V b = aVar.mo26803b();
            if (b != null) {
                return b;
            }
            m28306e(aVar);
            this.f18504b.remove(aVar.f18505a);
            ((os4) aVar.f18505a).mo24101a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (C3417a<K, V> aVar = this.f18503a.f18507c; !aVar.equals(this.f18503a); aVar = aVar.f18507c) {
            z = true;
            sb.append('{');
            sb.append(aVar.f18505a);
            sb.append(':');
            sb.append(aVar.mo26804c());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
