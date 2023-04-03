package p000;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b \u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001*\u0004\b\u0001\u0010\u0003*\u0004\b\u0002\u0010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H&¨\u0006\r"}, mo44877d2 = {"Lk6;", "", "E", "K", "V", "Lr6;", "element", "", "e", "(Ljava/util/Map$Entry;)Z", "j", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: k6 */
/* compiled from: MapBuilder.kt */
public abstract class C6136k6<E extends Map.Entry<? extends K, ? extends V>, K, V> extends C6430r6<E> {
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return mo44666e((Map.Entry) obj);
    }

    /* renamed from: e */
    public final boolean mo44666e(E e) {
        vx2.m53591g(e, "element");
        return mo44667j(e);
    }

    /* renamed from: j */
    public abstract boolean mo44667j(Map.Entry<? extends K, ? extends V> entry);

    /* renamed from: k */
    public abstract /* bridge */ boolean mo44668k(Map.Entry<?, ?> entry);

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return mo44668k((Map.Entry) obj);
    }
}
