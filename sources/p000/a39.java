package p000;

import com.google.android.gms.internal.vision.zzht;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: a39 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class a39 extends kw8<String> implements k39, RandomAccess {

    /* renamed from: e */
    public static final a39 f20803e;

    /* renamed from: g */
    public static final k39 f20804g;

    /* renamed from: d */
    public final List<Object> f20805d;

    static {
        a39 a39 = new a39();
        f20803e = a39;
        a39.zzb();
        f20804g = a39;
    }

    public a39() {
        this(10);
    }

    /* renamed from: j */
    public static String m31664j(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzht) {
            return ((zzht) obj).zzb();
        }
        return t19.m52052i((byte[]) obj);
    }

    /* renamed from: Z0 */
    public final void mo28805Z0(zzht zzht) {
        mo45307e();
        this.f20805d.add(zzht);
        this.modCount++;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        mo45307e();
        this.f20805d.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: b */
    public final List<?> mo28810b() {
        return Collections.unmodifiableList(this.f20805d);
    }

    /* renamed from: c */
    public final k39 mo28811c() {
        if (zza()) {
            return new x89(this);
        }
        return this;
    }

    public final void clear() {
        mo45307e();
        this.f20805d.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public final /* synthetic */ h29 mo28813d(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f20805d);
            return new a39((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f20805d.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzht) {
            zzht zzht = (zzht) obj;
            String zzb = zzht.zzb();
            if (zzht.zzc()) {
                this.f20805d.set(i, zzb);
            }
            return zzb;
        }
        byte[] bArr = (byte[]) obj;
        String i2 = t19.m52052i(bArr);
        if (t19.m52051h(bArr)) {
            this.f20805d.set(i, i2);
        }
        return i2;
    }

    /* renamed from: h */
    public final Object mo28816h(int i) {
        return this.f20805d.get(i);
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
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
        mo45307e();
        return m31664j(this.f20805d.set(i, (String) obj));
    }

    public final int size() {
        return this.f20805d.size();
    }

    public final /* bridge */ /* synthetic */ boolean zza() {
        return super.zza();
    }

    public a39(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo45307e();
        if (collection instanceof k39) {
            collection = ((k39) collection).mo28810b();
        }
        boolean addAll = this.f20805d.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final /* synthetic */ Object remove(int i) {
        mo45307e();
        Object remove = this.f20805d.remove(i);
        this.modCount++;
        return m31664j(remove);
    }

    public a39(ArrayList<Object> arrayList) {
        this.f20805d = arrayList;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }
}
