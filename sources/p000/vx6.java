package p000;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00020\u0004B\u0007¢\u0006\u0004\b$\u0010%J-\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u000b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0011\u001a\u00020\u0010J\r\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u000bJ\u0006\u0010\u0015\u001a\u00020\u0010J\u0016\u0010\u0017\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0016J\u0006\u0010\u0018\u001a\u00020\u000bJ\t\u0010\u0019\u001a\u00020\u0010H\u0002R4\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0004@BX\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010\n\u001a\u00020\b8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b \u0010\u001f\u001a\u0004\b\u001e\u0010!\"\u0004\b\"\u0010#¨\u0006&"}, mo44877d2 = {"Lvx6;", "K", "V", "T", "", "", "", "buffer", "", "dataSize", "index", "Lr37;", "k", "([Ljava/lang/Object;II)V", "j", "([Ljava/lang/Object;I)V", "", "f", "a", "()Ljava/lang/Object;", "h", "g", "Lux6;", "b", "i", "hasNext", "<set-?>", "[Ljava/lang/Object;", "c", "()[Ljava/lang/Object;", "d", "I", "e", "()I", "l", "(I)V", "<init>", "()V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: vx6 */
/* compiled from: PersistentHashMapContentIterators.kt */
public abstract class vx6<K, V, T> implements Iterator<T>, a93 {

    /* renamed from: a */
    public Object[] f18923a = ux6.f18594e.mo26934a().mo26923p();

    /* renamed from: d */
    public int f18924d;

    /* renamed from: e */
    public int f18925e;

    /* renamed from: a */
    public final K mo27361a() {
        kl0.m20819a(mo27365f());
        return this.f18923a[this.f18925e];
    }

    /* renamed from: b */
    public final ux6<? extends K, ? extends V> mo27362b() {
        kl0.m20819a(mo27366g());
        Object obj = this.f18923a[this.f18925e];
        vx2.m53589e(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (ux6) obj;
    }

    /* renamed from: c */
    public final Object[] mo27363c() {
        return this.f18923a;
    }

    /* renamed from: d */
    public final int mo27364d() {
        return this.f18925e;
    }

    /* renamed from: f */
    public final boolean mo27365f() {
        if (this.f18925e < this.f18924d) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo27366g() {
        boolean z;
        if (this.f18925e >= this.f18924d) {
            z = true;
        } else {
            z = false;
        }
        kl0.m20819a(z);
        if (this.f18925e < this.f18923a.length) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void mo27367h() {
        kl0.m20819a(mo27365f());
        this.f18925e += 2;
    }

    public boolean hasNext() {
        return mo27365f();
    }

    /* renamed from: i */
    public final void mo27369i() {
        kl0.m20819a(mo27366g());
        this.f18925e++;
    }

    /* renamed from: j */
    public final void mo27370j(Object[] objArr, int i) {
        vx2.m53591g(objArr, "buffer");
        mo27371k(objArr, i, 0);
    }

    /* renamed from: k */
    public final void mo27371k(Object[] objArr, int i, int i2) {
        vx2.m53591g(objArr, "buffer");
        this.f18923a = objArr;
        this.f18924d = i;
        this.f18925e = i2;
    }

    /* renamed from: l */
    public final void mo27372l(int i) {
        this.f18925e = i;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
