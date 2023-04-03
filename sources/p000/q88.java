package p000;

import com.google.android.gms.measurement.internal.zzaq;
import java.util.Iterator;

/* renamed from: q88 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class q88 implements Iterator<String> {

    /* renamed from: a */
    public final Iterator<String> f32977a;

    /* renamed from: d */
    public final /* synthetic */ zzaq f32978d;

    public q88(zzaq zzaq) {
        this.f32978d = zzaq;
        this.f32977a = zzaq.f23073a.keySet().iterator();
    }

    /* renamed from: a */
    public final String next() {
        return this.f32977a.next();
    }

    public final boolean hasNext() {
        return this.f32977a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
