package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: t18 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class t18 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        ArrayList<Scope> arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2 = null;
        String str3 = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            switch (SafeParcelReader.m33754v(C)) {
                case 1:
                    i = SafeParcelReader.m33725E(parcel, C);
                    break;
                case 2:
                    arrayList = SafeParcelReader.m33752t(parcel, C, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.m33747o(parcel, C, Account.CREATOR);
                    break;
                case 4:
                    z = SafeParcelReader.m33755w(parcel, C);
                    break;
                case 5:
                    z2 = SafeParcelReader.m33755w(parcel, C);
                    break;
                case 6:
                    z3 = SafeParcelReader.m33755w(parcel, C);
                    break;
                case 7:
                    str = SafeParcelReader.m33748p(parcel, C);
                    break;
                case 8:
                    str2 = SafeParcelReader.m33748p(parcel, C);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.m33752t(parcel, C, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    str3 = SafeParcelReader.m33748p(parcel, C);
                    break;
                default:
                    SafeParcelReader.m33729I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new GoogleSignInOptions(i, (ArrayList) arrayList, account, z, z2, z3, str, str2, (ArrayList) arrayList2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
