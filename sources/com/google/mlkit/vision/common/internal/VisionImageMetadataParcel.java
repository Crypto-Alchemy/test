package com.google.mlkit.vision.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
public class VisionImageMetadataParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VisionImageMetadataParcel> CREATOR = new hs8();

    /* renamed from: a */
    public final int f25511a;

    /* renamed from: d */
    public final int f25512d;

    /* renamed from: e */
    public final long f25513e;

    /* renamed from: g */
    public final int f25514g;

    /* renamed from: k */
    public final int f25515k;

    public VisionImageMetadataParcel(int i, int i2, int i3, long j, int i4) {
        this.f25511a = i;
        this.f25512d = i2;
        this.f25515k = i3;
        this.f25513e = j;
        this.f25514g = i4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f25511a);
        rk5.m51137m(parcel, 2, this.f25512d);
        rk5.m51137m(parcel, 3, this.f25515k);
        rk5.m51139o(parcel, 4, this.f25513e);
        rk5.m51137m(parcel, 5, this.f25514g);
        rk5.m51126b(parcel, a);
    }
}
