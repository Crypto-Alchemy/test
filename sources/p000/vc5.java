package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.messaging.RemoteMessage;

/* renamed from: vc5 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class vc5 implements Parcelable.Creator<RemoteMessage> {
    /* renamed from: c */
    public static void m53335c(RemoteMessage remoteMessage, Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51129e(parcel, 2, remoteMessage.f25419a, false);
        rk5.m51126b(parcel, a);
    }

    /* renamed from: a */
    public RemoteMessage createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            if (SafeParcelReader.m33754v(C) != 2) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                bundle = SafeParcelReader.m33738f(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new RemoteMessage(bundle);
    }

    /* renamed from: b */
    public RemoteMessage[] newArray(int i) {
        return new RemoteMessage[i];
    }
}
