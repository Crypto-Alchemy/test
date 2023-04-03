package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: hl8 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class hl8 implements ServiceConnection {

    /* renamed from: a */
    public final int f29659a;

    /* renamed from: d */
    public final /* synthetic */ C6462ry f29660d;

    public hl8(C6462ry ryVar, int i) {
        this.f29660d = ryVar;
        this.f29659a = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        fo2 fo2;
        C6462ry ryVar = this.f29660d;
        if (iBinder == null) {
            C6462ry.m51378i0(ryVar, 16);
            return;
        }
        synchronized (ryVar.f33638I) {
            C6462ry ryVar2 = this.f29660d;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof fo2)) {
                fo2 = new a68(iBinder);
            } else {
                fo2 = (fo2) queryLocalInterface;
            }
            ryVar2.f33639L = fo2;
        }
        this.f29660d.mo47553j0(0, (Bundle) null, this.f29659a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f29660d.f33638I) {
            this.f29660d.f33639L = null;
        }
        Handler handler = this.f29660d.f33636C;
        handler.sendMessage(handler.obtainMessage(6, this.f29659a, 1));
    }
}
