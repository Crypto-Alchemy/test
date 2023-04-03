package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* renamed from: pc8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class pc8 {

    /* renamed from: a */
    public static final ClassLoader f32654a = pc8.class.getClassLoader();

    /* renamed from: a */
    public static boolean m49854a(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m49855b(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: c */
    public static <T extends Parcelable> T m49856c(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: d */
    public static void m49857d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: e */
    public static void m49858e(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder((IBinder) null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: f */
    public static HashMap m49859f(Parcel parcel) {
        return parcel.readHashMap(f32654a);
    }
}
