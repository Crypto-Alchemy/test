package p000;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0006\u001a\u001a\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0007\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0003H\u0007\u001a \u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u001a\b\u0010\u000e\u001a\u00020\rH\u0000\"\u001a\u0010\u0012\u001a\u00020\u00058\u0002XD¢\u0006\f\n\u0004\b\f\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, mo44877d2 = {"Lwm3;", "", "factories", "Lvm3;", "e", "", "c", "", "cause", "", "errorHint", "Lyv3;", "a", "", "d", "Z", "getSUPPORT_MISSING$annotations", "()V", "SUPPORT_MISSING", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: ym3 */
/* compiled from: MainDispatchers.kt */
public final class ym3 {

    /* renamed from: a */
    public static final boolean f46221a = true;

    /* renamed from: a */
    public static final yv3 m74470a(Throwable th, String str) {
        if (f46221a) {
            return new yv3(th, str);
        }
        if (th != null) {
            throw th;
        }
        m74473d();
        throw new KotlinNothingValueException();
    }

    /* renamed from: b */
    public static /* synthetic */ yv3 m74471b(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return m74470a(th, str);
    }

    /* renamed from: c */
    public static final boolean m74472c(vm3 vm3) {
        return vm3.mo55551K() instanceof yv3;
    }

    /* renamed from: d */
    public static final Void m74473d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* renamed from: e */
    public static final vm3 m74474e(wm3 wm3, List<? extends wm3> list) {
        try {
            return wm3.mo51924b(list);
        } catch (Throwable th) {
            return m74470a(th, wm3.mo51923a());
        }
    }
}
