package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import p000.fp2;

public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* renamed from: a */
    public fp2.C2315a f3409a = new C0563a();

    /* renamed from: androidx.core.content.UnusedAppRestrictionsBackportService$a */
    public class C0563a extends fp2.C2315a {
        public C0563a() {
        }

        /* renamed from: m */
        public void mo5358m(ep2 ep2) throws RemoteException {
            if (ep2 != null) {
                UnusedAppRestrictionsBackportService.this.mo5356a(new u47(ep2));
            }
        }
    }

    /* renamed from: a */
    public abstract void mo5356a(u47 u47);

    public IBinder onBind(Intent intent) {
        return this.f3409a;
    }
}
