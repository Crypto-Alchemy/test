package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.zaa;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zak;

/* renamed from: h18 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class h18 extends cz7 implements s18 {
    public h18() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* renamed from: q1 */
    public final boolean mo41793q1(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                ConnectionResult connectionResult = (ConnectionResult) h08.m44998a(parcel, ConnectionResult.CREATOR);
                zaa zaa = (zaa) h08.m44998a(parcel, zaa.CREATOR);
                h08.m44999b(parcel);
                break;
            case 4:
                Status status = (Status) h08.m44998a(parcel, Status.CREATOR);
                h08.m44999b(parcel);
                break;
            case 6:
                Status status2 = (Status) h08.m44998a(parcel, Status.CREATOR);
                h08.m44999b(parcel);
                break;
            case 7:
                Status status3 = (Status) h08.m44998a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) h08.m44998a(parcel, GoogleSignInAccount.CREATOR);
                h08.m44999b(parcel);
                break;
            case 8:
                h08.m44999b(parcel);
                mo47312n((zak) h08.m44998a(parcel, zak.CREATOR));
                break;
            case 9:
                zag zag = (zag) h08.m44998a(parcel, zag.CREATOR);
                h08.m44999b(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
