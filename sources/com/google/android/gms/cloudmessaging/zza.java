package com.google.android.gms.cloudmessaging;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public class zza implements Parcelable {
    public static final Parcelable.Creator<zza> CREATOR = new he8();

    /* renamed from: a */
    public Messenger f22147a;

    /* renamed from: d */
    public jo2 f22148d;

    /* renamed from: com.google.android.gms.cloudmessaging.zza$a */
    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
    public static final class C4009a extends ClassLoader {
        public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (Log.isLoggable("CloudMessengerCompat", 3)) {
                return zza.class;
            }
            int i = Build.VERSION.SDK_INT;
            return zza.class;
        }
    }

    public zza(IBinder iBinder) {
        this.f22147a = new Messenger(iBinder);
    }

    /* renamed from: a */
    public final IBinder mo30448a() {
        Messenger messenger = this.f22147a;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return this.f22148d.asBinder();
    }

    /* renamed from: b */
    public final void mo30449b(Message message) throws RemoteException {
        Messenger messenger = this.f22147a;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f22148d.mo44544o0(message);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return mo30448a().equals(((zza) obj).mo30448a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return mo30448a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f22147a;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f22148d.asBinder());
        }
    }
}
