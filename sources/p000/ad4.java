package p000;

import com.onesignal.C5323s0;
import com.onesignal.C5340w0;
import com.onesignal.OSInAppMessageController;

/* renamed from: ad4 */
/* compiled from: OSInAppMessageControllerFactory */
public class ad4 {

    /* renamed from: b */
    public static final Object f20913b = new Object();

    /* renamed from: a */
    public OSInAppMessageController f20914a;

    /* renamed from: a */
    public OSInAppMessageController mo28919a(C5340w0 w0Var, C5323s0 s0Var, ld4 ld4, je4 je4, vd3 vd3) {
        if (this.f20914a == null) {
            synchronized (f20913b) {
                if (this.f20914a == null) {
                    this.f20914a = new OSInAppMessageController(w0Var, s0Var, ld4, je4, vd3);
                }
            }
        }
        return this.f20914a;
    }
}
