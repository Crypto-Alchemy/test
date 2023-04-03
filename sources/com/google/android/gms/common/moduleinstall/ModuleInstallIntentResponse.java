package com.google.android.gms.common.moduleinstall;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class ModuleInstallIntentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallIntentResponse> CREATOR = new zy7();

    /* renamed from: a */
    public final PendingIntent f22335a;

    public ModuleInstallIntentResponse(PendingIntent pendingIntent) {
        this.f22335a = pendingIntent;
    }

    /* renamed from: r1 */
    public PendingIntent mo30677r1() {
        return this.f22335a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51142r(parcel, 1, mo30677r1(), i, false);
        rk5.m51126b(parcel, a);
    }
}
