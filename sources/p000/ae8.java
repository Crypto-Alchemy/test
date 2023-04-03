package p000;

import android.os.Parcel;

/* renamed from: ae8 */
public class ae8 {

    /* renamed from: a */
    public static final ClassLoader f20919a = ae8.class.getClassLoader();

    /* renamed from: a */
    public static void m31798a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: b */
    public static boolean m31799b(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }
}
