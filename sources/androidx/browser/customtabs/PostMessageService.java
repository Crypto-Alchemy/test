package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import p000.so2;

public class PostMessageService extends Service {

    /* renamed from: a */
    public so2.C3293a f1395a = new C0324a();

    /* renamed from: androidx.browser.customtabs.PostMessageService$a */
    public class C0324a extends so2.C3293a {
        public C0324a() {
        }

        /* renamed from: Z */
        public void mo2800Z(sn2 sn2, Bundle bundle) throws RemoteException {
            sn2.mo24290j1(bundle);
        }

        /* renamed from: b1 */
        public void mo2801b1(sn2 sn2, String str, Bundle bundle) throws RemoteException {
            sn2.mo24289i1(str, bundle);
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f1395a;
    }
}
