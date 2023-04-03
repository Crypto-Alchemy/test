package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: fz7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class fz7 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m33730J(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList<Scope> arrayList = null;
        String str7 = null;
        String str8 = null;
        int i = 0;
        long j = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            switch (SafeParcelReader.m33754v(C)) {
                case 1:
                    i = SafeParcelReader.m33725E(parcel2, C);
                    break;
                case 2:
                    str = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 3:
                    str2 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 4:
                    str3 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 5:
                    str4 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.m33747o(parcel2, C, Uri.CREATOR);
                    break;
                case 7:
                    str5 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 8:
                    j = SafeParcelReader.m33726F(parcel2, C);
                    break;
                case 9:
                    str6 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 10:
                    arrayList = SafeParcelReader.m33752t(parcel2, C, Scope.CREATOR);
                    break;
                case 11:
                    str7 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 12:
                    str8 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                default:
                    SafeParcelReader.m33729I(parcel2, C);
                    break;
            }
        }
        SafeParcelReader.m33753u(parcel2, J);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
