package p000;

import com.google.android.gms.internal.clearcut.zzbb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: zg8 */
public final class zg8 extends k98<String> implements ch8, RandomAccess {

    /* renamed from: e */
    public static final zg8 f36155e;

    /* renamed from: g */
    public static final ch8 f36156g;

    /* renamed from: d */
    public final List<Object> f36157d;

    static {
        zg8 zg8 = new zg8();
        f36155e = zg8;
        zg8.mo43294z();
        f36156g = zg8;
    }

    public zg8() {
        this(10);
    }

    public zg8(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    public zg8(ArrayList<Object> arrayList) {
        this.f36157d = arrayList;
    }

    /* renamed from: j */
    public static String m55102j(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzbb ? ((zzbb) obj).zzz() : vf8.m53382h((byte[]) obj);
    }

    /* renamed from: G0 */
    public final List<?> mo30009G0() {
        return Collections.unmodifiableList(this.f36157d);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        mo44712e();
        this.f36157d.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo44712e();
        if (collection instanceof ch8) {
            collection = ((ch8) collection).mo30009G0();
        }
        boolean addAll = this.f36157d.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final void clear() {
        mo44712e();
        this.f36157d.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f36157d.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzbb) {
            zzbb zzbb = (zzbb) obj;
            String zzz = zzbb.zzz();
            if (zzbb.zzaa()) {
                this.f36157d.set(i, zzz);
            }
            return zzz;
        }
        byte[] bArr = (byte[]) obj;
        String h = vf8.m53382h(bArr);
        if (vf8.m53381g(bArr)) {
            this.f36157d.set(i, h);
        }
        return h;
    }

    /* renamed from: h0 */
    public final /* synthetic */ hg8 mo43292h0(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f36157d);
            return new zg8((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h1 */
    public final ch8 mo30010h1() {
        return mo43293y() ? new jp8(this) : this;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: m */
    public final Object mo30011m(int i) {
        return this.f36157d.get(i);
    }

    public final /* synthetic */ Object remove(int i) {
        mo44712e();
        Object remove = this.f36157d.remove(i);
        this.modCount++;
        return m55102j(remove);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        mo44712e();
        return m55102j(this.f36157d.set(i, (String) obj));
    }

    public final int size() {
        return this.f36157d.size();
    }

    /* renamed from: y */
    public final /* bridge */ /* synthetic */ boolean mo43293y() {
        return super.mo43293y();
    }
}
