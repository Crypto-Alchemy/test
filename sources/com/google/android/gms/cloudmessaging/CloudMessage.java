package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final class CloudMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CloudMessage> CREATOR = new sa8();

    /* renamed from: a */
    public Intent f22135a;

    public CloudMessage(Intent intent) {
        this.f22135a = intent;
    }

    /* renamed from: r1 */
    public final Intent mo30432r1() {
        return this.f22135a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51142r(parcel, 1, this.f22135a, i, false);
        rk5.m51126b(parcel, a);
    }
}
