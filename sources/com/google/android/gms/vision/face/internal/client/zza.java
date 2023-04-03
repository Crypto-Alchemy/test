package com.google.android.gms.vision.face.internal.client;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new ie8();

    /* renamed from: a */
    public final PointF[] f23239a;

    /* renamed from: d */
    public final int f23240d;

    public zza(PointF[] pointFArr, int i) {
        this.f23239a = pointFArr;
        this.f23240d = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51146v(parcel, 2, this.f23239a, i, false);
        rk5.m51137m(parcel, 3, this.f23240d);
        rk5.m51126b(parcel, a);
    }
}
