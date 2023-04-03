package p000;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ve8 */
public class ve8 {

    /* renamed from: a */
    public static final ClassLoader f34936a = ve8.class.getClassLoader();

    /* renamed from: a */
    public static <T extends Parcelable> T m53369a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m53370b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: c */
    public static void m53371c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
