package p000;

import android.os.IBinder;
import p000.cp2;

/* renamed from: dy6 */
/* compiled from: TrustedWebActivityCallbackRemote */
public class dy6 {

    /* renamed from: a */
    public final cp2 f10988a;

    public dy6(cp2 cp2) {
        this.f10988a = cp2;
    }

    /* renamed from: a */
    public static dy6 m15528a(IBinder iBinder) {
        cp2 cp2;
        if (iBinder == null) {
            cp2 = null;
        } else {
            cp2 = cp2.C2101a.m14351E0(iBinder);
        }
        if (cp2 == null) {
            return null;
        }
        return new dy6(cp2);
    }
}
