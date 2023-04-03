package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new f38();

    /* renamed from: a */
    public final int f22380a;

    /* renamed from: d */
    public final String f22381d;

    /* renamed from: e */
    public final ArrayList f22382e;

    public zal(int i, String str, ArrayList arrayList) {
        this.f22380a = i;
        this.f22381d = str;
        this.f22382e = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22380a);
        rk5.m51143s(parcel, 2, this.f22381d, false);
        rk5.m51147w(parcel, 3, this.f22382e, false);
        rk5.m51126b(parcel, a);
    }

    public zal(String str, Map map) {
        ArrayList arrayList;
        this.f22380a = 1;
        this.f22381d = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, (FastJsonResponse.Field) map.get(str2)));
            }
        }
        this.f22382e = arrayList;
    }
}
