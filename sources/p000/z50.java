package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: z50 */
/* compiled from: BundleListRetriever */
public final class z50 extends Binder {

    /* renamed from: b */
    public static final int f20454b;

    /* renamed from: a */
    public final ImmutableList<Bundle> f20455a;

    static {
        int i;
        if (w67.f19021a >= 30) {
            i = IBinder.getSuggestedMaxIpcSizeBytes();
        } else {
            i = 65536;
        }
        f20454b = i;
    }

    public z50(List<Bundle> list) {
        this.f20455a = ImmutableList.copyOf(list);
    }

    /* renamed from: a */
    public static ImmutableList<Bundle> m30972a(IBinder iBinder) {
        int readInt;
        ImmutableList.C4534a builder = ImmutableList.builder();
        int i = 0;
        int i2 = 1;
        while (i2 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i);
                iBinder.transact(1, obtain, obtain2, 0);
                while (true) {
                    readInt = obtain2.readInt();
                    if (readInt != 1) {
                        break;
                    }
                    builder.mo34667a((Bundle) C2725kr.m20985e(obtain2.readBundle()));
                    i++;
                }
                obtain2.recycle();
                obtain.recycle();
                i2 = readInt;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return builder.mo34692l();
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i3 = 0;
        if (parcel2 == null) {
            return false;
        }
        int size = this.f20455a.size();
        int readInt = parcel.readInt();
        while (readInt < size && parcel2.dataSize() < f20454b) {
            parcel2.writeInt(1);
            parcel2.writeBundle(this.f20455a.get(readInt));
            readInt++;
        }
        if (readInt < size) {
            i3 = 2;
        }
        parcel2.writeInt(i3);
        return true;
    }
}
