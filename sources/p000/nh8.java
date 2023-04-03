package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: nh8 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public class nh8 {

    /* renamed from: a */
    public static final ClassLoader f32132a = nh8.class.getClassLoader();

    /* renamed from: a */
    public static void m48799a(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder((IBinder) null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: b */
    public static void m48800b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
