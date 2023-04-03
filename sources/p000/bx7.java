package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: bx7 */
public abstract class bx7 extends sv7 implements gx7 {
    public bx7() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    /* renamed from: E0 */
    public final boolean mo29799E0(int i, Parcel parcel) throws RemoteException {
        switch (i) {
            case 2:
                mo43028N0(parcel.readInt(), (Bundle) xv7.m54566a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) xv7.m54566a(parcel, Bundle.CREATOR);
                mo43036p(readInt);
                return true;
            case 4:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) xv7.m54566a(parcel, Bundle.CREATOR);
                mo43025H(readInt2);
                return true;
            case 5:
                mo43033h1(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) xv7.m54566a(parcel, creator);
                mo43037t0((Bundle) xv7.m54566a(parcel, creator));
                return true;
            case 7:
                mo43031e1((Bundle) xv7.m54566a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) xv7.m54566a(parcel, creator2);
                mo43029P((Bundle) xv7.m54566a(parcel, creator2));
                return true;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle5 = (Bundle) xv7.m54566a(parcel, creator3);
                mo43026I((Bundle) xv7.m54566a(parcel, creator3));
                return true;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                mo43030Z0((Bundle) xv7.m54566a(parcel, creator4), (Bundle) xv7.m54566a(parcel, creator4));
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                mo43032f1((Bundle) xv7.m54566a(parcel, creator5), (Bundle) xv7.m54566a(parcel, creator5));
                return true;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                mo43034k1((Bundle) xv7.m54566a(parcel, creator6), (Bundle) xv7.m54566a(parcel, creator6));
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                Bundle bundle6 = (Bundle) xv7.m54566a(parcel, creator7);
                Bundle bundle7 = (Bundle) xv7.m54566a(parcel, creator7);
                mo43027M();
                return true;
            case 15:
                Bundle bundle8 = (Bundle) xv7.m54566a(parcel, Bundle.CREATOR);
                mo43035o1();
                return true;
            default:
                return false;
        }
    }
}
