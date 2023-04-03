package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: c99 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class c99 implements Parcelable.Creator {
    /* renamed from: a */
    public static void m32876a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, getServiceRequest.f22290a);
        rk5.m51137m(parcel, 2, getServiceRequest.f22291d);
        rk5.m51137m(parcel, 3, getServiceRequest.f22292e);
        rk5.m51143s(parcel, 4, getServiceRequest.f22293g, false);
        rk5.m51136l(parcel, 5, getServiceRequest.f22294k, false);
        rk5.m51146v(parcel, 6, getServiceRequest.f22295r, i, false);
        rk5.m51129e(parcel, 7, getServiceRequest.f22296s, false);
        rk5.m51142r(parcel, 8, getServiceRequest.f22297x, i, false);
        rk5.m51146v(parcel, 10, getServiceRequest.f22298y, i, false);
        rk5.m51146v(parcel, 11, getServiceRequest.f22285A, i, false);
        rk5.m51127c(parcel, 12, getServiceRequest.f22286B);
        rk5.m51137m(parcel, 13, getServiceRequest.f22287C);
        rk5.m51127c(parcel, 14, getServiceRequest.f22288H);
        rk5.m51143s(parcel, 15, getServiceRequest.mo30648r1(), false);
        rk5.m51126b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m33730J(parcel);
        Scope[] scopeArr = GetServiceRequest.f22283L;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f22284M;
        Feature[] featureArr2 = featureArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            switch (SafeParcelReader.m33754v(C)) {
                case 1:
                    i = SafeParcelReader.m33725E(parcel2, C);
                    break;
                case 2:
                    i2 = SafeParcelReader.m33725E(parcel2, C);
                    break;
                case 3:
                    i3 = SafeParcelReader.m33725E(parcel2, C);
                    break;
                case 4:
                    str = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 5:
                    iBinder = SafeParcelReader.m33724D(parcel2, C);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.m33751s(parcel2, C, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.m33738f(parcel2, C);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.m33747o(parcel2, C, Account.CREATOR);
                    break;
                case 10:
                    featureArr = (Feature[]) SafeParcelReader.m33751s(parcel2, C, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.m33751s(parcel2, C, Feature.CREATOR);
                    break;
                case 12:
                    z = SafeParcelReader.m33755w(parcel2, C);
                    break;
                case 13:
                    i4 = SafeParcelReader.m33725E(parcel2, C);
                    break;
                case 14:
                    z2 = SafeParcelReader.m33755w(parcel2, C);
                    break;
                case 15:
                    str2 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                default:
                    SafeParcelReader.m33729I(parcel2, C);
                    break;
            }
        }
        SafeParcelReader.m33753u(parcel2, J);
        return new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i4, z2, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
