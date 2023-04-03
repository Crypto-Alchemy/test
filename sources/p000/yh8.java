package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.internal.zzj;

/* renamed from: yh8 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class yh8 extends r58 {

    /* renamed from: a */
    public C6462ry f35890a;

    /* renamed from: b */
    public final int f35891b;

    public yh8(C6462ry ryVar, int i) {
        this.f35890a = ryVar;
        this.f35891b = i;
    }

    /* renamed from: G */
    public final void mo42333G(int i, IBinder iBinder, Bundle bundle) {
        cu4.m43222l(this.f35890a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f35890a.mo47538S(i, iBinder, bundle, this.f35891b);
        this.f35890a = null;
    }

    /* renamed from: O0 */
    public final void mo42334O0(int i, IBinder iBinder, zzj zzj) {
        C6462ry ryVar = this.f35890a;
        cu4.m43222l(ryVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        cu4.m43221k(zzj);
        C6462ry.m51377h0(ryVar, zzj);
        mo42333G(i, iBinder, zzj.f22329a);
    }

    /* renamed from: u0 */
    public final void mo42335u0(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}
