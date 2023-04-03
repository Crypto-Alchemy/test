package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.if4;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new ta8();

    /* renamed from: k */
    public static final ConnectionResult f22149k = new ConnectionResult(0);

    /* renamed from: a */
    public final int f22150a;

    /* renamed from: d */
    public final int f22151d;

    /* renamed from: e */
    public final PendingIntent f22152e;

    /* renamed from: g */
    public final String f22153g;

    public ConnectionResult(int i) {
        this(i, (PendingIntent) null, (String) null);
    }

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f22150a = i;
        this.f22151d = i2;
        this.f22152e = pendingIntent;
        this.f22153g = str;
    }

    /* renamed from: w1 */
    public static String m33570w1(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i + ")";
                }
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        if (this.f22151d != connectionResult.f22151d || !if4.m45709a(this.f22152e, connectionResult.f22152e) || !if4.m45709a(this.f22153g, connectionResult.f22153g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return if4.m45710b(Integer.valueOf(this.f22151d), this.f22152e, this.f22153g);
    }

    /* renamed from: r1 */
    public int mo30457r1() {
        return this.f22151d;
    }

    /* renamed from: s1 */
    public String mo30458s1() {
        return this.f22153g;
    }

    /* renamed from: t1 */
    public PendingIntent mo30459t1() {
        return this.f22152e;
    }

    public String toString() {
        if4.C5959a c = if4.m45711c(this);
        c.mo43587a("statusCode", m33570w1(this.f22151d));
        c.mo43587a("resolution", this.f22152e);
        c.mo43587a(ThrowableDeserializer.PROP_NAME_MESSAGE, this.f22153g);
        return c.toString();
    }

    /* renamed from: u1 */
    public boolean mo30461u1() {
        return (this.f22151d == 0 || this.f22152e == null) ? false : true;
    }

    /* renamed from: v1 */
    public boolean mo30462v1() {
        return this.f22151d == 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22150a);
        rk5.m51137m(parcel, 2, mo30457r1());
        rk5.m51142r(parcel, 3, mo30459t1(), i, false);
        rk5.m51143s(parcel, 4, mo30458s1(), false);
        rk5.m51126b(parcel, a);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, (String) null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }
}
