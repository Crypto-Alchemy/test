package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.common.internal.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public interface C4033b extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.b$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static abstract class C4034a extends ba8 implements C4033b {
        /* renamed from: q1 */
        public static C4033b m33720q1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof C4033b) {
                return (C4033b) queryLocalInterface;
            }
            return new C4035c(iBinder);
        }
    }

    Account zzb() throws RemoteException;
}
