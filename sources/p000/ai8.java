package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.ro2;

/* renamed from: ai8 */
public abstract class ai8 extends da8 implements se8 {
    public ai8() {
        super("com.google.android.gms.flags.IFlagProvider");
    }

    public static se8 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        if (queryLocalInterface instanceof se8) {
            return (se8) queryLocalInterface;
        }
        return new il8(iBinder);
    }

    /* renamed from: E0 */
    public final boolean mo28987E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            init(ro2.C6440a.m51194q1(parcel.readStrongBinder()));
            parcel2.writeNoException();
        } else if (i == 2) {
            boolean booleanFlagValue = getBooleanFlagValue(parcel.readString(), ae8.m31799b(parcel), parcel.readInt());
            parcel2.writeNoException();
            ae8.m31798a(parcel2, booleanFlagValue);
        } else if (i == 3) {
            int intFlagValue = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(intFlagValue);
        } else if (i == 4) {
            long longFlagValue = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeLong(longFlagValue);
        } else if (i != 5) {
            return false;
        } else {
            String stringFlagValue = getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeString(stringFlagValue);
        }
        return true;
    }
}
