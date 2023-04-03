package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\"\u001a\u0010\b\u001a\u00020\u00038\u0002X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u00038\u0002X\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u0012\u0004\b\n\u0010\u0007*\u001e\b\u0002\u0010\u000e\u001a\u0004\b\u0000\u0010\f\"\b\u0012\u0004\u0012\u00028\u00000\r2\b\u0012\u0004\u0012\u00028\u00000\r¨\u0006\u000f"}, mo44877d2 = {"", "timeMillis", "c", "Lxj6;", "a", "Lxj6;", "getDISPOSED_TASK$annotations", "()V", "DISPOSED_TASK", "b", "getCLOSED_EMPTY$annotations", "CLOSED_EMPTY", "T", "Lek3;", "Queue", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: qt1 */
/* compiled from: EventLoop.common.kt */
public final class qt1 {

    /* renamed from: a */
    public static final xj6 f44234a = new xj6("REMOVED_TASK");

    /* renamed from: b */
    public static final xj6 f44235b = new xj6("CLOSED_EMPTY");

    /* renamed from: c */
    public static final long m71345c(long j) {
        if (j <= 0) {
            return 0;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j;
    }
}
