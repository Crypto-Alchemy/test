package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;

public class IconCompatParcelizer {
    public static IconCompat read(d97 d97) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3412a = d97.mo18624p(iconCompat.f3412a, 1);
        iconCompat.f3414c = d97.mo18618j(iconCompat.f3414c, 2);
        iconCompat.f3415d = d97.mo18626r(iconCompat.f3415d, 3);
        iconCompat.f3416e = d97.mo18624p(iconCompat.f3416e, 4);
        iconCompat.f3417f = d97.mo18624p(iconCompat.f3417f, 5);
        iconCompat.f3418g = (ColorStateList) d97.mo18626r(iconCompat.f3418g, 6);
        iconCompat.f3420i = d97.mo18628t(iconCompat.f3420i, 7);
        iconCompat.f3421j = d97.mo18628t(iconCompat.f3421j, 8);
        iconCompat.mo5365o();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, d97 d97) {
        d97.mo18632x(true, true);
        iconCompat.mo5366p(d97.mo18614f());
        int i = iconCompat.f3412a;
        if (-1 != i) {
            d97.mo18600F(i, 1);
        }
        byte[] bArr = iconCompat.f3414c;
        if (bArr != null) {
            d97.mo18596B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f3415d;
        if (parcelable != null) {
            d97.mo18602H(parcelable, 3);
        }
        int i2 = iconCompat.f3416e;
        if (i2 != 0) {
            d97.mo18600F(i2, 4);
        }
        int i3 = iconCompat.f3417f;
        if (i3 != 0) {
            d97.mo18600F(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f3418g;
        if (colorStateList != null) {
            d97.mo18602H(colorStateList, 6);
        }
        String str = iconCompat.f3420i;
        if (str != null) {
            d97.mo18604J(str, 7);
        }
        String str2 = iconCompat.f3421j;
        if (str2 != null) {
            d97.mo18604J(str2, 8);
        }
    }
}
