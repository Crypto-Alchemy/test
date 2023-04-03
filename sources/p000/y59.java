package p000;

import com.google.android.gms.internal.measurement.zzjd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: y59 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class y59 extends vz8<String> implements RandomAccess, b69 {

    /* renamed from: e */
    public static final y59 f35773e;

    /* renamed from: g */
    public static final b69 f35774g;

    /* renamed from: d */
    public final List<Object> f35775d;

    static {
        y59 y59 = new y59(10);
        f35773e = y59;
        y59.zzb();
        f35774g = y59;
    }

    public y59() {
        this(10);
    }

    /* renamed from: k */
    public static String m54628k(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzjd) {
            return ((zzjd) obj).zzl(p59.f32581a);
        }
        return p59.m49799d((byte[]) obj);
    }

    /* renamed from: G */
    public final void mo29466G(zzjd zzjd) {
        mo48873e();
        this.f35775d.add(zzjd);
        this.modCount++;
    }

    /* renamed from: I */
    public final /* bridge */ /* synthetic */ m59 mo43048I(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f35775d);
            return new y59((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo48873e();
        this.f35775d.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo48873e();
        if (collection instanceof b69) {
            collection = ((b69) collection).mo29468g();
        }
        boolean addAll = this.f35775d.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        mo48873e();
        this.f35775d.clear();
        this.modCount++;
    }

    /* renamed from: f */
    public final b69 mo29467f() {
        if (zza()) {
            return new ka9(this);
        }
        return this;
    }

    /* renamed from: g */
    public final List<?> mo29468g() {
        return Collections.unmodifiableList(this.f35775d);
    }

    /* renamed from: j */
    public final String get(int i) {
        Object obj = this.f35775d.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzjd) {
            zzjd zzjd = (zzjd) obj;
            String zzl = zzjd.zzl(p59.f32581a);
            if (zzjd.zzh()) {
                this.f35775d.set(i, zzl);
            }
            return zzl;
        }
        byte[] bArr = (byte[]) obj;
        String d = p59.m49799d(bArr);
        if (p59.m49798c(bArr)) {
            this.f35775d.set(i, d);
        }
        return d;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo48873e();
        Object remove = this.f35775d.remove(i);
        this.modCount++;
        return m54628k(remove);
    }

    /* renamed from: s0 */
    public final Object mo29469s0(int i) {
        return this.f35775d.get(i);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo48873e();
        return m54628k(this.f35775d.set(i, (String) obj));
    }

    public final int size() {
        return this.f35775d.size();
    }

    public y59(int i) {
        this.f35775d = new ArrayList(i);
    }

    public y59(ArrayList<Object> arrayList) {
        this.f35775d = arrayList;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
