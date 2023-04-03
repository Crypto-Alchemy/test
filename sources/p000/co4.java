package p000;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractCollection;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0002R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Lco4;", "K", "V", "Lks2;", "Lkotlin/collections/AbstractCollection;", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "iterator", "Lon4;", "a", "Lon4;", "map", "", "e", "()I", "size", "<init>", "(Lon4;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: co4 */
/* compiled from: PersistentHashMapContentViews.kt */
public final class co4<K, V> extends AbstractCollection<V> implements ks2<V> {

    /* renamed from: a */
    public final on4<K, V> f8512a;

    public co4(on4<K, V> on4) {
        vx2.m53591g(on4, "map");
        this.f8512a = on4;
    }

    public boolean contains(Object obj) {
        return this.f8512a.containsValue(obj);
    }

    /* renamed from: e */
    public int mo11067e() {
        return this.f8512a.size();
    }

    public Iterator<V> iterator() {
        return new do4(this.f8512a.mo24017m());
    }
}
