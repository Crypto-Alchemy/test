package p000;

import com.google.android.gms.internal.measurement.zzjd;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: ka9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class ka9 extends AbstractList<String> implements RandomAccess, b69 {

    /* renamed from: a */
    public final b69 f30779a;

    public ka9(b69 b69) {
        this.f30779a = b69;
    }

    /* renamed from: G */
    public final void mo29466G(zzjd zzjd) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public final b69 mo29467f() {
        return this;
    }

    /* renamed from: g */
    public final List<?> mo29468g() {
        return this.f30779a.mo29468g();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((y59) this.f30779a).get(i);
    }

    public final Iterator<String> iterator() {
        return new ia9(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new ga9(this, i);
    }

    /* renamed from: s0 */
    public final Object mo29469s0(int i) {
        return this.f30779a.mo29469s0(i);
    }

    public final int size() {
        return this.f30779a.size();
    }
}
