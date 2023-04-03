package p000;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b \u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001*\u0004\b\u0001\u0010\u0003*\u0004\b\u0002\u0010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H&J\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u001c\u0010\f\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H&¨\u0006\u000f"}, mo44877d2 = {"Lj6;", "", "E", "K", "V", "Lr6;", "element", "", "e", "(Ljava/util/Map$Entry;)Z", "j", "k", "n", "<init>", "()V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: j6 */
/* compiled from: PersistentHashMapBuilderContentViews.kt */
public abstract class C2582j6<E extends Map.Entry<? extends K, ? extends V>, K, V> extends C6430r6<E> {
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return mo21732e((Map.Entry) obj);
    }

    /* renamed from: e */
    public final boolean mo21732e(E e) {
        E e2;
        vx2.m53591g(e, "element");
        if (e instanceof Object) {
            e2 = e;
        } else {
            e2 = null;
        }
        if (!(e2 instanceof Map.Entry)) {
            return false;
        }
        return mo21733j(e);
    }

    /* renamed from: j */
    public abstract boolean mo21733j(Map.Entry<? extends K, ? extends V> entry);

    /* renamed from: k */
    public final boolean mo21734k(E e) {
        E e2;
        vx2.m53591g(e, "element");
        if (e instanceof Object) {
            e2 = e;
        } else {
            e2 = null;
        }
        if (!(e2 instanceof Map.Entry)) {
            return false;
        }
        return mo21735n(e);
    }

    /* renamed from: n */
    public abstract boolean mo21735n(Map.Entry<? extends K, ? extends V> entry);

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return mo21734k((Map.Entry) obj);
    }
}
