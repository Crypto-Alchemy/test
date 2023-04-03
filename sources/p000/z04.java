package p000;

import kotlin.Metadata;
import kotlinx.coroutines.sync.MutexImpl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000\"\u001a\u0010\b\u001a\u00020\u00048\u0002X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u00048\u0002X\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u0012\u0004\b\n\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\u00048\u0002X\u0004¢\u0006\f\n\u0004\b\f\u0010\u0005\u0012\u0004\b\r\u0010\u0007\"\u001a\u0010\u0011\u001a\u00020\u00048\u0002X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u0012\u0004\b\u0010\u0010\u0007\"\u001a\u0010\u0016\u001a\u00020\u00128\u0002X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u0007\"\u001a\u0010\u0019\u001a\u00020\u00128\u0002X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u0012\u0004\b\u0018\u0010\u0007¨\u0006\u001a"}, mo44877d2 = {"", "locked", "Ly04;", "a", "Lxj6;", "Lxj6;", "getLOCK_FAIL$annotations", "()V", "LOCK_FAIL", "b", "getUNLOCK_FAIL$annotations", "UNLOCK_FAIL", "c", "getLOCKED$annotations", "LOCKED", "d", "getUNLOCKED$annotations", "UNLOCKED", "Lmo1;", "e", "Lmo1;", "getEMPTY_LOCKED$annotations", "EMPTY_LOCKED", "f", "getEMPTY_UNLOCKED$annotations", "EMPTY_UNLOCKED", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: z04 */
/* compiled from: Mutex.kt */
public final class z04 {

    /* renamed from: a */
    public static final xj6 f46316a = new xj6("LOCK_FAIL");

    /* renamed from: b */
    public static final xj6 f46317b = new xj6("UNLOCK_FAIL");

    /* renamed from: c */
    public static final xj6 f46318c;

    /* renamed from: d */
    public static final xj6 f46319d;

    /* renamed from: e */
    public static final mo1 f46320e;

    /* renamed from: f */
    public static final mo1 f46321f;

    static {
        xj6 xj6 = new xj6("LOCKED");
        f46318c = xj6;
        xj6 xj62 = new xj6("UNLOCKED");
        f46319d = xj62;
        f46320e = new mo1(xj6);
        f46321f = new mo1(xj62);
    }

    /* renamed from: a */
    public static final y04 m74723a(boolean z) {
        return new MutexImpl(z);
    }

    /* renamed from: b */
    public static /* synthetic */ y04 m74724b(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m74723a(z);
    }
}
