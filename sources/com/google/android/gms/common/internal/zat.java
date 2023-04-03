package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new r38();

    /* renamed from: a */
    public final int f22315a;

    /* renamed from: d */
    public final Account f22316d;

    /* renamed from: e */
    public final int f22317e;

    /* renamed from: g */
    public final GoogleSignInAccount f22318g;

    public zat(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f22315a = i;
        this.f22316d = account;
        this.f22317e = i2;
        this.f22318g = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22315a);
        rk5.m51142r(parcel, 2, this.f22316d, i, false);
        rk5.m51137m(parcel, 3, this.f22317e);
        rk5.m51142r(parcel, 4, this.f22318g, i, false);
        rk5.m51126b(parcel, a);
    }

    public zat(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
