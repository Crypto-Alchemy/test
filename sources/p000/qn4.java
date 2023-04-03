package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.eo4;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0004\n\u0002\u0010\u001f\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\bB\u0010CJ\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0011\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010H\u0016J\u0019\u0010\u0014\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u001d\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0012H\u0016R\"\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8\u0000@BX\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR.\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010-\u001a\u0004\u0018\u00018\u00018\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b#\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R*\u00108\u001a\u00020.2\u0006\u0010\r\u001a\u00020.8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b6\u00100\u001a\u0004\b7\u00102\"\u0004\b/\u00104R&\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010:098VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010;R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00028\u0000098VX\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00010?8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010@¨\u0006D"}, mo44877d2 = {"Lqn4;", "K", "V", "Leo4$a;", "Lq6;", "Lon4;", "e", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "Lr37;", "putAll", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "clear", "a", "Lon4;", "map", "Lh04;", "<set-?>", "d", "Lh04;", "h", "()Lh04;", "ownership", "Lux6;", "Lux6;", "g", "()Lux6;", "setNode$runtime_release", "(Lux6;)V", "node", "Ljava/lang/Object;", "getOperationResult$runtime_release", "()Ljava/lang/Object;", "j", "(Ljava/lang/Object;)V", "operationResult", "", "k", "I", "f", "()I", "i", "(I)V", "modCount", "r", "c", "size", "", "", "()Ljava/util/Set;", "entries", "b", "keys", "", "()Ljava/util/Collection;", "values", "<init>", "(Lon4;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: qn4 */
/* compiled from: PersistentHashMapBuilder.kt */
public final class qn4<K, V> extends C6388q6<K, V> implements eo4.C2242a<K, V> {

    /* renamed from: a */
    public on4<K, V> f16982a;

    /* renamed from: d */
    public h04 f16983d = new h04();

    /* renamed from: e */
    public ux6<K, V> f16984e = this.f16982a.mo24017m();

    /* renamed from: g */
    public V f16985g;

    /* renamed from: k */
    public int f16986k;

    /* renamed from: r */
    public int f16987r = this.f16982a.size();

    public qn4(on4<K, V> on4) {
        vx2.m53591g(on4, "map");
        this.f16982a = on4;
    }

    /* renamed from: a */
    public Set<Map.Entry<K, V>> mo25160a() {
        return new sn4(this);
    }

    /* renamed from: b */
    public Set<K> mo25161b() {
        return new un4(this);
    }

    /* renamed from: c */
    public int mo25162c() {
        return this.f16987r;
    }

    public void clear() {
        ux6<K, V> a = ux6.f18594e.mo26934a();
        vx2.m53589e(a, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f16984e = a;
        mo25173k(0);
    }

    public boolean containsKey(Object obj) {
        int i;
        ux6<K, V> ux6 = this.f16984e;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return ux6.mo26918k(i, obj, 0);
    }

    /* renamed from: d */
    public Collection<V> mo25165d() {
        return new wn4(this);
    }

    /* renamed from: e */
    public on4<K, V> build() {
        on4<K, V> on4;
        if (this.f16984e == this.f16982a.mo24017m()) {
            on4 = this.f16982a;
        } else {
            this.f16983d = new h04();
            on4 = new on4<>(this.f16984e, size());
        }
        this.f16982a = on4;
        return on4;
    }

    /* renamed from: f */
    public final int mo25167f() {
        return this.f16986k;
    }

    /* renamed from: g */
    public final ux6<K, V> mo25168g() {
        return this.f16984e;
    }

    public V get(Object obj) {
        int i;
        ux6<K, V> ux6 = this.f16984e;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return ux6.mo26922o(i, obj, 0);
    }

    /* renamed from: h */
    public final h04 mo25170h() {
        return this.f16983d;
    }

    /* renamed from: i */
    public final void mo25171i(int i) {
        this.f16986k = i;
    }

    /* renamed from: j */
    public final void mo25172j(V v) {
        this.f16985g = v;
    }

    /* renamed from: k */
    public void mo25173k(int i) {
        this.f16987r = i;
        this.f16986k++;
    }

    public V put(K k, V v) {
        int i;
        this.f16985g = null;
        ux6<K, V> ux6 = this.f16984e;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        this.f16984e = ux6.mo26889D(i, k, v, 0, this);
        return this.f16985g;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        on4 on4;
        qn4 qn4;
        vx2.m53591g(map, "from");
        if (map instanceof on4) {
            on4 = (on4) map;
        } else {
            on4 = null;
        }
        if (on4 == null) {
            if (map instanceof qn4) {
                qn4 = (qn4) map;
            } else {
                qn4 = null;
            }
            if (qn4 != null) {
                on4 = qn4.build();
            } else {
                on4 = null;
            }
        }
        if (on4 != null) {
            bc1 bc1 = new bc1(0, 1, (DefaultConstructorMarker) null);
            int size = size();
            ux6<K, V> ux6 = this.f16984e;
            ux6 m = on4.mo24017m();
            vx2.m53589e(m, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
            this.f16984e = ux6.mo26890E(m, 0, bc1, this);
            int size2 = (on4.size() + size) - bc1.mo11475a();
            if (size != size2) {
                mo25173k(size2);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    public V remove(Object obj) {
        this.f16985g = null;
        ux6<K, V> G = this.f16984e.mo26892G(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (G == null) {
            G = ux6.f18594e.mo26934a();
            vx2.m53589e(G, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f16984e = G;
        return this.f16985g;
    }

    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        ux6<K, V> H = this.f16984e.mo26893H(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (H == null) {
            H = ux6.f18594e.mo26934a();
            vx2.m53589e(H, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f16984e = H;
        if (size != size()) {
            return true;
        }
        return false;
    }
}
