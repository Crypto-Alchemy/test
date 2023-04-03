package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@UsedByNative("wrapper.cc")
/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public final class LandmarkParcel extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<LandmarkParcel> CREATOR = new a99();

    /* renamed from: a */
    public final int f23235a;

    /* renamed from: d */
    public final float f23236d;

    /* renamed from: e */
    public final float f23237e;

    /* renamed from: g */
    public final int f23238g;

    @UsedByNative("wrapper.cc")
    public LandmarkParcel(int i, float f, float f2, int i2) {
        this.f23235a = i;
        this.f23236d = f;
        this.f23237e = f2;
        this.f23238g = i2;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f23235a);
        rk5.m51134j(parcel, 2, this.f23236d);
        rk5.m51134j(parcel, 3, this.f23237e);
        rk5.m51137m(parcel, 4, this.f23238g);
        rk5.m51126b(parcel, a);
    }
}
