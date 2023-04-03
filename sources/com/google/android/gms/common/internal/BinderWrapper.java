package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new bv8();

    /* renamed from: a */
    public IBinder f22272a;

    public /* synthetic */ BinderWrapper(Parcel parcel, fy8 fy8) {
        this.f22272a = parcel.readStrongBinder();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f22272a);
    }
}
