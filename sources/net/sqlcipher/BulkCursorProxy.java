package net.sqlcipher;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* compiled from: BulkCursorNative */
final class BulkCursorProxy implements IBulkCursor {
    private Bundle mExtras = null;
    private IBinder mRemote;

    public BulkCursorProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public void close() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        obtain.writeInterfaceToken(IBulkCursor.descriptor);
        this.mRemote.transact(12, obtain, obtain2, 0);
        DatabaseUtils.readExceptionFromParcel(obtain2);
        obtain.recycle();
        obtain2.recycle();
    }

    public int count() throws RemoteException {
        int i;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        obtain.writeInterfaceToken(IBulkCursor.descriptor);
        boolean transact = this.mRemote.transact(2, obtain, obtain2, 0);
        DatabaseUtils.readExceptionFromParcel(obtain2);
        if (!transact) {
            i = -1;
        } else {
            i = obtain2.readInt();
        }
        obtain.recycle();
        obtain2.recycle();
        return i;
    }

    public void deactivate() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        obtain.writeInterfaceToken(IBulkCursor.descriptor);
        this.mRemote.transact(6, obtain, obtain2, 0);
        DatabaseUtils.readExceptionFromParcel(obtain2);
        obtain.recycle();
        obtain2.recycle();
    }

    public boolean deleteRow(int i) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        obtain.writeInterfaceToken(IBulkCursor.descriptor);
        obtain.writeInt(i);
        boolean z = false;
        this.mRemote.transact(5, obtain, obtain2, 0);
        DatabaseUtils.readExceptionFromParcel(obtain2);
        if (obtain2.readInt() == 1) {
            z = true;
        }
        obtain.recycle();
        obtain2.recycle();
        return z;
    }

    public String[] getColumnNames() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        obtain.writeInterfaceToken(IBulkCursor.descriptor);
        this.mRemote.transact(3, obtain, obtain2, 0);
        DatabaseUtils.readExceptionFromParcel(obtain2);
        int readInt = obtain2.readInt();
        String[] strArr = new String[readInt];
        for (int i = 0; i < readInt; i++) {
            strArr[i] = obtain2.readString();
        }
        obtain.recycle();
        obtain2.recycle();
        return strArr;
    }

    public Bundle getExtras() throws RemoteException {
        if (this.mExtras == null) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            obtain.writeInterfaceToken(IBulkCursor.descriptor);
            this.mRemote.transact(10, obtain, obtain2, 0);
            DatabaseUtils.readExceptionFromParcel(obtain2);
            this.mExtras = obtain2.readBundle(BulkCursorProxy.class.getClassLoader());
            obtain.recycle();
            obtain2.recycle();
        }
        return this.mExtras;
    }

    public boolean getWantsAllOnMoveCalls() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        obtain.writeInterfaceToken(IBulkCursor.descriptor);
        this.mRemote.transact(9, obtain, obtain2, 0);
        DatabaseUtils.readExceptionFromParcel(obtain2);
        int readInt = obtain2.readInt();
        obtain.recycle();
        obtain2.recycle();
        if (readInt != 0) {
            return true;
        }
        return false;
    }

    public CursorWindow getWindow(int i) throws RemoteException {
        CursorWindow cursorWindow;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        obtain.writeInterfaceToken(IBulkCursor.descriptor);
        obtain.writeInt(i);
        this.mRemote.transact(1, obtain, obtain2, 0);
        DatabaseUtils.readExceptionFromParcel(obtain2);
        if (obtain2.readInt() == 1) {
            cursorWindow = CursorWindow.newFromParcel(obtain2);
        } else {
            cursorWindow = null;
        }
        obtain.recycle();
        obtain2.recycle();
        return cursorWindow;
    }

    public void onMove(int i) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        obtain.writeInterfaceToken(IBulkCursor.descriptor);
        obtain.writeInt(i);
        this.mRemote.transact(8, obtain, obtain2, 0);
        DatabaseUtils.readExceptionFromParcel(obtain2);
        obtain.recycle();
        obtain2.recycle();
    }

    public int requery(IContentObserver iContentObserver, CursorWindow cursorWindow) throws RemoteException {
        int i;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        obtain.writeInterfaceToken(IBulkCursor.descriptor);
        obtain.writeStrongInterface(iContentObserver);
        cursorWindow.writeToParcel(obtain, 0);
        boolean transact = this.mRemote.transact(7, obtain, obtain2, 0);
        DatabaseUtils.readExceptionFromParcel(obtain2);
        if (!transact) {
            i = -1;
        } else {
            i = obtain2.readInt();
            this.mExtras = obtain2.readBundle(BulkCursorProxy.class.getClassLoader());
        }
        obtain.recycle();
        obtain2.recycle();
        return i;
    }

    public Bundle respond(Bundle bundle) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        obtain.writeInterfaceToken(IBulkCursor.descriptor);
        obtain.writeBundle(bundle);
        this.mRemote.transact(11, obtain, obtain2, 0);
        DatabaseUtils.readExceptionFromParcel(obtain2);
        Bundle readBundle = obtain2.readBundle(BulkCursorProxy.class.getClassLoader());
        obtain.recycle();
        obtain2.recycle();
        return readBundle;
    }

    public boolean updateRows(Map map) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        obtain.writeInterfaceToken(IBulkCursor.descriptor);
        obtain.writeMap(map);
        boolean z = false;
        this.mRemote.transact(4, obtain, obtain2, 0);
        DatabaseUtils.readExceptionFromParcel(obtain2);
        if (obtain2.readInt() == 1) {
            z = true;
        }
        obtain.recycle();
        obtain2.recycle();
        return z;
    }
}
