package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzcl;

/* renamed from: aq8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class aq8 {

    /* renamed from: a */
    public final yp8 f20982a;

    public aq8(yp8 yp8) {
        cu4.m43221k(yp8);
        this.f20982a = yp8;
    }

    /* renamed from: a */
    public final void mo29040a(Context context, Intent intent) {
        kr8 e = kr8.m47470e(context, (zzcl) null, (Long) null);
        bn8 A = e.mo45237A();
        if (intent == null) {
            A.mo29673o().mo48769a("Receiver called with null intent");
            return;
        }
        e.mo45257b();
        String action = intent.getAction();
        A.mo29678v().mo48770b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            A.mo29678v().mo48769a("Starting wakeful intent.");
            this.f20982a.mo31356a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            A.mo29673o().mo48769a("Install Referrer Broadcasts are deprecated");
        }
    }
}
