package p000;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* renamed from: bm4 */
/* compiled from: ParcelUtils */
public class bm4 {
    /* renamed from: a */
    public static <T extends f97> T m11449a(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return ((ParcelImpl) parcelable).mo10604a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    /* renamed from: b */
    public static <T extends f97> T m11450b(Bundle bundle, String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(bm4.class.getClassLoader());
            return m11449a(bundle2.getParcelable("a"));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
