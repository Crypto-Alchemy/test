package android.support.p002v4.p003os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.p002v4.p003os.C0088a;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.os.ResultReceiver */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C0085a();

    /* renamed from: a */
    public final boolean f334a = false;

    /* renamed from: d */
    public final Handler f335d = null;

    /* renamed from: e */
    public C0088a f336e;

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    public class C0085a implements Parcelable.Creator<ResultReceiver> {
        /* renamed from: a */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        /* renamed from: b */
        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    public class C0086b extends C0088a.C0089a {
        public C0086b() {
        }

        /* renamed from: g0 */
        public void mo800g0(int i, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f335d;
            if (handler != null) {
                handler.post(new C0087c(i, bundle));
            } else {
                resultReceiver.mo635a(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$c */
    public class C0087c implements Runnable {

        /* renamed from: a */
        public final int f338a;

        /* renamed from: d */
        public final Bundle f339d;

        public C0087c(int i, Bundle bundle) {
            this.f338a = i;
            this.f339d = bundle;
        }

        public void run() {
            ResultReceiver.this.mo635a(this.f338a, this.f339d);
        }
    }

    public ResultReceiver(Parcel parcel) {
        this.f336e = C0088a.C0089a.m610E0(parcel.readStrongBinder());
    }

    /* renamed from: a */
    public void mo635a(int i, Bundle bundle) {
    }

    /* renamed from: b */
    public void mo793b(int i, Bundle bundle) {
        if (this.f334a) {
            Handler handler = this.f335d;
            if (handler != null) {
                handler.post(new C0087c(i, bundle));
            } else {
                mo635a(i, bundle);
            }
        } else {
            C0088a aVar = this.f336e;
            if (aVar != null) {
                try {
                    aVar.mo800g0(i, bundle);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f336e == null) {
                this.f336e = new C0086b();
            }
            parcel.writeStrongBinder(this.f336e.asBinder());
        }
    }
}
