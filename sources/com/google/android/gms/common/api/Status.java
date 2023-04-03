package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import p000.if4;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class Status extends AbstractSafeParcelable implements eg5, ReflectedParcelable {

    /* renamed from: A */
    public static final Status f22186A = new Status(15);

    /* renamed from: B */
    public static final Status f22187B = new Status(16);

    /* renamed from: C */
    public static final Status f22188C = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new ua8();

    /* renamed from: H */
    public static final Status f22189H = new Status(17);

    /* renamed from: r */
    public static final Status f22190r = new Status(-1);

    /* renamed from: s */
    public static final Status f22191s = new Status(0);

    /* renamed from: x */
    public static final Status f22192x = new Status(14);

    /* renamed from: y */
    public static final Status f22193y = new Status(8);

    /* renamed from: a */
    public final int f22194a;

    /* renamed from: d */
    public final int f22195d;

    /* renamed from: e */
    public final String f22196e;

    /* renamed from: g */
    public final PendingIntent f22197g;

    /* renamed from: k */
    public final ConnectionResult f22198k;

    public Status(int i) {
        this(i, (String) null);
    }

    public Status(int i, int i2, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f22194a = i;
        this.f22195d = i2;
        this.f22196e = str;
        this.f22197g = pendingIntent;
        this.f22198k = connectionResult;
    }

    @CanIgnoreReturnValue
    /* renamed from: e */
    public Status mo30519e() {
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f22194a != status.f22194a || this.f22195d != status.f22195d || !if4.m45709a(this.f22196e, status.f22196e) || !if4.m45709a(this.f22197g, status.f22197g) || !if4.m45709a(this.f22198k, status.f22198k)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return if4.m45710b(Integer.valueOf(this.f22194a), Integer.valueOf(this.f22195d), this.f22196e, this.f22197g, this.f22198k);
    }

    /* renamed from: r1 */
    public ConnectionResult mo30522r1() {
        return this.f22198k;
    }

    /* renamed from: s1 */
    public PendingIntent mo30523s1() {
        return this.f22197g;
    }

    /* renamed from: t1 */
    public int mo30524t1() {
        return this.f22195d;
    }

    public String toString() {
        if4.C5959a c = if4.m45711c(this);
        c.mo43587a("statusCode", mo30531y1());
        c.mo43587a("resolution", this.f22197g);
        return c.toString();
    }

    /* renamed from: u1 */
    public String mo30526u1() {
        return this.f22196e;
    }

    /* renamed from: v1 */
    public boolean mo30527v1() {
        return this.f22197g != null;
    }

    @CheckReturnValue
    /* renamed from: w1 */
    public boolean mo30528w1() {
        return this.f22195d <= 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, mo30524t1());
        rk5.m51143s(parcel, 2, mo30526u1(), false);
        rk5.m51142r(parcel, 3, this.f22197g, i, false);
        rk5.m51142r(parcel, 4, mo30522r1(), i, false);
        rk5.m51137m(parcel, 1000, this.f22194a);
        rk5.m51126b(parcel, a);
    }

    /* renamed from: x1 */
    public void mo30530x1(Activity activity, int i) throws IntentSender.SendIntentException {
        if (mo30527v1()) {
            PendingIntent pendingIntent = this.f22197g;
            cu4.m43221k(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, (Intent) null, 0, 0, 0);
        }
    }

    /* renamed from: y1 */
    public final String mo30531y1() {
        String str = this.f22196e;
        if (str != null) {
            return str;
        }
        return rl0.m51152a(this.f22195d);
    }

    public Status(int i, String str) {
        this(1, i, str, (PendingIntent) null, (ConnectionResult) null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent, (ConnectionResult) null);
    }

    public Status(ConnectionResult connectionResult, String str) {
        this(connectionResult, str, 17);
    }

    @Deprecated
    public Status(ConnectionResult connectionResult, String str, int i) {
        this(1, i, str, connectionResult.mo30459t1(), connectionResult);
    }
}
