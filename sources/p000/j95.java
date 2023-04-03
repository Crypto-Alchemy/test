package p000;

import com.facebook.common.references.SharedReference;
import p000.nh0;

/* renamed from: j95 */
/* compiled from: RefCountCloseableReference */
public class j95<T> extends nh0<T> {
    public j95(SharedReference<T> sharedReference, nh0.C2897c cVar, Throwable th) {
        super(sharedReference, cVar, th);
    }

    /* renamed from: b */
    public nh0<T> clone() {
        au4.m10794i(mo23686m());
        return new j95(this.f15551d, this.f15552e, this.f15553g);
    }

    public j95(T t, rf5<T> rf5, nh0.C2897c cVar, Throwable th) {
        super(t, rf5, cVar, th);
    }
}
