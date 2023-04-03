package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: xv7 */
public final class xv7 {
    static {
        xv7.class.getClassLoader();
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m54566a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m54567b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.IInterface, android.os.IBinder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m54568c(android.os.Parcel r0, android.os.IInterface r1) {
        /*
            r0.writeStrongBinder(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.xv7.m54568c(android.os.Parcel, android.os.IInterface):void");
    }
}
