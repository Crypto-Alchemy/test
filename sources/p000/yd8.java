package p000;

import android.os.BadParcelableException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: yd8 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class yd8 {

    /* renamed from: a */
    public static final ClassLoader f35852a = yd8.class.getClassLoader();

    /* renamed from: a */
    public static Parcelable m54720a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m54721b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
        }
    }

    /* renamed from: c */
    public static void m54722c(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: d */
    public static void m54723d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: e */
    public static void m54724e(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder((IBinder) null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: f */
    public static boolean m54725f(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }
}
