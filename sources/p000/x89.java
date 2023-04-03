package p000;

import com.google.android.gms.internal.vision.zzht;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: x89 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class x89 extends AbstractList<String> implements k39, RandomAccess {

    /* renamed from: a */
    public final k39 f35554a;

    public x89(k39 k39) {
        this.f35554a = k39;
    }

    /* renamed from: Z0 */
    public final void mo28805Z0(zzht zzht) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final List<?> mo28810b() {
        return this.f35554a.mo28810b();
    }

    /* renamed from: c */
    public final k39 mo28811c() {
        return this;
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f35554a.get(i);
    }

    /* renamed from: h */
    public final Object mo28816h(int i) {
        return this.f35554a.mo28816h(i);
    }

    public final Iterator<String> iterator() {
        return new o99(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new v89(this, i);
    }

    public final int size() {
        return this.f35554a.size();
    }
}
