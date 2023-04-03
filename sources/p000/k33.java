package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\"\u001a\u0010\b\u001a\u00020\u00038\u0002X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u0012\u0004\b\n\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\u00038\u0002X\u0004¢\u0006\f\n\u0004\b\f\u0010\u0005\u0012\u0004\b\r\u0010\u0007\"\u001a\u0010\u0011\u001a\u00020\u00038\u0002X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u0012\u0004\b\u0010\u0010\u0007\"\u001a\u0010\u0014\u001a\u00020\u00038\u0002X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0005\u0012\u0004\b\u0013\u0010\u0007\"\u001a\u0010\u0019\u001a\u00020\u00158\u0002X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\u0007\"\u001a\u0010\u001b\u001a\u00020\u00158\u0002X\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0017\u0012\u0004\b\u001a\u0010\u0007¨\u0006\u001c"}, mo44877d2 = {"", "g", "h", "Lxj6;", "a", "Lxj6;", "getCOMPLETING_ALREADY$annotations", "()V", "COMPLETING_ALREADY", "b", "getCOMPLETING_WAITING_CHILDREN$annotations", "COMPLETING_WAITING_CHILDREN", "c", "getCOMPLETING_RETRY$annotations", "COMPLETING_RETRY", "d", "getTOO_LATE_TO_CANCEL$annotations", "TOO_LATE_TO_CANCEL", "e", "getSEALED$annotations", "SEALED", "Lno1;", "f", "Lno1;", "getEMPTY_NEW$annotations", "EMPTY_NEW", "getEMPTY_ACTIVE$annotations", "EMPTY_ACTIVE", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: k33 */
/* compiled from: JobSupport.kt */
public final class k33 {

    /* renamed from: a */
    public static final xj6 f38850a = new xj6("COMPLETING_ALREADY");

    /* renamed from: b */
    public static final xj6 f38851b = new xj6("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c */
    public static final xj6 f38852c = new xj6("COMPLETING_RETRY");

    /* renamed from: d */
    public static final xj6 f38853d = new xj6("TOO_LATE_TO_CANCEL");

    /* renamed from: e */
    public static final xj6 f38854e = new xj6("SEALED");

    /* renamed from: f */
    public static final no1 f38855f = new no1(false);

    /* renamed from: g */
    public static final no1 f38856g = new no1(true);

    /* renamed from: g */
    public static final Object m59673g(Object obj) {
        if (obj instanceof mt2) {
            return new nt2((mt2) obj);
        }
        return obj;
    }

    /* renamed from: h */
    public static final Object m59674h(Object obj) {
        nt2 nt2;
        mt2 mt2;
        if (obj instanceof nt2) {
            nt2 = (nt2) obj;
        } else {
            nt2 = null;
        }
        if (nt2 == null || (mt2 = nt2.f43561a) == null) {
            return obj;
        }
        return mt2;
    }
}
