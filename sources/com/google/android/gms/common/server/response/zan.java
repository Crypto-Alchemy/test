package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new b38();

    /* renamed from: a */
    public final int f22386a;

    /* renamed from: d */
    public final HashMap f22387d;

    /* renamed from: e */
    public final String f22388e;

    public zan(int i, ArrayList arrayList, String str) {
        this.f22386a = i;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zal = (zal) arrayList.get(i2);
            String str2 = zal.f22381d;
            HashMap hashMap2 = new HashMap();
            int size2 = ((ArrayList) cu4.m43221k(zal.f22382e)).size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zam = (zam) zal.f22382e.get(i3);
                hashMap2.put(zam.f22384d, zam.f22385e);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f22387d = hashMap;
        this.f22388e = (String) cu4.m43221k(str);
        mo30725t1();
    }

    /* renamed from: r1 */
    public final String mo30723r1() {
        return this.f22388e;
    }

    /* renamed from: s1 */
    public final Map mo30724s1(String str) {
        return (Map) this.f22387d.get(str);
    }

    /* renamed from: t1 */
    public final void mo30725t1() {
        for (String str : this.f22387d.keySet()) {
            Map map = (Map) this.f22387d.get(str);
            for (String str2 : map.keySet()) {
                ((FastJsonResponse.Field) map.get(str2)).mo30709x1(this);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f22387d.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) this.f22387d.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22386a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f22387d.keySet()) {
            arrayList.add(new zal(str, (Map) this.f22387d.get(str)));
        }
        rk5.m51147w(parcel, 2, arrayList, false);
        rk5.m51143s(parcel, 3, this.f22388e, false);
        rk5.m51126b(parcel, a);
    }
}
