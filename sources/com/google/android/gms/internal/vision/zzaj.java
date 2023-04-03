package com.google.android.gms.internal.vision;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new l78();

    /* renamed from: a */
    public final Rect f22906a;

    public zzaj() {
        this.f22906a = new Rect();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51142r(parcel, 2, this.f22906a, i, false);
        rk5.m51126b(parcel, a);
    }

    public zzaj(Rect rect) {
        this.f22906a = rect;
    }
}
