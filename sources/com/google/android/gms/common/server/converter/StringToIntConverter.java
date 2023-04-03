package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.C4037a<String, Integer> {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new e18();

    /* renamed from: a */
    public final int f22354a;

    /* renamed from: d */
    public final HashMap f22355d;

    /* renamed from: e */
    public final SparseArray f22356e;

    public StringToIntConverter() {
        this.f22354a = 1;
        this.f22355d = new HashMap();
        this.f22356e = new SparseArray();
    }

    /* renamed from: D0 */
    public final /* bridge */ /* synthetic */ Object mo30690D0(Object obj) {
        String str = (String) this.f22356e.get(((Integer) obj).intValue());
        if (str != null || !this.f22355d.containsKey("gms_unknown")) {
            return str;
        }
        return "gms_unknown";
    }

    @CanIgnoreReturnValue
    /* renamed from: r1 */
    public StringToIntConverter mo30691r1(String str, int i) {
        this.f22355d.put(str, Integer.valueOf(i));
        this.f22356e.put(i, str);
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22354a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f22355d.keySet()) {
            arrayList.add(new zac(str, ((Integer) this.f22355d.get(str)).intValue()));
        }
        rk5.m51147w(parcel, 2, arrayList, false);
        rk5.m51126b(parcel, a);
    }

    public StringToIntConverter(int i, ArrayList arrayList) {
        this.f22354a = i;
        this.f22355d = new HashMap();
        this.f22356e = new SparseArray();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zac zac = (zac) arrayList.get(i2);
            mo30691r1(zac.f22360d, zac.f22361e);
        }
    }
}
