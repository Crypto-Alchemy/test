package p000;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo44877d2 = {"Lq6;", "K", "V", "", "Ljava/util/AbstractMap;", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: q6 */
/* compiled from: AbstractMutableMap.kt */
public abstract class C6388q6<K, V> extends AbstractMap<K, V> implements e93 {
    /* renamed from: a */
    public abstract Set mo25160a();

    /* renamed from: b */
    public /* bridge */ Set<Object> mo25161b() {
        return super.keySet();
    }

    /* renamed from: c */
    public /* bridge */ int mo25162c() {
        return super.size();
    }

    /* renamed from: d */
    public /* bridge */ Collection<Object> mo25165d() {
        return super.values();
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return mo25160a();
    }

    public final /* bridge */ Set<K> keySet() {
        return mo25161b();
    }

    public final /* bridge */ int size() {
        return mo25162c();
    }

    public final /* bridge */ Collection<V> values() {
        return mo25165d();
    }
}
