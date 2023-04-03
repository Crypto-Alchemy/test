package p000;

import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.ux6;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 +*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001,B#\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017\u0012\u0006\u0010!\u001a\u00020\u001d¢\u0006\u0004\b)\u0010*J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005H\u0001J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u001a\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0015H\u0002R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00178\u0000X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\u00020\u001d8\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010%8VX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006-"}, mo44877d2 = {"Lon4;", "K", "V", "Lkotlin/collections/AbstractMap;", "Leo4;", "", "", "c", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "p", "(Ljava/lang/Object;Ljava/lang/Object;)Lon4;", "q", "(Ljava/lang/Object;)Lon4;", "Lqn4;", "j", "Los2;", "k", "Lux6;", "d", "Lux6;", "m", "()Lux6;", "node", "", "e", "I", "()I", "size", "l", "()Los2;", "keys", "Lks2;", "n", "()Lks2;", "values", "<init>", "(Lux6;I)V", "g", "a", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: on4 */
/* compiled from: PersistentHashMap.kt */
public final class on4<K, V> extends AbstractMap<K, V> implements eo4<K, V> {

    /* renamed from: g */
    public static final C2973a f15955g = new C2973a((DefaultConstructorMarker) null);

    /* renamed from: k */
    public static final on4 f15956k = new on4(ux6.f18594e.mo26934a(), 0);

    /* renamed from: d */
    public final ux6<K, V> f15957d;

    /* renamed from: e */
    public final int f15958e;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, mo44877d2 = {"Lon4$a;", "", "K", "V", "Lon4;", "a", "()Lon4;", "", "EMPTY", "Lon4;", "<init>", "()V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: on4$a */
    /* compiled from: PersistentHashMap.kt */
    public static final class C2973a {
        public C2973a() {
        }

        public /* synthetic */ C2973a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <K, V> on4<K, V> mo24021a() {
            on4<K, V> i = on4.f15956k;
            vx2.m53589e(i, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return i;
        }
    }

    public on4(ux6<K, V> ux6, int i) {
        vx2.m53591g(ux6, "node");
        this.f15957d = ux6;
        this.f15958e = i;
    }

    /* renamed from: c */
    public final Set<Map.Entry<K, V>> mo24008c() {
        return mo24015k();
    }

    public boolean containsKey(Object obj) {
        int i;
        ux6<K, V> ux6 = this.f15957d;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return ux6.mo26918k(i, obj, 0);
    }

    /* renamed from: e */
    public int mo24011e() {
        return this.f15958e;
    }

    public V get(Object obj) {
        int i;
        ux6<K, V> ux6 = this.f15957d;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return ux6.mo26922o(i, obj, 0);
    }

    /* renamed from: j */
    public qn4<K, V> builder() {
        return new qn4<>(this);
    }

    /* renamed from: k */
    public final os2<Map.Entry<K, V>> mo24015k() {
        return new yn4(this);
    }

    /* renamed from: l */
    public os2<K> mo24010d() {
        return new ao4(this);
    }

    /* renamed from: m */
    public final ux6<K, V> mo24017m() {
        return this.f15957d;
    }

    /* renamed from: n */
    public ks2<V> mo24012f() {
        return new co4(this);
    }

    /* renamed from: p */
    public on4<K, V> mo24019p(K k, V v) {
        int i;
        ux6<K, V> ux6 = this.f15957d;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        ux6.C3439b<K, V> P = ux6.mo26901P(i, k, v, 0);
        if (P == null) {
            return this;
        }
        return new on4<>(P.mo26935a(), size() + P.mo26936b());
    }

    /* renamed from: q */
    public on4<K, V> mo24020q(K k) {
        int i;
        ux6<K, V> ux6 = this.f15957d;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        ux6<K, V> Q = ux6.mo26902Q(i, k, 0);
        if (this.f15957d == Q) {
            return this;
        }
        if (Q == null) {
            return f15955g.mo24021a();
        }
        return new on4<>(Q, size() - 1);
    }
}
