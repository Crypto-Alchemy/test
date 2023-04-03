package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new oi9();

    /* renamed from: a */
    public final String f22414a;

    /* renamed from: d */
    public final y09 f22415d;

    /* renamed from: e */
    public final boolean f22416e;

    /* renamed from: g */
    public final boolean f22417g;

    public zzs(String str, IBinder iBinder, boolean z, boolean z2) {
        byte[] bArr;
        this.f22414a = str;
        y39 y39 = null;
        if (iBinder != null) {
            try {
                ro2 b = fk9.m44333q1(iBinder).mo45816b();
                if (b == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) gf4.m44715r1(b);
                }
                if (bArr != null) {
                    y39 = new y39(bArr);
                }
            } catch (RemoteException unused) {
            }
        }
        this.f22415d = y39;
        this.f22416e = z;
        this.f22417g = z2;
    }

    public zzs(String str, y09 y09, boolean z, boolean z2) {
        this.f22414a = str;
        this.f22415d = y09;
        this.f22416e = z;
        this.f22417g = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51143s(parcel, 1, this.f22414a, false);
        y09 y09 = this.f22415d;
        if (y09 == null) {
            y09 = null;
        }
        rk5.m51136l(parcel, 2, y09, false);
        rk5.m51127c(parcel, 3, this.f22416e);
        rk5.m51127c(parcel, 4, this.f22417g);
        rk5.m51126b(parcel, a);
    }
}
