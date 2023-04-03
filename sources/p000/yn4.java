package p000;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0005B\u001b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0002J\u001b\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\tH\u0002R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Lyn4;", "K", "V", "Los2;", "", "La7;", "element", "", "j", "", "iterator", "Lon4;", "d", "Lon4;", "map", "", "e", "()I", "size", "<init>", "(Lon4;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: yn4 */
/* compiled from: PersistentHashMapContentViews.kt */
public final class yn4<K, V> extends C3801a7<Map.Entry<? extends K, ? extends V>> implements os2<Map.Entry<? extends K, ? extends V>> {

    /* renamed from: d */
    public final on4<K, V> f20309d;

    public yn4(on4<K, V> on4) {
        vx2.m53591g(on4, "map");
        this.f20309d = on4;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return mo28166j((Map.Entry) obj);
    }

    /* renamed from: e */
    public int mo11067e() {
        return this.f20309d.size();
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new zn4(this.f20309d.mo24017m());
    }

    /* renamed from: j */
    public boolean mo28166j(Map.Entry<? extends K, ? extends V> entry) {
        vx2.m53591g(entry, "element");
        V v = this.f20309d.get(entry.getKey());
        if (v != null) {
            return vx2.m53586b(v, entry.getValue());
        }
        if (entry.getValue() != null || !this.f20309d.containsKey(entry.getKey())) {
            return false;
        }
        return true;
    }
}
