package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new c28();

    /* renamed from: a */
    public final int f22265a;

    /* renamed from: d */
    public final Uri f22266d;

    /* renamed from: e */
    public final int f22267e;

    /* renamed from: g */
    public final int f22268g;

    public WebImage(int i, Uri uri, int i2, int i3) {
        this.f22265a = i;
        this.f22266d = uri;
        this.f22267e = i2;
        this.f22268g = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (if4.m45709a(this.f22266d, webImage.f22266d) && this.f22267e == webImage.f22267e && this.f22268g == webImage.f22268g) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int getHeight() {
        return this.f22268g;
    }

    public int getWidth() {
        return this.f22267e;
    }

    public int hashCode() {
        return if4.m45710b(this.f22266d, Integer.valueOf(this.f22267e), Integer.valueOf(this.f22268g));
    }

    /* renamed from: r1 */
    public Uri mo30631r1() {
        return this.f22266d;
    }

    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.f22267e), Integer.valueOf(this.f22268g), this.f22266d.toString()});
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22265a);
        rk5.m51142r(parcel, 2, mo30631r1(), i, false);
        rk5.m51137m(parcel, 3, getWidth());
        rk5.m51137m(parcel, 4, getHeight());
        rk5.m51126b(parcel, a);
    }
}
