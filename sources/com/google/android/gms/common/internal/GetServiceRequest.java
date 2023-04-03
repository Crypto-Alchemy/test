package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4033b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new c99();

    /* renamed from: L */
    public static final Scope[] f22283L = new Scope[0];

    /* renamed from: M */
    public static final Feature[] f22284M = new Feature[0];

    /* renamed from: A */
    public Feature[] f22285A;

    /* renamed from: B */
    public boolean f22286B;

    /* renamed from: C */
    public int f22287C;

    /* renamed from: H */
    public boolean f22288H;

    /* renamed from: I */
    public String f22289I;

    /* renamed from: a */
    public final int f22290a;

    /* renamed from: d */
    public final int f22291d;

    /* renamed from: e */
    public int f22292e;

    /* renamed from: g */
    public String f22293g;

    /* renamed from: k */
    public IBinder f22294k;

    /* renamed from: r */
    public Scope[] f22295r;

    /* renamed from: s */
    public Bundle f22296s;

    /* renamed from: x */
    public Account f22297x;

    /* renamed from: y */
    public Feature[] f22298y;

    public GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4, boolean z2, String str2) {
        Account account2;
        scopeArr = scopeArr == null ? f22283L : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? f22284M : featureArr;
        featureArr2 = featureArr2 == null ? f22284M : featureArr2;
        this.f22290a = i;
        this.f22291d = i2;
        this.f22292e = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f22293g = "com.google.android.gms";
        } else {
            this.f22293g = str;
        }
        if (i < 2) {
            if (iBinder != null) {
                account2 = C4032a.m33719r1(C4033b.C4034a.m33720q1(iBinder));
            } else {
                account2 = null;
            }
            this.f22297x = account2;
        } else {
            this.f22294k = iBinder;
            this.f22297x = account;
        }
        this.f22295r = scopeArr;
        this.f22296s = bundle;
        this.f22298y = featureArr;
        this.f22285A = featureArr2;
        this.f22286B = z;
        this.f22287C = i4;
        this.f22288H = z2;
        this.f22289I = str2;
    }

    /* renamed from: r1 */
    public final String mo30648r1() {
        return this.f22289I;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        c99.m32876a(this, parcel, i);
    }
}
