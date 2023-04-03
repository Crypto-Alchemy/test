package p000;

import kotlin.Metadata;
import kotlinx.coroutines.JobSupport;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0004\u001a\u00020\u0003H\u0003R\u001a\u0010\t\u001a\u00020\u00038\u0010X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00038PX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u0010"}, mo44877d2 = {"La33;", "Lkotlinx/coroutines/JobSupport;", "Lhm0;", "", "P0", "d", "Z", "e0", "()Z", "handlesException", "f0", "onCancelComplete", "Ly23;", "parent", "<init>", "(Ly23;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: a33 */
/* compiled from: JobSupport.kt */
public class a33 extends JobSupport implements hm0 {

    /* renamed from: d */
    public final boolean f36357d = mo50067P0();

    public a33(y23 y23) {
        super(true);
        mo55516l0(y23);
    }

    /* renamed from: P0 */
    public final boolean mo50067P0() {
        ie0 ie0;
        JobSupport B;
        ie0 ie02;
        he0 h0 = mo55511h0();
        if (h0 instanceof ie0) {
            ie0 = (ie0) h0;
        } else {
            ie0 = null;
        }
        if (!(ie0 == null || (B = ie0.mo52613B()) == null)) {
            while (!B.mo50068e0()) {
                he0 h02 = B.mo55511h0();
                if (h02 instanceof ie0) {
                    ie02 = (ie0) h02;
                } else {
                    ie02 = null;
                }
                if (ie02 != null) {
                    B = ie02.mo52613B();
                    if (B == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    public boolean mo50068e0() {
        return this.f36357d;
    }

    /* renamed from: f0 */
    public boolean mo50069f0() {
        return true;
    }
}
