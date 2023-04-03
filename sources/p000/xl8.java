package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzaa;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzkq;
import com.google.android.gms.measurement.internal.zzp;
import java.util.List;

/* renamed from: xl8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public abstract class xl8 extends oc8 implements am8 {
    public xl8() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: E0 */
    public final boolean mo29962E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo29017c0((zzas) pc8.m49856c(parcel, zzas.CREATOR), (zzp) pc8.m49856c(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                mo29015T((zzkq) pc8.m49856c(parcel, zzkq.CREATOR), (zzp) pc8.m49856c(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                mo29020g1((zzp) pc8.m49856c(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                mo29013G0((zzas) pc8.m49856c(parcel, zzas.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                mo29016V0((zzp) pc8.m49856c(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                List<zzkq> w0 = mo29025w0((zzp) pc8.m49856c(parcel, zzp.CREATOR), pc8.m49854a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(w0);
                return true;
            case 9:
                byte[] H0 = mo29014H0((zzas) pc8.m49856c(parcel, zzas.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(H0);
                return true;
            case 10:
                mo29024v0(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String i3 = mo29021i((zzp) pc8.m49856c(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(i3);
                return true;
            case 12:
                mo29023v((zzaa) pc8.m49856c(parcel, zzaa.CREATOR), (zzp) pc8.m49856c(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                mo29011F((zzaa) pc8.m49856c(parcel, zzaa.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                List<zzkq> A = mo29008A(parcel.readString(), parcel.readString(), pc8.m49854a(parcel), (zzp) pc8.m49856c(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(A);
                return true;
            case 15:
                List<zzkq> f0 = mo29019f0(parcel.readString(), parcel.readString(), parcel.readString(), pc8.m49854a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(f0);
                return true;
            case 16:
                List<zzaa> d = mo29018d(parcel.readString(), parcel.readString(), (zzp) pc8.m49856c(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(d);
                return true;
            case 17:
                List<zzaa> B = mo29009B(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(B);
                return true;
            case 18:
                mo29010D0((zzp) pc8.m49856c(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                mo29012F0((Bundle) pc8.m49856c(parcel, Bundle.CREATOR), (zzp) pc8.m49856c(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                mo29022l0((zzp) pc8.m49856c(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
