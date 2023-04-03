package p000;

import java.util.Map;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0002R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, mo44877d2 = {"Lzx6;", "K", "V", "Lvx6;", "", "m", "Ltn4;", "g", "Ltn4;", "parentIterator", "<init>", "(Ltn4;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: zx6 */
/* compiled from: PersistentHashMapBuilderContentIterators.kt */
public final class zx6<K, V> extends vx6<K, V, Map.Entry<K, V>> {

    /* renamed from: g */
    public final tn4<K, V> f20719g;

    public zx6(tn4<K, V> tn4) {
        vx2.m53591g(tn4, "parentIterator");
        this.f20719g = tn4;
    }

    /* renamed from: m */
    public Map.Entry<K, V> next() {
        kl0.m20819a(mo27365f());
        mo27372l(mo27364d() + 2);
        return new m04(this.f20719g, mo27363c()[mo27364d() - 2], mo27363c()[mo27364d() - 1]);
    }
}
