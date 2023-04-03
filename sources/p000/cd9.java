package p000;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.gms.cloudmessaging.zza;

/* renamed from: cd9 */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final class cd9 {

    /* renamed from: a */
    public final Messenger f21696a;

    /* renamed from: b */
    public final zza f21697b;

    public cd9(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f21696a = new Messenger(iBinder);
            this.f21697b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f21697b = new zza(iBinder);
            this.f21696a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                "Invalid interface descriptor: ".concat(valueOf);
            }
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo29944a(Message message) throws RemoteException {
        Messenger messenger = this.f21696a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zza zza = this.f21697b;
        if (zza != null) {
            zza.mo30449b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
