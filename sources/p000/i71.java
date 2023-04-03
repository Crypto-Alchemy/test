package p000;

import android.content.Context;
import android.util.Log;
import p000.vp0;

/* renamed from: i71 */
/* compiled from: DefaultConnectivityMonitorFactory */
public class i71 implements wp0 {
    /* renamed from: a */
    public vp0 mo21473a(Context context, vp0.C3503a aVar) {
        boolean z;
        if (zr0.m31438a(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean isLoggable = Log.isLoggable("ConnectivityMonitor", 3);
        if (z) {
            return new h71(context, aVar);
        }
        return new tb4();
    }
}
